#!/bin/bash
# Initialize missing Elasticsearch indices for MetaPulse/DataHub

ELASTICSEARCH_HOST=${ELASTICSEARCH_HOST:-localhost}
ELASTICSEARCH_PORT=${ELASTICSEARCH_PORT:-9200}
ES_URL="http://${ELASTICSEARCH_HOST}:${ELASTICSEARCH_PORT}"

echo "Connecting to Elasticsearch at ${ES_URL}"

# Check Elasticsearch health
echo "Checking Elasticsearch health..."
curl -s "${ES_URL}/_cluster/health?pretty"

echo -e "\n\nListing existing indices..."
curl -s "${ES_URL}/_cat/indices?v"

echo -e "\n\nCreating missing indices..."

# Create datahub_usage_event index
echo "Creating datahub_usage_event index..."
curl -X PUT "${ES_URL}/datahub_usage_event" -H 'Content-Type: application/json' -d'
{
  "settings": {
    "index": {
      "number_of_shards": 1,
      "number_of_replicas": 0
    }
  },
  "mappings": {
    "properties": {
      "timestamp": { "type": "date" },
      "actorUrn": { "type": "keyword" },
      "type": { "type": "keyword" },
      "entityUrn": { "type": "keyword" },
      "resource": { "type": "keyword" }
    }
  }
}'

echo -e "\n\nCreating datahubpolicyindex_v2 index..."
curl -X PUT "${ES_URL}/datahubpolicyindex_v2" -H 'Content-Type: application/json' -d'
{
  "settings": {
    "index": {
      "number_of_shards": 1,
      "number_of_replicas": 0,
      "max_result_window": 10000
    }
  },
  "mappings": {
    "properties": {
      "urn": { "type": "keyword" },
      "removed": { "type": "boolean" },
      "hasActiveIncidents": { "type": "boolean" },
      "hasDescription": { "type": "boolean" },
      "hasOwners": { "type": "boolean" },
      "hasDomain": { "type": "boolean" },
      "hasGlossaryTerms": { "type": "boolean" },
      "hasTags": { "type": "boolean" },
      "hasRowCount": { "type": "boolean" },
      "hasColumnCount": { "type": "boolean" },
      "deprecated": { "type": "boolean" }
    }
  }
}'

# Create all entity indices using a loop
echo -e "\n\nCreating entity indices..."

# Define all entity indices that need to be created
# Extracted from backend/metadata-models/src/main/resources/entity-registry.yml
ENTITY_INDICES=(
    # Core data entities (searchGroup: primary)
    "datasetindex_v2"
    "chartindex_v2"
    "dashboardindex_v2"
    "dataflowindex_v2"
    "datajobindex_v2"
    "dataprocessindex_v2"
    "dataprocessinstanceindex_v2"
    "notebookindex_v2"
    "containerindex_v2"

    # ML entities (searchGroup: primary)
    "mlmodelindex_v2"
    "mlmodelgroupindex_v2"
    "mlmodeldeploymentindex_v2"
    "mlfeatureindex_v2"
    "mlfeaturetableindex_v2"
    "mlprimarykeyindex_v2"

    # Governance entities (searchGroup: primary)
    "domainindex_v2"
    "dataproductindex_v2"
    "glossarytermindex_v2"
    "glossarynodeindex_v2"
    "tagindex_v2"
    "applicationindex_v2"

    # User/Group/Role entities (searchGroup: primary)
    "corpgroupindex_v2"
    "corpuserindex_v2"
    "roleindex_v2"

    # Platform entities
    "dataplatformindex_v2"
    "dataplatforminstanceindex_v2"

    # DataHub system entities (searchGroup: primary or internal)
    "datahubpolicyindex_v2"
    "datahubviewindex_v2"
    "datahubingestionindex_v2"
    "datahubingestionsourceindex_v2"
    "datahubroleindex_v2"
    "datahubsecretindex_v2"
    "datahubaccesstokenindex_v2"
    "datahubretentionindex_v2"
    "datahubexecutionrequestindex_v2"
    "datahubpersonaindex_v2"
    "datahubactionindex_v2"
    "datahubpagetemplateindex_v2"
    "datahubpagemoduleindex_v2"
    "datahubfileindex_v2"
    "datahubconnectionindex_v2"

    # Schema and metadata entities
    "schemafieldindex_v2"
    "ownershiptypeindex_v2"
    "structuredpropertyindex_v2"
    "formindex_v2"
    "queryindex_v2"
    "versionsetindex_v2"
    "businessattributeindex_v2"
    "entitytypeindex_v2"
    "datatypeindex_v2"

    # Observability entities
    "assertionindex_v2"
    "testindex_v2"
    "incidentindex_v2"
    "datacontractindex_v2"

    # Additional entities
    "ermodelrelationshipindex_v2"
    "postindex_v2"
    "platformresourceindex_v2"
)

for index_name in "${ENTITY_INDICES[@]}"; do
    echo "Creating ${index_name}..."
    curl -X PUT "${ES_URL}/${index_name}" -H 'Content-Type: application/json' -d'{
      "settings": {
        "index": {
          "number_of_shards": 1,
          "number_of_replicas": 0,
          "max_result_window": 10000
        },
        "analysis": {
          "analyzer": {
            "urn_component": {
              "type": "custom",
              "tokenizer": "urn_component_tokenizer",
              "filter": ["lowercase"]
            }
          },
          "tokenizer": {
            "urn_component_tokenizer": {
              "type": "pattern",
              "pattern": "[,:]"
            }
          }
        }
      },
      "mappings": {
        "properties": {
          "urn": {
            "type": "keyword",
            "fields": {
              "delimited": {
                "type": "text",
                "analyzer": "urn_component"
              }
            }
          },
          "name": {
            "type": "text",
            "fields": {
              "keyword": {
                "type": "keyword"
              }
            }
          },
          "description": {
            "type": "text"
          },
          "removed": {
            "type": "boolean"
          },
          "hasActiveIncidents": {
            "type": "boolean"
          },
          "hasDescription": {
            "type": "boolean"
          },
          "hasOwners": {
            "type": "boolean"
          },
          "hasDomain": {
            "type": "boolean"
          },
          "hasGlossaryTerms": {
            "type": "boolean"
          },
          "hasTags": {
            "type": "boolean"
          },
          "hasRowCount": {
            "type": "boolean"
          },
          "hasColumnCount": {
            "type": "boolean"
          },
          "deprecated": {
            "type": "boolean"
          },
          "owners": {
            "type": "keyword"
          },
          "platform": {
            "type": "keyword"
          },
          "origin": {
            "type": "keyword"
          },
          "tags": {
            "type": "keyword"
          },
          "glossaryTerms": {
            "type": "keyword"
          }
        }
      }
    }' 2>&1 | head -n 5
    echo ""
done

echo -e "\n\nVerifying all indices created..."
curl -s "${ES_URL}/_cat/indices?v" | grep "_v2\|usage_event"

echo -e "\n\nDone! All indices have been created."
