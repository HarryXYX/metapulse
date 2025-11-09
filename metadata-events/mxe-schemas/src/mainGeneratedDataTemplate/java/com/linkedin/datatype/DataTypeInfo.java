
package com.linkedin.datatype;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datatype/DataTypeInfo.pdl.")
public class DataTypeInfo
    extends RecordTemplate
{

    private final static DataTypeInfo.Fields _fields = new DataTypeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datatype@Aspect.name=\"dataTypeInfo\"record DataTypeInfo{/**The qualified name for the data type. Usually a unique namespace + name, e.g. datahub.string*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:string/**An optional display name for the data type.*/displayName:optional string/**An optional description for the data type.*/description:optional string}", SchemaFormatType.PDL));
    private String _qualifiedNameField = null;
    private String _displayNameField = null;
    private String _descriptionField = null;
    private DataTypeInfo.ChangeListener __changeListener = new DataTypeInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_QualifiedName = SCHEMA.getField("qualifiedName");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public DataTypeInfo() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataTypeInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataTypeInfo.Fields fields() {
        return _fields;
    }

    public static DataTypeInfo.ProjectionMask createMask() {
        return new DataTypeInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for qualifiedName
     * 
     * @see DataTypeInfo.Fields#qualifiedName
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
     * @see DataTypeInfo.Fields#qualifiedName
     */
    public void removeQualifiedName() {
        super._map.remove("qualifiedName");
    }

    /**
     * Getter for qualifiedName
     * 
     * @see DataTypeInfo.Fields#qualifiedName
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
     * @see DataTypeInfo.Fields#qualifiedName
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
     * @see DataTypeInfo.Fields#qualifiedName
     */
    public DataTypeInfo setQualifiedName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQualifiedName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field qualifiedName of com.linkedin.datatype.DataTypeInfo");
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
     * @see DataTypeInfo.Fields#qualifiedName
     */
    public DataTypeInfo setQualifiedName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field qualifiedName of com.linkedin.datatype.DataTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
            _qualifiedNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see DataTypeInfo.Fields#displayName
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
     * @see DataTypeInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see DataTypeInfo.Fields#displayName
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
     * @see DataTypeInfo.Fields#displayName
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
     * @see DataTypeInfo.Fields#displayName
     */
    public DataTypeInfo setDisplayName(
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
     * @see DataTypeInfo.Fields#displayName
     */
    public DataTypeInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.datatype.DataTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataTypeInfo.Fields#description
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
     * @see DataTypeInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataTypeInfo.Fields#description
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
     * @see DataTypeInfo.Fields#description
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
     * @see DataTypeInfo.Fields#description
     */
    public DataTypeInfo setDescription(
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
     * @see DataTypeInfo.Fields#description
     */
    public DataTypeInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.datatype.DataTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public DataTypeInfo clone()
        throws CloneNotSupportedException
    {
        DataTypeInfo __clone = ((DataTypeInfo) super.clone());
        __clone.__changeListener = new DataTypeInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataTypeInfo copy()
        throws CloneNotSupportedException
    {
        DataTypeInfo __copy = ((DataTypeInfo) super.copy());
        __copy._qualifiedNameField = null;
        __copy._displayNameField = null;
        __copy._descriptionField = null;
        __copy.__changeListener = new DataTypeInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataTypeInfo __objectRef;

        private ChangeListener(DataTypeInfo reference) {
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
         * The qualified name for the data type. Usually a unique namespace + name, e.g. datahub.string
         * 
         */
        public PathSpec qualifiedName() {
            return new PathSpec(getPathComponents(), "qualifiedName");
        }

        /**
         * An optional display name for the data type.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * An optional description for the data type.
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
         * The qualified name for the data type. Usually a unique namespace + name, e.g. datahub.string
         * 
         */
        public DataTypeInfo.ProjectionMask withQualifiedName() {
            getDataMap().put("qualifiedName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional display name for the data type.
         * 
         */
        public DataTypeInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional description for the data type.
         * 
         */
        public DataTypeInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
