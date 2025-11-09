
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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
import com.linkedin.query.QueryStatement;


/**
 * Information about a transformation. It may be a query,
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/DataTransform.pdl.")
public class DataTransform
    extends RecordTemplate
{

    private final static DataTransform.Fields _fields = new DataTransform.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about a transformation. It may be a query,*/record DataTransform{/**The data transform may be defined by a query statement*/queryStatement:optional{namespace com.linkedin.query/**A query statement against one or more data assets.*/record QueryStatement{/**The query text*/value:string/**The language of the Query, e.g. SQL.*/language:enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}=\"SQL\"}}}", SchemaFormatType.PDL));
    private QueryStatement _queryStatementField = null;
    private DataTransform.ChangeListener __changeListener = new DataTransform.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_QueryStatement = SCHEMA.getField("queryStatement");

    public DataTransform() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataTransform(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataTransform.Fields fields() {
        return _fields;
    }

    public static DataTransform.ProjectionMask createMask() {
        return new DataTransform.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for queryStatement
     * 
     * @see DataTransform.Fields#queryStatement
     */
    public boolean hasQueryStatement() {
        if (_queryStatementField!= null) {
            return true;
        }
        return super._map.containsKey("queryStatement");
    }

    /**
     * Remover for queryStatement
     * 
     * @see DataTransform.Fields#queryStatement
     */
    public void removeQueryStatement() {
        super._map.remove("queryStatement");
    }

    /**
     * Getter for queryStatement
     * 
     * @see DataTransform.Fields#queryStatement
     */
    @Nullable
    public QueryStatement getQueryStatement(GetMode mode) {
        return getQueryStatement();
    }

    /**
     * Getter for queryStatement
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataTransform.Fields#queryStatement
     */
    @Nullable
    public QueryStatement getQueryStatement() {
        if (_queryStatementField!= null) {
            return _queryStatementField;
        } else {
            Object __rawValue = super._map.get("queryStatement");
            _queryStatementField = ((__rawValue == null)?null:new QueryStatement(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _queryStatementField;
        }
    }

    /**
     * Setter for queryStatement
     * 
     * @see DataTransform.Fields#queryStatement
     */
    public DataTransform setQueryStatement(
        @Nullable
        QueryStatement value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQueryStatement(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQueryStatement();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "queryStatement", value.data());
                    _queryStatementField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "queryStatement", value.data());
                    _queryStatementField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for queryStatement
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataTransform.Fields#queryStatement
     */
    public DataTransform setQueryStatement(
        @Nonnull
        QueryStatement value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field queryStatement of com.linkedin.common.DataTransform to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "queryStatement", value.data());
            _queryStatementField = value;
        }
        return this;
    }

    @Override
    public DataTransform clone()
        throws CloneNotSupportedException
    {
        DataTransform __clone = ((DataTransform) super.clone());
        __clone.__changeListener = new DataTransform.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataTransform copy()
        throws CloneNotSupportedException
    {
        DataTransform __copy = ((DataTransform) super.copy());
        __copy._queryStatementField = null;
        __copy.__changeListener = new DataTransform.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataTransform __objectRef;

        private ChangeListener(DataTransform reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "queryStatement":
                    __objectRef._queryStatementField = null;
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
         * The data transform may be defined by a query statement
         * 
         */
        public com.linkedin.query.QueryStatement.Fields queryStatement() {
            return new com.linkedin.query.QueryStatement.Fields(getPathComponents(), "queryStatement");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.query.QueryStatement.ProjectionMask _queryStatementMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * The data transform may be defined by a query statement
         * 
         */
        public DataTransform.ProjectionMask withQueryStatement(Function<com.linkedin.query.QueryStatement.ProjectionMask, com.linkedin.query.QueryStatement.ProjectionMask> nestedMask) {
            _queryStatementMask = nestedMask.apply(((_queryStatementMask == null)?QueryStatement.createMask():_queryStatementMask));
            getDataMap().put("queryStatement", _queryStatementMask.getDataMap());
            return this;
        }

        /**
         * The data transform may be defined by a query statement
         * 
         */
        public DataTransform.ProjectionMask withQueryStatement() {
            _queryStatementMask = null;
            getDataMap().put("queryStatement", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
