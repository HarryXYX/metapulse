
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.StringArray;


/**
 * For non-urn based foregin keys.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/DatasetFieldForeignKey.pdl.")
public class DatasetFieldForeignKey
    extends RecordTemplate
{

    private final static DatasetFieldForeignKey.Fields _fields = new DatasetFieldForeignKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.DatasetUrn _parentDatasetField = null;
    private StringArray _currentFieldPathsField = null;
    private String _parentFieldField = null;
    private DatasetFieldForeignKey.ChangeListener __changeListener = new DatasetFieldForeignKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ParentDataset = SCHEMA.getField("parentDataset");
    private final static RecordDataSchema.Field FIELD_CurrentFieldPaths = SCHEMA.getField("currentFieldPaths");
    private final static RecordDataSchema.Field FIELD_ParentField = SCHEMA.getField("parentField");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public DatasetFieldForeignKey() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DatasetFieldForeignKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetFieldForeignKey.Fields fields() {
        return _fields;
    }

    public static DatasetFieldForeignKey.ProjectionMask createMask() {
        return new DatasetFieldForeignKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public boolean hasParentDataset() {
        if (_parentDatasetField!= null) {
            return true;
        }
        return super._map.containsKey("parentDataset");
    }

    /**
     * Remover for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public void removeParentDataset() {
        super._map.remove("parentDataset");
    }

    /**
     * Getter for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getParentDataset(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getParentDataset();
            case DEFAULT:
            case NULL:
                if (_parentDatasetField!= null) {
                    return _parentDatasetField;
                } else {
                    Object __rawValue = super._map.get("parentDataset");
                    _parentDatasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
                    return _parentDatasetField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for parentDataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getParentDataset() {
        if (_parentDatasetField!= null) {
            return _parentDatasetField;
        } else {
            Object __rawValue = super._map.get("parentDataset");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("parentDataset");
            }
            _parentDatasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
            return _parentDatasetField;
        }
    }

    /**
     * Setter for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public DatasetFieldForeignKey setParentDataset(
        @Nullable
        com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParentDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parentDataset of com.linkedin.schema.DatasetFieldForeignKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _parentDatasetField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParentDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _parentDatasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parentDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _parentDatasetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parentDataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public DatasetFieldForeignKey setParentDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentDataset of com.linkedin.schema.DatasetFieldForeignKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentDataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
            _parentDatasetField = value;
        }
        return this;
    }

    /**
     * Existence checker for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public boolean hasCurrentFieldPaths() {
        if (_currentFieldPathsField!= null) {
            return true;
        }
        return super._map.containsKey("currentFieldPaths");
    }

    /**
     * Remover for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public void removeCurrentFieldPaths() {
        super._map.remove("currentFieldPaths");
    }

    /**
     * Getter for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    @Nullable
    public StringArray getCurrentFieldPaths(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCurrentFieldPaths();
            case DEFAULT:
            case NULL:
                if (_currentFieldPathsField!= null) {
                    return _currentFieldPathsField;
                } else {
                    Object __rawValue = super._map.get("currentFieldPaths");
                    _currentFieldPathsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _currentFieldPathsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for currentFieldPaths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    @Nonnull
    public StringArray getCurrentFieldPaths() {
        if (_currentFieldPathsField!= null) {
            return _currentFieldPathsField;
        } else {
            Object __rawValue = super._map.get("currentFieldPaths");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("currentFieldPaths");
            }
            _currentFieldPathsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _currentFieldPathsField;
        }
    }

    /**
     * Setter for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public DatasetFieldForeignKey setCurrentFieldPaths(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCurrentFieldPaths(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field currentFieldPaths of com.linkedin.schema.DatasetFieldForeignKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPaths", value.data());
                    _currentFieldPathsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCurrentFieldPaths();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPaths", value.data());
                    _currentFieldPathsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPaths", value.data());
                    _currentFieldPathsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for currentFieldPaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public DatasetFieldForeignKey setCurrentFieldPaths(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field currentFieldPaths of com.linkedin.schema.DatasetFieldForeignKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "currentFieldPaths", value.data());
            _currentFieldPathsField = value;
        }
        return this;
    }

    /**
     * Existence checker for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public boolean hasParentField() {
        if (_parentFieldField!= null) {
            return true;
        }
        return super._map.containsKey("parentField");
    }

    /**
     * Remover for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public void removeParentField() {
        super._map.remove("parentField");
    }

    /**
     * Getter for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    @Nullable
    public String getParentField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getParentField();
            case DEFAULT:
            case NULL:
                if (_parentFieldField!= null) {
                    return _parentFieldField;
                } else {
                    Object __rawValue = super._map.get("parentField");
                    _parentFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _parentFieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for parentField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    @Nonnull
    public String getParentField() {
        if (_parentFieldField!= null) {
            return _parentFieldField;
        } else {
            Object __rawValue = super._map.get("parentField");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("parentField");
            }
            _parentFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _parentFieldField;
        }
    }

    /**
     * Setter for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public DatasetFieldForeignKey setParentField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParentField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parentField of com.linkedin.schema.DatasetFieldForeignKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentField", value);
                    _parentFieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParentField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentField", value);
                    _parentFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parentField", value);
                    _parentFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parentField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public DatasetFieldForeignKey setParentField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentField of com.linkedin.schema.DatasetFieldForeignKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentField", value);
            _parentFieldField = value;
        }
        return this;
    }

    @Override
    public DatasetFieldForeignKey clone()
        throws CloneNotSupportedException
    {
        DatasetFieldForeignKey __clone = ((DatasetFieldForeignKey) super.clone());
        __clone.__changeListener = new DatasetFieldForeignKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFieldForeignKey copy()
        throws CloneNotSupportedException
    {
        DatasetFieldForeignKey __copy = ((DatasetFieldForeignKey) super.copy());
        __copy._parentDatasetField = null;
        __copy._parentFieldField = null;
        __copy._currentFieldPathsField = null;
        __copy.__changeListener = new DatasetFieldForeignKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFieldForeignKey __objectRef;

        private ChangeListener(DatasetFieldForeignKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "parentDataset":
                    __objectRef._parentDatasetField = null;
                    break;
                case "parentField":
                    __objectRef._parentFieldField = null;
                    break;
                case "currentFieldPaths":
                    __objectRef._currentFieldPathsField = null;
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
         * dataset that stores the resource.
         * 
         */
        public PathSpec parentDataset() {
            return new PathSpec(getPathComponents(), "parentDataset");
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public PathSpec currentFieldPaths() {
            return new PathSpec(getPathComponents(), "currentFieldPaths");
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public PathSpec currentFieldPaths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "currentFieldPaths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.
         * 
         */
        public PathSpec parentField() {
            return new PathSpec(getPathComponents(), "parentField");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * dataset that stores the resource.
         * 
         */
        public DatasetFieldForeignKey.ProjectionMask withParentDataset() {
            getDataMap().put("parentDataset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public DatasetFieldForeignKey.ProjectionMask withCurrentFieldPaths() {
            getDataMap().put("currentFieldPaths", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public DatasetFieldForeignKey.ProjectionMask withCurrentFieldPaths(Integer start, Integer count) {
            getDataMap().put("currentFieldPaths", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("currentFieldPaths").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("currentFieldPaths").put("$count", count);
            }
            return this;
        }

        /**
         * SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.
         * 
         */
        public DatasetFieldForeignKey.ProjectionMask withParentField() {
            getDataMap().put("parentField", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
