
package com.linkedin.access.token;

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
 * Information about a DataHub Access Token
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/access/token/DataHubAccessTokenInfo.pdl.")
public class DataHubAccessTokenInfo
    extends RecordTemplate
{

    private final static DataHubAccessTokenInfo.Fields _fields = new DataHubAccessTokenInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.access.token/**Information about a DataHub Access Token*/@Aspect.name=\"dataHubAccessTokenInfo\"record DataHubAccessTokenInfo{/**User defined name for the access token if defined.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**Urn of the actor to which this access token belongs to.*/@Searchable.fieldType=\"URN\"actorUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn of the actor which created this access token.*/@Searchable.fieldType=\"URN\"ownerUrn:com.linkedin.common.Urn/**When the token was created.*/@Searchable={\"fieldType\":\"COUNT\",\"queryByDefault\":false}createdAt:{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**When the token expires.*/@Searchable={\"fieldType\":\"COUNT\",\"queryByDefault\":false}expiresAt:optional com.linkedin.common.Time/**Description of the token if defined.*/description:optional string}", SchemaFormatType.PDL));
    private String _nameField = null;
    private com.linkedin.common.urn.Urn _actorUrnField = null;
    private com.linkedin.common.urn.Urn _ownerUrnField = null;
    private Long _createdAtField = null;
    private Long _expiresAtField = null;
    private String _descriptionField = null;
    private DataHubAccessTokenInfo.ChangeListener __changeListener = new DataHubAccessTokenInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_ActorUrn = SCHEMA.getField("actorUrn");
    private final static RecordDataSchema.Field FIELD_OwnerUrn = SCHEMA.getField("ownerUrn");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");
    private final static RecordDataSchema.Field FIELD_ExpiresAt = SCHEMA.getField("expiresAt");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataHubAccessTokenInfo() {
        super(new DataMap(8, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubAccessTokenInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubAccessTokenInfo.Fields fields() {
        return _fields;
    }

    public static DataHubAccessTokenInfo.ProjectionMask createMask() {
        return new DataHubAccessTokenInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubAccessTokenInfo.Fields#name
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
     * @see DataHubAccessTokenInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubAccessTokenInfo.Fields#name
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
     * @see DataHubAccessTokenInfo.Fields#name
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
     * @see DataHubAccessTokenInfo.Fields#name
     */
    public DataHubAccessTokenInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.access.token.DataHubAccessTokenInfo");
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
     * @see DataHubAccessTokenInfo.Fields#name
     */
    public DataHubAccessTokenInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for actorUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    public boolean hasActorUrn() {
        if (_actorUrnField!= null) {
            return true;
        }
        return super._map.containsKey("actorUrn");
    }

    /**
     * Remover for actorUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    public void removeActorUrn() {
        super._map.remove("actorUrn");
    }

    /**
     * Getter for actorUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActorUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getActorUrn();
            case DEFAULT:
            case NULL:
                if (_actorUrnField!= null) {
                    return _actorUrnField;
                } else {
                    Object __rawValue = super._map.get("actorUrn");
                    _actorUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _actorUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actorUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getActorUrn() {
        if (_actorUrnField!= null) {
            return _actorUrnField;
        } else {
            Object __rawValue = super._map.get("actorUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("actorUrn");
            }
            _actorUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorUrnField;
        }
    }

    /**
     * Setter for actorUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    public DataHubAccessTokenInfo setActorUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActorUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actorUrn of com.linkedin.access.token.DataHubAccessTokenInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActorUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actorUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubAccessTokenInfo.Fields#actorUrn
     */
    public DataHubAccessTokenInfo setActorUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actorUrn of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for ownerUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    public boolean hasOwnerUrn() {
        if (_ownerUrnField!= null) {
            return true;
        }
        return super._map.containsKey("ownerUrn");
    }

    /**
     * Remover for ownerUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    public void removeOwnerUrn() {
        super._map.remove("ownerUrn");
    }

    /**
     * Getter for ownerUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getOwnerUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOwnerUrn();
            case DEFAULT:
            case NULL:
                if (_ownerUrnField!= null) {
                    return _ownerUrnField;
                } else {
                    Object __rawValue = super._map.get("ownerUrn");
                    _ownerUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _ownerUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for ownerUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getOwnerUrn() {
        if (_ownerUrnField!= null) {
            return _ownerUrnField;
        } else {
            Object __rawValue = super._map.get("ownerUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("ownerUrn");
            }
            _ownerUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _ownerUrnField;
        }
    }

    /**
     * Setter for ownerUrn
     * 
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    public DataHubAccessTokenInfo setOwnerUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwnerUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field ownerUrn of com.linkedin.access.token.DataHubAccessTokenInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ownerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOwnerUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ownerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ownerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ownerUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubAccessTokenInfo.Fields#ownerUrn
     */
    public DataHubAccessTokenInfo setOwnerUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ownerUrn of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ownerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _ownerUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        if (_createdAtField!= null) {
            return true;
        }
        return super._map.containsKey("createdAt");
    }

    /**
     * Remover for createdAt
     * 
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    public void removeCreatedAt() {
        super._map.remove("createdAt");
    }

    /**
     * Getter for createdAt
     * 
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreatedAt();
            case DEFAULT:
            case NULL:
                if (_createdAtField!= null) {
                    return _createdAtField;
                } else {
                    Object __rawValue = super._map.get("createdAt");
                    _createdAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _createdAtField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    @Nonnull
    public Long getCreatedAt() {
        if (_createdAtField!= null) {
            return _createdAtField;
        } else {
            Object __rawValue = super._map.get("createdAt");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("createdAt");
            }
            _createdAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _createdAtField;
        }
    }

    /**
     * Setter for createdAt
     * 
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    public DataHubAccessTokenInfo setCreatedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field createdAt of com.linkedin.access.token.DataHubAccessTokenInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    public DataHubAccessTokenInfo setCreatedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdAt of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
            _createdAtField = value;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see DataHubAccessTokenInfo.Fields#createdAt
     */
    public DataHubAccessTokenInfo setCreatedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
        _createdAtField = value;
        return this;
    }

    /**
     * Existence checker for expiresAt
     * 
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    public boolean hasExpiresAt() {
        if (_expiresAtField!= null) {
            return true;
        }
        return super._map.containsKey("expiresAt");
    }

    /**
     * Remover for expiresAt
     * 
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    public void removeExpiresAt() {
        super._map.remove("expiresAt");
    }

    /**
     * Getter for expiresAt
     * 
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    @Nullable
    public Long getExpiresAt(GetMode mode) {
        return getExpiresAt();
    }

    /**
     * Getter for expiresAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    @Nullable
    public Long getExpiresAt() {
        if (_expiresAtField!= null) {
            return _expiresAtField;
        } else {
            Object __rawValue = super._map.get("expiresAt");
            _expiresAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _expiresAtField;
        }
    }

    /**
     * Setter for expiresAt
     * 
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    public DataHubAccessTokenInfo setExpiresAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExpiresAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExpiresAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "expiresAt", DataTemplateUtil.coerceLongInput(value));
                    _expiresAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "expiresAt", DataTemplateUtil.coerceLongInput(value));
                    _expiresAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for expiresAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    public DataHubAccessTokenInfo setExpiresAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field expiresAt of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "expiresAt", DataTemplateUtil.coerceLongInput(value));
            _expiresAtField = value;
        }
        return this;
    }

    /**
     * Setter for expiresAt
     * 
     * @see DataHubAccessTokenInfo.Fields#expiresAt
     */
    public DataHubAccessTokenInfo setExpiresAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "expiresAt", DataTemplateUtil.coerceLongInput(value));
        _expiresAtField = value;
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataHubAccessTokenInfo.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see DataHubAccessTokenInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataHubAccessTokenInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubAccessTokenInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see DataHubAccessTokenInfo.Fields#description
     */
    public DataHubAccessTokenInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubAccessTokenInfo.Fields#description
     */
    public DataHubAccessTokenInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.access.token.DataHubAccessTokenInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public DataHubAccessTokenInfo clone()
        throws CloneNotSupportedException
    {
        DataHubAccessTokenInfo __clone = ((DataHubAccessTokenInfo) super.clone());
        __clone.__changeListener = new DataHubAccessTokenInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubAccessTokenInfo copy()
        throws CloneNotSupportedException
    {
        DataHubAccessTokenInfo __copy = ((DataHubAccessTokenInfo) super.copy());
        __copy._createdAtField = null;
        __copy._actorUrnField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._expiresAtField = null;
        __copy._ownerUrnField = null;
        __copy.__changeListener = new DataHubAccessTokenInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubAccessTokenInfo __objectRef;

        private ChangeListener(DataHubAccessTokenInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "createdAt":
                    __objectRef._createdAtField = null;
                    break;
                case "actorUrn":
                    __objectRef._actorUrnField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "expiresAt":
                    __objectRef._expiresAtField = null;
                    break;
                case "ownerUrn":
                    __objectRef._ownerUrnField = null;
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
         * User defined name for the access token if defined.
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Urn of the actor to which this access token belongs to.
         * 
         */
        public PathSpec actorUrn() {
            return new PathSpec(getPathComponents(), "actorUrn");
        }

        /**
         * Urn of the actor which created this access token.
         * 
         */
        public PathSpec ownerUrn() {
            return new PathSpec(getPathComponents(), "ownerUrn");
        }

        /**
         * When the token was created.
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

        /**
         * When the token expires.
         * 
         */
        public PathSpec expiresAt() {
            return new PathSpec(getPathComponents(), "expiresAt");
        }

        /**
         * Description of the token if defined.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(8);
        }

        /**
         * User defined name for the access token if defined.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the actor to which this access token belongs to.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withActorUrn() {
            getDataMap().put("actorUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the actor which created this access token.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withOwnerUrn() {
            getDataMap().put("ownerUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * When the token was created.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withCreatedAt() {
            getDataMap().put("createdAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * When the token expires.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withExpiresAt() {
            getDataMap().put("expiresAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the token if defined.
         * 
         */
        public DataHubAccessTokenInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
