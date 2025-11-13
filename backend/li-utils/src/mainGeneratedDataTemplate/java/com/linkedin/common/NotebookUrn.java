
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized Notebook identifier
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/NotebookUrn.pdl.")
public class NotebookUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized Notebook identifier*/@java.class=\"com.linkedin.common.urn.NotebookUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized Notebook identifier\",\"entityType\":\"notebook\",\"fields\":[{\"doc\":\"The name of the Notebook tool such as querybook etc.\",\"maxLength\":20,\"name\":\"notebookTool\",\"type\":\"string\"},{\"doc\":\"Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for querybook such as 'querybook.com/notebook/773'\",\"maxLength\":200,\"name\":\"notebookId\",\"type\":\"string\"}],\"maxLength\":240,\"name\":\"Notebook\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref NotebookUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.NotebookUrn.class);
    }

    public NotebookUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
