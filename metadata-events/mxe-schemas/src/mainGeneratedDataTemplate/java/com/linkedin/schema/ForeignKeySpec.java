
package com.linkedin.schema;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.UnionTemplate;


/**
 * Description of a foreign key in a schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ForeignKeySpec.pdl.")
public class ForeignKeySpec
    extends RecordTemplate
{

    private final static ForeignKeySpec.Fields _fields = new ForeignKeySpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}", SchemaFormatType.PDL));
    private ForeignKeySpec.ForeignKey _foreignKeyField = null;
    private ForeignKeySpec.ChangeListener __changeListener = new ForeignKeySpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ForeignKey = SCHEMA.getField("foreignKey");

    public ForeignKeySpec() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ForeignKeySpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ForeignKeySpec.Fields fields() {
        return _fields;
    }

    public static ForeignKeySpec.ProjectionMask createMask() {
        return new ForeignKeySpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public boolean hasForeignKey() {
        if (_foreignKeyField!= null) {
            return true;
        }
        return super._map.containsKey("foreignKey");
    }

    /**
     * Remover for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public void removeForeignKey() {
        super._map.remove("foreignKey");
    }

    /**
     * Getter for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    @Nullable
    public ForeignKeySpec.ForeignKey getForeignKey(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getForeignKey();
            case DEFAULT:
            case NULL:
                if (_foreignKeyField!= null) {
                    return _foreignKeyField;
                } else {
                    Object __rawValue = super._map.get("foreignKey");
                    _foreignKeyField = ((__rawValue == null)?null:new ForeignKeySpec.ForeignKey(__rawValue));
                    return _foreignKeyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for foreignKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeySpec.Fields#foreignKey
     */
    @Nonnull
    public ForeignKeySpec.ForeignKey getForeignKey() {
        if (_foreignKeyField!= null) {
            return _foreignKeyField;
        } else {
            Object __rawValue = super._map.get("foreignKey");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("foreignKey");
            }
            _foreignKeyField = ((__rawValue == null)?null:new ForeignKeySpec.ForeignKey(__rawValue));
            return _foreignKeyField;
        }
    }

    /**
     * Setter for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public ForeignKeySpec setForeignKey(
        @Nullable
        ForeignKeySpec.ForeignKey value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForeignKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field foreignKey of com.linkedin.schema.ForeignKeySpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKey", value.data());
                    _foreignKeyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForeignKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKey", value.data());
                    _foreignKeyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKey", value.data());
                    _foreignKeyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for foreignKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public ForeignKeySpec setForeignKey(
        @Nonnull
        ForeignKeySpec.ForeignKey value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field foreignKey of com.linkedin.schema.ForeignKeySpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "foreignKey", value.data());
            _foreignKeyField = value;
        }
        return this;
    }

    @Override
    public ForeignKeySpec clone()
        throws CloneNotSupportedException
    {
        ForeignKeySpec __clone = ((ForeignKeySpec) super.clone());
        __clone.__changeListener = new ForeignKeySpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ForeignKeySpec copy()
        throws CloneNotSupportedException
    {
        ForeignKeySpec __copy = ((ForeignKeySpec) super.copy());
        __copy._foreignKeyField = null;
        __copy.__changeListener = new ForeignKeySpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ForeignKeySpec __objectRef;

        private ChangeListener(ForeignKeySpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "foreignKey":
                    __objectRef._foreignKeyField = null;
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
         * Foreign key definition in metadata schema.
         * 
         */
        public com.linkedin.schema.ForeignKeySpec.ForeignKey.Fields foreignKey() {
            return new com.linkedin.schema.ForeignKeySpec.ForeignKey.Fields(getPathComponents(), "foreignKey");
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ForeignKeySpec.pdl.")
    public static class ForeignKey
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}}{namespace com.linkedin.schema/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}}]", SchemaFormatType.PDL));
        private com.linkedin.schema.DatasetFieldForeignKey _datasetFieldForeignKeyMember = null;
        private com.linkedin.schema.UrnForeignKey _urnForeignKeyMember = null;
        private ForeignKeySpec.ForeignKey.ChangeListener __changeListener = new ForeignKeySpec.ForeignKey.ChangeListener(this);
        private final static DataSchema MEMBER_DatasetFieldForeignKey = SCHEMA.getTypeByMemberKey("com.linkedin.schema.DatasetFieldForeignKey");
        public final static String MEMBERKEY_DatasetFieldForeignKey = "com.linkedin.schema.DatasetFieldForeignKey";
        private final static DataSchema MEMBER_UrnForeignKey = SCHEMA.getTypeByMemberKey("com.linkedin.schema.UrnForeignKey");
        public final static String MEMBERKEY_UrnForeignKey = "com.linkedin.schema.UrnForeignKey";

        public ForeignKey() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public ForeignKey(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static ForeignKeySpec.ForeignKey create(com.linkedin.schema.DatasetFieldForeignKey value) {
            ForeignKeySpec.ForeignKey newUnion = new ForeignKeySpec.ForeignKey();
            newUnion.setDatasetFieldForeignKey(value);
            return newUnion;
        }

        public boolean isDatasetFieldForeignKey() {
            return memberIs("com.linkedin.schema.DatasetFieldForeignKey");
        }

        public com.linkedin.schema.DatasetFieldForeignKey getDatasetFieldForeignKey() {
            checkNotNull();
            if (_datasetFieldForeignKeyMember!= null) {
                return _datasetFieldForeignKeyMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.DatasetFieldForeignKey");
            _datasetFieldForeignKeyMember = ((__rawValue == null)?null:new com.linkedin.schema.DatasetFieldForeignKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _datasetFieldForeignKeyMember;
        }

        public void setDatasetFieldForeignKey(com.linkedin.schema.DatasetFieldForeignKey value) {
            checkNotNull();
            super._map.clear();
            _datasetFieldForeignKeyMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.DatasetFieldForeignKey", value.data());
        }

        public static ForeignKeySpec.ForeignKey create(com.linkedin.schema.UrnForeignKey value) {
            ForeignKeySpec.ForeignKey newUnion = new ForeignKeySpec.ForeignKey();
            newUnion.setUrnForeignKey(value);
            return newUnion;
        }

        public boolean isUrnForeignKey() {
            return memberIs("com.linkedin.schema.UrnForeignKey");
        }

        public com.linkedin.schema.UrnForeignKey getUrnForeignKey() {
            checkNotNull();
            if (_urnForeignKeyMember!= null) {
                return _urnForeignKeyMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.UrnForeignKey");
            _urnForeignKeyMember = ((__rawValue == null)?null:new com.linkedin.schema.UrnForeignKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _urnForeignKeyMember;
        }

        public void setUrnForeignKey(com.linkedin.schema.UrnForeignKey value) {
            checkNotNull();
            super._map.clear();
            _urnForeignKeyMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.UrnForeignKey", value.data());
        }

        public static ForeignKeySpec.ForeignKey.ProjectionMask createMask() {
            return new ForeignKeySpec.ForeignKey.ProjectionMask();
        }

        @Override
        public ForeignKeySpec.ForeignKey clone()
            throws CloneNotSupportedException
        {
            ForeignKeySpec.ForeignKey __clone = ((ForeignKeySpec.ForeignKey) super.clone());
            __clone.__changeListener = new ForeignKeySpec.ForeignKey.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public ForeignKeySpec.ForeignKey copy()
            throws CloneNotSupportedException
        {
            ForeignKeySpec.ForeignKey __copy = ((ForeignKeySpec.ForeignKey) super.copy());
            __copy._datasetFieldForeignKeyMember = null;
            __copy._urnForeignKeyMember = null;
            __copy.__changeListener = new ForeignKeySpec.ForeignKey.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
        {

            private final ForeignKeySpec.ForeignKey __objectRef;

            private ChangeListener(ForeignKeySpec.ForeignKey reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(String key, Object value) {
                switch (key) {
                    case "com.linkedin.schema.DatasetFieldForeignKey":
                        __objectRef._datasetFieldForeignKeyMember = null;
                        break;
                    case "com.linkedin.schema.UrnForeignKey":
                        __objectRef._urnForeignKeyMember = null;
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

            public com.linkedin.schema.DatasetFieldForeignKey.Fields DatasetFieldForeignKey() {
                return new com.linkedin.schema.DatasetFieldForeignKey.Fields(getPathComponents(), "com.linkedin.schema.DatasetFieldForeignKey");
            }

            public com.linkedin.schema.UrnForeignKey.Fields UrnForeignKey() {
                return new com.linkedin.schema.UrnForeignKey.Fields(getPathComponents(), "com.linkedin.schema.UrnForeignKey");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {

            private com.linkedin.schema.DatasetFieldForeignKey.ProjectionMask _DatasetFieldForeignKeyMask;
            private com.linkedin.schema.UrnForeignKey.ProjectionMask _UrnForeignKeyMask;

            ProjectionMask() {
                super(3);
            }

            public ForeignKeySpec.ForeignKey.ProjectionMask withDatasetFieldForeignKey(Function<com.linkedin.schema.DatasetFieldForeignKey.ProjectionMask, com.linkedin.schema.DatasetFieldForeignKey.ProjectionMask> nestedMask) {
                _DatasetFieldForeignKeyMask = nestedMask.apply(((_DatasetFieldForeignKeyMask == null)?com.linkedin.schema.DatasetFieldForeignKey.createMask():_DatasetFieldForeignKeyMask));
                getDataMap().put("com.linkedin.schema.DatasetFieldForeignKey", _DatasetFieldForeignKeyMask.getDataMap());
                return this;
            }

            public ForeignKeySpec.ForeignKey.ProjectionMask withUrnForeignKey(Function<com.linkedin.schema.UrnForeignKey.ProjectionMask, com.linkedin.schema.UrnForeignKey.ProjectionMask> nestedMask) {
                _UrnForeignKeyMask = nestedMask.apply(((_UrnForeignKeyMask == null)?com.linkedin.schema.UrnForeignKey.createMask():_UrnForeignKeyMask));
                getDataMap().put("com.linkedin.schema.UrnForeignKey", _UrnForeignKeyMask.getDataMap());
                return this;
            }

        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.ForeignKeySpec.ForeignKey.ProjectionMask _foreignKeyMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Foreign key definition in metadata schema.
         * 
         */
        public ForeignKeySpec.ProjectionMask withForeignKey(Function<com.linkedin.schema.ForeignKeySpec.ForeignKey.ProjectionMask, com.linkedin.schema.ForeignKeySpec.ForeignKey.ProjectionMask> nestedMask) {
            _foreignKeyMask = nestedMask.apply(((_foreignKeyMask == null)?ForeignKeySpec.ForeignKey.createMask():_foreignKeyMask));
            getDataMap().put("foreignKey", _foreignKeyMask.getDataMap());
            return this;
        }

        /**
         * Foreign key definition in metadata schema.
         * 
         */
        public ForeignKeySpec.ProjectionMask withForeignKey() {
            _foreignKeyMask = null;
            getDataMap().put("foreignKey", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
