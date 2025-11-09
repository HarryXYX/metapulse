
package com.linkedin.chart;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Records a single user's usage counts for a given resource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartUserUsageCounts.pdl.")
public class ChartUserUsageCounts
    extends RecordTemplate
{

    private final static ChartUserUsageCounts.Fields _fields = new ChartUserUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Records a single user's usage counts for a given resource*/record ChartUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The number of times the user has viewed the chart*/@TimeseriesField={}viewsCount:optional int}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _userField = null;
    private Integer _viewsCountField = null;
    private ChartUserUsageCounts.ChangeListener __changeListener = new ChartUserUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");
    private final static RecordDataSchema.Field FIELD_ViewsCount = SCHEMA.getField("viewsCount");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ChartUserUsageCounts() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ChartUserUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ChartUserUsageCounts.Fields fields() {
        return _fields;
    }

    public static ChartUserUsageCounts.ProjectionMask createMask() {
        return new ChartUserUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for user
     * 
     * @see ChartUserUsageCounts.Fields#user
     */
    public boolean hasUser() {
        if (_userField!= null) {
            return true;
        }
        return super._map.containsKey("user");
    }

    /**
     * Remover for user
     * 
     * @see ChartUserUsageCounts.Fields#user
     */
    public void removeUser() {
        super._map.remove("user");
    }

    /**
     * Getter for user
     * 
     * @see ChartUserUsageCounts.Fields#user
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUser(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUser();
            case DEFAULT:
            case NULL:
                if (_userField!= null) {
                    return _userField;
                } else {
                    Object __rawValue = super._map.get("user");
                    _userField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _userField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for user
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartUserUsageCounts.Fields#user
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUser() {
        if (_userField!= null) {
            return _userField;
        } else {
            Object __rawValue = super._map.get("user");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("user");
            }
            _userField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _userField;
        }
    }

    /**
     * Setter for user
     * 
     * @see ChartUserUsageCounts.Fields#user
     */
    public ChartUserUsageCounts setUser(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUser(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field user of com.linkedin.chart.ChartUserUsageCounts");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUser();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for user
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartUserUsageCounts.Fields#user
     */
    public ChartUserUsageCounts setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field user of com.linkedin.chart.ChartUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _userField = value;
        }
        return this;
    }

    /**
     * Existence checker for viewsCount
     * 
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    public boolean hasViewsCount() {
        if (_viewsCountField!= null) {
            return true;
        }
        return super._map.containsKey("viewsCount");
    }

    /**
     * Remover for viewsCount
     * 
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    public void removeViewsCount() {
        super._map.remove("viewsCount");
    }

    /**
     * Getter for viewsCount
     * 
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    @Nullable
    public Integer getViewsCount(GetMode mode) {
        return getViewsCount();
    }

    /**
     * Getter for viewsCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    @Nullable
    public Integer getViewsCount() {
        if (_viewsCountField!= null) {
            return _viewsCountField;
        } else {
            Object __rawValue = super._map.get("viewsCount");
            _viewsCountField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _viewsCountField;
        }
    }

    /**
     * Setter for viewsCount
     * 
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    public ChartUserUsageCounts setViewsCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setViewsCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeViewsCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
                    _viewsCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
                    _viewsCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for viewsCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    public ChartUserUsageCounts setViewsCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field viewsCount of com.linkedin.chart.ChartUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
            _viewsCountField = value;
        }
        return this;
    }

    /**
     * Setter for viewsCount
     * 
     * @see ChartUserUsageCounts.Fields#viewsCount
     */
    public ChartUserUsageCounts setViewsCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
        _viewsCountField = value;
        return this;
    }

    @Override
    public ChartUserUsageCounts clone()
        throws CloneNotSupportedException
    {
        ChartUserUsageCounts __clone = ((ChartUserUsageCounts) super.clone());
        __clone.__changeListener = new ChartUserUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartUserUsageCounts copy()
        throws CloneNotSupportedException
    {
        ChartUserUsageCounts __copy = ((ChartUserUsageCounts) super.copy());
        __copy._viewsCountField = null;
        __copy._userField = null;
        __copy.__changeListener = new ChartUserUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartUserUsageCounts __objectRef;

        private ChangeListener(ChartUserUsageCounts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "viewsCount":
                    __objectRef._viewsCountField = null;
                    break;
                case "user":
                    __objectRef._userField = null;
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
         * The unique id of the user.
         * 
         */
        public PathSpec user() {
            return new PathSpec(getPathComponents(), "user");
        }

        /**
         * The number of times the user has viewed the chart
         * 
         */
        public PathSpec viewsCount() {
            return new PathSpec(getPathComponents(), "viewsCount");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The unique id of the user.
         * 
         */
        public ChartUserUsageCounts.ProjectionMask withUser() {
            getDataMap().put("user", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The number of times the user has viewed the chart
         * 
         */
        public ChartUserUsageCounts.ProjectionMask withViewsCount() {
            getDataMap().put("viewsCount", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
