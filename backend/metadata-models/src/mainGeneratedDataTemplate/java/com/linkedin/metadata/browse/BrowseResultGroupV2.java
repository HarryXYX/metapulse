
package com.linkedin.metadata.browse;

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
 * The model for the result of a browse query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultGroupV2.pdl.")
public class BrowseResultGroupV2
    extends RecordTemplate
{

    private final static BrowseResultGroupV2 .Fields _fields = new BrowseResultGroupV2 .Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for the result of a browse query*/record BrowseResultGroupV2{/**Name of the group*/name:string/**Urn of the group if this is an entity*/urn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of entities that can be reached from this path*/count:long/**Whether or not this group has any sub-groups underneath it*/hasSubGroups:boolean}", SchemaFormatType.PDL));
    private String _nameField = null;
    private com.linkedin.common.urn.Urn _urnField = null;
    private Long _countField = null;
    private Boolean _hasSubGroupsField = null;
    private BrowseResultGroupV2 .ChangeListener __changeListener = new BrowseResultGroupV2 .ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_HasSubGroups = SCHEMA.getField("hasSubGroups");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public BrowseResultGroupV2() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BrowseResultGroupV2(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowseResultGroupV2 .Fields fields() {
        return _fields;
    }

    public static BrowseResultGroupV2 .ProjectionMask createMask() {
        return new BrowseResultGroupV2 .ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see BrowseResultGroupV2.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see BrowseResultGroupV2.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see BrowseResultGroupV2.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultGroupV2.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see BrowseResultGroupV2.Fields#name
     */
    public BrowseResultGroupV2 setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.browse.BrowseResultGroupV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultGroupV2.Fields#name
     */
    public BrowseResultGroupV2 setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.browse.BrowseResultGroupV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see BrowseResultGroupV2.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see BrowseResultGroupV2.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see BrowseResultGroupV2.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return getUrn();
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BrowseResultGroupV2.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see BrowseResultGroupV2.Fields#urn
     */
    public BrowseResultGroupV2 setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultGroupV2.Fields#urn
     */
    public BrowseResultGroupV2 setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.browse.BrowseResultGroupV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see BrowseResultGroupV2.Fields#count
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
     * @see BrowseResultGroupV2.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see BrowseResultGroupV2.Fields#count
     */
    @Nullable
    public Long getCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCount();
            case DEFAULT:
            case NULL:
                if (_countField!= null) {
                    return _countField;
                } else {
                    Object __rawValue = super._map.get("count");
                    _countField = DataTemplateUtil.coerceLongOutput(__rawValue);
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
     * @see BrowseResultGroupV2.Fields#count
     */
    @Nonnull
    public Long getCount() {
        if (_countField!= null) {
            return _countField;
        } else {
            Object __rawValue = super._map.get("count");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("count");
            }
            _countField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _countField;
        }
    }

    /**
     * Setter for count
     * 
     * @see BrowseResultGroupV2.Fields#count
     */
    public BrowseResultGroupV2 setCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.metadata.browse.BrowseResultGroupV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
                    _countField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
                    _countField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
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
     * @see BrowseResultGroupV2.Fields#count
     */
    public BrowseResultGroupV2 setCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.metadata.browse.BrowseResultGroupV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see BrowseResultGroupV2.Fields#count
     */
    public BrowseResultGroupV2 setCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for hasSubGroups
     * 
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    public boolean hasHasSubGroups() {
        if (_hasSubGroupsField!= null) {
            return true;
        }
        return super._map.containsKey("hasSubGroups");
    }

    /**
     * Remover for hasSubGroups
     * 
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    public void removeHasSubGroups() {
        super._map.remove("hasSubGroups");
    }

    /**
     * Getter for hasSubGroups
     * 
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    @Nullable
    public Boolean isHasSubGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isHasSubGroups();
            case DEFAULT:
            case NULL:
                if (_hasSubGroupsField!= null) {
                    return _hasSubGroupsField;
                } else {
                    Object __rawValue = super._map.get("hasSubGroups");
                    _hasSubGroupsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _hasSubGroupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for hasSubGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    @Nonnull
    public Boolean isHasSubGroups() {
        if (_hasSubGroupsField!= null) {
            return _hasSubGroupsField;
        } else {
            Object __rawValue = super._map.get("hasSubGroups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("hasSubGroups");
            }
            _hasSubGroupsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _hasSubGroupsField;
        }
    }

    /**
     * Setter for hasSubGroups
     * 
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    public BrowseResultGroupV2 setHasSubGroups(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHasSubGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field hasSubGroups of com.linkedin.metadata.browse.BrowseResultGroupV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hasSubGroups", value);
                    _hasSubGroupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHasSubGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hasSubGroups", value);
                    _hasSubGroupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hasSubGroups", value);
                    _hasSubGroupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hasSubGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    public BrowseResultGroupV2 setHasSubGroups(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hasSubGroups of com.linkedin.metadata.browse.BrowseResultGroupV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hasSubGroups", value);
            _hasSubGroupsField = value;
        }
        return this;
    }

    /**
     * Setter for hasSubGroups
     * 
     * @see BrowseResultGroupV2.Fields#hasSubGroups
     */
    public BrowseResultGroupV2 setHasSubGroups(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "hasSubGroups", value);
        _hasSubGroupsField = value;
        return this;
    }

    @Override
    public BrowseResultGroupV2 clone()
        throws CloneNotSupportedException
    {
        BrowseResultGroupV2 __clone = ((BrowseResultGroupV2) super.clone());
        __clone.__changeListener = new BrowseResultGroupV2 .ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowseResultGroupV2 copy()
        throws CloneNotSupportedException
    {
        BrowseResultGroupV2 __copy = ((BrowseResultGroupV2) super.copy());
        __copy._urnField = null;
        __copy._hasSubGroupsField = null;
        __copy._nameField = null;
        __copy._countField = null;
        __copy.__changeListener = new BrowseResultGroupV2 .ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowseResultGroupV2 __objectRef;

        private ChangeListener(BrowseResultGroupV2 reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "hasSubGroups":
                    __objectRef._hasSubGroupsField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
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
         * Name of the group
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Urn of the group if this is an entity
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Number of entities that can be reached from this path
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * Whether or not this group has any sub-groups underneath it
         * 
         */
        public PathSpec hasSubGroups() {
            return new PathSpec(getPathComponents(), "hasSubGroups");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Name of the group
         * 
         */
        public BrowseResultGroupV2 .ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the group if this is an entity
         * 
         */
        public BrowseResultGroupV2 .ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of entities that can be reached from this path
         * 
         */
        public BrowseResultGroupV2 .ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this group has any sub-groups underneath it
         * 
         */
        public BrowseResultGroupV2 .ProjectionMask withHasSubGroups() {
            getDataMap().put("hasSubGroups", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
