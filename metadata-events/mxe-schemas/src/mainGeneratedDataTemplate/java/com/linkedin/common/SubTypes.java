
package com.linkedin.common;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Sub Types. Use this aspect to specialize a generic Entity
 * e.g. Making a Dataset also be a View or also be a LookerExplore
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/SubTypes.pdl.")
public class SubTypes
    extends RecordTemplate
{

    private final static SubTypes.Fields _fields = new SubTypes.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Sub Types. Use this aspect to specialize a generic Entity\ne.g. Making a Dataset also be a View or also be a LookerExplore*/@Aspect.name=\"subTypes\"record SubTypes{/**The names of the specific types.\n*/@Searchable.`/*`={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Sub Type\",\"queryByDefault\":false}typeNames:array[string]}", SchemaFormatType.PDL));
    private StringArray _typeNamesField = null;
    private SubTypes.ChangeListener __changeListener = new SubTypes.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TypeNames = SCHEMA.getField("typeNames");

    public SubTypes() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SubTypes(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SubTypes.Fields fields() {
        return _fields;
    }

    public static SubTypes.ProjectionMask createMask() {
        return new SubTypes.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public boolean hasTypeNames() {
        if (_typeNamesField!= null) {
            return true;
        }
        return super._map.containsKey("typeNames");
    }

    /**
     * Remover for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public void removeTypeNames() {
        super._map.remove("typeNames");
    }

    /**
     * Getter for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    @Nullable
    public StringArray getTypeNames(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTypeNames();
            case DEFAULT:
            case NULL:
                if (_typeNamesField!= null) {
                    return _typeNamesField;
                } else {
                    Object __rawValue = super._map.get("typeNames");
                    _typeNamesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _typeNamesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for typeNames
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SubTypes.Fields#typeNames
     */
    @Nonnull
    public StringArray getTypeNames() {
        if (_typeNamesField!= null) {
            return _typeNamesField;
        } else {
            Object __rawValue = super._map.get("typeNames");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("typeNames");
            }
            _typeNamesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _typeNamesField;
        }
    }

    /**
     * Setter for typeNames
     * 
     * @see SubTypes.Fields#typeNames
     */
    public SubTypes setTypeNames(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTypeNames(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field typeNames of com.linkedin.common.SubTypes");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "typeNames", value.data());
                    _typeNamesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTypeNames();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "typeNames", value.data());
                    _typeNamesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "typeNames", value.data());
                    _typeNamesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for typeNames
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SubTypes.Fields#typeNames
     */
    public SubTypes setTypeNames(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field typeNames of com.linkedin.common.SubTypes to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "typeNames", value.data());
            _typeNamesField = value;
        }
        return this;
    }

    @Override
    public SubTypes clone()
        throws CloneNotSupportedException
    {
        SubTypes __clone = ((SubTypes) super.clone());
        __clone.__changeListener = new SubTypes.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SubTypes copy()
        throws CloneNotSupportedException
    {
        SubTypes __copy = ((SubTypes) super.copy());
        __copy._typeNamesField = null;
        __copy.__changeListener = new SubTypes.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SubTypes __objectRef;

        private ChangeListener(SubTypes reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "typeNames":
                    __objectRef._typeNamesField = null;
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
         * The names of the specific types.
         * 
         * 
         */
        public PathSpec typeNames() {
            return new PathSpec(getPathComponents(), "typeNames");
        }

        /**
         * The names of the specific types.
         * 
         * 
         */
        public PathSpec typeNames(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "typeNames");
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
         * The names of the specific types.
         * 
         * 
         */
        public SubTypes.ProjectionMask withTypeNames() {
            getDataMap().put("typeNames", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The names of the specific types.
         * 
         * 
         */
        public SubTypes.ProjectionMask withTypeNames(Integer start, Integer count) {
            getDataMap().put("typeNames", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("typeNames").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("typeNames").put("$count", count);
            }
            return this;
        }

    }

}
