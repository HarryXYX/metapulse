
package com.linkedin.ermodelrelation;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a ERModelRelationship
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ermodelrelation/ERModelRelationshipProperties.pdl.")
public class ERModelRelationshipProperties
    extends RecordTemplate
{

    private final static ERModelRelationshipProperties.Fields _fields = new ERModelRelationshipProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ermodelrelation/**Properties associated with a ERModelRelationship*/@Aspect.name=\"erModelRelationshipProperties\"record ERModelRelationshipProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Name of the ERModelRelation*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**First dataset in the erModelRelationship (no directionality)*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ermodelrelationA\"}@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Second dataset in the erModelRelationship (no directionality)*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ermodelrelationB\"}@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}destination:com.linkedin.common.Urn/**ERModelRelationFieldMapping (in future we can make it an array)*/relationshipFieldMappings:array[/**Individual Field Mapping of a relationship- one of several*/record RelationshipFieldMapping{/**All fields from dataset A that are required for the join, maps to bFields 1:1*/sourceField:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**All fields from dataset B that are required for the join, maps to aFields 1:1*/destinationField:com.linkedin.dataset.SchemaFieldPath}]/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}lastModified:optional com.linkedin.common.AuditStamp/**Cardinality of the relationship*/cardinality:enum ERModelRelationshipCardinality{ONE_ONE,ONE_N,N_ONE,N_N}=\"N_N\"}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _nameField = null;
    private com.linkedin.common.urn.Urn _sourceField = null;
    private com.linkedin.common.urn.Urn _destinationField = null;
    private RelationshipFieldMappingArray _relationshipFieldMappingsField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private ERModelRelationshipCardinality _cardinalityField = null;
    private ERModelRelationshipProperties.ChangeListener __changeListener = new ERModelRelationshipProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Destination = SCHEMA.getField("destination");
    private final static RecordDataSchema.Field FIELD_RelationshipFieldMappings = SCHEMA.getField("relationshipFieldMappings");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Cardinality = SCHEMA.getField("cardinality");
    private final static ERModelRelationshipCardinality DEFAULT_Cardinality;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_Cardinality = DataTemplateUtil.coerceEnumOutput(FIELD_Cardinality.getDefault(), ERModelRelationshipCardinality.class, ERModelRelationshipCardinality.$UNKNOWN);
    }

    public ERModelRelationshipProperties() {
        super(new DataMap(11, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public ERModelRelationshipProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ERModelRelationshipProperties.Fields fields() {
        return _fields;
    }

    public static ERModelRelationshipProperties.ProjectionMask createMask() {
        return new ERModelRelationshipProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    public ERModelRelationshipProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#customProperties
     */
    public ERModelRelationshipProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see ERModelRelationshipProperties.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see ERModelRelationshipProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see ERModelRelationshipProperties.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see ERModelRelationshipProperties.Fields#name
     */
    public ERModelRelationshipProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#name
     */
    public ERModelRelationshipProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see ERModelRelationshipProperties.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see ERModelRelationshipProperties.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see ERModelRelationshipProperties.Fields#source
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSource();
            case DEFAULT:
            case NULL:
                if (_sourceField!= null) {
                    return _sourceField;
                } else {
                    Object __rawValue = super._map.get("source");
                    _sourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _sourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#source
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("source");
            }
            _sourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see ERModelRelationshipProperties.Fields#source
     */
    public ERModelRelationshipProperties setSource(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field source of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#source
     */
    public ERModelRelationshipProperties setSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for destination
     * 
     * @see ERModelRelationshipProperties.Fields#destination
     */
    public boolean hasDestination() {
        if (_destinationField!= null) {
            return true;
        }
        return super._map.containsKey("destination");
    }

    /**
     * Remover for destination
     * 
     * @see ERModelRelationshipProperties.Fields#destination
     */
    public void removeDestination() {
        super._map.remove("destination");
    }

    /**
     * Getter for destination
     * 
     * @see ERModelRelationshipProperties.Fields#destination
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDestination(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDestination();
            case DEFAULT:
            case NULL:
                if (_destinationField!= null) {
                    return _destinationField;
                } else {
                    Object __rawValue = super._map.get("destination");
                    _destinationField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _destinationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for destination
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#destination
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestination() {
        if (_destinationField!= null) {
            return _destinationField;
        } else {
            Object __rawValue = super._map.get("destination");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("destination");
            }
            _destinationField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _destinationField;
        }
    }

    /**
     * Setter for destination
     * 
     * @see ERModelRelationshipProperties.Fields#destination
     */
    public ERModelRelationshipProperties setDestination(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDestination(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field destination of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destination", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDestination();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destination", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "destination", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for destination
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#destination
     */
    public ERModelRelationshipProperties setDestination(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field destination of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "destination", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _destinationField = value;
        }
        return this;
    }

    /**
     * Existence checker for relationshipFieldMappings
     * 
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    public boolean hasRelationshipFieldMappings() {
        if (_relationshipFieldMappingsField!= null) {
            return true;
        }
        return super._map.containsKey("relationshipFieldMappings");
    }

    /**
     * Remover for relationshipFieldMappings
     * 
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    public void removeRelationshipFieldMappings() {
        super._map.remove("relationshipFieldMappings");
    }

    /**
     * Getter for relationshipFieldMappings
     * 
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    @Nullable
    public RelationshipFieldMappingArray getRelationshipFieldMappings(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelationshipFieldMappings();
            case DEFAULT:
            case NULL:
                if (_relationshipFieldMappingsField!= null) {
                    return _relationshipFieldMappingsField;
                } else {
                    Object __rawValue = super._map.get("relationshipFieldMappings");
                    _relationshipFieldMappingsField = ((__rawValue == null)?null:new RelationshipFieldMappingArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _relationshipFieldMappingsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for relationshipFieldMappings
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    @Nonnull
    public RelationshipFieldMappingArray getRelationshipFieldMappings() {
        if (_relationshipFieldMappingsField!= null) {
            return _relationshipFieldMappingsField;
        } else {
            Object __rawValue = super._map.get("relationshipFieldMappings");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relationshipFieldMappings");
            }
            _relationshipFieldMappingsField = ((__rawValue == null)?null:new RelationshipFieldMappingArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relationshipFieldMappingsField;
        }
    }

    /**
     * Setter for relationshipFieldMappings
     * 
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    public ERModelRelationshipProperties setRelationshipFieldMappings(
        @Nullable
        RelationshipFieldMappingArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelationshipFieldMappings(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relationshipFieldMappings of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipFieldMappings", value.data());
                    _relationshipFieldMappingsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelationshipFieldMappings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipFieldMappings", value.data());
                    _relationshipFieldMappingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipFieldMappings", value.data());
                    _relationshipFieldMappingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relationshipFieldMappings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#relationshipFieldMappings
     */
    public ERModelRelationshipProperties setRelationshipFieldMappings(
        @Nonnull
        RelationshipFieldMappingArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relationshipFieldMappings of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relationshipFieldMappings", value.data());
            _relationshipFieldMappingsField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see ERModelRelationshipProperties.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see ERModelRelationshipProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see ERModelRelationshipProperties.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ERModelRelationshipProperties.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see ERModelRelationshipProperties.Fields#created
     */
    public ERModelRelationshipProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#created
     */
    public ERModelRelationshipProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    public ERModelRelationshipProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#lastModified
     */
    public ERModelRelationshipProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for cardinality
     * 
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    public boolean hasCardinality() {
        if (_cardinalityField!= null) {
            return true;
        }
        return super._map.containsKey("cardinality");
    }

    /**
     * Remover for cardinality
     * 
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    public void removeCardinality() {
        super._map.remove("cardinality");
    }

    /**
     * Getter for cardinality
     * 
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    @Nullable
    public ERModelRelationshipCardinality getCardinality(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCardinality();
            case NULL:
                if (_cardinalityField!= null) {
                    return _cardinalityField;
                } else {
                    Object __rawValue = super._map.get("cardinality");
                    _cardinalityField = DataTemplateUtil.coerceEnumOutput(__rawValue, ERModelRelationshipCardinality.class, ERModelRelationshipCardinality.$UNKNOWN);
                    return _cardinalityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cardinality
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    @Nonnull
    public ERModelRelationshipCardinality getCardinality() {
        if (_cardinalityField!= null) {
            return _cardinalityField;
        } else {
            Object __rawValue = super._map.get("cardinality");
            if (__rawValue == null) {
                return DEFAULT_Cardinality;
            }
            _cardinalityField = DataTemplateUtil.coerceEnumOutput(__rawValue, ERModelRelationshipCardinality.class, ERModelRelationshipCardinality.$UNKNOWN);
            return _cardinalityField;
        }
    }

    /**
     * Setter for cardinality
     * 
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    public ERModelRelationshipProperties setCardinality(
        @Nullable
        ERModelRelationshipCardinality value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCardinality(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cardinality of com.linkedin.ermodelrelation.ERModelRelationshipProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
                    _cardinalityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCardinality();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
                    _cardinalityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
                    _cardinalityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cardinality
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ERModelRelationshipProperties.Fields#cardinality
     */
    public ERModelRelationshipProperties setCardinality(
        @Nonnull
        ERModelRelationshipCardinality value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cardinality of com.linkedin.ermodelrelation.ERModelRelationshipProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
            _cardinalityField = value;
        }
        return this;
    }

    @Override
    public ERModelRelationshipProperties clone()
        throws CloneNotSupportedException
    {
        ERModelRelationshipProperties __clone = ((ERModelRelationshipProperties) super.clone());
        __clone.__changeListener = new ERModelRelationshipProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ERModelRelationshipProperties copy()
        throws CloneNotSupportedException
    {
        ERModelRelationshipProperties __copy = ((ERModelRelationshipProperties) super.copy());
        __copy._customPropertiesField = null;
        __copy._relationshipFieldMappingsField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._destinationField = null;
        __copy._sourceField = null;
        __copy._lastModifiedField = null;
        __copy._cardinalityField = null;
        __copy.__changeListener = new ERModelRelationshipProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ERModelRelationshipProperties __objectRef;

        private ChangeListener(ERModelRelationshipProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "relationshipFieldMappings":
                    __objectRef._relationshipFieldMappingsField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "destination":
                    __objectRef._destinationField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "cardinality":
                    __objectRef._cardinalityField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * Name of the ERModelRelation
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * First dataset in the erModelRelationship (no directionality)
         * 
         */
        public PathSpec source() {
            return new PathSpec(getPathComponents(), "source");
        }

        /**
         * Second dataset in the erModelRelationship (no directionality)
         * 
         */
        public PathSpec destination() {
            return new PathSpec(getPathComponents(), "destination");
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public com.linkedin.ermodelrelation.RelationshipFieldMappingArray.Fields relationshipFieldMappings() {
            return new com.linkedin.ermodelrelation.RelationshipFieldMappingArray.Fields(getPathComponents(), "relationshipFieldMappings");
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public PathSpec relationshipFieldMappings(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relationshipFieldMappings");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Cardinality of the relationship
         * 
         */
        public PathSpec cardinality() {
            return new PathSpec(getPathComponents(), "cardinality");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ermodelrelation.RelationshipFieldMappingArray.ProjectionMask _relationshipFieldMappingsMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * Custom property bag.
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the ERModelRelation
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * First dataset in the erModelRelationship (no directionality)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withSource() {
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Second dataset in the erModelRelationship (no directionality)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withDestination() {
            getDataMap().put("destination", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withRelationshipFieldMappings(Function<com.linkedin.ermodelrelation.RelationshipFieldMappingArray.ProjectionMask, com.linkedin.ermodelrelation.RelationshipFieldMappingArray.ProjectionMask> nestedMask) {
            _relationshipFieldMappingsMask = nestedMask.apply(((_relationshipFieldMappingsMask == null)?RelationshipFieldMappingArray.createMask():_relationshipFieldMappingsMask));
            getDataMap().put("relationshipFieldMappings", _relationshipFieldMappingsMask.getDataMap());
            return this;
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withRelationshipFieldMappings() {
            _relationshipFieldMappingsMask = null;
            getDataMap().put("relationshipFieldMappings", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withRelationshipFieldMappings(Function<com.linkedin.ermodelrelation.RelationshipFieldMappingArray.ProjectionMask, com.linkedin.ermodelrelation.RelationshipFieldMappingArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _relationshipFieldMappingsMask = nestedMask.apply(((_relationshipFieldMappingsMask == null)?RelationshipFieldMappingArray.createMask():_relationshipFieldMappingsMask));
            getDataMap().put("relationshipFieldMappings", _relationshipFieldMappingsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("relationshipFieldMappings").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relationshipFieldMappings").put("$count", count);
            }
            return this;
        }

        /**
         * ERModelRelationFieldMapping (in future we can make it an array)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withRelationshipFieldMappings(Integer start, Integer count) {
            _relationshipFieldMappingsMask = null;
            getDataMap().put("relationshipFieldMappings", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("relationshipFieldMappings").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relationshipFieldMappings").put("$count", count);
            }
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Cardinality of the relationship
         * 
         */
        public ERModelRelationshipProperties.ProjectionMask withCardinality() {
            getDataMap().put("cardinality", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
