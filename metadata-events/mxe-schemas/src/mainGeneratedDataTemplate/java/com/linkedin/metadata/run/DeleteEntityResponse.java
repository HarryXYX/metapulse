
package com.linkedin.metadata.run;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/DeleteEntityResponse.pdl.")
public class DeleteEntityResponse
    extends RecordTemplate
{

    private final static DeleteEntityResponse.Fields _fields = new DeleteEntityResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record DeleteEntityResponse{urn:string,rows:long,timeseriesRows:optional long}", SchemaFormatType.PDL));
    private String _urnField = null;
    private Long _rowsField = null;
    private Long _timeseriesRowsField = null;
    private DeleteEntityResponse.ChangeListener __changeListener = new DeleteEntityResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");
    private final static RecordDataSchema.Field FIELD_TimeseriesRows = SCHEMA.getField("timeseriesRows");

    public DeleteEntityResponse() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DeleteEntityResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DeleteEntityResponse.Fields fields() {
        return _fields;
    }

    public static DeleteEntityResponse.ProjectionMask createMask() {
        return new DeleteEntityResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
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
     * @see DeleteEntityResponse.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    @Nullable
    public String getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see DeleteEntityResponse.Fields#urn
     */
    @Nonnull
    public String getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see DeleteEntityResponse.Fields#urn
     */
    public DeleteEntityResponse setUrn(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.run.DeleteEntityResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
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
     * @see DeleteEntityResponse.Fields#urn
     */
    public DeleteEntityResponse setUrn(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.run.DeleteEntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", value);
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public boolean hasRows() {
        if (_rowsField!= null) {
            return true;
        }
        return super._map.containsKey("rows");
    }

    /**
     * Remover for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public void removeRows() {
        super._map.remove("rows");
    }

    /**
     * Getter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    @Nullable
    public Long getRows(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRows();
            case DEFAULT:
            case NULL:
                if (_rowsField!= null) {
                    return _rowsField;
                } else {
                    Object __rawValue = super._map.get("rows");
                    _rowsField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _rowsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteEntityResponse.Fields#rows
     */
    @Nonnull
    public Long getRows() {
        if (_rowsField!= null) {
            return _rowsField;
        } else {
            Object __rawValue = super._map.get("rows");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rows");
            }
            _rowsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _rowsField;
        }
    }

    /**
     * Setter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRows(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rows of com.linkedin.metadata.run.DeleteEntityResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRows();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rows of com.linkedin.metadata.run.DeleteEntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
            _rowsField = value;
        }
        return this;
    }

    /**
     * Setter for rows
     * 
     * @see DeleteEntityResponse.Fields#rows
     */
    public DeleteEntityResponse setRows(long value) {
        CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
        _rowsField = value;
        return this;
    }

    /**
     * Existence checker for timeseriesRows
     * 
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    public boolean hasTimeseriesRows() {
        if (_timeseriesRowsField!= null) {
            return true;
        }
        return super._map.containsKey("timeseriesRows");
    }

    /**
     * Remover for timeseriesRows
     * 
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    public void removeTimeseriesRows() {
        super._map.remove("timeseriesRows");
    }

    /**
     * Getter for timeseriesRows
     * 
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    @Nullable
    public Long getTimeseriesRows(GetMode mode) {
        return getTimeseriesRows();
    }

    /**
     * Getter for timeseriesRows
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    @Nullable
    public Long getTimeseriesRows() {
        if (_timeseriesRowsField!= null) {
            return _timeseriesRowsField;
        } else {
            Object __rawValue = super._map.get("timeseriesRows");
            _timeseriesRowsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timeseriesRowsField;
        }
    }

    /**
     * Setter for timeseriesRows
     * 
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    public DeleteEntityResponse setTimeseriesRows(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimeseriesRows(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimeseriesRows();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timeseriesRows", DataTemplateUtil.coerceLongInput(value));
                    _timeseriesRowsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timeseriesRows", DataTemplateUtil.coerceLongInput(value));
                    _timeseriesRowsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timeseriesRows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    public DeleteEntityResponse setTimeseriesRows(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timeseriesRows of com.linkedin.metadata.run.DeleteEntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timeseriesRows", DataTemplateUtil.coerceLongInput(value));
            _timeseriesRowsField = value;
        }
        return this;
    }

    /**
     * Setter for timeseriesRows
     * 
     * @see DeleteEntityResponse.Fields#timeseriesRows
     */
    public DeleteEntityResponse setTimeseriesRows(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timeseriesRows", DataTemplateUtil.coerceLongInput(value));
        _timeseriesRowsField = value;
        return this;
    }

    @Override
    public DeleteEntityResponse clone()
        throws CloneNotSupportedException
    {
        DeleteEntityResponse __clone = ((DeleteEntityResponse) super.clone());
        __clone.__changeListener = new DeleteEntityResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DeleteEntityResponse copy()
        throws CloneNotSupportedException
    {
        DeleteEntityResponse __copy = ((DeleteEntityResponse) super.copy());
        __copy._urnField = null;
        __copy._rowsField = null;
        __copy._timeseriesRowsField = null;
        __copy.__changeListener = new DeleteEntityResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DeleteEntityResponse __objectRef;

        private ChangeListener(DeleteEntityResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "rows":
                    __objectRef._rowsField = null;
                    break;
                case "timeseriesRows":
                    __objectRef._timeseriesRowsField = null;
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

        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

        public PathSpec timeseriesRows() {
            return new PathSpec(getPathComponents(), "timeseriesRows");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public DeleteEntityResponse.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DeleteEntityResponse.ProjectionMask withRows() {
            getDataMap().put("rows", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DeleteEntityResponse.ProjectionMask withTimeseriesRows() {
            getDataMap().put("timeseriesRows", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
