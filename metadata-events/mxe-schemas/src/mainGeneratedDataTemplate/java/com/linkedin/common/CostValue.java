
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/CostValue.pdl.")
public class CostValue
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[costId:double,costCode:string]", SchemaFormatType.PDL));
    private Double _costIdMember = null;
    private String _costCodeMember = null;
    private CostValue.ChangeListener __changeListener = new CostValue.ChangeListener(this);
    private final static DataSchema MEMBER_CostId = SCHEMA.getTypeByMemberKey("costId");
    public final static String MEMBERKEY_CostId = "costId";
    private final static DataSchema MEMBER_CostCode = SCHEMA.getTypeByMemberKey("costCode");
    public final static String MEMBERKEY_CostCode = "costCode";
    private final static TyperefInfo TYPEREFINFO = new CostValue.UnionTyperefInfo();

    public CostValue() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CostValue(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static CostValue createWithCostId(Double value) {
        CostValue newUnion = new CostValue();
        newUnion.setCostId(value);
        return newUnion;
    }

    public boolean isCostId() {
        return memberIs("costId");
    }

    public Double getCostId() {
        checkNotNull();
        if (_costIdMember!= null) {
            return _costIdMember;
        }
        Object __rawValue = super._map.get("costId");
        _costIdMember = DataTemplateUtil.coerceDoubleOutput(__rawValue);
        return _costIdMember;
    }

    public void setCostId(Double value) {
        checkNotNull();
        super._map.clear();
        _costIdMember = value;
        CheckedUtil.putWithoutChecking(super._map, "costId", DataTemplateUtil.coerceDoubleInput(value));
    }

    public static CostValue createWithCostCode(String value) {
        CostValue newUnion = new CostValue();
        newUnion.setCostCode(value);
        return newUnion;
    }

    public boolean isCostCode() {
        return memberIs("costCode");
    }

    public String getCostCode() {
        checkNotNull();
        if (_costCodeMember!= null) {
            return _costCodeMember;
        }
        Object __rawValue = super._map.get("costCode");
        _costCodeMember = DataTemplateUtil.coerceStringOutput(__rawValue);
        return _costCodeMember;
    }

    public void setCostCode(String value) {
        checkNotNull();
        super._map.clear();
        _costCodeMember = value;
        CheckedUtil.putWithoutChecking(super._map, "costCode", value);
    }

    public static CostValue.ProjectionMask createMask() {
        return new CostValue.ProjectionMask();
    }

    @Override
    public CostValue clone()
        throws CloneNotSupportedException
    {
        CostValue __clone = ((CostValue) super.clone());
        __clone.__changeListener = new CostValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CostValue copy()
        throws CloneNotSupportedException
    {
        CostValue __copy = ((CostValue) super.copy());
        __copy._costCodeMember = null;
        __copy._costIdMember = null;
        __copy.__changeListener = new CostValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CostValue __objectRef;

        private ChangeListener(CostValue reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "costCode":
                    __objectRef._costCodeMember = null;
                    break;
                case "costId":
                    __objectRef._costIdMember = null;
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

        public PathSpec CostId() {
            return new PathSpec(getPathComponents(), "costId");
        }

        public PathSpec CostCode() {
            return new PathSpec(getPathComponents(), "costCode");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public CostValue.ProjectionMask withCostId() {
            getDataMap().put("costId", MaskMap.POSITIVE_MASK);
            return this;
        }

        public CostValue.ProjectionMask withCostCode() {
            getDataMap().put("costCode", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * A union of all supported Cost Value types
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
