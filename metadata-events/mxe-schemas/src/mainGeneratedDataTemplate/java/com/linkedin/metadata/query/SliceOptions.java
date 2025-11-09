
package com.linkedin.metadata.query;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/SearchFlags.pdl.")
public class SliceOptions
    extends RecordTemplate
{

    private final static SliceOptions.Fields _fields = new SliceOptions.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query,record SliceOptions{id:int,max:int}", SchemaFormatType.PDL));
    private Integer _idField = null;
    private Integer _maxField = null;
    private SliceOptions.ChangeListener __changeListener = new SliceOptions.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_Max = SCHEMA.getField("max");

    public SliceOptions() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SliceOptions(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SliceOptions.Fields fields() {
        return _fields;
    }

    public static SliceOptions.ProjectionMask createMask() {
        return new SliceOptions.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see SliceOptions.Fields#id
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
     * @see SliceOptions.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see SliceOptions.Fields#id
     */
    @Nullable
    public Integer getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SliceOptions.Fields#id
     */
    @Nonnull
    public Integer getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see SliceOptions.Fields#id
     */
    public SliceOptions setId(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.metadata.query.SliceOptions");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", DataTemplateUtil.coerceIntInput(value));
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", DataTemplateUtil.coerceIntInput(value));
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", DataTemplateUtil.coerceIntInput(value));
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
     * @see SliceOptions.Fields#id
     */
    public SliceOptions setId(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.metadata.query.SliceOptions to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", DataTemplateUtil.coerceIntInput(value));
            _idField = value;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @see SliceOptions.Fields#id
     */
    public SliceOptions setId(int value) {
        CheckedUtil.putWithoutChecking(super._map, "id", DataTemplateUtil.coerceIntInput(value));
        _idField = value;
        return this;
    }

    /**
     * Existence checker for max
     * 
     * @see SliceOptions.Fields#max
     */
    public boolean hasMax() {
        if (_maxField!= null) {
            return true;
        }
        return super._map.containsKey("max");
    }

    /**
     * Remover for max
     * 
     * @see SliceOptions.Fields#max
     */
    public void removeMax() {
        super._map.remove("max");
    }

    /**
     * Getter for max
     * 
     * @see SliceOptions.Fields#max
     */
    @Nullable
    public Integer getMax(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMax();
            case DEFAULT:
            case NULL:
                if (_maxField!= null) {
                    return _maxField;
                } else {
                    Object __rawValue = super._map.get("max");
                    _maxField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _maxField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for max
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SliceOptions.Fields#max
     */
    @Nonnull
    public Integer getMax() {
        if (_maxField!= null) {
            return _maxField;
        } else {
            Object __rawValue = super._map.get("max");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("max");
            }
            _maxField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _maxField;
        }
    }

    /**
     * Setter for max
     * 
     * @see SliceOptions.Fields#max
     */
    public SliceOptions setMax(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMax(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field max of com.linkedin.metadata.query.SliceOptions");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "max", DataTemplateUtil.coerceIntInput(value));
                    _maxField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMax();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "max", DataTemplateUtil.coerceIntInput(value));
                    _maxField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "max", DataTemplateUtil.coerceIntInput(value));
                    _maxField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for max
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SliceOptions.Fields#max
     */
    public SliceOptions setMax(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field max of com.linkedin.metadata.query.SliceOptions to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "max", DataTemplateUtil.coerceIntInput(value));
            _maxField = value;
        }
        return this;
    }

    /**
     * Setter for max
     * 
     * @see SliceOptions.Fields#max
     */
    public SliceOptions setMax(int value) {
        CheckedUtil.putWithoutChecking(super._map, "max", DataTemplateUtil.coerceIntInput(value));
        _maxField = value;
        return this;
    }

    @Override
    public SliceOptions clone()
        throws CloneNotSupportedException
    {
        SliceOptions __clone = ((SliceOptions) super.clone());
        __clone.__changeListener = new SliceOptions.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SliceOptions copy()
        throws CloneNotSupportedException
    {
        SliceOptions __copy = ((SliceOptions) super.copy());
        __copy._maxField = null;
        __copy._idField = null;
        __copy.__changeListener = new SliceOptions.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SliceOptions __objectRef;

        private ChangeListener(SliceOptions reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "max":
                    __objectRef._maxField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
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

        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        public PathSpec max() {
            return new PathSpec(getPathComponents(), "max");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public SliceOptions.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        public SliceOptions.ProjectionMask withMax() {
            getDataMap().put("max", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
