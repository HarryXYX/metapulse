
package com.linkedin.persona;

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
 * Placeholder aspect for persona type info
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/persona/DataHubPersonaInfo.pdl.")
public class DataHubPersonaInfo
    extends RecordTemplate
{

    private final static DataHubPersonaInfo.Fields _fields = new DataHubPersonaInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.persona/**Placeholder aspect for persona type info*/@Aspect.name=\"dataHubPersonaInfo\"record DataHubPersonaInfo{}", SchemaFormatType.PDL));

    public DataHubPersonaInfo() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public DataHubPersonaInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubPersonaInfo.Fields fields() {
        return _fields;
    }

    public static DataHubPersonaInfo.ProjectionMask createMask() {
        return new DataHubPersonaInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public DataHubPersonaInfo clone()
        throws CloneNotSupportedException
    {
        DataHubPersonaInfo __clone = ((DataHubPersonaInfo) super.clone());
        return __clone;
    }

    @Override
    public DataHubPersonaInfo copy()
        throws CloneNotSupportedException
    {
        DataHubPersonaInfo __copy = ((DataHubPersonaInfo) super.copy());
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
