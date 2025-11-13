
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
 * Schema field data types
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaFieldDataType.pdl.")
public class SchemaFieldDataType
    extends RecordTemplate
{

    private final static SchemaFieldDataType.Fields _fields = new SchemaFieldDataType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}", SchemaFormatType.PDL));
    private SchemaFieldDataType.Type _typeField = null;
    private SchemaFieldDataType.ChangeListener __changeListener = new SchemaFieldDataType.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public SchemaFieldDataType() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SchemaFieldDataType(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaFieldDataType.Fields fields() {
        return _fields;
    }

    public static SchemaFieldDataType.ProjectionMask createMask() {
        return new SchemaFieldDataType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    @Nullable
    public SchemaFieldDataType.Type getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = ((__rawValue == null)?null:new SchemaFieldDataType.Type(__rawValue));
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldDataType.Fields#type
     */
    @Nonnull
    public SchemaFieldDataType.Type getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = ((__rawValue == null)?null:new SchemaFieldDataType.Type(__rawValue));
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see SchemaFieldDataType.Fields#type
     */
    public SchemaFieldDataType setType(
        @Nullable
        SchemaFieldDataType.Type value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.schema.SchemaFieldDataType");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldDataType.Fields#type
     */
    public SchemaFieldDataType setType(
        @Nonnull
        SchemaFieldDataType.Type value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.schema.SchemaFieldDataType to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.data());
            _typeField = value;
        }
        return this;
    }

    @Override
    public SchemaFieldDataType clone()
        throws CloneNotSupportedException
    {
        SchemaFieldDataType __clone = ((SchemaFieldDataType) super.clone());
        __clone.__changeListener = new SchemaFieldDataType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldDataType copy()
        throws CloneNotSupportedException
    {
        SchemaFieldDataType __copy = ((SchemaFieldDataType) super.copy());
        __copy._typeField = null;
        __copy.__changeListener = new SchemaFieldDataType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldDataType __objectRef;

        private ChangeListener(SchemaFieldDataType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
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
         * Data platform specific types
         * 
         */
        public com.linkedin.schema.SchemaFieldDataType.Type.Fields type() {
            return new com.linkedin.schema.SchemaFieldDataType.Type.Fields(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaFieldDataType.Type.ProjectionMask _typeMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Data platform specific types
         * 
         */
        public SchemaFieldDataType.ProjectionMask withType(Function<com.linkedin.schema.SchemaFieldDataType.Type.ProjectionMask, com.linkedin.schema.SchemaFieldDataType.Type.ProjectionMask> nestedMask) {
            _typeMask = nestedMask.apply(((_typeMask == null)?SchemaFieldDataType.Type.createMask():_typeMask));
            getDataMap().put("type", _typeMask.getDataMap());
            return this;
        }

        /**
         * Data platform specific types
         * 
         */
        public SchemaFieldDataType.ProjectionMask withType() {
            _typeMask = null;
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaFieldDataType.pdl.")
    public static class Type
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**Boolean field type.*/record BooleanType{}}{namespace com.linkedin.schema/**Fixed field type.*/record FixedType{}}{namespace com.linkedin.schema/**String field type.*/record StringType{}}{namespace com.linkedin.schema/**Bytes field type.*/record BytesType{}}{namespace com.linkedin.schema/**Number data type: long, integer, short, etc..*/record NumberType{}}{namespace com.linkedin.schema/**Date field type.*/record DateType{}}{namespace com.linkedin.schema/**Time field type. This should also be used for datetimes.*/record TimeType{}}{namespace com.linkedin.schema/**Enum field type.*/record EnumType{}}{namespace com.linkedin.schema/**Null field type.*/record NullType{}}{namespace com.linkedin.schema/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}}{namespace com.linkedin.schema/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}}{namespace com.linkedin.schema/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}}{namespace com.linkedin.schema/**Record field type.*/record RecordType{}}]", SchemaFormatType.PDL));
        private com.linkedin.schema.BooleanType _booleanTypeMember = null;
        private com.linkedin.schema.FixedType _fixedTypeMember = null;
        private com.linkedin.schema.StringType _stringTypeMember = null;
        private com.linkedin.schema.BytesType _bytesTypeMember = null;
        private com.linkedin.schema.NumberType _numberTypeMember = null;
        private com.linkedin.schema.DateType _dateTypeMember = null;
        private com.linkedin.schema.TimeType _timeTypeMember = null;
        private com.linkedin.schema.EnumType _enumTypeMember = null;
        private com.linkedin.schema.NullType _nullTypeMember = null;
        private com.linkedin.schema.MapType _mapTypeMember = null;
        private com.linkedin.schema.ArrayType _arrayTypeMember = null;
        private com.linkedin.schema.UnionType _unionTypeMember = null;
        private com.linkedin.schema.RecordType _recordTypeMember = null;
        private SchemaFieldDataType.Type.ChangeListener __changeListener = new SchemaFieldDataType.Type.ChangeListener(this);
        private final static DataSchema MEMBER_BooleanType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BooleanType");
        public final static String MEMBERKEY_BooleanType = "com.linkedin.schema.BooleanType";
        private final static DataSchema MEMBER_FixedType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.FixedType");
        public final static String MEMBERKEY_FixedType = "com.linkedin.schema.FixedType";
        private final static DataSchema MEMBER_StringType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.StringType");
        public final static String MEMBERKEY_StringType = "com.linkedin.schema.StringType";
        private final static DataSchema MEMBER_BytesType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BytesType");
        public final static String MEMBERKEY_BytesType = "com.linkedin.schema.BytesType";
        private final static DataSchema MEMBER_NumberType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.NumberType");
        public final static String MEMBERKEY_NumberType = "com.linkedin.schema.NumberType";
        private final static DataSchema MEMBER_DateType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.DateType");
        public final static String MEMBERKEY_DateType = "com.linkedin.schema.DateType";
        private final static DataSchema MEMBER_TimeType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.TimeType");
        public final static String MEMBERKEY_TimeType = "com.linkedin.schema.TimeType";
        private final static DataSchema MEMBER_EnumType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EnumType");
        public final static String MEMBERKEY_EnumType = "com.linkedin.schema.EnumType";
        private final static DataSchema MEMBER_NullType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.NullType");
        public final static String MEMBERKEY_NullType = "com.linkedin.schema.NullType";
        private final static DataSchema MEMBER_MapType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.MapType");
        public final static String MEMBERKEY_MapType = "com.linkedin.schema.MapType";
        private final static DataSchema MEMBER_ArrayType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.ArrayType");
        public final static String MEMBERKEY_ArrayType = "com.linkedin.schema.ArrayType";
        private final static DataSchema MEMBER_UnionType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.UnionType");
        public final static String MEMBERKEY_UnionType = "com.linkedin.schema.UnionType";
        private final static DataSchema MEMBER_RecordType = SCHEMA.getTypeByMemberKey("com.linkedin.schema.RecordType");
        public final static String MEMBERKEY_RecordType = "com.linkedin.schema.RecordType";

        public Type() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public Type(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.BooleanType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setBooleanType(value);
            return newUnion;
        }

        public boolean isBooleanType() {
            return memberIs("com.linkedin.schema.BooleanType");
        }

        public com.linkedin.schema.BooleanType getBooleanType() {
            checkNotNull();
            if (_booleanTypeMember!= null) {
                return _booleanTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.BooleanType");
            _booleanTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.BooleanType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _booleanTypeMember;
        }

        public void setBooleanType(com.linkedin.schema.BooleanType value) {
            checkNotNull();
            super._map.clear();
            _booleanTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.BooleanType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.FixedType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setFixedType(value);
            return newUnion;
        }

        public boolean isFixedType() {
            return memberIs("com.linkedin.schema.FixedType");
        }

        public com.linkedin.schema.FixedType getFixedType() {
            checkNotNull();
            if (_fixedTypeMember!= null) {
                return _fixedTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.FixedType");
            _fixedTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.FixedType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fixedTypeMember;
        }

        public void setFixedType(com.linkedin.schema.FixedType value) {
            checkNotNull();
            super._map.clear();
            _fixedTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.FixedType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.StringType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setStringType(value);
            return newUnion;
        }

        public boolean isStringType() {
            return memberIs("com.linkedin.schema.StringType");
        }

        public com.linkedin.schema.StringType getStringType() {
            checkNotNull();
            if (_stringTypeMember!= null) {
                return _stringTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.StringType");
            _stringTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.StringType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _stringTypeMember;
        }

        public void setStringType(com.linkedin.schema.StringType value) {
            checkNotNull();
            super._map.clear();
            _stringTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.StringType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.BytesType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setBytesType(value);
            return newUnion;
        }

        public boolean isBytesType() {
            return memberIs("com.linkedin.schema.BytesType");
        }

        public com.linkedin.schema.BytesType getBytesType() {
            checkNotNull();
            if (_bytesTypeMember!= null) {
                return _bytesTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.BytesType");
            _bytesTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.BytesType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _bytesTypeMember;
        }

        public void setBytesType(com.linkedin.schema.BytesType value) {
            checkNotNull();
            super._map.clear();
            _bytesTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.BytesType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.NumberType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setNumberType(value);
            return newUnion;
        }

        public boolean isNumberType() {
            return memberIs("com.linkedin.schema.NumberType");
        }

        public com.linkedin.schema.NumberType getNumberType() {
            checkNotNull();
            if (_numberTypeMember!= null) {
                return _numberTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.NumberType");
            _numberTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.NumberType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _numberTypeMember;
        }

        public void setNumberType(com.linkedin.schema.NumberType value) {
            checkNotNull();
            super._map.clear();
            _numberTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.NumberType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.DateType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setDateType(value);
            return newUnion;
        }

        public boolean isDateType() {
            return memberIs("com.linkedin.schema.DateType");
        }

        public com.linkedin.schema.DateType getDateType() {
            checkNotNull();
            if (_dateTypeMember!= null) {
                return _dateTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.DateType");
            _dateTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.DateType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _dateTypeMember;
        }

        public void setDateType(com.linkedin.schema.DateType value) {
            checkNotNull();
            super._map.clear();
            _dateTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.DateType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.TimeType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setTimeType(value);
            return newUnion;
        }

        public boolean isTimeType() {
            return memberIs("com.linkedin.schema.TimeType");
        }

        public com.linkedin.schema.TimeType getTimeType() {
            checkNotNull();
            if (_timeTypeMember!= null) {
                return _timeTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.TimeType");
            _timeTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.TimeType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _timeTypeMember;
        }

        public void setTimeType(com.linkedin.schema.TimeType value) {
            checkNotNull();
            super._map.clear();
            _timeTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.TimeType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.EnumType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setEnumType(value);
            return newUnion;
        }

        public boolean isEnumType() {
            return memberIs("com.linkedin.schema.EnumType");
        }

        public com.linkedin.schema.EnumType getEnumType() {
            checkNotNull();
            if (_enumTypeMember!= null) {
                return _enumTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.EnumType");
            _enumTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.EnumType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _enumTypeMember;
        }

        public void setEnumType(com.linkedin.schema.EnumType value) {
            checkNotNull();
            super._map.clear();
            _enumTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.EnumType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.NullType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setNullType(value);
            return newUnion;
        }

        public boolean isNullType() {
            return memberIs("com.linkedin.schema.NullType");
        }

        public com.linkedin.schema.NullType getNullType() {
            checkNotNull();
            if (_nullTypeMember!= null) {
                return _nullTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.NullType");
            _nullTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.NullType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _nullTypeMember;
        }

        public void setNullType(com.linkedin.schema.NullType value) {
            checkNotNull();
            super._map.clear();
            _nullTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.NullType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.MapType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setMapType(value);
            return newUnion;
        }

        public boolean isMapType() {
            return memberIs("com.linkedin.schema.MapType");
        }

        public com.linkedin.schema.MapType getMapType() {
            checkNotNull();
            if (_mapTypeMember!= null) {
                return _mapTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.MapType");
            _mapTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.MapType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _mapTypeMember;
        }

        public void setMapType(com.linkedin.schema.MapType value) {
            checkNotNull();
            super._map.clear();
            _mapTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.MapType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.ArrayType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setArrayType(value);
            return newUnion;
        }

        public boolean isArrayType() {
            return memberIs("com.linkedin.schema.ArrayType");
        }

        public com.linkedin.schema.ArrayType getArrayType() {
            checkNotNull();
            if (_arrayTypeMember!= null) {
                return _arrayTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.ArrayType");
            _arrayTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.ArrayType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _arrayTypeMember;
        }

        public void setArrayType(com.linkedin.schema.ArrayType value) {
            checkNotNull();
            super._map.clear();
            _arrayTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.ArrayType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.UnionType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setUnionType(value);
            return newUnion;
        }

        public boolean isUnionType() {
            return memberIs("com.linkedin.schema.UnionType");
        }

        public com.linkedin.schema.UnionType getUnionType() {
            checkNotNull();
            if (_unionTypeMember!= null) {
                return _unionTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.UnionType");
            _unionTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.UnionType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _unionTypeMember;
        }

        public void setUnionType(com.linkedin.schema.UnionType value) {
            checkNotNull();
            super._map.clear();
            _unionTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.UnionType", value.data());
        }

        public static SchemaFieldDataType.Type create(com.linkedin.schema.RecordType value) {
            SchemaFieldDataType.Type newUnion = new SchemaFieldDataType.Type();
            newUnion.setRecordType(value);
            return newUnion;
        }

        public boolean isRecordType() {
            return memberIs("com.linkedin.schema.RecordType");
        }

        public com.linkedin.schema.RecordType getRecordType() {
            checkNotNull();
            if (_recordTypeMember!= null) {
                return _recordTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.RecordType");
            _recordTypeMember = ((__rawValue == null)?null:new com.linkedin.schema.RecordType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _recordTypeMember;
        }

        public void setRecordType(com.linkedin.schema.RecordType value) {
            checkNotNull();
            super._map.clear();
            _recordTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.RecordType", value.data());
        }

        public static SchemaFieldDataType.Type.ProjectionMask createMask() {
            return new SchemaFieldDataType.Type.ProjectionMask();
        }

        @Override
        public SchemaFieldDataType.Type clone()
            throws CloneNotSupportedException
        {
            SchemaFieldDataType.Type __clone = ((SchemaFieldDataType.Type) super.clone());
            __clone.__changeListener = new SchemaFieldDataType.Type.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public SchemaFieldDataType.Type copy()
            throws CloneNotSupportedException
        {
            SchemaFieldDataType.Type __copy = ((SchemaFieldDataType.Type) super.copy());
            __copy._numberTypeMember = null;
            __copy._nullTypeMember = null;
            __copy._bytesTypeMember = null;
            __copy._timeTypeMember = null;
            __copy._booleanTypeMember = null;
            __copy._fixedTypeMember = null;
            __copy._recordTypeMember = null;
            __copy._mapTypeMember = null;
            __copy._arrayTypeMember = null;
            __copy._unionTypeMember = null;
            __copy._dateTypeMember = null;
            __copy._stringTypeMember = null;
            __copy._enumTypeMember = null;
            __copy.__changeListener = new SchemaFieldDataType.Type.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
        {

            private final SchemaFieldDataType.Type __objectRef;

            private ChangeListener(SchemaFieldDataType.Type reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(String key, Object value) {
                switch (key) {
                    case "com.linkedin.schema.NumberType":
                        __objectRef._numberTypeMember = null;
                        break;
                    case "com.linkedin.schema.NullType":
                        __objectRef._nullTypeMember = null;
                        break;
                    case "com.linkedin.schema.BytesType":
                        __objectRef._bytesTypeMember = null;
                        break;
                    case "com.linkedin.schema.TimeType":
                        __objectRef._timeTypeMember = null;
                        break;
                    case "com.linkedin.schema.BooleanType":
                        __objectRef._booleanTypeMember = null;
                        break;
                    case "com.linkedin.schema.FixedType":
                        __objectRef._fixedTypeMember = null;
                        break;
                    case "com.linkedin.schema.RecordType":
                        __objectRef._recordTypeMember = null;
                        break;
                    case "com.linkedin.schema.MapType":
                        __objectRef._mapTypeMember = null;
                        break;
                    case "com.linkedin.schema.ArrayType":
                        __objectRef._arrayTypeMember = null;
                        break;
                    case "com.linkedin.schema.UnionType":
                        __objectRef._unionTypeMember = null;
                        break;
                    case "com.linkedin.schema.DateType":
                        __objectRef._dateTypeMember = null;
                        break;
                    case "com.linkedin.schema.StringType":
                        __objectRef._stringTypeMember = null;
                        break;
                    case "com.linkedin.schema.EnumType":
                        __objectRef._enumTypeMember = null;
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

            public com.linkedin.schema.BooleanType.Fields BooleanType() {
                return new com.linkedin.schema.BooleanType.Fields(getPathComponents(), "com.linkedin.schema.BooleanType");
            }

            public com.linkedin.schema.FixedType.Fields FixedType() {
                return new com.linkedin.schema.FixedType.Fields(getPathComponents(), "com.linkedin.schema.FixedType");
            }

            public com.linkedin.schema.StringType.Fields StringType() {
                return new com.linkedin.schema.StringType.Fields(getPathComponents(), "com.linkedin.schema.StringType");
            }

            public com.linkedin.schema.BytesType.Fields BytesType() {
                return new com.linkedin.schema.BytesType.Fields(getPathComponents(), "com.linkedin.schema.BytesType");
            }

            public com.linkedin.schema.NumberType.Fields NumberType() {
                return new com.linkedin.schema.NumberType.Fields(getPathComponents(), "com.linkedin.schema.NumberType");
            }

            public com.linkedin.schema.DateType.Fields DateType() {
                return new com.linkedin.schema.DateType.Fields(getPathComponents(), "com.linkedin.schema.DateType");
            }

            public com.linkedin.schema.TimeType.Fields TimeType() {
                return new com.linkedin.schema.TimeType.Fields(getPathComponents(), "com.linkedin.schema.TimeType");
            }

            public com.linkedin.schema.EnumType.Fields EnumType() {
                return new com.linkedin.schema.EnumType.Fields(getPathComponents(), "com.linkedin.schema.EnumType");
            }

            public com.linkedin.schema.NullType.Fields NullType() {
                return new com.linkedin.schema.NullType.Fields(getPathComponents(), "com.linkedin.schema.NullType");
            }

            public com.linkedin.schema.MapType.Fields MapType() {
                return new com.linkedin.schema.MapType.Fields(getPathComponents(), "com.linkedin.schema.MapType");
            }

            public com.linkedin.schema.ArrayType.Fields ArrayType() {
                return new com.linkedin.schema.ArrayType.Fields(getPathComponents(), "com.linkedin.schema.ArrayType");
            }

            public com.linkedin.schema.UnionType.Fields UnionType() {
                return new com.linkedin.schema.UnionType.Fields(getPathComponents(), "com.linkedin.schema.UnionType");
            }

            public com.linkedin.schema.RecordType.Fields RecordType() {
                return new com.linkedin.schema.RecordType.Fields(getPathComponents(), "com.linkedin.schema.RecordType");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {

            private com.linkedin.schema.BooleanType.ProjectionMask _BooleanTypeMask;
            private com.linkedin.schema.FixedType.ProjectionMask _FixedTypeMask;
            private com.linkedin.schema.StringType.ProjectionMask _StringTypeMask;
            private com.linkedin.schema.BytesType.ProjectionMask _BytesTypeMask;
            private com.linkedin.schema.NumberType.ProjectionMask _NumberTypeMask;
            private com.linkedin.schema.DateType.ProjectionMask _DateTypeMask;
            private com.linkedin.schema.TimeType.ProjectionMask _TimeTypeMask;
            private com.linkedin.schema.EnumType.ProjectionMask _EnumTypeMask;
            private com.linkedin.schema.NullType.ProjectionMask _NullTypeMask;
            private com.linkedin.schema.MapType.ProjectionMask _MapTypeMask;
            private com.linkedin.schema.ArrayType.ProjectionMask _ArrayTypeMask;
            private com.linkedin.schema.UnionType.ProjectionMask _UnionTypeMask;
            private com.linkedin.schema.RecordType.ProjectionMask _RecordTypeMask;

            ProjectionMask() {
            }

            public SchemaFieldDataType.Type.ProjectionMask withBooleanType(Function<com.linkedin.schema.BooleanType.ProjectionMask, com.linkedin.schema.BooleanType.ProjectionMask> nestedMask) {
                _BooleanTypeMask = nestedMask.apply(((_BooleanTypeMask == null)?com.linkedin.schema.BooleanType.createMask():_BooleanTypeMask));
                getDataMap().put("com.linkedin.schema.BooleanType", _BooleanTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withFixedType(Function<com.linkedin.schema.FixedType.ProjectionMask, com.linkedin.schema.FixedType.ProjectionMask> nestedMask) {
                _FixedTypeMask = nestedMask.apply(((_FixedTypeMask == null)?com.linkedin.schema.FixedType.createMask():_FixedTypeMask));
                getDataMap().put("com.linkedin.schema.FixedType", _FixedTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withStringType(Function<com.linkedin.schema.StringType.ProjectionMask, com.linkedin.schema.StringType.ProjectionMask> nestedMask) {
                _StringTypeMask = nestedMask.apply(((_StringTypeMask == null)?com.linkedin.schema.StringType.createMask():_StringTypeMask));
                getDataMap().put("com.linkedin.schema.StringType", _StringTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withBytesType(Function<com.linkedin.schema.BytesType.ProjectionMask, com.linkedin.schema.BytesType.ProjectionMask> nestedMask) {
                _BytesTypeMask = nestedMask.apply(((_BytesTypeMask == null)?com.linkedin.schema.BytesType.createMask():_BytesTypeMask));
                getDataMap().put("com.linkedin.schema.BytesType", _BytesTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withNumberType(Function<com.linkedin.schema.NumberType.ProjectionMask, com.linkedin.schema.NumberType.ProjectionMask> nestedMask) {
                _NumberTypeMask = nestedMask.apply(((_NumberTypeMask == null)?com.linkedin.schema.NumberType.createMask():_NumberTypeMask));
                getDataMap().put("com.linkedin.schema.NumberType", _NumberTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withDateType(Function<com.linkedin.schema.DateType.ProjectionMask, com.linkedin.schema.DateType.ProjectionMask> nestedMask) {
                _DateTypeMask = nestedMask.apply(((_DateTypeMask == null)?com.linkedin.schema.DateType.createMask():_DateTypeMask));
                getDataMap().put("com.linkedin.schema.DateType", _DateTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withTimeType(Function<com.linkedin.schema.TimeType.ProjectionMask, com.linkedin.schema.TimeType.ProjectionMask> nestedMask) {
                _TimeTypeMask = nestedMask.apply(((_TimeTypeMask == null)?com.linkedin.schema.TimeType.createMask():_TimeTypeMask));
                getDataMap().put("com.linkedin.schema.TimeType", _TimeTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withEnumType(Function<com.linkedin.schema.EnumType.ProjectionMask, com.linkedin.schema.EnumType.ProjectionMask> nestedMask) {
                _EnumTypeMask = nestedMask.apply(((_EnumTypeMask == null)?com.linkedin.schema.EnumType.createMask():_EnumTypeMask));
                getDataMap().put("com.linkedin.schema.EnumType", _EnumTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withNullType(Function<com.linkedin.schema.NullType.ProjectionMask, com.linkedin.schema.NullType.ProjectionMask> nestedMask) {
                _NullTypeMask = nestedMask.apply(((_NullTypeMask == null)?com.linkedin.schema.NullType.createMask():_NullTypeMask));
                getDataMap().put("com.linkedin.schema.NullType", _NullTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withMapType(Function<com.linkedin.schema.MapType.ProjectionMask, com.linkedin.schema.MapType.ProjectionMask> nestedMask) {
                _MapTypeMask = nestedMask.apply(((_MapTypeMask == null)?com.linkedin.schema.MapType.createMask():_MapTypeMask));
                getDataMap().put("com.linkedin.schema.MapType", _MapTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withArrayType(Function<com.linkedin.schema.ArrayType.ProjectionMask, com.linkedin.schema.ArrayType.ProjectionMask> nestedMask) {
                _ArrayTypeMask = nestedMask.apply(((_ArrayTypeMask == null)?com.linkedin.schema.ArrayType.createMask():_ArrayTypeMask));
                getDataMap().put("com.linkedin.schema.ArrayType", _ArrayTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withUnionType(Function<com.linkedin.schema.UnionType.ProjectionMask, com.linkedin.schema.UnionType.ProjectionMask> nestedMask) {
                _UnionTypeMask = nestedMask.apply(((_UnionTypeMask == null)?com.linkedin.schema.UnionType.createMask():_UnionTypeMask));
                getDataMap().put("com.linkedin.schema.UnionType", _UnionTypeMask.getDataMap());
                return this;
            }

            public SchemaFieldDataType.Type.ProjectionMask withRecordType(Function<com.linkedin.schema.RecordType.ProjectionMask, com.linkedin.schema.RecordType.ProjectionMask> nestedMask) {
                _RecordTypeMask = nestedMask.apply(((_RecordTypeMask == null)?com.linkedin.schema.RecordType.createMask():_RecordTypeMask));
                getDataMap().put("com.linkedin.schema.RecordType", _RecordTypeMask.getDataMap());
                return this;
            }

        }

    }

}
