
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.MLFeatureUrnArray;
import com.linkedin.common.TimeStamp;
import com.linkedin.common.UrnArray;
import com.linkedin.common.VersionTag;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a ML Model
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class MLModelProperties
    extends RecordTemplate
{

    private final static MLModelProperties.Fields _fields = new MLModelProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}{/**Display name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchTier\":1}name:optional string/**Documentation of the MLModel*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Date when the MLModel was developed*/@deprecated,date:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Audit stamp containing who created this and when*/created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:Time/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**Date when the MLModel was last modified*/lastModified:optional com.linkedin.common.TimeStamp/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"isLineage\":true,\"name\":\"Consumes\"}mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"entityTypes\":[\"mlModelDeployment\"],\"name\":\"DeployedTo\"}deployments:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"entityTypes\":[\"mlModelGroup\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"MemberOf\"}groups:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private UrnArray _trainingJobsField = null;
    private UrnArray _downstreamJobsField = null;
    private String _nameField = null;
    private String _descriptionField = null;
    private Long _dateField = null;
    private TimeStamp _createdField = null;
    private TimeStamp _lastModifiedField = null;
    private VersionTag _versionField = null;
    private String _typeField = null;
    private HyperParameterValueTypeMap _hyperParametersField = null;
    private MLHyperParamArray _hyperParamsField = null;
    private MLMetricArray _trainingMetricsField = null;
    private MLMetricArray _onlineMetricsField = null;
    private MLFeatureUrnArray _mlFeaturesField = null;
    private StringArray _tagsField = null;
    private UrnArray _deploymentsField = null;
    private UrnArray _groupsField = null;
    private MLModelProperties.ChangeListener __changeListener = new MLModelProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_TrainingJobs = SCHEMA.getField("trainingJobs");
    private final static RecordDataSchema.Field FIELD_DownstreamJobs = SCHEMA.getField("downstreamJobs");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Date = SCHEMA.getField("date");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_HyperParameters = SCHEMA.getField("hyperParameters");
    private final static RecordDataSchema.Field FIELD_HyperParams = SCHEMA.getField("hyperParams");
    private final static RecordDataSchema.Field FIELD_TrainingMetrics = SCHEMA.getField("trainingMetrics");
    private final static RecordDataSchema.Field FIELD_OnlineMetrics = SCHEMA.getField("onlineMetrics");
    private final static RecordDataSchema.Field FIELD_MlFeatures = SCHEMA.getField("mlFeatures");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");
    private final static StringArray DEFAULT_Tags;
    private final static RecordDataSchema.Field FIELD_Deployments = SCHEMA.getField("deployments");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_Tags = ((FIELD_Tags.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Tags.getDefault(), DataList.class)));
    }

    public MLModelProperties() {
        super(new DataMap(), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLModelProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelProperties.Fields fields() {
        return _fields;
    }

    public static MLModelProperties.ProjectionMask createMask() {
        return new MLModelProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
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
     * @see MLModelProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
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
     * @see MLModelProperties.Fields#customProperties
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
     * @see MLModelProperties.Fields#customProperties
     */
    public MLModelProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ml.metadata.MLModelProperties");
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
     * @see MLModelProperties.Fields#customProperties
     */
    public MLModelProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        if (_externalUrlField!= null) {
            return true;
        }
        return super._map.containsKey("externalUrl");
    }

    /**
     * Remover for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public MLModelProperties setExternalUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#externalUrl
     */
    public MLModelProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public boolean hasTrainingJobs() {
        if (_trainingJobsField!= null) {
            return true;
        }
        return super._map.containsKey("trainingJobs");
    }

    /**
     * Remover for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public void removeTrainingJobs() {
        super._map.remove("trainingJobs");
    }

    /**
     * Getter for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    @Nullable
    public UrnArray getTrainingJobs(GetMode mode) {
        return getTrainingJobs();
    }

    /**
     * Getter for trainingJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#trainingJobs
     */
    @Nullable
    public UrnArray getTrainingJobs() {
        if (_trainingJobsField!= null) {
            return _trainingJobsField;
        } else {
            Object __rawValue = super._map.get("trainingJobs");
            _trainingJobsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _trainingJobsField;
        }
    }

    /**
     * Setter for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public MLModelProperties setTrainingJobs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTrainingJobs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTrainingJobs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
                    _trainingJobsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
                    _trainingJobsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for trainingJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#trainingJobs
     */
    public MLModelProperties setTrainingJobs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field trainingJobs of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
            _trainingJobsField = value;
        }
        return this;
    }

    /**
     * Existence checker for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public boolean hasDownstreamJobs() {
        if (_downstreamJobsField!= null) {
            return true;
        }
        return super._map.containsKey("downstreamJobs");
    }

    /**
     * Remover for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public void removeDownstreamJobs() {
        super._map.remove("downstreamJobs");
    }

    /**
     * Getter for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    @Nullable
    public UrnArray getDownstreamJobs(GetMode mode) {
        return getDownstreamJobs();
    }

    /**
     * Getter for downstreamJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#downstreamJobs
     */
    @Nullable
    public UrnArray getDownstreamJobs() {
        if (_downstreamJobsField!= null) {
            return _downstreamJobsField;
        } else {
            Object __rawValue = super._map.get("downstreamJobs");
            _downstreamJobsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _downstreamJobsField;
        }
    }

    /**
     * Setter for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public MLModelProperties setDownstreamJobs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreamJobs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreamJobs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
                    _downstreamJobsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
                    _downstreamJobsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreamJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public MLModelProperties setDownstreamJobs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreamJobs of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
            _downstreamJobsField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLModelProperties.Fields#name
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
     * @see MLModelProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see MLModelProperties.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        return getName();
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#name
     */
    @Nullable
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see MLModelProperties.Fields#name
     */
    public MLModelProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see MLModelProperties.Fields#name
     */
    public MLModelProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see MLModelProperties.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public MLModelProperties setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#description
     */
    public MLModelProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for date
     * 
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    public boolean hasDate() {
        if (_dateField!= null) {
            return true;
        }
        return super._map.containsKey("date");
    }

    /**
     * Remover for date
     * 
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    public void removeDate() {
        super._map.remove("date");
    }

    /**
     * Getter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    @Nullable
    public Long getDate(GetMode mode) {
        return getDate();
    }

    /**
     * Getter for date
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    @Nullable
    public Long getDate() {
        if (_dateField!= null) {
            return _dateField;
        } else {
            Object __rawValue = super._map.get("date");
            _dateField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _dateField;
        }
    }

    /**
     * Setter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    public MLModelProperties setDate(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDate(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "date", DataTemplateUtil.coerceLongInput(value));
                    _dateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "date", DataTemplateUtil.coerceLongInput(value));
                    _dateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for date
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    public MLModelProperties setDate(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field date of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "date", DataTemplateUtil.coerceLongInput(value));
            _dateField = value;
        }
        return this;
    }

    /**
     * Setter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    @Deprecated
    public MLModelProperties setDate(long value) {
        CheckedUtil.putWithoutChecking(super._map, "date", DataTemplateUtil.coerceLongInput(value));
        _dateField = value;
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see MLModelProperties.Fields#created
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
     * @see MLModelProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see MLModelProperties.Fields#created
     */
    @Nullable
    public TimeStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#created
     */
    @Nullable
    public TimeStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new TimeStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see MLModelProperties.Fields#created
     */
    public MLModelProperties setCreated(
        @Nullable
        TimeStamp value, SetMode mode) {
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
     * @see MLModelProperties.Fields#created
     */
    public MLModelProperties setCreated(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see MLModelProperties.Fields#lastModified
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
     * @see MLModelProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see MLModelProperties.Fields#lastModified
     */
    @Nullable
    public TimeStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#lastModified
     */
    @Nullable
    public TimeStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new TimeStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see MLModelProperties.Fields#lastModified
     */
    public MLModelProperties setLastModified(
        @Nullable
        TimeStamp value, SetMode mode) {
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
     * @see MLModelProperties.Fields#lastModified
     */
    public MLModelProperties setLastModified(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see MLModelProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = ((__rawValue == null)?null:new VersionTag(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public MLModelProperties setVersion(
        @Nullable
        VersionTag value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#version
     */
    public MLModelProperties setVersion(
        @Nonnull
        VersionTag value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value.data());
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see MLModelProperties.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        return getType();
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#type
     */
    @Nullable
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public MLModelProperties setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#type
     */
    public MLModelProperties setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public boolean hasHyperParameters() {
        if (_hyperParametersField!= null) {
            return true;
        }
        return super._map.containsKey("hyperParameters");
    }

    /**
     * Remover for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public void removeHyperParameters() {
        super._map.remove("hyperParameters");
    }

    /**
     * Getter for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    @Nullable
    public HyperParameterValueTypeMap getHyperParameters(GetMode mode) {
        return getHyperParameters();
    }

    /**
     * Getter for hyperParameters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#hyperParameters
     */
    @Nullable
    public HyperParameterValueTypeMap getHyperParameters() {
        if (_hyperParametersField!= null) {
            return _hyperParametersField;
        } else {
            Object __rawValue = super._map.get("hyperParameters");
            _hyperParametersField = ((__rawValue == null)?null:new HyperParameterValueTypeMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _hyperParametersField;
        }
    }

    /**
     * Setter for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public MLModelProperties setHyperParameters(
        @Nullable
        HyperParameterValueTypeMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHyperParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHyperParameters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParameters", value.data());
                    _hyperParametersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParameters", value.data());
                    _hyperParametersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hyperParameters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#hyperParameters
     */
    public MLModelProperties setHyperParameters(
        @Nonnull
        HyperParameterValueTypeMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hyperParameters of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hyperParameters", value.data());
            _hyperParametersField = value;
        }
        return this;
    }

    /**
     * Existence checker for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public boolean hasHyperParams() {
        if (_hyperParamsField!= null) {
            return true;
        }
        return super._map.containsKey("hyperParams");
    }

    /**
     * Remover for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public void removeHyperParams() {
        super._map.remove("hyperParams");
    }

    /**
     * Getter for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    @Nullable
    public MLHyperParamArray getHyperParams(GetMode mode) {
        return getHyperParams();
    }

    /**
     * Getter for hyperParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#hyperParams
     */
    @Nullable
    public MLHyperParamArray getHyperParams() {
        if (_hyperParamsField!= null) {
            return _hyperParamsField;
        } else {
            Object __rawValue = super._map.get("hyperParams");
            _hyperParamsField = ((__rawValue == null)?null:new MLHyperParamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _hyperParamsField;
        }
    }

    /**
     * Setter for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public MLModelProperties setHyperParams(
        @Nullable
        MLHyperParamArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHyperParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHyperParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
                    _hyperParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
                    _hyperParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hyperParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#hyperParams
     */
    public MLModelProperties setHyperParams(
        @Nonnull
        MLHyperParamArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hyperParams of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
            _hyperParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public boolean hasTrainingMetrics() {
        if (_trainingMetricsField!= null) {
            return true;
        }
        return super._map.containsKey("trainingMetrics");
    }

    /**
     * Remover for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public void removeTrainingMetrics() {
        super._map.remove("trainingMetrics");
    }

    /**
     * Getter for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    @Nullable
    public MLMetricArray getTrainingMetrics(GetMode mode) {
        return getTrainingMetrics();
    }

    /**
     * Getter for trainingMetrics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#trainingMetrics
     */
    @Nullable
    public MLMetricArray getTrainingMetrics() {
        if (_trainingMetricsField!= null) {
            return _trainingMetricsField;
        } else {
            Object __rawValue = super._map.get("trainingMetrics");
            _trainingMetricsField = ((__rawValue == null)?null:new MLMetricArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _trainingMetricsField;
        }
    }

    /**
     * Setter for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public MLModelProperties setTrainingMetrics(
        @Nullable
        MLMetricArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTrainingMetrics(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTrainingMetrics();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
                    _trainingMetricsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
                    _trainingMetricsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for trainingMetrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public MLModelProperties setTrainingMetrics(
        @Nonnull
        MLMetricArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field trainingMetrics of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
            _trainingMetricsField = value;
        }
        return this;
    }

    /**
     * Existence checker for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public boolean hasOnlineMetrics() {
        if (_onlineMetricsField!= null) {
            return true;
        }
        return super._map.containsKey("onlineMetrics");
    }

    /**
     * Remover for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public void removeOnlineMetrics() {
        super._map.remove("onlineMetrics");
    }

    /**
     * Getter for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    @Nullable
    public MLMetricArray getOnlineMetrics(GetMode mode) {
        return getOnlineMetrics();
    }

    /**
     * Getter for onlineMetrics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#onlineMetrics
     */
    @Nullable
    public MLMetricArray getOnlineMetrics() {
        if (_onlineMetricsField!= null) {
            return _onlineMetricsField;
        } else {
            Object __rawValue = super._map.get("onlineMetrics");
            _onlineMetricsField = ((__rawValue == null)?null:new MLMetricArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _onlineMetricsField;
        }
    }

    /**
     * Setter for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public MLModelProperties setOnlineMetrics(
        @Nullable
        MLMetricArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOnlineMetrics(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOnlineMetrics();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "onlineMetrics", value.data());
                    _onlineMetricsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "onlineMetrics", value.data());
                    _onlineMetricsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for onlineMetrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public MLModelProperties setOnlineMetrics(
        @Nonnull
        MLMetricArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field onlineMetrics of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "onlineMetrics", value.data());
            _onlineMetricsField = value;
        }
        return this;
    }

    /**
     * Existence checker for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public boolean hasMlFeatures() {
        if (_mlFeaturesField!= null) {
            return true;
        }
        return super._map.containsKey("mlFeatures");
    }

    /**
     * Remover for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public void removeMlFeatures() {
        super._map.remove("mlFeatures");
    }

    /**
     * Getter for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    @Nullable
    public MLFeatureUrnArray getMlFeatures(GetMode mode) {
        return getMlFeatures();
    }

    /**
     * Getter for mlFeatures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#mlFeatures
     */
    @Nullable
    public MLFeatureUrnArray getMlFeatures() {
        if (_mlFeaturesField!= null) {
            return _mlFeaturesField;
        } else {
            Object __rawValue = super._map.get("mlFeatures");
            _mlFeaturesField = ((__rawValue == null)?null:new MLFeatureUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _mlFeaturesField;
        }
    }

    /**
     * Setter for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public MLModelProperties setMlFeatures(
        @Nullable
        MLFeatureUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMlFeatures(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMlFeatures();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
                    _mlFeaturesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
                    _mlFeaturesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mlFeatures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#mlFeatures
     */
    public MLModelProperties setMlFeatures(
        @Nonnull
        MLFeatureUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mlFeatures of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
            _mlFeaturesField = value;
        }
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public boolean hasTags() {
        if (_tagsField!= null) {
            return true;
        }
        return super._map.containsKey("tags");
    }

    /**
     * Remover for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public void removeTags() {
        super._map.remove("tags");
    }

    /**
     * Getter for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    @Nullable
    public StringArray getTags(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getTags();
            case NULL:
                if (_tagsField!= null) {
                    return _tagsField;
                } else {
                    Object __rawValue = super._map.get("tags");
                    _tagsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _tagsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelProperties.Fields#tags
     */
    @Nonnull
    public StringArray getTags() {
        if (_tagsField!= null) {
            return _tagsField;
        } else {
            Object __rawValue = super._map.get("tags");
            if (__rawValue == null) {
                return DEFAULT_Tags;
            }
            _tagsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _tagsField;
        }
    }

    /**
     * Setter for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public MLModelProperties setTags(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTags(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tags of com.linkedin.ml.metadata.MLModelProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTags();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#tags
     */
    public MLModelProperties setTags(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tags of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
            _tagsField = value;
        }
        return this;
    }

    /**
     * Existence checker for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public boolean hasDeployments() {
        if (_deploymentsField!= null) {
            return true;
        }
        return super._map.containsKey("deployments");
    }

    /**
     * Remover for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public void removeDeployments() {
        super._map.remove("deployments");
    }

    /**
     * Getter for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    @Nullable
    public UrnArray getDeployments(GetMode mode) {
        return getDeployments();
    }

    /**
     * Getter for deployments
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#deployments
     */
    @Nullable
    public UrnArray getDeployments() {
        if (_deploymentsField!= null) {
            return _deploymentsField;
        } else {
            Object __rawValue = super._map.get("deployments");
            _deploymentsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _deploymentsField;
        }
    }

    /**
     * Setter for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public MLModelProperties setDeployments(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDeployments(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDeployments();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "deployments", value.data());
                    _deploymentsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "deployments", value.data());
                    _deploymentsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for deployments
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#deployments
     */
    public MLModelProperties setDeployments(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deployments of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deployments", value.data());
            _deploymentsField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    @Nullable
    public UrnArray getGroups(GetMode mode) {
        return getGroups();
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#groups
     */
    @Nullable
    public UrnArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            _groupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public MLModelProperties setGroups(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#groups
     */
    public MLModelProperties setGroups(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.ml.metadata.MLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    @Override
    public MLModelProperties clone()
        throws CloneNotSupportedException
    {
        MLModelProperties __clone = ((MLModelProperties) super.clone());
        __clone.__changeListener = new MLModelProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelProperties copy()
        throws CloneNotSupportedException
    {
        MLModelProperties __copy = ((MLModelProperties) super.copy());
        __copy._dateField = null;
        __copy._externalUrlField = null;
        __copy._trainingMetricsField = null;
        __copy._createdField = null;
        __copy._downstreamJobsField = null;
        __copy._descriptionField = null;
        __copy._groupsField = null;
        __copy._typeField = null;
        __copy._versionField = null;
        __copy._hyperParamsField = null;
        __copy._tagsField = null;
        __copy._deploymentsField = null;
        __copy._customPropertiesField = null;
        __copy._hyperParametersField = null;
        __copy._mlFeaturesField = null;
        __copy._nameField = null;
        __copy._lastModifiedField = null;
        __copy._trainingJobsField = null;
        __copy._onlineMetricsField = null;
        __copy.__changeListener = new MLModelProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelProperties __objectRef;

        private ChangeListener(MLModelProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "date":
                    __objectRef._dateField = null;
                    break;
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "trainingMetrics":
                    __objectRef._trainingMetricsField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "downstreamJobs":
                    __objectRef._downstreamJobsField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "hyperParams":
                    __objectRef._hyperParamsField = null;
                    break;
                case "tags":
                    __objectRef._tagsField = null;
                    break;
                case "deployments":
                    __objectRef._deploymentsField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "hyperParameters":
                    __objectRef._hyperParametersField = null;
                    break;
                case "mlFeatures":
                    __objectRef._mlFeaturesField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "trainingJobs":
                    __objectRef._trainingJobsField = null;
                    break;
                case "onlineMetrics":
                    __objectRef._onlineMetricsField = null;
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
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public PathSpec trainingJobs() {
            return new PathSpec(getPathComponents(), "trainingJobs");
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public PathSpec trainingJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingJobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public PathSpec downstreamJobs() {
            return new PathSpec(getPathComponents(), "downstreamJobs");
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public PathSpec downstreamJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreamJobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Display name of the MLModel
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Documentation of the MLModel
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Date when the MLModel was developed
         * 
         */
        @Deprecated
        public PathSpec date() {
            return new PathSpec(getPathComponents(), "date");
        }

        /**
         * Audit stamp containing who created this and when
         * 
         */
        public com.linkedin.common.TimeStamp.Fields created() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Date when the MLModel was last modified
         * 
         */
        public com.linkedin.common.TimeStamp.Fields lastModified() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Version of the MLModel
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Hyper Parameters of the MLModel
         * 
         * NOTE: these are deprecated in favor of hyperParams
         * 
         */
        public com.linkedin.ml.metadata.HyperParameterValueTypeMap.Fields hyperParameters() {
            return new com.linkedin.ml.metadata.HyperParameterValueTypeMap.Fields(getPathComponents(), "hyperParameters");
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public com.linkedin.ml.metadata.MLHyperParamArray.Fields hyperParams() {
            return new com.linkedin.ml.metadata.MLHyperParamArray.Fields(getPathComponents(), "hyperParams");
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public PathSpec hyperParams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "hyperParams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public com.linkedin.ml.metadata.MLMetricArray.Fields trainingMetrics() {
            return new com.linkedin.ml.metadata.MLMetricArray.Fields(getPathComponents(), "trainingMetrics");
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public PathSpec trainingMetrics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingMetrics");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public com.linkedin.ml.metadata.MLMetricArray.Fields onlineMetrics() {
            return new com.linkedin.ml.metadata.MLMetricArray.Fields(getPathComponents(), "onlineMetrics");
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public PathSpec onlineMetrics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "onlineMetrics");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public PathSpec mlFeatures() {
            return new PathSpec(getPathComponents(), "mlFeatures");
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public PathSpec mlFeatures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlFeatures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Tags for the MLModel
         * 
         */
        public PathSpec tags() {
            return new PathSpec(getPathComponents(), "tags");
        }

        /**
         * Tags for the MLModel
         * 
         */
        public PathSpec tags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "tags");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Deployments for the MLModel
         * 
         */
        public PathSpec deployments() {
            return new PathSpec(getPathComponents(), "deployments");
        }

        /**
         * Deployments for the MLModel
         * 
         */
        public PathSpec deployments(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "deployments");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Groups the model belongs to
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * Groups the model belongs to
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.TimeStamp.ProjectionMask _createdMask;
        private com.linkedin.common.TimeStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.VersionTag.ProjectionMask _versionMask;
        private com.linkedin.ml.metadata.HyperParameterValueTypeMap.ProjectionMask _hyperParametersMask;
        private com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask _hyperParamsMask;
        private com.linkedin.ml.metadata.MLMetricArray.ProjectionMask _trainingMetricsMask;
        private com.linkedin.ml.metadata.MLMetricArray.ProjectionMask _onlineMetricsMask;

        ProjectionMask() {
        }

        /**
         * Custom property bag.
         * 
         */
        public MLModelProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public MLModelProperties.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingJobs() {
            getDataMap().put("trainingJobs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingJobs(Integer start, Integer count) {
            getDataMap().put("trainingJobs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("trainingJobs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingJobs").put("$count", count);
            }
            return this;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public MLModelProperties.ProjectionMask withDownstreamJobs() {
            getDataMap().put("downstreamJobs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public MLModelProperties.ProjectionMask withDownstreamJobs(Integer start, Integer count) {
            getDataMap().put("downstreamJobs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("downstreamJobs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreamJobs").put("$count", count);
            }
            return this;
        }

        /**
         * Display name of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Date when the MLModel was developed
         * 
         */
        @Deprecated
        public MLModelProperties.ProjectionMask withDate() {
            getDataMap().put("date", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who created this and when
         * 
         */
        public MLModelProperties.ProjectionMask withCreated(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?TimeStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this and when
         * 
         */
        public MLModelProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this and when
         * 
         */
        public MLModelProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Date when the MLModel was last modified
         * 
         */
        public MLModelProperties.ProjectionMask withLastModified(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?TimeStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Date when the MLModel was last modified
         * 
         */
        public MLModelProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Date when the MLModel was last modified
         * 
         */
        public MLModelProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Version of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withVersion(Function<com.linkedin.common.VersionTag.ProjectionMask, com.linkedin.common.VersionTag.ProjectionMask> nestedMask) {
            _versionMask = nestedMask.apply(((_versionMask == null)?VersionTag.createMask():_versionMask));
            getDataMap().put("version", _versionMask.getDataMap());
            return this;
        }

        /**
         * Version of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withVersion() {
            _versionMask = null;
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc
         * 
         */
        public MLModelProperties.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Hyper Parameters of the MLModel
         * 
         * NOTE: these are deprecated in favor of hyperParams
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParameters(Function<com.linkedin.ml.metadata.HyperParameterValueTypeMap.ProjectionMask, com.linkedin.ml.metadata.HyperParameterValueTypeMap.ProjectionMask> nestedMask) {
            _hyperParametersMask = nestedMask.apply(((_hyperParametersMask == null)?HyperParameterValueTypeMap.createMask():_hyperParametersMask));
            getDataMap().put("hyperParameters", _hyperParametersMask.getDataMap());
            return this;
        }

        /**
         * Hyper Parameters of the MLModel
         * 
         * NOTE: these are deprecated in favor of hyperParams
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParameters() {
            _hyperParametersMask = null;
            getDataMap().put("hyperParameters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParams(Function<com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask, com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask> nestedMask) {
            _hyperParamsMask = nestedMask.apply(((_hyperParamsMask == null)?MLHyperParamArray.createMask():_hyperParamsMask));
            getDataMap().put("hyperParams", _hyperParamsMask.getDataMap());
            return this;
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParams() {
            _hyperParamsMask = null;
            getDataMap().put("hyperParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParams(Function<com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask, com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _hyperParamsMask = nestedMask.apply(((_hyperParamsMask == null)?MLHyperParamArray.createMask():_hyperParamsMask));
            getDataMap().put("hyperParams", _hyperParamsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("hyperParams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("hyperParams").put("$count", count);
            }
            return this;
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withHyperParams(Integer start, Integer count) {
            _hyperParamsMask = null;
            getDataMap().put("hyperParams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("hyperParams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("hyperParams").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask) {
            _trainingMetricsMask = nestedMask.apply(((_trainingMetricsMask == null)?MLMetricArray.createMask():_trainingMetricsMask));
            getDataMap().put("trainingMetrics", _trainingMetricsMask.getDataMap());
            return this;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingMetrics() {
            _trainingMetricsMask = null;
            getDataMap().put("trainingMetrics", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _trainingMetricsMask = nestedMask.apply(((_trainingMetricsMask == null)?MLMetricArray.createMask():_trainingMetricsMask));
            getDataMap().put("trainingMetrics", _trainingMetricsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public MLModelProperties.ProjectionMask withTrainingMetrics(Integer start, Integer count) {
            _trainingMetricsMask = null;
            getDataMap().put("trainingMetrics", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public MLModelProperties.ProjectionMask withOnlineMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask) {
            _onlineMetricsMask = nestedMask.apply(((_onlineMetricsMask == null)?MLMetricArray.createMask():_onlineMetricsMask));
            getDataMap().put("onlineMetrics", _onlineMetricsMask.getDataMap());
            return this;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public MLModelProperties.ProjectionMask withOnlineMetrics() {
            _onlineMetricsMask = null;
            getDataMap().put("onlineMetrics", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public MLModelProperties.ProjectionMask withOnlineMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _onlineMetricsMask = nestedMask.apply(((_onlineMetricsMask == null)?MLMetricArray.createMask():_onlineMetricsMask));
            getDataMap().put("onlineMetrics", _onlineMetricsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("onlineMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onlineMetrics").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public MLModelProperties.ProjectionMask withOnlineMetrics(Integer start, Integer count) {
            _onlineMetricsMask = null;
            getDataMap().put("onlineMetrics", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("onlineMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onlineMetrics").put("$count", count);
            }
            return this;
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public MLModelProperties.ProjectionMask withMlFeatures() {
            getDataMap().put("mlFeatures", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public MLModelProperties.ProjectionMask withMlFeatures(Integer start, Integer count) {
            getDataMap().put("mlFeatures", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("mlFeatures").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("mlFeatures").put("$count", count);
            }
            return this;
        }

        /**
         * Tags for the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withTags() {
            getDataMap().put("tags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Tags for the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withTags(Integer start, Integer count) {
            getDataMap().put("tags", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("tags").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("tags").put("$count", count);
            }
            return this;
        }

        /**
         * Deployments for the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withDeployments() {
            getDataMap().put("deployments", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Deployments for the MLModel
         * 
         */
        public MLModelProperties.ProjectionMask withDeployments(Integer start, Integer count) {
            getDataMap().put("deployments", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("deployments").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("deployments").put("$count", count);
            }
            return this;
        }

        /**
         * Groups the model belongs to
         * 
         */
        public MLModelProperties.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Groups the model belongs to
         * 
         */
        public MLModelProperties.ProjectionMask withGroups(Integer start, Integer count) {
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

    }

}
