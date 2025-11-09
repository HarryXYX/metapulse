
package com.linkedin.container;

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
 * Editable information about an Asset Container as defined on the DataHub Platform
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/container/EditableContainerProperties.pdl.")
public class EditableContainerProperties
    extends RecordTemplate
{

    private final static EditableContainerProperties.Fields _fields = new EditableContainerProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.container/**Editable information about an Asset Container as defined on the DataHub Platform*/@Aspect.name=\"editableContainerProperties\"record EditableContainerProperties{/**Description of the Asset Container as its received on the DataHub Platform*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string}", SchemaFormatType.PDL));
    private String _descriptionField = null;
    private EditableContainerProperties.ChangeListener __changeListener = new EditableContainerProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public EditableContainerProperties() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EditableContainerProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableContainerProperties.Fields fields() {
        return _fields;
    }

    public static EditableContainerProperties.ProjectionMask createMask() {
        return new EditableContainerProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableContainerProperties.Fields#description
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
     * @see EditableContainerProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EditableContainerProperties.Fields#description
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
     * @see EditableContainerProperties.Fields#description
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
     * @see EditableContainerProperties.Fields#description
     */
    public EditableContainerProperties setDescription(
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
     * @see EditableContainerProperties.Fields#description
     */
    public EditableContainerProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.container.EditableContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public EditableContainerProperties clone()
        throws CloneNotSupportedException
    {
        EditableContainerProperties __clone = ((EditableContainerProperties) super.clone());
        __clone.__changeListener = new EditableContainerProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableContainerProperties copy()
        throws CloneNotSupportedException
    {
        EditableContainerProperties __copy = ((EditableContainerProperties) super.copy());
        __copy._descriptionField = null;
        __copy.__changeListener = new EditableContainerProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableContainerProperties __objectRef;

        private ChangeListener(EditableContainerProperties reference) {
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
         * Description of the Asset Container as its received on the DataHub Platform
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
         * Description of the Asset Container as its received on the DataHub Platform
         * 
         */
        public EditableContainerProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
