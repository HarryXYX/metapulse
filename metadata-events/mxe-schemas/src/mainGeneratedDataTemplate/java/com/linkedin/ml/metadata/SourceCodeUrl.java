
package com.linkedin.ml.metadata;

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
 * Source Code Url Entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/SourceCodeUrl.pdl.")
public class SourceCodeUrl
    extends RecordTemplate
{

    private final static SourceCodeUrl.Fields _fields = new SourceCodeUrl.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}", SchemaFormatType.PDL));
    private SourceCodeUrlType _typeField = null;
    private com.linkedin.common.url.Url _sourceCodeUrlField = null;
    private SourceCodeUrl.ChangeListener __changeListener = new SourceCodeUrl.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_SourceCodeUrl = SCHEMA.getField("sourceCodeUrl");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public SourceCodeUrl() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SourceCodeUrl(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SourceCodeUrl.Fields fields() {
        return _fields;
    }

    public static SourceCodeUrl.ProjectionMask createMask() {
        return new SourceCodeUrl.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see SourceCodeUrl.Fields#type
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
     * @see SourceCodeUrl.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    @Nullable
    public SourceCodeUrlType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SourceCodeUrlType.class, SourceCodeUrlType.$UNKNOWN);
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
     * @see SourceCodeUrl.Fields#type
     */
    @Nonnull
    public SourceCodeUrlType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SourceCodeUrlType.class, SourceCodeUrlType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see SourceCodeUrl.Fields#type
     */
    public SourceCodeUrl setType(
        @Nullable
        SourceCodeUrlType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.ml.metadata.SourceCodeUrl");
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
     * @see SourceCodeUrl.Fields#type
     */
    public SourceCodeUrl setType(
        @Nonnull
        SourceCodeUrlType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.ml.metadata.SourceCodeUrl to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public boolean hasSourceCodeUrl() {
        if (_sourceCodeUrlField!= null) {
            return true;
        }
        return super._map.containsKey("sourceCodeUrl");
    }

    /**
     * Remover for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public void removeSourceCodeUrl() {
        super._map.remove("sourceCodeUrl");
    }

    /**
     * Getter for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getSourceCodeUrl(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceCodeUrl();
            case DEFAULT:
            case NULL:
                if (_sourceCodeUrlField!= null) {
                    return _sourceCodeUrlField;
                } else {
                    Object __rawValue = super._map.get("sourceCodeUrl");
                    _sourceCodeUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
                    return _sourceCodeUrlField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceCodeUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    @Nonnull
    public com.linkedin.common.url.Url getSourceCodeUrl() {
        if (_sourceCodeUrlField!= null) {
            return _sourceCodeUrlField;
        } else {
            Object __rawValue = super._map.get("sourceCodeUrl");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceCodeUrl");
            }
            _sourceCodeUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _sourceCodeUrlField;
        }
    }

    /**
     * Setter for sourceCodeUrl
     * 
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public SourceCodeUrl setSourceCodeUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceCodeUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceCodeUrl of com.linkedin.ml.metadata.SourceCodeUrl");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCodeUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _sourceCodeUrlField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceCodeUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCodeUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _sourceCodeUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceCodeUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _sourceCodeUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceCodeUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SourceCodeUrl.Fields#sourceCodeUrl
     */
    public SourceCodeUrl setSourceCodeUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceCodeUrl of com.linkedin.ml.metadata.SourceCodeUrl to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceCodeUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _sourceCodeUrlField = value;
        }
        return this;
    }

    @Override
    public SourceCodeUrl clone()
        throws CloneNotSupportedException
    {
        SourceCodeUrl __clone = ((SourceCodeUrl) super.clone());
        __clone.__changeListener = new SourceCodeUrl.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SourceCodeUrl copy()
        throws CloneNotSupportedException
    {
        SourceCodeUrl __copy = ((SourceCodeUrl) super.copy());
        __copy._sourceCodeUrlField = null;
        __copy._typeField = null;
        __copy.__changeListener = new SourceCodeUrl.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SourceCodeUrl __objectRef;

        private ChangeListener(SourceCodeUrl reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceCodeUrl":
                    __objectRef._sourceCodeUrlField = null;
                    break;
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
         * Source Code Url Types
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Source Code Url
         * 
         */
        public PathSpec sourceCodeUrl() {
            return new PathSpec(getPathComponents(), "sourceCodeUrl");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Source Code Url Types
         * 
         */
        public SourceCodeUrl.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source Code Url
         * 
         */
        public SourceCodeUrl.ProjectionMask withSourceCodeUrl() {
            getDataMap().put("sourceCodeUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
