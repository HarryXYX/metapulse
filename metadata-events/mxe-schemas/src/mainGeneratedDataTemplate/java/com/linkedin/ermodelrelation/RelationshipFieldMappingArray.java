
package com.linkedin.ermodelrelation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ermodelrelation/ERModelRelationshipProperties.pdl.")
public class RelationshipFieldMappingArray
    extends WrappingArrayTemplate<RelationshipFieldMapping>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ermodelrelation/**Individual Field Mapping of a relationship- one of several*/record RelationshipFieldMapping{/**All fields from dataset A that are required for the join, maps to bFields 1:1*/sourceField:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**All fields from dataset B that are required for the join, maps to aFields 1:1*/destinationField:com.linkedin.dataset.SchemaFieldPath}}]", SchemaFormatType.PDL));

    public RelationshipFieldMappingArray() {
        this(new DataList());
    }

    public RelationshipFieldMappingArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RelationshipFieldMappingArray(Collection<RelationshipFieldMapping> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RelationshipFieldMappingArray(DataList data) {
        super(data, SCHEMA, RelationshipFieldMapping.class);
    }

    public RelationshipFieldMappingArray(RelationshipFieldMapping first, RelationshipFieldMapping... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static RelationshipFieldMappingArray.ProjectionMask createMask() {
        return new RelationshipFieldMappingArray.ProjectionMask();
    }

    @Override
    public RelationshipFieldMappingArray clone()
        throws CloneNotSupportedException
    {
        RelationshipFieldMappingArray __clone = ((RelationshipFieldMappingArray) super.clone());
        return __clone;
    }

    @Override
    public RelationshipFieldMappingArray copy()
        throws CloneNotSupportedException
    {
        RelationshipFieldMappingArray __copy = ((RelationshipFieldMappingArray) super.copy());
        return __copy;
    }

    @Override
    protected RelationshipFieldMapping coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new RelationshipFieldMapping(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.ermodelrelation.RelationshipFieldMapping.Fields items() {
            return new com.linkedin.ermodelrelation.RelationshipFieldMapping.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ermodelrelation.RelationshipFieldMapping.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public RelationshipFieldMappingArray.ProjectionMask withItems(Function<com.linkedin.ermodelrelation.RelationshipFieldMapping.ProjectionMask, com.linkedin.ermodelrelation.RelationshipFieldMapping.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?RelationshipFieldMapping.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
