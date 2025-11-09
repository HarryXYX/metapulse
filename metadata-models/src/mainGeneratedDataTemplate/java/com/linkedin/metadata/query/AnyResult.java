
package com.linkedin.metadata.query;

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


/**
 * A common model for the result of any query. 
 * Expected to be included into other top level query results.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/AnyResult.pdl.")
public class AnyResult
    extends RecordTemplate
{

    private final static AnyResult.Fields _fields = new AnyResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**A common model for the result of any query. \nExpected to be included into other top level query results.*/record AnyResult{/**Freshness Stats to help a caller understand the freshness of the results\nUseful when the results are being retrieved from a cache, index or other eventually consistent storage*/freshness:optional/**Stats that describe the freshness of a dataset or query result.\nUseful to describe consistency and staleness of results when served\nout of a cache or other eventually consistent system.*/record FreshnessStats{cached:optional boolean,systemFreshness:optional map[string,long]}}", SchemaFormatType.PDL));
    private FreshnessStats _freshnessField = null;
    private AnyResult.ChangeListener __changeListener = new AnyResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Freshness = SCHEMA.getField("freshness");

    public AnyResult() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AnyResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AnyResult.Fields fields() {
        return _fields;
    }

    public static AnyResult.ProjectionMask createMask() {
        return new AnyResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for freshness
     * 
     * @see AnyResult.Fields#freshness
     */
    public boolean hasFreshness() {
        if (_freshnessField!= null) {
            return true;
        }
        return super._map.containsKey("freshness");
    }

    /**
     * Remover for freshness
     * 
     * @see AnyResult.Fields#freshness
     */
    public void removeFreshness() {
        super._map.remove("freshness");
    }

    /**
     * Getter for freshness
     * 
     * @see AnyResult.Fields#freshness
     */
    @Nullable
    public FreshnessStats getFreshness(GetMode mode) {
        return getFreshness();
    }

    /**
     * Getter for freshness
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AnyResult.Fields#freshness
     */
    @Nullable
    public FreshnessStats getFreshness() {
        if (_freshnessField!= null) {
            return _freshnessField;
        } else {
            Object __rawValue = super._map.get("freshness");
            _freshnessField = ((__rawValue == null)?null:new FreshnessStats(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _freshnessField;
        }
    }

    /**
     * Setter for freshness
     * 
     * @see AnyResult.Fields#freshness
     */
    public AnyResult setFreshness(
        @Nullable
        FreshnessStats value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFreshness(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFreshness();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
                    _freshnessField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
                    _freshnessField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for freshness
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AnyResult.Fields#freshness
     */
    public AnyResult setFreshness(
        @Nonnull
        FreshnessStats value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field freshness of com.linkedin.metadata.query.AnyResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
            _freshnessField = value;
        }
        return this;
    }

    @Override
    public AnyResult clone()
        throws CloneNotSupportedException
    {
        AnyResult __clone = ((AnyResult) super.clone());
        __clone.__changeListener = new AnyResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AnyResult copy()
        throws CloneNotSupportedException
    {
        AnyResult __copy = ((AnyResult) super.copy());
        __copy._freshnessField = null;
        __copy.__changeListener = new AnyResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AnyResult __objectRef;

        private ChangeListener(AnyResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "freshness":
                    __objectRef._freshnessField = null;
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
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public com.linkedin.metadata.query.FreshnessStats.Fields freshness() {
            return new com.linkedin.metadata.query.FreshnessStats.Fields(getPathComponents(), "freshness");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.FreshnessStats.ProjectionMask _freshnessMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public AnyResult.ProjectionMask withFreshness(Function<com.linkedin.metadata.query.FreshnessStats.ProjectionMask, com.linkedin.metadata.query.FreshnessStats.ProjectionMask> nestedMask) {
            _freshnessMask = nestedMask.apply(((_freshnessMask == null)?FreshnessStats.createMask():_freshnessMask));
            getDataMap().put("freshness", _freshnessMask.getDataMap());
            return this;
        }

        /**
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public AnyResult.ProjectionMask withFreshness() {
            _freshnessMask = null;
            getDataMap().put("freshness", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
