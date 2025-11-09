
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized dataset field information identifier.
 * 
 * @deprecated
 *     use SchemaFieldPath and represent as generic Urn instead
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DatasetFieldUrn.pdl.")
@Deprecated
public class DatasetFieldUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetFieldUrn.class);
    }

    public DatasetFieldUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
