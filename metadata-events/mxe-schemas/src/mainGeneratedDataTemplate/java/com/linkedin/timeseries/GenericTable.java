
package com.linkedin.timeseries;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringArrayArray;


/**
 * Defines a generic table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/GenericTable.pdl.")
public class GenericTable
    extends RecordTemplate
{

    private final static GenericTable.Fields _fields = new GenericTable.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines a generic table.*/record GenericTable{/**The names of the columns.*/columnNames:array[string]/**The types of the columns.*/columnTypes:array[string]/**The data rows.*/rows:optional array[array[string]]}", SchemaFormatType.PDL));
    private StringArray _columnNamesField = null;
    private StringArray _columnTypesField = null;
    private StringArrayArray _rowsField = null;
    private GenericTable.ChangeListener __changeListener = new GenericTable.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ColumnNames = SCHEMA.getField("columnNames");
    private final static RecordDataSchema.Field FIELD_ColumnTypes = SCHEMA.getField("columnTypes");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");

    public GenericTable() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public GenericTable(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GenericTable.Fields fields() {
        return _fields;
    }

    public static GenericTable.ProjectionMask createMask() {
        return new GenericTable.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public boolean hasColumnNames() {
        if (_columnNamesField!= null) {
            return true;
        }
        return super._map.containsKey("columnNames");
    }

    /**
     * Remover for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public void removeColumnNames() {
        super._map.remove("columnNames");
    }

    /**
     * Getter for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    @Nullable
    public StringArray getColumnNames(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getColumnNames();
            case DEFAULT:
            case NULL:
                if (_columnNamesField!= null) {
                    return _columnNamesField;
                } else {
                    Object __rawValue = super._map.get("columnNames");
                    _columnNamesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _columnNamesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for columnNames
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericTable.Fields#columnNames
     */
    @Nonnull
    public StringArray getColumnNames() {
        if (_columnNamesField!= null) {
            return _columnNamesField;
        } else {
            Object __rawValue = super._map.get("columnNames");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("columnNames");
            }
            _columnNamesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _columnNamesField;
        }
    }

    /**
     * Setter for columnNames
     * 
     * @see GenericTable.Fields#columnNames
     */
    public GenericTable setColumnNames(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setColumnNames(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field columnNames of com.linkedin.timeseries.GenericTable");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnNames", value.data());
                    _columnNamesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeColumnNames();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnNames", value.data());
                    _columnNamesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "columnNames", value.data());
                    _columnNamesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for columnNames
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericTable.Fields#columnNames
     */
    public GenericTable setColumnNames(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field columnNames of com.linkedin.timeseries.GenericTable to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "columnNames", value.data());
            _columnNamesField = value;
        }
        return this;
    }

    /**
     * Existence checker for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public boolean hasColumnTypes() {
        if (_columnTypesField!= null) {
            return true;
        }
        return super._map.containsKey("columnTypes");
    }

    /**
     * Remover for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public void removeColumnTypes() {
        super._map.remove("columnTypes");
    }

    /**
     * Getter for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    @Nullable
    public StringArray getColumnTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getColumnTypes();
            case DEFAULT:
            case NULL:
                if (_columnTypesField!= null) {
                    return _columnTypesField;
                } else {
                    Object __rawValue = super._map.get("columnTypes");
                    _columnTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _columnTypesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for columnTypes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericTable.Fields#columnTypes
     */
    @Nonnull
    public StringArray getColumnTypes() {
        if (_columnTypesField!= null) {
            return _columnTypesField;
        } else {
            Object __rawValue = super._map.get("columnTypes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("columnTypes");
            }
            _columnTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _columnTypesField;
        }
    }

    /**
     * Setter for columnTypes
     * 
     * @see GenericTable.Fields#columnTypes
     */
    public GenericTable setColumnTypes(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setColumnTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field columnTypes of com.linkedin.timeseries.GenericTable");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnTypes", value.data());
                    _columnTypesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeColumnTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnTypes", value.data());
                    _columnTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "columnTypes", value.data());
                    _columnTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for columnTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericTable.Fields#columnTypes
     */
    public GenericTable setColumnTypes(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field columnTypes of com.linkedin.timeseries.GenericTable to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "columnTypes", value.data());
            _columnTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see GenericTable.Fields#rows
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
     * @see GenericTable.Fields#rows
     */
    public void removeRows() {
        super._map.remove("rows");
    }

    /**
     * Getter for rows
     * 
     * @see GenericTable.Fields#rows
     */
    @Nullable
    public StringArrayArray getRows(GetMode mode) {
        return getRows();
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GenericTable.Fields#rows
     */
    @Nullable
    public StringArrayArray getRows() {
        if (_rowsField!= null) {
            return _rowsField;
        } else {
            Object __rawValue = super._map.get("rows");
            _rowsField = ((__rawValue == null)?null:new StringArrayArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rowsField;
        }
    }

    /**
     * Setter for rows
     * 
     * @see GenericTable.Fields#rows
     */
    public GenericTable setRows(
        @Nullable
        StringArrayArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRows(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRows();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
                    _rowsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
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
     * @see GenericTable.Fields#rows
     */
    public GenericTable setRows(
        @Nonnull
        StringArrayArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rows of com.linkedin.timeseries.GenericTable to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
            _rowsField = value;
        }
        return this;
    }

    @Override
    public GenericTable clone()
        throws CloneNotSupportedException
    {
        GenericTable __clone = ((GenericTable) super.clone());
        __clone.__changeListener = new GenericTable.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GenericTable copy()
        throws CloneNotSupportedException
    {
        GenericTable __copy = ((GenericTable) super.copy());
        __copy._columnNamesField = null;
        __copy._columnTypesField = null;
        __copy._rowsField = null;
        __copy.__changeListener = new GenericTable.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GenericTable __objectRef;

        private ChangeListener(GenericTable reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "columnNames":
                    __objectRef._columnNamesField = null;
                    break;
                case "columnTypes":
                    __objectRef._columnTypesField = null;
                    break;
                case "rows":
                    __objectRef._rowsField = null;
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
         * The names of the columns.
         * 
         */
        public PathSpec columnNames() {
            return new PathSpec(getPathComponents(), "columnNames");
        }

        /**
         * The names of the columns.
         * 
         */
        public PathSpec columnNames(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "columnNames");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The types of the columns.
         * 
         */
        public PathSpec columnTypes() {
            return new PathSpec(getPathComponents(), "columnTypes");
        }

        /**
         * The types of the columns.
         * 
         */
        public PathSpec columnTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "columnTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The data rows.
         * 
         */
        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

        /**
         * The data rows.
         * 
         */
        public PathSpec rows(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "rows");
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
         * The names of the columns.
         * 
         */
        public GenericTable.ProjectionMask withColumnNames() {
            getDataMap().put("columnNames", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The names of the columns.
         * 
         */
        public GenericTable.ProjectionMask withColumnNames(Integer start, Integer count) {
            getDataMap().put("columnNames", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("columnNames").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("columnNames").put("$count", count);
            }
            return this;
        }

        /**
         * The types of the columns.
         * 
         */
        public GenericTable.ProjectionMask withColumnTypes() {
            getDataMap().put("columnTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The types of the columns.
         * 
         */
        public GenericTable.ProjectionMask withColumnTypes(Integer start, Integer count) {
            getDataMap().put("columnTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("columnTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("columnTypes").put("$count", count);
            }
            return this;
        }

        /**
         * The data rows.
         * 
         */
        public GenericTable.ProjectionMask withRows() {
            getDataMap().put("rows", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The data rows.
         * 
         */
        public GenericTable.ProjectionMask withRows(Integer start, Integer count) {
            getDataMap().put("rows", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("rows").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("rows").put("$count", count);
            }
            return this;
        }

    }

}
