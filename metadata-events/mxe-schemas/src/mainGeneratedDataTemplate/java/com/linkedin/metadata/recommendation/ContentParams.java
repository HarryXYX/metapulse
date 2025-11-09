
package com.linkedin.metadata.recommendation;

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
 * Params about the recommended content
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/ContentParams.pdl.")
public class ContentParams
    extends RecordTemplate
{

    private final static ContentParams.Fields _fields = new ContentParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}", SchemaFormatType.PDL));
    private Long _countField = null;
    private ContentParams.ChangeListener __changeListener = new ContentParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public ContentParams() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ContentParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ContentParams.Fields fields() {
        return _fields;
    }

    public static ContentParams.ProjectionMask createMask() {
        return new ContentParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for count
     * 
     * @see ContentParams.Fields#count
     */
    public boolean hasCount() {
        if (_countField!= null) {
            return true;
        }
        return super._map.containsKey("count");
    }

    /**
     * Remover for count
     * 
     * @see ContentParams.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see ContentParams.Fields#count
     */
    @Nullable
    public Long getCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCount();
            case DEFAULT:
            case NULL:
                if (_countField!= null) {
                    return _countField;
                } else {
                    Object __rawValue = super._map.get("count");
                    _countField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _countField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ContentParams.Fields#count
     */
    @Nonnull
    public Long getCount() {
        if (_countField!= null) {
            return _countField;
        } else {
            Object __rawValue = super._map.get("count");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("count");
            }
            _countField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _countField;
        }
    }

    /**
     * Setter for count
     * 
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.metadata.recommendation.ContentParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
                    _countField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
                    _countField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
                    _countField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.metadata.recommendation.ContentParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see ContentParams.Fields#count
     */
    public ContentParams setCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
        _countField = value;
        return this;
    }

    @Override
    public ContentParams clone()
        throws CloneNotSupportedException
    {
        ContentParams __clone = ((ContentParams) super.clone());
        __clone.__changeListener = new ContentParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ContentParams copy()
        throws CloneNotSupportedException
    {
        ContentParams __copy = ((ContentParams) super.copy());
        __copy._countField = null;
        __copy.__changeListener = new ContentParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ContentParams __objectRef;

        private ChangeListener(ContentParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "count":
                    __objectRef._countField = null;
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
         * Number of entities corresponding to the recommended content
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Number of entities corresponding to the recommended content
         * 
         */
        public ContentParams.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
