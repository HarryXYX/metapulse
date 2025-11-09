
package com.linkedin.event.notification;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.util.ArgumentUtil;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/event/notification/settings/NotificationSettings.pdl.")
public class NotificationSinkTypeArray
    extends DirectArrayTemplate<NotificationSinkType>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.event.notification/**A type of sink / platform to send a notification to.*/enum NotificationSinkType{/**Slack target type.*/SLACK/**Email target type.*/EMAIL}}]", SchemaFormatType.PDL));

    public NotificationSinkTypeArray() {
        this(new DataList());
    }

    public NotificationSinkTypeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public NotificationSinkTypeArray(Collection<NotificationSinkType> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public NotificationSinkTypeArray(DataList data) {
        super(data, SCHEMA, NotificationSinkType.class, String.class);
    }

    public NotificationSinkTypeArray(NotificationSinkType first, NotificationSinkType... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public NotificationSinkTypeArray clone()
        throws CloneNotSupportedException
    {
        NotificationSinkTypeArray __clone = ((NotificationSinkTypeArray) super.clone());
        return __clone;
    }

    @Override
    public NotificationSinkTypeArray copy()
        throws CloneNotSupportedException
    {
        NotificationSinkTypeArray __copy = ((NotificationSinkTypeArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(NotificationSinkType object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return object.name();
    }

    @Override
    protected NotificationSinkType coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceEnumOutput(object, NotificationSinkType.class, NotificationSinkType.$UNKNOWN);
    }

}
