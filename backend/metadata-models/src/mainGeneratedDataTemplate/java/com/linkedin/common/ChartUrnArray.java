
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dashboard/DashboardInfo.pdl.")
public class ChartUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.ChartUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized chart identifier\",\"entityType\":\"chart\",\"fields\":[{\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"maxLength\":20,\"name\":\"dashboardTool\",\"type\":\"string\"},{\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"maxLength\":200,\"name\":\"chartId\",\"type\":\"string\"}],\"maxLength\":236,\"name\":\"Chart\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref ChartUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.ChartUrn.class);
    }

    public ChartUrnArray() {
        this(new DataList());
    }

    public ChartUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ChartUrnArray(Collection<com.linkedin.common.urn.ChartUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ChartUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.ChartUrn.class, String.class);
    }

    public ChartUrnArray(com.linkedin.common.urn.ChartUrn first, com.linkedin.common.urn.ChartUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public ChartUrnArray clone()
        throws CloneNotSupportedException
    {
        ChartUrnArray __clone = ((ChartUrnArray) super.clone());
        return __clone;
    }

    @Override
    public ChartUrnArray copy()
        throws CloneNotSupportedException
    {
        ChartUrnArray __copy = ((ChartUrnArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(com.linkedin.common.urn.ChartUrn object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return DataTemplateUtil.coerceCustomInput(object, com.linkedin.common.urn.ChartUrn.class);
    }

    @Override
    protected com.linkedin.common.urn.ChartUrn coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceCustomOutput(object, com.linkedin.common.urn.ChartUrn.class);
    }

}
