
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.util.ArgumentUtil;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datajob/DataJobInputOutput.pdl.")
public class DatasetUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.DatasetUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public DatasetUrnArray() {
        this(new DataList());
    }

    public DatasetUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetUrnArray(Collection<com.linkedin.common.urn.DatasetUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.DatasetUrn.class, String.class);
    }

    public DatasetUrnArray(com.linkedin.common.urn.DatasetUrn first, com.linkedin.common.urn.DatasetUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public DatasetUrnArray clone()
        throws CloneNotSupportedException
    {
        DatasetUrnArray __clone = ((DatasetUrnArray) super.clone());
        return __clone;
    }

    @Override
    public DatasetUrnArray copy()
        throws CloneNotSupportedException
    {
        DatasetUrnArray __copy = ((DatasetUrnArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(com.linkedin.common.urn.DatasetUrn object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return DataTemplateUtil.coerceCustomInput(object, com.linkedin.common.urn.DatasetUrn.class);
    }

    @Override
    protected com.linkedin.common.urn.DatasetUrn coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceCustomOutput(object, com.linkedin.common.urn.DatasetUrn.class);
    }

}
