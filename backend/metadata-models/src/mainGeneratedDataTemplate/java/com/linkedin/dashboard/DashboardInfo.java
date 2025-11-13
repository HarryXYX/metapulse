
package com.linkedin.dashboard;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AccessLevel;
import com.linkedin.common.ChangeAuditStamps;
import com.linkedin.common.ChartUrnArray;
import com.linkedin.common.EdgeArray;
import com.linkedin.common.UrnArray;
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
 * Information about a dashboard
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dashboard/DashboardInfo.pdl.")
public class DashboardInfo
    extends RecordTemplate
{

    private final static DashboardInfo.Fields _fields = new DashboardInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dashboard/**Information about a dashboard*/@Aspect.name=\"dashboardInfo\"record DashboardInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the dashboard*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the dashboard*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:string/**Charts in a dashboard\nDeprecated! Use chartEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\"}@deprecated,charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized chart identifier\",\"entityType\":\"chart\",\"fields\":[{\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"maxLength\":20,\"name\":\"dashboardTool\",\"type\":\"string\"},{\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"maxLength\":200,\"name\":\"chartId\",\"type\":\"string\"}],\"maxLength\":236,\"name\":\"Chart\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref ChartUrn=string}]=[]/**Charts in a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"chartEdges/*/created/actor\",\"createdOn\":\"chartEdges/*/created/time\",\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\",\"properties\":\"chartEdges/*/properties\",\"updatedActor\":\"chartEdges/*/lastModified/actor\",\"updatedOn\":\"chartEdges/*/lastModified/time\"}chartEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Datasets consumed by a dashboard\nDeprecated! Use datasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,datasets:array[com.linkedin.common.Urn]=[]/**Datasets consumed by a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"datasetEdges/*/created/actor\",\"createdOn\":\"datasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"datasetEdges/*/properties\",\"updatedActor\":\"datasetEdges/*/lastModified/actor\",\"updatedOn\":\"datasetEdges/*/lastModified/time\"}datasetEdges:optional array[com.linkedin.common.Edge]/**Dashboards included by this dashboard.\nSome dashboard entities (e.g. PowerBI Apps) can contain other dashboards.\n\nThe Edge's sourceUrn should never be set, as it will always be the base dashboard.*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"dashboards/*/created/actor\",\"createdOn\":\"dashboards/*/created/time\",\"entityTypes\":[\"dashboard\"],\"isLineage\":true,\"name\":\"DashboardContainsDashboard\",\"properties\":\"dashboards/*/properties\",\"updatedActor\":\"dashboards/*/lastModified/actor\",\"updatedOn\":\"dashboards/*/lastModified/time\"}dashboards:array[com.linkedin.common.Edge]=[]/**Captures information about who created/last modified/deleted this dashboard and when*/@Searchable.`/lastModified/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}dashboardUrl:optional com.linkedin.common.Url/**Access level for the dashboard*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this dashboard last refreshed*/lastRefreshed:optional com.linkedin.common.Time}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _titleField = null;
    private String _descriptionField = null;
    private ChartUrnArray _chartsField = null;
    private EdgeArray _chartEdgesField = null;
    private UrnArray _datasetsField = null;
    private EdgeArray _datasetEdgesField = null;
    private EdgeArray _dashboardsField = null;
    private ChangeAuditStamps _lastModifiedField = null;
    private com.linkedin.common.url.Url _dashboardUrlField = null;
    private AccessLevel _accessField = null;
    private Long _lastRefreshedField = null;
    private DashboardInfo.ChangeListener __changeListener = new DashboardInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Charts = SCHEMA.getField("charts");
    private final static ChartUrnArray DEFAULT_Charts;
    private final static RecordDataSchema.Field FIELD_ChartEdges = SCHEMA.getField("chartEdges");
    private final static RecordDataSchema.Field FIELD_Datasets = SCHEMA.getField("datasets");
    private final static UrnArray DEFAULT_Datasets;
    private final static RecordDataSchema.Field FIELD_DatasetEdges = SCHEMA.getField("datasetEdges");
    private final static RecordDataSchema.Field FIELD_Dashboards = SCHEMA.getField("dashboards");
    private final static EdgeArray DEFAULT_Dashboards;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_DashboardUrl = SCHEMA.getField("dashboardUrl");
    private final static RecordDataSchema.Field FIELD_Access = SCHEMA.getField("access");
    private final static RecordDataSchema.Field FIELD_LastRefreshed = SCHEMA.getField("lastRefreshed");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_Charts = ((FIELD_Charts.getDefault() == null)?null:new ChartUrnArray(DataTemplateUtil.castOrThrow(FIELD_Charts.getDefault(), DataList.class)));
        DEFAULT_Datasets = ((FIELD_Datasets.getDefault() == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(FIELD_Datasets.getDefault(), DataList.class)));
        DEFAULT_Dashboards = ((FIELD_Dashboards.getDefault() == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(FIELD_Dashboards.getDefault(), DataList.class)));
    }

    public DashboardInfo() {
        super(new DataMap(), SCHEMA, 10);
        addChangeListener(__changeListener);
    }

    public DashboardInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DashboardInfo.Fields fields() {
        return _fields;
    }

    public static DashboardInfo.ProjectionMask createMask() {
        return new DashboardInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DashboardInfo.Fields#customProperties
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
     * @see DashboardInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see DashboardInfo.Fields#customProperties
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
     * @see DashboardInfo.Fields#customProperties
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
     * @see DashboardInfo.Fields#customProperties
     */
    public DashboardInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.dashboard.DashboardInfo");
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
     * @see DashboardInfo.Fields#customProperties
     */
    public DashboardInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see DashboardInfo.Fields#externalUrl
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
     * @see DashboardInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see DashboardInfo.Fields#externalUrl
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
     * @see DashboardInfo.Fields#externalUrl
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
     * @see DashboardInfo.Fields#externalUrl
     */
    public DashboardInfo setExternalUrl(
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
     * @see DashboardInfo.Fields#externalUrl
     */
    public DashboardInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see DashboardInfo.Fields#title
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
     * @see DashboardInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see DashboardInfo.Fields#title
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
     * @see DashboardInfo.Fields#title
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
     * @see DashboardInfo.Fields#title
     */
    public DashboardInfo setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field title of com.linkedin.dashboard.DashboardInfo");
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
     * @see DashboardInfo.Fields#title
     */
    public DashboardInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DashboardInfo.Fields#description
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
     * @see DashboardInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DashboardInfo.Fields#description
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
     * @see DashboardInfo.Fields#description
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
     * @see DashboardInfo.Fields#description
     */
    public DashboardInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field description of com.linkedin.dashboard.DashboardInfo");
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
     * @see DashboardInfo.Fields#description
     */
    public DashboardInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for charts
     * 
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    public boolean hasCharts() {
        if (_chartsField!= null) {
            return true;
        }
        return super._map.containsKey("charts");
    }

    /**
     * Remover for charts
     * 
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    public void removeCharts() {
        super._map.remove("charts");
    }

    /**
     * Getter for charts
     * 
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    @Nullable
    public ChartUrnArray getCharts(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCharts();
            case NULL:
                if (_chartsField!= null) {
                    return _chartsField;
                } else {
                    Object __rawValue = super._map.get("charts");
                    _chartsField = ((__rawValue == null)?null:new ChartUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _chartsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for charts
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    @Nonnull
    public ChartUrnArray getCharts() {
        if (_chartsField!= null) {
            return _chartsField;
        } else {
            Object __rawValue = super._map.get("charts");
            if (__rawValue == null) {
                return DEFAULT_Charts;
            }
            _chartsField = ((__rawValue == null)?null:new ChartUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _chartsField;
        }
    }

    /**
     * Setter for charts
     * 
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    public DashboardInfo setCharts(
        @Nullable
        ChartUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCharts(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field charts of com.linkedin.dashboard.DashboardInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "charts", value.data());
                    _chartsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCharts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "charts", value.data());
                    _chartsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "charts", value.data());
                    _chartsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for charts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#charts
     */
    @Deprecated
    public DashboardInfo setCharts(
        @Nonnull
        ChartUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field charts of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "charts", value.data());
            _chartsField = value;
        }
        return this;
    }

    /**
     * Existence checker for chartEdges
     * 
     * @see DashboardInfo.Fields#chartEdges
     */
    public boolean hasChartEdges() {
        if (_chartEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("chartEdges");
    }

    /**
     * Remover for chartEdges
     * 
     * @see DashboardInfo.Fields#chartEdges
     */
    public void removeChartEdges() {
        super._map.remove("chartEdges");
    }

    /**
     * Getter for chartEdges
     * 
     * @see DashboardInfo.Fields#chartEdges
     */
    @Nullable
    public EdgeArray getChartEdges(GetMode mode) {
        return getChartEdges();
    }

    /**
     * Getter for chartEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardInfo.Fields#chartEdges
     */
    @Nullable
    public EdgeArray getChartEdges() {
        if (_chartEdgesField!= null) {
            return _chartEdgesField;
        } else {
            Object __rawValue = super._map.get("chartEdges");
            _chartEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _chartEdgesField;
        }
    }

    /**
     * Setter for chartEdges
     * 
     * @see DashboardInfo.Fields#chartEdges
     */
    public DashboardInfo setChartEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChartEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChartEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "chartEdges", value.data());
                    _chartEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "chartEdges", value.data());
                    _chartEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for chartEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#chartEdges
     */
    public DashboardInfo setChartEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field chartEdges of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "chartEdges", value.data());
            _chartEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for datasets
     * 
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    public boolean hasDatasets() {
        if (_datasetsField!= null) {
            return true;
        }
        return super._map.containsKey("datasets");
    }

    /**
     * Remover for datasets
     * 
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    public void removeDatasets() {
        super._map.remove("datasets");
    }

    /**
     * Getter for datasets
     * 
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    @Nullable
    public UrnArray getDatasets(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDatasets();
            case NULL:
                if (_datasetsField!= null) {
                    return _datasetsField;
                } else {
                    Object __rawValue = super._map.get("datasets");
                    _datasetsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _datasetsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for datasets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    @Nonnull
    public UrnArray getDatasets() {
        if (_datasetsField!= null) {
            return _datasetsField;
        } else {
            Object __rawValue = super._map.get("datasets");
            if (__rawValue == null) {
                return DEFAULT_Datasets;
            }
            _datasetsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _datasetsField;
        }
    }

    /**
     * Setter for datasets
     * 
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    public DashboardInfo setDatasets(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDatasets(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field datasets of com.linkedin.dashboard.DashboardInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasets", value.data());
                    _datasetsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDatasets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasets", value.data());
                    _datasetsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "datasets", value.data());
                    _datasetsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for datasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#datasets
     */
    @Deprecated
    public DashboardInfo setDatasets(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field datasets of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "datasets", value.data());
            _datasetsField = value;
        }
        return this;
    }

    /**
     * Existence checker for datasetEdges
     * 
     * @see DashboardInfo.Fields#datasetEdges
     */
    public boolean hasDatasetEdges() {
        if (_datasetEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("datasetEdges");
    }

    /**
     * Remover for datasetEdges
     * 
     * @see DashboardInfo.Fields#datasetEdges
     */
    public void removeDatasetEdges() {
        super._map.remove("datasetEdges");
    }

    /**
     * Getter for datasetEdges
     * 
     * @see DashboardInfo.Fields#datasetEdges
     */
    @Nullable
    public EdgeArray getDatasetEdges(GetMode mode) {
        return getDatasetEdges();
    }

    /**
     * Getter for datasetEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardInfo.Fields#datasetEdges
     */
    @Nullable
    public EdgeArray getDatasetEdges() {
        if (_datasetEdgesField!= null) {
            return _datasetEdgesField;
        } else {
            Object __rawValue = super._map.get("datasetEdges");
            _datasetEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _datasetEdgesField;
        }
    }

    /**
     * Setter for datasetEdges
     * 
     * @see DashboardInfo.Fields#datasetEdges
     */
    public DashboardInfo setDatasetEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDatasetEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDatasetEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasetEdges", value.data());
                    _datasetEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "datasetEdges", value.data());
                    _datasetEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for datasetEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#datasetEdges
     */
    public DashboardInfo setDatasetEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field datasetEdges of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "datasetEdges", value.data());
            _datasetEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for dashboards
     * 
     * @see DashboardInfo.Fields#dashboards
     */
    public boolean hasDashboards() {
        if (_dashboardsField!= null) {
            return true;
        }
        return super._map.containsKey("dashboards");
    }

    /**
     * Remover for dashboards
     * 
     * @see DashboardInfo.Fields#dashboards
     */
    public void removeDashboards() {
        super._map.remove("dashboards");
    }

    /**
     * Getter for dashboards
     * 
     * @see DashboardInfo.Fields#dashboards
     */
    @Nullable
    public EdgeArray getDashboards(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDashboards();
            case NULL:
                if (_dashboardsField!= null) {
                    return _dashboardsField;
                } else {
                    Object __rawValue = super._map.get("dashboards");
                    _dashboardsField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _dashboardsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dashboards
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardInfo.Fields#dashboards
     */
    @Nonnull
    public EdgeArray getDashboards() {
        if (_dashboardsField!= null) {
            return _dashboardsField;
        } else {
            Object __rawValue = super._map.get("dashboards");
            if (__rawValue == null) {
                return DEFAULT_Dashboards;
            }
            _dashboardsField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _dashboardsField;
        }
    }

    /**
     * Setter for dashboards
     * 
     * @see DashboardInfo.Fields#dashboards
     */
    public DashboardInfo setDashboards(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDashboards(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dashboards of com.linkedin.dashboard.DashboardInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboards", value.data());
                    _dashboardsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDashboards();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboards", value.data());
                    _dashboardsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dashboards", value.data());
                    _dashboardsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dashboards
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#dashboards
     */
    public DashboardInfo setDashboards(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dashboards of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dashboards", value.data());
            _dashboardsField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DashboardInfo.Fields#lastModified
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
     * @see DashboardInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DashboardInfo.Fields#lastModified
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
     * @see DashboardInfo.Fields#lastModified
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
     * @see DashboardInfo.Fields#lastModified
     */
    public DashboardInfo setLastModified(
        @Nullable
        ChangeAuditStamps value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.dashboard.DashboardInfo");
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
     * @see DashboardInfo.Fields#lastModified
     */
    public DashboardInfo setLastModified(
        @Nonnull
        ChangeAuditStamps value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for dashboardUrl
     * 
     * @see DashboardInfo.Fields#dashboardUrl
     */
    public boolean hasDashboardUrl() {
        if (_dashboardUrlField!= null) {
            return true;
        }
        return super._map.containsKey("dashboardUrl");
    }

    /**
     * Remover for dashboardUrl
     * 
     * @see DashboardInfo.Fields#dashboardUrl
     */
    public void removeDashboardUrl() {
        super._map.remove("dashboardUrl");
    }

    /**
     * Getter for dashboardUrl
     * 
     * @see DashboardInfo.Fields#dashboardUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getDashboardUrl(GetMode mode) {
        return getDashboardUrl();
    }

    /**
     * Getter for dashboardUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardInfo.Fields#dashboardUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getDashboardUrl() {
        if (_dashboardUrlField!= null) {
            return _dashboardUrlField;
        } else {
            Object __rawValue = super._map.get("dashboardUrl");
            _dashboardUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _dashboardUrlField;
        }
    }

    /**
     * Setter for dashboardUrl
     * 
     * @see DashboardInfo.Fields#dashboardUrl
     */
    public DashboardInfo setDashboardUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDashboardUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDashboardUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _dashboardUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _dashboardUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dashboardUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardInfo.Fields#dashboardUrl
     */
    public DashboardInfo setDashboardUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dashboardUrl of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dashboardUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _dashboardUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for access
     * 
     * @see DashboardInfo.Fields#access
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
     * @see DashboardInfo.Fields#access
     */
    public void removeAccess() {
        super._map.remove("access");
    }

    /**
     * Getter for access
     * 
     * @see DashboardInfo.Fields#access
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
     * @see DashboardInfo.Fields#access
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
     * @see DashboardInfo.Fields#access
     */
    public DashboardInfo setAccess(
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
     * @see DashboardInfo.Fields#access
     */
    public DashboardInfo setAccess(
        @Nonnull
        AccessLevel value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field access of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "access", value.name());
            _accessField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastRefreshed
     * 
     * @see DashboardInfo.Fields#lastRefreshed
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
     * @see DashboardInfo.Fields#lastRefreshed
     */
    public void removeLastRefreshed() {
        super._map.remove("lastRefreshed");
    }

    /**
     * Getter for lastRefreshed
     * 
     * @see DashboardInfo.Fields#lastRefreshed
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
     * @see DashboardInfo.Fields#lastRefreshed
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
     * @see DashboardInfo.Fields#lastRefreshed
     */
    public DashboardInfo setLastRefreshed(
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
     * @see DashboardInfo.Fields#lastRefreshed
     */
    public DashboardInfo setLastRefreshed(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastRefreshed of com.linkedin.dashboard.DashboardInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
            _lastRefreshedField = value;
        }
        return this;
    }

    /**
     * Setter for lastRefreshed
     * 
     * @see DashboardInfo.Fields#lastRefreshed
     */
    public DashboardInfo setLastRefreshed(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastRefreshed", DataTemplateUtil.coerceLongInput(value));
        _lastRefreshedField = value;
        return this;
    }

    @Override
    public DashboardInfo clone()
        throws CloneNotSupportedException
    {
        DashboardInfo __clone = ((DashboardInfo) super.clone());
        __clone.__changeListener = new DashboardInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DashboardInfo copy()
        throws CloneNotSupportedException
    {
        DashboardInfo __copy = ((DashboardInfo) super.copy());
        __copy._externalUrlField = null;
        __copy._chartEdgesField = null;
        __copy._lastRefreshedField = null;
        __copy._chartsField = null;
        __copy._dashboardUrlField = null;
        __copy._accessField = null;
        __copy._descriptionField = null;
        __copy._datasetsField = null;
        __copy._titleField = null;
        __copy._dashboardsField = null;
        __copy._customPropertiesField = null;
        __copy._datasetEdgesField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new DashboardInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DashboardInfo __objectRef;

        private ChangeListener(DashboardInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "chartEdges":
                    __objectRef._chartEdgesField = null;
                    break;
                case "lastRefreshed":
                    __objectRef._lastRefreshedField = null;
                    break;
                case "charts":
                    __objectRef._chartsField = null;
                    break;
                case "dashboardUrl":
                    __objectRef._dashboardUrlField = null;
                    break;
                case "access":
                    __objectRef._accessField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "datasets":
                    __objectRef._datasetsField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "dashboards":
                    __objectRef._dashboardsField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "datasetEdges":
                    __objectRef._datasetEdgesField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
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
         * Title of the dashboard
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Detailed description about the dashboard
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Charts in a dashboard
         * Deprecated! Use chartEdges instead.
         * 
         */
        @Deprecated
        public PathSpec charts() {
            return new PathSpec(getPathComponents(), "charts");
        }

        /**
         * Charts in a dashboard
         * Deprecated! Use chartEdges instead.
         * 
         */
        @Deprecated
        public PathSpec charts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "charts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Charts in a dashboard
         * 
         */
        public com.linkedin.common.EdgeArray.Fields chartEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "chartEdges");
        }

        /**
         * Charts in a dashboard
         * 
         */
        public PathSpec chartEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "chartEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Datasets consumed by a dashboard
         * Deprecated! Use datasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec datasets() {
            return new PathSpec(getPathComponents(), "datasets");
        }

        /**
         * Datasets consumed by a dashboard
         * Deprecated! Use datasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec datasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "datasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public com.linkedin.common.EdgeArray.Fields datasetEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "datasetEdges");
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public PathSpec datasetEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "datasetEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public com.linkedin.common.EdgeArray.Fields dashboards() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "dashboards");
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public PathSpec dashboards(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "dashboards");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Captures information about who created/last modified/deleted this dashboard and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields lastModified() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "lastModified");
        }

        /**
         * URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard
         * 
         */
        public PathSpec dashboardUrl() {
            return new PathSpec(getPathComponents(), "dashboardUrl");
        }

        /**
         * Access level for the dashboard
         * 
         */
        public PathSpec access() {
            return new PathSpec(getPathComponents(), "access");
        }

        /**
         * The time when this dashboard last refreshed
         * 
         */
        public PathSpec lastRefreshed() {
            return new PathSpec(getPathComponents(), "lastRefreshed");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.EdgeArray.ProjectionMask _chartEdgesMask;
        private com.linkedin.common.EdgeArray.ProjectionMask _datasetEdgesMask;
        private com.linkedin.common.EdgeArray.ProjectionMask _dashboardsMask;
        private com.linkedin.common.ChangeAuditStamps.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
        }

        /**
         * Custom property bag.
         * 
         */
        public DashboardInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public DashboardInfo.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Title of the dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Detailed description about the dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Charts in a dashboard
         * Deprecated! Use chartEdges instead.
         * 
         */
        @Deprecated
        public DashboardInfo.ProjectionMask withCharts() {
            getDataMap().put("charts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Charts in a dashboard
         * Deprecated! Use chartEdges instead.
         * 
         */
        @Deprecated
        public DashboardInfo.ProjectionMask withCharts(Integer start, Integer count) {
            getDataMap().put("charts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("charts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("charts").put("$count", count);
            }
            return this;
        }

        /**
         * Charts in a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withChartEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _chartEdgesMask = nestedMask.apply(((_chartEdgesMask == null)?EdgeArray.createMask():_chartEdgesMask));
            getDataMap().put("chartEdges", _chartEdgesMask.getDataMap());
            return this;
        }

        /**
         * Charts in a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withChartEdges() {
            _chartEdgesMask = null;
            getDataMap().put("chartEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Charts in a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withChartEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _chartEdgesMask = nestedMask.apply(((_chartEdgesMask == null)?EdgeArray.createMask():_chartEdgesMask));
            getDataMap().put("chartEdges", _chartEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("chartEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("chartEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Charts in a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withChartEdges(Integer start, Integer count) {
            _chartEdgesMask = null;
            getDataMap().put("chartEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("chartEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("chartEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * Deprecated! Use datasetEdges instead.
         * 
         */
        @Deprecated
        public DashboardInfo.ProjectionMask withDatasets() {
            getDataMap().put("datasets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * Deprecated! Use datasetEdges instead.
         * 
         */
        @Deprecated
        public DashboardInfo.ProjectionMask withDatasets(Integer start, Integer count) {
            getDataMap().put("datasets", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("datasets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("datasets").put("$count", count);
            }
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _datasetEdgesMask = nestedMask.apply(((_datasetEdgesMask == null)?EdgeArray.createMask():_datasetEdgesMask));
            getDataMap().put("datasetEdges", _datasetEdgesMask.getDataMap());
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDatasetEdges() {
            _datasetEdgesMask = null;
            getDataMap().put("datasetEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _datasetEdgesMask = nestedMask.apply(((_datasetEdgesMask == null)?EdgeArray.createMask():_datasetEdgesMask));
            getDataMap().put("datasetEdges", _datasetEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("datasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("datasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Datasets consumed by a dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDatasetEdges(Integer start, Integer count) {
            _datasetEdgesMask = null;
            getDataMap().put("datasetEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("datasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("datasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public DashboardInfo.ProjectionMask withDashboards(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _dashboardsMask = nestedMask.apply(((_dashboardsMask == null)?EdgeArray.createMask():_dashboardsMask));
            getDataMap().put("dashboards", _dashboardsMask.getDataMap());
            return this;
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public DashboardInfo.ProjectionMask withDashboards() {
            _dashboardsMask = null;
            getDataMap().put("dashboards", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public DashboardInfo.ProjectionMask withDashboards(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _dashboardsMask = nestedMask.apply(((_dashboardsMask == null)?EdgeArray.createMask():_dashboardsMask));
            getDataMap().put("dashboards", _dashboardsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("dashboards").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("dashboards").put("$count", count);
            }
            return this;
        }

        /**
         * Dashboards included by this dashboard.
         * Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.
         * 
         * The Edge's sourceUrn should never be set, as it will always be the base dashboard.
         * 
         */
        public DashboardInfo.ProjectionMask withDashboards(Integer start, Integer count) {
            _dashboardsMask = null;
            getDataMap().put("dashboards", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("dashboards").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("dashboards").put("$count", count);
            }
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this dashboard and when
         * 
         */
        public DashboardInfo.ProjectionMask withLastModified(Function<com.linkedin.common.ChangeAuditStamps.ProjectionMask, com.linkedin.common.ChangeAuditStamps.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?ChangeAuditStamps.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this dashboard and when
         * 
         */
        public DashboardInfo.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this dashboard and when
         * 
         */
        public DashboardInfo.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withDashboardUrl() {
            getDataMap().put("dashboardUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Access level for the dashboard
         * 
         */
        public DashboardInfo.ProjectionMask withAccess() {
            getDataMap().put("access", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time when this dashboard last refreshed
         * 
         */
        public DashboardInfo.ProjectionMask withLastRefreshed() {
            getDataMap().put("lastRefreshed", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
