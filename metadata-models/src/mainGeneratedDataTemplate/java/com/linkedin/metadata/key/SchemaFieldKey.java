
package com.linkedin.metadata.key;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a SchemaField
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/SchemaFieldKey.pdl.")
public class SchemaFieldKey
    extends RecordTemplate
{

    private final static SchemaFieldKey.Fields _fields = new SchemaFieldKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _parentField = null;
    private String _fieldPathField = null;
    private SchemaFieldKey.ChangeListener __changeListener = new SchemaFieldKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Parent = SCHEMA.getField("parent");
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SchemaFieldKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SchemaFieldKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaFieldKey.Fields fields() {
        return _fields;
    }

    public static SchemaFieldKey.ProjectionMask createMask() {
        return new SchemaFieldKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public boolean hasParent() {
        if (_parentField!= null) {
            return true;
        }
        return super._map.containsKey("parent");
    }

    /**
     * Remover for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public void removeParent() {
        super._map.remove("parent");
    }

    /**
     * Getter for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    @Nullable
    public com.linkedin.common.urn.Urn getParent(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getParent();
            case DEFAULT:
            case NULL:
                if (_parentField!= null) {
                    return _parentField;
                } else {
                    Object __rawValue = super._map.get("parent");
                    _parentField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _parentField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for parent
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldKey.Fields#parent
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getParent() {
        if (_parentField!= null) {
            return _parentField;
        } else {
            Object __rawValue = super._map.get("parent");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("parent");
            }
            _parentField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _parentField;
        }
    }

    /**
     * Setter for parent
     * 
     * @see SchemaFieldKey.Fields#parent
     */
    public SchemaFieldKey setParent(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParent(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parent of com.linkedin.metadata.key.SchemaFieldKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parent", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParent();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parent", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parent", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parent
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldKey.Fields#parent
     */
    public SchemaFieldKey setParent(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parent of com.linkedin.metadata.key.SchemaFieldKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parent", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _parentField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        if (_fieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("fieldPath");
    }

    /**
     * Remover for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    @Nullable
    public String getFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldPath();
            case DEFAULT:
            case NULL:
                if (_fieldPathField!= null) {
                    return _fieldPathField;
                } else {
                    Object __rawValue = super._map.get("fieldPath");
                    _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldKey.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        if (_fieldPathField!= null) {
            return _fieldPathField;
        } else {
            Object __rawValue = super._map.get("fieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldPath");
            }
            _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldPathField;
        }
    }

    /**
     * Setter for fieldPath
     * 
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public SchemaFieldKey setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.metadata.key.SchemaFieldKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldKey.Fields#fieldPath
     */
    public SchemaFieldKey setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.metadata.key.SchemaFieldKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    @Override
    public SchemaFieldKey clone()
        throws CloneNotSupportedException
    {
        SchemaFieldKey __clone = ((SchemaFieldKey) super.clone());
        __clone.__changeListener = new SchemaFieldKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldKey copy()
        throws CloneNotSupportedException
    {
        SchemaFieldKey __copy = ((SchemaFieldKey) super.copy());
        __copy._parentField = null;
        __copy._fieldPathField = null;
        __copy.__changeListener = new SchemaFieldKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldKey __objectRef;

        private ChangeListener(SchemaFieldKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "parent":
                    __objectRef._parentField = null;
                    break;
                case "fieldPath":
                    __objectRef._fieldPathField = null;
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
         * Parent associated with the schema field
         * 
         */
        public PathSpec parent() {
            return new PathSpec(getPathComponents(), "parent");
        }

        /**
         * fieldPath identifying the schema field
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Parent associated with the schema field
         * 
         */
        public SchemaFieldKey.ProjectionMask withParent() {
            getDataMap().put("parent", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * fieldPath identifying the schema field
         * 
         */
        public SchemaFieldKey.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
