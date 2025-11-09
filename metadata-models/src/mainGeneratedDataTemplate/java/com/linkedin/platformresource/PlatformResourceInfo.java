
package com.linkedin.platformresource;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.SerializedValue;
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
import com.linkedin.data.template.StringArray;


/**
 * Platform Resource Info.
 * These entities are for miscelaneous data that is used in non-core parts of the system.
 * For instance, if we want to persist & retrieve data from auxiliary integrations such as Slack or Microsoft Teams.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/platformresource/PlatformResourceInfo.pdl.")
public class PlatformResourceInfo
    extends RecordTemplate
{

    private final static PlatformResourceInfo.Fields _fields = new PlatformResourceInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platformresource/**Platform Resource Info.\nThese entities are for miscelaneous data that is used in non-core parts of the system.\nFor instance, if we want to persist & retrieve data from auxiliary integrations such as Slack or Microsoft Teams.*/@Aspect.name=\"platformResourceInfo\"record PlatformResourceInfo{/**The type of the resource. \nIntended as a loose specifier of the generic type of the resource.\nProducer is not forced to conform to a specific set of symbols for\nresource types.\nThe @PlatformResourceType enumeration offers a paved path for agreed upon\ncommon terms, but is not required to be followed.\nExample values could be: conversation, user, grant, etc.\nResource types are indexed for ease of access. \ne.g. Get me all platform resources of type user for the platform looker*/@Searchable.fieldType=\"KEYWORD\"resourceType:string/**The primary key for this platform resource.\ne.g. for a slack member this would be the memberID.\nprimary keys specified here don't need to include any additional specificity for the\n     dataPlatform\nThe @PlatformResourceKey is supposed to represent that*/@Searchable.fieldType=\"KEYWORD\"primaryKey:string/**The secondary keys this platform resource can be located by.\nI.e., for a slack member this would be email or phone.*/@Searchable.`/*`.fieldType=\"KEYWORD\"secondaryKeys:optional array[string]/**The serialized value of this platform resource item.*/value:optional{namespace com.linkedin.common/**Captures the serialized value of a (usually) schema-d blob.*/record SerializedValue{/**The serialized blob value.*/blob:bytes/**The content-type of the serialized blob value.*/contentType:enum SerializedValueContentType{JSON,BINARY}=\"JSON\"/**The schema type for the schema that models the object that was serialized\n       into the blob.\nAbsence of this field indicates that the schema is not known.\nIf the schema is known, the value should be set to the appropriate schema\ntype.\nUse the NONE value if the existing schema categories do not apply.*/schemaType:optional enum SerializedValueSchemaType{AVRO,PROTOBUF,PEGASUS,THRIFT,JSON,NONE}/**An optional reference to the schema that models the object.\ne.g., 'com.linkedin.platformresource.slack.SlackConversation'*/schemaRef:optional string}}}", SchemaFormatType.PDL));
    private String _resourceTypeField = null;
    private String _primaryKeyField = null;
    private StringArray _secondaryKeysField = null;
    private SerializedValue _valueField = null;
    private PlatformResourceInfo.ChangeListener __changeListener = new PlatformResourceInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ResourceType = SCHEMA.getField("resourceType");
    private final static RecordDataSchema.Field FIELD_PrimaryKey = SCHEMA.getField("primaryKey");
    private final static RecordDataSchema.Field FIELD_SecondaryKeys = SCHEMA.getField("secondaryKeys");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");

    public PlatformResourceInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public PlatformResourceInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PlatformResourceInfo.Fields fields() {
        return _fields;
    }

    public static PlatformResourceInfo.ProjectionMask createMask() {
        return new PlatformResourceInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for resourceType
     * 
     * @see PlatformResourceInfo.Fields#resourceType
     */
    public boolean hasResourceType() {
        if (_resourceTypeField!= null) {
            return true;
        }
        return super._map.containsKey("resourceType");
    }

    /**
     * Remover for resourceType
     * 
     * @see PlatformResourceInfo.Fields#resourceType
     */
    public void removeResourceType() {
        super._map.remove("resourceType");
    }

    /**
     * Getter for resourceType
     * 
     * @see PlatformResourceInfo.Fields#resourceType
     */
    @Nullable
    public String getResourceType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getResourceType();
            case DEFAULT:
            case NULL:
                if (_resourceTypeField!= null) {
                    return _resourceTypeField;
                } else {
                    Object __rawValue = super._map.get("resourceType");
                    _resourceTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _resourceTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resourceType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformResourceInfo.Fields#resourceType
     */
    @Nonnull
    public String getResourceType() {
        if (_resourceTypeField!= null) {
            return _resourceTypeField;
        } else {
            Object __rawValue = super._map.get("resourceType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("resourceType");
            }
            _resourceTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _resourceTypeField;
        }
    }

    /**
     * Setter for resourceType
     * 
     * @see PlatformResourceInfo.Fields#resourceType
     */
    public PlatformResourceInfo setResourceType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResourceType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resourceType of com.linkedin.platformresource.PlatformResourceInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resourceType", value);
                    _resourceTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResourceType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resourceType", value);
                    _resourceTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resourceType", value);
                    _resourceTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resourceType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformResourceInfo.Fields#resourceType
     */
    public PlatformResourceInfo setResourceType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resourceType of com.linkedin.platformresource.PlatformResourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resourceType", value);
            _resourceTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for primaryKey
     * 
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    public boolean hasPrimaryKey() {
        if (_primaryKeyField!= null) {
            return true;
        }
        return super._map.containsKey("primaryKey");
    }

    /**
     * Remover for primaryKey
     * 
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    public void removePrimaryKey() {
        super._map.remove("primaryKey");
    }

    /**
     * Getter for primaryKey
     * 
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    @Nullable
    public String getPrimaryKey(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPrimaryKey();
            case DEFAULT:
            case NULL:
                if (_primaryKeyField!= null) {
                    return _primaryKeyField;
                } else {
                    Object __rawValue = super._map.get("primaryKey");
                    _primaryKeyField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _primaryKeyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for primaryKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    @Nonnull
    public String getPrimaryKey() {
        if (_primaryKeyField!= null) {
            return _primaryKeyField;
        } else {
            Object __rawValue = super._map.get("primaryKey");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("primaryKey");
            }
            _primaryKeyField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _primaryKeyField;
        }
    }

    /**
     * Setter for primaryKey
     * 
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    public PlatformResourceInfo setPrimaryKey(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrimaryKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field primaryKey of com.linkedin.platformresource.PlatformResourceInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primaryKey", value);
                    _primaryKeyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrimaryKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primaryKey", value);
                    _primaryKeyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "primaryKey", value);
                    _primaryKeyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for primaryKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformResourceInfo.Fields#primaryKey
     */
    public PlatformResourceInfo setPrimaryKey(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field primaryKey of com.linkedin.platformresource.PlatformResourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "primaryKey", value);
            _primaryKeyField = value;
        }
        return this;
    }

    /**
     * Existence checker for secondaryKeys
     * 
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    public boolean hasSecondaryKeys() {
        if (_secondaryKeysField!= null) {
            return true;
        }
        return super._map.containsKey("secondaryKeys");
    }

    /**
     * Remover for secondaryKeys
     * 
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    public void removeSecondaryKeys() {
        super._map.remove("secondaryKeys");
    }

    /**
     * Getter for secondaryKeys
     * 
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    @Nullable
    public StringArray getSecondaryKeys(GetMode mode) {
        return getSecondaryKeys();
    }

    /**
     * Getter for secondaryKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    @Nullable
    public StringArray getSecondaryKeys() {
        if (_secondaryKeysField!= null) {
            return _secondaryKeysField;
        } else {
            Object __rawValue = super._map.get("secondaryKeys");
            _secondaryKeysField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _secondaryKeysField;
        }
    }

    /**
     * Setter for secondaryKeys
     * 
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    public PlatformResourceInfo setSecondaryKeys(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSecondaryKeys(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSecondaryKeys();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "secondaryKeys", value.data());
                    _secondaryKeysField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "secondaryKeys", value.data());
                    _secondaryKeysField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for secondaryKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformResourceInfo.Fields#secondaryKeys
     */
    public PlatformResourceInfo setSecondaryKeys(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field secondaryKeys of com.linkedin.platformresource.PlatformResourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "secondaryKeys", value.data());
            _secondaryKeysField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see PlatformResourceInfo.Fields#value
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
     * @see PlatformResourceInfo.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see PlatformResourceInfo.Fields#value
     */
    @Nullable
    public SerializedValue getValue(GetMode mode) {
        return getValue();
    }

    /**
     * Getter for value
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PlatformResourceInfo.Fields#value
     */
    @Nullable
    public SerializedValue getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            _valueField = ((__rawValue == null)?null:new SerializedValue(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see PlatformResourceInfo.Fields#value
     */
    public PlatformResourceInfo setValue(
        @Nullable
        SerializedValue value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
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
     * @see PlatformResourceInfo.Fields#value
     */
    public PlatformResourceInfo setValue(
        @Nonnull
        SerializedValue value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.platformresource.PlatformResourceInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value.data());
            _valueField = value;
        }
        return this;
    }

    @Override
    public PlatformResourceInfo clone()
        throws CloneNotSupportedException
    {
        PlatformResourceInfo __clone = ((PlatformResourceInfo) super.clone());
        __clone.__changeListener = new PlatformResourceInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PlatformResourceInfo copy()
        throws CloneNotSupportedException
    {
        PlatformResourceInfo __copy = ((PlatformResourceInfo) super.copy());
        __copy._secondaryKeysField = null;
        __copy._valueField = null;
        __copy._resourceTypeField = null;
        __copy._primaryKeyField = null;
        __copy.__changeListener = new PlatformResourceInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PlatformResourceInfo __objectRef;

        private ChangeListener(PlatformResourceInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "secondaryKeys":
                    __objectRef._secondaryKeysField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "resourceType":
                    __objectRef._resourceTypeField = null;
                    break;
                case "primaryKey":
                    __objectRef._primaryKeyField = null;
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
         * The type of the resource. 
         * Intended as a loose specifier of the generic type of the resource.
         * Producer is not forced to conform to a specific set of symbols for
         * resource types.
         * The @PlatformResourceType enumeration offers a paved path for agreed upon
         * common terms, but is not required to be followed.
         * Example values could be: conversation, user, grant, etc.
         * Resource types are indexed for ease of access. 
         * e.g. Get me all platform resources of type user for the platform looker
         * 
         */
        public PathSpec resourceType() {
            return new PathSpec(getPathComponents(), "resourceType");
        }

        /**
         * The primary key for this platform resource.
         * e.g. for a slack member this would be the memberID.
         * primary keys specified here don't need to include any additional specificity for the
         *      dataPlatform
         * The @PlatformResourceKey is supposed to represent that
         * 
         */
        public PathSpec primaryKey() {
            return new PathSpec(getPathComponents(), "primaryKey");
        }

        /**
         * The secondary keys this platform resource can be located by.
         * I.e., for a slack member this would be email or phone.
         * 
         */
        public PathSpec secondaryKeys() {
            return new PathSpec(getPathComponents(), "secondaryKeys");
        }

        /**
         * The secondary keys this platform resource can be located by.
         * I.e., for a slack member this would be email or phone.
         * 
         */
        public PathSpec secondaryKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "secondaryKeys");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The serialized value of this platform resource item.
         * 
         */
        public com.linkedin.common.SerializedValue.Fields value() {
            return new com.linkedin.common.SerializedValue.Fields(getPathComponents(), "value");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.SerializedValue.ProjectionMask _valueMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The type of the resource. 
         * Intended as a loose specifier of the generic type of the resource.
         * Producer is not forced to conform to a specific set of symbols for
         * resource types.
         * The @PlatformResourceType enumeration offers a paved path for agreed upon
         * common terms, but is not required to be followed.
         * Example values could be: conversation, user, grant, etc.
         * Resource types are indexed for ease of access. 
         * e.g. Get me all platform resources of type user for the platform looker
         * 
         */
        public PlatformResourceInfo.ProjectionMask withResourceType() {
            getDataMap().put("resourceType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The primary key for this platform resource.
         * e.g. for a slack member this would be the memberID.
         * primary keys specified here don't need to include any additional specificity for the
         *      dataPlatform
         * The @PlatformResourceKey is supposed to represent that
         * 
         */
        public PlatformResourceInfo.ProjectionMask withPrimaryKey() {
            getDataMap().put("primaryKey", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The secondary keys this platform resource can be located by.
         * I.e., for a slack member this would be email or phone.
         * 
         */
        public PlatformResourceInfo.ProjectionMask withSecondaryKeys() {
            getDataMap().put("secondaryKeys", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The secondary keys this platform resource can be located by.
         * I.e., for a slack member this would be email or phone.
         * 
         */
        public PlatformResourceInfo.ProjectionMask withSecondaryKeys(Integer start, Integer count) {
            getDataMap().put("secondaryKeys", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("secondaryKeys").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("secondaryKeys").put("$count", count);
            }
            return this;
        }

        /**
         * The serialized value of this platform resource item.
         * 
         */
        public PlatformResourceInfo.ProjectionMask withValue(Function<com.linkedin.common.SerializedValue.ProjectionMask, com.linkedin.common.SerializedValue.ProjectionMask> nestedMask) {
            _valueMask = nestedMask.apply(((_valueMask == null)?SerializedValue.createMask():_valueMask));
            getDataMap().put("value", _valueMask.getDataMap());
            return this;
        }

        /**
         * The serialized value of this platform resource item.
         * 
         */
        public PlatformResourceInfo.ProjectionMask withValue() {
            _valueMask = null;
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
