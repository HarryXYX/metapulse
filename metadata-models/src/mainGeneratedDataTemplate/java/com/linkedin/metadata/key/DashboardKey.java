
package com.linkedin.metadata.key;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Dashboard
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DashboardKey.pdl.")
public class DashboardKey
    extends RecordTemplate
{

    private final static DashboardKey.Fields _fields = new DashboardKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}", SchemaFormatType.PDL));
    private String _dashboardToolField = null;
    private String _dashboardIdField = null;
    private DashboardKey.ChangeListener __changeListener = new DashboardKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_DashboardId = SCHEMA.getField("dashboardId");

    public DashboardKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DashboardKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DashboardKey.Fields fields() {
        return _fields;
    }

    public static DashboardKey.ProjectionMask createMask() {
        return new DashboardKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public boolean hasDashboardTool() {
        if (_dashboardToolField!= null) {
            return true;
        }
        return super._map.containsKey("dashboardTool");
    }

    /**
     * Remover for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        super._map.remove("dashboardTool");
    }

    /**
     * Getter for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    @Nullable
    public String getDashboardTool(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDashboardTool();
            case DEFAULT:
            case NULL:
                if (_dashboardToolField!= null) {
                    return _dashboardToolField;
                } else {
                    Object __rawValue = super._map.get("dashboardTool");
                    _dashboardToolField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _dashboardToolField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dashboardTool
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardKey.Fields#dashboardTool
     */
    @Nonnull
    public String getDashboardTool() {
        if (_dashboardToolField!= null) {
            return _dashboardToolField;
        } else {
            Object __rawValue = super._map.get("dashboardTool");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dashboardTool");
            }
            _dashboardToolField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _dashboardToolField;
        }
    }

    /**
     * Setter for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public DashboardKey setDashboardTool(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDashboardTool(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dashboardTool of com.linkedin.metadata.key.DashboardKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardTool", value);
                    _dashboardToolField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDashboardTool();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardTool", value);
                    _dashboardToolField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardTool", value);
                    _dashboardToolField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dashboardTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardKey.Fields#dashboardTool
     */
    public DashboardKey setDashboardTool(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dashboardTool of com.linkedin.metadata.key.DashboardKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dashboardTool", value);
            _dashboardToolField = value;
        }
        return this;
    }

    /**
     * Existence checker for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public boolean hasDashboardId() {
        if (_dashboardIdField!= null) {
            return true;
        }
        return super._map.containsKey("dashboardId");
    }

    /**
     * Remover for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public void removeDashboardId() {
        super._map.remove("dashboardId");
    }

    /**
     * Getter for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    @Nullable
    public String getDashboardId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDashboardId();
            case DEFAULT:
            case NULL:
                if (_dashboardIdField!= null) {
                    return _dashboardIdField;
                } else {
                    Object __rawValue = super._map.get("dashboardId");
                    _dashboardIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _dashboardIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dashboardId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardKey.Fields#dashboardId
     */
    @Nonnull
    public String getDashboardId() {
        if (_dashboardIdField!= null) {
            return _dashboardIdField;
        } else {
            Object __rawValue = super._map.get("dashboardId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dashboardId");
            }
            _dashboardIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _dashboardIdField;
        }
    }

    /**
     * Setter for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public DashboardKey setDashboardId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDashboardId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dashboardId of com.linkedin.metadata.key.DashboardKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardId", value);
                    _dashboardIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDashboardId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardId", value);
                    _dashboardIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dashboardId", value);
                    _dashboardIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dashboardId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardKey.Fields#dashboardId
     */
    public DashboardKey setDashboardId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dashboardId of com.linkedin.metadata.key.DashboardKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dashboardId", value);
            _dashboardIdField = value;
        }
        return this;
    }

    @Override
    public DashboardKey clone()
        throws CloneNotSupportedException
    {
        DashboardKey __clone = ((DashboardKey) super.clone());
        __clone.__changeListener = new DashboardKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DashboardKey copy()
        throws CloneNotSupportedException
    {
        DashboardKey __copy = ((DashboardKey) super.copy());
        __copy._dashboardIdField = null;
        __copy._dashboardToolField = null;
        __copy.__changeListener = new DashboardKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DashboardKey __objectRef;

        private ChangeListener(DashboardKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "dashboardId":
                    __objectRef._dashboardIdField = null;
                    break;
                case "dashboardTool":
                    __objectRef._dashboardToolField = null;
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
         * The name of the dashboard tool such as looker, redash etc.
         * 
         */
        public PathSpec dashboardTool() {
            return new PathSpec(getPathComponents(), "dashboardTool");
        }

        /**
         * Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'
         * 
         */
        public PathSpec dashboardId() {
            return new PathSpec(getPathComponents(), "dashboardId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The name of the dashboard tool such as looker, redash etc.
         * 
         */
        public DashboardKey.ProjectionMask withDashboardTool() {
            getDataMap().put("dashboardTool", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'
         * 
         */
        public DashboardKey.ProjectionMask withDashboardId() {
            getDataMap().put("dashboardId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
