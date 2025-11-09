
package com.linkedin.metadata.graph;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.common.UrnArrayArray;
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
import com.linkedin.data.template.IntegerArray;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Metadata about a lineage relationship between two entities
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/graph/LineageRelationship.pdl.")
public class LineageRelationship
    extends RecordTemplate
{

    private final static LineageRelationship.Fields _fields = new LineageRelationship.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.graph/**Metadata about a lineage relationship between two entities*/record LineageRelationship{/**The type of the relationship*/type:string/**Entity that is related via lineage*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)\nDeprecated by degrees. degree field is populated by min(degrees) for backward compatibility.*/@deprecated,degree:int=1/**Timestamp for when this lineage relationship was created. Could be null.*/createdOn:optional long/**Urn of the actor that created this lineage relationship. Could be null.*/createdActor:optional com.linkedin.common.Urn/**Timestamp for when this lineage relationship was last updated. Could be null.*/updatedOn:optional long/**Urn of the actor that last updated this lineage relationship. Could be null.*/updatedActor:optional com.linkedin.common.Urn/**Whether this lineage edge is a manual edge.*/isManual:optional boolean/**The different depths at which this entity is discovered in the lineage graph.\nMarked as optional to maintain backward compatibility, but is filled out by implementations. \nReplaces the deprecated field \"degree\".\n*/degrees:optional array[int]/**Marks this relationship as explored during the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}", SchemaFormatType.PDL));
    private String _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private UrnArrayArray _pathsField = null;
    private UrnArray _pathField = null;
    private Integer _degreeField = null;
    private Long _createdOnField = null;
    private com.linkedin.common.urn.Urn _createdActorField = null;
    private Long _updatedOnField = null;
    private com.linkedin.common.urn.Urn _updatedActorField = null;
    private Boolean _isManualField = null;
    private IntegerArray _degreesField = null;
    private Boolean _exploredField = null;
    private Boolean _truncatedChildrenField = null;
    private Boolean _ignoredAsHopField = null;
    private LineageRelationship.ChangeListener __changeListener = new LineageRelationship.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Paths = SCHEMA.getField("paths");
    private final static UrnArrayArray DEFAULT_Paths;
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static UrnArray DEFAULT_Path;
    private final static RecordDataSchema.Field FIELD_Degree = SCHEMA.getField("degree");
    private final static Integer DEFAULT_Degree;
    private final static RecordDataSchema.Field FIELD_CreatedOn = SCHEMA.getField("createdOn");
    private final static RecordDataSchema.Field FIELD_CreatedActor = SCHEMA.getField("createdActor");
    private final static RecordDataSchema.Field FIELD_UpdatedOn = SCHEMA.getField("updatedOn");
    private final static RecordDataSchema.Field FIELD_UpdatedActor = SCHEMA.getField("updatedActor");
    private final static RecordDataSchema.Field FIELD_IsManual = SCHEMA.getField("isManual");
    private final static RecordDataSchema.Field FIELD_Degrees = SCHEMA.getField("degrees");
    private final static RecordDataSchema.Field FIELD_Explored = SCHEMA.getField("explored");
    private final static RecordDataSchema.Field FIELD_TruncatedChildren = SCHEMA.getField("truncatedChildren");
    private final static RecordDataSchema.Field FIELD_IgnoredAsHop = SCHEMA.getField("ignoredAsHop");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_Paths = ((FIELD_Paths.getDefault() == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(FIELD_Paths.getDefault(), DataList.class)));
        DEFAULT_Path = ((FIELD_Path.getDefault() == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(FIELD_Path.getDefault(), DataList.class)));
        DEFAULT_Degree = DataTemplateUtil.coerceIntOutput(FIELD_Degree.getDefault());
    }

    public LineageRelationship() {
        super(new DataMap(), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public LineageRelationship(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LineageRelationship.Fields fields() {
        return _fields;
    }

    public static LineageRelationship.ProjectionMask createMask() {
        return new LineageRelationship.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see LineageRelationship.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see LineageRelationship.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see LineageRelationship.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageRelationship.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see LineageRelationship.Fields#type
     */
    public LineageRelationship setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.metadata.graph.LineageRelationship");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#type
     */
    public LineageRelationship setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see LineageRelationship.Fields#entity
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
     * @see LineageRelationship.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see LineageRelationship.Fields#entity
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
     * @see LineageRelationship.Fields#entity
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
     * @see LineageRelationship.Fields#entity
     */
    public LineageRelationship setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.metadata.graph.LineageRelationship");
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
     * @see LineageRelationship.Fields#entity
     */
    public LineageRelationship setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for paths
     * 
     * @see LineageRelationship.Fields#paths
     */
    public boolean hasPaths() {
        if (_pathsField!= null) {
            return true;
        }
        return super._map.containsKey("paths");
    }

    /**
     * Remover for paths
     * 
     * @see LineageRelationship.Fields#paths
     */
    public void removePaths() {
        super._map.remove("paths");
    }

    /**
     * Getter for paths
     * 
     * @see LineageRelationship.Fields#paths
     */
    @Nullable
    public UrnArrayArray getPaths(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPaths();
            case NULL:
                if (_pathsField!= null) {
                    return _pathsField;
                } else {
                    Object __rawValue = super._map.get("paths");
                    _pathsField = ((__rawValue == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _pathsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for paths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageRelationship.Fields#paths
     */
    @Nonnull
    public UrnArrayArray getPaths() {
        if (_pathsField!= null) {
            return _pathsField;
        } else {
            Object __rawValue = super._map.get("paths");
            if (__rawValue == null) {
                return DEFAULT_Paths;
            }
            _pathsField = ((__rawValue == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathsField;
        }
    }

    /**
     * Setter for paths
     * 
     * @see LineageRelationship.Fields#paths
     */
    public LineageRelationship setPaths(
        @Nullable
        UrnArrayArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPaths(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field paths of com.linkedin.metadata.graph.LineageRelationship");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePaths();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for paths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#paths
     */
    public LineageRelationship setPaths(
        @Nonnull
        UrnArrayArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field paths of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
            _pathsField = value;
        }
        return this;
    }

    /**
     * Existence checker for path
     * 
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    public boolean hasPath() {
        if (_pathField!= null) {
            return true;
        }
        return super._map.containsKey("path");
    }

    /**
     * Remover for path
     * 
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    @Nullable
    public UrnArray getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPath();
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _pathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    @Nonnull
    public UrnArray getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                return DEFAULT_Path;
            }
            _pathField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    public LineageRelationship setPath(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.metadata.graph.LineageRelationship");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#path
     */
    @Deprecated
    public LineageRelationship setPath(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value.data());
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for degree
     * 
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    public boolean hasDegree() {
        if (_degreeField!= null) {
            return true;
        }
        return super._map.containsKey("degree");
    }

    /**
     * Remover for degree
     * 
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    public void removeDegree() {
        super._map.remove("degree");
    }

    /**
     * Getter for degree
     * 
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    @Nullable
    public Integer getDegree(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDegree();
            case NULL:
                if (_degreeField!= null) {
                    return _degreeField;
                } else {
                    Object __rawValue = super._map.get("degree");
                    _degreeField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _degreeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for degree
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    @Nonnull
    public Integer getDegree() {
        if (_degreeField!= null) {
            return _degreeField;
        } else {
            Object __rawValue = super._map.get("degree");
            if (__rawValue == null) {
                return DEFAULT_Degree;
            }
            _degreeField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _degreeField;
        }
    }

    /**
     * Setter for degree
     * 
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    public LineageRelationship setDegree(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDegree(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field degree of com.linkedin.metadata.graph.LineageRelationship");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDegree();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for degree
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    public LineageRelationship setDegree(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field degree of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
            _degreeField = value;
        }
        return this;
    }

    /**
     * Setter for degree
     * 
     * @see LineageRelationship.Fields#degree
     */
    @Deprecated
    public LineageRelationship setDegree(int value) {
        CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
        _degreeField = value;
        return this;
    }

    /**
     * Existence checker for createdOn
     * 
     * @see LineageRelationship.Fields#createdOn
     */
    public boolean hasCreatedOn() {
        if (_createdOnField!= null) {
            return true;
        }
        return super._map.containsKey("createdOn");
    }

    /**
     * Remover for createdOn
     * 
     * @see LineageRelationship.Fields#createdOn
     */
    public void removeCreatedOn() {
        super._map.remove("createdOn");
    }

    /**
     * Getter for createdOn
     * 
     * @see LineageRelationship.Fields#createdOn
     */
    @Nullable
    public Long getCreatedOn(GetMode mode) {
        return getCreatedOn();
    }

    /**
     * Getter for createdOn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#createdOn
     */
    @Nullable
    public Long getCreatedOn() {
        if (_createdOnField!= null) {
            return _createdOnField;
        } else {
            Object __rawValue = super._map.get("createdOn");
            _createdOnField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _createdOnField;
        }
    }

    /**
     * Setter for createdOn
     * 
     * @see LineageRelationship.Fields#createdOn
     */
    public LineageRelationship setCreatedOn(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedOn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedOn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdOn", DataTemplateUtil.coerceLongInput(value));
                    _createdOnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdOn", DataTemplateUtil.coerceLongInput(value));
                    _createdOnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdOn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#createdOn
     */
    public LineageRelationship setCreatedOn(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdOn of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdOn", DataTemplateUtil.coerceLongInput(value));
            _createdOnField = value;
        }
        return this;
    }

    /**
     * Setter for createdOn
     * 
     * @see LineageRelationship.Fields#createdOn
     */
    public LineageRelationship setCreatedOn(long value) {
        CheckedUtil.putWithoutChecking(super._map, "createdOn", DataTemplateUtil.coerceLongInput(value));
        _createdOnField = value;
        return this;
    }

    /**
     * Existence checker for createdActor
     * 
     * @see LineageRelationship.Fields#createdActor
     */
    public boolean hasCreatedActor() {
        if (_createdActorField!= null) {
            return true;
        }
        return super._map.containsKey("createdActor");
    }

    /**
     * Remover for createdActor
     * 
     * @see LineageRelationship.Fields#createdActor
     */
    public void removeCreatedActor() {
        super._map.remove("createdActor");
    }

    /**
     * Getter for createdActor
     * 
     * @see LineageRelationship.Fields#createdActor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getCreatedActor(GetMode mode) {
        return getCreatedActor();
    }

    /**
     * Getter for createdActor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#createdActor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getCreatedActor() {
        if (_createdActorField!= null) {
            return _createdActorField;
        } else {
            Object __rawValue = super._map.get("createdActor");
            _createdActorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _createdActorField;
        }
    }

    /**
     * Setter for createdActor
     * 
     * @see LineageRelationship.Fields#createdActor
     */
    public LineageRelationship setCreatedActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _createdActorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _createdActorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdActor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#createdActor
     */
    public LineageRelationship setCreatedActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdActor of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _createdActorField = value;
        }
        return this;
    }

    /**
     * Existence checker for updatedOn
     * 
     * @see LineageRelationship.Fields#updatedOn
     */
    public boolean hasUpdatedOn() {
        if (_updatedOnField!= null) {
            return true;
        }
        return super._map.containsKey("updatedOn");
    }

    /**
     * Remover for updatedOn
     * 
     * @see LineageRelationship.Fields#updatedOn
     */
    public void removeUpdatedOn() {
        super._map.remove("updatedOn");
    }

    /**
     * Getter for updatedOn
     * 
     * @see LineageRelationship.Fields#updatedOn
     */
    @Nullable
    public Long getUpdatedOn(GetMode mode) {
        return getUpdatedOn();
    }

    /**
     * Getter for updatedOn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#updatedOn
     */
    @Nullable
    public Long getUpdatedOn() {
        if (_updatedOnField!= null) {
            return _updatedOnField;
        } else {
            Object __rawValue = super._map.get("updatedOn");
            _updatedOnField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _updatedOnField;
        }
    }

    /**
     * Setter for updatedOn
     * 
     * @see LineageRelationship.Fields#updatedOn
     */
    public LineageRelationship setUpdatedOn(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpdatedOn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpdatedOn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "updatedOn", DataTemplateUtil.coerceLongInput(value));
                    _updatedOnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "updatedOn", DataTemplateUtil.coerceLongInput(value));
                    _updatedOnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for updatedOn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#updatedOn
     */
    public LineageRelationship setUpdatedOn(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field updatedOn of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "updatedOn", DataTemplateUtil.coerceLongInput(value));
            _updatedOnField = value;
        }
        return this;
    }

    /**
     * Setter for updatedOn
     * 
     * @see LineageRelationship.Fields#updatedOn
     */
    public LineageRelationship setUpdatedOn(long value) {
        CheckedUtil.putWithoutChecking(super._map, "updatedOn", DataTemplateUtil.coerceLongInput(value));
        _updatedOnField = value;
        return this;
    }

    /**
     * Existence checker for updatedActor
     * 
     * @see LineageRelationship.Fields#updatedActor
     */
    public boolean hasUpdatedActor() {
        if (_updatedActorField!= null) {
            return true;
        }
        return super._map.containsKey("updatedActor");
    }

    /**
     * Remover for updatedActor
     * 
     * @see LineageRelationship.Fields#updatedActor
     */
    public void removeUpdatedActor() {
        super._map.remove("updatedActor");
    }

    /**
     * Getter for updatedActor
     * 
     * @see LineageRelationship.Fields#updatedActor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUpdatedActor(GetMode mode) {
        return getUpdatedActor();
    }

    /**
     * Getter for updatedActor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#updatedActor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUpdatedActor() {
        if (_updatedActorField!= null) {
            return _updatedActorField;
        } else {
            Object __rawValue = super._map.get("updatedActor");
            _updatedActorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _updatedActorField;
        }
    }

    /**
     * Setter for updatedActor
     * 
     * @see LineageRelationship.Fields#updatedActor
     */
    public LineageRelationship setUpdatedActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpdatedActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpdatedActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "updatedActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _updatedActorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "updatedActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _updatedActorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for updatedActor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#updatedActor
     */
    public LineageRelationship setUpdatedActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field updatedActor of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "updatedActor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _updatedActorField = value;
        }
        return this;
    }

    /**
     * Existence checker for isManual
     * 
     * @see LineageRelationship.Fields#isManual
     */
    public boolean hasIsManual() {
        if (_isManualField!= null) {
            return true;
        }
        return super._map.containsKey("isManual");
    }

    /**
     * Remover for isManual
     * 
     * @see LineageRelationship.Fields#isManual
     */
    public void removeIsManual() {
        super._map.remove("isManual");
    }

    /**
     * Getter for isManual
     * 
     * @see LineageRelationship.Fields#isManual
     */
    @Nullable
    public Boolean isIsManual(GetMode mode) {
        return isIsManual();
    }

    /**
     * Getter for isManual
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#isManual
     */
    @Nullable
    public Boolean isIsManual() {
        if (_isManualField!= null) {
            return _isManualField;
        } else {
            Object __rawValue = super._map.get("isManual");
            _isManualField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isManualField;
        }
    }

    /**
     * Setter for isManual
     * 
     * @see LineageRelationship.Fields#isManual
     */
    public LineageRelationship setIsManual(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsManual(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsManual();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isManual", value);
                    _isManualField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isManual", value);
                    _isManualField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isManual
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#isManual
     */
    public LineageRelationship setIsManual(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isManual of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isManual", value);
            _isManualField = value;
        }
        return this;
    }

    /**
     * Setter for isManual
     * 
     * @see LineageRelationship.Fields#isManual
     */
    public LineageRelationship setIsManual(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isManual", value);
        _isManualField = value;
        return this;
    }

    /**
     * Existence checker for degrees
     * 
     * @see LineageRelationship.Fields#degrees
     */
    public boolean hasDegrees() {
        if (_degreesField!= null) {
            return true;
        }
        return super._map.containsKey("degrees");
    }

    /**
     * Remover for degrees
     * 
     * @see LineageRelationship.Fields#degrees
     */
    public void removeDegrees() {
        super._map.remove("degrees");
    }

    /**
     * Getter for degrees
     * 
     * @see LineageRelationship.Fields#degrees
     */
    @Nullable
    public IntegerArray getDegrees(GetMode mode) {
        return getDegrees();
    }

    /**
     * Getter for degrees
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#degrees
     */
    @Nullable
    public IntegerArray getDegrees() {
        if (_degreesField!= null) {
            return _degreesField;
        } else {
            Object __rawValue = super._map.get("degrees");
            _degreesField = ((__rawValue == null)?null:new IntegerArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _degreesField;
        }
    }

    /**
     * Setter for degrees
     * 
     * @see LineageRelationship.Fields#degrees
     */
    public LineageRelationship setDegrees(
        @Nullable
        IntegerArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDegrees(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDegrees();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
                    _degreesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
                    _degreesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for degrees
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#degrees
     */
    public LineageRelationship setDegrees(
        @Nonnull
        IntegerArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field degrees of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
            _degreesField = value;
        }
        return this;
    }

    /**
     * Existence checker for explored
     * 
     * @see LineageRelationship.Fields#explored
     */
    public boolean hasExplored() {
        if (_exploredField!= null) {
            return true;
        }
        return super._map.containsKey("explored");
    }

    /**
     * Remover for explored
     * 
     * @see LineageRelationship.Fields#explored
     */
    public void removeExplored() {
        super._map.remove("explored");
    }

    /**
     * Getter for explored
     * 
     * @see LineageRelationship.Fields#explored
     */
    @Nullable
    public Boolean isExplored(GetMode mode) {
        return isExplored();
    }

    /**
     * Getter for explored
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#explored
     */
    @Nullable
    public Boolean isExplored() {
        if (_exploredField!= null) {
            return _exploredField;
        } else {
            Object __rawValue = super._map.get("explored");
            _exploredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _exploredField;
        }
    }

    /**
     * Setter for explored
     * 
     * @see LineageRelationship.Fields#explored
     */
    public LineageRelationship setExplored(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExplored(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExplored();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "explored", value);
                    _exploredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "explored", value);
                    _exploredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for explored
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#explored
     */
    public LineageRelationship setExplored(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field explored of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "explored", value);
            _exploredField = value;
        }
        return this;
    }

    /**
     * Setter for explored
     * 
     * @see LineageRelationship.Fields#explored
     */
    public LineageRelationship setExplored(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "explored", value);
        _exploredField = value;
        return this;
    }

    /**
     * Existence checker for truncatedChildren
     * 
     * @see LineageRelationship.Fields#truncatedChildren
     */
    public boolean hasTruncatedChildren() {
        if (_truncatedChildrenField!= null) {
            return true;
        }
        return super._map.containsKey("truncatedChildren");
    }

    /**
     * Remover for truncatedChildren
     * 
     * @see LineageRelationship.Fields#truncatedChildren
     */
    public void removeTruncatedChildren() {
        super._map.remove("truncatedChildren");
    }

    /**
     * Getter for truncatedChildren
     * 
     * @see LineageRelationship.Fields#truncatedChildren
     */
    @Nullable
    public Boolean isTruncatedChildren(GetMode mode) {
        return isTruncatedChildren();
    }

    /**
     * Getter for truncatedChildren
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#truncatedChildren
     */
    @Nullable
    public Boolean isTruncatedChildren() {
        if (_truncatedChildrenField!= null) {
            return _truncatedChildrenField;
        } else {
            Object __rawValue = super._map.get("truncatedChildren");
            _truncatedChildrenField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _truncatedChildrenField;
        }
    }

    /**
     * Setter for truncatedChildren
     * 
     * @see LineageRelationship.Fields#truncatedChildren
     */
    public LineageRelationship setTruncatedChildren(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTruncatedChildren(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTruncatedChildren();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
                    _truncatedChildrenField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
                    _truncatedChildrenField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for truncatedChildren
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#truncatedChildren
     */
    public LineageRelationship setTruncatedChildren(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field truncatedChildren of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
            _truncatedChildrenField = value;
        }
        return this;
    }

    /**
     * Setter for truncatedChildren
     * 
     * @see LineageRelationship.Fields#truncatedChildren
     */
    public LineageRelationship setTruncatedChildren(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
        _truncatedChildrenField = value;
        return this;
    }

    /**
     * Existence checker for ignoredAsHop
     * 
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    public boolean hasIgnoredAsHop() {
        if (_ignoredAsHopField!= null) {
            return true;
        }
        return super._map.containsKey("ignoredAsHop");
    }

    /**
     * Remover for ignoredAsHop
     * 
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    public void removeIgnoredAsHop() {
        super._map.remove("ignoredAsHop");
    }

    /**
     * Getter for ignoredAsHop
     * 
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    @Nullable
    public Boolean isIgnoredAsHop(GetMode mode) {
        return isIgnoredAsHop();
    }

    /**
     * Getter for ignoredAsHop
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    @Nullable
    public Boolean isIgnoredAsHop() {
        if (_ignoredAsHopField!= null) {
            return _ignoredAsHopField;
        } else {
            Object __rawValue = super._map.get("ignoredAsHop");
            _ignoredAsHopField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _ignoredAsHopField;
        }
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    public LineageRelationship setIgnoredAsHop(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIgnoredAsHop(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIgnoredAsHop();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
                    _ignoredAsHopField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
                    _ignoredAsHopField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    public LineageRelationship setIgnoredAsHop(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ignoredAsHop of com.linkedin.metadata.graph.LineageRelationship to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
            _ignoredAsHopField = value;
        }
        return this;
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @see LineageRelationship.Fields#ignoredAsHop
     */
    public LineageRelationship setIgnoredAsHop(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
        _ignoredAsHopField = value;
        return this;
    }

    @Override
    public LineageRelationship clone()
        throws CloneNotSupportedException
    {
        LineageRelationship __clone = ((LineageRelationship) super.clone());
        __clone.__changeListener = new LineageRelationship.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LineageRelationship copy()
        throws CloneNotSupportedException
    {
        LineageRelationship __copy = ((LineageRelationship) super.copy());
        __copy._ignoredAsHopField = null;
        __copy._isManualField = null;
        __copy._degreeField = null;
        __copy._truncatedChildrenField = null;
        __copy._updatedOnField = null;
        __copy._typeField = null;
        __copy._createdOnField = null;
        __copy._degreesField = null;
        __copy._pathField = null;
        __copy._pathsField = null;
        __copy._exploredField = null;
        __copy._updatedActorField = null;
        __copy._createdActorField = null;
        __copy._entityField = null;
        __copy.__changeListener = new LineageRelationship.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LineageRelationship __objectRef;

        private ChangeListener(LineageRelationship reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "ignoredAsHop":
                    __objectRef._ignoredAsHopField = null;
                    break;
                case "isManual":
                    __objectRef._isManualField = null;
                    break;
                case "degree":
                    __objectRef._degreeField = null;
                    break;
                case "truncatedChildren":
                    __objectRef._truncatedChildrenField = null;
                    break;
                case "updatedOn":
                    __objectRef._updatedOnField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "createdOn":
                    __objectRef._createdOnField = null;
                    break;
                case "degrees":
                    __objectRef._degreesField = null;
                    break;
                case "path":
                    __objectRef._pathField = null;
                    break;
                case "paths":
                    __objectRef._pathsField = null;
                    break;
                case "explored":
                    __objectRef._exploredField = null;
                    break;
                case "updatedActor":
                    __objectRef._updatedActorField = null;
                    break;
                case "createdActor":
                    __objectRef._createdActorField = null;
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
         * The type of the relationship
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Entity that is related via lineage
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public PathSpec paths() {
            return new PathSpec(getPathComponents(), "paths");
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public PathSpec paths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "paths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public PathSpec path(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "path");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         * Deprecated by degrees. degree field is populated by min(degrees) for backward compatibility.
         * 
         */
        @Deprecated
        public PathSpec degree() {
            return new PathSpec(getPathComponents(), "degree");
        }

        /**
         * Timestamp for when this lineage relationship was created. Could be null.
         * 
         */
        public PathSpec createdOn() {
            return new PathSpec(getPathComponents(), "createdOn");
        }

        /**
         * Urn of the actor that created this lineage relationship. Could be null.
         * 
         */
        public PathSpec createdActor() {
            return new PathSpec(getPathComponents(), "createdActor");
        }

        /**
         * Timestamp for when this lineage relationship was last updated. Could be null.
         * 
         */
        public PathSpec updatedOn() {
            return new PathSpec(getPathComponents(), "updatedOn");
        }

        /**
         * Urn of the actor that last updated this lineage relationship. Could be null.
         * 
         */
        public PathSpec updatedActor() {
            return new PathSpec(getPathComponents(), "updatedActor");
        }

        /**
         * Whether this lineage edge is a manual edge.
         * 
         */
        public PathSpec isManual() {
            return new PathSpec(getPathComponents(), "isManual");
        }

        /**
         * The different depths at which this entity is discovered in the lineage graph.
         * Marked as optional to maintain backward compatibility, but is filled out by implementations. 
         * Replaces the deprecated field "degree".
         * 
         * 
         */
        public PathSpec degrees() {
            return new PathSpec(getPathComponents(), "degrees");
        }

        /**
         * The different depths at which this entity is discovered in the lineage graph.
         * Marked as optional to maintain backward compatibility, but is filled out by implementations. 
         * Replaces the deprecated field "degree".
         * 
         * 
         */
        public PathSpec degrees(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "degrees");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Marks this relationship as explored during the graph walk
         * 
         */
        public PathSpec explored() {
            return new PathSpec(getPathComponents(), "explored");
        }

        /**
         * Indicates this destination node has additional unexplored child relationships
         * 
         */
        public PathSpec truncatedChildren() {
            return new PathSpec(getPathComponents(), "truncatedChildren");
        }

        /**
         * Whether this relationship was ignored as a hop while performing the graph walk
         * 
         */
        public PathSpec ignoredAsHop() {
            return new PathSpec(getPathComponents(), "ignoredAsHop");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
        }

        /**
         * The type of the relationship
         * 
         */
        public LineageRelationship.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Entity that is related via lineage
         * 
         */
        public LineageRelationship.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public LineageRelationship.ProjectionMask withPaths() {
            getDataMap().put("paths", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public LineageRelationship.ProjectionMask withPaths(Integer start, Integer count) {
            getDataMap().put("paths", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("paths").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("paths").put("$count", count);
            }
            return this;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public LineageRelationship.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public LineageRelationship.ProjectionMask withPath(Integer start, Integer count) {
            getDataMap().put("path", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("path").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("path").put("$count", count);
            }
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         * Deprecated by degrees. degree field is populated by min(degrees) for backward compatibility.
         * 
         */
        @Deprecated
        public LineageRelationship.ProjectionMask withDegree() {
            getDataMap().put("degree", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timestamp for when this lineage relationship was created. Could be null.
         * 
         */
        public LineageRelationship.ProjectionMask withCreatedOn() {
            getDataMap().put("createdOn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the actor that created this lineage relationship. Could be null.
         * 
         */
        public LineageRelationship.ProjectionMask withCreatedActor() {
            getDataMap().put("createdActor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timestamp for when this lineage relationship was last updated. Could be null.
         * 
         */
        public LineageRelationship.ProjectionMask withUpdatedOn() {
            getDataMap().put("updatedOn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the actor that last updated this lineage relationship. Could be null.
         * 
         */
        public LineageRelationship.ProjectionMask withUpdatedActor() {
            getDataMap().put("updatedActor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether this lineage edge is a manual edge.
         * 
         */
        public LineageRelationship.ProjectionMask withIsManual() {
            getDataMap().put("isManual", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The different depths at which this entity is discovered in the lineage graph.
         * Marked as optional to maintain backward compatibility, but is filled out by implementations. 
         * Replaces the deprecated field "degree".
         * 
         * 
         */
        public LineageRelationship.ProjectionMask withDegrees() {
            getDataMap().put("degrees", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The different depths at which this entity is discovered in the lineage graph.
         * Marked as optional to maintain backward compatibility, but is filled out by implementations. 
         * Replaces the deprecated field "degree".
         * 
         * 
         */
        public LineageRelationship.ProjectionMask withDegrees(Integer start, Integer count) {
            getDataMap().put("degrees", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("degrees").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("degrees").put("$count", count);
            }
            return this;
        }

        /**
         * Marks this relationship as explored during the graph walk
         * 
         */
        public LineageRelationship.ProjectionMask withExplored() {
            getDataMap().put("explored", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Indicates this destination node has additional unexplored child relationships
         * 
         */
        public LineageRelationship.ProjectionMask withTruncatedChildren() {
            getDataMap().put("truncatedChildren", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether this relationship was ignored as a hop while performing the graph walk
         * 
         */
        public LineageRelationship.ProjectionMask withIgnoredAsHop() {
            getDataMap().put("ignoredAsHop", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
