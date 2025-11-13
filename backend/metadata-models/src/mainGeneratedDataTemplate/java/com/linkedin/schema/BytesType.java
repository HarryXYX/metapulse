
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
 * Bytes field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/BytesType.pdl.")
public class BytesType
    extends RecordTemplate
{

    private final static BytesType.Fields _fields = new BytesType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Bytes field type.*/record BytesType{}", SchemaFormatType.PDL));

    public BytesType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public BytesType(DataMap data) {
        super(data, SCHEMA);
    }

    public static BytesType.Fields fields() {
        return _fields;
    }

    public static BytesType.ProjectionMask createMask() {
        return new BytesType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public BytesType clone()
        throws CloneNotSupportedException
    {
        BytesType __clone = ((BytesType) super.clone());
        return __clone;
    }

    @Override
    public BytesType copy()
        throws CloneNotSupportedException
    {
        BytesType __copy = ((BytesType) super.copy());
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
