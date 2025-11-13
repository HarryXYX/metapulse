
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
 * Record field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/RecordType.pdl.")
public class RecordType
    extends RecordTemplate
{

    private final static RecordType.Fields _fields = new RecordType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Record field type.*/record RecordType{}", SchemaFormatType.PDL));

    public RecordType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public RecordType(DataMap data) {
        super(data, SCHEMA);
    }

    public static RecordType.Fields fields() {
        return _fields;
    }

    public static RecordType.ProjectionMask createMask() {
        return new RecordType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public RecordType clone()
        throws CloneNotSupportedException
    {
        RecordType __clone = ((RecordType) super.clone());
        return __clone;
    }

    @Override
    public RecordType copy()
        throws CloneNotSupportedException
    {
        RecordType __copy = ((RecordType) super.copy());
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
