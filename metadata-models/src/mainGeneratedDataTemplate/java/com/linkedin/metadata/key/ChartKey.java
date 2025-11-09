
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
 * Key for a Chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/ChartKey.pdl.")
public class ChartKey
    extends RecordTemplate
{

    private final static ChartKey.Fields _fields = new ChartKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}", SchemaFormatType.PDL));
    private String _dashboardToolField = null;
    private String _chartIdField = null;
    private ChartKey.ChangeListener __changeListener = new ChartKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_ChartId = SCHEMA.getField("chartId");

    public ChartKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ChartKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ChartKey.Fields fields() {
        return _fields;
    }

    public static ChartKey.ProjectionMask createMask() {
        return new ChartKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
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
     * @see ChartKey.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        super._map.remove("dashboardTool");
    }

    /**
     * Getter for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
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
     * @see ChartKey.Fields#dashboardTool
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
     * @see ChartKey.Fields#dashboardTool
     */
    public ChartKey setDashboardTool(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDashboardTool(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dashboardTool of com.linkedin.metadata.key.ChartKey");
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
     * @see ChartKey.Fields#dashboardTool
     */
    public ChartKey setDashboardTool(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dashboardTool of com.linkedin.metadata.key.ChartKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dashboardTool", value);
            _dashboardToolField = value;
        }
        return this;
    }

    /**
     * Existence checker for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public boolean hasChartId() {
        if (_chartIdField!= null) {
            return true;
        }
        return super._map.containsKey("chartId");
    }

    /**
     * Remover for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public void removeChartId() {
        super._map.remove("chartId");
    }

    /**
     * Getter for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    @Nullable
    public String getChartId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getChartId();
            case DEFAULT:
            case NULL:
                if (_chartIdField!= null) {
                    return _chartIdField;
                } else {
                    Object __rawValue = super._map.get("chartId");
                    _chartIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _chartIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for chartId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartKey.Fields#chartId
     */
    @Nonnull
    public String getChartId() {
        if (_chartIdField!= null) {
            return _chartIdField;
        } else {
            Object __rawValue = super._map.get("chartId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("chartId");
            }
            _chartIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _chartIdField;
        }
    }

    /**
     * Setter for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public ChartKey setChartId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChartId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field chartId of com.linkedin.metadata.key.ChartKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "chartId", value);
                    _chartIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChartId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "chartId", value);
                    _chartIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "chartId", value);
                    _chartIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for chartId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartKey.Fields#chartId
     */
    public ChartKey setChartId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field chartId of com.linkedin.metadata.key.ChartKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "chartId", value);
            _chartIdField = value;
        }
        return this;
    }

    @Override
    public ChartKey clone()
        throws CloneNotSupportedException
    {
        ChartKey __clone = ((ChartKey) super.clone());
        __clone.__changeListener = new ChartKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartKey copy()
        throws CloneNotSupportedException
    {
        ChartKey __copy = ((ChartKey) super.copy());
        __copy._chartIdField = null;
        __copy._dashboardToolField = null;
        __copy.__changeListener = new ChartKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartKey __objectRef;

        private ChangeListener(ChartKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "chartId":
                    __objectRef._chartIdField = null;
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
         * Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'
         * 
         */
        public PathSpec chartId() {
            return new PathSpec(getPathComponents(), "chartId");
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
        public ChartKey.ProjectionMask withDashboardTool() {
            getDataMap().put("dashboardTool", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'
         * 
         */
        public ChartKey.ProjectionMask withChartId() {
            getDataMap().put("chartId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
