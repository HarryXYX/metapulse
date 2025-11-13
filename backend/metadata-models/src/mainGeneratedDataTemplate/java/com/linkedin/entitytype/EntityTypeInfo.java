
package com.linkedin.entitytype;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/entitytype/EntityTypeInfo.pdl.")
public class EntityTypeInfo
    extends RecordTemplate
{

    private final static EntityTypeInfo.Fields _fields = new EntityTypeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.entitytype@Aspect.name=\"entityTypeInfo\"record EntityTypeInfo{/**The fully qualified name for the entity type, which usually consists of a namespace\nplus an identifier or name, e.g. datahub.dataset*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:string/**The display name for the Entity Type.*/displayName:optional string/**A description for the Entity Type: what is it for?*/description:optional string}", SchemaFormatType.PDL));
    private String _qualifiedNameField = null;
    private String _displayNameField = null;
    private String _descriptionField = null;
    private EntityTypeInfo.ChangeListener __changeListener = new EntityTypeInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_QualifiedName = SCHEMA.getField("qualifiedName");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public EntityTypeInfo() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EntityTypeInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EntityTypeInfo.Fields fields() {
        return _fields;
    }

    public static EntityTypeInfo.ProjectionMask createMask() {
        return new EntityTypeInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for qualifiedName
     * 
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    public boolean hasQualifiedName() {
        if (_qualifiedNameField!= null) {
            return true;
        }
        return super._map.containsKey("qualifiedName");
    }

    /**
     * Remover for qualifiedName
     * 
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    public void removeQualifiedName() {
        super._map.remove("qualifiedName");
    }

    /**
     * Getter for qualifiedName
     * 
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    @Nullable
    public String getQualifiedName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getQualifiedName();
            case DEFAULT:
            case NULL:
                if (_qualifiedNameField!= null) {
                    return _qualifiedNameField;
                } else {
                    Object __rawValue = super._map.get("qualifiedName");
                    _qualifiedNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _qualifiedNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for qualifiedName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    @Nonnull
    public String getQualifiedName() {
        if (_qualifiedNameField!= null) {
            return _qualifiedNameField;
        } else {
            Object __rawValue = super._map.get("qualifiedName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("qualifiedName");
            }
            _qualifiedNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _qualifiedNameField;
        }
    }

    /**
     * Setter for qualifiedName
     * 
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    public EntityTypeInfo setQualifiedName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQualifiedName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field qualifiedName of com.linkedin.entitytype.EntityTypeInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQualifiedName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for qualifiedName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityTypeInfo.Fields#qualifiedName
     */
    public EntityTypeInfo setQualifiedName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field qualifiedName of com.linkedin.entitytype.EntityTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
            _qualifiedNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see EntityTypeInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see EntityTypeInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see EntityTypeInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EntityTypeInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see EntityTypeInfo.Fields#displayName
     */
    public EntityTypeInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityTypeInfo.Fields#displayName
     */
    public EntityTypeInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.entitytype.EntityTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see EntityTypeInfo.Fields#description
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
     * @see EntityTypeInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EntityTypeInfo.Fields#description
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
     * @see EntityTypeInfo.Fields#description
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
     * @see EntityTypeInfo.Fields#description
     */
    public EntityTypeInfo setDescription(
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
     * @see EntityTypeInfo.Fields#description
     */
    public EntityTypeInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.entitytype.EntityTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public EntityTypeInfo clone()
        throws CloneNotSupportedException
    {
        EntityTypeInfo __clone = ((EntityTypeInfo) super.clone());
        __clone.__changeListener = new EntityTypeInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EntityTypeInfo copy()
        throws CloneNotSupportedException
    {
        EntityTypeInfo __copy = ((EntityTypeInfo) super.copy());
        __copy._qualifiedNameField = null;
        __copy._displayNameField = null;
        __copy._descriptionField = null;
        __copy.__changeListener = new EntityTypeInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EntityTypeInfo __objectRef;

        private ChangeListener(EntityTypeInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "qualifiedName":
                    __objectRef._qualifiedNameField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
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
         * The fully qualified name for the entity type, which usually consists of a namespace
         * plus an identifier or name, e.g. datahub.dataset
         * 
         */
        public PathSpec qualifiedName() {
            return new PathSpec(getPathComponents(), "qualifiedName");
        }

        /**
         * The display name for the Entity Type.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * A description for the Entity Type: what is it for?
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
            super(4);
        }

        /**
         * The fully qualified name for the entity type, which usually consists of a namespace
         * plus an identifier or name, e.g. datahub.dataset
         * 
         */
        public EntityTypeInfo.ProjectionMask withQualifiedName() {
            getDataMap().put("qualifiedName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The display name for the Entity Type.
         * 
         */
        public EntityTypeInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A description for the Entity Type: what is it for?
         * 
         */
        public EntityTypeInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
