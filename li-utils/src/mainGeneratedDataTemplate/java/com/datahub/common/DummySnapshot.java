
package com.datahub.common;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * For DummyMetadataEventProducer. Should not use the model directly.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/datahub/common/DummySnapshot.pdl.")
public class DummySnapshot
    extends RecordTemplate
{

    private final static DummySnapshot.Fields _fields = new DummySnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.datahub.common/**For DummyMetadataEventProducer. Should not use the model directly.*/record DummySnapshot{/**Not to be used*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Not to be used*/aspects:array[/**Not to be used*/typeref DummyAspect=union[com.linkedin.common.Urn]]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnField = null;
    private DummyAspectArray _aspectsField = null;
    private DummySnapshot.ChangeListener __changeListener = new DummySnapshot.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DummySnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DummySnapshot(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DummySnapshot.Fields fields() {
        return _fields;
    }

    public static DummySnapshot.ProjectionMask createMask() {
        return new DummySnapshot.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see DummySnapshot.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see DummySnapshot.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see DummySnapshot.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DummySnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see DummySnapshot.Fields#urn
     */
    public DummySnapshot setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.datahub.common.DummySnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DummySnapshot.Fields#urn
     */
    public DummySnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.datahub.common.DummySnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see DummySnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        if (_aspectsField!= null) {
            return true;
        }
        return super._map.containsKey("aspects");
    }

    /**
     * Remover for aspects
     * 
     * @see DummySnapshot.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see DummySnapshot.Fields#aspects
     */
    @Nullable
    public DummyAspectArray getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new DummyAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aspectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DummySnapshot.Fields#aspects
     */
    @Nonnull
    public DummyAspectArray getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new DummyAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see DummySnapshot.Fields#aspects
     */
    public DummySnapshot setAspects(
        @Nullable
        DummyAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.datahub.common.DummySnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DummySnapshot.Fields#aspects
     */
    public DummySnapshot setAspects(
        @Nonnull
        DummyAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.datahub.common.DummySnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public DummySnapshot clone()
        throws CloneNotSupportedException
    {
        DummySnapshot __clone = ((DummySnapshot) super.clone());
        __clone.__changeListener = new DummySnapshot.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DummySnapshot copy()
        throws CloneNotSupportedException
    {
        DummySnapshot __copy = ((DummySnapshot) super.copy());
        __copy._urnField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new DummySnapshot.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DummySnapshot __objectRef;

        private ChangeListener(DummySnapshot reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "aspects":
                    __objectRef._aspectsField = null;
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
         * Not to be used
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Not to be used
         * 
         */
        public com.datahub.common.DummyAspectArray.Fields aspects() {
            return new com.datahub.common.DummyAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * Not to be used
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
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

        private com.datahub.common.DummyAspectArray.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Not to be used
         * 
         */
        public DummySnapshot.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Not to be used
         * 
         */
        public DummySnapshot.ProjectionMask withAspects(Function<com.datahub.common.DummyAspectArray.ProjectionMask, com.datahub.common.DummyAspectArray.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?DummyAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * Not to be used
         * 
         */
        public DummySnapshot.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Not to be used
         * 
         */
        public DummySnapshot.ProjectionMask withAspects(Function<com.datahub.common.DummyAspectArray.ProjectionMask, com.datahub.common.DummyAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?DummyAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

        /**
         * Not to be used
         * 
         */
        public DummySnapshot.ProjectionMask withAspects(Integer start, Integer count) {
            _aspectsMask = null;
            getDataMap().put("aspects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

    }

}
