
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/IncidentsSummary.pdl.")
public class IncidentSummaryDetailsArray
    extends WrappingArrayTemplate<IncidentSummaryDetails>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Summary statistics about incidents on an entity.*/record IncidentSummaryDetails{/**The urn of the incident*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of an incident*/type:string/**The time at which the incident was raised in milliseconds since epoch.*/createdAt:long/**The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.*/resolvedAt:optional long/**The priority of the incident*/priority:optional int}}]", SchemaFormatType.PDL));

    public IncidentSummaryDetailsArray() {
        this(new DataList());
    }

    public IncidentSummaryDetailsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IncidentSummaryDetailsArray(Collection<IncidentSummaryDetails> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IncidentSummaryDetailsArray(DataList data) {
        super(data, SCHEMA, IncidentSummaryDetails.class);
    }

    public IncidentSummaryDetailsArray(IncidentSummaryDetails first, IncidentSummaryDetails... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static IncidentSummaryDetailsArray.ProjectionMask createMask() {
        return new IncidentSummaryDetailsArray.ProjectionMask();
    }

    @Override
    public IncidentSummaryDetailsArray clone()
        throws CloneNotSupportedException
    {
        IncidentSummaryDetailsArray __clone = ((IncidentSummaryDetailsArray) super.clone());
        return __clone;
    }

    @Override
    public IncidentSummaryDetailsArray copy()
        throws CloneNotSupportedException
    {
        IncidentSummaryDetailsArray __copy = ((IncidentSummaryDetailsArray) super.copy());
        return __copy;
    }

    @Override
    protected IncidentSummaryDetails coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new IncidentSummaryDetails(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.IncidentSummaryDetails.Fields items() {
            return new com.linkedin.common.IncidentSummaryDetails.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.IncidentSummaryDetails.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public IncidentSummaryDetailsArray.ProjectionMask withItems(Function<com.linkedin.common.IncidentSummaryDetails.ProjectionMask, com.linkedin.common.IncidentSummaryDetails.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?IncidentSummaryDetails.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
