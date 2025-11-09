
package com.linkedin.common;

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
 * Carries information about where an entity originated from.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Origin.pdl.")
public class Origin
    extends RecordTemplate
{

    private final static Origin.Fields _fields = new Origin.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Carries information about where an entity originated from.*/@Aspect.name=\"origin\"record Origin{/**Where an entity originated from. Either NATIVE or EXTERNAL.*/type:/**Enum to define where an entity originated from.*/enum OriginType{/**The entity is native to DataHub.*/NATIVE/**The entity is external to DataHub.*/EXTERNAL}/**Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.*/externalType:optional string}", SchemaFormatType.PDL));
    private OriginType _typeField = null;
    private String _externalTypeField = null;
    private Origin.ChangeListener __changeListener = new Origin.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_ExternalType = SCHEMA.getField("externalType");

    public Origin() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Origin(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Origin.Fields fields() {
        return _fields;
    }

    public static Origin.ProjectionMask createMask() {
        return new Origin.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see Origin.Fields#type
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
     * @see Origin.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see Origin.Fields#type
     */
    @Nullable
    public OriginType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OriginType.class, OriginType.$UNKNOWN);
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
     * @see Origin.Fields#type
     */
    @Nonnull
    public OriginType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OriginType.class, OriginType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see Origin.Fields#type
     */
    public Origin setType(
        @Nullable
        OriginType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.common.Origin");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
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
     * @see Origin.Fields#type
     */
    public Origin setType(
        @Nonnull
        OriginType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.common.Origin to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalType
     * 
     * @see Origin.Fields#externalType
     */
    public boolean hasExternalType() {
        if (_externalTypeField!= null) {
            return true;
        }
        return super._map.containsKey("externalType");
    }

    /**
     * Remover for externalType
     * 
     * @see Origin.Fields#externalType
     */
    public void removeExternalType() {
        super._map.remove("externalType");
    }

    /**
     * Getter for externalType
     * 
     * @see Origin.Fields#externalType
     */
    @Nullable
    public String getExternalType(GetMode mode) {
        return getExternalType();
    }

    /**
     * Getter for externalType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Origin.Fields#externalType
     */
    @Nullable
    public String getExternalType() {
        if (_externalTypeField!= null) {
            return _externalTypeField;
        } else {
            Object __rawValue = super._map.get("externalType");
            _externalTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _externalTypeField;
        }
    }

    /**
     * Setter for externalType
     * 
     * @see Origin.Fields#externalType
     */
    public Origin setExternalType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalType", value);
                    _externalTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalType", value);
                    _externalTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Origin.Fields#externalType
     */
    public Origin setExternalType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalType of com.linkedin.common.Origin to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalType", value);
            _externalTypeField = value;
        }
        return this;
    }

    @Override
    public Origin clone()
        throws CloneNotSupportedException
    {
        Origin __clone = ((Origin) super.clone());
        __clone.__changeListener = new Origin.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Origin copy()
        throws CloneNotSupportedException
    {
        Origin __copy = ((Origin) super.copy());
        __copy._externalTypeField = null;
        __copy._typeField = null;
        __copy.__changeListener = new Origin.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Origin __objectRef;

        private ChangeListener(Origin reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalType":
                    __objectRef._externalTypeField = null;
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
         * Where an entity originated from. Either NATIVE or EXTERNAL.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
         * 
         */
        public PathSpec externalType() {
            return new PathSpec(getPathComponents(), "externalType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Where an entity originated from. Either NATIVE or EXTERNAL.
         * 
         */
        public Origin.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
         * 
         */
        public Origin.ProjectionMask withExternalType() {
            getDataMap().put("externalType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
