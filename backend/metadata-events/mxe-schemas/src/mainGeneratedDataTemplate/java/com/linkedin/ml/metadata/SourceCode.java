
package com.linkedin.ml.metadata;

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
 * Source Code
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/SourceCode.pdl.")
public class SourceCode
    extends RecordTemplate
{

    private final static SourceCode.Fields _fields = new SourceCode.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}]}", SchemaFormatType.PDL));
    private SourceCodeUrlArray _sourceCodeField = null;
    private SourceCode.ChangeListener __changeListener = new SourceCode.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SourceCode = SCHEMA.getField("sourceCode");

    public SourceCode() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SourceCode(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SourceCode.Fields fields() {
        return _fields;
    }

    public static SourceCode.ProjectionMask createMask() {
        return new SourceCode.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public boolean hasSourceCode() {
        if (_sourceCodeField!= null) {
            return true;
        }
        return super._map.containsKey("sourceCode");
    }

    /**
     * Remover for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public void removeSourceCode() {
        super._map.remove("sourceCode");
    }

    /**
     * Getter for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    @Nullable
    public SourceCodeUrlArray getSourceCode(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceCode();
            case DEFAULT:
            case NULL:
                if (_sourceCodeField!= null) {
                    return _sourceCodeField;
                } else {
                    Object __rawValue = super._map.get("sourceCode");
                    _sourceCodeField = ((__rawValue == null)?null:new SourceCodeUrlArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _sourceCodeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceCode
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SourceCode.Fields#sourceCode
     */
    @Nonnull
    public SourceCodeUrlArray getSourceCode() {
        if (_sourceCodeField!= null) {
            return _sourceCodeField;
        } else {
            Object __rawValue = super._map.get("sourceCode");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceCode");
            }
            _sourceCodeField = ((__rawValue == null)?null:new SourceCodeUrlArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sourceCodeField;
        }
    }

    /**
     * Setter for sourceCode
     * 
     * @see SourceCode.Fields#sourceCode
     */
    public SourceCode setSourceCode(
        @Nullable
        SourceCodeUrlArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceCode(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceCode of com.linkedin.ml.metadata.SourceCode");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCode", value.data());
                    _sourceCodeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceCode();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCode", value.data());
                    _sourceCodeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCode", value.data());
                    _sourceCodeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceCode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SourceCode.Fields#sourceCode
     */
    public SourceCode setSourceCode(
        @Nonnull
        SourceCodeUrlArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceCode of com.linkedin.ml.metadata.SourceCode to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceCode", value.data());
            _sourceCodeField = value;
        }
        return this;
    }

    @Override
    public SourceCode clone()
        throws CloneNotSupportedException
    {
        SourceCode __clone = ((SourceCode) super.clone());
        __clone.__changeListener = new SourceCode.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SourceCode copy()
        throws CloneNotSupportedException
    {
        SourceCode __copy = ((SourceCode) super.copy());
        __copy._sourceCodeField = null;
        __copy.__changeListener = new SourceCode.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SourceCode __objectRef;

        private ChangeListener(SourceCode reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceCode":
                    __objectRef._sourceCodeField = null;
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
         * Source Code along with types
         * 
         */
        public com.linkedin.ml.metadata.SourceCodeUrlArray.Fields sourceCode() {
            return new com.linkedin.ml.metadata.SourceCodeUrlArray.Fields(getPathComponents(), "sourceCode");
        }

        /**
         * Source Code along with types
         * 
         */
        public PathSpec sourceCode(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceCode");
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

        private com.linkedin.ml.metadata.SourceCodeUrlArray.ProjectionMask _sourceCodeMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Source Code along with types
         * 
         */
        public SourceCode.ProjectionMask withSourceCode(Function<com.linkedin.ml.metadata.SourceCodeUrlArray.ProjectionMask, com.linkedin.ml.metadata.SourceCodeUrlArray.ProjectionMask> nestedMask) {
            _sourceCodeMask = nestedMask.apply(((_sourceCodeMask == null)?SourceCodeUrlArray.createMask():_sourceCodeMask));
            getDataMap().put("sourceCode", _sourceCodeMask.getDataMap());
            return this;
        }

        /**
         * Source Code along with types
         * 
         */
        public SourceCode.ProjectionMask withSourceCode() {
            _sourceCodeMask = null;
            getDataMap().put("sourceCode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source Code along with types
         * 
         */
        public SourceCode.ProjectionMask withSourceCode(Function<com.linkedin.ml.metadata.SourceCodeUrlArray.ProjectionMask, com.linkedin.ml.metadata.SourceCodeUrlArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _sourceCodeMask = nestedMask.apply(((_sourceCodeMask == null)?SourceCodeUrlArray.createMask():_sourceCodeMask));
            getDataMap().put("sourceCode", _sourceCodeMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("sourceCode").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sourceCode").put("$count", count);
            }
            return this;
        }

        /**
         * Source Code along with types
         * 
         */
        public SourceCode.ProjectionMask withSourceCode(Integer start, Integer count) {
            _sourceCodeMask = null;
            getDataMap().put("sourceCode", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sourceCode").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sourceCode").put("$count", count);
            }
            return this;
        }

    }

}
