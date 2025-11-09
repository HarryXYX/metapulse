
package com.linkedin.metadata.delta;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/delta/Delta.pdl.")
public class Delta
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[]", SchemaFormatType.PDL));
    private final static TyperefInfo TYPEREFINFO = new Delta.UnionTyperefInfo();

    public Delta() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Delta(Object data) {
        super(data, SCHEMA);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static Delta.ProjectionMask createMask() {
        return new Delta.ProjectionMask();
    }

    @Override
    public Delta clone()
        throws CloneNotSupportedException
    {
        Delta __clone = ((Delta) super.clone());
        return __clone;
    }

    @Override
    public Delta copy()
        throws CloneNotSupportedException
    {
        Delta __copy = ((Delta) super.copy());
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
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


    /**
     * A union of all supported metadata delta types.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.delta/**A union of all supported metadata delta types.*/typeref Delta=union[]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
