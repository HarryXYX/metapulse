
package com.linkedin.metadata.query;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
 * The model for the result of a list query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/ListResult.pdl.")
public class ListResult
    extends RecordTemplate
{

    private final static ListResult.Fields _fields = new ListResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The model for the result of a list query*/record ListResult{/**A list of entities returned in the list*/entities:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Offset of the first entity in the result*/start:int/**Size of each page in the result*/count:int/**The total number of entities directly under searched path*/total:int}", SchemaFormatType.PDL));
    private UrnArray _entitiesField = null;
    private Integer _startField = null;
    private Integer _countField = null;
    private Integer _totalField = null;
    private ListResult.ChangeListener __changeListener = new ListResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Start = SCHEMA.getField("start");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");

    public ListResult() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ListResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ListResult.Fields fields() {
        return _fields;
    }

    public static ListResult.ProjectionMask createMask() {
        return new ListResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entities
     * 
     * @see ListResult.Fields#entities
     */
    public boolean hasEntities() {
        if (_entitiesField!= null) {
            return true;
        }
        return super._map.containsKey("entities");
    }

    /**
     * Remover for entities
     * 
     * @see ListResult.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see ListResult.Fields#entities
     */
    @Nullable
    public UrnArray getEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntities();
            case DEFAULT:
            case NULL:
                if (_entitiesField!= null) {
                    return _entitiesField;
                } else {
                    Object __rawValue = super._map.get("entities");
                    _entitiesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListResult.Fields#entities
     */
    @Nonnull
    public UrnArray getEntities() {
        if (_entitiesField!= null) {
            return _entitiesField;
        } else {
            Object __rawValue = super._map.get("entities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entities");
            }
            _entitiesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entitiesField;
        }
    }

    /**
     * Setter for entities
     * 
     * @see ListResult.Fields#entities
     */
    public ListResult setEntities(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.metadata.query.ListResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListResult.Fields#entities
     */
    public ListResult setEntities(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.metadata.query.ListResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for start
     * 
     * @see ListResult.Fields#start
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
     * @see ListResult.Fields#start
     */
    public void removeStart() {
        super._map.remove("start");
    }

    /**
     * Getter for start
     * 
     * @see ListResult.Fields#start
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
     * @see ListResult.Fields#start
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
     * @see ListResult.Fields#start
     */
    public ListResult setStart(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStart(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field start of com.linkedin.metadata.query.ListResult");
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
     * @see ListResult.Fields#start
     */
    public ListResult setStart(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field start of com.linkedin.metadata.query.ListResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
            _startField = value;
        }
        return this;
    }

    /**
     * Setter for start
     * 
     * @see ListResult.Fields#start
     */
    public ListResult setStart(int value) {
        CheckedUtil.putWithoutChecking(super._map, "start", DataTemplateUtil.coerceIntInput(value));
        _startField = value;
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see ListResult.Fields#count
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
     * @see ListResult.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see ListResult.Fields#count
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
     * @see ListResult.Fields#count
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
     * @see ListResult.Fields#count
     */
    public ListResult setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.metadata.query.ListResult");
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
     * @see ListResult.Fields#count
     */
    public ListResult setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.metadata.query.ListResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see ListResult.Fields#count
     */
    public ListResult setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see ListResult.Fields#total
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
     * @see ListResult.Fields#total
     */
    public void removeTotal() {
        super._map.remove("total");
    }

    /**
     * Getter for total
     * 
     * @see ListResult.Fields#total
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
     * @see ListResult.Fields#total
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
     * @see ListResult.Fields#total
     */
    public ListResult setTotal(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field total of com.linkedin.metadata.query.ListResult");
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
     * @see ListResult.Fields#total
     */
    public ListResult setTotal(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field total of com.linkedin.metadata.query.ListResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
            _totalField = value;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @see ListResult.Fields#total
     */
    public ListResult setTotal(int value) {
        CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
        _totalField = value;
        return this;
    }

    @Override
    public ListResult clone()
        throws CloneNotSupportedException
    {
        ListResult __clone = ((ListResult) super.clone());
        __clone.__changeListener = new ListResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ListResult copy()
        throws CloneNotSupportedException
    {
        ListResult __copy = ((ListResult) super.copy());
        __copy._totalField = null;
        __copy._entitiesField = null;
        __copy._startField = null;
        __copy._countField = null;
        __copy.__changeListener = new ListResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ListResult __objectRef;

        private ChangeListener(ListResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "total":
                    __objectRef._totalField = null;
                    break;
                case "entities":
                    __objectRef._entitiesField = null;
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
         * A list of entities returned in the list
         * 
         */
        public PathSpec entities() {
            return new PathSpec(getPathComponents(), "entities");
        }

        /**
         * A list of entities returned in the list
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec start() {
            return new PathSpec(getPathComponents(), "start");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * A list of entities returned in the list
         * 
         */
        public ListResult.ProjectionMask withEntities() {
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of entities returned in the list
         * 
         */
        public ListResult.ProjectionMask withEntities(Integer start, Integer count) {
            getDataMap().put("entities", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public ListResult.ProjectionMask withStart() {
            getDataMap().put("start", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of each page in the result
         * 
         */
        public ListResult.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public ListResult.ProjectionMask withTotal() {
            getDataMap().put("total", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
