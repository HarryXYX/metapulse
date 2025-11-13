
package com.linkedin.metadata.browse;

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
 * The model for the result of a browse query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResult.pdl.")
public class BrowseResult
    extends RecordTemplate
{

    private final static BrowseResult.Fields _fields = new BrowseResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for the result of a browse query*/record BrowseResult{/**A list of entities under the queried path*/entities:array[/**Data model for an entity returned as part of a browse query*/record BrowseResultEntity{/**Name of the entity*/name:optional string/**URN of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]/**A list of groups and total number of entities inside those groups under the queried path*/groups:array[record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}]=[]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**Total number of entities we can reach from path*/totalNumEntities:long}/**Offset of the first entity in the result*/from:int/**Size of each page in the result*/pageSize:int/**The total number of entities directly under queried path*/numEntities:int/**The total number of groups directly under queried path*/numGroups:int/**The total number of elements (entities + groups) directly under queried path*/numElements:int}", SchemaFormatType.PDL));
    private BrowseResultEntityArray _entitiesField = null;
    private BrowseResultGroupArray _groupsField = null;
    private BrowseResultMetadata _metadataField = null;
    private Integer _fromField = null;
    private Integer _pageSizeField = null;
    private Integer _numEntitiesField = null;
    private Integer _numGroupsField = null;
    private Integer _numElementsField = null;
    private BrowseResult.ChangeListener __changeListener = new BrowseResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static BrowseResultGroupArray DEFAULT_Groups;
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_From = SCHEMA.getField("from");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumEntities = SCHEMA.getField("numEntities");
    private final static RecordDataSchema.Field FIELD_NumGroups = SCHEMA.getField("numGroups");
    private final static RecordDataSchema.Field FIELD_NumElements = SCHEMA.getField("numElements");

    static {
        DEFAULT_Groups = ((FIELD_Groups.getDefault() == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(FIELD_Groups.getDefault(), DataList.class)));
    }

    public BrowseResult() {
        super(new DataMap(11, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public BrowseResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowseResult.Fields fields() {
        return _fields;
    }

    public static BrowseResult.ProjectionMask createMask() {
        return new BrowseResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entities
     * 
     * @see BrowseResult.Fields#entities
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
     * @see BrowseResult.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    @Nullable
    public BrowseResultEntityArray getEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntities();
            case DEFAULT:
            case NULL:
                if (_entitiesField!= null) {
                    return _entitiesField;
                } else {
                    Object __rawValue = super._map.get("entities");
                    _entitiesField = ((__rawValue == null)?null:new BrowseResultEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see BrowseResult.Fields#entities
     */
    @Nonnull
    public BrowseResultEntityArray getEntities() {
        if (_entitiesField!= null) {
            return _entitiesField;
        } else {
            Object __rawValue = super._map.get("entities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entities");
            }
            _entitiesField = ((__rawValue == null)?null:new BrowseResultEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entitiesField;
        }
    }

    /**
     * Setter for entities
     * 
     * @see BrowseResult.Fields#entities
     */
    public BrowseResult setEntities(
        @Nullable
        BrowseResultEntityArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.metadata.browse.BrowseResult");
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
     * @see BrowseResult.Fields#entities
     */
    public BrowseResult setEntities(
        @Nonnull
        BrowseResultEntityArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    @Nullable
    public BrowseResultGroupArray getGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getGroups();
            case NULL:
                if (_groupsField!= null) {
                    return _groupsField;
                } else {
                    Object __rawValue = super._map.get("groups");
                    _groupsField = ((__rawValue == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _groupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#groups
     */
    @Nonnull
    public BrowseResultGroupArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            if (__rawValue == null) {
                return DEFAULT_Groups;
            }
            _groupsField = ((__rawValue == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see BrowseResult.Fields#groups
     */
    public BrowseResult setGroups(
        @Nullable
        BrowseResultGroupArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groups of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#groups
     */
    public BrowseResult setGroups(
        @Nonnull
        BrowseResultGroupArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public boolean hasMetadata() {
        if (_metadataField!= null) {
            return true;
        }
        return super._map.containsKey("metadata");
    }

    /**
     * Remover for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public void removeMetadata() {
        super._map.remove("metadata");
    }

    /**
     * Getter for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    @Nullable
    public BrowseResultMetadata getMetadata(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetadata();
            case DEFAULT:
            case NULL:
                if (_metadataField!= null) {
                    return _metadataField;
                } else {
                    Object __rawValue = super._map.get("metadata");
                    _metadataField = ((__rawValue == null)?null:new BrowseResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _metadataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#metadata
     */
    @Nonnull
    public BrowseResultMetadata getMetadata() {
        if (_metadataField!= null) {
            return _metadataField;
        } else {
            Object __rawValue = super._map.get("metadata");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metadata");
            }
            _metadataField = ((__rawValue == null)?null:new BrowseResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metadataField;
        }
    }

    /**
     * Setter for metadata
     * 
     * @see BrowseResult.Fields#metadata
     */
    public BrowseResult setMetadata(
        @Nullable
        BrowseResultMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadata of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#metadata
     */
    public BrowseResult setMetadata(
        @Nonnull
        BrowseResultMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadata of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
            _metadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for from
     * 
     * @see BrowseResult.Fields#from
     */
    public boolean hasFrom() {
        if (_fromField!= null) {
            return true;
        }
        return super._map.containsKey("from");
    }

    /**
     * Remover for from
     * 
     * @see BrowseResult.Fields#from
     */
    public void removeFrom() {
        super._map.remove("from");
    }

    /**
     * Getter for from
     * 
     * @see BrowseResult.Fields#from
     */
    @Nullable
    public Integer getFrom(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFrom();
            case DEFAULT:
            case NULL:
                if (_fromField!= null) {
                    return _fromField;
                } else {
                    Object __rawValue = super._map.get("from");
                    _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _fromField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for from
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#from
     */
    @Nonnull
    public Integer getFrom() {
        if (_fromField!= null) {
            return _fromField;
        } else {
            Object __rawValue = super._map.get("from");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("from");
            }
            _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _fromField;
        }
    }

    /**
     * Setter for from
     * 
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFrom(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field from of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFrom();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field from of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
            _fromField = value;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @see BrowseResult.Fields#from
     */
    public BrowseResult setFrom(int value) {
        CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
        _fromField = value;
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public boolean hasPageSize() {
        if (_pageSizeField!= null) {
            return true;
        }
        return super._map.containsKey("pageSize");
    }

    /**
     * Remover for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public void removePageSize() {
        super._map.remove("pageSize");
    }

    /**
     * Getter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    @Nullable
    public Integer getPageSize(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPageSize();
            case DEFAULT:
            case NULL:
                if (_pageSizeField!= null) {
                    return _pageSizeField;
                } else {
                    Object __rawValue = super._map.get("pageSize");
                    _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _pageSizeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for pageSize
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#pageSize
     */
    @Nonnull
    public Integer getPageSize() {
        if (_pageSizeField!= null) {
            return _pageSizeField;
        } else {
            Object __rawValue = super._map.get("pageSize");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("pageSize");
            }
            _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _pageSizeField;
        }
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPageSize(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pageSize of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePageSize();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pageSize of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
            _pageSizeField = value;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResult.Fields#pageSize
     */
    public BrowseResult setPageSize(int value) {
        CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
        _pageSizeField = value;
        return this;
    }

    /**
     * Existence checker for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public boolean hasNumEntities() {
        if (_numEntitiesField!= null) {
            return true;
        }
        return super._map.containsKey("numEntities");
    }

    /**
     * Remover for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public void removeNumEntities() {
        super._map.remove("numEntities");
    }

    /**
     * Getter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    @Nullable
    public Integer getNumEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNumEntities();
            case DEFAULT:
            case NULL:
                if (_numEntitiesField!= null) {
                    return _numEntitiesField;
                } else {
                    Object __rawValue = super._map.get("numEntities");
                    _numEntitiesField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _numEntitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numEntities
     */
    @Nonnull
    public Integer getNumEntities() {
        if (_numEntitiesField!= null) {
            return _numEntitiesField;
        } else {
            Object __rawValue = super._map.get("numEntities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("numEntities");
            }
            _numEntitiesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _numEntitiesField;
        }
    }

    /**
     * Setter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numEntities of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numEntities of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
            _numEntitiesField = value;
        }
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @see BrowseResult.Fields#numEntities
     */
    public BrowseResult setNumEntities(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
        _numEntitiesField = value;
        return this;
    }

    /**
     * Existence checker for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public boolean hasNumGroups() {
        if (_numGroupsField!= null) {
            return true;
        }
        return super._map.containsKey("numGroups");
    }

    /**
     * Remover for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public void removeNumGroups() {
        super._map.remove("numGroups");
    }

    /**
     * Getter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    @Nullable
    public Integer getNumGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNumGroups();
            case DEFAULT:
            case NULL:
                if (_numGroupsField!= null) {
                    return _numGroupsField;
                } else {
                    Object __rawValue = super._map.get("numGroups");
                    _numGroupsField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _numGroupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numGroups
     */
    @Nonnull
    public Integer getNumGroups() {
        if (_numGroupsField!= null) {
            return _numGroupsField;
        } else {
            Object __rawValue = super._map.get("numGroups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("numGroups");
            }
            _numGroupsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _numGroupsField;
        }
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numGroups of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numGroups of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
            _numGroupsField = value;
        }
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResult.Fields#numGroups
     */
    public BrowseResult setNumGroups(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
        _numGroupsField = value;
        return this;
    }

    /**
     * Existence checker for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public boolean hasNumElements() {
        if (_numElementsField!= null) {
            return true;
        }
        return super._map.containsKey("numElements");
    }

    /**
     * Remover for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public void removeNumElements() {
        super._map.remove("numElements");
    }

    /**
     * Getter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    @Nullable
    public Integer getNumElements(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNumElements();
            case DEFAULT:
            case NULL:
                if (_numElementsField!= null) {
                    return _numElementsField;
                } else {
                    Object __rawValue = super._map.get("numElements");
                    _numElementsField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _numElementsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numElements
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResult.Fields#numElements
     */
    @Nonnull
    public Integer getNumElements() {
        if (_numElementsField!= null) {
            return _numElementsField;
        } else {
            Object __rawValue = super._map.get("numElements");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("numElements");
            }
            _numElementsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _numElementsField;
        }
    }

    /**
     * Setter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumElements(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numElements of com.linkedin.metadata.browse.BrowseResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numElements", DataTemplateUtil.coerceIntInput(value));
                    _numElementsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumElements();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numElements", DataTemplateUtil.coerceIntInput(value));
                    _numElementsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numElements", DataTemplateUtil.coerceIntInput(value));
                    _numElementsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numElements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numElements of com.linkedin.metadata.browse.BrowseResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numElements", DataTemplateUtil.coerceIntInput(value));
            _numElementsField = value;
        }
        return this;
    }

    /**
     * Setter for numElements
     * 
     * @see BrowseResult.Fields#numElements
     */
    public BrowseResult setNumElements(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numElements", DataTemplateUtil.coerceIntInput(value));
        _numElementsField = value;
        return this;
    }

    @Override
    public BrowseResult clone()
        throws CloneNotSupportedException
    {
        BrowseResult __clone = ((BrowseResult) super.clone());
        __clone.__changeListener = new BrowseResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowseResult copy()
        throws CloneNotSupportedException
    {
        BrowseResult __copy = ((BrowseResult) super.copy());
        __copy._numEntitiesField = null;
        __copy._numGroupsField = null;
        __copy._metadataField = null;
        __copy._entitiesField = null;
        __copy._groupsField = null;
        __copy._pageSizeField = null;
        __copy._fromField = null;
        __copy._numElementsField = null;
        __copy.__changeListener = new BrowseResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowseResult __objectRef;

        private ChangeListener(BrowseResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "numEntities":
                    __objectRef._numEntitiesField = null;
                    break;
                case "numGroups":
                    __objectRef._numGroupsField = null;
                    break;
                case "metadata":
                    __objectRef._metadataField = null;
                    break;
                case "entities":
                    __objectRef._entitiesField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "pageSize":
                    __objectRef._pageSizeField = null;
                    break;
                case "from":
                    __objectRef._fromField = null;
                    break;
                case "numElements":
                    __objectRef._numElementsField = null;
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
         * A list of entities under the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultEntityArray.Fields entities() {
            return new com.linkedin.metadata.browse.BrowseResultEntityArray.Fields(getPathComponents(), "entities");
        }

        /**
         * A list of entities under the queried path
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultGroupArray.Fields groups() {
            return new com.linkedin.metadata.browse.BrowseResultGroupArray.Fields(getPathComponents(), "groups");
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultMetadata.Fields metadata() {
            return new com.linkedin.metadata.browse.BrowseResultMetadata.Fields(getPathComponents(), "metadata");
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec from() {
            return new PathSpec(getPathComponents(), "from");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec pageSize() {
            return new PathSpec(getPathComponents(), "pageSize");
        }

        /**
         * The total number of entities directly under queried path
         * 
         */
        public PathSpec numEntities() {
            return new PathSpec(getPathComponents(), "numEntities");
        }

        /**
         * The total number of groups directly under queried path
         * 
         */
        public PathSpec numGroups() {
            return new PathSpec(getPathComponents(), "numGroups");
        }

        /**
         * The total number of elements (entities + groups) directly under queried path
         * 
         */
        public PathSpec numElements() {
            return new PathSpec(getPathComponents(), "numElements");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.browse.BrowseResultEntityArray.ProjectionMask _entitiesMask;
        private com.linkedin.metadata.browse.BrowseResultGroupArray.ProjectionMask _groupsMask;
        private com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask _metadataMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * A list of entities under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withEntities(Function<com.linkedin.metadata.browse.BrowseResultEntityArray.ProjectionMask, com.linkedin.metadata.browse.BrowseResultEntityArray.ProjectionMask> nestedMask) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?BrowseResultEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            return this;
        }

        /**
         * A list of entities under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withEntities() {
            _entitiesMask = null;
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of entities under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withEntities(Function<com.linkedin.metadata.browse.BrowseResultEntityArray.ProjectionMask, com.linkedin.metadata.browse.BrowseResultEntityArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?BrowseResultEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * A list of entities under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withEntities(Integer start, Integer count) {
            _entitiesMask = null;
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withGroups(Function<com.linkedin.metadata.browse.BrowseResultGroupArray.ProjectionMask, com.linkedin.metadata.browse.BrowseResultGroupArray.ProjectionMask> nestedMask) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withGroups() {
            _groupsMask = null;
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withGroups(Function<com.linkedin.metadata.browse.BrowseResultGroupArray.ProjectionMask, com.linkedin.metadata.browse.BrowseResultGroupArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResult.ProjectionMask withGroups(Integer start, Integer count) {
            _groupsMask = null;
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public BrowseResult.ProjectionMask withMetadata(Function<com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask, com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask> nestedMask) {
            _metadataMask = nestedMask.apply(((_metadataMask == null)?BrowseResultMetadata.createMask():_metadataMask));
            getDataMap().put("metadata", _metadataMask.getDataMap());
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public BrowseResult.ProjectionMask withMetadata() {
            _metadataMask = null;
            getDataMap().put("metadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public BrowseResult.ProjectionMask withFrom() {
            getDataMap().put("from", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of each page in the result
         * 
         */
        public BrowseResult.ProjectionMask withPageSize() {
            getDataMap().put("pageSize", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of entities directly under queried path
         * 
         */
        public BrowseResult.ProjectionMask withNumEntities() {
            getDataMap().put("numEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of groups directly under queried path
         * 
         */
        public BrowseResult.ProjectionMask withNumGroups() {
            getDataMap().put("numGroups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of elements (entities + groups) directly under queried path
         * 
         */
        public BrowseResult.ProjectionMask withNumElements() {
            getDataMap().put("numElements", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
