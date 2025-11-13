
package com.linkedin.metadata.aspect;

import java.util.List;
import java.util.function.Function;
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/SchemaFieldAspect.pdl.")
public class SchemaFieldAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.SchemaFieldKey _schemaFieldKeyMember = null;
    private SchemaFieldAspect.ChangeListener __changeListener = new SchemaFieldAspect.ChangeListener(this);
    private final static DataSchema MEMBER_SchemaFieldKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.SchemaFieldKey");
    public final static String MEMBERKEY_SchemaFieldKey = "com.linkedin.metadata.key.SchemaFieldKey";
    private final static TyperefInfo TYPEREFINFO = new SchemaFieldAspect.UnionTyperefInfo();

    public SchemaFieldAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SchemaFieldAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SchemaFieldAspect create(com.linkedin.metadata.key.SchemaFieldKey value) {
        SchemaFieldAspect newUnion = new SchemaFieldAspect();
        newUnion.setSchemaFieldKey(value);
        return newUnion;
    }

    public boolean isSchemaFieldKey() {
        return memberIs("com.linkedin.metadata.key.SchemaFieldKey");
    }

    public com.linkedin.metadata.key.SchemaFieldKey getSchemaFieldKey() {
        checkNotNull();
        if (_schemaFieldKeyMember!= null) {
            return _schemaFieldKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.SchemaFieldKey");
        _schemaFieldKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.SchemaFieldKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _schemaFieldKeyMember;
    }

    public void setSchemaFieldKey(com.linkedin.metadata.key.SchemaFieldKey value) {
        checkNotNull();
        super._map.clear();
        _schemaFieldKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.SchemaFieldKey", value.data());
    }

    public static SchemaFieldAspect.ProjectionMask createMask() {
        return new SchemaFieldAspect.ProjectionMask();
    }

    @Override
    public SchemaFieldAspect clone()
        throws CloneNotSupportedException
    {
        SchemaFieldAspect __clone = ((SchemaFieldAspect) super.clone());
        __clone.__changeListener = new SchemaFieldAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldAspect copy()
        throws CloneNotSupportedException
    {
        SchemaFieldAspect __copy = ((SchemaFieldAspect) super.copy());
        __copy._schemaFieldKeyMember = null;
        __copy.__changeListener = new SchemaFieldAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldAspect __objectRef;

        private ChangeListener(SchemaFieldAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.metadata.key.SchemaFieldKey":
                    __objectRef._schemaFieldKeyMember = null;
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

        public com.linkedin.metadata.key.SchemaFieldKey.Fields SchemaFieldKey() {
            return new com.linkedin.metadata.key.SchemaFieldKey.Fields(getPathComponents(), "com.linkedin.metadata.key.SchemaFieldKey");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.SchemaFieldKey.ProjectionMask _SchemaFieldKeyMask;

        ProjectionMask() {
            super(2);
        }

        public SchemaFieldAspect.ProjectionMask withSchemaFieldKey(Function<com.linkedin.metadata.key.SchemaFieldKey.ProjectionMask, com.linkedin.metadata.key.SchemaFieldKey.ProjectionMask> nestedMask) {
            _SchemaFieldKeyMask = nestedMask.apply(((_SchemaFieldKeyMask == null)?com.linkedin.metadata.key.SchemaFieldKey.createMask():_SchemaFieldKeyMask));
            getDataMap().put("com.linkedin.metadata.key.SchemaFieldKey", _SchemaFieldKeyMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a SchemaField
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a SchemaField*/typeref SchemaFieldAspect=union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
