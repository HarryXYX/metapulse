
package com.linkedin.timeseries;

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
import com.linkedin.data.template.SetMode;


/**
 * Encapsulates the response of the deleteAspectValues API so that it can be extended
 * as required in future.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/DeleteAspectValuesResult.pdl.")
public class DeleteAspectValuesResult
    extends RecordTemplate
{

    private final static DeleteAspectValuesResult.Fields _fields = new DeleteAspectValuesResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Encapsulates the response of the deleteAspectValues API so that it can be extended\nas required in future.*/record DeleteAspectValuesResult{/**Number of documents deleted.*/numDocsDeleted:long=0}", SchemaFormatType.PDL));
    private Long _numDocsDeletedField = null;
    private DeleteAspectValuesResult.ChangeListener __changeListener = new DeleteAspectValuesResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NumDocsDeleted = SCHEMA.getField("numDocsDeleted");
    private final static Long DEFAULT_NumDocsDeleted;

    static {
        DEFAULT_NumDocsDeleted = DataTemplateUtil.coerceLongOutput(FIELD_NumDocsDeleted.getDefault());
    }

    public DeleteAspectValuesResult() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DeleteAspectValuesResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DeleteAspectValuesResult.Fields fields() {
        return _fields;
    }

    public static DeleteAspectValuesResult.ProjectionMask createMask() {
        return new DeleteAspectValuesResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for numDocsDeleted
     * 
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    public boolean hasNumDocsDeleted() {
        if (_numDocsDeletedField!= null) {
            return true;
        }
        return super._map.containsKey("numDocsDeleted");
    }

    /**
     * Remover for numDocsDeleted
     * 
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    public void removeNumDocsDeleted() {
        super._map.remove("numDocsDeleted");
    }

    /**
     * Getter for numDocsDeleted
     * 
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    @Nullable
    public Long getNumDocsDeleted(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getNumDocsDeleted();
            case NULL:
                if (_numDocsDeletedField!= null) {
                    return _numDocsDeletedField;
                } else {
                    Object __rawValue = super._map.get("numDocsDeleted");
                    _numDocsDeletedField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _numDocsDeletedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numDocsDeleted
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    @Nonnull
    public Long getNumDocsDeleted() {
        if (_numDocsDeletedField!= null) {
            return _numDocsDeletedField;
        } else {
            Object __rawValue = super._map.get("numDocsDeleted");
            if (__rawValue == null) {
                return DEFAULT_NumDocsDeleted;
            }
            _numDocsDeletedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _numDocsDeletedField;
        }
    }

    /**
     * Setter for numDocsDeleted
     * 
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    public DeleteAspectValuesResult setNumDocsDeleted(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumDocsDeleted(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numDocsDeleted of com.linkedin.timeseries.DeleteAspectValuesResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numDocsDeleted", DataTemplateUtil.coerceLongInput(value));
                    _numDocsDeletedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumDocsDeleted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numDocsDeleted", DataTemplateUtil.coerceLongInput(value));
                    _numDocsDeletedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numDocsDeleted", DataTemplateUtil.coerceLongInput(value));
                    _numDocsDeletedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numDocsDeleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    public DeleteAspectValuesResult setNumDocsDeleted(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numDocsDeleted of com.linkedin.timeseries.DeleteAspectValuesResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numDocsDeleted", DataTemplateUtil.coerceLongInput(value));
            _numDocsDeletedField = value;
        }
        return this;
    }

    /**
     * Setter for numDocsDeleted
     * 
     * @see DeleteAspectValuesResult.Fields#numDocsDeleted
     */
    public DeleteAspectValuesResult setNumDocsDeleted(long value) {
        CheckedUtil.putWithoutChecking(super._map, "numDocsDeleted", DataTemplateUtil.coerceLongInput(value));
        _numDocsDeletedField = value;
        return this;
    }

    @Override
    public DeleteAspectValuesResult clone()
        throws CloneNotSupportedException
    {
        DeleteAspectValuesResult __clone = ((DeleteAspectValuesResult) super.clone());
        __clone.__changeListener = new DeleteAspectValuesResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DeleteAspectValuesResult copy()
        throws CloneNotSupportedException
    {
        DeleteAspectValuesResult __copy = ((DeleteAspectValuesResult) super.copy());
        __copy._numDocsDeletedField = null;
        __copy.__changeListener = new DeleteAspectValuesResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DeleteAspectValuesResult __objectRef;

        private ChangeListener(DeleteAspectValuesResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "numDocsDeleted":
                    __objectRef._numDocsDeletedField = null;
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
         * Number of documents deleted.
         * 
         */
        public PathSpec numDocsDeleted() {
            return new PathSpec(getPathComponents(), "numDocsDeleted");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Number of documents deleted.
         * 
         */
        public DeleteAspectValuesResult.ProjectionMask withNumDocsDeleted() {
            getDataMap().put("numDocsDeleted", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
