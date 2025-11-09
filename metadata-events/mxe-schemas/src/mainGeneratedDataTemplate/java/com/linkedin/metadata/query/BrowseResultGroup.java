
package com.linkedin.metadata.query;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/BrowseResultMetadata.pdl.")
public class BrowseResultGroup
    extends RecordTemplate
{

    private final static BrowseResultGroup.Fields _fields = new BrowseResultGroup.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query,record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}", SchemaFormatType.PDL));
    private String _nameField = null;
    private Long _countField = null;
    private BrowseResultGroup.ChangeListener __changeListener = new BrowseResultGroup.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public BrowseResultGroup() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BrowseResultGroup(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowseResultGroup.Fields fields() {
        return _fields;
    }

    public static BrowseResultGroup.ProjectionMask createMask() {
        return new BrowseResultGroup.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see BrowseResultGroup.Fields#name
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
     * @see BrowseResultGroup.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see BrowseResultGroup.Fields#name
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
     * @see BrowseResultGroup.Fields#name
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
     * @see BrowseResultGroup.Fields#name
     */
    public BrowseResultGroup setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.query.BrowseResultGroup");
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
     * @see BrowseResultGroup.Fields#name
     */
    public BrowseResultGroup setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.query.BrowseResultGroup to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see BrowseResultGroup.Fields#count
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
     * @see BrowseResultGroup.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see BrowseResultGroup.Fields#count
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
     * @see BrowseResultGroup.Fields#count
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
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.metadata.query.BrowseResultGroup");
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
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.metadata.query.BrowseResultGroup to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see BrowseResultGroup.Fields#count
     */
    public BrowseResultGroup setCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceLongInput(value));
        _countField = value;
        return this;
    }

    @Override
    public BrowseResultGroup clone()
        throws CloneNotSupportedException
    {
        BrowseResultGroup __clone = ((BrowseResultGroup) super.clone());
        __clone.__changeListener = new BrowseResultGroup.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowseResultGroup copy()
        throws CloneNotSupportedException
    {
        BrowseResultGroup __copy = ((BrowseResultGroup) super.copy());
        __copy._nameField = null;
        __copy._countField = null;
        __copy.__changeListener = new BrowseResultGroup.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowseResultGroup __objectRef;

        private ChangeListener(BrowseResultGroup reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * Number of entities that can be reached from this path
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Name of the group
         * 
         */
        public BrowseResultGroup.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of entities that can be reached from this path
         * 
         */
        public BrowseResultGroup.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
