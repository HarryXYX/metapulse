
package com.linkedin.ownership;

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
 * Information about an ownership type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ownership/OwnershipTypeInfo.pdl.")
public class OwnershipTypeInfo
    extends RecordTemplate
{

    private final static OwnershipTypeInfo.Fields _fields = new OwnershipTypeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ownership/**Information about an ownership type*/@Aspect.name=\"ownershipTypeInfo\"record OwnershipTypeInfo{/**Display name of the Ownership Type*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string/**Description of the Ownership Type*/description:optional string/**Audit stamp capturing the time and actor who created the Ownership Type.*/@Searchable={\"/actor\":{\"fieldName\":\"createdBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp capturing the time and actor who last modified the Ownership Type.*/@Searchable={\"/actor\":{\"fieldName\":\"lastModifiedBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}}lastModified:com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _descriptionField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private OwnershipTypeInfo.ChangeListener __changeListener = new OwnershipTypeInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    public OwnershipTypeInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public OwnershipTypeInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OwnershipTypeInfo.Fields fields() {
        return _fields;
    }

    public static OwnershipTypeInfo.ProjectionMask createMask() {
        return new OwnershipTypeInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see OwnershipTypeInfo.Fields#name
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
     * @see OwnershipTypeInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see OwnershipTypeInfo.Fields#name
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
     * @see OwnershipTypeInfo.Fields#name
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
     * @see OwnershipTypeInfo.Fields#name
     */
    public OwnershipTypeInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.ownership.OwnershipTypeInfo");
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
     * @see OwnershipTypeInfo.Fields#name
     */
    public OwnershipTypeInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.ownership.OwnershipTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see OwnershipTypeInfo.Fields#description
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
     * @see OwnershipTypeInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see OwnershipTypeInfo.Fields#description
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
     * @see OwnershipTypeInfo.Fields#description
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
     * @see OwnershipTypeInfo.Fields#description
     */
    public OwnershipTypeInfo setDescription(
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
     * @see OwnershipTypeInfo.Fields#description
     */
    public OwnershipTypeInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ownership.OwnershipTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see OwnershipTypeInfo.Fields#created
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
     * @see OwnershipTypeInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see OwnershipTypeInfo.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreated();
            case DEFAULT:
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnershipTypeInfo.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("created");
            }
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see OwnershipTypeInfo.Fields#created
     */
    public OwnershipTypeInfo setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.ownership.OwnershipTypeInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
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
     * @see OwnershipTypeInfo.Fields#created
     */
    public OwnershipTypeInfo setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.ownership.OwnershipTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastModified();
            case DEFAULT:
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastModified");
            }
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    public OwnershipTypeInfo setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.ownership.OwnershipTypeInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnershipTypeInfo.Fields#lastModified
     */
    public OwnershipTypeInfo setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.ownership.OwnershipTypeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public OwnershipTypeInfo clone()
        throws CloneNotSupportedException
    {
        OwnershipTypeInfo __clone = ((OwnershipTypeInfo) super.clone());
        __clone.__changeListener = new OwnershipTypeInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OwnershipTypeInfo copy()
        throws CloneNotSupportedException
    {
        OwnershipTypeInfo __copy = ((OwnershipTypeInfo) super.copy());
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new OwnershipTypeInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OwnershipTypeInfo __objectRef;

        private ChangeListener(OwnershipTypeInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
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
         * Display name of the Ownership Type
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Description of the Ownership Type
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Audit stamp capturing the time and actor who created the Ownership Type.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Ownership Type.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Display name of the Ownership Type
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the Ownership Type
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Ownership Type.
         * 
         */
        public OwnershipTypeInfo.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
