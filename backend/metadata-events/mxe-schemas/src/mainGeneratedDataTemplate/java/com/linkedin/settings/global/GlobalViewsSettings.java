
package com.linkedin.settings.global;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Settings for DataHub Views feature.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/global/GlobalViewsSettings.pdl.")
public class GlobalViewsSettings
    extends RecordTemplate
{

    private final static GlobalViewsSettings.Fields _fields = new GlobalViewsSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**Settings for DataHub Views feature.*/record GlobalViewsSettings{/**The default View for the instance, or organization.*/@Relationship={\"entityTypes\":[\"dataHubView\"],\"name\":\"viewedWith\"}defaultView:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _defaultViewField = null;
    private GlobalViewsSettings.ChangeListener __changeListener = new GlobalViewsSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DefaultView = SCHEMA.getField("defaultView");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public GlobalViewsSettings() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GlobalViewsSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlobalViewsSettings.Fields fields() {
        return _fields;
    }

    public static GlobalViewsSettings.ProjectionMask createMask() {
        return new GlobalViewsSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for defaultView
     * 
     * @see GlobalViewsSettings.Fields#defaultView
     */
    public boolean hasDefaultView() {
        if (_defaultViewField!= null) {
            return true;
        }
        return super._map.containsKey("defaultView");
    }

    /**
     * Remover for defaultView
     * 
     * @see GlobalViewsSettings.Fields#defaultView
     */
    public void removeDefaultView() {
        super._map.remove("defaultView");
    }

    /**
     * Getter for defaultView
     * 
     * @see GlobalViewsSettings.Fields#defaultView
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDefaultView(GetMode mode) {
        return getDefaultView();
    }

    /**
     * Getter for defaultView
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalViewsSettings.Fields#defaultView
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDefaultView() {
        if (_defaultViewField!= null) {
            return _defaultViewField;
        } else {
            Object __rawValue = super._map.get("defaultView");
            _defaultViewField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _defaultViewField;
        }
    }

    /**
     * Setter for defaultView
     * 
     * @see GlobalViewsSettings.Fields#defaultView
     */
    public GlobalViewsSettings setDefaultView(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDefaultView(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDefaultView();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "defaultView", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _defaultViewField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "defaultView", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _defaultViewField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for defaultView
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalViewsSettings.Fields#defaultView
     */
    public GlobalViewsSettings setDefaultView(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field defaultView of com.linkedin.settings.global.GlobalViewsSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "defaultView", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _defaultViewField = value;
        }
        return this;
    }

    @Override
    public GlobalViewsSettings clone()
        throws CloneNotSupportedException
    {
        GlobalViewsSettings __clone = ((GlobalViewsSettings) super.clone());
        __clone.__changeListener = new GlobalViewsSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlobalViewsSettings copy()
        throws CloneNotSupportedException
    {
        GlobalViewsSettings __copy = ((GlobalViewsSettings) super.copy());
        __copy._defaultViewField = null;
        __copy.__changeListener = new GlobalViewsSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlobalViewsSettings __objectRef;

        private ChangeListener(GlobalViewsSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "defaultView":
                    __objectRef._defaultViewField = null;
                    break;
            }
        }

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

        /**
         * The default View for the instance, or organization.
         * 
         */
        public PathSpec defaultView() {
            return new PathSpec(getPathComponents(), "defaultView");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The default View for the instance, or organization.
         * 
         */
        public GlobalViewsSettings.ProjectionMask withDefaultView() {
            getDataMap().put("defaultView", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
