
package com.linkedin.avro2pegasus.events;

import javax.annotation.Generated;
import com.linkedin.data.ByteString;
import com.linkedin.data.schema.FixedDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.FixedTemplate;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/avro2pegasus/events/UUID.pdl.")
public class UUID
    extends FixedTemplate
{

    private final static FixedDataSchema SCHEMA = ((FixedDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.avro2pegasus.events,fixed UUID 16", SchemaFormatType.PDL));

    public UUID(ByteString value) {
        super(value, SCHEMA);
    }

    public UUID(Object data) {
        super(data, SCHEMA);
    }

    public static FixedDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public UUID clone()
        throws CloneNotSupportedException
    {
        UUID __clone = ((UUID) super.clone());
        return __clone;
    }

    @Override
    public UUID copy()
        throws CloneNotSupportedException
    {
        UUID __copy = ((UUID) super.copy());
        return __copy;
    }

}
