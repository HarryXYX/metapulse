
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataList;
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
 * Settings related to the home page for a user
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/CorpUserHomePageSettings.pdl.")
public class CorpUserHomePageSettings
    extends RecordTemplate
{

    private final static CorpUserHomePageSettings.Fields _fields = new CorpUserHomePageSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Settings related to the home page for a user*/record CorpUserHomePageSettings{/**The page template that will be rendered in the UI by default for this user*/@Relationship={\"entityTypes\":[\"dataHubPageTemplate\"],\"name\":\"HasPersonalPageTemplate\"}pageTemplate:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The list of announcement urns that have been dismissed by the user*/dismissedAnnouncements:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _pageTemplateField = null;
    private UrnArray _dismissedAnnouncementsField = null;
    private CorpUserHomePageSettings.ChangeListener __changeListener = new CorpUserHomePageSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_PageTemplate = SCHEMA.getField("pageTemplate");
    private final static RecordDataSchema.Field FIELD_DismissedAnnouncements = SCHEMA.getField("dismissedAnnouncements");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public CorpUserHomePageSettings() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CorpUserHomePageSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserHomePageSettings.Fields fields() {
        return _fields;
    }

    public static CorpUserHomePageSettings.ProjectionMask createMask() {
        return new CorpUserHomePageSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for pageTemplate
     * 
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    public boolean hasPageTemplate() {
        if (_pageTemplateField!= null) {
            return true;
        }
        return super._map.containsKey("pageTemplate");
    }

    /**
     * Remover for pageTemplate
     * 
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    public void removePageTemplate() {
        super._map.remove("pageTemplate");
    }

    /**
     * Getter for pageTemplate
     * 
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPageTemplate(GetMode mode) {
        return getPageTemplate();
    }

    /**
     * Getter for pageTemplate
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPageTemplate() {
        if (_pageTemplateField!= null) {
            return _pageTemplateField;
        } else {
            Object __rawValue = super._map.get("pageTemplate");
            _pageTemplateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _pageTemplateField;
        }
    }

    /**
     * Setter for pageTemplate
     * 
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    public CorpUserHomePageSettings setPageTemplate(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPageTemplate(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePageTemplate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _pageTemplateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pageTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _pageTemplateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pageTemplate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserHomePageSettings.Fields#pageTemplate
     */
    public CorpUserHomePageSettings setPageTemplate(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pageTemplate of com.linkedin.identity.CorpUserHomePageSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pageTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _pageTemplateField = value;
        }
        return this;
    }

    /**
     * Existence checker for dismissedAnnouncements
     * 
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    public boolean hasDismissedAnnouncements() {
        if (_dismissedAnnouncementsField!= null) {
            return true;
        }
        return super._map.containsKey("dismissedAnnouncements");
    }

    /**
     * Remover for dismissedAnnouncements
     * 
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    public void removeDismissedAnnouncements() {
        super._map.remove("dismissedAnnouncements");
    }

    /**
     * Getter for dismissedAnnouncements
     * 
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    @Nullable
    public UrnArray getDismissedAnnouncements(GetMode mode) {
        return getDismissedAnnouncements();
    }

    /**
     * Getter for dismissedAnnouncements
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    @Nullable
    public UrnArray getDismissedAnnouncements() {
        if (_dismissedAnnouncementsField!= null) {
            return _dismissedAnnouncementsField;
        } else {
            Object __rawValue = super._map.get("dismissedAnnouncements");
            _dismissedAnnouncementsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _dismissedAnnouncementsField;
        }
    }

    /**
     * Setter for dismissedAnnouncements
     * 
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    public CorpUserHomePageSettings setDismissedAnnouncements(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDismissedAnnouncements(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDismissedAnnouncements();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dismissedAnnouncements", value.data());
                    _dismissedAnnouncementsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dismissedAnnouncements", value.data());
                    _dismissedAnnouncementsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dismissedAnnouncements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserHomePageSettings.Fields#dismissedAnnouncements
     */
    public CorpUserHomePageSettings setDismissedAnnouncements(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dismissedAnnouncements of com.linkedin.identity.CorpUserHomePageSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dismissedAnnouncements", value.data());
            _dismissedAnnouncementsField = value;
        }
        return this;
    }

    @Override
    public CorpUserHomePageSettings clone()
        throws CloneNotSupportedException
    {
        CorpUserHomePageSettings __clone = ((CorpUserHomePageSettings) super.clone());
        __clone.__changeListener = new CorpUserHomePageSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserHomePageSettings copy()
        throws CloneNotSupportedException
    {
        CorpUserHomePageSettings __copy = ((CorpUserHomePageSettings) super.copy());
        __copy._dismissedAnnouncementsField = null;
        __copy._pageTemplateField = null;
        __copy.__changeListener = new CorpUserHomePageSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserHomePageSettings __objectRef;

        private ChangeListener(CorpUserHomePageSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "dismissedAnnouncements":
                    __objectRef._dismissedAnnouncementsField = null;
                    break;
                case "pageTemplate":
                    __objectRef._pageTemplateField = null;
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
         * The page template that will be rendered in the UI by default for this user
         * 
         */
        public PathSpec pageTemplate() {
            return new PathSpec(getPathComponents(), "pageTemplate");
        }

        /**
         * The list of announcement urns that have been dismissed by the user
         * 
         */
        public PathSpec dismissedAnnouncements() {
            return new PathSpec(getPathComponents(), "dismissedAnnouncements");
        }

        /**
         * The list of announcement urns that have been dismissed by the user
         * 
         */
        public PathSpec dismissedAnnouncements(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "dismissedAnnouncements");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The page template that will be rendered in the UI by default for this user
         * 
         */
        public CorpUserHomePageSettings.ProjectionMask withPageTemplate() {
            getDataMap().put("pageTemplate", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of announcement urns that have been dismissed by the user
         * 
         */
        public CorpUserHomePageSettings.ProjectionMask withDismissedAnnouncements() {
            getDataMap().put("dismissedAnnouncements", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of announcement urns that have been dismissed by the user
         * 
         */
        public CorpUserHomePageSettings.ProjectionMask withDismissedAnnouncements(Integer start, Integer count) {
            getDataMap().put("dismissedAnnouncements", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("dismissedAnnouncements").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("dismissedAnnouncements").put("$count", count);
            }
            return this;
        }

    }

}
