
package com.linkedin.ingestion;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Info about a DataHub ingestion source
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ingestion/DataHubIngestionSourceInfo.pdl.")
public class DataHubIngestionSourceInfo
    extends RecordTemplate
{

    private final static DataHubIngestionSourceInfo.Fields _fields = new DataHubIngestionSourceInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ingestion/**Info about a DataHub ingestion source*/@Aspect.name=\"dataHubIngestionSourceInfo\"record DataHubIngestionSourceInfo{/**The display name of the ingestion source*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}type:string/**Data Platform URN associated with the source*/platform:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The schedule on which the ingestion source is executed*/schedule:optional/**The schedule associated with an ingestion source.*/record DataHubIngestionSourceSchedule{/**A cron-formatted execution interval, as a cron string, e.g. * * * * **/interval:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string}/**Parameters associated with the Ingestion Source*/config:record DataHubIngestionSourceConfig{/**The JSON recipe to use for ingestion*/recipe:string/**The PyPI version of the datahub CLI to use when executing a recipe*/version:optional string/**The id of the executor to use to execute the ingestion run*/@Searchable={\"fieldName\":\"sourceExecutorId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}executorId:optional string/**Whether or not to run this ingestion source in debug mode*/debugMode:optional boolean/**Extra arguments for the ingestion run.*/extraArgs:optional map[string,string]}/**The source or origin of the Ingestion Source\n\nCurrently CLI and UI do not provide an explicit source.*/source:optional record DataHubIngestionSourceSource{/**The source type of the ingestion source*/@Searchable={\"fieldName\":\"sourceType\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}type:enum DataHubIngestionSourceSourceType{/**A system internal source, e.g. for running search indexing operations, feature computation, etc.*/SYSTEM}}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _typeField = null;
    private com.linkedin.common.urn.Urn _platformField = null;
    private DataHubIngestionSourceSchedule _scheduleField = null;
    private DataHubIngestionSourceConfig _configField = null;
    private DataHubIngestionSourceSource _sourceField = null;
    private DataHubIngestionSourceInfo.ChangeListener __changeListener = new DataHubIngestionSourceInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Schedule = SCHEMA.getField("schedule");
    private final static RecordDataSchema.Field FIELD_Config = SCHEMA.getField("config");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataHubIngestionSourceInfo() {
        super(new DataMap(8, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DataHubIngestionSourceInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubIngestionSourceInfo.Fields fields() {
        return _fields;
    }

    public static DataHubIngestionSourceInfo.ProjectionMask createMask() {
        return new DataHubIngestionSourceInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubIngestionSourceInfo.Fields#name
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
     * @see DataHubIngestionSourceInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubIngestionSourceInfo.Fields#name
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
     * @see DataHubIngestionSourceInfo.Fields#name
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
     * @see DataHubIngestionSourceInfo.Fields#name
     */
    public DataHubIngestionSourceInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.ingestion.DataHubIngestionSourceInfo");
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
     * @see DataHubIngestionSourceInfo.Fields#name
     */
    public DataHubIngestionSourceInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubIngestionSourceInfo.Fields#type
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
     * @see DataHubIngestionSourceInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubIngestionSourceInfo.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see DataHubIngestionSourceInfo.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubIngestionSourceInfo.Fields#type
     */
    public DataHubIngestionSourceInfo setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.ingestion.DataHubIngestionSourceInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
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
     * @see DataHubIngestionSourceInfo.Fields#type
     */
    public DataHubIngestionSourceInfo setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    public boolean hasPlatform() {
        if (_platformField!= null) {
            return true;
        }
        return super._map.containsKey("platform");
    }

    /**
     * Remover for platform
     * 
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        return getPlatform();
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    public DataHubIngestionSourceInfo setPlatform(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceInfo.Fields#platform
     */
    public DataHubIngestionSourceInfo setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for schedule
     * 
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    public boolean hasSchedule() {
        if (_scheduleField!= null) {
            return true;
        }
        return super._map.containsKey("schedule");
    }

    /**
     * Remover for schedule
     * 
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    public void removeSchedule() {
        super._map.remove("schedule");
    }

    /**
     * Getter for schedule
     * 
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    @Nullable
    public DataHubIngestionSourceSchedule getSchedule(GetMode mode) {
        return getSchedule();
    }

    /**
     * Getter for schedule
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    @Nullable
    public DataHubIngestionSourceSchedule getSchedule() {
        if (_scheduleField!= null) {
            return _scheduleField;
        } else {
            Object __rawValue = super._map.get("schedule");
            _scheduleField = ((__rawValue == null)?null:new DataHubIngestionSourceSchedule(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _scheduleField;
        }
    }

    /**
     * Setter for schedule
     * 
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    public DataHubIngestionSourceInfo setSchedule(
        @Nullable
        DataHubIngestionSourceSchedule value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchedule(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchedule();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
                    _scheduleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
                    _scheduleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schedule
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceInfo.Fields#schedule
     */
    public DataHubIngestionSourceInfo setSchedule(
        @Nonnull
        DataHubIngestionSourceSchedule value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schedule of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
            _scheduleField = value;
        }
        return this;
    }

    /**
     * Existence checker for config
     * 
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    public boolean hasConfig() {
        if (_configField!= null) {
            return true;
        }
        return super._map.containsKey("config");
    }

    /**
     * Remover for config
     * 
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    public void removeConfig() {
        super._map.remove("config");
    }

    /**
     * Getter for config
     * 
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    @Nullable
    public DataHubIngestionSourceConfig getConfig(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getConfig();
            case DEFAULT:
            case NULL:
                if (_configField!= null) {
                    return _configField;
                } else {
                    Object __rawValue = super._map.get("config");
                    _configField = ((__rawValue == null)?null:new DataHubIngestionSourceConfig(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _configField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for config
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    @Nonnull
    public DataHubIngestionSourceConfig getConfig() {
        if (_configField!= null) {
            return _configField;
        } else {
            Object __rawValue = super._map.get("config");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("config");
            }
            _configField = ((__rawValue == null)?null:new DataHubIngestionSourceConfig(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _configField;
        }
    }

    /**
     * Setter for config
     * 
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    public DataHubIngestionSourceInfo setConfig(
        @Nullable
        DataHubIngestionSourceConfig value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setConfig(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field config of com.linkedin.ingestion.DataHubIngestionSourceInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "config", value.data());
                    _configField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeConfig();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "config", value.data());
                    _configField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "config", value.data());
                    _configField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for config
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceInfo.Fields#config
     */
    public DataHubIngestionSourceInfo setConfig(
        @Nonnull
        DataHubIngestionSourceConfig value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field config of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "config", value.data());
            _configField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see DataHubIngestionSourceInfo.Fields#source
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
     * @see DataHubIngestionSourceInfo.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see DataHubIngestionSourceInfo.Fields#source
     */
    @Nullable
    public DataHubIngestionSourceSource getSource(GetMode mode) {
        return getSource();
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceInfo.Fields#source
     */
    @Nullable
    public DataHubIngestionSourceSource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            _sourceField = ((__rawValue == null)?null:new DataHubIngestionSourceSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see DataHubIngestionSourceInfo.Fields#source
     */
    public DataHubIngestionSourceInfo setSource(
        @Nullable
        DataHubIngestionSourceSource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
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
     * @see DataHubIngestionSourceInfo.Fields#source
     */
    public DataHubIngestionSourceInfo setSource(
        @Nonnull
        DataHubIngestionSourceSource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.ingestion.DataHubIngestionSourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.data());
            _sourceField = value;
        }
        return this;
    }

    @Override
    public DataHubIngestionSourceInfo clone()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceInfo __clone = ((DataHubIngestionSourceInfo) super.clone());
        __clone.__changeListener = new DataHubIngestionSourceInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubIngestionSourceInfo copy()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceInfo __copy = ((DataHubIngestionSourceInfo) super.copy());
        __copy._scheduleField = null;
        __copy._nameField = null;
        __copy._sourceField = null;
        __copy._typeField = null;
        __copy._configField = null;
        __copy._platformField = null;
        __copy.__changeListener = new DataHubIngestionSourceInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubIngestionSourceInfo __objectRef;

        private ChangeListener(DataHubIngestionSourceInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schedule":
                    __objectRef._scheduleField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "config":
                    __objectRef._configField = null;
                    break;
                case "platform":
                    __objectRef._platformField = null;
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
         * The display name of the ingestion source
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Data Platform URN associated with the source
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * The schedule on which the ingestion source is executed
         * 
         */
        public com.linkedin.ingestion.DataHubIngestionSourceSchedule.Fields schedule() {
            return new com.linkedin.ingestion.DataHubIngestionSourceSchedule.Fields(getPathComponents(), "schedule");
        }

        /**
         * Parameters associated with the Ingestion Source
         * 
         */
        public com.linkedin.ingestion.DataHubIngestionSourceConfig.Fields config() {
            return new com.linkedin.ingestion.DataHubIngestionSourceConfig.Fields(getPathComponents(), "config");
        }

        /**
         * The source or origin of the Ingestion Source
         * 
         * Currently CLI and UI do not provide an explicit source.
         * 
         */
        public com.linkedin.ingestion.DataHubIngestionSourceSource.Fields source() {
            return new com.linkedin.ingestion.DataHubIngestionSourceSource.Fields(getPathComponents(), "source");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ingestion.DataHubIngestionSourceSchedule.ProjectionMask _scheduleMask;
        private com.linkedin.ingestion.DataHubIngestionSourceConfig.ProjectionMask _configMask;
        private com.linkedin.ingestion.DataHubIngestionSourceSource.ProjectionMask _sourceMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The display name of the ingestion source
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Data Platform URN associated with the source
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The schedule on which the ingestion source is executed
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withSchedule(Function<com.linkedin.ingestion.DataHubIngestionSourceSchedule.ProjectionMask, com.linkedin.ingestion.DataHubIngestionSourceSchedule.ProjectionMask> nestedMask) {
            _scheduleMask = nestedMask.apply(((_scheduleMask == null)?DataHubIngestionSourceSchedule.createMask():_scheduleMask));
            getDataMap().put("schedule", _scheduleMask.getDataMap());
            return this;
        }

        /**
         * The schedule on which the ingestion source is executed
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withSchedule() {
            _scheduleMask = null;
            getDataMap().put("schedule", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Parameters associated with the Ingestion Source
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withConfig(Function<com.linkedin.ingestion.DataHubIngestionSourceConfig.ProjectionMask, com.linkedin.ingestion.DataHubIngestionSourceConfig.ProjectionMask> nestedMask) {
            _configMask = nestedMask.apply(((_configMask == null)?DataHubIngestionSourceConfig.createMask():_configMask));
            getDataMap().put("config", _configMask.getDataMap());
            return this;
        }

        /**
         * Parameters associated with the Ingestion Source
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withConfig() {
            _configMask = null;
            getDataMap().put("config", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The source or origin of the Ingestion Source
         * 
         * Currently CLI and UI do not provide an explicit source.
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withSource(Function<com.linkedin.ingestion.DataHubIngestionSourceSource.ProjectionMask, com.linkedin.ingestion.DataHubIngestionSourceSource.ProjectionMask> nestedMask) {
            _sourceMask = nestedMask.apply(((_sourceMask == null)?DataHubIngestionSourceSource.createMask():_sourceMask));
            getDataMap().put("source", _sourceMask.getDataMap());
            return this;
        }

        /**
         * The source or origin of the Ingestion Source
         * 
         * Currently CLI and UI do not provide an explicit source.
         * 
         */
        public DataHubIngestionSourceInfo.ProjectionMask withSource() {
            _sourceMask = null;
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
