
package com.linkedin.module;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum containing the types of page modules that there are
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/module/DataHubPageModuleType.pdl.")
public enum DataHubPageModuleType {


    /**
     * Link type module
     * 
     */
    LINK,

    /**
     * Module containing rich text to be rendered
     * 
     */
    RICH_TEXT,

    /**
     * A module with a collection of assets
     * 
     */
    ASSET_COLLECTION,

    /**
     * A module displaying a hierarchy to navigate
     * 
     */
    HIERARCHY,

    /**
     * Module displaying assets owned by a user
     * 
     */
    OWNED_ASSETS,

    /**
     * Module displaying the top domains
     * 
     */
    DOMAINS,

    /**
     * Module displaying the assets of parent entity
     * 
     */
    ASSETS,

    /**
     * Module displaying the hierarchy of the children of a given entity. Glossary or Domains.
     * 
     */
    CHILD_HIERARCHY,

    /**
     * Module displaying child data products of a given domain
     * 
     */
    DATA_PRODUCTS,

    /**
     * Module displaying the related terms of a given glossary term
     * 
     */
    RELATED_TERMS,

    /**
     * Module displaying the platforms in an instance
     * 
     */
    PLATFORMS,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**Enum containing the types of page modules that there are*/enum DataHubPageModuleType{/**Link type module*/LINK/**Module containing rich text to be rendered*/RICH_TEXT/**A module with a collection of assets*/ASSET_COLLECTION/**A module displaying a hierarchy to navigate*/HIERARCHY/**Module displaying assets owned by a user*/OWNED_ASSETS/**Module displaying the top domains*/DOMAINS/**Module displaying the assets of parent entity*/ASSETS/**Module displaying the hierarchy of the children of a given entity. Glossary or Domains.*/CHILD_HIERARCHY/**Module displaying child data products of a given domain*/DATA_PRODUCTS/**Module displaying the related terms of a given glossary term*/RELATED_TERMS/**Module displaying the platforms in an instance*/PLATFORMS}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
