
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.SetMode;


/**
 * Properties associated with a MLFeature editable from the UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/EditableMLFeatureProperties.pdl.")
public class EditableMLFeatureProperties
    extends RecordTemplate
{

    private final static EditableMLFeatureProperties.Fields _fields = new EditableMLFeatureProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature editable from the UI*/@Aspect.name=\"editableMlFeatureProperties\"record EditableMLFeatureProperties{/**Documentation of the MLFeature*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string}", SchemaFormatType.PDL));
    private String _descriptionField = null;
    private EditableMLFeatureProperties.ChangeListener __changeListener = new EditableMLFeatureProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public EditableMLFeatureProperties() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EditableMLFeatureProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableMLFeatureProperties.Fields fields() {
        return _fields;
    }

    public static EditableMLFeatureProperties.ProjectionMask createMask() {
        return new EditableMLFeatureProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableMLFeatureProperties.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see EditableMLFeatureProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EditableMLFeatureProperties.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableMLFeatureProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see EditableMLFeatureProperties.Fields#description
     */
    public EditableMLFeatureProperties setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableMLFeatureProperties.Fields#description
     */
    public EditableMLFeatureProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.EditableMLFeatureProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public EditableMLFeatureProperties clone()
        throws CloneNotSupportedException
    {
        EditableMLFeatureProperties __clone = ((EditableMLFeatureProperties) super.clone());
        __clone.__changeListener = new EditableMLFeatureProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableMLFeatureProperties copy()
        throws CloneNotSupportedException
    {
        EditableMLFeatureProperties __copy = ((EditableMLFeatureProperties) super.copy());
        __copy._descriptionField = null;
        __copy.__changeListener = new EditableMLFeatureProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableMLFeatureProperties __objectRef;

        private ChangeListener(EditableMLFeatureProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "description":
                    __objectRef._descriptionField = null;
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
         * Documentation of the MLFeature
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Documentation of the MLFeature
         * 
         */
        public EditableMLFeatureProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
