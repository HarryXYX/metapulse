
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
 * Fixed field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/FixedType.pdl.")
public class FixedType
    extends RecordTemplate
{

    private final static FixedType.Fields _fields = new FixedType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Fixed field type.*/record FixedType{}", SchemaFormatType.PDL));

    public FixedType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public FixedType(DataMap data) {
        super(data, SCHEMA);
    }

    public static FixedType.Fields fields() {
        return _fields;
    }

    public static FixedType.ProjectionMask createMask() {
        return new FixedType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public FixedType clone()
        throws CloneNotSupportedException
    {
        FixedType __clone = ((FixedType) super.clone());
        return __clone;
    }

    @Override
    public FixedType copy()
        throws CloneNotSupportedException
    {
        FixedType __copy = ((FixedType) super.copy());
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
