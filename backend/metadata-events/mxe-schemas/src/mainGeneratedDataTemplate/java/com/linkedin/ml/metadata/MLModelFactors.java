
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Factors affecting the performance of the MLModel.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelFactors.pdl.")
public class MLModelFactors
    extends RecordTemplate
{

    private final static MLModelFactors.Fields _fields = new MLModelFactors.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _groupsField = null;
    private StringArray _instrumentationField = null;
    private StringArray _environmentField = null;
    private MLModelFactors.ChangeListener __changeListener = new MLModelFactors.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Instrumentation = SCHEMA.getField("instrumentation");
    private final static RecordDataSchema.Field FIELD_Environment = SCHEMA.getField("environment");

    public MLModelFactors() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public MLModelFactors(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelFactors.Fields fields() {
        return _fields;
    }

    public static MLModelFactors.ProjectionMask createMask() {
        return new MLModelFactors.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    @Nullable
    public StringArray getGroups(GetMode mode) {
        return getGroups();
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#groups
     */
    @Nullable
    public StringArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            _groupsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public MLModelFactors setGroups(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#groups
     */
    public MLModelFactors setGroups(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.ml.metadata.MLModelFactors to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public boolean hasInstrumentation() {
        if (_instrumentationField!= null) {
            return true;
        }
        return super._map.containsKey("instrumentation");
    }

    /**
     * Remover for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public void removeInstrumentation() {
        super._map.remove("instrumentation");
    }

    /**
     * Getter for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    @Nullable
    public StringArray getInstrumentation(GetMode mode) {
        return getInstrumentation();
    }

    /**
     * Getter for instrumentation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#instrumentation
     */
    @Nullable
    public StringArray getInstrumentation() {
        if (_instrumentationField!= null) {
            return _instrumentationField;
        } else {
            Object __rawValue = super._map.get("instrumentation");
            _instrumentationField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _instrumentationField;
        }
    }

    /**
     * Setter for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public MLModelFactors setInstrumentation(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInstrumentation(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInstrumentation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "instrumentation", value.data());
                    _instrumentationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "instrumentation", value.data());
                    _instrumentationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for instrumentation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#instrumentation
     */
    public MLModelFactors setInstrumentation(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field instrumentation of com.linkedin.ml.metadata.MLModelFactors to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "instrumentation", value.data());
            _instrumentationField = value;
        }
        return this;
    }

    /**
     * Existence checker for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public boolean hasEnvironment() {
        if (_environmentField!= null) {
            return true;
        }
        return super._map.containsKey("environment");
    }

    /**
     * Remover for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public void removeEnvironment() {
        super._map.remove("environment");
    }

    /**
     * Getter for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    @Nullable
    public StringArray getEnvironment(GetMode mode) {
        return getEnvironment();
    }

    /**
     * Getter for environment
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#environment
     */
    @Nullable
    public StringArray getEnvironment() {
        if (_environmentField!= null) {
            return _environmentField;
        } else {
            Object __rawValue = super._map.get("environment");
            _environmentField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _environmentField;
        }
    }

    /**
     * Setter for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public MLModelFactors setEnvironment(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnvironment(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnvironment();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "environment", value.data());
                    _environmentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "environment", value.data());
                    _environmentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for environment
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#environment
     */
    public MLModelFactors setEnvironment(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field environment of com.linkedin.ml.metadata.MLModelFactors to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "environment", value.data());
            _environmentField = value;
        }
        return this;
    }

    @Override
    public MLModelFactors clone()
        throws CloneNotSupportedException
    {
        MLModelFactors __clone = ((MLModelFactors) super.clone());
        __clone.__changeListener = new MLModelFactors.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelFactors copy()
        throws CloneNotSupportedException
    {
        MLModelFactors __copy = ((MLModelFactors) super.copy());
        __copy._environmentField = null;
        __copy._groupsField = null;
        __copy._instrumentationField = null;
        __copy.__changeListener = new MLModelFactors.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelFactors __objectRef;

        private ChangeListener(MLModelFactors reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "environment":
                    __objectRef._environmentField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "instrumentation":
                    __objectRef._instrumentationField = null;
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
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera's hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public PathSpec instrumentation() {
            return new PathSpec(getPathComponents(), "instrumentation");
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera's hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public PathSpec instrumentation(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "instrumentation");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public PathSpec environment() {
            return new PathSpec(getPathComponents(), "environment");
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public PathSpec environment(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "environment");
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
            super(4);
        }

        /**
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public MLModelFactors.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public MLModelFactors.ProjectionMask withGroups(Integer start, Integer count) {
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera's hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public MLModelFactors.ProjectionMask withInstrumentation() {
            getDataMap().put("instrumentation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera's hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public MLModelFactors.ProjectionMask withInstrumentation(Integer start, Integer count) {
            getDataMap().put("instrumentation", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("instrumentation").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("instrumentation").put("$count", count);
            }
            return this;
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public MLModelFactors.ProjectionMask withEnvironment() {
            getDataMap().put("environment", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public MLModelFactors.ProjectionMask withEnvironment(Integer start, Integer count) {
            getDataMap().put("environment", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("environment").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("environment").put("$count", count);
            }
            return this;
        }

    }

}
