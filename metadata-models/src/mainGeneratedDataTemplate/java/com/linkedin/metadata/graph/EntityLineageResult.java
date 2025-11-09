
package com.linkedin.metadata.graph;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * A list of lineage information associated with a source Entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/graph/EntityLineageResult.pdl.")
public class EntityLineageResult
    extends RecordTemplate
{

    private final static EntityLineageResult.Fields _fields = new EntityLineageResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.graph/**A list of lineage information associated with a source Entity*/record EntityLineageResult{/**Start offset of the result set*/start:int/**Number of results in the returned result set*/count:int/**Total number of results in the result set*/total:int/**The number of results that were filtered out of the page (soft-deleted or non-existent)*/filtered:optional int=0/**Relationships in the result set*/relationships:array[/**Metadata about a lineage relationship between two entities*/record LineageRelationship{/**The type of the relationship*/type:string/**Entity that is related via lineage*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)\nDeprecated by degrees. degree field is populated by min(degrees) for backward compatibility.*/@deprecated,degree:int=1/**Timestamp for when this lineage relationship was created. Could be null.*/createdOn:optional long/**Urn of the actor that created this lineage relationship. Could be null.*/createdActor:optional com.linkedin.common.Urn/**Timestamp for when this lineage relationship was last updated. Could be null.*/updatedOn:optional long/**Urn of the actor that last updated this lineage relationship. Could be null.*/updatedActor:optional com.linkedin.common.Urn/**Whether this lineage edge is a manual edge.*/isManual:optional boolean/**The different depths at which this entity is discovered in the lineage graph.\nMarked as optional to maintain backward compatibility, but is filled out by implementations. \nReplaces the deprecated field \"degree\".\n*/degrees:optional array[int]/**Marks this relationship as explored during the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}]}", SchemaFormatType.PDL));
    private Integer _startField = null;
    private Integer _countField = null;
    private Integer _totalField = null;
    private Integer _filteredField = null;
    private LineageRelationshipArray _relationshipsField = null;
    private EntityLineageResult.ChangeListener __changeListener = new EntityLineageResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Start = SCHEMA.getField("start");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");
    private final static RecordDataSchema.Field FIELD_Filtered = SCHEMA.getField("filtered");
    private final static Integer DEFAULT_Filtered;
    private final static RecordDataSchema.Field FIELD_Relationships = SCHEMA.getField("relationships");

    static {
        DEFAULT_Filtered = DataTemplateUtil.coerceIntOutput(FIELD_Filtered.getDefault());
    }

    public EntityLineageResult() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public EntityLineageResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EntityLineageResult.Fields fields() {
        return _fields;
    }

    public static EntityLineageResult.ProjectionMask createMask() {
        return new EntityLineageResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for start
     * 
     * @see EntityLineageResult.Fields#start
     */
    public boolean hasStart() {
        if (_startField!= null) {
            return true;
        }
        return super._map.containsKey("start");
    }

    /**
     * Remover for start
     * 
     * @see EntityLineageResult.Fields#start
     */
    public void removeStart() {
        super._map.remove("start");
    }

    /**
     * Getter for start
     * 
     * @see EntityLineageResult.Fields#start
     */
    @Nullable
    public Integer getStart(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStart();
            case DEFAULT:
            case NULL:
                if (_startField!= null) {
                    return _startField;
                } else {
                    Object __rawValue = super._map.get("start");
                    _startField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _startField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for start
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityLineageResult.Fields#start
     */
    @Nonnull
    public Integer getStart() {
        if (_startField!= null) {
            return _startField;
        } else {
            Object __rawValue = super._map.get("start");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("start");
            }
            _startField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _startField;
        }
    }

    /**
     * Setter for start
     * 
     * @see EntityLineageResult.Fields#start
     */
    public EntityLineageResult setStart(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStart(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field start of com.linkedin.metadata.graph.EntityLineageResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
                    _startField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStart();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
                    _startField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
                    _startField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for start
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityLineageResult.Fields#start
     */
    public EntityLineageResult setStart(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field start of com.linkedin.metadata.graph.EntityLineageResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
            _startField = value;
        }
        return this;
    }

    /**
     * Setter for start
     * 
     * @see EntityLineageResult.Fields#start
     */
    public EntityLineageResult setStart(int value) {
        CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
        _startField = value;
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see EntityLineageResult.Fields#count
     */
    public boolean hasCount() {
        if (_countField!= null) {
            return true;
        }
        return super._map.containsKey("count");
    }

    /**
     * Remover for count
     * 
     * @see EntityLineageResult.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see EntityLineageResult.Fields#count
     */
    @Nullable
    public Integer getCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCount();
            case DEFAULT:
            case NULL:
                if (_countField!= null) {
                    return _countField;
                } else {
                    Object __rawValue = super._map.get("count");
                    _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _countField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityLineageResult.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        if (_countField!= null) {
            return _countField;
        } else {
            Object __rawValue = super._map.get("count");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("count");
            }
            _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _countField;
        }
    }

    /**
     * Setter for count
     * 
     * @see EntityLineageResult.Fields#count
     */
    public EntityLineageResult setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.metadata.graph.EntityLineageResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityLineageResult.Fields#count
     */
    public EntityLineageResult setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.metadata.graph.EntityLineageResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see EntityLineageResult.Fields#count
     */
    public EntityLineageResult setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see EntityLineageResult.Fields#total
     */
    public boolean hasTotal() {
        if (_totalField!= null) {
            return true;
        }
        return super._map.containsKey("total");
    }

    /**
     * Remover for total
     * 
     * @see EntityLineageResult.Fields#total
     */
    public void removeTotal() {
        super._map.remove("total");
    }

    /**
     * Getter for total
     * 
     * @see EntityLineageResult.Fields#total
     */
    @Nullable
    public Integer getTotal(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTotal();
            case DEFAULT:
            case NULL:
                if (_totalField!= null) {
                    return _totalField;
                } else {
                    Object __rawValue = super._map.get("total");
                    _totalField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _totalField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for total
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityLineageResult.Fields#total
     */
    @Nonnull
    public Integer getTotal() {
        if (_totalField!= null) {
            return _totalField;
        } else {
            Object __rawValue = super._map.get("total");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("total");
            }
            _totalField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalField;
        }
    }

    /**
     * Setter for total
     * 
     * @see EntityLineageResult.Fields#total
     */
    public EntityLineageResult setTotal(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field total of com.linkedin.metadata.graph.EntityLineageResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityLineageResult.Fields#total
     */
    public EntityLineageResult setTotal(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field total of com.linkedin.metadata.graph.EntityLineageResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
            _totalField = value;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @see EntityLineageResult.Fields#total
     */
    public EntityLineageResult setTotal(int value) {
        CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
        _totalField = value;
        return this;
    }

    /**
     * Existence checker for filtered
     * 
     * @see EntityLineageResult.Fields#filtered
     */
    public boolean hasFiltered() {
        if (_filteredField!= null) {
            return true;
        }
        return super._map.containsKey("filtered");
    }

    /**
     * Remover for filtered
     * 
     * @see EntityLineageResult.Fields#filtered
     */
    public void removeFiltered() {
        super._map.remove("filtered");
    }

    /**
     * Getter for filtered
     * 
     * @see EntityLineageResult.Fields#filtered
     */
    @Nullable
    public Integer getFiltered(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getFiltered();
            case NULL:
                if (_filteredField!= null) {
                    return _filteredField;
                } else {
                    Object __rawValue = super._map.get("filtered");
                    _filteredField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _filteredField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for filtered
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EntityLineageResult.Fields#filtered
     */
    @Nullable
    public Integer getFiltered() {
        if (_filteredField!= null) {
            return _filteredField;
        } else {
            Object __rawValue = super._map.get("filtered");
            if (__rawValue == null) {
                return DEFAULT_Filtered;
            }
            _filteredField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _filteredField;
        }
    }

    /**
     * Setter for filtered
     * 
     * @see EntityLineageResult.Fields#filtered
     */
    public EntityLineageResult setFiltered(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFiltered(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFiltered();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filtered", DataTemplateUtil.coerceIntInput(value));
                    _filteredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filtered", DataTemplateUtil.coerceIntInput(value));
                    _filteredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filtered
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityLineageResult.Fields#filtered
     */
    public EntityLineageResult setFiltered(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filtered of com.linkedin.metadata.graph.EntityLineageResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filtered", DataTemplateUtil.coerceIntInput(value));
            _filteredField = value;
        }
        return this;
    }

    /**
     * Setter for filtered
     * 
     * @see EntityLineageResult.Fields#filtered
     */
    public EntityLineageResult setFiltered(int value) {
        CheckedUtil.putWithoutChecking(super._map, "filtered", DataTemplateUtil.coerceIntInput(value));
        _filteredField = value;
        return this;
    }

    /**
     * Existence checker for relationships
     * 
     * @see EntityLineageResult.Fields#relationships
     */
    public boolean hasRelationships() {
        if (_relationshipsField!= null) {
            return true;
        }
        return super._map.containsKey("relationships");
    }

    /**
     * Remover for relationships
     * 
     * @see EntityLineageResult.Fields#relationships
     */
    public void removeRelationships() {
        super._map.remove("relationships");
    }

    /**
     * Getter for relationships
     * 
     * @see EntityLineageResult.Fields#relationships
     */
    @Nullable
    public LineageRelationshipArray getRelationships(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelationships();
            case DEFAULT:
            case NULL:
                if (_relationshipsField!= null) {
                    return _relationshipsField;
                } else {
                    Object __rawValue = super._map.get("relationships");
                    _relationshipsField = ((__rawValue == null)?null:new LineageRelationshipArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _relationshipsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for relationships
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityLineageResult.Fields#relationships
     */
    @Nonnull
    public LineageRelationshipArray getRelationships() {
        if (_relationshipsField!= null) {
            return _relationshipsField;
        } else {
            Object __rawValue = super._map.get("relationships");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relationships");
            }
            _relationshipsField = ((__rawValue == null)?null:new LineageRelationshipArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relationshipsField;
        }
    }

    /**
     * Setter for relationships
     * 
     * @see EntityLineageResult.Fields#relationships
     */
    public EntityLineageResult setRelationships(
        @Nullable
        LineageRelationshipArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelationships(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relationships of com.linkedin.metadata.graph.EntityLineageResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationships", value.data());
                    _relationshipsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelationships();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationships", value.data());
                    _relationshipsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relationships", value.data());
                    _relationshipsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relationships
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityLineageResult.Fields#relationships
     */
    public EntityLineageResult setRelationships(
        @Nonnull
        LineageRelationshipArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relationships of com.linkedin.metadata.graph.EntityLineageResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relationships", value.data());
            _relationshipsField = value;
        }
        return this;
    }

    @Override
    public EntityLineageResult clone()
        throws CloneNotSupportedException
    {
        EntityLineageResult __clone = ((EntityLineageResult) super.clone());
        __clone.__changeListener = new EntityLineageResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EntityLineageResult copy()
        throws CloneNotSupportedException
    {
        EntityLineageResult __copy = ((EntityLineageResult) super.copy());
        __copy._relationshipsField = null;
        __copy._totalField = null;
        __copy._filteredField = null;
        __copy._startField = null;
        __copy._countField = null;
        __copy.__changeListener = new EntityLineageResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EntityLineageResult __objectRef;

        private ChangeListener(EntityLineageResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "relationships":
                    __objectRef._relationshipsField = null;
                    break;
                case "total":
                    __objectRef._totalField = null;
                    break;
                case "filtered":
                    __objectRef._filteredField = null;
                    break;
                case "start":
                    __objectRef._startField = null;
                    break;
                case "count":
                    __objectRef._countField = null;
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
         * Start offset of the result set
         * 
         */
        public PathSpec start() {
            return new PathSpec(getPathComponents(), "start");
        }

        /**
         * Number of results in the returned result set
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * Total number of results in the result set
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

        /**
         * The number of results that were filtered out of the page (soft-deleted or non-existent)
         * 
         */
        public PathSpec filtered() {
            return new PathSpec(getPathComponents(), "filtered");
        }

        /**
         * Relationships in the result set
         * 
         */
        public com.linkedin.metadata.graph.LineageRelationshipArray.Fields relationships() {
            return new com.linkedin.metadata.graph.LineageRelationshipArray.Fields(getPathComponents(), "relationships");
        }

        /**
         * Relationships in the result set
         * 
         */
        public PathSpec relationships(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relationships");
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

        private com.linkedin.metadata.graph.LineageRelationshipArray.ProjectionMask _relationshipsMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Start offset of the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withStart() {
            getDataMap().put("start", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of results in the returned result set
         * 
         */
        public EntityLineageResult.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Total number of results in the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withTotal() {
            getDataMap().put("total", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The number of results that were filtered out of the page (soft-deleted or non-existent)
         * 
         */
        public EntityLineageResult.ProjectionMask withFiltered() {
            getDataMap().put("filtered", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Relationships in the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withRelationships(Function<com.linkedin.metadata.graph.LineageRelationshipArray.ProjectionMask, com.linkedin.metadata.graph.LineageRelationshipArray.ProjectionMask> nestedMask) {
            _relationshipsMask = nestedMask.apply(((_relationshipsMask == null)?LineageRelationshipArray.createMask():_relationshipsMask));
            getDataMap().put("relationships", _relationshipsMask.getDataMap());
            return this;
        }

        /**
         * Relationships in the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withRelationships() {
            _relationshipsMask = null;
            getDataMap().put("relationships", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Relationships in the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withRelationships(Function<com.linkedin.metadata.graph.LineageRelationshipArray.ProjectionMask, com.linkedin.metadata.graph.LineageRelationshipArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _relationshipsMask = nestedMask.apply(((_relationshipsMask == null)?LineageRelationshipArray.createMask():_relationshipsMask));
            getDataMap().put("relationships", _relationshipsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("relationships").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relationships").put("$count", count);
            }
            return this;
        }

        /**
         * Relationships in the result set
         * 
         */
        public EntityLineageResult.ProjectionMask withRelationships(Integer start, Integer count) {
            _relationshipsMask = null;
            getDataMap().put("relationships", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("relationships").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relationships").put("$count", count);
            }
            return this;
        }

    }

}
