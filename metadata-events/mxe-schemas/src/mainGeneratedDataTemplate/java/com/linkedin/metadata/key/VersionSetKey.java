
package com.linkedin.metadata.key;

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
 * Key for a Version Set entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/VersionSetKey.pdl.")
public class VersionSetKey
    extends RecordTemplate
{

    private final static VersionSetKey.Fields _fields = new VersionSetKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Version Set entity*/@Aspect.name=\"versionSetKey\"record VersionSetKey{/**ID of the Version Set, generated from platform + asset id / name*/id:string/**Type of entities included in version set, limits to a single entity type between linked versioned entities*/entityType:string}", SchemaFormatType.PDL));
    private String _idField = null;
    private String _entityTypeField = null;
    private VersionSetKey.ChangeListener __changeListener = new VersionSetKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_EntityType = SCHEMA.getField("entityType");

    public VersionSetKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public VersionSetKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionSetKey.Fields fields() {
        return _fields;
    }

    public static VersionSetKey.ProjectionMask createMask() {
        return new VersionSetKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see VersionSetKey.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see VersionSetKey.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see VersionSetKey.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionSetKey.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see VersionSetKey.Fields#id
     */
    public VersionSetKey setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.metadata.key.VersionSetKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionSetKey.Fields#id
     */
    public VersionSetKey setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.metadata.key.VersionSetKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityType
     * 
     * @see VersionSetKey.Fields#entityType
     */
    public boolean hasEntityType() {
        if (_entityTypeField!= null) {
            return true;
        }
        return super._map.containsKey("entityType");
    }

    /**
     * Remover for entityType
     * 
     * @see VersionSetKey.Fields#entityType
     */
    public void removeEntityType() {
        super._map.remove("entityType");
    }

    /**
     * Getter for entityType
     * 
     * @see VersionSetKey.Fields#entityType
     */
    @Nullable
    public String getEntityType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityType();
            case DEFAULT:
            case NULL:
                if (_entityTypeField!= null) {
                    return _entityTypeField;
                } else {
                    Object __rawValue = super._map.get("entityType");
                    _entityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionSetKey.Fields#entityType
     */
    @Nonnull
    public String getEntityType() {
        if (_entityTypeField!= null) {
            return _entityTypeField;
        } else {
            Object __rawValue = super._map.get("entityType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityType");
            }
            _entityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityTypeField;
        }
    }

    /**
     * Setter for entityType
     * 
     * @see VersionSetKey.Fields#entityType
     */
    public VersionSetKey setEntityType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityType of com.linkedin.metadata.key.VersionSetKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionSetKey.Fields#entityType
     */
    public VersionSetKey setEntityType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityType of com.linkedin.metadata.key.VersionSetKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityType", value);
            _entityTypeField = value;
        }
        return this;
    }

    @Override
    public VersionSetKey clone()
        throws CloneNotSupportedException
    {
        VersionSetKey __clone = ((VersionSetKey) super.clone());
        __clone.__changeListener = new VersionSetKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionSetKey copy()
        throws CloneNotSupportedException
    {
        VersionSetKey __copy = ((VersionSetKey) super.copy());
        __copy._entityTypeField = null;
        __copy._idField = null;
        __copy.__changeListener = new VersionSetKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionSetKey __objectRef;

        private ChangeListener(VersionSetKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "entityType":
                    __objectRef._entityTypeField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
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
         * ID of the Version Set, generated from platform + asset id / name
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * Type of entities included in version set, limits to a single entity type between linked versioned entities
         * 
         */
        public PathSpec entityType() {
            return new PathSpec(getPathComponents(), "entityType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * ID of the Version Set, generated from platform + asset id / name
         * 
         */
        public VersionSetKey.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of entities included in version set, limits to a single entity type between linked versioned entities
         * 
         */
        public VersionSetKey.ProjectionMask withEntityType() {
            getDataMap().put("entityType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
