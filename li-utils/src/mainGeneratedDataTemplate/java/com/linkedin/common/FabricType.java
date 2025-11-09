
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Fabric group type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/FabricType.pdl.")
public enum FabricType {


    /**
     * Designates development fabrics
     * 
     */
    DEV,

    /**
     * Designates testing fabrics
     * 
     */
    TEST,

    /**
     * Designates quality assurance fabrics
     * 
     */
    QA,

    /**
     * Designates user acceptance testing fabrics
     * 
     */
    UAT,

    /**
     * Designates early-integration fabrics
     * 
     */
    EI,

    /**
     * Designates pre-production fabrics
     * 
     */
    PRE,

    /**
     * Designates staging fabrics
     * 
     */
    STG,

    /**
     * Designates non-production fabrics
     * 
     */
    NON_PROD,

    /**
     * Designates production fabrics
     * 
     */
    PROD,

    /**
     * Designates corporation fabrics
     * 
     */
    CORP,

    /**
     * Designates review fabrics
     * 
     */
    RVW,

    /**
     * Alternative Prod spelling
     * 
     */
    PRD,

    /**
     * Alternative Test spelling
     * 
     */
    TST,

    /**
     * System Integration Testing
     * 
     */
    SIT,

    /**
     * Alternative spelling for sandbox
     * 
     */
    SBX,

    /**
     * Designates sandbox fabrics
     * 
     */
    SANDBOX,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
