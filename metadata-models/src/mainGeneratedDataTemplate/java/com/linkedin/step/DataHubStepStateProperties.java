
package com.linkedin.step;

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
import com.linkedin.data.template.StringMap;


/**
 * The properties associated with a DataHub step state
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/step/DataHubStepStateProperties.pdl.")
public class DataHubStepStateProperties
    extends RecordTemplate
{

    private final static DataHubStepStateProperties.Fields _fields = new DataHubStepStateProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.step/**The properties associated with a DataHub step state*/@Aspect.name=\"dataHubStepStateProperties\"record DataHubStepStateProperties{/**Description of the secret*/properties:map[string,string]={}/**Audit stamp describing the last person to update it.*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private StringMap _propertiesField = null;
    private AuditStamp _lastModifiedField = null;
    private DataHubStepStateProperties.ChangeListener __changeListener = new DataHubStepStateProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");
    private final static StringMap DEFAULT_Properties;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    static {
        DEFAULT_Properties = ((FIELD_Properties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_Properties.getDefault(), DataMap.class)));
    }

    public DataHubStepStateProperties() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataHubStepStateProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubStepStateProperties.Fields fields() {
        return _fields;
    }

    public static DataHubStepStateProperties.ProjectionMask createMask() {
        return new DataHubStepStateProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for properties
     * 
     * @see DataHubStepStateProperties.Fields#properties
     */
    public boolean hasProperties() {
        if (_propertiesField!= null) {
            return true;
        }
        return super._map.containsKey("properties");
    }

    /**
     * Remover for properties
     * 
     * @see DataHubStepStateProperties.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see DataHubStepStateProperties.Fields#properties
     */
    @Nullable
    public StringMap getProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getProperties();
            case NULL:
                if (_propertiesField!= null) {
                    return _propertiesField;
                } else {
                    Object __rawValue = super._map.get("properties");
                    _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _propertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubStepStateProperties.Fields#properties
     */
    @Nonnull
    public StringMap getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            if (__rawValue == null) {
                return DEFAULT_Properties;
            }
            _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see DataHubStepStateProperties.Fields#properties
     */
    public DataHubStepStateProperties setProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field properties of com.linkedin.step.DataHubStepStateProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubStepStateProperties.Fields#properties
     */
    public DataHubStepStateProperties setProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.step.DataHubStepStateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DataHubStepStateProperties.Fields#lastModified
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
     * @see DataHubStepStateProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DataHubStepStateProperties.Fields#lastModified
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
     * @see DataHubStepStateProperties.Fields#lastModified
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
     * @see DataHubStepStateProperties.Fields#lastModified
     */
    public DataHubStepStateProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.step.DataHubStepStateProperties");
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
     * @see DataHubStepStateProperties.Fields#lastModified
     */
    public DataHubStepStateProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.step.DataHubStepStateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public DataHubStepStateProperties clone()
        throws CloneNotSupportedException
    {
        DataHubStepStateProperties __clone = ((DataHubStepStateProperties) super.clone());
        __clone.__changeListener = new DataHubStepStateProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubStepStateProperties copy()
        throws CloneNotSupportedException
    {
        DataHubStepStateProperties __copy = ((DataHubStepStateProperties) super.copy());
        __copy._lastModifiedField = null;
        __copy._propertiesField = null;
        __copy.__changeListener = new DataHubStepStateProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubStepStateProperties __objectRef;

        private ChangeListener(DataHubStepStateProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "properties":
                    __objectRef._propertiesField = null;
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
         * Description of the secret
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

        /**
         * Audit stamp describing the last person to update it.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Description of the secret
         * 
         */
        public DataHubStepStateProperties.ProjectionMask withProperties() {
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp describing the last person to update it.
         * 
         */
        public DataHubStepStateProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp describing the last person to update it.
         * 
         */
        public DataHubStepStateProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp describing the last person to update it.
         * 
         */
        public DataHubStepStateProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
