
package com.linkedin.dataset;

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
import com.linkedin.data.template.FloatArray;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class Histogram
    extends RecordTemplate
{

    private final static Histogram.Fields _fields = new Histogram.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record Histogram{boundaries:array[string]heights:array[float]}", SchemaFormatType.PDL));
    private StringArray _boundariesField = null;
    private FloatArray _heightsField = null;
    private Histogram.ChangeListener __changeListener = new Histogram.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Boundaries = SCHEMA.getField("boundaries");
    private final static RecordDataSchema.Field FIELD_Heights = SCHEMA.getField("heights");

    public Histogram() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public Histogram(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Histogram.Fields fields() {
        return _fields;
    }

    public static Histogram.ProjectionMask createMask() {
        return new Histogram.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public boolean hasBoundaries() {
        if (_boundariesField!= null) {
            return true;
        }
        return super._map.containsKey("boundaries");
    }

    /**
     * Remover for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public void removeBoundaries() {
        super._map.remove("boundaries");
    }

    /**
     * Getter for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    @Nullable
    public StringArray getBoundaries(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBoundaries();
            case DEFAULT:
            case NULL:
                if (_boundariesField!= null) {
                    return _boundariesField;
                } else {
                    Object __rawValue = super._map.get("boundaries");
                    _boundariesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _boundariesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for boundaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Histogram.Fields#boundaries
     */
    @Nonnull
    public StringArray getBoundaries() {
        if (_boundariesField!= null) {
            return _boundariesField;
        } else {
            Object __rawValue = super._map.get("boundaries");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("boundaries");
            }
            _boundariesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _boundariesField;
        }
    }

    /**
     * Setter for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public Histogram setBoundaries(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBoundaries(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field boundaries of com.linkedin.dataset.Histogram");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "boundaries", value.data());
                    _boundariesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBoundaries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "boundaries", value.data());
                    _boundariesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "boundaries", value.data());
                    _boundariesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for boundaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Histogram.Fields#boundaries
     */
    public Histogram setBoundaries(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field boundaries of com.linkedin.dataset.Histogram to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "boundaries", value.data());
            _boundariesField = value;
        }
        return this;
    }

    /**
     * Existence checker for heights
     * 
     * @see Histogram.Fields#heights
     */
    public boolean hasHeights() {
        if (_heightsField!= null) {
            return true;
        }
        return super._map.containsKey("heights");
    }

    /**
     * Remover for heights
     * 
     * @see Histogram.Fields#heights
     */
    public void removeHeights() {
        super._map.remove("heights");
    }

    /**
     * Getter for heights
     * 
     * @see Histogram.Fields#heights
     */
    @Nullable
    public FloatArray getHeights(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getHeights();
            case DEFAULT:
            case NULL:
                if (_heightsField!= null) {
                    return _heightsField;
                } else {
                    Object __rawValue = super._map.get("heights");
                    _heightsField = ((__rawValue == null)?null:new FloatArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _heightsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for heights
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Histogram.Fields#heights
     */
    @Nonnull
    public FloatArray getHeights() {
        if (_heightsField!= null) {
            return _heightsField;
        } else {
            Object __rawValue = super._map.get("heights");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("heights");
            }
            _heightsField = ((__rawValue == null)?null:new FloatArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _heightsField;
        }
    }

    /**
     * Setter for heights
     * 
     * @see Histogram.Fields#heights
     */
    public Histogram setHeights(
        @Nullable
        FloatArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHeights(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field heights of com.linkedin.dataset.Histogram");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "heights", value.data());
                    _heightsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHeights();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "heights", value.data());
                    _heightsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "heights", value.data());
                    _heightsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for heights
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Histogram.Fields#heights
     */
    public Histogram setHeights(
        @Nonnull
        FloatArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field heights of com.linkedin.dataset.Histogram to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "heights", value.data());
            _heightsField = value;
        }
        return this;
    }

    @Override
    public Histogram clone()
        throws CloneNotSupportedException
    {
        Histogram __clone = ((Histogram) super.clone());
        __clone.__changeListener = new Histogram.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Histogram copy()
        throws CloneNotSupportedException
    {
        Histogram __copy = ((Histogram) super.copy());
        __copy._heightsField = null;
        __copy._boundariesField = null;
        __copy.__changeListener = new Histogram.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Histogram __objectRef;

        private ChangeListener(Histogram reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "heights":
                    __objectRef._heightsField = null;
                    break;
                case "boundaries":
                    __objectRef._boundariesField = null;
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

        public PathSpec boundaries() {
            return new PathSpec(getPathComponents(), "boundaries");
        }

        public PathSpec boundaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "boundaries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public PathSpec heights() {
            return new PathSpec(getPathComponents(), "heights");
        }

        public PathSpec heights(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "heights");
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

        public Histogram.ProjectionMask withBoundaries() {
            getDataMap().put("boundaries", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Histogram.ProjectionMask withBoundaries(Integer start, Integer count) {
            getDataMap().put("boundaries", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("boundaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("boundaries").put("$count", count);
            }
            return this;
        }

        public Histogram.ProjectionMask withHeights() {
            getDataMap().put("heights", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Histogram.ProjectionMask withHeights(Integer start, Integer count) {
            getDataMap().put("heights", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("heights").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("heights").put("$count", count);
            }
            return this;
        }

    }

}
