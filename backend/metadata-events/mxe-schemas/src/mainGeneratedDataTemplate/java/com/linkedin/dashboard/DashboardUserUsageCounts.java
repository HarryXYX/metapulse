
package com.linkedin.dashboard;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dashboard/DashboardUserUsageCounts.pdl.")
public class DashboardUserUsageCounts
    extends RecordTemplate
{

    private final static DashboardUserUsageCounts.Fields _fields = new DashboardUserUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dashboard/**Records a single user's usage counts for a given resource*/record DashboardUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The number of times the user has viewed the dashboard*/@TimeseriesField={}viewsCount:optional int/**The number of times the user has executed (refreshed) the dashboard*/@TimeseriesField={}executionsCount:optional int/**Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. */@TimeseriesField={}usageCount:optional int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _userField = null;
    private Integer _viewsCountField = null;
    private Integer _executionsCountField = null;
    private Integer _usageCountField = null;
    private String _userEmailField = null;
    private DashboardUserUsageCounts.ChangeListener __changeListener = new DashboardUserUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");
    private final static RecordDataSchema.Field FIELD_ViewsCount = SCHEMA.getField("viewsCount");
    private final static RecordDataSchema.Field FIELD_ExecutionsCount = SCHEMA.getField("executionsCount");
    private final static RecordDataSchema.Field FIELD_UsageCount = SCHEMA.getField("usageCount");
    private final static RecordDataSchema.Field FIELD_UserEmail = SCHEMA.getField("userEmail");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DashboardUserUsageCounts() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DashboardUserUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DashboardUserUsageCounts.Fields fields() {
        return _fields;
    }

    public static DashboardUserUsageCounts.ProjectionMask createMask() {
        return new DashboardUserUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for user
     * 
     * @see DashboardUserUsageCounts.Fields#user
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
     * @see DashboardUserUsageCounts.Fields#user
     */
    public void removeUser() {
        super._map.remove("user");
    }

    /**
     * Getter for user
     * 
     * @see DashboardUserUsageCounts.Fields#user
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
     * @see DashboardUserUsageCounts.Fields#user
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
     * @see DashboardUserUsageCounts.Fields#user
     */
    public DashboardUserUsageCounts setUser(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUser(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field user of com.linkedin.dashboard.DashboardUserUsageCounts");
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
     * @see DashboardUserUsageCounts.Fields#user
     */
    public DashboardUserUsageCounts setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field user of com.linkedin.dashboard.DashboardUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _userField = value;
        }
        return this;
    }

    /**
     * Existence checker for viewsCount
     * 
     * @see DashboardUserUsageCounts.Fields#viewsCount
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
     * @see DashboardUserUsageCounts.Fields#viewsCount
     */
    public void removeViewsCount() {
        super._map.remove("viewsCount");
    }

    /**
     * Getter for viewsCount
     * 
     * @see DashboardUserUsageCounts.Fields#viewsCount
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
     * @see DashboardUserUsageCounts.Fields#viewsCount
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
     * @see DashboardUserUsageCounts.Fields#viewsCount
     */
    public DashboardUserUsageCounts setViewsCount(
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
     * @see DashboardUserUsageCounts.Fields#viewsCount
     */
    public DashboardUserUsageCounts setViewsCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field viewsCount of com.linkedin.dashboard.DashboardUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
            _viewsCountField = value;
        }
        return this;
    }

    /**
     * Setter for viewsCount
     * 
     * @see DashboardUserUsageCounts.Fields#viewsCount
     */
    public DashboardUserUsageCounts setViewsCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "viewsCount", DataTemplateUtil.coerceIntInput(value));
        _viewsCountField = value;
        return this;
    }

    /**
     * Existence checker for executionsCount
     * 
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    public boolean hasExecutionsCount() {
        if (_executionsCountField!= null) {
            return true;
        }
        return super._map.containsKey("executionsCount");
    }

    /**
     * Remover for executionsCount
     * 
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    public void removeExecutionsCount() {
        super._map.remove("executionsCount");
    }

    /**
     * Getter for executionsCount
     * 
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    @Nullable
    public Integer getExecutionsCount(GetMode mode) {
        return getExecutionsCount();
    }

    /**
     * Getter for executionsCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    @Nullable
    public Integer getExecutionsCount() {
        if (_executionsCountField!= null) {
            return _executionsCountField;
        } else {
            Object __rawValue = super._map.get("executionsCount");
            _executionsCountField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _executionsCountField;
        }
    }

    /**
     * Setter for executionsCount
     * 
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    public DashboardUserUsageCounts setExecutionsCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExecutionsCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExecutionsCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "executionsCount", DataTemplateUtil.coerceIntInput(value));
                    _executionsCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "executionsCount", DataTemplateUtil.coerceIntInput(value));
                    _executionsCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for executionsCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    public DashboardUserUsageCounts setExecutionsCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field executionsCount of com.linkedin.dashboard.DashboardUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "executionsCount", DataTemplateUtil.coerceIntInput(value));
            _executionsCountField = value;
        }
        return this;
    }

    /**
     * Setter for executionsCount
     * 
     * @see DashboardUserUsageCounts.Fields#executionsCount
     */
    public DashboardUserUsageCounts setExecutionsCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "executionsCount", DataTemplateUtil.coerceIntInput(value));
        _executionsCountField = value;
        return this;
    }

    /**
     * Existence checker for usageCount
     * 
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    public boolean hasUsageCount() {
        if (_usageCountField!= null) {
            return true;
        }
        return super._map.containsKey("usageCount");
    }

    /**
     * Remover for usageCount
     * 
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    public void removeUsageCount() {
        super._map.remove("usageCount");
    }

    /**
     * Getter for usageCount
     * 
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    @Nullable
    public Integer getUsageCount(GetMode mode) {
        return getUsageCount();
    }

    /**
     * Getter for usageCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    @Nullable
    public Integer getUsageCount() {
        if (_usageCountField!= null) {
            return _usageCountField;
        } else {
            Object __rawValue = super._map.get("usageCount");
            _usageCountField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _usageCountField;
        }
    }

    /**
     * Setter for usageCount
     * 
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    public DashboardUserUsageCounts setUsageCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUsageCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUsageCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "usageCount", DataTemplateUtil.coerceIntInput(value));
                    _usageCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "usageCount", DataTemplateUtil.coerceIntInput(value));
                    _usageCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for usageCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    public DashboardUserUsageCounts setUsageCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field usageCount of com.linkedin.dashboard.DashboardUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "usageCount", DataTemplateUtil.coerceIntInput(value));
            _usageCountField = value;
        }
        return this;
    }

    /**
     * Setter for usageCount
     * 
     * @see DashboardUserUsageCounts.Fields#usageCount
     */
    public DashboardUserUsageCounts setUsageCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "usageCount", DataTemplateUtil.coerceIntInput(value));
        _usageCountField = value;
        return this;
    }

    /**
     * Existence checker for userEmail
     * 
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    public boolean hasUserEmail() {
        if (_userEmailField!= null) {
            return true;
        }
        return super._map.containsKey("userEmail");
    }

    /**
     * Remover for userEmail
     * 
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    public void removeUserEmail() {
        super._map.remove("userEmail");
    }

    /**
     * Getter for userEmail
     * 
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    @Nullable
    public String getUserEmail(GetMode mode) {
        return getUserEmail();
    }

    /**
     * Getter for userEmail
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    @Nullable
    public String getUserEmail() {
        if (_userEmailField!= null) {
            return _userEmailField;
        } else {
            Object __rawValue = super._map.get("userEmail");
            _userEmailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userEmailField;
        }
    }

    /**
     * Setter for userEmail
     * 
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    public DashboardUserUsageCounts setUserEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserEmail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
                    _userEmailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
                    _userEmailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userEmail
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardUserUsageCounts.Fields#userEmail
     */
    public DashboardUserUsageCounts setUserEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userEmail of com.linkedin.dashboard.DashboardUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
            _userEmailField = value;
        }
        return this;
    }

    @Override
    public DashboardUserUsageCounts clone()
        throws CloneNotSupportedException
    {
        DashboardUserUsageCounts __clone = ((DashboardUserUsageCounts) super.clone());
        __clone.__changeListener = new DashboardUserUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DashboardUserUsageCounts copy()
        throws CloneNotSupportedException
    {
        DashboardUserUsageCounts __copy = ((DashboardUserUsageCounts) super.copy());
        __copy._viewsCountField = null;
        __copy._executionsCountField = null;
        __copy._userEmailField = null;
        __copy._userField = null;
        __copy._usageCountField = null;
        __copy.__changeListener = new DashboardUserUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DashboardUserUsageCounts __objectRef;

        private ChangeListener(DashboardUserUsageCounts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "viewsCount":
                    __objectRef._viewsCountField = null;
                    break;
                case "executionsCount":
                    __objectRef._executionsCountField = null;
                    break;
                case "userEmail":
                    __objectRef._userEmailField = null;
                    break;
                case "user":
                    __objectRef._userField = null;
                    break;
                case "usageCount":
                    __objectRef._usageCountField = null;
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
         * The number of times the user has viewed the dashboard
         * 
         */
        public PathSpec viewsCount() {
            return new PathSpec(getPathComponents(), "viewsCount");
        }

        /**
         * The number of times the user has executed (refreshed) the dashboard
         * 
         */
        public PathSpec executionsCount() {
            return new PathSpec(getPathComponents(), "executionsCount");
        }

        /**
         * Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. 
         * 
         */
        public PathSpec usageCount() {
            return new PathSpec(getPathComponents(), "usageCount");
        }

        /**
         * If user_email is set, we attempt to resolve the user's urn upon ingest
         * 
         */
        public PathSpec userEmail() {
            return new PathSpec(getPathComponents(), "userEmail");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * The unique id of the user.
         * 
         */
        public DashboardUserUsageCounts.ProjectionMask withUser() {
            getDataMap().put("user", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The number of times the user has viewed the dashboard
         * 
         */
        public DashboardUserUsageCounts.ProjectionMask withViewsCount() {
            getDataMap().put("viewsCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The number of times the user has executed (refreshed) the dashboard
         * 
         */
        public DashboardUserUsageCounts.ProjectionMask withExecutionsCount() {
            getDataMap().put("executionsCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. 
         * 
         */
        public DashboardUserUsageCounts.ProjectionMask withUsageCount() {
            getDataMap().put("usageCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If user_email is set, we attempt to resolve the user's urn upon ingest
         * 
         */
        public DashboardUserUsageCounts.ProjectionMask withUserEmail() {
            getDataMap().put("userEmail", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
