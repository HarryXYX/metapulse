
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Array field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/ArrayType.pdl.")
public class ArrayType
    extends RecordTemplate
{

    private final static ArrayType.Fields _fields = new ArrayType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _nestedTypeField = null;
    private ArrayType.ChangeListener __changeListener = new ArrayType.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NestedType = SCHEMA.getField("nestedType");

    public ArrayType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ArrayType(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ArrayType.Fields fields() {
        return _fields;
    }

    public static ArrayType.ProjectionMask createMask() {
        return new ArrayType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public boolean hasNestedType() {
        if (_nestedTypeField!= null) {
            return true;
        }
        return super._map.containsKey("nestedType");
    }

    /**
     * Remover for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public void removeNestedType() {
        super._map.remove("nestedType");
    }

    /**
     * Getter for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    @Nullable
    public StringArray getNestedType(GetMode mode) {
        return getNestedType();
    }

    /**
     * Getter for nestedType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ArrayType.Fields#nestedType
     */
    @Nullable
    public StringArray getNestedType() {
        if (_nestedTypeField!= null) {
            return _nestedTypeField;
        } else {
            Object __rawValue = super._map.get("nestedType");
            _nestedTypeField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _nestedTypeField;
        }
    }

    /**
     * Setter for nestedType
     * 
     * @see ArrayType.Fields#nestedType
     */
    public ArrayType setNestedType(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNestedType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNestedType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nestedType", value.data());
                    _nestedTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nestedType", value.data());
                    _nestedTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nestedType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ArrayType.Fields#nestedType
     */
    public ArrayType setNestedType(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nestedType of com.linkedin.schema.ArrayType to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nestedType", value.data());
            _nestedTypeField = value;
        }
        return this;
    }

    @Override
    public ArrayType clone()
        throws CloneNotSupportedException
    {
        ArrayType __clone = ((ArrayType) super.clone());
        __clone.__changeListener = new ArrayType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ArrayType copy()
        throws CloneNotSupportedException
    {
        ArrayType __copy = ((ArrayType) super.copy());
        __copy._nestedTypeField = null;
        __copy.__changeListener = new ArrayType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ArrayType __objectRef;

        private ChangeListener(ArrayType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nestedType":
                    __objectRef._nestedTypeField = null;
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
         * List of types this array holds.
         * 
         */
        public PathSpec nestedType() {
            return new PathSpec(getPathComponents(), "nestedType");
        }

        /**
         * List of types this array holds.
         * 
         */
        public PathSpec nestedType(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "nestedType");
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


        ProjectionMask() {
            super(2);
        }

        /**
         * List of types this array holds.
         * 
         */
        public ArrayType.ProjectionMask withNestedType() {
            getDataMap().put("nestedType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of types this array holds.
         * 
         */
        public ArrayType.ProjectionMask withNestedType(Integer start, Integer count) {
            getDataMap().put("nestedType", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("nestedType").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("nestedType").put("$count", count);
            }
            return this;
        }

    }

}
