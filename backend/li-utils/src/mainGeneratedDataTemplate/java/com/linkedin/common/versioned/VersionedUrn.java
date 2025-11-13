
package com.linkedin.common.versioned;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.util.VersionedUrnCoercer;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/versioned/VersionedUrn.pdl.")
public class VersionedUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common.versioned@java={\"class\":\"com.linkedin.common.urn.VersionedUrn\",\"coercerClass\":\"com.linkedin.util.VersionedUrnCoercer\"}typeref VersionedUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.VersionedUrn.class);
        Custom.initializeCoercerClass(VersionedUrnCoercer.class);
    }

    public VersionedUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
