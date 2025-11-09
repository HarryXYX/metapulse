
package com.linkedin.dataset;

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
 * A definition of filters that should be used when
 * querying an external Dataset or Table.
 * 
 * Note that this models should NOT be used for working with
 * search / filter on DataHub Platform itself.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetFilter.pdl.")
public class DatasetFilter
    extends RecordTemplate
{

    private final static DatasetFilter.Fields _fields = new DatasetFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**A definition of filters that should be used when\nquerying an external Dataset or Table.\n\nNote that this models should NOT be used for working with\nsearch / filter on DataHub Platform itself.*/record DatasetFilter{/**How the partition will be represented in this model.\n\nIn the future, we'll likely add support for more structured\npredicates.*/type:enum DatasetFilterType{/**The partition is represented as a an opaque, raw SQL\nclause.*/SQL}/**The raw where clause string which will be used for monitoring.\nRequired if the type is SQL.*/sql:optional string}", SchemaFormatType.PDL));
    private DatasetFilterType _typeField = null;
    private String _sqlField = null;
    private DatasetFilter.ChangeListener __changeListener = new DatasetFilter.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Sql = SCHEMA.getField("sql");

    public DatasetFilter() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetFilter(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetFilter.Fields fields() {
        return _fields;
    }

    public static DatasetFilter.ProjectionMask createMask() {
        return new DatasetFilter.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see DatasetFilter.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see DatasetFilter.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DatasetFilter.Fields#type
     */
    @Nullable
    public DatasetFilterType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetFilterType.class, DatasetFilterType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFilter.Fields#type
     */
    @Nonnull
    public DatasetFilterType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetFilterType.class, DatasetFilterType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DatasetFilter.Fields#type
     */
    public DatasetFilter setType(
        @Nullable
        DatasetFilterType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.dataset.DatasetFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFilter.Fields#type
     */
    public DatasetFilter setType(
        @Nonnull
        DatasetFilterType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.dataset.DatasetFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for sql
     * 
     * @see DatasetFilter.Fields#sql
     */
    public boolean hasSql() {
        if (_sqlField!= null) {
            return true;
        }
        return super._map.containsKey("sql");
    }

    /**
     * Remover for sql
     * 
     * @see DatasetFilter.Fields#sql
     */
    public void removeSql() {
        super._map.remove("sql");
    }

    /**
     * Getter for sql
     * 
     * @see DatasetFilter.Fields#sql
     */
    @Nullable
    public String getSql(GetMode mode) {
        return getSql();
    }

    /**
     * Getter for sql
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFilter.Fields#sql
     */
    @Nullable
    public String getSql() {
        if (_sqlField!= null) {
            return _sqlField;
        } else {
            Object __rawValue = super._map.get("sql");
            _sqlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _sqlField;
        }
    }

    /**
     * Setter for sql
     * 
     * @see DatasetFilter.Fields#sql
     */
    public DatasetFilter setSql(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSql(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSql();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sql", value);
                    _sqlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sql", value);
                    _sqlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sql
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFilter.Fields#sql
     */
    public DatasetFilter setSql(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sql of com.linkedin.dataset.DatasetFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sql", value);
            _sqlField = value;
        }
        return this;
    }

    @Override
    public DatasetFilter clone()
        throws CloneNotSupportedException
    {
        DatasetFilter __clone = ((DatasetFilter) super.clone());
        __clone.__changeListener = new DatasetFilter.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFilter copy()
        throws CloneNotSupportedException
    {
        DatasetFilter __copy = ((DatasetFilter) super.copy());
        __copy._typeField = null;
        __copy._sqlField = null;
        __copy.__changeListener = new DatasetFilter.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFilter __objectRef;

        private ChangeListener(DatasetFilter reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "sql":
                    __objectRef._sqlField = null;
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
         * How the partition will be represented in this model.
         * 
         * In the future, we'll likely add support for more structured
         * predicates.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The raw where clause string which will be used for monitoring.
         * Required if the type is SQL.
         * 
         */
        public PathSpec sql() {
            return new PathSpec(getPathComponents(), "sql");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * How the partition will be represented in this model.
         * 
         * In the future, we'll likely add support for more structured
         * predicates.
         * 
         */
        public DatasetFilter.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The raw where clause string which will be used for monitoring.
         * Required if the type is SQL.
         * 
         */
        public DatasetFilter.ProjectionMask withSql() {
            getDataMap().put("sql", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
