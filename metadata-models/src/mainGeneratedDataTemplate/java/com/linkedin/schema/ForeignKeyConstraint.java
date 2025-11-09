
package com.linkedin.schema;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Description of a foreign key constraint in a schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/ForeignKeyConstraint.pdl.")
public class ForeignKeyConstraint
    extends RecordTemplate
{

    private final static ForeignKeyConstraint.Fields _fields = new ForeignKeyConstraint.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private String _nameField = null;
    private UrnArray _foreignFieldsField = null;
    private UrnArray _sourceFieldsField = null;
    private com.linkedin.common.urn.Urn _foreignDatasetField = null;
    private ForeignKeyConstraint.ChangeListener __changeListener = new ForeignKeyConstraint.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_ForeignFields = SCHEMA.getField("foreignFields");
    private final static RecordDataSchema.Field FIELD_SourceFields = SCHEMA.getField("sourceFields");
    private final static RecordDataSchema.Field FIELD_ForeignDataset = SCHEMA.getField("foreignDataset");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ForeignKeyConstraint() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public ForeignKeyConstraint(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ForeignKeyConstraint.Fields fields() {
        return _fields;
    }

    public static ForeignKeyConstraint.ProjectionMask createMask() {
        return new ForeignKeyConstraint.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see ForeignKeyConstraint.Fields#name
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
     * @see ForeignKeyConstraint.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see ForeignKeyConstraint.Fields#name
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
     * @see ForeignKeyConstraint.Fields#name
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
     * @see ForeignKeyConstraint.Fields#name
     */
    public ForeignKeyConstraint setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.schema.ForeignKeyConstraint");
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
     * @see ForeignKeyConstraint.Fields#name
     */
    public ForeignKeyConstraint setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.schema.ForeignKeyConstraint to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public boolean hasForeignFields() {
        if (_foreignFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("foreignFields");
    }

    /**
     * Remover for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public void removeForeignFields() {
        super._map.remove("foreignFields");
    }

    /**
     * Getter for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    @Nullable
    public UrnArray getForeignFields(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getForeignFields();
            case DEFAULT:
            case NULL:
                if (_foreignFieldsField!= null) {
                    return _foreignFieldsField;
                } else {
                    Object __rawValue = super._map.get("foreignFields");
                    _foreignFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _foreignFieldsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for foreignFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    @Nonnull
    public UrnArray getForeignFields() {
        if (_foreignFieldsField!= null) {
            return _foreignFieldsField;
        } else {
            Object __rawValue = super._map.get("foreignFields");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("foreignFields");
            }
            _foreignFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _foreignFieldsField;
        }
    }

    /**
     * Setter for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public ForeignKeyConstraint setForeignFields(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForeignFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field foreignFields of com.linkedin.schema.ForeignKeyConstraint");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignFields", value.data());
                    _foreignFieldsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForeignFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignFields", value.data());
                    _foreignFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "foreignFields", value.data());
                    _foreignFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for foreignFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public ForeignKeyConstraint setForeignFields(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field foreignFields of com.linkedin.schema.ForeignKeyConstraint to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "foreignFields", value.data());
            _foreignFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public boolean hasSourceFields() {
        if (_sourceFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("sourceFields");
    }

    /**
     * Remover for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public void removeSourceFields() {
        super._map.remove("sourceFields");
    }

    /**
     * Getter for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    @Nullable
    public UrnArray getSourceFields(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceFields();
            case DEFAULT:
            case NULL:
                if (_sourceFieldsField!= null) {
                    return _sourceFieldsField;
                } else {
                    Object __rawValue = super._map.get("sourceFields");
                    _sourceFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _sourceFieldsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    @Nonnull
    public UrnArray getSourceFields() {
        if (_sourceFieldsField!= null) {
            return _sourceFieldsField;
        } else {
            Object __rawValue = super._map.get("sourceFields");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceFields");
            }
            _sourceFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sourceFieldsField;
        }
    }

    /**
     * Setter for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public ForeignKeyConstraint setSourceFields(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceFields of com.linkedin.schema.ForeignKeyConstraint");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public ForeignKeyConstraint setSourceFields(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceFields of com.linkedin.schema.ForeignKeyConstraint to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
            _sourceFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public boolean hasForeignDataset() {
        if (_foreignDatasetField!= null) {
            return true;
        }
        return super._map.containsKey("foreignDataset");
    }

    /**
     * Remover for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public void removeForeignDataset() {
        super._map.remove("foreignDataset");
    }

    /**
     * Getter for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    @Nullable
    public com.linkedin.common.urn.Urn getForeignDataset(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getForeignDataset();
            case DEFAULT:
            case NULL:
                if (_foreignDatasetField!= null) {
                    return _foreignDatasetField;
                } else {
                    Object __rawValue = super._map.get("foreignDataset");
                    _foreignDatasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _foreignDatasetField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for foreignDataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getForeignDataset() {
        if (_foreignDatasetField!= null) {
            return _foreignDatasetField;
        } else {
            Object __rawValue = super._map.get("foreignDataset");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("foreignDataset");
            }
            _foreignDatasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _foreignDatasetField;
        }
    }

    /**
     * Setter for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public ForeignKeyConstraint setForeignDataset(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForeignDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field foreignDataset of com.linkedin.schema.ForeignKeyConstraint");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _foreignDatasetField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForeignDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _foreignDatasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "foreignDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _foreignDatasetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for foreignDataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public ForeignKeyConstraint setForeignDataset(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field foreignDataset of com.linkedin.schema.ForeignKeyConstraint to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "foreignDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _foreignDatasetField = value;
        }
        return this;
    }

    @Override
    public ForeignKeyConstraint clone()
        throws CloneNotSupportedException
    {
        ForeignKeyConstraint __clone = ((ForeignKeyConstraint) super.clone());
        __clone.__changeListener = new ForeignKeyConstraint.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ForeignKeyConstraint copy()
        throws CloneNotSupportedException
    {
        ForeignKeyConstraint __copy = ((ForeignKeyConstraint) super.copy());
        __copy._sourceFieldsField = null;
        __copy._foreignFieldsField = null;
        __copy._nameField = null;
        __copy._foreignDatasetField = null;
        __copy.__changeListener = new ForeignKeyConstraint.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ForeignKeyConstraint __objectRef;

        private ChangeListener(ForeignKeyConstraint reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceFields":
                    __objectRef._sourceFieldsField = null;
                    break;
                case "foreignFields":
                    __objectRef._foreignFieldsField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "foreignDataset":
                    __objectRef._foreignDatasetField = null;
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
         * Name of the constraint, likely provided from the source
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public PathSpec foreignFields() {
            return new PathSpec(getPathComponents(), "foreignFields");
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public PathSpec foreignFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "foreignFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public PathSpec sourceFields() {
            return new PathSpec(getPathComponents(), "sourceFields");
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public PathSpec sourceFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Reference to the foreign dataset for ease of lookup
         * 
         */
        public PathSpec foreignDataset() {
            return new PathSpec(getPathComponents(), "foreignDataset");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Name of the constraint, likely provided from the source
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withForeignFields() {
            getDataMap().put("foreignFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withForeignFields(Integer start, Integer count) {
            getDataMap().put("foreignFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("foreignFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("foreignFields").put("$count", count);
            }
            return this;
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withSourceFields() {
            getDataMap().put("sourceFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withSourceFields(Integer start, Integer count) {
            getDataMap().put("sourceFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sourceFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sourceFields").put("$count", count);
            }
            return this;
        }

        /**
         * Reference to the foreign dataset for ease of lookup
         * 
         */
        public ForeignKeyConstraint.ProjectionMask withForeignDataset() {
            getDataMap().put("foreignDataset", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
