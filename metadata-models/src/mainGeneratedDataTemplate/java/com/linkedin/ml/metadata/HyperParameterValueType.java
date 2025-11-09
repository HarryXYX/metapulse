
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/HyperParameterValueType.pdl.")
public class HyperParameterValueType
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string,int,float,double,boolean]", SchemaFormatType.PDL));
    private java.lang.String _stringMember = null;
    private Integer _intMember = null;
    private java.lang.Float _floatMember = null;
    private java.lang.Double _doubleMember = null;
    private java.lang.Boolean _booleanMember = null;
    private HyperParameterValueType.ChangeListener __changeListener = new HyperParameterValueType.ChangeListener(this);
    private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
    public final static java.lang.String MEMBERKEY_String = "string";
    private final static DataSchema MEMBER_Int = SCHEMA.getTypeByMemberKey("int");
    public final static java.lang.String MEMBERKEY_Int = "int";
    private final static DataSchema MEMBER_Float = SCHEMA.getTypeByMemberKey("float");
    public final static java.lang.String MEMBERKEY_Float = "float";
    private final static DataSchema MEMBER_Double = SCHEMA.getTypeByMemberKey("double");
    public final static java.lang.String MEMBERKEY_Double = "double";
    private final static DataSchema MEMBER_Boolean = SCHEMA.getTypeByMemberKey("boolean");
    public final static java.lang.String MEMBERKEY_Boolean = "boolean";
    private final static TyperefInfo TYPEREFINFO = new HyperParameterValueType.UnionTyperefInfo();

    public HyperParameterValueType() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public HyperParameterValueType(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static HyperParameterValueType create(java.lang.String value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setString(value);
        return newUnion;
    }

    public boolean isString() {
        return memberIs("string");
    }

    public java.lang.String getString() {
        checkNotNull();
        if (_stringMember!= null) {
            return _stringMember;
        }
        Object __rawValue = super._map.get("string");
        _stringMember = DataTemplateUtil.coerceStringOutput(__rawValue);
        return _stringMember;
    }

    public void setString(java.lang.String value) {
        checkNotNull();
        super._map.clear();
        _stringMember = value;
        CheckedUtil.putWithoutChecking(super._map, "string", value);
    }

    public static HyperParameterValueType create(Integer value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setInt(value);
        return newUnion;
    }

    public boolean isInt() {
        return memberIs("int");
    }

    public Integer getInt() {
        checkNotNull();
        if (_intMember!= null) {
            return _intMember;
        }
        Object __rawValue = super._map.get("int");
        _intMember = DataTemplateUtil.coerceIntOutput(__rawValue);
        return _intMember;
    }

    public void setInt(Integer value) {
        checkNotNull();
        super._map.clear();
        _intMember = value;
        CheckedUtil.putWithoutChecking(super._map, "int", DataTemplateUtil.coerceIntInput(value));
    }

    public static HyperParameterValueType create(java.lang.Float value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setFloat(value);
        return newUnion;
    }

    public boolean isFloat() {
        return memberIs("float");
    }

    public java.lang.Float getFloat() {
        checkNotNull();
        if (_floatMember!= null) {
            return _floatMember;
        }
        Object __rawValue = super._map.get("float");
        _floatMember = DataTemplateUtil.coerceFloatOutput(__rawValue);
        return _floatMember;
    }

    public void setFloat(java.lang.Float value) {
        checkNotNull();
        super._map.clear();
        _floatMember = value;
        CheckedUtil.putWithoutChecking(super._map, "float", DataTemplateUtil.coerceFloatInput(value));
    }

    public static HyperParameterValueType create(java.lang.Double value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setDouble(value);
        return newUnion;
    }

    public boolean isDouble() {
        return memberIs("double");
    }

    public java.lang.Double getDouble() {
        checkNotNull();
        if (_doubleMember!= null) {
            return _doubleMember;
        }
        Object __rawValue = super._map.get("double");
        _doubleMember = DataTemplateUtil.coerceDoubleOutput(__rawValue);
        return _doubleMember;
    }

    public void setDouble(java.lang.Double value) {
        checkNotNull();
        super._map.clear();
        _doubleMember = value;
        CheckedUtil.putWithoutChecking(super._map, "double", DataTemplateUtil.coerceDoubleInput(value));
    }

    public static HyperParameterValueType create(java.lang.Boolean value) {
        HyperParameterValueType newUnion = new HyperParameterValueType();
        newUnion.setBoolean(value);
        return newUnion;
    }

    public boolean isBoolean() {
        return memberIs("boolean");
    }

    public java.lang.Boolean getBoolean() {
        checkNotNull();
        if (_booleanMember!= null) {
            return _booleanMember;
        }
        Object __rawValue = super._map.get("boolean");
        _booleanMember = DataTemplateUtil.coerceBooleanOutput(__rawValue);
        return _booleanMember;
    }

    public void setBoolean(java.lang.Boolean value) {
        checkNotNull();
        super._map.clear();
        _booleanMember = value;
        CheckedUtil.putWithoutChecking(super._map, "boolean", value);
    }

    public static HyperParameterValueType.ProjectionMask createMask() {
        return new HyperParameterValueType.ProjectionMask();
    }

    @Override
    public HyperParameterValueType clone()
        throws CloneNotSupportedException
    {
        HyperParameterValueType __clone = ((HyperParameterValueType) super.clone());
        __clone.__changeListener = new HyperParameterValueType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public HyperParameterValueType copy()
        throws CloneNotSupportedException
    {
        HyperParameterValueType __copy = ((HyperParameterValueType) super.copy());
        __copy._booleanMember = null;
        __copy._stringMember = null;
        __copy._doubleMember = null;
        __copy._floatMember = null;
        __copy._intMember = null;
        __copy.__changeListener = new HyperParameterValueType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
    {

        private final HyperParameterValueType __objectRef;

        private ChangeListener(HyperParameterValueType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(java.lang.String key, Object value) {
            switch (key) {
                case "boolean":
                    __objectRef._booleanMember = null;
                    break;
                case "string":
                    __objectRef._stringMember = null;
                    break;
                case "double":
                    __objectRef._doubleMember = null;
                    break;
                case "float":
                    __objectRef._floatMember = null;
                    break;
                case "int":
                    __objectRef._intMember = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<java.lang.String> path, java.lang.String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public PathSpec String() {
            return new PathSpec(getPathComponents(), "string");
        }

        public PathSpec Int() {
            return new PathSpec(getPathComponents(), "int");
        }

        public PathSpec Float() {
            return new PathSpec(getPathComponents(), "float");
        }

        public PathSpec Double() {
            return new PathSpec(getPathComponents(), "double");
        }

        public PathSpec Boolean() {
            return new PathSpec(getPathComponents(), "boolean");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        public HyperParameterValueType.ProjectionMask withString() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

        public HyperParameterValueType.ProjectionMask withInt() {
            getDataMap().put("int", MaskMap.POSITIVE_MASK);
            return this;
        }

        public HyperParameterValueType.ProjectionMask withFloat() {
            getDataMap().put("float", MaskMap.POSITIVE_MASK);
            return this;
        }

        public HyperParameterValueType.ProjectionMask withDouble() {
            getDataMap().put("double", MaskMap.POSITIVE_MASK);
            return this;
        }

        public HyperParameterValueType.ProjectionMask withBoolean() {
            getDataMap().put("boolean", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for HyperParameter Value
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
