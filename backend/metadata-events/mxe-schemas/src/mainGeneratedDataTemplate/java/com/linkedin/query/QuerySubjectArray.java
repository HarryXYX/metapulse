
package com.linkedin.query;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/query/QuerySubjects.pdl.")
public class QuerySubjectArray
    extends WrappingArrayTemplate<QuerySubject>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.query/**A single subject of a particular query.\nIn the future, we may evolve this model to include richer details\nabout the Query Subject in relation to the query.*/record QuerySubject{/**An entity which is the subject of a query.*/@Searchable={\"fieldName\":\"entities\",\"fieldType\":\"URN\"}entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public QuerySubjectArray() {
        this(new DataList());
    }

    public QuerySubjectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public QuerySubjectArray(Collection<QuerySubject> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public QuerySubjectArray(DataList data) {
        super(data, SCHEMA, QuerySubject.class);
    }

    public QuerySubjectArray(QuerySubject first, QuerySubject... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static QuerySubjectArray.ProjectionMask createMask() {
        return new QuerySubjectArray.ProjectionMask();
    }

    @Override
    public QuerySubjectArray clone()
        throws CloneNotSupportedException
    {
        QuerySubjectArray __clone = ((QuerySubjectArray) super.clone());
        return __clone;
    }

    @Override
    public QuerySubjectArray copy()
        throws CloneNotSupportedException
    {
        QuerySubjectArray __copy = ((QuerySubjectArray) super.copy());
        return __copy;
    }

    @Override
    protected QuerySubject coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new QuerySubject(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.query.QuerySubject.Fields items() {
            return new com.linkedin.query.QuerySubject.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.query.QuerySubject.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public QuerySubjectArray.ProjectionMask withItems(Function<com.linkedin.query.QuerySubject.ProjectionMask, com.linkedin.query.QuerySubject.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?QuerySubject.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
