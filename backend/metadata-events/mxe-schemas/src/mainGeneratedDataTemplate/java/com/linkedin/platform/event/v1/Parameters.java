
package com.linkedin.platform.event.v1;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.RecordTemplate;


/**
 * Arbitrary key-value parameters for an Entity Change Event. (any record).
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/platform/event/v1/Parameters.pdl.")
public class Parameters
    extends RecordTemplate
{

    private final static Parameters.Fields _fields = new Parameters.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platform.event.v1/**Arbitrary key-value parameters for an Entity Change Event. (any record).*/record Parameters{}", SchemaFormatType.PDL));

    public Parameters() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public Parameters(DataMap data) {
        super(data, SCHEMA);
    }

    public static Parameters.Fields fields() {
        return _fields;
    }

    public static Parameters.ProjectionMask createMask() {
        return new Parameters.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public Parameters clone()
        throws CloneNotSupportedException
    {
        Parameters __clone = ((Parameters) super.clone());
        return __clone;
    }

    @Override
    public Parameters copy()
        throws CloneNotSupportedException
    {
        Parameters __copy = ((Parameters) super.copy());
        return __copy;
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

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(0);
        }

    }

}
