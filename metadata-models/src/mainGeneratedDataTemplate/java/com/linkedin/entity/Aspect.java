
package com.linkedin.entity;

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
 * Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return
 * any type of aspect without having to define a single union class
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/entity/Aspect.pdl.")
public class Aspect
    extends RecordTemplate
{

    private final static Aspect.Fields _fields = new Aspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.entity/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}", SchemaFormatType.PDL));

    public Aspect() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public Aspect(DataMap data) {
        super(data, SCHEMA);
    }

    public static Aspect.Fields fields() {
        return _fields;
    }

    public static Aspect.ProjectionMask createMask() {
        return new Aspect.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public Aspect clone()
        throws CloneNotSupportedException
    {
        Aspect __clone = ((Aspect) super.clone());
        return __clone;
    }

    @Override
    public Aspect copy()
        throws CloneNotSupportedException
    {
        Aspect __copy = ((Aspect) super.copy());
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
