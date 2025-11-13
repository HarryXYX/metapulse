
package com.linkedin.assertion;

import java.util.List;
import java.util.function.Function;
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


/**
 * The Actions about an Assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionActions.pdl.")
public class AssertionActions
    extends RecordTemplate
{

    private final static AssertionActions.Fields _fields = new AssertionActions.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**The Actions about an Assertion*/@Aspect.name=\"assertionActions\"record AssertionActions{/**Actions to be executed on successful assertion run.*/onSuccess:array[/**The Actions about an Assertion.\nIn the future, we'll likely extend this model to support additional\nparameters or options related to the assertion actions.*/record AssertionAction{/**The type of the Action*/type:enum AssertionActionType{/**Raise an incident.*/RAISE_INCIDENT/**Resolve open incidents related to the assertion.*/RESOLVE_INCIDENT}}]=[]/**Actions to be executed on failed assertion run.*/onFailure:array[AssertionAction]=[]}", SchemaFormatType.PDL));
    private AssertionActionArray _onSuccessField = null;
    private AssertionActionArray _onFailureField = null;
    private AssertionActions.ChangeListener __changeListener = new AssertionActions.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_OnSuccess = SCHEMA.getField("onSuccess");
    private final static AssertionActionArray DEFAULT_OnSuccess;
    private final static RecordDataSchema.Field FIELD_OnFailure = SCHEMA.getField("onFailure");
    private final static AssertionActionArray DEFAULT_OnFailure;

    static {
        DEFAULT_OnSuccess = ((FIELD_OnSuccess.getDefault() == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(FIELD_OnSuccess.getDefault(), DataList.class)));
        DEFAULT_OnFailure = ((FIELD_OnFailure.getDefault() == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(FIELD_OnFailure.getDefault(), DataList.class)));
    }

    public AssertionActions() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public AssertionActions(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionActions.Fields fields() {
        return _fields;
    }

    public static AssertionActions.ProjectionMask createMask() {
        return new AssertionActions.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for onSuccess
     * 
     * @see AssertionActions.Fields#onSuccess
     */
    public boolean hasOnSuccess() {
        if (_onSuccessField!= null) {
            return true;
        }
        return super._map.containsKey("onSuccess");
    }

    /**
     * Remover for onSuccess
     * 
     * @see AssertionActions.Fields#onSuccess
     */
    public void removeOnSuccess() {
        super._map.remove("onSuccess");
    }

    /**
     * Getter for onSuccess
     * 
     * @see AssertionActions.Fields#onSuccess
     */
    @Nullable
    public AssertionActionArray getOnSuccess(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getOnSuccess();
            case NULL:
                if (_onSuccessField!= null) {
                    return _onSuccessField;
                } else {
                    Object __rawValue = super._map.get("onSuccess");
                    _onSuccessField = ((__rawValue == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _onSuccessField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for onSuccess
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionActions.Fields#onSuccess
     */
    @Nonnull
    public AssertionActionArray getOnSuccess() {
        if (_onSuccessField!= null) {
            return _onSuccessField;
        } else {
            Object __rawValue = super._map.get("onSuccess");
            if (__rawValue == null) {
                return DEFAULT_OnSuccess;
            }
            _onSuccessField = ((__rawValue == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _onSuccessField;
        }
    }

    /**
     * Setter for onSuccess
     * 
     * @see AssertionActions.Fields#onSuccess
     */
    public AssertionActions setOnSuccess(
        @Nullable
        AssertionActionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOnSuccess(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field onSuccess of com.linkedin.assertion.AssertionActions");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "onSuccess", value.data());
                    _onSuccessField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOnSuccess();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "onSuccess", value.data());
                    _onSuccessField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "onSuccess", value.data());
                    _onSuccessField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for onSuccess
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionActions.Fields#onSuccess
     */
    public AssertionActions setOnSuccess(
        @Nonnull
        AssertionActionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field onSuccess of com.linkedin.assertion.AssertionActions to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "onSuccess", value.data());
            _onSuccessField = value;
        }
        return this;
    }

    /**
     * Existence checker for onFailure
     * 
     * @see AssertionActions.Fields#onFailure
     */
    public boolean hasOnFailure() {
        if (_onFailureField!= null) {
            return true;
        }
        return super._map.containsKey("onFailure");
    }

    /**
     * Remover for onFailure
     * 
     * @see AssertionActions.Fields#onFailure
     */
    public void removeOnFailure() {
        super._map.remove("onFailure");
    }

    /**
     * Getter for onFailure
     * 
     * @see AssertionActions.Fields#onFailure
     */
    @Nullable
    public AssertionActionArray getOnFailure(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getOnFailure();
            case NULL:
                if (_onFailureField!= null) {
                    return _onFailureField;
                } else {
                    Object __rawValue = super._map.get("onFailure");
                    _onFailureField = ((__rawValue == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _onFailureField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for onFailure
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionActions.Fields#onFailure
     */
    @Nonnull
    public AssertionActionArray getOnFailure() {
        if (_onFailureField!= null) {
            return _onFailureField;
        } else {
            Object __rawValue = super._map.get("onFailure");
            if (__rawValue == null) {
                return DEFAULT_OnFailure;
            }
            _onFailureField = ((__rawValue == null)?null:new AssertionActionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _onFailureField;
        }
    }

    /**
     * Setter for onFailure
     * 
     * @see AssertionActions.Fields#onFailure
     */
    public AssertionActions setOnFailure(
        @Nullable
        AssertionActionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOnFailure(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field onFailure of com.linkedin.assertion.AssertionActions");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "onFailure", value.data());
                    _onFailureField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOnFailure();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "onFailure", value.data());
                    _onFailureField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "onFailure", value.data());
                    _onFailureField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for onFailure
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionActions.Fields#onFailure
     */
    public AssertionActions setOnFailure(
        @Nonnull
        AssertionActionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field onFailure of com.linkedin.assertion.AssertionActions to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "onFailure", value.data());
            _onFailureField = value;
        }
        return this;
    }

    @Override
    public AssertionActions clone()
        throws CloneNotSupportedException
    {
        AssertionActions __clone = ((AssertionActions) super.clone());
        __clone.__changeListener = new AssertionActions.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionActions copy()
        throws CloneNotSupportedException
    {
        AssertionActions __copy = ((AssertionActions) super.copy());
        __copy._onFailureField = null;
        __copy._onSuccessField = null;
        __copy.__changeListener = new AssertionActions.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionActions __objectRef;

        private ChangeListener(AssertionActions reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "onFailure":
                    __objectRef._onFailureField = null;
                    break;
                case "onSuccess":
                    __objectRef._onSuccessField = null;
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
         * Actions to be executed on successful assertion run.
         * 
         */
        public com.linkedin.assertion.AssertionActionArray.Fields onSuccess() {
            return new com.linkedin.assertion.AssertionActionArray.Fields(getPathComponents(), "onSuccess");
        }

        /**
         * Actions to be executed on successful assertion run.
         * 
         */
        public PathSpec onSuccess(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "onSuccess");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public com.linkedin.assertion.AssertionActionArray.Fields onFailure() {
            return new com.linkedin.assertion.AssertionActionArray.Fields(getPathComponents(), "onFailure");
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public PathSpec onFailure(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "onFailure");
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

        private com.linkedin.assertion.AssertionActionArray.ProjectionMask _onSuccessMask;
        private com.linkedin.assertion.AssertionActionArray.ProjectionMask _onFailureMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Actions to be executed on successful assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnSuccess(Function<com.linkedin.assertion.AssertionActionArray.ProjectionMask, com.linkedin.assertion.AssertionActionArray.ProjectionMask> nestedMask) {
            _onSuccessMask = nestedMask.apply(((_onSuccessMask == null)?AssertionActionArray.createMask():_onSuccessMask));
            getDataMap().put("onSuccess", _onSuccessMask.getDataMap());
            return this;
        }

        /**
         * Actions to be executed on successful assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnSuccess() {
            _onSuccessMask = null;
            getDataMap().put("onSuccess", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Actions to be executed on successful assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnSuccess(Function<com.linkedin.assertion.AssertionActionArray.ProjectionMask, com.linkedin.assertion.AssertionActionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _onSuccessMask = nestedMask.apply(((_onSuccessMask == null)?AssertionActionArray.createMask():_onSuccessMask));
            getDataMap().put("onSuccess", _onSuccessMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("onSuccess").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onSuccess").put("$count", count);
            }
            return this;
        }

        /**
         * Actions to be executed on successful assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnSuccess(Integer start, Integer count) {
            _onSuccessMask = null;
            getDataMap().put("onSuccess", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("onSuccess").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onSuccess").put("$count", count);
            }
            return this;
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnFailure(Function<com.linkedin.assertion.AssertionActionArray.ProjectionMask, com.linkedin.assertion.AssertionActionArray.ProjectionMask> nestedMask) {
            _onFailureMask = nestedMask.apply(((_onFailureMask == null)?AssertionActionArray.createMask():_onFailureMask));
            getDataMap().put("onFailure", _onFailureMask.getDataMap());
            return this;
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnFailure() {
            _onFailureMask = null;
            getDataMap().put("onFailure", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnFailure(Function<com.linkedin.assertion.AssertionActionArray.ProjectionMask, com.linkedin.assertion.AssertionActionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _onFailureMask = nestedMask.apply(((_onFailureMask == null)?AssertionActionArray.createMask():_onFailureMask));
            getDataMap().put("onFailure", _onFailureMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("onFailure").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onFailure").put("$count", count);
            }
            return this;
        }

        /**
         * Actions to be executed on failed assertion run.
         * 
         */
        public AssertionActions.ProjectionMask withOnFailure(Integer start, Integer count) {
            _onFailureMask = null;
            getDataMap().put("onFailure", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("onFailure").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("onFailure").put("$count", count);
            }
            return this;
        }

    }

}
