
package com.linkedin.query;

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
 * A query statement against one or more data assets.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/query/QueryStatement.pdl.")
public class QueryStatement
    extends RecordTemplate
{

    private final static QueryStatement.Fields _fields = new QueryStatement.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.query/**A query statement against one or more data assets.*/record QueryStatement{/**The query text*/value:string/**The language of the Query, e.g. SQL.*/language:enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}=\"SQL\"}", SchemaFormatType.PDL));
    private String _valueField = null;
    private QueryLanguage _languageField = null;
    private QueryStatement.ChangeListener __changeListener = new QueryStatement.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Language = SCHEMA.getField("language");
    private final static QueryLanguage DEFAULT_Language;

    static {
        DEFAULT_Language = DataTemplateUtil.coerceEnumOutput(FIELD_Language.getDefault(), QueryLanguage.class, QueryLanguage.$UNKNOWN);
    }

    public QueryStatement() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public QueryStatement(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static QueryStatement.Fields fields() {
        return _fields;
    }

    public static QueryStatement.ProjectionMask createMask() {
        return new QueryStatement.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see QueryStatement.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see QueryStatement.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see QueryStatement.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryStatement.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see QueryStatement.Fields#value
     */
    public QueryStatement setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.query.QueryStatement");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryStatement.Fields#value
     */
    public QueryStatement setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.query.QueryStatement to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for language
     * 
     * @see QueryStatement.Fields#language
     */
    public boolean hasLanguage() {
        if (_languageField!= null) {
            return true;
        }
        return super._map.containsKey("language");
    }

    /**
     * Remover for language
     * 
     * @see QueryStatement.Fields#language
     */
    public void removeLanguage() {
        super._map.remove("language");
    }

    /**
     * Getter for language
     * 
     * @see QueryStatement.Fields#language
     */
    @Nullable
    public QueryLanguage getLanguage(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getLanguage();
            case NULL:
                if (_languageField!= null) {
                    return _languageField;
                } else {
                    Object __rawValue = super._map.get("language");
                    _languageField = DataTemplateUtil.coerceEnumOutput(__rawValue, QueryLanguage.class, QueryLanguage.$UNKNOWN);
                    return _languageField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for language
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryStatement.Fields#language
     */
    @Nonnull
    public QueryLanguage getLanguage() {
        if (_languageField!= null) {
            return _languageField;
        } else {
            Object __rawValue = super._map.get("language");
            if (__rawValue == null) {
                return DEFAULT_Language;
            }
            _languageField = DataTemplateUtil.coerceEnumOutput(__rawValue, QueryLanguage.class, QueryLanguage.$UNKNOWN);
            return _languageField;
        }
    }

    /**
     * Setter for language
     * 
     * @see QueryStatement.Fields#language
     */
    public QueryStatement setLanguage(
        @Nullable
        QueryLanguage value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLanguage(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field language of com.linkedin.query.QueryStatement");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "language", value.name());
                    _languageField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLanguage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "language", value.name());
                    _languageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "language", value.name());
                    _languageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for language
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryStatement.Fields#language
     */
    public QueryStatement setLanguage(
        @Nonnull
        QueryLanguage value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field language of com.linkedin.query.QueryStatement to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "language", value.name());
            _languageField = value;
        }
        return this;
    }

    @Override
    public QueryStatement clone()
        throws CloneNotSupportedException
    {
        QueryStatement __clone = ((QueryStatement) super.clone());
        __clone.__changeListener = new QueryStatement.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public QueryStatement copy()
        throws CloneNotSupportedException
    {
        QueryStatement __copy = ((QueryStatement) super.copy());
        __copy._languageField = null;
        __copy._valueField = null;
        __copy.__changeListener = new QueryStatement.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final QueryStatement __objectRef;

        private ChangeListener(QueryStatement reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "language":
                    __objectRef._languageField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
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
         * The query text
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * The language of the Query, e.g. SQL.
         * 
         */
        public PathSpec language() {
            return new PathSpec(getPathComponents(), "language");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The query text
         * 
         */
        public QueryStatement.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The language of the Query, e.g. SQL.
         * 
         */
        public QueryStatement.ProjectionMask withLanguage() {
            getDataMap().put("language", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
