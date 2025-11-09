
package com.linkedin.datajob;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.FabricType;
import com.linkedin.common.TimeStamp;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;
import com.linkedin.data.template.UnionTemplate;


/**
 * Information about a Data processing job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datajob/DataJobInfo.pdl.")
public class DataJobInfo
    extends RecordTemplate
{

    private final static DataJobInfo.Fields _fields = new DataJobInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Job name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Job description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Status of the job - Deprecated for Data Process Instance model.*/@deprecated=\"Use Data Process Instance model, instead\"status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN/**Jobs that have been skipped.*/SKIPPED}/**Environment for this job*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private java.lang.String _nameField = null;
    private java.lang.String _descriptionField = null;
    private DataJobInfo.Type _typeField = null;
    private com.linkedin.common.urn.DataFlowUrn _flowUrnField = null;
    private TimeStamp _createdField = null;
    private TimeStamp _lastModifiedField = null;
    private JobStatus _statusField = null;
    private FabricType _envField = null;
    private DataJobInfo.ChangeListener __changeListener = new DataJobInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_FlowUrn = SCHEMA.getField("flowUrn");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_Env = SCHEMA.getField("env");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public DataJobInfo() {
        super(new DataMap(14, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DataJobInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataJobInfo.Fields fields() {
        return _fields;
    }

    public static DataJobInfo.ProjectionMask createMask() {
        return new DataJobInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
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
     * @see DataJobInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
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
     * @see DataJobInfo.Fields#customProperties
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
     * @see DataJobInfo.Fields#customProperties
     */
    public DataJobInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.datajob.DataJobInfo");
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
     * @see DataJobInfo.Fields#customProperties
     */
    public DataJobInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
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
     * @see DataJobInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
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
     * @see DataJobInfo.Fields#externalUrl
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
     * @see DataJobInfo.Fields#externalUrl
     */
    public DataJobInfo setExternalUrl(
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
     * @see DataJobInfo.Fields#externalUrl
     */
    public DataJobInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataJobInfo.Fields#name
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
     * @see DataJobInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataJobInfo.Fields#name
     */
    @Nullable
    public java.lang.String getName(GetMode mode) {
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
     * @see DataJobInfo.Fields#name
     */
    @Nonnull
    public java.lang.String getName() {
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
     * @see DataJobInfo.Fields#name
     */
    public DataJobInfo setName(
        @Nullable
        java.lang.String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.datajob.DataJobInfo");
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
     * @see DataJobInfo.Fields#name
     */
    public DataJobInfo setName(
        @Nonnull
        java.lang.String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataJobInfo.Fields#description
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
     * @see DataJobInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataJobInfo.Fields#description
     */
    @Nullable
    public java.lang.String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#description
     */
    @Nullable
    public java.lang.String getDescription() {
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
     * @see DataJobInfo.Fields#description
     */
    public DataJobInfo setDescription(
        @Nullable
        java.lang.String value, SetMode mode) {
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
     * @see DataJobInfo.Fields#description
     */
    public DataJobInfo setDescription(
        @Nonnull
        java.lang.String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataJobInfo.Fields#type
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
     * @see DataJobInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataJobInfo.Fields#type
     */
    @Nullable
    public DataJobInfo.Type getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = ((__rawValue == null)?null:new DataJobInfo.Type(__rawValue));
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInfo.Fields#type
     */
    @Nonnull
    public DataJobInfo.Type getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = ((__rawValue == null)?null:new DataJobInfo.Type(__rawValue));
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataJobInfo.Fields#type
     */
    public DataJobInfo setType(
        @Nullable
        DataJobInfo.Type value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.datajob.DataJobInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
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
     * @see DataJobInfo.Fields#type
     */
    public DataJobInfo setType(
        @Nonnull
        DataJobInfo.Type value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.data());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public boolean hasFlowUrn() {
        if (_flowUrnField!= null) {
            return true;
        }
        return super._map.containsKey("flowUrn");
    }

    /**
     * Remover for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public void removeFlowUrn() {
        super._map.remove("flowUrn");
    }

    /**
     * Getter for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    @Nullable
    public com.linkedin.common.urn.DataFlowUrn getFlowUrn(GetMode mode) {
        return getFlowUrn();
    }

    /**
     * Getter for flowUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#flowUrn
     */
    @Nullable
    public com.linkedin.common.urn.DataFlowUrn getFlowUrn() {
        if (_flowUrnField!= null) {
            return _flowUrnField;
        } else {
            Object __rawValue = super._map.get("flowUrn");
            _flowUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataFlowUrn.class);
            return _flowUrnField;
        }
    }

    /**
     * Setter for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public DataJobInfo setFlowUrn(
        @Nullable
        com.linkedin.common.urn.DataFlowUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFlowUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFlowUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "flowUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataFlowUrn.class));
                    _flowUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "flowUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataFlowUrn.class));
                    _flowUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for flowUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#flowUrn
     */
    public DataJobInfo setFlowUrn(
        @Nonnull
        com.linkedin.common.urn.DataFlowUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field flowUrn of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "flowUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataFlowUrn.class));
            _flowUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataJobInfo.Fields#created
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
     * @see DataJobInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataJobInfo.Fields#created
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
     * @see DataJobInfo.Fields#created
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
     * @see DataJobInfo.Fields#created
     */
    public DataJobInfo setCreated(
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
     * @see DataJobInfo.Fields#created
     */
    public DataJobInfo setCreated(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DataJobInfo.Fields#lastModified
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
     * @see DataJobInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DataJobInfo.Fields#lastModified
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
     * @see DataJobInfo.Fields#lastModified
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
     * @see DataJobInfo.Fields#lastModified
     */
    public DataJobInfo setLastModified(
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
     * @see DataJobInfo.Fields#lastModified
     */
    public DataJobInfo setLastModified(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    public boolean hasStatus() {
        if (_statusField!= null) {
            return true;
        }
        return super._map.containsKey("status");
    }

    /**
     * Remover for status
     * 
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    @Nullable
    public JobStatus getStatus(GetMode mode) {
        return getStatus();
    }

    /**
     * Getter for status
     * 
     * @return
     *     Optional field. Always check for null.
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    @Nullable
    public JobStatus getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            _statusField = DataTemplateUtil.coerceEnumOutput(__rawValue, JobStatus.class, JobStatus.$UNKNOWN);
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    public DataJobInfo setStatus(
        @Nullable
        JobStatus value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     Use Data Process Instance model, instead
     * @see DataJobInfo.Fields#status
     */
    @Deprecated
    public DataJobInfo setStatus(
        @Nonnull
        JobStatus value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value.name());
            _statusField = value;
        }
        return this;
    }

    /**
     * Existence checker for env
     * 
     * @see DataJobInfo.Fields#env
     */
    public boolean hasEnv() {
        if (_envField!= null) {
            return true;
        }
        return super._map.containsKey("env");
    }

    /**
     * Remover for env
     * 
     * @see DataJobInfo.Fields#env
     */
    public void removeEnv() {
        super._map.remove("env");
    }

    /**
     * Getter for env
     * 
     * @see DataJobInfo.Fields#env
     */
    @Nullable
    public FabricType getEnv(GetMode mode) {
        return getEnv();
    }

    /**
     * Getter for env
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#env
     */
    @Nullable
    public FabricType getEnv() {
        if (_envField!= null) {
            return _envField;
        } else {
            Object __rawValue = super._map.get("env");
            _envField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
            return _envField;
        }
    }

    /**
     * Setter for env
     * 
     * @see DataJobInfo.Fields#env
     */
    public DataJobInfo setEnv(
        @Nullable
        FabricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnv(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnv();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for env
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#env
     */
    public DataJobInfo setEnv(
        @Nonnull
        FabricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field env of com.linkedin.datajob.DataJobInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "env", value.name());
            _envField = value;
        }
        return this;
    }

    @Override
    public DataJobInfo clone()
        throws CloneNotSupportedException
    {
        DataJobInfo __clone = ((DataJobInfo) super.clone());
        __clone.__changeListener = new DataJobInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataJobInfo copy()
        throws CloneNotSupportedException
    {
        DataJobInfo __copy = ((DataJobInfo) super.copy());
        __copy._externalUrlField = null;
        __copy._customPropertiesField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._flowUrnField = null;
        __copy._lastModifiedField = null;
        __copy._typeField = null;
        __copy._envField = null;
        __copy._statusField = null;
        __copy.__changeListener = new DataJobInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
    {

        private final DataJobInfo __objectRef;

        private ChangeListener(DataJobInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(java.lang.String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "flowUrn":
                    __objectRef._flowUrnField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "env":
                    __objectRef._envField = null;
                    break;
                case "status":
                    __objectRef._statusField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<java.lang.String> path, java.lang.String name) {
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
         * Job name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Job description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Datajob type
         * **NOTE**: AzkabanJobType is deprecated. Please use strings instead.
         * 
         */
        public com.linkedin.datajob.DataJobInfo.Type.Fields type() {
            return new com.linkedin.datajob.DataJobInfo.Type.Fields(getPathComponents(), "type");
        }

        /**
         * DataFlow urn that this job is part of
         * 
         */
        public PathSpec flowUrn() {
            return new PathSpec(getPathComponents(), "flowUrn");
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.TimeStamp.Fields created() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "created");
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.TimeStamp.Fields lastModified() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Status of the job - Deprecated for Data Process Instance model.
         * 
         * @deprecated
         *     Use Data Process Instance model, instead
         */
        @Deprecated
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

        /**
         * Environment for this job
         * 
         */
        public PathSpec env() {
            return new PathSpec(getPathComponents(), "env");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.datajob.DataJobInfo.Type.ProjectionMask _typeMask;
        private com.linkedin.common.TimeStamp.ProjectionMask _createdMask;
        private com.linkedin.common.TimeStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(14);
        }

        /**
         * Custom property bag.
         * 
         */
        public DataJobInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public DataJobInfo.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Job name
         * 
         */
        public DataJobInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Job description
         * 
         */
        public DataJobInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Datajob type
         * **NOTE**: AzkabanJobType is deprecated. Please use strings instead.
         * 
         */
        public DataJobInfo.ProjectionMask withType(Function<com.linkedin.datajob.DataJobInfo.Type.ProjectionMask, com.linkedin.datajob.DataJobInfo.Type.ProjectionMask> nestedMask) {
            _typeMask = nestedMask.apply(((_typeMask == null)?DataJobInfo.Type.createMask():_typeMask));
            getDataMap().put("type", _typeMask.getDataMap());
            return this;
        }

        /**
         * Datajob type
         * **NOTE**: AzkabanJobType is deprecated. Please use strings instead.
         * 
         */
        public DataJobInfo.ProjectionMask withType() {
            _typeMask = null;
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * DataFlow urn that this job is part of
         * 
         */
        public DataJobInfo.ProjectionMask withFlowUrn() {
            getDataMap().put("flowUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withCreated(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?TimeStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withLastModified(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?TimeStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DataJobInfo.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Status of the job - Deprecated for Data Process Instance model.
         * 
         * @deprecated
         *     Use Data Process Instance model, instead
         */
        @Deprecated
        public DataJobInfo.ProjectionMask withStatus() {
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Environment for this job
         * 
         */
        public DataJobInfo.ProjectionMask withEnv() {
            getDataMap().put("env", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datajob/DataJobInfo.pdl.")
    public static class Type
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]", SchemaFormatType.PDL));
        private com.linkedin.datajob.azkaban.AzkabanJobType _azkabanJobTypeMember = null;
        private java.lang.String _stringMember = null;
        private DataJobInfo.Type.ChangeListener __changeListener = new DataJobInfo.Type.ChangeListener(this);
        private final static DataSchema MEMBER_AzkabanJobType = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.azkaban.AzkabanJobType");
        public final static java.lang.String MEMBERKEY_AzkabanJobType = "com.linkedin.datajob.azkaban.AzkabanJobType";
        private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
        public final static java.lang.String MEMBERKEY_String = "string";

        public Type() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public Type(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static DataJobInfo.Type create(com.linkedin.datajob.azkaban.AzkabanJobType value) {
            DataJobInfo.Type newUnion = new DataJobInfo.Type();
            newUnion.setAzkabanJobType(value);
            return newUnion;
        }

        public boolean isAzkabanJobType() {
            return memberIs("com.linkedin.datajob.azkaban.AzkabanJobType");
        }

        public com.linkedin.datajob.azkaban.AzkabanJobType getAzkabanJobType() {
            checkNotNull();
            if (_azkabanJobTypeMember!= null) {
                return _azkabanJobTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.datajob.azkaban.AzkabanJobType");
            _azkabanJobTypeMember = DataTemplateUtil.coerceEnumOutput(__rawValue, com.linkedin.datajob.azkaban.AzkabanJobType.class, com.linkedin.datajob.azkaban.AzkabanJobType.$UNKNOWN);
            return _azkabanJobTypeMember;
        }

        public void setAzkabanJobType(com.linkedin.datajob.azkaban.AzkabanJobType value) {
            checkNotNull();
            super._map.clear();
            _azkabanJobTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.datajob.azkaban.AzkabanJobType", value.name());
        }

        public static DataJobInfo.Type create(java.lang.String value) {
            DataJobInfo.Type newUnion = new DataJobInfo.Type();
            newUnion.setString(value);
            return newUnion;
        }

        public boolean isString() {
            return memberIs("string");
        }

        public java.lang.String getString() {
            checkNotNull();
            if (_stringMember!= null) {
                return _stringMember;
            }
            Object __rawValue = super._map.get("string");
            _stringMember = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _stringMember;
        }

        public void setString(java.lang.String value) {
            checkNotNull();
            super._map.clear();
            _stringMember = value;
            CheckedUtil.putWithoutChecking(super._map, "string", value);
        }

        public static DataJobInfo.Type.ProjectionMask createMask() {
            return new DataJobInfo.Type.ProjectionMask();
        }

        @Override
        public DataJobInfo.Type clone()
            throws CloneNotSupportedException
        {
            DataJobInfo.Type __clone = ((DataJobInfo.Type) super.clone());
            __clone.__changeListener = new DataJobInfo.Type.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public DataJobInfo.Type copy()
            throws CloneNotSupportedException
        {
            DataJobInfo.Type __copy = ((DataJobInfo.Type) super.copy());
            __copy._stringMember = null;
            __copy._azkabanJobTypeMember = null;
            __copy.__changeListener = new DataJobInfo.Type.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
        {

            private final DataJobInfo.Type __objectRef;

            private ChangeListener(DataJobInfo.Type reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(java.lang.String key, Object value) {
                switch (key) {
                    case "string":
                        __objectRef._stringMember = null;
                        break;
                    case "com.linkedin.datajob.azkaban.AzkabanJobType":
                        __objectRef._azkabanJobTypeMember = null;
                        break;
                }
            }

        }

        public static class Fields
            extends PathSpec
        {


            public Fields(List<java.lang.String> path, java.lang.String name) {
                super(path, name);
            }

            public Fields() {
                super();
            }

            public PathSpec AzkabanJobType() {
                return new PathSpec(getPathComponents(), "com.linkedin.datajob.azkaban.AzkabanJobType");
            }

            public PathSpec String() {
                return new PathSpec(getPathComponents(), "string");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {


            ProjectionMask() {
                super(3);
            }

            public DataJobInfo.Type.ProjectionMask withAzkabanJobType() {
                getDataMap().put("com.linkedin.datajob.azkaban.AzkabanJobType", MaskMap.POSITIVE_MASK);
                return this;
            }

            public DataJobInfo.Type.ProjectionMask withString() {
                getDataMap().put("string", MaskMap.POSITIVE_MASK);
                return this;
            }

        }

    }

}
