
package com.linkedin.dataplatform;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
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


/**
 * Information about a data platform
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataplatform/DataPlatformInfo.pdl.")
public class DataPlatformInfo
    extends RecordTemplate
{

    private final static DataPlatformInfo.Fields _fields = new DataPlatformInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _displayNameField = null;
    private PlatformType _typeField = null;
    private String _datasetNameDelimiterField = null;
    private com.linkedin.common.url.Url _logoUrlField = null;
    private DataPlatformInfo.ChangeListener __changeListener = new DataPlatformInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_DatasetNameDelimiter = SCHEMA.getField("datasetNameDelimiter");
    private final static RecordDataSchema.Field FIELD_LogoUrl = SCHEMA.getField("logoUrl");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public DataPlatformInfo() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataPlatformInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataPlatformInfo.Fields fields() {
        return _fields;
    }

    public static DataPlatformInfo.ProjectionMask createMask() {
        return new DataPlatformInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataPlatformInfo.Fields#name
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
     * @see DataPlatformInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataPlatformInfo.Fields#name
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
     * @see DataPlatformInfo.Fields#name
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
     * @see DataPlatformInfo.Fields#name
     */
    public DataPlatformInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.dataplatform.DataPlatformInfo");
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
     * @see DataPlatformInfo.Fields#name
     */
    public DataPlatformInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.dataplatform.DataPlatformInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public DataPlatformInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#displayName
     */
    public DataPlatformInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.dataplatform.DataPlatformInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataPlatformInfo.Fields#type
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
     * @see DataPlatformInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    @Nullable
    public PlatformType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PlatformType.class, PlatformType.$UNKNOWN);
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
     * @see DataPlatformInfo.Fields#type
     */
    @Nonnull
    public PlatformType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PlatformType.class, PlatformType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    public DataPlatformInfo setType(
        @Nullable
        PlatformType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.dataplatform.DataPlatformInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
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
     * @see DataPlatformInfo.Fields#type
     */
    public DataPlatformInfo setType(
        @Nonnull
        PlatformType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.dataplatform.DataPlatformInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public boolean hasDatasetNameDelimiter() {
        if (_datasetNameDelimiterField!= null) {
            return true;
        }
        return super._map.containsKey("datasetNameDelimiter");
    }

    /**
     * Remover for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public void removeDatasetNameDelimiter() {
        super._map.remove("datasetNameDelimiter");
    }

    /**
     * Getter for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    @Nullable
    public String getDatasetNameDelimiter(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDatasetNameDelimiter();
            case DEFAULT:
            case NULL:
                if (_datasetNameDelimiterField!= null) {
                    return _datasetNameDelimiterField;
                } else {
                    Object __rawValue = super._map.get("datasetNameDelimiter");
                    _datasetNameDelimiterField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _datasetNameDelimiterField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for datasetNameDelimiter
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    @Nonnull
    public String getDatasetNameDelimiter() {
        if (_datasetNameDelimiterField!= null) {
            return _datasetNameDelimiterField;
        } else {
            Object __rawValue = super._map.get("datasetNameDelimiter");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("datasetNameDelimiter");
            }
            _datasetNameDelimiterField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _datasetNameDelimiterField;
        }
    }

    /**
     * Setter for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public DataPlatformInfo setDatasetNameDelimiter(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDatasetNameDelimiter(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field datasetNameDelimiter of com.linkedin.dataplatform.DataPlatformInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasetNameDelimiter", value);
                    _datasetNameDelimiterField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDatasetNameDelimiter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasetNameDelimiter", value);
                    _datasetNameDelimiterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "datasetNameDelimiter", value);
                    _datasetNameDelimiterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for datasetNameDelimiter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public DataPlatformInfo setDatasetNameDelimiter(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field datasetNameDelimiter of com.linkedin.dataplatform.DataPlatformInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "datasetNameDelimiter", value);
            _datasetNameDelimiterField = value;
        }
        return this;
    }

    /**
     * Existence checker for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public boolean hasLogoUrl() {
        if (_logoUrlField!= null) {
            return true;
        }
        return super._map.containsKey("logoUrl");
    }

    /**
     * Remover for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public void removeLogoUrl() {
        super._map.remove("logoUrl");
    }

    /**
     * Getter for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getLogoUrl(GetMode mode) {
        return getLogoUrl();
    }

    /**
     * Getter for logoUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInfo.Fields#logoUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getLogoUrl() {
        if (_logoUrlField!= null) {
            return _logoUrlField;
        } else {
            Object __rawValue = super._map.get("logoUrl");
            _logoUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _logoUrlField;
        }
    }

    /**
     * Setter for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public DataPlatformInfo setLogoUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLogoUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLogoUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "logoUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _logoUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "logoUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _logoUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for logoUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public DataPlatformInfo setLogoUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field logoUrl of com.linkedin.dataplatform.DataPlatformInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "logoUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _logoUrlField = value;
        }
        return this;
    }

    @Override
    public DataPlatformInfo clone()
        throws CloneNotSupportedException
    {
        DataPlatformInfo __clone = ((DataPlatformInfo) super.clone());
        __clone.__changeListener = new DataPlatformInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformInfo copy()
        throws CloneNotSupportedException
    {
        DataPlatformInfo __copy = ((DataPlatformInfo) super.copy());
        __copy._displayNameField = null;
        __copy._nameField = null;
        __copy._datasetNameDelimiterField = null;
        __copy._typeField = null;
        __copy._logoUrlField = null;
        __copy.__changeListener = new DataPlatformInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformInfo __objectRef;

        private ChangeListener(DataPlatformInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "datasetNameDelimiter":
                    __objectRef._datasetNameDelimiterField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "logoUrl":
                    __objectRef._logoUrlField = null;
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
         * Name of the data platform
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The name that will be used for displaying a platform type.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * Platform type this data platform describes
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle
         * 
         */
        public PathSpec datasetNameDelimiter() {
            return new PathSpec(getPathComponents(), "datasetNameDelimiter");
        }

        /**
         * The URL for a logo associated with the platform
         * 
         */
        public PathSpec logoUrl() {
            return new PathSpec(getPathComponents(), "logoUrl");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * Name of the data platform
         * 
         */
        public DataPlatformInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The name that will be used for displaying a platform type.
         * 
         */
        public DataPlatformInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Platform type this data platform describes
         * 
         */
        public DataPlatformInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle
         * 
         */
        public DataPlatformInfo.ProjectionMask withDatasetNameDelimiter() {
            getDataMap().put("datasetNameDelimiter", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The URL for a logo associated with the platform
         * 
         */
        public DataPlatformInfo.ProjectionMask withLogoUrl() {
            getDataMap().put("logoUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
