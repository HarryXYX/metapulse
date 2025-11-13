
package com.linkedin.notebook;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Type of Notebook Cell
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/notebook/NotebookCellType.pdl.")
public enum NotebookCellType {


    /**
     * TEXT Notebook cell type. The cell context is text only.
     * 
     */
    TEXT_CELL,

    /**
     * QUERY Notebook cell type. The cell context is query only.
     * 
     */
    QUERY_CELL,

    /**
     * CHART Notebook cell type. The cell content is chart only.
     * 
     */
    CHART_CELL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.notebook/**Type of Notebook Cell*/enum NotebookCellType{/**TEXT Notebook cell type. The cell context is text only.*/TEXT_CELL/**QUERY Notebook cell type. The cell context is query only.*/QUERY_CELL/**CHART Notebook cell type. The cell content is chart only.*/CHART_CELL}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
