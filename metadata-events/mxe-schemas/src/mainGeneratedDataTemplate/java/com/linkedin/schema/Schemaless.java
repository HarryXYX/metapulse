
package com.linkedin.schema;

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
 * The dataset has no specific schema associated with it
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/Schemaless.pdl.")
public class Schemaless
    extends RecordTemplate
{

    private final static Schemaless.Fields _fields = new Schemaless.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**The dataset has no specific schema associated with it*/record Schemaless{}", SchemaFormatType.PDL));

    public Schemaless() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public Schemaless(DataMap data) {
        super(data, SCHEMA);
    }

    public static Schemaless.Fields fields() {
        return _fields;
    }

    public static Schemaless.ProjectionMask createMask() {
        return new Schemaless.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public Schemaless clone()
        throws CloneNotSupportedException
    {
        Schemaless __clone = ((Schemaless) super.clone());
        return __clone;
    }

    @Override
    public Schemaless copy()
        throws CloneNotSupportedException
    {
        Schemaless __copy = ((Schemaless) super.copy());
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
