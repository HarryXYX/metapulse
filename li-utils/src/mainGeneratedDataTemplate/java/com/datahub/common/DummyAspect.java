
package com.datahub.common;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/datahub/common/DummyAspect.pdl.")
public class DummyAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnMember = null;
    private DummyAspect.ChangeListener __changeListener = new DummyAspect.ChangeListener(this);
    private final static DataSchema MEMBER_Urn = SCHEMA.getTypeByMemberKey("string");
    public final static String MEMBERKEY_Urn = "string";
    private final static TyperefInfo TYPEREFINFO = new DummyAspect.UnionTyperefInfo();

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DummyAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DummyAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DummyAspect create(com.linkedin.common.urn.Urn value) {
        DummyAspect newUnion = new DummyAspect();
        newUnion.setUrn(value);
        return newUnion;
    }

    public boolean isUrn() {
        return memberIs("string");
    }

    public com.linkedin.common.urn.Urn getUrn() {
        checkNotNull();
        if (_urnMember!= null) {
            return _urnMember;
        }
        Object __rawValue = super._map.get("string");
        _urnMember = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
        return _urnMember;
    }

    public void setUrn(com.linkedin.common.urn.Urn value) {
        checkNotNull();
        super._map.clear();
        _urnMember = value;
        CheckedUtil.putWithoutChecking(super._map, "string", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
    }

    public static DummyAspect.ProjectionMask createMask() {
        return new DummyAspect.ProjectionMask();
    }

    @Override
    public DummyAspect clone()
        throws CloneNotSupportedException
    {
        DummyAspect __clone = ((DummyAspect) super.clone());
        __clone.__changeListener = new DummyAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DummyAspect copy()
        throws CloneNotSupportedException
    {
        DummyAspect __copy = ((DummyAspect) super.copy());
        __copy._urnMember = null;
        __copy.__changeListener = new DummyAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DummyAspect __objectRef;

        private ChangeListener(DummyAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "string":
                    __objectRef._urnMember = null;
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

        public PathSpec Urn() {
            return new PathSpec(getPathComponents(), "string");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public DummyAspect.ProjectionMask withUrn() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * Not to be used
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.datahub.common/**Not to be used*/typeref DummyAspect=union[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
