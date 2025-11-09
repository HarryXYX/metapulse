
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringMap;


/**
 * The inputs and outputs of this training run
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLTrainingRunProperties.pdl.")
public class MLTrainingRunProperties
    extends RecordTemplate
{

    private final static MLTrainingRunProperties.Fields _fields = new MLTrainingRunProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**The inputs and outputs of this training run*/@Aspect.name=\"mlTrainingRunProperties\"record MLTrainingRunProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Run Id of the ML Training Run*/id:optional string/**List of URLs for the Outputs of the ML Training Run*/outputUrls:optional array[string]/**Hyperparameters of the ML Training Run*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}}]/**Metrics of the ML Training Run*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _idField = null;
    private StringArray _outputUrlsField = null;
    private MLHyperParamArray _hyperParamsField = null;
    private MLMetricArray _trainingMetricsField = null;
    private MLTrainingRunProperties.ChangeListener __changeListener = new MLTrainingRunProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_OutputUrls = SCHEMA.getField("outputUrls");
    private final static RecordDataSchema.Field FIELD_HyperParams = SCHEMA.getField("hyperParams");
    private final static RecordDataSchema.Field FIELD_TrainingMetrics = SCHEMA.getField("trainingMetrics");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public MLTrainingRunProperties() {
        super(new DataMap(8, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public MLTrainingRunProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLTrainingRunProperties.Fields fields() {
        return _fields;
    }

    public static MLTrainingRunProperties.ProjectionMask createMask() {
        return new MLTrainingRunProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    public MLTrainingRunProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ml.metadata.MLTrainingRunProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#customProperties
     */
    public MLTrainingRunProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        if (_externalUrlField!= null) {
            return true;
        }
        return super._map.containsKey("externalUrl");
    }

    /**
     * Remover for externalUrl
     * 
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    public MLTrainingRunProperties setExternalUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#externalUrl
     */
    public MLTrainingRunProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for id
     * 
     * @see MLTrainingRunProperties.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see MLTrainingRunProperties.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see MLTrainingRunProperties.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        return getId();
    }

    /**
     * Getter for id
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLTrainingRunProperties.Fields#id
     */
    @Nullable
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see MLTrainingRunProperties.Fields#id
     */
    public MLTrainingRunProperties setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#id
     */
    public MLTrainingRunProperties setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputUrls
     * 
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    public boolean hasOutputUrls() {
        if (_outputUrlsField!= null) {
            return true;
        }
        return super._map.containsKey("outputUrls");
    }

    /**
     * Remover for outputUrls
     * 
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    public void removeOutputUrls() {
        super._map.remove("outputUrls");
    }

    /**
     * Getter for outputUrls
     * 
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    @Nullable
    public StringArray getOutputUrls(GetMode mode) {
        return getOutputUrls();
    }

    /**
     * Getter for outputUrls
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    @Nullable
    public StringArray getOutputUrls() {
        if (_outputUrlsField!= null) {
            return _outputUrlsField;
        } else {
            Object __rawValue = super._map.get("outputUrls");
            _outputUrlsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputUrlsField;
        }
    }

    /**
     * Setter for outputUrls
     * 
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    public MLTrainingRunProperties setOutputUrls(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputUrls(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputUrls();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputUrls", value.data());
                    _outputUrlsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputUrls", value.data());
                    _outputUrlsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputUrls
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#outputUrls
     */
    public MLTrainingRunProperties setOutputUrls(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputUrls of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputUrls", value.data());
            _outputUrlsField = value;
        }
        return this;
    }

    /**
     * Existence checker for hyperParams
     * 
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    public boolean hasHyperParams() {
        if (_hyperParamsField!= null) {
            return true;
        }
        return super._map.containsKey("hyperParams");
    }

    /**
     * Remover for hyperParams
     * 
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    public void removeHyperParams() {
        super._map.remove("hyperParams");
    }

    /**
     * Getter for hyperParams
     * 
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    @Nullable
    public MLHyperParamArray getHyperParams(GetMode mode) {
        return getHyperParams();
    }

    /**
     * Getter for hyperParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    @Nullable
    public MLHyperParamArray getHyperParams() {
        if (_hyperParamsField!= null) {
            return _hyperParamsField;
        } else {
            Object __rawValue = super._map.get("hyperParams");
            _hyperParamsField = ((__rawValue == null)?null:new MLHyperParamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _hyperParamsField;
        }
    }

    /**
     * Setter for hyperParams
     * 
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    public MLTrainingRunProperties setHyperParams(
        @Nullable
        MLHyperParamArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHyperParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHyperParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
                    _hyperParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
                    _hyperParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hyperParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#hyperParams
     */
    public MLTrainingRunProperties setHyperParams(
        @Nonnull
        MLHyperParamArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hyperParams of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hyperParams", value.data());
            _hyperParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for trainingMetrics
     * 
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    public boolean hasTrainingMetrics() {
        if (_trainingMetricsField!= null) {
            return true;
        }
        return super._map.containsKey("trainingMetrics");
    }

    /**
     * Remover for trainingMetrics
     * 
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    public void removeTrainingMetrics() {
        super._map.remove("trainingMetrics");
    }

    /**
     * Getter for trainingMetrics
     * 
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    @Nullable
    public MLMetricArray getTrainingMetrics(GetMode mode) {
        return getTrainingMetrics();
    }

    /**
     * Getter for trainingMetrics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    @Nullable
    public MLMetricArray getTrainingMetrics() {
        if (_trainingMetricsField!= null) {
            return _trainingMetricsField;
        } else {
            Object __rawValue = super._map.get("trainingMetrics");
            _trainingMetricsField = ((__rawValue == null)?null:new MLMetricArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _trainingMetricsField;
        }
    }

    /**
     * Setter for trainingMetrics
     * 
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    public MLTrainingRunProperties setTrainingMetrics(
        @Nullable
        MLMetricArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTrainingMetrics(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTrainingMetrics();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
                    _trainingMetricsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
                    _trainingMetricsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for trainingMetrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLTrainingRunProperties.Fields#trainingMetrics
     */
    public MLTrainingRunProperties setTrainingMetrics(
        @Nonnull
        MLMetricArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field trainingMetrics of com.linkedin.ml.metadata.MLTrainingRunProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "trainingMetrics", value.data());
            _trainingMetricsField = value;
        }
        return this;
    }

    @Override
    public MLTrainingRunProperties clone()
        throws CloneNotSupportedException
    {
        MLTrainingRunProperties __clone = ((MLTrainingRunProperties) super.clone());
        __clone.__changeListener = new MLTrainingRunProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLTrainingRunProperties copy()
        throws CloneNotSupportedException
    {
        MLTrainingRunProperties __copy = ((MLTrainingRunProperties) super.copy());
        __copy._externalUrlField = null;
        __copy._trainingMetricsField = null;
        __copy._customPropertiesField = null;
        __copy._outputUrlsField = null;
        __copy._idField = null;
        __copy._hyperParamsField = null;
        __copy.__changeListener = new MLTrainingRunProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLTrainingRunProperties __objectRef;

        private ChangeListener(MLTrainingRunProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "trainingMetrics":
                    __objectRef._trainingMetricsField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "outputUrls":
                    __objectRef._outputUrlsField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
                    break;
                case "hyperParams":
                    __objectRef._hyperParamsField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Run Id of the ML Training Run
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * List of URLs for the Outputs of the ML Training Run
         * 
         */
        public PathSpec outputUrls() {
            return new PathSpec(getPathComponents(), "outputUrls");
        }

        /**
         * List of URLs for the Outputs of the ML Training Run
         * 
         */
        public PathSpec outputUrls(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputUrls");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public com.linkedin.ml.metadata.MLHyperParamArray.Fields hyperParams() {
            return new com.linkedin.ml.metadata.MLHyperParamArray.Fields(getPathComponents(), "hyperParams");
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public PathSpec hyperParams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "hyperParams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public com.linkedin.ml.metadata.MLMetricArray.Fields trainingMetrics() {
            return new com.linkedin.ml.metadata.MLMetricArray.Fields(getPathComponents(), "trainingMetrics");
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public PathSpec trainingMetrics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingMetrics");
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

        private com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask _hyperParamsMask;
        private com.linkedin.ml.metadata.MLMetricArray.ProjectionMask _trainingMetricsMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * Custom property bag.
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Run Id of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of URLs for the Outputs of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withOutputUrls() {
            getDataMap().put("outputUrls", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of URLs for the Outputs of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withOutputUrls(Integer start, Integer count) {
            getDataMap().put("outputUrls", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputUrls").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputUrls").put("$count", count);
            }
            return this;
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withHyperParams(Function<com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask, com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask> nestedMask) {
            _hyperParamsMask = nestedMask.apply(((_hyperParamsMask == null)?MLHyperParamArray.createMask():_hyperParamsMask));
            getDataMap().put("hyperParams", _hyperParamsMask.getDataMap());
            return this;
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withHyperParams() {
            _hyperParamsMask = null;
            getDataMap().put("hyperParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withHyperParams(Function<com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask, com.linkedin.ml.metadata.MLHyperParamArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _hyperParamsMask = nestedMask.apply(((_hyperParamsMask == null)?MLHyperParamArray.createMask():_hyperParamsMask));
            getDataMap().put("hyperParams", _hyperParamsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("hyperParams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("hyperParams").put("$count", count);
            }
            return this;
        }

        /**
         * Hyperparameters of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withHyperParams(Integer start, Integer count) {
            _hyperParamsMask = null;
            getDataMap().put("hyperParams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("hyperParams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("hyperParams").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withTrainingMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask) {
            _trainingMetricsMask = nestedMask.apply(((_trainingMetricsMask == null)?MLMetricArray.createMask():_trainingMetricsMask));
            getDataMap().put("trainingMetrics", _trainingMetricsMask.getDataMap());
            return this;
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withTrainingMetrics() {
            _trainingMetricsMask = null;
            getDataMap().put("trainingMetrics", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withTrainingMetrics(Function<com.linkedin.ml.metadata.MLMetricArray.ProjectionMask, com.linkedin.ml.metadata.MLMetricArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _trainingMetricsMask = nestedMask.apply(((_trainingMetricsMask == null)?MLMetricArray.createMask():_trainingMetricsMask));
            getDataMap().put("trainingMetrics", _trainingMetricsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$count", count);
            }
            return this;
        }

        /**
         * Metrics of the ML Training Run
         * 
         */
        public MLTrainingRunProperties.ProjectionMask withTrainingMetrics(Integer start, Integer count) {
            _trainingMetricsMask = null;
            getDataMap().put("trainingMetrics", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingMetrics").put("$count", count);
            }
            return this;
        }

    }

}
