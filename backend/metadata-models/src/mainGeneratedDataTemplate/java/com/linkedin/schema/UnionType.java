
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
 * Union field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/UnionType.pdl.")
public class UnionType
    extends RecordTemplate
{

    private final static UnionType.Fields _fields = new UnionType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _nestedTypesField = null;
    private UnionType.ChangeListener __changeListener = new UnionType.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NestedTypes = SCHEMA.getField("nestedTypes");

    public UnionType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public UnionType(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionType.Fields fields() {
        return _fields;
    }

    public static UnionType.ProjectionMask createMask() {
        return new UnionType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public boolean hasNestedTypes() {
        if (_nestedTypesField!= null) {
            return true;
        }
        return super._map.containsKey("nestedTypes");
    }

    /**
     * Remover for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public void removeNestedTypes() {
        super._map.remove("nestedTypes");
    }

    /**
     * Getter for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    @Nullable
    public StringArray getNestedTypes(GetMode mode) {
        return getNestedTypes();
    }

    /**
     * Getter for nestedTypes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UnionType.Fields#nestedTypes
     */
    @Nullable
    public StringArray getNestedTypes() {
        if (_nestedTypesField!= null) {
            return _nestedTypesField;
        } else {
            Object __rawValue = super._map.get("nestedTypes");
            _nestedTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _nestedTypesField;
        }
    }

    /**
     * Setter for nestedTypes
     * 
     * @see UnionType.Fields#nestedTypes
     */
    public UnionType setNestedTypes(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNestedTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNestedTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nestedTypes", value.data());
                    _nestedTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nestedTypes", value.data());
                    _nestedTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nestedTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UnionType.Fields#nestedTypes
     */
    public UnionType setNestedTypes(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nestedTypes of com.linkedin.schema.UnionType to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nestedTypes", value.data());
            _nestedTypesField = value;
        }
        return this;
    }

    @Override
    public UnionType clone()
        throws CloneNotSupportedException
    {
        UnionType __clone = ((UnionType) super.clone());
        __clone.__changeListener = new UnionType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UnionType copy()
        throws CloneNotSupportedException
    {
        UnionType __copy = ((UnionType) super.copy());
        __copy._nestedTypesField = null;
        __copy.__changeListener = new UnionType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UnionType __objectRef;

        private ChangeListener(UnionType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nestedTypes":
                    __objectRef._nestedTypesField = null;
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
         * List of types in union type.
         * 
         */
        public PathSpec nestedTypes() {
            return new PathSpec(getPathComponents(), "nestedTypes");
        }

        /**
         * List of types in union type.
         * 
         */
        public PathSpec nestedTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "nestedTypes");
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
         * List of types in union type.
         * 
         */
        public UnionType.ProjectionMask withNestedTypes() {
            getDataMap().put("nestedTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of types in union type.
         * 
         */
        public UnionType.ProjectionMask withNestedTypes(Integer start, Integer count) {
            getDataMap().put("nestedTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("nestedTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("nestedTypes").put("$count", count);
            }
            return this;
        }

    }

}
