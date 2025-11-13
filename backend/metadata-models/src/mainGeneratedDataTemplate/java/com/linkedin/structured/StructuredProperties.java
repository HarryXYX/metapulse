
package com.linkedin.structured;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
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
 * Properties about an entity governed by StructuredPropertyDefinition
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/structured/StructuredProperties.pdl.")
public class StructuredProperties
    extends RecordTemplate
{

    private final static StructuredProperties.Fields _fields = new StructuredProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.structured/**Properties about an entity governed by StructuredPropertyDefinition*/@Aspect.name=\"structuredProperties\"record StructuredProperties{/**Custom property bag.*/properties:array[record StructuredPropertyValueAssignment{/**The property that is being assigned a value.*/propertyUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The value assigned to the property.*/values:array[/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]]/**Audit stamp containing who created this relationship edge and when*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional com.linkedin.common.AuditStamp/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"structuredPropertyAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"structuredPropertyAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"structuredPropertyAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional{namespace com.linkedin.common/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}]}", SchemaFormatType.PDL));
    private StructuredPropertyValueAssignmentArray _propertiesField = null;
    private StructuredProperties.ChangeListener __changeListener = new StructuredProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");

    public StructuredProperties() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public StructuredProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static StructuredProperties.Fields fields() {
        return _fields;
    }

    public static StructuredProperties.ProjectionMask createMask() {
        return new StructuredProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for properties
     * 
     * @see StructuredProperties.Fields#properties
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
     * @see StructuredProperties.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see StructuredProperties.Fields#properties
     */
    @Nullable
    public StructuredPropertyValueAssignmentArray getProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getProperties();
            case DEFAULT:
            case NULL:
                if (_propertiesField!= null) {
                    return _propertiesField;
                } else {
                    Object __rawValue = super._map.get("properties");
                    _propertiesField = ((__rawValue == null)?null:new StructuredPropertyValueAssignmentArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see StructuredProperties.Fields#properties
     */
    @Nonnull
    public StructuredPropertyValueAssignmentArray getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("properties");
            }
            _propertiesField = ((__rawValue == null)?null:new StructuredPropertyValueAssignmentArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see StructuredProperties.Fields#properties
     */
    public StructuredProperties setProperties(
        @Nullable
        StructuredPropertyValueAssignmentArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field properties of com.linkedin.structured.StructuredProperties");
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
     * @see StructuredProperties.Fields#properties
     */
    public StructuredProperties setProperties(
        @Nonnull
        StructuredPropertyValueAssignmentArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.structured.StructuredProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    @Override
    public StructuredProperties clone()
        throws CloneNotSupportedException
    {
        StructuredProperties __clone = ((StructuredProperties) super.clone());
        __clone.__changeListener = new StructuredProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public StructuredProperties copy()
        throws CloneNotSupportedException
    {
        StructuredProperties __copy = ((StructuredProperties) super.copy());
        __copy._propertiesField = null;
        __copy.__changeListener = new StructuredProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final StructuredProperties __objectRef;

        private ChangeListener(StructuredProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * Custom property bag.
         * 
         */
        public com.linkedin.structured.StructuredPropertyValueAssignmentArray.Fields properties() {
            return new com.linkedin.structured.StructuredPropertyValueAssignmentArray.Fields(getPathComponents(), "properties");
        }

        /**
         * Custom property bag.
         * 
         */
        public PathSpec properties(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "properties");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.StructuredPropertyValueAssignmentArray.ProjectionMask _propertiesMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Custom property bag.
         * 
         */
        public StructuredProperties.ProjectionMask withProperties(Function<com.linkedin.structured.StructuredPropertyValueAssignmentArray.ProjectionMask, com.linkedin.structured.StructuredPropertyValueAssignmentArray.ProjectionMask> nestedMask) {
            _propertiesMask = nestedMask.apply(((_propertiesMask == null)?StructuredPropertyValueAssignmentArray.createMask():_propertiesMask));
            getDataMap().put("properties", _propertiesMask.getDataMap());
            return this;
        }

        /**
         * Custom property bag.
         * 
         */
        public StructuredProperties.ProjectionMask withProperties() {
            _propertiesMask = null;
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Custom property bag.
         * 
         */
        public StructuredProperties.ProjectionMask withProperties(Function<com.linkedin.structured.StructuredPropertyValueAssignmentArray.ProjectionMask, com.linkedin.structured.StructuredPropertyValueAssignmentArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _propertiesMask = nestedMask.apply(((_propertiesMask == null)?StructuredPropertyValueAssignmentArray.createMask():_propertiesMask));
            getDataMap().put("properties", _propertiesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("properties").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("properties").put("$count", count);
            }
            return this;
        }

        /**
         * Custom property bag.
         * 
         */
        public StructuredProperties.ProjectionMask withProperties(Integer start, Integer count) {
            _propertiesMask = null;
            getDataMap().put("properties", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("properties").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("properties").put("$count", count);
            }
            return this;
        }

    }

}
