
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
 * Boolean field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/BooleanType.pdl.")
public class BooleanType
    extends RecordTemplate
{

    private final static BooleanType.Fields _fields = new BooleanType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Boolean field type.*/record BooleanType{}", SchemaFormatType.PDL));

    public BooleanType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public BooleanType(DataMap data) {
        super(data, SCHEMA);
    }

    public static BooleanType.Fields fields() {
        return _fields;
    }

    public static BooleanType.ProjectionMask createMask() {
        return new BooleanType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public BooleanType clone()
        throws CloneNotSupportedException
    {
        BooleanType __clone = ((BooleanType) super.clone());
        return __clone;
    }

    @Override
    public BooleanType copy()
        throws CloneNotSupportedException
    {
        BooleanType __copy = ((BooleanType) super.copy());
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
