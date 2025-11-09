
package com.linkedin.structured;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.MetadataAttribution;
import com.linkedin.data.DataList;
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredPropertyValueAssignment.pdl.")
public class StructuredPropertyValueAssignment
    extends RecordTemplate
{

    private final static StructuredPropertyValueAssignment.Fields _fields = new StructuredPropertyValueAssignment.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.structured,record StructuredPropertyValueAssignment{/**The property that is being assigned a value.*/propertyUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The value assigned to the property.*/values:array[/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]]/**Audit stamp containing who created this relationship edge and when*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional com.linkedin.common.AuditStamp/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"structuredPropertyAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"structuredPropertyAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"structuredPropertyAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional{namespace com.linkedin.common/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _propertyUrnField = null;
    private PrimitivePropertyValueArray _valuesField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private MetadataAttribution _attributionField = null;
    private StructuredPropertyValueAssignment.ChangeListener __changeListener = new StructuredPropertyValueAssignment.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_PropertyUrn = SCHEMA.getField("propertyUrn");
    private final static RecordDataSchema.Field FIELD_Values = SCHEMA.getField("values");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Attribution = SCHEMA.getField("attribution");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public StructuredPropertyValueAssignment() {
        super(new DataMap(7, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public StructuredPropertyValueAssignment(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static StructuredPropertyValueAssignment.Fields fields() {
        return _fields;
    }

    public static StructuredPropertyValueAssignment.ProjectionMask createMask() {
        return new StructuredPropertyValueAssignment.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for propertyUrn
     * 
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    public boolean hasPropertyUrn() {
        if (_propertyUrnField!= null) {
            return true;
        }
        return super._map.containsKey("propertyUrn");
    }

    /**
     * Remover for propertyUrn
     * 
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    public void removePropertyUrn() {
        super._map.remove("propertyUrn");
    }

    /**
     * Getter for propertyUrn
     * 
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPropertyUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPropertyUrn();
            case DEFAULT:
            case NULL:
                if (_propertyUrnField!= null) {
                    return _propertyUrnField;
                } else {
                    Object __rawValue = super._map.get("propertyUrn");
                    _propertyUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _propertyUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for propertyUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPropertyUrn() {
        if (_propertyUrnField!= null) {
            return _propertyUrnField;
        } else {
            Object __rawValue = super._map.get("propertyUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("propertyUrn");
            }
            _propertyUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _propertyUrnField;
        }
    }

    /**
     * Setter for propertyUrn
     * 
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    public StructuredPropertyValueAssignment setPropertyUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPropertyUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field propertyUrn of com.linkedin.structured.StructuredPropertyValueAssignment");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "propertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _propertyUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePropertyUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "propertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _propertyUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "propertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _propertyUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for propertyUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyValueAssignment.Fields#propertyUrn
     */
    public StructuredPropertyValueAssignment setPropertyUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field propertyUrn of com.linkedin.structured.StructuredPropertyValueAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "propertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _propertyUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for values
     * 
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    public boolean hasValues() {
        if (_valuesField!= null) {
            return true;
        }
        return super._map.containsKey("values");
    }

    /**
     * Remover for values
     * 
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    public void removeValues() {
        super._map.remove("values");
    }

    /**
     * Getter for values
     * 
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    @Nullable
    public PrimitivePropertyValueArray getValues(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValues();
            case DEFAULT:
            case NULL:
                if (_valuesField!= null) {
                    return _valuesField;
                } else {
                    Object __rawValue = super._map.get("values");
                    _valuesField = ((__rawValue == null)?null:new PrimitivePropertyValueArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _valuesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for values
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    @Nonnull
    public PrimitivePropertyValueArray getValues() {
        if (_valuesField!= null) {
            return _valuesField;
        } else {
            Object __rawValue = super._map.get("values");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("values");
            }
            _valuesField = ((__rawValue == null)?null:new PrimitivePropertyValueArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _valuesField;
        }
    }

    /**
     * Setter for values
     * 
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    public StructuredPropertyValueAssignment setValues(
        @Nullable
        PrimitivePropertyValueArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field values of com.linkedin.structured.StructuredPropertyValueAssignment");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for values
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyValueAssignment.Fields#values
     */
    public StructuredPropertyValueAssignment setValues(
        @Nonnull
        PrimitivePropertyValueArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field values of com.linkedin.structured.StructuredPropertyValueAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "values", value.data());
            _valuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see StructuredPropertyValueAssignment.Fields#created
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
     * @see StructuredPropertyValueAssignment.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see StructuredPropertyValueAssignment.Fields#created
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
     * @see StructuredPropertyValueAssignment.Fields#created
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
     * @see StructuredPropertyValueAssignment.Fields#created
     */
    public StructuredPropertyValueAssignment setCreated(
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
     * @see StructuredPropertyValueAssignment.Fields#created
     */
    public StructuredPropertyValueAssignment setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.structured.StructuredPropertyValueAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see StructuredPropertyValueAssignment.Fields#lastModified
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
     * @see StructuredPropertyValueAssignment.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see StructuredPropertyValueAssignment.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyValueAssignment.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see StructuredPropertyValueAssignment.Fields#lastModified
     */
    public StructuredPropertyValueAssignment setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see StructuredPropertyValueAssignment.Fields#lastModified
     */
    public StructuredPropertyValueAssignment setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.structured.StructuredPropertyValueAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for attribution
     * 
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    public boolean hasAttribution() {
        if (_attributionField!= null) {
            return true;
        }
        return super._map.containsKey("attribution");
    }

    /**
     * Remover for attribution
     * 
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    public void removeAttribution() {
        super._map.remove("attribution");
    }

    /**
     * Getter for attribution
     * 
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution(GetMode mode) {
        return getAttribution();
    }

    /**
     * Getter for attribution
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution() {
        if (_attributionField!= null) {
            return _attributionField;
        } else {
            Object __rawValue = super._map.get("attribution");
            _attributionField = ((__rawValue == null)?null:new MetadataAttribution(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _attributionField;
        }
    }

    /**
     * Setter for attribution
     * 
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    public StructuredPropertyValueAssignment setAttribution(
        @Nullable
        MetadataAttribution value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAttribution(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAttribution();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for attribution
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyValueAssignment.Fields#attribution
     */
    public StructuredPropertyValueAssignment setAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field attribution of com.linkedin.structured.StructuredPropertyValueAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
            _attributionField = value;
        }
        return this;
    }

    @Override
    public StructuredPropertyValueAssignment clone()
        throws CloneNotSupportedException
    {
        StructuredPropertyValueAssignment __clone = ((StructuredPropertyValueAssignment) super.clone());
        __clone.__changeListener = new StructuredPropertyValueAssignment.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public StructuredPropertyValueAssignment copy()
        throws CloneNotSupportedException
    {
        StructuredPropertyValueAssignment __copy = ((StructuredPropertyValueAssignment) super.copy());
        __copy._createdField = null;
        __copy._propertyUrnField = null;
        __copy._valuesField = null;
        __copy._attributionField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new StructuredPropertyValueAssignment.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final StructuredPropertyValueAssignment __objectRef;

        private ChangeListener(StructuredPropertyValueAssignment reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "propertyUrn":
                    __objectRef._propertyUrnField = null;
                    break;
                case "values":
                    __objectRef._valuesField = null;
                    break;
                case "attribution":
                    __objectRef._attributionField = null;
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
         * The property that is being assigned a value.
         * 
         */
        public PathSpec propertyUrn() {
            return new PathSpec(getPathComponents(), "propertyUrn");
        }

        /**
         * The value assigned to the property.
         * 
         */
        public com.linkedin.structured.PrimitivePropertyValueArray.Fields values() {
            return new com.linkedin.structured.PrimitivePropertyValueArray.Fields(getPathComponents(), "values");
        }

        /**
         * The value assigned to the property.
         * 
         */
        public PathSpec values(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "values");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public com.linkedin.common.MetadataAttribution.Fields attribution() {
            return new com.linkedin.common.MetadataAttribution.Fields(getPathComponents(), "attribution");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.PrimitivePropertyValueArray.ProjectionMask _valuesMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.MetadataAttribution.ProjectionMask _attributionMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The property that is being assigned a value.
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withPropertyUrn() {
            getDataMap().put("propertyUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The value assigned to the property.
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withValues(Function<com.linkedin.structured.PrimitivePropertyValueArray.ProjectionMask, com.linkedin.structured.PrimitivePropertyValueArray.ProjectionMask> nestedMask) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?PrimitivePropertyValueArray.createMask():_valuesMask));
            getDataMap().put("values", _valuesMask.getDataMap());
            return this;
        }

        /**
         * The value assigned to the property.
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withValues() {
            _valuesMask = null;
            getDataMap().put("values", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The value assigned to the property.
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withValues(Function<com.linkedin.structured.PrimitivePropertyValueArray.ProjectionMask, com.linkedin.structured.PrimitivePropertyValueArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?PrimitivePropertyValueArray.createMask():_valuesMask));
            getDataMap().put("values", _valuesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * The value assigned to the property.
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withValues(Integer start, Integer count) {
            _valuesMask = null;
            getDataMap().put("values", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _attributionMask = nestedMask.apply(((_attributionMask == null)?MetadataAttribution.createMask():_attributionMask));
            getDataMap().put("attribution", _attributionMask.getDataMap());
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public StructuredPropertyValueAssignment.ProjectionMask withAttribution() {
            _attributionMask = null;
            getDataMap().put("attribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
