
package com.linkedin.policy;

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
 * Information about a DataHub Role.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/DataHubRoleInfo.pdl.")
public class DataHubRoleInfo
    extends RecordTemplate
{

    private final static DataHubRoleInfo.Fields _fields = new DataHubRoleInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information about a DataHub Role.*/@Aspect.name=\"dataHubRoleInfo\"record DataHubRoleInfo{/**Name of the Role*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**Description of the Role*/@Searchable.fieldType=\"TEXT\"description:string/**Whether the role should be editable via the UI*/editable:boolean=false}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _descriptionField = null;
    private Boolean _editableField = null;
    private DataHubRoleInfo.ChangeListener __changeListener = new DataHubRoleInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Editable = SCHEMA.getField("editable");
    private final static Boolean DEFAULT_Editable;

    static {
        DEFAULT_Editable = DataTemplateUtil.coerceBooleanOutput(FIELD_Editable.getDefault());
    }

    public DataHubRoleInfo() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubRoleInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubRoleInfo.Fields fields() {
        return _fields;
    }

    public static DataHubRoleInfo.ProjectionMask createMask() {
        return new DataHubRoleInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubRoleInfo.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see DataHubRoleInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubRoleInfo.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRoleInfo.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see DataHubRoleInfo.Fields#name
     */
    public DataHubRoleInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.policy.DataHubRoleInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubRoleInfo.Fields#name
     */
    public DataHubRoleInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.policy.DataHubRoleInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataHubRoleInfo.Fields#description
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
     * @see DataHubRoleInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataHubRoleInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDescription();
            case DEFAULT:
            case NULL:
                if (_descriptionField!= null) {
                    return _descriptionField;
                } else {
                    Object __rawValue = super._map.get("description");
                    _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _descriptionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRoleInfo.Fields#description
     */
    @Nonnull
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("description");
            }
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see DataHubRoleInfo.Fields#description
     */
    public DataHubRoleInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field description of com.linkedin.policy.DataHubRoleInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
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
     * @see DataHubRoleInfo.Fields#description
     */
    public DataHubRoleInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.policy.DataHubRoleInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for editable
     * 
     * @see DataHubRoleInfo.Fields#editable
     */
    public boolean hasEditable() {
        if (_editableField!= null) {
            return true;
        }
        return super._map.containsKey("editable");
    }

    /**
     * Remover for editable
     * 
     * @see DataHubRoleInfo.Fields#editable
     */
    public void removeEditable() {
        super._map.remove("editable");
    }

    /**
     * Getter for editable
     * 
     * @see DataHubRoleInfo.Fields#editable
     */
    @Nullable
    public Boolean isEditable(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isEditable();
            case NULL:
                if (_editableField!= null) {
                    return _editableField;
                } else {
                    Object __rawValue = super._map.get("editable");
                    _editableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _editableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for editable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRoleInfo.Fields#editable
     */
    @Nonnull
    public Boolean isEditable() {
        if (_editableField!= null) {
            return _editableField;
        } else {
            Object __rawValue = super._map.get("editable");
            if (__rawValue == null) {
                return DEFAULT_Editable;
            }
            _editableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _editableField;
        }
    }

    /**
     * Setter for editable
     * 
     * @see DataHubRoleInfo.Fields#editable
     */
    public DataHubRoleInfo setEditable(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEditable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field editable of com.linkedin.policy.DataHubRoleInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEditable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for editable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubRoleInfo.Fields#editable
     */
    public DataHubRoleInfo setEditable(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field editable of com.linkedin.policy.DataHubRoleInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "editable", value);
            _editableField = value;
        }
        return this;
    }

    /**
     * Setter for editable
     * 
     * @see DataHubRoleInfo.Fields#editable
     */
    public DataHubRoleInfo setEditable(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "editable", value);
        _editableField = value;
        return this;
    }

    @Override
    public DataHubRoleInfo clone()
        throws CloneNotSupportedException
    {
        DataHubRoleInfo __clone = ((DataHubRoleInfo) super.clone());
        __clone.__changeListener = new DataHubRoleInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubRoleInfo copy()
        throws CloneNotSupportedException
    {
        DataHubRoleInfo __copy = ((DataHubRoleInfo) super.copy());
        __copy._editableField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy.__changeListener = new DataHubRoleInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubRoleInfo __objectRef;

        private ChangeListener(DataHubRoleInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "editable":
                    __objectRef._editableField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
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
         * Name of the Role
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Description of the Role
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Whether the role should be editable via the UI
         * 
         */
        public PathSpec editable() {
            return new PathSpec(getPathComponents(), "editable");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Name of the Role
         * 
         */
        public DataHubRoleInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the Role
         * 
         */
        public DataHubRoleInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the role should be editable via the UI
         * 
         */
        public DataHubRoleInfo.ProjectionMask withEditable() {
            getDataMap().put("editable", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
