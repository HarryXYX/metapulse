
package com.linkedin.schemafield;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schemafield/schemafieldInfo.pdl.")
public class SchemaFieldInfo
    extends RecordTemplate
{

    private final static SchemaFieldInfo.Fields _fields = new SchemaFieldInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schemafield@Aspect.name=\"schemafieldInfo\"record SchemaFieldInfo{@Searchable={\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"KEYWORD\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Used to store field path variations for the schemaField urn.*/@Searchable.`/*`={\"fieldType\":\"URN\",\"queryByDefault\":true}schemaFieldAliases:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private String _nameField = null;
    private UrnArray _schemaFieldAliasesField = null;
    private SchemaFieldInfo.ChangeListener __changeListener = new SchemaFieldInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_SchemaFieldAliases = SCHEMA.getField("schemaFieldAliases");

    public SchemaFieldInfo() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SchemaFieldInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaFieldInfo.Fields fields() {
        return _fields;
    }

    public static SchemaFieldInfo.ProjectionMask createMask() {
        return new SchemaFieldInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see SchemaFieldInfo.Fields#name
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
     * @see SchemaFieldInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see SchemaFieldInfo.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        return getName();
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaFieldInfo.Fields#name
     */
    @Nullable
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see SchemaFieldInfo.Fields#name
     */
    public SchemaFieldInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see SchemaFieldInfo.Fields#name
     */
    public SchemaFieldInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.schemafield.SchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaFieldAliases
     * 
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    public boolean hasSchemaFieldAliases() {
        if (_schemaFieldAliasesField!= null) {
            return true;
        }
        return super._map.containsKey("schemaFieldAliases");
    }

    /**
     * Remover for schemaFieldAliases
     * 
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    public void removeSchemaFieldAliases() {
        super._map.remove("schemaFieldAliases");
    }

    /**
     * Getter for schemaFieldAliases
     * 
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    @Nullable
    public UrnArray getSchemaFieldAliases(GetMode mode) {
        return getSchemaFieldAliases();
    }

    /**
     * Getter for schemaFieldAliases
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    @Nullable
    public UrnArray getSchemaFieldAliases() {
        if (_schemaFieldAliasesField!= null) {
            return _schemaFieldAliasesField;
        } else {
            Object __rawValue = super._map.get("schemaFieldAliases");
            _schemaFieldAliasesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _schemaFieldAliasesField;
        }
    }

    /**
     * Setter for schemaFieldAliases
     * 
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    public SchemaFieldInfo setSchemaFieldAliases(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaFieldAliases(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaFieldAliases();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaFieldAliases", value.data());
                    _schemaFieldAliasesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaFieldAliases", value.data());
                    _schemaFieldAliasesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaFieldAliases
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldInfo.Fields#schemaFieldAliases
     */
    public SchemaFieldInfo setSchemaFieldAliases(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaFieldAliases of com.linkedin.schemafield.SchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaFieldAliases", value.data());
            _schemaFieldAliasesField = value;
        }
        return this;
    }

    @Override
    public SchemaFieldInfo clone()
        throws CloneNotSupportedException
    {
        SchemaFieldInfo __clone = ((SchemaFieldInfo) super.clone());
        __clone.__changeListener = new SchemaFieldInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldInfo copy()
        throws CloneNotSupportedException
    {
        SchemaFieldInfo __copy = ((SchemaFieldInfo) super.copy());
        __copy._schemaFieldAliasesField = null;
        __copy._nameField = null;
        __copy.__changeListener = new SchemaFieldInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldInfo __objectRef;

        private ChangeListener(SchemaFieldInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schemaFieldAliases":
                    __objectRef._schemaFieldAliasesField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
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

        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Used to store field path variations for the schemaField urn.
         * 
         */
        public PathSpec schemaFieldAliases() {
            return new PathSpec(getPathComponents(), "schemaFieldAliases");
        }

        /**
         * Used to store field path variations for the schemaField urn.
         * 
         */
        public PathSpec schemaFieldAliases(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "schemaFieldAliases");
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


        ProjectionMask() {
            super(3);
        }

        public SchemaFieldInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Used to store field path variations for the schemaField urn.
         * 
         */
        public SchemaFieldInfo.ProjectionMask withSchemaFieldAliases() {
            getDataMap().put("schemaFieldAliases", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Used to store field path variations for the schemaField urn.
         * 
         */
        public SchemaFieldInfo.ProjectionMask withSchemaFieldAliases(Integer start, Integer count) {
            getDataMap().put("schemaFieldAliases", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("schemaFieldAliases").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("schemaFieldAliases").put("$count", count);
            }
            return this;
        }

    }

}
