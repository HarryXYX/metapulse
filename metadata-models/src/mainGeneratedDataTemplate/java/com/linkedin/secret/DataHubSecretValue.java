
package com.linkedin.secret;

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
 * The value of a DataHub Secret
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/secret/DataHubSecretValue.pdl.")
public class DataHubSecretValue
    extends RecordTemplate
{

    private final static DataHubSecretValue.Fields _fields = new DataHubSecretValue.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.secret/**The value of a DataHub Secret*/@Aspect.name=\"dataHubSecretValue\"record DataHubSecretValue{/**The display name for the secret*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**The AES-encrypted value of the DataHub secret.*/value:string/**Description of the secret*/description:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _valueField = null;
    private String _descriptionField = null;
    private AuditStamp _createdField = null;
    private DataHubSecretValue.ChangeListener __changeListener = new DataHubSecretValue.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");

    public DataHubSecretValue() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubSecretValue(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubSecretValue.Fields fields() {
        return _fields;
    }

    public static DataHubSecretValue.ProjectionMask createMask() {
        return new DataHubSecretValue.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubSecretValue.Fields#name
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
     * @see DataHubSecretValue.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubSecretValue.Fields#name
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
     * @see DataHubSecretValue.Fields#name
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
     * @see DataHubSecretValue.Fields#name
     */
    public DataHubSecretValue setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.secret.DataHubSecretValue");
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
     * @see DataHubSecretValue.Fields#name
     */
    public DataHubSecretValue setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.secret.DataHubSecretValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see DataHubSecretValue.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see DataHubSecretValue.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see DataHubSecretValue.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSecretValue.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see DataHubSecretValue.Fields#value
     */
    public DataHubSecretValue setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.secret.DataHubSecretValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSecretValue.Fields#value
     */
    public DataHubSecretValue setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.secret.DataHubSecretValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataHubSecretValue.Fields#description
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
     * @see DataHubSecretValue.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataHubSecretValue.Fields#description
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
     * @see DataHubSecretValue.Fields#description
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
     * @see DataHubSecretValue.Fields#description
     */
    public DataHubSecretValue setDescription(
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
     * @see DataHubSecretValue.Fields#description
     */
    public DataHubSecretValue setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.secret.DataHubSecretValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataHubSecretValue.Fields#created
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
     * @see DataHubSecretValue.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataHubSecretValue.Fields#created
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
     * @see DataHubSecretValue.Fields#created
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
     * @see DataHubSecretValue.Fields#created
     */
    public DataHubSecretValue setCreated(
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
     * @see DataHubSecretValue.Fields#created
     */
    public DataHubSecretValue setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.secret.DataHubSecretValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    @Override
    public DataHubSecretValue clone()
        throws CloneNotSupportedException
    {
        DataHubSecretValue __clone = ((DataHubSecretValue) super.clone());
        __clone.__changeListener = new DataHubSecretValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubSecretValue copy()
        throws CloneNotSupportedException
    {
        DataHubSecretValue __copy = ((DataHubSecretValue) super.copy());
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._valueField = null;
        __copy.__changeListener = new DataHubSecretValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubSecretValue __objectRef;

        private ChangeListener(DataHubSecretValue reference) {
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
                case "value":
                    __objectRef._valueField = null;
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
         * The display name for the secret
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The AES-encrypted value of the DataHub secret.
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Description of the secret
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
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
            super(6);
        }

        /**
         * The display name for the secret
         * 
         */
        public DataHubSecretValue.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The AES-encrypted value of the DataHub secret.
         * 
         */
        public DataHubSecretValue.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the secret
         * 
         */
        public DataHubSecretValue.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public DataHubSecretValue.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public DataHubSecretValue.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public DataHubSecretValue.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
