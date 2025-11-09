
package com.linkedin.metadata.query.filter;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.entities.restspec.json.")
public class SortCriterionArray
    extends WrappingArrayTemplate<SortCriterion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SortCriterion\",\"namespace\":\"com.linkedin.metadata.query.filter\",\"doc\":\"Sort order along with the field to sort it on, to be applied to the results.\",\"fields\":[{\"name\":\"field\",\"type\":\"string\",\"doc\":\"The name of the field that sorting has to be applied to\"},{\"name\":\"order\",\"type\":{\"type\":\"enum\",\"name\":\"SortOrder\",\"doc\":\"The order used to sort the results\",\"symbols\":[\"ASCENDING\",\"DESCENDING\"],\"symbolDocs\":{\"ASCENDING\":\"If results need to be sorted in ascending order\",\"DESCENDING\":\"If results need to be sorted in descending order\"}},\"doc\":\"The order to sort the results i.e. ASCENDING or DESCENDING\"}]}}"));

    public SortCriterionArray() {
        this(new DataList());
    }

    public SortCriterionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SortCriterionArray(Collection<SortCriterion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SortCriterionArray(DataList data) {
        super(data, SCHEMA, SortCriterion.class);
    }

    public SortCriterionArray(SortCriterion first, SortCriterion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public SortCriterionArray clone()
        throws CloneNotSupportedException
    {
        SortCriterionArray __clone = ((SortCriterionArray) super.clone());
        return __clone;
    }

    @Override
    public SortCriterionArray copy()
        throws CloneNotSupportedException
    {
        SortCriterionArray __copy = ((SortCriterionArray) super.copy());
        return __copy;
    }

    @Override
    protected SortCriterion coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SortCriterion(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.filter.SortCriterion.Fields items() {
            return new com.linkedin.metadata.query.filter.SortCriterion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
