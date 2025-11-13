
package com.linkedin.metadata.query;

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
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The model for map metadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/MapMetadata.pdl.")
public class MapMetadata
    extends RecordTemplate
{

    private final static MapMetadata.Fields _fields = new MapMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The model for map metadata*/record MapMetadata{/**Map for string keys to long values*/longMap:map[string,long]}", SchemaFormatType.PDL));
    private LongMap _longMapField = null;
    private MapMetadata.ChangeListener __changeListener = new MapMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_LongMap = SCHEMA.getField("longMap");

    public MapMetadata() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public MapMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MapMetadata.Fields fields() {
        return _fields;
    }

    public static MapMetadata.ProjectionMask createMask() {
        return new MapMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for longMap
     * 
     * @see MapMetadata.Fields#longMap
     */
    public boolean hasLongMap() {
        if (_longMapField!= null) {
            return true;
        }
        return super._map.containsKey("longMap");
    }

    /**
     * Remover for longMap
     * 
     * @see MapMetadata.Fields#longMap
     */
    public void removeLongMap() {
        super._map.remove("longMap");
    }

    /**
     * Getter for longMap
     * 
     * @see MapMetadata.Fields#longMap
     */
    @Nullable
    public LongMap getLongMap(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLongMap();
            case DEFAULT:
            case NULL:
                if (_longMapField!= null) {
                    return _longMapField;
                } else {
                    Object __rawValue = super._map.get("longMap");
                    _longMapField = ((__rawValue == null)?null:new LongMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _longMapField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for longMap
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MapMetadata.Fields#longMap
     */
    @Nonnull
    public LongMap getLongMap() {
        if (_longMapField!= null) {
            return _longMapField;
        } else {
            Object __rawValue = super._map.get("longMap");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("longMap");
            }
            _longMapField = ((__rawValue == null)?null:new LongMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _longMapField;
        }
    }

    /**
     * Setter for longMap
     * 
     * @see MapMetadata.Fields#longMap
     */
    public MapMetadata setLongMap(
        @Nullable
        LongMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLongMap(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field longMap of com.linkedin.metadata.query.MapMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "longMap", value.data());
                    _longMapField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLongMap();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "longMap", value.data());
                    _longMapField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "longMap", value.data());
                    _longMapField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for longMap
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MapMetadata.Fields#longMap
     */
    public MapMetadata setLongMap(
        @Nonnull
        LongMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field longMap of com.linkedin.metadata.query.MapMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "longMap", value.data());
            _longMapField = value;
        }
        return this;
    }

    @Override
    public MapMetadata clone()
        throws CloneNotSupportedException
    {
        MapMetadata __clone = ((MapMetadata) super.clone());
        __clone.__changeListener = new MapMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MapMetadata copy()
        throws CloneNotSupportedException
    {
        MapMetadata __copy = ((MapMetadata) super.copy());
        __copy._longMapField = null;
        __copy.__changeListener = new MapMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MapMetadata __objectRef;

        private ChangeListener(MapMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "longMap":
                    __objectRef._longMapField = null;
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
         * Map for string keys to long values
         * 
         */
        public PathSpec longMap() {
            return new PathSpec(getPathComponents(), "longMap");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Map for string keys to long values
         * 
         */
        public MapMetadata.ProjectionMask withLongMap() {
            getDataMap().put("longMap", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
