
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class MLFeatureUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.MLFeatureUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.MLFeatureUrn.class);
    }

    public MLFeatureUrnArray() {
        this(new DataList());
    }

    public MLFeatureUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MLFeatureUrnArray(Collection<com.linkedin.common.urn.MLFeatureUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MLFeatureUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.MLFeatureUrn.class, String.class);
    }

    public MLFeatureUrnArray(com.linkedin.common.urn.MLFeatureUrn first, com.linkedin.common.urn.MLFeatureUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public MLFeatureUrnArray clone()
        throws CloneNotSupportedException
    {
        MLFeatureUrnArray __clone = ((MLFeatureUrnArray) super.clone());
        return __clone;
    }

    @Override
    public MLFeatureUrnArray copy()
        throws CloneNotSupportedException
    {
        MLFeatureUrnArray __copy = ((MLFeatureUrnArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(com.linkedin.common.urn.MLFeatureUrn object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return DataTemplateUtil.coerceCustomInput(object, com.linkedin.common.urn.MLFeatureUrn.class);
    }

    @Override
    protected com.linkedin.common.urn.MLFeatureUrn coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceCustomOutput(object, com.linkedin.common.urn.MLFeatureUrn.class);
    }

}
