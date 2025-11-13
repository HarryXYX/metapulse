
package com.linkedin.ingestion;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ingestion/DataHubIngestionSourceInfo.pdl.")
public class DataHubIngestionSourceSource
    extends RecordTemplate
{

    private final static DataHubIngestionSourceSource.Fields _fields = new DataHubIngestionSourceSource.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ingestion,record DataHubIngestionSourceSource{/**The source type of the ingestion source*/@Searchable={\"fieldName\":\"sourceType\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}type:enum DataHubIngestionSourceSourceType{/**A system internal source, e.g. for running search indexing operations, feature computation, etc.*/SYSTEM}}", SchemaFormatType.PDL));
    private DataHubIngestionSourceSourceType _typeField = null;
    private DataHubIngestionSourceSource.ChangeListener __changeListener = new DataHubIngestionSourceSource.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public DataHubIngestionSourceSource() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubIngestionSourceSource(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubIngestionSourceSource.Fields fields() {
        return _fields;
    }

    public static DataHubIngestionSourceSource.ProjectionMask createMask() {
        return new DataHubIngestionSourceSource.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubIngestionSourceSource.Fields#type
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
     * @see DataHubIngestionSourceSource.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubIngestionSourceSource.Fields#type
     */
    @Nullable
    public DataHubIngestionSourceSourceType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubIngestionSourceSourceType.class, DataHubIngestionSourceSourceType.$UNKNOWN);
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
     * @see DataHubIngestionSourceSource.Fields#type
     */
    @Nonnull
    public DataHubIngestionSourceSourceType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubIngestionSourceSourceType.class, DataHubIngestionSourceSourceType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubIngestionSourceSource.Fields#type
     */
    public DataHubIngestionSourceSource setType(
        @Nullable
        DataHubIngestionSourceSourceType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.ingestion.DataHubIngestionSourceSource");
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
     * @see DataHubIngestionSourceSource.Fields#type
     */
    public DataHubIngestionSourceSource setType(
        @Nonnull
        DataHubIngestionSourceSourceType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.ingestion.DataHubIngestionSourceSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    @Override
    public DataHubIngestionSourceSource clone()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceSource __clone = ((DataHubIngestionSourceSource) super.clone());
        __clone.__changeListener = new DataHubIngestionSourceSource.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubIngestionSourceSource copy()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceSource __copy = ((DataHubIngestionSourceSource) super.copy());
        __copy._typeField = null;
        __copy.__changeListener = new DataHubIngestionSourceSource.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubIngestionSourceSource __objectRef;

        private ChangeListener(DataHubIngestionSourceSource reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
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
         * The source type of the ingestion source
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The source type of the ingestion source
         * 
         */
        public DataHubIngestionSourceSource.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
