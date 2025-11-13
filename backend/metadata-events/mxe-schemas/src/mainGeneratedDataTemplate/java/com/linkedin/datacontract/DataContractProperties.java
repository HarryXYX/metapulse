
package com.linkedin.datacontract;

import java.util.List;
import java.util.function.Function;
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Information about a data contract
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datacontract/DataContractProperties.pdl.")
public class DataContractProperties
    extends RecordTemplate
{

    private final static DataContractProperties.Fields _fields = new DataContractProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datacontract/**Information about a data contract*/@Aspect.name=\"dataContractProperties\"record DataContractProperties{/**The entity that this contract is associated with. Currently, we only support Dataset contracts, but\nin the future we may also support Data Product level contracts.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ContractFor\"}entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**An optional set of schema contracts. If this is a dataset contract, there will only be one.*/@Relationship.`/*/assertion`={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesSchemaAssertion\"}schema:optional array[/**Expectations for a logical schema*/record SchemaContract{/**The assertion representing the schema contract.*/@Relationship={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesSchemaAssertion\"}assertion:com.linkedin.common.Urn}]/**An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.*/@Relationship.`/*/assertion`={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesFreshnessAssertion\"}freshness:optional array[/**A contract pertaining to the operational SLAs of a physical data asset*/record FreshnessContract{/**The assertion representing the SLA contract.*/assertion:com.linkedin.common.Urn}]/**An optional set of Data Quality contracts, e.g. table and column level contract constraints.*/@Relationship.`/*/assertion`={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesDataQualityAssertion\"}dataQuality:optional array[/**A data quality contract pertaining to a physical data asset\nData Quality contracts are used to make assertions about data quality metrics for a physical data asset*/record DataQualityContract{/**The assertion representing the Data Quality contract.\nE.g. a table or column-level assertion.*/@Relationship={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesDataQualityAssertion\"}assertion:com.linkedin.common.Urn}]/**YAML-formatted contract definition*/rawContract:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _entityField = null;
    private SchemaContractArray _schemaField = null;
    private FreshnessContractArray _freshnessField = null;
    private DataQualityContractArray _dataQualityField = null;
    private String _rawContractField = null;
    private DataContractProperties.ChangeListener __changeListener = new DataContractProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");
    private final static RecordDataSchema.Field FIELD_Freshness = SCHEMA.getField("freshness");
    private final static RecordDataSchema.Field FIELD_DataQuality = SCHEMA.getField("dataQuality");
    private final static RecordDataSchema.Field FIELD_RawContract = SCHEMA.getField("rawContract");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataContractProperties() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DataContractProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataContractProperties.Fields fields() {
        return _fields;
    }

    public static DataContractProperties.ProjectionMask createMask() {
        return new DataContractProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entity
     * 
     * @see DataContractProperties.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see DataContractProperties.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see DataContractProperties.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataContractProperties.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see DataContractProperties.Fields#entity
     */
    public DataContractProperties setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.datacontract.DataContractProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataContractProperties.Fields#entity
     */
    public DataContractProperties setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.datacontract.DataContractProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for schema
     * 
     * @see DataContractProperties.Fields#schema
     */
    public boolean hasSchema() {
        if (_schemaField!= null) {
            return true;
        }
        return super._map.containsKey("schema");
    }

    /**
     * Remover for schema
     * 
     * @see DataContractProperties.Fields#schema
     */
    public void removeSchema() {
        super._map.remove("schema");
    }

    /**
     * Getter for schema
     * 
     * @see DataContractProperties.Fields#schema
     */
    @Nullable
    public SchemaContractArray getSchema(GetMode mode) {
        return getSchema();
    }

    /**
     * Getter for schema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataContractProperties.Fields#schema
     */
    @Nullable
    public SchemaContractArray getSchema() {
        if (_schemaField!= null) {
            return _schemaField;
        } else {
            Object __rawValue = super._map.get("schema");
            _schemaField = ((__rawValue == null)?null:new SchemaContractArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _schemaField;
        }
    }

    /**
     * Setter for schema
     * 
     * @see DataContractProperties.Fields#schema
     */
    public DataContractProperties setSchema(
        @Nullable
        SchemaContractArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
                    _schemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
                    _schemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataContractProperties.Fields#schema
     */
    public DataContractProperties setSchema(
        @Nonnull
        SchemaContractArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schema of com.linkedin.datacontract.DataContractProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
            _schemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for freshness
     * 
     * @see DataContractProperties.Fields#freshness
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
     * @see DataContractProperties.Fields#freshness
     */
    public void removeFreshness() {
        super._map.remove("freshness");
    }

    /**
     * Getter for freshness
     * 
     * @see DataContractProperties.Fields#freshness
     */
    @Nullable
    public FreshnessContractArray getFreshness(GetMode mode) {
        return getFreshness();
    }

    /**
     * Getter for freshness
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataContractProperties.Fields#freshness
     */
    @Nullable
    public FreshnessContractArray getFreshness() {
        if (_freshnessField!= null) {
            return _freshnessField;
        } else {
            Object __rawValue = super._map.get("freshness");
            _freshnessField = ((__rawValue == null)?null:new FreshnessContractArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _freshnessField;
        }
    }

    /**
     * Setter for freshness
     * 
     * @see DataContractProperties.Fields#freshness
     */
    public DataContractProperties setFreshness(
        @Nullable
        FreshnessContractArray value, SetMode mode) {
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
     * @see DataContractProperties.Fields#freshness
     */
    public DataContractProperties setFreshness(
        @Nonnull
        FreshnessContractArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field freshness of com.linkedin.datacontract.DataContractProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
            _freshnessField = value;
        }
        return this;
    }

    /**
     * Existence checker for dataQuality
     * 
     * @see DataContractProperties.Fields#dataQuality
     */
    public boolean hasDataQuality() {
        if (_dataQualityField!= null) {
            return true;
        }
        return super._map.containsKey("dataQuality");
    }

    /**
     * Remover for dataQuality
     * 
     * @see DataContractProperties.Fields#dataQuality
     */
    public void removeDataQuality() {
        super._map.remove("dataQuality");
    }

    /**
     * Getter for dataQuality
     * 
     * @see DataContractProperties.Fields#dataQuality
     */
    @Nullable
    public DataQualityContractArray getDataQuality(GetMode mode) {
        return getDataQuality();
    }

    /**
     * Getter for dataQuality
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataContractProperties.Fields#dataQuality
     */
    @Nullable
    public DataQualityContractArray getDataQuality() {
        if (_dataQualityField!= null) {
            return _dataQualityField;
        } else {
            Object __rawValue = super._map.get("dataQuality");
            _dataQualityField = ((__rawValue == null)?null:new DataQualityContractArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _dataQualityField;
        }
    }

    /**
     * Setter for dataQuality
     * 
     * @see DataContractProperties.Fields#dataQuality
     */
    public DataContractProperties setDataQuality(
        @Nullable
        DataQualityContractArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataQuality(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataQuality();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataQuality", value.data());
                    _dataQualityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataQuality", value.data());
                    _dataQualityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataQuality
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataContractProperties.Fields#dataQuality
     */
    public DataContractProperties setDataQuality(
        @Nonnull
        DataQualityContractArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataQuality of com.linkedin.datacontract.DataContractProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataQuality", value.data());
            _dataQualityField = value;
        }
        return this;
    }

    /**
     * Existence checker for rawContract
     * 
     * @see DataContractProperties.Fields#rawContract
     */
    public boolean hasRawContract() {
        if (_rawContractField!= null) {
            return true;
        }
        return super._map.containsKey("rawContract");
    }

    /**
     * Remover for rawContract
     * 
     * @see DataContractProperties.Fields#rawContract
     */
    public void removeRawContract() {
        super._map.remove("rawContract");
    }

    /**
     * Getter for rawContract
     * 
     * @see DataContractProperties.Fields#rawContract
     */
    @Nullable
    public String getRawContract(GetMode mode) {
        return getRawContract();
    }

    /**
     * Getter for rawContract
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataContractProperties.Fields#rawContract
     */
    @Nullable
    public String getRawContract() {
        if (_rawContractField!= null) {
            return _rawContractField;
        } else {
            Object __rawValue = super._map.get("rawContract");
            _rawContractField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _rawContractField;
        }
    }

    /**
     * Setter for rawContract
     * 
     * @see DataContractProperties.Fields#rawContract
     */
    public DataContractProperties setRawContract(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawContract(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRawContract();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawContract", value);
                    _rawContractField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rawContract", value);
                    _rawContractField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rawContract
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataContractProperties.Fields#rawContract
     */
    public DataContractProperties setRawContract(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawContract of com.linkedin.datacontract.DataContractProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawContract", value);
            _rawContractField = value;
        }
        return this;
    }

    @Override
    public DataContractProperties clone()
        throws CloneNotSupportedException
    {
        DataContractProperties __clone = ((DataContractProperties) super.clone());
        __clone.__changeListener = new DataContractProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataContractProperties copy()
        throws CloneNotSupportedException
    {
        DataContractProperties __copy = ((DataContractProperties) super.copy());
        __copy._schemaField = null;
        __copy._rawContractField = null;
        __copy._dataQualityField = null;
        __copy._freshnessField = null;
        __copy._entityField = null;
        __copy.__changeListener = new DataContractProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataContractProperties __objectRef;

        private ChangeListener(DataContractProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schema":
                    __objectRef._schemaField = null;
                    break;
                case "rawContract":
                    __objectRef._rawContractField = null;
                    break;
                case "dataQuality":
                    __objectRef._dataQualityField = null;
                    break;
                case "freshness":
                    __objectRef._freshnessField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * The entity that this contract is associated with. Currently, we only support Dataset contracts, but
         * in the future we may also support Data Product level contracts.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public com.linkedin.datacontract.SchemaContractArray.Fields schema() {
            return new com.linkedin.datacontract.SchemaContractArray.Fields(getPathComponents(), "schema");
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public PathSpec schema(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "schema");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public com.linkedin.datacontract.FreshnessContractArray.Fields freshness() {
            return new com.linkedin.datacontract.FreshnessContractArray.Fields(getPathComponents(), "freshness");
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public PathSpec freshness(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "freshness");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public com.linkedin.datacontract.DataQualityContractArray.Fields dataQuality() {
            return new com.linkedin.datacontract.DataQualityContractArray.Fields(getPathComponents(), "dataQuality");
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public PathSpec dataQuality(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "dataQuality");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * YAML-formatted contract definition
         * 
         */
        public PathSpec rawContract() {
            return new PathSpec(getPathComponents(), "rawContract");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.datacontract.SchemaContractArray.ProjectionMask _schemaMask;
        private com.linkedin.datacontract.FreshnessContractArray.ProjectionMask _freshnessMask;
        private com.linkedin.datacontract.DataQualityContractArray.ProjectionMask _dataQualityMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The entity that this contract is associated with. Currently, we only support Dataset contracts, but
         * in the future we may also support Data Product level contracts.
         * 
         */
        public DataContractProperties.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withSchema(Function<com.linkedin.datacontract.SchemaContractArray.ProjectionMask, com.linkedin.datacontract.SchemaContractArray.ProjectionMask> nestedMask) {
            _schemaMask = nestedMask.apply(((_schemaMask == null)?SchemaContractArray.createMask():_schemaMask));
            getDataMap().put("schema", _schemaMask.getDataMap());
            return this;
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withSchema() {
            _schemaMask = null;
            getDataMap().put("schema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withSchema(Function<com.linkedin.datacontract.SchemaContractArray.ProjectionMask, com.linkedin.datacontract.SchemaContractArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _schemaMask = nestedMask.apply(((_schemaMask == null)?SchemaContractArray.createMask():_schemaMask));
            getDataMap().put("schema", _schemaMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("schema").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("schema").put("$count", count);
            }
            return this;
        }

        /**
         * An optional set of schema contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withSchema(Integer start, Integer count) {
            _schemaMask = null;
            getDataMap().put("schema", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("schema").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("schema").put("$count", count);
            }
            return this;
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withFreshness(Function<com.linkedin.datacontract.FreshnessContractArray.ProjectionMask, com.linkedin.datacontract.FreshnessContractArray.ProjectionMask> nestedMask) {
            _freshnessMask = nestedMask.apply(((_freshnessMask == null)?FreshnessContractArray.createMask():_freshnessMask));
            getDataMap().put("freshness", _freshnessMask.getDataMap());
            return this;
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withFreshness() {
            _freshnessMask = null;
            getDataMap().put("freshness", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withFreshness(Function<com.linkedin.datacontract.FreshnessContractArray.ProjectionMask, com.linkedin.datacontract.FreshnessContractArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _freshnessMask = nestedMask.apply(((_freshnessMask == null)?FreshnessContractArray.createMask():_freshnessMask));
            getDataMap().put("freshness", _freshnessMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("freshness").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("freshness").put("$count", count);
            }
            return this;
        }

        /**
         * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
         * 
         */
        public DataContractProperties.ProjectionMask withFreshness(Integer start, Integer count) {
            _freshnessMask = null;
            getDataMap().put("freshness", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("freshness").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("freshness").put("$count", count);
            }
            return this;
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public DataContractProperties.ProjectionMask withDataQuality(Function<com.linkedin.datacontract.DataQualityContractArray.ProjectionMask, com.linkedin.datacontract.DataQualityContractArray.ProjectionMask> nestedMask) {
            _dataQualityMask = nestedMask.apply(((_dataQualityMask == null)?DataQualityContractArray.createMask():_dataQualityMask));
            getDataMap().put("dataQuality", _dataQualityMask.getDataMap());
            return this;
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public DataContractProperties.ProjectionMask withDataQuality() {
            _dataQualityMask = null;
            getDataMap().put("dataQuality", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public DataContractProperties.ProjectionMask withDataQuality(Function<com.linkedin.datacontract.DataQualityContractArray.ProjectionMask, com.linkedin.datacontract.DataQualityContractArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _dataQualityMask = nestedMask.apply(((_dataQualityMask == null)?DataQualityContractArray.createMask():_dataQualityMask));
            getDataMap().put("dataQuality", _dataQualityMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("dataQuality").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("dataQuality").put("$count", count);
            }
            return this;
        }

        /**
         * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
         * 
         */
        public DataContractProperties.ProjectionMask withDataQuality(Integer start, Integer count) {
            _dataQualityMask = null;
            getDataMap().put("dataQuality", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("dataQuality").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("dataQuality").put("$count", count);
            }
            return this;
        }

        /**
         * YAML-formatted contract definition
         * 
         */
        public DataContractProperties.ProjectionMask withRawContract() {
            getDataMap().put("rawContract", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
