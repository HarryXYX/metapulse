
package com.linkedin.common;

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
 * Downstream lineage of a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/EntityRelationships.pdl.")
public class EntityRelationships
    extends RecordTemplate
{

    private final static EntityRelationships.Fields _fields = new EntityRelationships.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Downstream lineage of a dataset*/record EntityRelationships{/**List of related entities*/relationships:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record EntityRelationship{/**Audit stamp containing who reported the lineage and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**The downstream dataset the lineage points to*/entity:Urn/**The type of the relationship*/type:string}]/**The start of the result set*/start:int/**The start of the result set*/count:int/**Total number of edges found.*/total:int}", SchemaFormatType.PDL));
    private EntityRelationshipArray _relationshipsField = null;
    private Integer _startField = null;
    private Integer _countField = null;
    private Integer _totalField = null;
    private EntityRelationships.ChangeListener __changeListener = new EntityRelationships.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Relationships = SCHEMA.getField("relationships");
    private final static RecordDataSchema.Field FIELD_Start = SCHEMA.getField("start");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");

    public EntityRelationships() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public EntityRelationships(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EntityRelationships.Fields fields() {
        return _fields;
    }

    public static EntityRelationships.ProjectionMask createMask() {
        return new EntityRelationships.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for relationships
     * 
     * @see EntityRelationships.Fields#relationships
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
     * @see EntityRelationships.Fields#relationships
     */
    public void removeRelationships() {
        super._map.remove("relationships");
    }

    /**
     * Getter for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    @Nullable
    public EntityRelationshipArray getRelationships(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelationships();
            case DEFAULT:
            case NULL:
                if (_relationshipsField!= null) {
                    return _relationshipsField;
                } else {
                    Object __rawValue = super._map.get("relationships");
                    _relationshipsField = ((__rawValue == null)?null:new EntityRelationshipArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see EntityRelationships.Fields#relationships
     */
    @Nonnull
    public EntityRelationshipArray getRelationships() {
        if (_relationshipsField!= null) {
            return _relationshipsField;
        } else {
            Object __rawValue = super._map.get("relationships");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relationships");
            }
            _relationshipsField = ((__rawValue == null)?null:new EntityRelationshipArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relationshipsField;
        }
    }

    /**
     * Setter for relationships
     * 
     * @see EntityRelationships.Fields#relationships
     */
    public EntityRelationships setRelationships(
        @Nullable
        EntityRelationshipArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelationships(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relationships of com.linkedin.common.EntityRelationships");
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
     * @see EntityRelationships.Fields#relationships
     */
    public EntityRelationships setRelationships(
        @Nonnull
        EntityRelationshipArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relationships of com.linkedin.common.EntityRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relationships", value.data());
            _relationshipsField = value;
        }
        return this;
    }

    /**
     * Existence checker for start
     * 
     * @see EntityRelationships.Fields#start
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
     * @see EntityRelationships.Fields#start
     */
    public void removeStart() {
        super._map.remove("start");
    }

    /**
     * Getter for start
     * 
     * @see EntityRelationships.Fields#start
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
     * @see EntityRelationships.Fields#start
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
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStart(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field start of com.linkedin.common.EntityRelationships");
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
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field start of com.linkedin.common.EntityRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
            _startField = value;
        }
        return this;
    }

    /**
     * Setter for start
     * 
     * @see EntityRelationships.Fields#start
     */
    public EntityRelationships setStart(int value) {
        CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
        _startField = value;
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see EntityRelationships.Fields#count
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
     * @see EntityRelationships.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see EntityRelationships.Fields#count
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
     * @see EntityRelationships.Fields#count
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
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.common.EntityRelationships");
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
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.common.EntityRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see EntityRelationships.Fields#count
     */
    public EntityRelationships setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see EntityRelationships.Fields#total
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
     * @see EntityRelationships.Fields#total
     */
    public void removeTotal() {
        super._map.remove("total");
    }

    /**
     * Getter for total
     * 
     * @see EntityRelationships.Fields#total
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
     * @see EntityRelationships.Fields#total
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
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field total of com.linkedin.common.EntityRelationships");
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
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field total of com.linkedin.common.EntityRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
            _totalField = value;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @see EntityRelationships.Fields#total
     */
    public EntityRelationships setTotal(int value) {
        CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
        _totalField = value;
        return this;
    }

    @Override
    public EntityRelationships clone()
        throws CloneNotSupportedException
    {
        EntityRelationships __clone = ((EntityRelationships) super.clone());
        __clone.__changeListener = new EntityRelationships.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EntityRelationships copy()
        throws CloneNotSupportedException
    {
        EntityRelationships __copy = ((EntityRelationships) super.copy());
        __copy._relationshipsField = null;
        __copy._totalField = null;
        __copy._startField = null;
        __copy._countField = null;
        __copy.__changeListener = new EntityRelationships.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EntityRelationships __objectRef;

        private ChangeListener(EntityRelationships reference) {
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
         * List of related entities
         * 
         */
        public com.linkedin.common.EntityRelationshipArray.Fields relationships() {
            return new com.linkedin.common.EntityRelationshipArray.Fields(getPathComponents(), "relationships");
        }

        /**
         * List of related entities
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

        /**
         * The start of the result set
         * 
         */
        public PathSpec start() {
            return new PathSpec(getPathComponents(), "start");
        }

        /**
         * The start of the result set
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * Total number of edges found.
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.EntityRelationshipArray.ProjectionMask _relationshipsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * List of related entities
         * 
         */
        public EntityRelationships.ProjectionMask withRelationships(Function<com.linkedin.common.EntityRelationshipArray.ProjectionMask, com.linkedin.common.EntityRelationshipArray.ProjectionMask> nestedMask) {
            _relationshipsMask = nestedMask.apply(((_relationshipsMask == null)?EntityRelationshipArray.createMask():_relationshipsMask));
            getDataMap().put("relationships", _relationshipsMask.getDataMap());
            return this;
        }

        /**
         * List of related entities
         * 
         */
        public EntityRelationships.ProjectionMask withRelationships() {
            _relationshipsMask = null;
            getDataMap().put("relationships", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of related entities
         * 
         */
        public EntityRelationships.ProjectionMask withRelationships(Function<com.linkedin.common.EntityRelationshipArray.ProjectionMask, com.linkedin.common.EntityRelationshipArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _relationshipsMask = nestedMask.apply(((_relationshipsMask == null)?EntityRelationshipArray.createMask():_relationshipsMask));
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
         * List of related entities
         * 
         */
        public EntityRelationships.ProjectionMask withRelationships(Integer start, Integer count) {
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

        /**
         * The start of the result set
         * 
         */
        public EntityRelationships.ProjectionMask withStart() {
            getDataMap().put("start", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The start of the result set
         * 
         */
        public EntityRelationships.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Total number of edges found.
         * 
         */
        public EntityRelationships.ProjectionMask withTotal() {
            getDataMap().put("total", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
