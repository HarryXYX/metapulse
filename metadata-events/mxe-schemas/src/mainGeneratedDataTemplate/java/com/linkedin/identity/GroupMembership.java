
package com.linkedin.identity;

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
 * Carries information about the CorpGroups a user is in.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/GroupMembership.pdl.")
public class GroupMembership
    extends RecordTemplate
{

    private final static GroupMembership.Fields _fields = new GroupMembership.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _groupsField = null;
    private GroupMembership.ChangeListener __changeListener = new GroupMembership.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    public GroupMembership() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GroupMembership(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GroupMembership.Fields fields() {
        return _fields;
    }

    public static GroupMembership.ProjectionMask createMask() {
        return new GroupMembership.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for groups
     * 
     * @see GroupMembership.Fields#groups
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
     * @see GroupMembership.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    @Nullable
    public UrnArray getGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getGroups();
            case DEFAULT:
            case NULL:
                if (_groupsField!= null) {
                    return _groupsField;
                } else {
                    Object __rawValue = super._map.get("groups");
                    _groupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see GroupMembership.Fields#groups
     */
    @Nonnull
    public UrnArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("groups");
            }
            _groupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see GroupMembership.Fields#groups
     */
    public GroupMembership setGroups(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groups of com.linkedin.identity.GroupMembership");
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
     * @see GroupMembership.Fields#groups
     */
    public GroupMembership setGroups(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.identity.GroupMembership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    @Override
    public GroupMembership clone()
        throws CloneNotSupportedException
    {
        GroupMembership __clone = ((GroupMembership) super.clone());
        __clone.__changeListener = new GroupMembership.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GroupMembership copy()
        throws CloneNotSupportedException
    {
        GroupMembership __copy = ((GroupMembership) super.copy());
        __copy._groupsField = null;
        __copy.__changeListener = new GroupMembership.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GroupMembership __objectRef;

        private ChangeListener(GroupMembership reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "groups":
                    __objectRef._groupsField = null;
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

        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

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

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public GroupMembership.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        public GroupMembership.ProjectionMask withGroups(Integer start, Integer count) {
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

    }

}
