
package com.linkedin.role;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * Information about a ExternalRoleProperties
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/role/RoleProperties.pdl.")
public class RoleProperties
    extends RecordTemplate
{

    private final static RoleProperties.Fields _fields = new RoleProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.role/**Information about a ExternalRoleProperties*/@Aspect.name=\"roleProperties\"record RoleProperties{/**Display name of the IAM Role in the external system*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Description of the IAM Role*/description:optional string/**Can be READ, ADMIN, WRITE*/type:string/**Link to access external access management*/requestUrl:optional string/**Created Audit stamp*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _descriptionField = null;
    private String _typeField = null;
    private String _requestUrlField = null;
    private AuditStamp _createdField = null;
    private RoleProperties.ChangeListener __changeListener = new RoleProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_RequestUrl = SCHEMA.getField("requestUrl");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");

    public RoleProperties() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public RoleProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RoleProperties.Fields fields() {
        return _fields;
    }

    public static RoleProperties.ProjectionMask createMask() {
        return new RoleProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see RoleProperties.Fields#name
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
     * @see RoleProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see RoleProperties.Fields#name
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
     * @see RoleProperties.Fields#name
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
     * @see RoleProperties.Fields#name
     */
    public RoleProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.role.RoleProperties");
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
     * @see RoleProperties.Fields#name
     */
    public RoleProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.role.RoleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see RoleProperties.Fields#description
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
     * @see RoleProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see RoleProperties.Fields#description
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
     * @see RoleProperties.Fields#description
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
     * @see RoleProperties.Fields#description
     */
    public RoleProperties setDescription(
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
     * @see RoleProperties.Fields#description
     */
    public RoleProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.role.RoleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see RoleProperties.Fields#type
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
     * @see RoleProperties.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see RoleProperties.Fields#type
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
     * @see RoleProperties.Fields#type
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
     * @see RoleProperties.Fields#type
     */
    public RoleProperties setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.role.RoleProperties");
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
     * @see RoleProperties.Fields#type
     */
    public RoleProperties setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.role.RoleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for requestUrl
     * 
     * @see RoleProperties.Fields#requestUrl
     */
    public boolean hasRequestUrl() {
        if (_requestUrlField!= null) {
            return true;
        }
        return super._map.containsKey("requestUrl");
    }

    /**
     * Remover for requestUrl
     * 
     * @see RoleProperties.Fields#requestUrl
     */
    public void removeRequestUrl() {
        super._map.remove("requestUrl");
    }

    /**
     * Getter for requestUrl
     * 
     * @see RoleProperties.Fields#requestUrl
     */
    @Nullable
    public String getRequestUrl(GetMode mode) {
        return getRequestUrl();
    }

    /**
     * Getter for requestUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RoleProperties.Fields#requestUrl
     */
    @Nullable
    public String getRequestUrl() {
        if (_requestUrlField!= null) {
            return _requestUrlField;
        } else {
            Object __rawValue = super._map.get("requestUrl");
            _requestUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _requestUrlField;
        }
    }

    /**
     * Setter for requestUrl
     * 
     * @see RoleProperties.Fields#requestUrl
     */
    public RoleProperties setRequestUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRequestUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRequestUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "requestUrl", value);
                    _requestUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "requestUrl", value);
                    _requestUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for requestUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RoleProperties.Fields#requestUrl
     */
    public RoleProperties setRequestUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field requestUrl of com.linkedin.role.RoleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "requestUrl", value);
            _requestUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see RoleProperties.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see RoleProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see RoleProperties.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RoleProperties.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see RoleProperties.Fields#created
     */
    public RoleProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RoleProperties.Fields#created
     */
    public RoleProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.role.RoleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    @Override
    public RoleProperties clone()
        throws CloneNotSupportedException
    {
        RoleProperties __clone = ((RoleProperties) super.clone());
        __clone.__changeListener = new RoleProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RoleProperties copy()
        throws CloneNotSupportedException
    {
        RoleProperties __copy = ((RoleProperties) super.copy());
        __copy._requestUrlField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._typeField = null;
        __copy.__changeListener = new RoleProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RoleProperties __objectRef;

        private ChangeListener(RoleProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "requestUrl":
                    __objectRef._requestUrlField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * Display name of the IAM Role in the external system
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Description of the IAM Role
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Can be READ, ADMIN, WRITE
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Link to access external access management
         * 
         */
        public PathSpec requestUrl() {
            return new PathSpec(getPathComponents(), "requestUrl");
        }

        /**
         * Created Audit stamp
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Display name of the IAM Role in the external system
         * 
         */
        public RoleProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the IAM Role
         * 
         */
        public RoleProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Can be READ, ADMIN, WRITE
         * 
         */
        public RoleProperties.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Link to access external access management
         * 
         */
        public RoleProperties.ProjectionMask withRequestUrl() {
            getDataMap().put("requestUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public RoleProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public RoleProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public RoleProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
