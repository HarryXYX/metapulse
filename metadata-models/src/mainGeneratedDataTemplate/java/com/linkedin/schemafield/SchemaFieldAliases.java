
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schemafield/schemaFieldAliases.pdl.")
public class SchemaFieldAliases
    extends RecordTemplate
{

    private final static SchemaFieldAliases.Fields _fields = new SchemaFieldAliases.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schemafield@Aspect.name=\"schemaFieldAliases\"record SchemaFieldAliases{/**Used to store aliases*/@Searchable.`/*`={\"fieldName\":\"schemaFieldAliases\",\"fieldType\":\"URN\",\"queryByDefault\":false}aliases:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _aliasesField = null;
    private SchemaFieldAliases.ChangeListener __changeListener = new SchemaFieldAliases.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Aliases = SCHEMA.getField("aliases");

    public SchemaFieldAliases() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SchemaFieldAliases(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaFieldAliases.Fields fields() {
        return _fields;
    }

    public static SchemaFieldAliases.ProjectionMask createMask() {
        return new SchemaFieldAliases.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aliases
     * 
     * @see SchemaFieldAliases.Fields#aliases
     */
    public boolean hasAliases() {
        if (_aliasesField!= null) {
            return true;
        }
        return super._map.containsKey("aliases");
    }

    /**
     * Remover for aliases
     * 
     * @see SchemaFieldAliases.Fields#aliases
     */
    public void removeAliases() {
        super._map.remove("aliases");
    }

    /**
     * Getter for aliases
     * 
     * @see SchemaFieldAliases.Fields#aliases
     */
    @Nullable
    public UrnArray getAliases(GetMode mode) {
        return getAliases();
    }

    /**
     * Getter for aliases
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaFieldAliases.Fields#aliases
     */
    @Nullable
    public UrnArray getAliases() {
        if (_aliasesField!= null) {
            return _aliasesField;
        } else {
            Object __rawValue = super._map.get("aliases");
            _aliasesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aliasesField;
        }
    }

    /**
     * Setter for aliases
     * 
     * @see SchemaFieldAliases.Fields#aliases
     */
    public SchemaFieldAliases setAliases(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAliases(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAliases();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aliases", value.data());
                    _aliasesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aliases", value.data());
                    _aliasesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aliases
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldAliases.Fields#aliases
     */
    public SchemaFieldAliases setAliases(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aliases of com.linkedin.schemafield.SchemaFieldAliases to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aliases", value.data());
            _aliasesField = value;
        }
        return this;
    }

    @Override
    public SchemaFieldAliases clone()
        throws CloneNotSupportedException
    {
        SchemaFieldAliases __clone = ((SchemaFieldAliases) super.clone());
        __clone.__changeListener = new SchemaFieldAliases.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldAliases copy()
        throws CloneNotSupportedException
    {
        SchemaFieldAliases __copy = ((SchemaFieldAliases) super.copy());
        __copy._aliasesField = null;
        __copy.__changeListener = new SchemaFieldAliases.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldAliases __objectRef;

        private ChangeListener(SchemaFieldAliases reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aliases":
                    __objectRef._aliasesField = null;
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
         * Used to store aliases
         * 
         */
        public PathSpec aliases() {
            return new PathSpec(getPathComponents(), "aliases");
        }

        /**
         * Used to store aliases
         * 
         */
        public PathSpec aliases(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aliases");
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
            super(2);
        }

        /**
         * Used to store aliases
         * 
         */
        public SchemaFieldAliases.ProjectionMask withAliases() {
            getDataMap().put("aliases", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Used to store aliases
         * 
         */
        public SchemaFieldAliases.ProjectionMask withAliases(Integer start, Integer count) {
            getDataMap().put("aliases", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aliases").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aliases").put("$count", count);
            }
            return this;
        }

    }

}
