
package com.linkedin.chart;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AccessLevel;
import com.linkedin.common.ChangeAuditStamps;
import com.linkedin.common.EdgeArray;
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about a chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/chart/ChartInfo.pdl.")
public class ChartInfo
    extends RecordTemplate
{

    private final static ChartInfo.Fields _fields = new ChartInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the chart*/@Searchable.searchTier=2,description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}chartUrl:optional com.linkedin.common.Url/**Data sources for the chart\nDeprecated! Use inputEdges instead.*/@Relationship.`/*/string`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]/**Data sources for the chart*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"chart\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional AuditStamp/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Type of the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Chart Type\",\"searchTier\":3}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT,WORD_CLOUD,COHORT}/**Access level for the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _titleField = null;
    private String _descriptionField = null;
    private ChangeAuditStamps _lastModifiedField = null;
    private com.linkedin.common.url.Url _chartUrlField = null;
    private ChartDataSourceTypeArray _inputsField = null;
    private EdgeArray _inputEdgesField = null;
    private ChartType _typeField = null;
    private AccessLevel _accessField = null;
    private Long _lastRefreshedField = null;
    private ChartInfo.ChangeListener __changeListener = new ChartInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_ChartUrl = SCHEMA.getField("chartUrl");
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_InputEdges = SCHEMA.getField("inputEdges");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Access = SCHEMA.getField("access");
    private final static RecordDataSchema.Field FIELD_LastRefreshed = SCHEMA.getField("lastRefreshed");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public ChartInfo() {
        super(new DataMap(15, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public ChartInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ChartInfo.Fields fields() {
        return _fields;
    }

    public static ChartInfo.ProjectionMask createMask() {
        return new ChartInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
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
     * @see ChartInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see ChartInfo.Fields#customProperties
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
     * @see ChartInfo.Fields#customProperties
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
     * @see ChartInfo.Fields#customProperties
     */
    public ChartInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.chart.ChartInfo");
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
     * @see ChartInfo.Fields#customProperties
     */
    public ChartInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
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
     * @see ChartInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see ChartInfo.Fields#externalUrl
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
     * @see ChartInfo.Fields#externalUrl
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
     * @see ChartInfo.Fields#externalUrl
     */
    public ChartInfo setExternalUrl(
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
     * @see ChartInfo.Fields#externalUrl
     */
    public ChartInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see ChartInfo.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see ChartInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see ChartInfo.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTitle();
            case DEFAULT:
            case NULL:
                if (_titleField!= null) {
                    return _titleField;
                } else {
                    Object __rawValue = super._map.get("title");
                    _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _titleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#title
     */
    @Nonnull
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("title");
            }
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see ChartInfo.Fields#title
     */
    public ChartInfo setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field title of com.linkedin.chart.ChartInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#title
     */
    public ChartInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see ChartInfo.Fields#description
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
     * @see ChartInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see ChartInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDescription();
            case DEFAULT:
            case NULL:
                if (_descriptionField!= null) {
                    return _descriptionField;
                } else {
                    Object __rawValue = super._map.get("description");
                    _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _descriptionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#description
     */
    @Nonnull
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("description");
            }
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see ChartInfo.Fields#description
     */
    public ChartInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field description of com.linkedin.chart.ChartInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
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
     * @see ChartInfo.Fields#description
     */
    public ChartInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
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
     * @see ChartInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    @Nullable
    public ChangeAuditStamps getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastModified();
            case DEFAULT:
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartInfo.Fields#lastModified
     */
    @Nonnull
    public ChangeAuditStamps getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastModified");
            }
            _lastModifiedField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see ChartInfo.Fields#lastModified
     */
    public ChartInfo setLastModified(
        @Nullable
        ChangeAuditStamps value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.chart.ChartInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
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
     * @see ChartInfo.Fields#lastModified
     */
    public ChartInfo setLastModified(
        @Nonnull
        ChangeAuditStamps value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public boolean hasChartUrl() {
        if (_chartUrlField!= null) {
            return true;
        }
        return super._map.containsKey("chartUrl");
    }

    /**
     * Remover for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public void removeChartUrl() {
        super._map.remove("chartUrl");
    }

    /**
     * Getter for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getChartUrl(GetMode mode) {
        return getChartUrl();
    }

    /**
     * Getter for chartUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#chartUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getChartUrl() {
        if (_chartUrlField!= null) {
            return _chartUrlField;
        } else {
            Object __rawValue = super._map.get("chartUrl");
            _chartUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _chartUrlField;
        }
    }

    /**
     * Setter for chartUrl
     * 
     * @see ChartInfo.Fields#chartUrl
     */
    public ChartInfo setChartUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChartUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChartUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "chartUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _chartUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "chartUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _chartUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for chartUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#chartUrl
     */
    public ChartInfo setChartUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field chartUrl of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "chartUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _chartUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    public boolean hasInputs() {
        if (_inputsField!= null) {
            return true;
        }
        return super._map.containsKey("inputs");
    }

    /**
     * Remover for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    public void removeInputs() {
        super._map.remove("inputs");
    }

    /**
     * Getter for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    @Nullable
    public ChartDataSourceTypeArray getInputs(GetMode mode) {
        return getInputs();
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    @Nullable
    public ChartDataSourceTypeArray getInputs() {
        if (_inputsField!= null) {
            return _inputsField;
        } else {
            Object __rawValue = super._map.get("inputs");
            _inputsField = ((__rawValue == null)?null:new ChartDataSourceTypeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputsField;
        }
    }

    /**
     * Setter for inputs
     * 
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    public ChartInfo setInputs(
        @Nullable
        ChartDataSourceTypeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#inputs
     */
    @Deprecated
    public ChartInfo setInputs(
        @Nonnull
        ChartDataSourceTypeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputs of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
            _inputsField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputEdges
     * 
     * @see ChartInfo.Fields#inputEdges
     */
    public boolean hasInputEdges() {
        if (_inputEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("inputEdges");
    }

    /**
     * Remover for inputEdges
     * 
     * @see ChartInfo.Fields#inputEdges
     */
    public void removeInputEdges() {
        super._map.remove("inputEdges");
    }

    /**
     * Getter for inputEdges
     * 
     * @see ChartInfo.Fields#inputEdges
     */
    @Nullable
    public EdgeArray getInputEdges(GetMode mode) {
        return getInputEdges();
    }

    /**
     * Getter for inputEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#inputEdges
     */
    @Nullable
    public EdgeArray getInputEdges() {
        if (_inputEdgesField!= null) {
            return _inputEdgesField;
        } else {
            Object __rawValue = super._map.get("inputEdges");
            _inputEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputEdgesField;
        }
    }

    /**
     * Setter for inputEdges
     * 
     * @see ChartInfo.Fields#inputEdges
     */
    public ChartInfo setInputEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
                    _inputEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
                    _inputEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#inputEdges
     */
    public ChartInfo setInputEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputEdges of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
            _inputEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see ChartInfo.Fields#type
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
     * @see ChartInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see ChartInfo.Fields#type
     */
    @Nullable
    public ChartType getType(GetMode mode) {
        return getType();
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#type
     */
    @Nullable
    public ChartType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, ChartType.class, ChartType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see ChartInfo.Fields#type
     */
    public ChartInfo setType(
        @Nullable
        ChartType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
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
     * @see ChartInfo.Fields#type
     */
    public ChartInfo setType(
        @Nonnull
        ChartType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for access
     * 
     * @see ChartInfo.Fields#access
     */
    public boolean hasAccess() {
        if (_accessField!= null) {
            return true;
        }
        return super._map.containsKey("access");
    }

    /**
     * Remover for access
     * 
     * @see ChartInfo.Fields#access
     */
    public void removeAccess() {
        super._map.remove("access");
    }

    /**
     * Getter for access
     * 
     * @see ChartInfo.Fields#access
     */
    @Nullable
    public AccessLevel getAccess(GetMode mode) {
        return getAccess();
    }

    /**
     * Getter for access
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#access
     */
    @Nullable
    public AccessLevel getAccess() {
        if (_accessField!= null) {
            return _accessField;
        } else {
            Object __rawValue = super._map.get("access");
            _accessField = DataTemplateUtil.coerceEnumOutput(__rawValue, AccessLevel.class, AccessLevel.$UNKNOWN);
            return _accessField;
        }
    }

    /**
     * Setter for access
     * 
     * @see ChartInfo.Fields#access
     */
    public ChartInfo setAccess(
        @Nullable
        AccessLevel value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAccess(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAccess();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "access", value.name());
                    _accessField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "access", value.name());
                    _accessField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for access
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#access
     */
    public ChartInfo setAccess(
        @Nonnull
        AccessLevel value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field access of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "access", value.name());
            _accessField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public boolean hasLastRefreshed() {
        if (_lastRefreshedField!= null) {
            return true;
        }
        return super._map.containsKey("lastRefreshed");
    }

    /**
     * Remover for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public void removeLastRefreshed() {
        super._map.remove("lastRefreshed");
    }

    /**
     * Getter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    @Nullable
    public Long getLastRefreshed(GetMode mode) {
        return getLastRefreshed();
    }

    /**
     * Getter for lastRefreshed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartInfo.Fields#lastRefreshed
     */
    @Nullable
    public Long getLastRefreshed() {
        if (_lastRefreshedField!= null) {
            return _lastRefreshedField;
        } else {
            Object __rawValue = super._map.get("lastRefreshed");
            _lastRefreshedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastRefreshedField;
        }
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastRefreshed(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastRefreshed();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
                    _lastRefreshedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
                    _lastRefreshedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastRefreshed of com.linkedin.chart.ChartInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
            _lastRefreshedField = value;
        }
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see ChartInfo.Fields#lastRefreshed
     */
    public ChartInfo setLastRefreshed(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
        _lastRefreshedField = value;
        return this;
    }

    @Override
    public ChartInfo clone()
        throws CloneNotSupportedException
    {
        ChartInfo __clone = ((ChartInfo) super.clone());
        __clone.__changeListener = new ChartInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartInfo copy()
        throws CloneNotSupportedException
    {
        ChartInfo __copy = ((ChartInfo) super.copy());
        __copy._externalUrlField = null;
        __copy._lastRefreshedField = null;
        __copy._customPropertiesField = null;
        __copy._accessField = null;
        __copy._inputsField = null;
        __copy._descriptionField = null;
        __copy._lastModifiedField = null;
        __copy._titleField = null;
        __copy._typeField = null;
        __copy._inputEdgesField = null;
        __copy._chartUrlField = null;
        __copy.__changeListener = new ChartInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartInfo __objectRef;

        private ChangeListener(ChartInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "lastRefreshed":
                    __objectRef._lastRefreshedField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "access":
                    __objectRef._accessField = null;
                    break;
                case "inputs":
                    __objectRef._inputsField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "inputEdges":
                    __objectRef._inputEdgesField = null;
                    break;
                case "chartUrl":
                    __objectRef._chartUrlField = null;
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
         * Title of the chart
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Detailed description about the chart
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Captures information about who created/last modified/deleted this chart and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields lastModified() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "lastModified");
        }

        /**
         * URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart
         * 
         */
        public PathSpec chartUrl() {
            return new PathSpec(getPathComponents(), "chartUrl");
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public com.linkedin.chart.ChartDataSourceTypeArray.Fields inputs() {
            return new com.linkedin.chart.ChartDataSourceTypeArray.Fields(getPathComponents(), "inputs");
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Data sources for the chart
         * 
         */
        public com.linkedin.common.EdgeArray.Fields inputEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "inputEdges");
        }

        /**
         * Data sources for the chart
         * 
         */
        public PathSpec inputEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Type of the chart
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Access level for the chart
         * 
         */
        public PathSpec access() {
            return new PathSpec(getPathComponents(), "access");
        }

        /**
         * The time when this chart last refreshed
         * 
         */
        public PathSpec lastRefreshed() {
            return new PathSpec(getPathComponents(), "lastRefreshed");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.ChangeAuditStamps.ProjectionMask _lastModifiedMask;
        private com.linkedin.chart.ChartDataSourceTypeArray.ProjectionMask _inputsMask;
        private com.linkedin.common.EdgeArray.ProjectionMask _inputEdgesMask;

        ProjectionMask() {
            super(15);
        }

        /**
         * Custom property bag.
         * 
         */
        public ChartInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public ChartInfo.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Title of the chart
         * 
         */
        public ChartInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Detailed description about the chart
         * 
         */
        public ChartInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this chart and when
         * 
         */
        public ChartInfo.ProjectionMask withLastModified(Function<com.linkedin.common.ChangeAuditStamps.ProjectionMask, com.linkedin.common.ChangeAuditStamps.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?ChangeAuditStamps.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this chart and when
         * 
         */
        public ChartInfo.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this chart and when
         * 
         */
        public ChartInfo.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart
         * 
         */
        public ChartInfo.ProjectionMask withChartUrl() {
            getDataMap().put("chartUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public ChartInfo.ProjectionMask withInputs(Function<com.linkedin.chart.ChartDataSourceTypeArray.ProjectionMask, com.linkedin.chart.ChartDataSourceTypeArray.ProjectionMask> nestedMask) {
            _inputsMask = nestedMask.apply(((_inputsMask == null)?ChartDataSourceTypeArray.createMask():_inputsMask));
            getDataMap().put("inputs", _inputsMask.getDataMap());
            return this;
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public ChartInfo.ProjectionMask withInputs() {
            _inputsMask = null;
            getDataMap().put("inputs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public ChartInfo.ProjectionMask withInputs(Function<com.linkedin.chart.ChartDataSourceTypeArray.ProjectionMask, com.linkedin.chart.ChartDataSourceTypeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _inputsMask = nestedMask.apply(((_inputsMask == null)?ChartDataSourceTypeArray.createMask():_inputsMask));
            getDataMap().put("inputs", _inputsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("inputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputs").put("$count", count);
            }
            return this;
        }

        /**
         * Data sources for the chart
         * Deprecated! Use inputEdges instead.
         * 
         */
        @Deprecated
        public ChartInfo.ProjectionMask withInputs(Integer start, Integer count) {
            _inputsMask = null;
            getDataMap().put("inputs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputs").put("$count", count);
            }
            return this;
        }

        /**
         * Data sources for the chart
         * 
         */
        public ChartInfo.ProjectionMask withInputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _inputEdgesMask = nestedMask.apply(((_inputEdgesMask == null)?EdgeArray.createMask():_inputEdgesMask));
            getDataMap().put("inputEdges", _inputEdgesMask.getDataMap());
            return this;
        }

        /**
         * Data sources for the chart
         * 
         */
        public ChartInfo.ProjectionMask withInputEdges() {
            _inputEdgesMask = null;
            getDataMap().put("inputEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Data sources for the chart
         * 
         */
        public ChartInfo.ProjectionMask withInputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _inputEdgesMask = nestedMask.apply(((_inputEdgesMask == null)?EdgeArray.createMask():_inputEdgesMask));
            getDataMap().put("inputEdges", _inputEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("inputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Data sources for the chart
         * 
         */
        public ChartInfo.ProjectionMask withInputEdges(Integer start, Integer count) {
            _inputEdgesMask = null;
            getDataMap().put("inputEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Type of the chart
         * 
         */
        public ChartInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Access level for the chart
         * 
         */
        public ChartInfo.ProjectionMask withAccess() {
            getDataMap().put("access", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time when this chart last refreshed
         * 
         */
        public ChartInfo.ProjectionMask withLastRefreshed() {
            getDataMap().put("lastRefreshed", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
