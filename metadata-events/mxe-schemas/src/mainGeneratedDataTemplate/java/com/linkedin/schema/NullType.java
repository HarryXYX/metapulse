
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
 * Null field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/NullType.pdl.")
public class NullType
    extends RecordTemplate
{

    private final static NullType.Fields _fields = new NullType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Null field type.*/record NullType{}", SchemaFormatType.PDL));

    public NullType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public NullType(DataMap data) {
        super(data, SCHEMA);
    }

    public static NullType.Fields fields() {
        return _fields;
    }

    public static NullType.ProjectionMask createMask() {
        return new NullType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public NullType clone()
        throws CloneNotSupportedException
    {
        NullType __clone = ((NullType) super.clone());
        return __clone;
    }

    @Override
    public NullType copy()
        throws CloneNotSupportedException
    {
        NullType __copy = ((NullType) super.copy());
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
