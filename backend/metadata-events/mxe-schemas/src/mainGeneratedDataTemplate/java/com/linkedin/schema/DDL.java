
package com.linkedin.schema;

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
 * Schema text for the data definition language that describes an Relational DBMS table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/DDL.pdl.")
public class DDL
    extends RecordTemplate
{

    private final static DDL.Fields _fields = new DDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text for the data definition language that describes an Relational DBMS table.*/record DDL{/**The native SQL DDL that describe an Relational DBMS table.*/tableDDL:string}", SchemaFormatType.PDL));
    private String _tableDDLField = null;
    private DDL.ChangeListener __changeListener = new DDL.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TableDDL = SCHEMA.getField("tableDDL");

    public DDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DDL(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DDL.Fields fields() {
        return _fields;
    }

    public static DDL.ProjectionMask createMask() {
        return new DDL.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public boolean hasTableDDL() {
        if (_tableDDLField!= null) {
            return true;
        }
        return super._map.containsKey("tableDDL");
    }

    /**
     * Remover for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public void removeTableDDL() {
        super._map.remove("tableDDL");
    }

    /**
     * Getter for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    @Nullable
    public String getTableDDL(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTableDDL();
            case DEFAULT:
            case NULL:
                if (_tableDDLField!= null) {
                    return _tableDDLField;
                } else {
                    Object __rawValue = super._map.get("tableDDL");
                    _tableDDLField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _tableDDLField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tableDDL
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DDL.Fields#tableDDL
     */
    @Nonnull
    public String getTableDDL() {
        if (_tableDDLField!= null) {
            return _tableDDLField;
        } else {
            Object __rawValue = super._map.get("tableDDL");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("tableDDL");
            }
            _tableDDLField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _tableDDLField;
        }
    }

    /**
     * Setter for tableDDL
     * 
     * @see DDL.Fields#tableDDL
     */
    public DDL setTableDDL(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTableDDL(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tableDDL of com.linkedin.schema.DDL");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tableDDL", value);
                    _tableDDLField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTableDDL();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tableDDL", value);
                    _tableDDLField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tableDDL", value);
                    _tableDDLField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tableDDL
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DDL.Fields#tableDDL
     */
    public DDL setTableDDL(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tableDDL of com.linkedin.schema.DDL to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tableDDL", value);
            _tableDDLField = value;
        }
        return this;
    }

    @Override
    public DDL clone()
        throws CloneNotSupportedException
    {
        DDL __clone = ((DDL) super.clone());
        __clone.__changeListener = new DDL.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DDL copy()
        throws CloneNotSupportedException
    {
        DDL __copy = ((DDL) super.copy());
        __copy._tableDDLField = null;
        __copy.__changeListener = new DDL.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DDL __objectRef;

        private ChangeListener(DDL reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "tableDDL":
                    __objectRef._tableDDLField = null;
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
         * The native SQL DDL that describe an Relational DBMS table.
         * 
         */
        public PathSpec tableDDL() {
            return new PathSpec(getPathComponents(), "tableDDL");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The native SQL DDL that describe an Relational DBMS table.
         * 
         */
        public DDL.ProjectionMask withTableDDL() {
            getDataMap().put("tableDDL", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
