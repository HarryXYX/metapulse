
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized MLFeature identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/MLFeatureUrn.pdl.")
public class MLFeatureUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.MLFeatureUrn.class);
    }

    public MLFeatureUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
