
package com.linkedin.events.metadata;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Descriptor for a change action
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/events/metadata/ChangeType.pdl.")
public enum ChangeType {


    /**
     * insert if not exists. otherwise update
     * 
     */
    UPSERT,

    /**
     * insert if not exists. otherwise fail
     * 
     */
    CREATE,

    /**
     * NOT SUPPORTED YET
     * update if exists. otherwise fail
     * 
     */
    UPDATE,

    /**
     * delete action
     * 
     */
    DELETE,

    /**
     * patch the changes instead of full replace
     * 
     */
    PATCH,

    /**
     * Restate an aspect, eg. in a index refresh.
     * 
     */
    RESTATE,

    /**
     * insert if entity not exists. otherwise fail
     * 
     */
    CREATE_ENTITY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**insert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**delete action*/DELETE/**patch the changes instead of full replace*/PATCH/**Restate an aspect, eg. in a index refresh.*/RESTATE/**insert if entity not exists. otherwise fail*/CREATE_ENTITY}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
