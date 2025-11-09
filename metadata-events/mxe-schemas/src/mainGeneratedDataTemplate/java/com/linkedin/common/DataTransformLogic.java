
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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


/**
 * Information about a Query against one or more data assets (e.g. Tables or Views).
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/DataTransformLogic.pdl.")
public class DataTransformLogic
    extends RecordTemplate
{

    private final static DataTransformLogic.Fields _fields = new DataTransformLogic.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about a Query against one or more data assets (e.g. Tables or Views).*/@Aspect.name=\"dataTransformLogic\"record DataTransformLogic{/**List of transformations applied*/transforms:array[/**Information about a transformation. It may be a query,*/record DataTransform{/**The data transform may be defined by a query statement*/queryStatement:optional{namespace com.linkedin.query/**A query statement against one or more data assets.*/record QueryStatement{/**The query text*/value:string/**The language of the Query, e.g. SQL.*/language:enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}=\"SQL\"}}}]}", SchemaFormatType.PDL));
    private DataTransformArray _transformsField = null;
    private DataTransformLogic.ChangeListener __changeListener = new DataTransformLogic.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Transforms = SCHEMA.getField("transforms");

    public DataTransformLogic() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataTransformLogic(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataTransformLogic.Fields fields() {
        return _fields;
    }

    public static DataTransformLogic.ProjectionMask createMask() {
        return new DataTransformLogic.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for transforms
     * 
     * @see DataTransformLogic.Fields#transforms
     */
    public boolean hasTransforms() {
        if (_transformsField!= null) {
            return true;
        }
        return super._map.containsKey("transforms");
    }

    /**
     * Remover for transforms
     * 
     * @see DataTransformLogic.Fields#transforms
     */
    public void removeTransforms() {
        super._map.remove("transforms");
    }

    /**
     * Getter for transforms
     * 
     * @see DataTransformLogic.Fields#transforms
     */
    @Nullable
    public DataTransformArray getTransforms(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTransforms();
            case DEFAULT:
            case NULL:
                if (_transformsField!= null) {
                    return _transformsField;
                } else {
                    Object __rawValue = super._map.get("transforms");
                    _transformsField = ((__rawValue == null)?null:new DataTransformArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _transformsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for transforms
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataTransformLogic.Fields#transforms
     */
    @Nonnull
    public DataTransformArray getTransforms() {
        if (_transformsField!= null) {
            return _transformsField;
        } else {
            Object __rawValue = super._map.get("transforms");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("transforms");
            }
            _transformsField = ((__rawValue == null)?null:new DataTransformArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _transformsField;
        }
    }

    /**
     * Setter for transforms
     * 
     * @see DataTransformLogic.Fields#transforms
     */
    public DataTransformLogic setTransforms(
        @Nullable
        DataTransformArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransforms(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field transforms of com.linkedin.common.DataTransformLogic");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transforms", value.data());
                    _transformsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTransforms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transforms", value.data());
                    _transformsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "transforms", value.data());
                    _transformsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for transforms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataTransformLogic.Fields#transforms
     */
    public DataTransformLogic setTransforms(
        @Nonnull
        DataTransformArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transforms of com.linkedin.common.DataTransformLogic to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transforms", value.data());
            _transformsField = value;
        }
        return this;
    }

    @Override
    public DataTransformLogic clone()
        throws CloneNotSupportedException
    {
        DataTransformLogic __clone = ((DataTransformLogic) super.clone());
        __clone.__changeListener = new DataTransformLogic.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataTransformLogic copy()
        throws CloneNotSupportedException
    {
        DataTransformLogic __copy = ((DataTransformLogic) super.copy());
        __copy._transformsField = null;
        __copy.__changeListener = new DataTransformLogic.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataTransformLogic __objectRef;

        private ChangeListener(DataTransformLogic reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "transforms":
                    __objectRef._transformsField = null;
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
         * List of transformations applied
         * 
         */
        public com.linkedin.common.DataTransformArray.Fields transforms() {
            return new com.linkedin.common.DataTransformArray.Fields(getPathComponents(), "transforms");
        }

        /**
         * List of transformations applied
         * 
         */
        public PathSpec transforms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "transforms");
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

        private com.linkedin.common.DataTransformArray.ProjectionMask _transformsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * List of transformations applied
         * 
         */
        public DataTransformLogic.ProjectionMask withTransforms(Function<com.linkedin.common.DataTransformArray.ProjectionMask, com.linkedin.common.DataTransformArray.ProjectionMask> nestedMask) {
            _transformsMask = nestedMask.apply(((_transformsMask == null)?DataTransformArray.createMask():_transformsMask));
            getDataMap().put("transforms", _transformsMask.getDataMap());
            return this;
        }

        /**
         * List of transformations applied
         * 
         */
        public DataTransformLogic.ProjectionMask withTransforms() {
            _transformsMask = null;
            getDataMap().put("transforms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of transformations applied
         * 
         */
        public DataTransformLogic.ProjectionMask withTransforms(Function<com.linkedin.common.DataTransformArray.ProjectionMask, com.linkedin.common.DataTransformArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _transformsMask = nestedMask.apply(((_transformsMask == null)?DataTransformArray.createMask():_transformsMask));
            getDataMap().put("transforms", _transformsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("transforms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("transforms").put("$count", count);
            }
            return this;
        }

        /**
         * List of transformations applied
         * 
         */
        public DataTransformLogic.ProjectionMask withTransforms(Integer start, Integer count) {
            _transformsMask = null;
            getDataMap().put("transforms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("transforms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("transforms").put("$count", count);
            }
            return this;
        }

    }

}
