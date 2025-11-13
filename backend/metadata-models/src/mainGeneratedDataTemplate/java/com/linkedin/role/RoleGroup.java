
package com.linkedin.role;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Provisioned groups of a role
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/role/RoleGroup.pdl.")
public class RoleGroup
    extends RecordTemplate
{

    private final static RoleGroup.Fields _fields = new RoleGroup.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.role/**Provisioned groups of a role*/record RoleGroup{/**Link provisioned corp group for a role*/@Relationship={\"entityTypes\":[\"corpGroup\"],\"name\":\"Has\"}group:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _groupField = null;
    private RoleGroup.ChangeListener __changeListener = new RoleGroup.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Group = SCHEMA.getField("group");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RoleGroup() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public RoleGroup(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RoleGroup.Fields fields() {
        return _fields;
    }

    public static RoleGroup.ProjectionMask createMask() {
        return new RoleGroup.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for group
     * 
     * @see RoleGroup.Fields#group
     */
    public boolean hasGroup() {
        if (_groupField!= null) {
            return true;
        }
        return super._map.containsKey("group");
    }

    /**
     * Remover for group
     * 
     * @see RoleGroup.Fields#group
     */
    public void removeGroup() {
        super._map.remove("group");
    }

    /**
     * Getter for group
     * 
     * @see RoleGroup.Fields#group
     */
    @Nullable
    public com.linkedin.common.urn.Urn getGroup(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getGroup();
            case DEFAULT:
            case NULL:
                if (_groupField!= null) {
                    return _groupField;
                } else {
                    Object __rawValue = super._map.get("group");
                    _groupField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _groupField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for group
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RoleGroup.Fields#group
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getGroup() {
        if (_groupField!= null) {
            return _groupField;
        } else {
            Object __rawValue = super._map.get("group");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("group");
            }
            _groupField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _groupField;
        }
    }

    /**
     * Setter for group
     * 
     * @see RoleGroup.Fields#group
     */
    public RoleGroup setGroup(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroup(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field group of com.linkedin.role.RoleGroup");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "group", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _groupField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroup();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "group", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _groupField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "group", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _groupField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for group
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RoleGroup.Fields#group
     */
    public RoleGroup setGroup(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field group of com.linkedin.role.RoleGroup to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "group", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _groupField = value;
        }
        return this;
    }

    @Override
    public RoleGroup clone()
        throws CloneNotSupportedException
    {
        RoleGroup __clone = ((RoleGroup) super.clone());
        __clone.__changeListener = new RoleGroup.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RoleGroup copy()
        throws CloneNotSupportedException
    {
        RoleGroup __copy = ((RoleGroup) super.copy());
        __copy._groupField = null;
        __copy.__changeListener = new RoleGroup.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RoleGroup __objectRef;

        private ChangeListener(RoleGroup reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "group":
                    __objectRef._groupField = null;
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
         * Link provisioned corp group for a role
         * 
         */
        public PathSpec group() {
            return new PathSpec(getPathComponents(), "group");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Link provisioned corp group for a role
         * 
         */
        public RoleGroup.ProjectionMask withGroup() {
            getDataMap().put("group", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
