
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/ResultsType.pdl.")
public class ResultsType
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string]", SchemaFormatType.PDL));
    private java.lang.String _stringMember = null;
    private ResultsType.ChangeListener __changeListener = new ResultsType.ChangeListener(this);
    private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
    public final static java.lang.String MEMBERKEY_String = "string";
    private final static TyperefInfo TYPEREFINFO = new ResultsType.UnionTyperefInfo();

    public ResultsType() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ResultsType(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ResultsType create(java.lang.String value) {
        ResultsType newUnion = new ResultsType();
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

    public static ResultsType.ProjectionMask createMask() {
        return new ResultsType.ProjectionMask();
    }

    @Override
    public ResultsType clone()
        throws CloneNotSupportedException
    {
        ResultsType __clone = ((ResultsType) super.clone());
        __clone.__changeListener = new ResultsType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ResultsType copy()
        throws CloneNotSupportedException
    {
        ResultsType __copy = ((ResultsType) super.copy());
        __copy._stringMember = null;
        __copy.__changeListener = new ResultsType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
    {

        private final ResultsType __objectRef;

        private ChangeListener(ResultsType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(java.lang.String key, Object value) {
            switch (key) {
                case "string":
                    __objectRef._stringMember = null;
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

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public ResultsType.ProjectionMask withString() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for ResultsType
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
