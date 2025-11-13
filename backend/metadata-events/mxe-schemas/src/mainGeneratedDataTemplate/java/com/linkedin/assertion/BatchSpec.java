
package com.linkedin.assertion;

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
import com.linkedin.data.template.StringMap;


/**
 * A batch on which certain operations, e.g. data quality evaluation, is done.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/BatchSpec.pdl.")
public class BatchSpec
    extends RecordTemplate
{

    private final static BatchSpec.Fields _fields = new BatchSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**A batch on which certain operations, e.g. data quality evaluation, is done.*/record BatchSpec includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**The native identifier as specified by the system operating on the batch.*/nativeBatchId:optional string/**A query that identifies a batch of data*/query:optional string/**Any limit to the number of rows in the batch, if applied*/limit:optional int}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _nativeBatchIdField = null;
    private String _queryField = null;
    private Integer _limitField = null;
    private BatchSpec.ChangeListener __changeListener = new BatchSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_NativeBatchId = SCHEMA.getField("nativeBatchId");
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");
    private final static RecordDataSchema.Field FIELD_Limit = SCHEMA.getField("limit");

    static {
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public BatchSpec() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BatchSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BatchSpec.Fields fields() {
        return _fields;
    }

    public static BatchSpec.ProjectionMask createMask() {
        return new BatchSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see BatchSpec.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see BatchSpec.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see BatchSpec.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BatchSpec.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see BatchSpec.Fields#customProperties
     */
    public BatchSpec setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.assertion.BatchSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BatchSpec.Fields#customProperties
     */
    public BatchSpec setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.assertion.BatchSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeBatchId
     * 
     * @see BatchSpec.Fields#nativeBatchId
     */
    public boolean hasNativeBatchId() {
        if (_nativeBatchIdField!= null) {
            return true;
        }
        return super._map.containsKey("nativeBatchId");
    }

    /**
     * Remover for nativeBatchId
     * 
     * @see BatchSpec.Fields#nativeBatchId
     */
    public void removeNativeBatchId() {
        super._map.remove("nativeBatchId");
    }

    /**
     * Getter for nativeBatchId
     * 
     * @see BatchSpec.Fields#nativeBatchId
     */
    @Nullable
    public String getNativeBatchId(GetMode mode) {
        return getNativeBatchId();
    }

    /**
     * Getter for nativeBatchId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BatchSpec.Fields#nativeBatchId
     */
    @Nullable
    public String getNativeBatchId() {
        if (_nativeBatchIdField!= null) {
            return _nativeBatchIdField;
        } else {
            Object __rawValue = super._map.get("nativeBatchId");
            _nativeBatchIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeBatchIdField;
        }
    }

    /**
     * Setter for nativeBatchId
     * 
     * @see BatchSpec.Fields#nativeBatchId
     */
    public BatchSpec setNativeBatchId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeBatchId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeBatchId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeBatchId", value);
                    _nativeBatchIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeBatchId", value);
                    _nativeBatchIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeBatchId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BatchSpec.Fields#nativeBatchId
     */
    public BatchSpec setNativeBatchId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeBatchId of com.linkedin.assertion.BatchSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeBatchId", value);
            _nativeBatchIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for query
     * 
     * @see BatchSpec.Fields#query
     */
    public boolean hasQuery() {
        if (_queryField!= null) {
            return true;
        }
        return super._map.containsKey("query");
    }

    /**
     * Remover for query
     * 
     * @see BatchSpec.Fields#query
     */
    public void removeQuery() {
        super._map.remove("query");
    }

    /**
     * Getter for query
     * 
     * @see BatchSpec.Fields#query
     */
    @Nullable
    public String getQuery(GetMode mode) {
        return getQuery();
    }

    /**
     * Getter for query
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BatchSpec.Fields#query
     */
    @Nullable
    public String getQuery() {
        if (_queryField!= null) {
            return _queryField;
        } else {
            Object __rawValue = super._map.get("query");
            _queryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _queryField;
        }
    }

    /**
     * Setter for query
     * 
     * @see BatchSpec.Fields#query
     */
    public BatchSpec setQuery(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for query
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BatchSpec.Fields#query
     */
    public BatchSpec setQuery(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field query of com.linkedin.assertion.BatchSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "query", value);
            _queryField = value;
        }
        return this;
    }

    /**
     * Existence checker for limit
     * 
     * @see BatchSpec.Fields#limit
     */
    public boolean hasLimit() {
        if (_limitField!= null) {
            return true;
        }
        return super._map.containsKey("limit");
    }

    /**
     * Remover for limit
     * 
     * @see BatchSpec.Fields#limit
     */
    public void removeLimit() {
        super._map.remove("limit");
    }

    /**
     * Getter for limit
     * 
     * @see BatchSpec.Fields#limit
     */
    @Nullable
    public Integer getLimit(GetMode mode) {
        return getLimit();
    }

    /**
     * Getter for limit
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BatchSpec.Fields#limit
     */
    @Nullable
    public Integer getLimit() {
        if (_limitField!= null) {
            return _limitField;
        } else {
            Object __rawValue = super._map.get("limit");
            _limitField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _limitField;
        }
    }

    /**
     * Setter for limit
     * 
     * @see BatchSpec.Fields#limit
     */
    public BatchSpec setLimit(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLimit(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLimit();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceIntInput(value));
                    _limitField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceIntInput(value));
                    _limitField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for limit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BatchSpec.Fields#limit
     */
    public BatchSpec setLimit(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field limit of com.linkedin.assertion.BatchSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceIntInput(value));
            _limitField = value;
        }
        return this;
    }

    /**
     * Setter for limit
     * 
     * @see BatchSpec.Fields#limit
     */
    public BatchSpec setLimit(int value) {
        CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceIntInput(value));
        _limitField = value;
        return this;
    }

    @Override
    public BatchSpec clone()
        throws CloneNotSupportedException
    {
        BatchSpec __clone = ((BatchSpec) super.clone());
        __clone.__changeListener = new BatchSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BatchSpec copy()
        throws CloneNotSupportedException
    {
        BatchSpec __copy = ((BatchSpec) super.copy());
        __copy._customPropertiesField = null;
        __copy._queryField = null;
        __copy._limitField = null;
        __copy._nativeBatchIdField = null;
        __copy.__changeListener = new BatchSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BatchSpec __objectRef;

        private ChangeListener(BatchSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "query":
                    __objectRef._queryField = null;
                    break;
                case "limit":
                    __objectRef._limitField = null;
                    break;
                case "nativeBatchId":
                    __objectRef._nativeBatchIdField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * The native identifier as specified by the system operating on the batch.
         * 
         */
        public PathSpec nativeBatchId() {
            return new PathSpec(getPathComponents(), "nativeBatchId");
        }

        /**
         * A query that identifies a batch of data
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

        /**
         * Any limit to the number of rows in the batch, if applied
         * 
         */
        public PathSpec limit() {
            return new PathSpec(getPathComponents(), "limit");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Custom property bag.
         * 
         */
        public BatchSpec.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native identifier as specified by the system operating on the batch.
         * 
         */
        public BatchSpec.ProjectionMask withNativeBatchId() {
            getDataMap().put("nativeBatchId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A query that identifies a batch of data
         * 
         */
        public BatchSpec.ProjectionMask withQuery() {
            getDataMap().put("query", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Any limit to the number of rows in the batch, if applied
         * 
         */
        public BatchSpec.ProjectionMask withLimit() {
            getDataMap().put("limit", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
