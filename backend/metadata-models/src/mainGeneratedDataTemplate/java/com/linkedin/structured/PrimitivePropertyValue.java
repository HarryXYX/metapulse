
package com.linkedin.structured;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/structured/PrimitivePropertyValue.pdl.")
public class PrimitivePropertyValue
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string,double]", SchemaFormatType.PDL));
    private java.lang.String _stringMember = null;
    private java.lang.Double _doubleMember = null;
    private PrimitivePropertyValue.ChangeListener __changeListener = new PrimitivePropertyValue.ChangeListener(this);
    private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
    public final static java.lang.String MEMBERKEY_String = "string";
    private final static DataSchema MEMBER_Double = SCHEMA.getTypeByMemberKey("double");
    public final static java.lang.String MEMBERKEY_Double = "double";
    private final static TyperefInfo TYPEREFINFO = new PrimitivePropertyValue.UnionTyperefInfo();

    public PrimitivePropertyValue() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public PrimitivePropertyValue(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static PrimitivePropertyValue create(java.lang.String value) {
        PrimitivePropertyValue newUnion = new PrimitivePropertyValue();
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

    public static PrimitivePropertyValue create(java.lang.Double value) {
        PrimitivePropertyValue newUnion = new PrimitivePropertyValue();
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

    public static PrimitivePropertyValue.ProjectionMask createMask() {
        return new PrimitivePropertyValue.ProjectionMask();
    }

    @Override
    public PrimitivePropertyValue clone()
        throws CloneNotSupportedException
    {
        PrimitivePropertyValue __clone = ((PrimitivePropertyValue) super.clone());
        __clone.__changeListener = new PrimitivePropertyValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PrimitivePropertyValue copy()
        throws CloneNotSupportedException
    {
        PrimitivePropertyValue __copy = ((PrimitivePropertyValue) super.copy());
        __copy._stringMember = null;
        __copy._doubleMember = null;
        __copy.__changeListener = new PrimitivePropertyValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
    {

        private final PrimitivePropertyValue __objectRef;

        private ChangeListener(PrimitivePropertyValue reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(java.lang.String key, Object value) {
            switch (key) {
                case "string":
                    __objectRef._stringMember = null;
                    break;
                case "double":
                    __objectRef._doubleMember = null;
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

        public PathSpec Double() {
            return new PathSpec(getPathComponents(), "double");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public PrimitivePropertyValue.ProjectionMask withString() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

        public PrimitivePropertyValue.ProjectionMask withDouble() {
            getDataMap().put("double", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * Represents a stored primitive property value
     * 
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.structured/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
