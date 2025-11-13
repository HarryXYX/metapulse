
package com.linkedin.logical;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.Edge;
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
 * Relates a physical asset to a logical model.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/logical/LogicalParent.pdl.")
public class LogicalParent
    extends RecordTemplate
{

    private final static LogicalParent.Fields _fields = new LogicalParent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.logical/**Relates a physical asset to a logical model.*/@Aspect.name=\"logicalParent\"record LogicalParent{@Relationship.`/destinationUrn`={\"createdActor\":\"parent/created/actor\",\"createdOn\":\"parent/created/time\",\"entityTypes\":[\"dataset\",\"schemaField\"],\"name\":\"PhysicalInstanceOf\",\"properties\":\"parent/properties\",\"updatedActor\":\"parent/lastModified/actor\",\"updatedOn\":\"parent/lastModified/time\"}@Searchable.`/destinationUrn`={\"addToFilters\":true,\"fieldName\":\"logicalParent\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Physical Instance Of\",\"hasValuesFieldName\":\"hasLogicalParent\",\"queryByDefault\":false}parent:optional{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}}", SchemaFormatType.PDL));
    private Edge _parentField = null;
    private LogicalParent.ChangeListener __changeListener = new LogicalParent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Parent = SCHEMA.getField("parent");

    public LogicalParent() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public LogicalParent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LogicalParent.Fields fields() {
        return _fields;
    }

    public static LogicalParent.ProjectionMask createMask() {
        return new LogicalParent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for parent
     * 
     * @see LogicalParent.Fields#parent
     */
    public boolean hasParent() {
        if (_parentField!= null) {
            return true;
        }
        return super._map.containsKey("parent");
    }

    /**
     * Remover for parent
     * 
     * @see LogicalParent.Fields#parent
     */
    public void removeParent() {
        super._map.remove("parent");
    }

    /**
     * Getter for parent
     * 
     * @see LogicalParent.Fields#parent
     */
    @Nullable
    public Edge getParent(GetMode mode) {
        return getParent();
    }

    /**
     * Getter for parent
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LogicalParent.Fields#parent
     */
    @Nullable
    public Edge getParent() {
        if (_parentField!= null) {
            return _parentField;
        } else {
            Object __rawValue = super._map.get("parent");
            _parentField = ((__rawValue == null)?null:new Edge(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _parentField;
        }
    }

    /**
     * Setter for parent
     * 
     * @see LogicalParent.Fields#parent
     */
    public LogicalParent setParent(
        @Nullable
        Edge value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParent(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParent();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parent", value.data());
                    _parentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parent", value.data());
                    _parentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parent
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LogicalParent.Fields#parent
     */
    public LogicalParent setParent(
        @Nonnull
        Edge value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parent of com.linkedin.logical.LogicalParent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parent", value.data());
            _parentField = value;
        }
        return this;
    }

    @Override
    public LogicalParent clone()
        throws CloneNotSupportedException
    {
        LogicalParent __clone = ((LogicalParent) super.clone());
        __clone.__changeListener = new LogicalParent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LogicalParent copy()
        throws CloneNotSupportedException
    {
        LogicalParent __copy = ((LogicalParent) super.copy());
        __copy._parentField = null;
        __copy.__changeListener = new LogicalParent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LogicalParent __objectRef;

        private ChangeListener(LogicalParent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "parent":
                    __objectRef._parentField = null;
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

        public com.linkedin.common.Edge.Fields parent() {
            return new com.linkedin.common.Edge.Fields(getPathComponents(), "parent");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.Edge.ProjectionMask _parentMask;

        ProjectionMask() {
            super(2);
        }

        public LogicalParent.ProjectionMask withParent(Function<com.linkedin.common.Edge.ProjectionMask, com.linkedin.common.Edge.ProjectionMask> nestedMask) {
            _parentMask = nestedMask.apply(((_parentMask == null)?Edge.createMask():_parentMask));
            getDataMap().put("parent", _parentMask.getDataMap());
            return this;
        }

        public LogicalParent.ProjectionMask withParent() {
            _parentMask = null;
            getDataMap().put("parent", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
