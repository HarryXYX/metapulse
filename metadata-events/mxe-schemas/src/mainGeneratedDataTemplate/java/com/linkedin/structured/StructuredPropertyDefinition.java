
package com.linkedin.structured;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.StringArrayMap;
import com.linkedin.datahub.DataHubSearchConfig;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredPropertyDefinition.pdl.")
public class StructuredPropertyDefinition
    extends RecordTemplate
{

    private final static StructuredPropertyDefinition.Fields _fields = new StructuredPropertyDefinition.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.structured@Aspect.name=\"propertyDefinition\"record StructuredPropertyDefinition{/**The fully qualified name of the property. e.g. io.acryl.datahub.myProperty*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:string/**The display name of the property. This is the name that will be shown in the UI and can be used to look up the property id.*/@Searchable={}displayName:optional string/**The value type of the property. Must be a dataType.\ne.g. To indicate that the property is of type DATE, use urn:li:dataType:datahub.date*/@UrnValidation={\"entityTypes\":[\"dataType\"],\"exist\":true,\"strict\":true}valueType:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**A map that allows for type specialization of the valueType.\ne.g. a valueType of urn:li:dataType:datahub.urn\ncan be specialized to be a USER or GROUP URN by adding a typeQualifier like \n{ \"allowedTypes\": [\"urn:li:entityType:datahub.corpuser\", \"urn:li:entityType:datahub.corpGroup\"] }*/typeQualifier:optional map[string,array[string]]/**A list of allowed values that the property is allowed to take. \nIf this is not specified, then the property can take any value of given type.*/allowedValues:optional array[record PropertyValue{value:/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]/**Optional description of the property value*/description:optional string}]/**The cardinality of the property. If not specified, then the property is assumed to be single valued..*/cardinality:optional enum PropertyCardinality{SINGLE,MULTIPLE}=\"SINGLE\"@Relationship.`/*`={\"entityTypes\":[\"entityType\"],\"name\":\"StructuredPropertyOf\"}@Searchable.`/*`.fieldName=\"entityTypes\"@UrnValidation={\"entityTypes\":[\"entityType\"],\"exist\":true,\"strict\":true}entityTypes:array[com.linkedin.common.Urn]/**The description of the property. This is the description that will be shown in the UI.*/description:optional string/**Search configuration for this property. If not specified, then the property is indexed using the default mapping.\nfrom the logical type.*/searchConfiguration:optional{namespace com.linkedin.datahub/**Configuration for how any given field should be indexed and matched in the DataHub search index.\n*/record DataHubSearchConfig{/**Name of the field in the search index. Defaults to the field name otherwise\n*/fieldName:optional string/**Type of the field. Defines how the field is indexed and matched\n*/fieldType:optional enum SearchFieldType{KEYWORD,TEXT,TEXT_PARTIAL,BROWSE_PATH,URN,URN_PARTIAL,BOOLEAN,COUNT,DATETIME,OBJECT,BROWSE_PATH_V2,WORD_GRAM}/**Whether we should match the field for the default search query\n*/queryByDefault:boolean=false/**Whether we should use the field for default autocomplete\n*/enableAutocomplete:boolean=false/**Whether or not to add field to filters.\n*/addToFilters:boolean=false/**Whether or not to add the \"has values\" to filters.\ncheck if this is conditional on addToFilters being true\n*/addHasValuesToFilters:boolean=true/**Display name of the filter\n*/filterNameOverride:optional string/**Display name of the has values filter\n*/hasValuesFilterNameOverride:optional string/**Boost multiplier to the match score. Matches on fields with higher boost score ranks higher\n*/boostScore:double=1.0/**If set, add a index field of the given name that checks whether the field exists\n*/hasValuesFieldName:optional string/**If set, add a index field of the given name that checks the number of elements\n*/numValuesFieldName:optional string/**(Optional) Weights to apply to score for a given value\n*/weightsPerFieldValue:optional map[string,double]/**(Optional) Aliases for this given field that can be used for sorting etc.\n*/fieldNameAliases:optional array[string]}}/**Whether the structured property value is immutable once applied to an entity.*/@Searchable.fieldType=\"BOOLEAN\"immutable:boolean=false/**Definition version - Allows breaking schema changes. String is compared case-insensitive and new\n                     versions must be monotonically increasing. Cannot use periods/dots.\n                     Suggestions: v1, v2\n                                  20240610, 20240611*/version:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Last Modified Audit stamp*/@Searchable.`/time`={\"fieldName\":\"lastModified\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private String _qualifiedNameField = null;
    private String _displayNameField = null;
    private com.linkedin.common.urn.Urn _valueTypeField = null;
    private StringArrayMap _typeQualifierField = null;
    private PropertyValueArray _allowedValuesField = null;
    private PropertyCardinality _cardinalityField = null;
    private UrnArray _entityTypesField = null;
    private String _descriptionField = null;
    private DataHubSearchConfig _searchConfigurationField = null;
    private Boolean _immutableField = null;
    private String _versionField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private StructuredPropertyDefinition.ChangeListener __changeListener = new StructuredPropertyDefinition.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_QualifiedName = SCHEMA.getField("qualifiedName");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_ValueType = SCHEMA.getField("valueType");
    private final static RecordDataSchema.Field FIELD_TypeQualifier = SCHEMA.getField("typeQualifier");
    private final static RecordDataSchema.Field FIELD_AllowedValues = SCHEMA.getField("allowedValues");
    private final static RecordDataSchema.Field FIELD_Cardinality = SCHEMA.getField("cardinality");
    private final static PropertyCardinality DEFAULT_Cardinality;
    private final static RecordDataSchema.Field FIELD_EntityTypes = SCHEMA.getField("entityTypes");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_SearchConfiguration = SCHEMA.getField("searchConfiguration");
    private final static RecordDataSchema.Field FIELD_Immutable = SCHEMA.getField("immutable");
    private final static Boolean DEFAULT_Immutable;
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_Cardinality = DataTemplateUtil.coerceEnumOutput(FIELD_Cardinality.getDefault(), PropertyCardinality.class, PropertyCardinality.$UNKNOWN);
        DEFAULT_Immutable = DataTemplateUtil.coerceBooleanOutput(FIELD_Immutable.getDefault());
    }

    public StructuredPropertyDefinition() {
        super(new DataMap(), SCHEMA, 8);
        addChangeListener(__changeListener);
    }

    public StructuredPropertyDefinition(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static StructuredPropertyDefinition.Fields fields() {
        return _fields;
    }

    public static StructuredPropertyDefinition.ProjectionMask createMask() {
        return new StructuredPropertyDefinition.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for qualifiedName
     * 
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    public boolean hasQualifiedName() {
        if (_qualifiedNameField!= null) {
            return true;
        }
        return super._map.containsKey("qualifiedName");
    }

    /**
     * Remover for qualifiedName
     * 
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    public void removeQualifiedName() {
        super._map.remove("qualifiedName");
    }

    /**
     * Getter for qualifiedName
     * 
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    @Nullable
    public String getQualifiedName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getQualifiedName();
            case DEFAULT:
            case NULL:
                if (_qualifiedNameField!= null) {
                    return _qualifiedNameField;
                } else {
                    Object __rawValue = super._map.get("qualifiedName");
                    _qualifiedNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _qualifiedNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for qualifiedName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    @Nonnull
    public String getQualifiedName() {
        if (_qualifiedNameField!= null) {
            return _qualifiedNameField;
        } else {
            Object __rawValue = super._map.get("qualifiedName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("qualifiedName");
            }
            _qualifiedNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _qualifiedNameField;
        }
    }

    /**
     * Setter for qualifiedName
     * 
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    public StructuredPropertyDefinition setQualifiedName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQualifiedName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field qualifiedName of com.linkedin.structured.StructuredPropertyDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQualifiedName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
                    _qualifiedNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for qualifiedName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#qualifiedName
     */
    public StructuredPropertyDefinition setQualifiedName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field qualifiedName of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
            _qualifiedNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    public StructuredPropertyDefinition setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#displayName
     */
    public StructuredPropertyDefinition setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for valueType
     * 
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    public boolean hasValueType() {
        if (_valueTypeField!= null) {
            return true;
        }
        return super._map.containsKey("valueType");
    }

    /**
     * Remover for valueType
     * 
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    public void removeValueType() {
        super._map.remove("valueType");
    }

    /**
     * Getter for valueType
     * 
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    @Nullable
    public com.linkedin.common.urn.Urn getValueType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValueType();
            case DEFAULT:
            case NULL:
                if (_valueTypeField!= null) {
                    return _valueTypeField;
                } else {
                    Object __rawValue = super._map.get("valueType");
                    _valueTypeField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _valueTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for valueType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getValueType() {
        if (_valueTypeField!= null) {
            return _valueTypeField;
        } else {
            Object __rawValue = super._map.get("valueType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("valueType");
            }
            _valueTypeField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _valueTypeField;
        }
    }

    /**
     * Setter for valueType
     * 
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    public StructuredPropertyDefinition setValueType(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValueType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field valueType of com.linkedin.structured.StructuredPropertyDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "valueType", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _valueTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValueType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "valueType", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _valueTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "valueType", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _valueTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for valueType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#valueType
     */
    public StructuredPropertyDefinition setValueType(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field valueType of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "valueType", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _valueTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for typeQualifier
     * 
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    public boolean hasTypeQualifier() {
        if (_typeQualifierField!= null) {
            return true;
        }
        return super._map.containsKey("typeQualifier");
    }

    /**
     * Remover for typeQualifier
     * 
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    public void removeTypeQualifier() {
        super._map.remove("typeQualifier");
    }

    /**
     * Getter for typeQualifier
     * 
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    @Nullable
    public StringArrayMap getTypeQualifier(GetMode mode) {
        return getTypeQualifier();
    }

    /**
     * Getter for typeQualifier
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    @Nullable
    public StringArrayMap getTypeQualifier() {
        if (_typeQualifierField!= null) {
            return _typeQualifierField;
        } else {
            Object __rawValue = super._map.get("typeQualifier");
            _typeQualifierField = ((__rawValue == null)?null:new StringArrayMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _typeQualifierField;
        }
    }

    /**
     * Setter for typeQualifier
     * 
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    public StructuredPropertyDefinition setTypeQualifier(
        @Nullable
        StringArrayMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTypeQualifier(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTypeQualifier();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "typeQualifier", value.data());
                    _typeQualifierField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "typeQualifier", value.data());
                    _typeQualifierField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for typeQualifier
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#typeQualifier
     */
    public StructuredPropertyDefinition setTypeQualifier(
        @Nonnull
        StringArrayMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field typeQualifier of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "typeQualifier", value.data());
            _typeQualifierField = value;
        }
        return this;
    }

    /**
     * Existence checker for allowedValues
     * 
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    public boolean hasAllowedValues() {
        if (_allowedValuesField!= null) {
            return true;
        }
        return super._map.containsKey("allowedValues");
    }

    /**
     * Remover for allowedValues
     * 
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    public void removeAllowedValues() {
        super._map.remove("allowedValues");
    }

    /**
     * Getter for allowedValues
     * 
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    @Nullable
    public PropertyValueArray getAllowedValues(GetMode mode) {
        return getAllowedValues();
    }

    /**
     * Getter for allowedValues
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    @Nullable
    public PropertyValueArray getAllowedValues() {
        if (_allowedValuesField!= null) {
            return _allowedValuesField;
        } else {
            Object __rawValue = super._map.get("allowedValues");
            _allowedValuesField = ((__rawValue == null)?null:new PropertyValueArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _allowedValuesField;
        }
    }

    /**
     * Setter for allowedValues
     * 
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    public StructuredPropertyDefinition setAllowedValues(
        @Nullable
        PropertyValueArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAllowedValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAllowedValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allowedValues", value.data());
                    _allowedValuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "allowedValues", value.data());
                    _allowedValuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for allowedValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#allowedValues
     */
    public StructuredPropertyDefinition setAllowedValues(
        @Nonnull
        PropertyValueArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field allowedValues of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "allowedValues", value.data());
            _allowedValuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for cardinality
     * 
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    public boolean hasCardinality() {
        if (_cardinalityField!= null) {
            return true;
        }
        return super._map.containsKey("cardinality");
    }

    /**
     * Remover for cardinality
     * 
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    public void removeCardinality() {
        super._map.remove("cardinality");
    }

    /**
     * Getter for cardinality
     * 
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    @Nullable
    public PropertyCardinality getCardinality(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCardinality();
            case NULL:
                if (_cardinalityField!= null) {
                    return _cardinalityField;
                } else {
                    Object __rawValue = super._map.get("cardinality");
                    _cardinalityField = DataTemplateUtil.coerceEnumOutput(__rawValue, PropertyCardinality.class, PropertyCardinality.$UNKNOWN);
                    return _cardinalityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cardinality
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    @Nullable
    public PropertyCardinality getCardinality() {
        if (_cardinalityField!= null) {
            return _cardinalityField;
        } else {
            Object __rawValue = super._map.get("cardinality");
            if (__rawValue == null) {
                return DEFAULT_Cardinality;
            }
            _cardinalityField = DataTemplateUtil.coerceEnumOutput(__rawValue, PropertyCardinality.class, PropertyCardinality.$UNKNOWN);
            return _cardinalityField;
        }
    }

    /**
     * Setter for cardinality
     * 
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    public StructuredPropertyDefinition setCardinality(
        @Nullable
        PropertyCardinality value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCardinality(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCardinality();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
                    _cardinalityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
                    _cardinalityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cardinality
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#cardinality
     */
    public StructuredPropertyDefinition setCardinality(
        @Nonnull
        PropertyCardinality value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cardinality of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cardinality", value.name());
            _cardinalityField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityTypes
     * 
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    public boolean hasEntityTypes() {
        if (_entityTypesField!= null) {
            return true;
        }
        return super._map.containsKey("entityTypes");
    }

    /**
     * Remover for entityTypes
     * 
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    public void removeEntityTypes() {
        super._map.remove("entityTypes");
    }

    /**
     * Getter for entityTypes
     * 
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    @Nullable
    public UrnArray getEntityTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityTypes();
            case DEFAULT:
            case NULL:
                if (_entityTypesField!= null) {
                    return _entityTypesField;
                } else {
                    Object __rawValue = super._map.get("entityTypes");
                    _entityTypesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entityTypesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityTypes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    @Nonnull
    public UrnArray getEntityTypes() {
        if (_entityTypesField!= null) {
            return _entityTypesField;
        } else {
            Object __rawValue = super._map.get("entityTypes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityTypes");
            }
            _entityTypesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entityTypesField;
        }
    }

    /**
     * Setter for entityTypes
     * 
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    public StructuredPropertyDefinition setEntityTypes(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityTypes of com.linkedin.structured.StructuredPropertyDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#entityTypes
     */
    public StructuredPropertyDefinition setEntityTypes(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityTypes of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
            _entityTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see StructuredPropertyDefinition.Fields#description
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
     * @see StructuredPropertyDefinition.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see StructuredPropertyDefinition.Fields#description
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
     * @see StructuredPropertyDefinition.Fields#description
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
     * @see StructuredPropertyDefinition.Fields#description
     */
    public StructuredPropertyDefinition setDescription(
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
     * @see StructuredPropertyDefinition.Fields#description
     */
    public StructuredPropertyDefinition setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for searchConfiguration
     * 
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    public boolean hasSearchConfiguration() {
        if (_searchConfigurationField!= null) {
            return true;
        }
        return super._map.containsKey("searchConfiguration");
    }

    /**
     * Remover for searchConfiguration
     * 
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    public void removeSearchConfiguration() {
        super._map.remove("searchConfiguration");
    }

    /**
     * Getter for searchConfiguration
     * 
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    @Nullable
    public DataHubSearchConfig getSearchConfiguration(GetMode mode) {
        return getSearchConfiguration();
    }

    /**
     * Getter for searchConfiguration
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    @Nullable
    public DataHubSearchConfig getSearchConfiguration() {
        if (_searchConfigurationField!= null) {
            return _searchConfigurationField;
        } else {
            Object __rawValue = super._map.get("searchConfiguration");
            _searchConfigurationField = ((__rawValue == null)?null:new DataHubSearchConfig(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _searchConfigurationField;
        }
    }

    /**
     * Setter for searchConfiguration
     * 
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    public StructuredPropertyDefinition setSearchConfiguration(
        @Nullable
        DataHubSearchConfig value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSearchConfiguration(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSearchConfiguration();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "searchConfiguration", value.data());
                    _searchConfigurationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "searchConfiguration", value.data());
                    _searchConfigurationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for searchConfiguration
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#searchConfiguration
     */
    public StructuredPropertyDefinition setSearchConfiguration(
        @Nonnull
        DataHubSearchConfig value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field searchConfiguration of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "searchConfiguration", value.data());
            _searchConfigurationField = value;
        }
        return this;
    }

    /**
     * Existence checker for immutable
     * 
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    public boolean hasImmutable() {
        if (_immutableField!= null) {
            return true;
        }
        return super._map.containsKey("immutable");
    }

    /**
     * Remover for immutable
     * 
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    public void removeImmutable() {
        super._map.remove("immutable");
    }

    /**
     * Getter for immutable
     * 
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    @Nullable
    public Boolean isImmutable(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isImmutable();
            case NULL:
                if (_immutableField!= null) {
                    return _immutableField;
                } else {
                    Object __rawValue = super._map.get("immutable");
                    _immutableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _immutableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for immutable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    @Nonnull
    public Boolean isImmutable() {
        if (_immutableField!= null) {
            return _immutableField;
        } else {
            Object __rawValue = super._map.get("immutable");
            if (__rawValue == null) {
                return DEFAULT_Immutable;
            }
            _immutableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _immutableField;
        }
    }

    /**
     * Setter for immutable
     * 
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    public StructuredPropertyDefinition setImmutable(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setImmutable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field immutable of com.linkedin.structured.StructuredPropertyDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "immutable", value);
                    _immutableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeImmutable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "immutable", value);
                    _immutableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "immutable", value);
                    _immutableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for immutable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    public StructuredPropertyDefinition setImmutable(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field immutable of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "immutable", value);
            _immutableField = value;
        }
        return this;
    }

    /**
     * Setter for immutable
     * 
     * @see StructuredPropertyDefinition.Fields#immutable
     */
    public StructuredPropertyDefinition setImmutable(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "immutable", value);
        _immutableField = value;
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see StructuredPropertyDefinition.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see StructuredPropertyDefinition.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see StructuredPropertyDefinition.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see StructuredPropertyDefinition.Fields#version
     */
    @Nullable
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see StructuredPropertyDefinition.Fields#version
     */
    public StructuredPropertyDefinition setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertyDefinition.Fields#version
     */
    public StructuredPropertyDefinition setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see StructuredPropertyDefinition.Fields#created
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
     * @see StructuredPropertyDefinition.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see StructuredPropertyDefinition.Fields#created
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
     * @see StructuredPropertyDefinition.Fields#created
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
     * @see StructuredPropertyDefinition.Fields#created
     */
    public StructuredPropertyDefinition setCreated(
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
     * @see StructuredPropertyDefinition.Fields#created
     */
    public StructuredPropertyDefinition setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see StructuredPropertyDefinition.Fields#lastModified
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
     * @see StructuredPropertyDefinition.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see StructuredPropertyDefinition.Fields#lastModified
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
     * @see StructuredPropertyDefinition.Fields#lastModified
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
     * @see StructuredPropertyDefinition.Fields#lastModified
     */
    public StructuredPropertyDefinition setLastModified(
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
     * @see StructuredPropertyDefinition.Fields#lastModified
     */
    public StructuredPropertyDefinition setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.structured.StructuredPropertyDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public StructuredPropertyDefinition clone()
        throws CloneNotSupportedException
    {
        StructuredPropertyDefinition __clone = ((StructuredPropertyDefinition) super.clone());
        __clone.__changeListener = new StructuredPropertyDefinition.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public StructuredPropertyDefinition copy()
        throws CloneNotSupportedException
    {
        StructuredPropertyDefinition __copy = ((StructuredPropertyDefinition) super.copy());
        __copy._allowedValuesField = null;
        __copy._qualifiedNameField = null;
        __copy._displayNameField = null;
        __copy._createdField = null;
        __copy._descriptionField = null;
        __copy._versionField = null;
        __copy._cardinalityField = null;
        __copy._immutableField = null;
        __copy._valueTypeField = null;
        __copy._entityTypesField = null;
        __copy._lastModifiedField = null;
        __copy._typeQualifierField = null;
        __copy._searchConfigurationField = null;
        __copy.__changeListener = new StructuredPropertyDefinition.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final StructuredPropertyDefinition __objectRef;

        private ChangeListener(StructuredPropertyDefinition reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "allowedValues":
                    __objectRef._allowedValuesField = null;
                    break;
                case "qualifiedName":
                    __objectRef._qualifiedNameField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "cardinality":
                    __objectRef._cardinalityField = null;
                    break;
                case "immutable":
                    __objectRef._immutableField = null;
                    break;
                case "valueType":
                    __objectRef._valueTypeField = null;
                    break;
                case "entityTypes":
                    __objectRef._entityTypesField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "typeQualifier":
                    __objectRef._typeQualifierField = null;
                    break;
                case "searchConfiguration":
                    __objectRef._searchConfigurationField = null;
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
         * The fully qualified name of the property. e.g. io.acryl.datahub.myProperty
         * 
         */
        public PathSpec qualifiedName() {
            return new PathSpec(getPathComponents(), "qualifiedName");
        }

        /**
         * The display name of the property. This is the name that will be shown in the UI and can be used to look up the property id.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * The value type of the property. Must be a dataType.
         * e.g. To indicate that the property is of type DATE, use urn:li:dataType:datahub.date
         * 
         */
        public PathSpec valueType() {
            return new PathSpec(getPathComponents(), "valueType");
        }

        /**
         * A map that allows for type specialization of the valueType.
         * e.g. a valueType of urn:li:dataType:datahub.urn
         * can be specialized to be a USER or GROUP URN by adding a typeQualifier like 
         * { "allowedTypes": ["urn:li:entityType:datahub.corpuser", "urn:li:entityType:datahub.corpGroup"] }
         * 
         */
        public PathSpec typeQualifier() {
            return new PathSpec(getPathComponents(), "typeQualifier");
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public com.linkedin.structured.PropertyValueArray.Fields allowedValues() {
            return new com.linkedin.structured.PropertyValueArray.Fields(getPathComponents(), "allowedValues");
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public PathSpec allowedValues(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "allowedValues");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The cardinality of the property. If not specified, then the property is assumed to be single valued..
         * 
         */
        public PathSpec cardinality() {
            return new PathSpec(getPathComponents(), "cardinality");
        }

        public PathSpec entityTypes() {
            return new PathSpec(getPathComponents(), "entityTypes");
        }

        public PathSpec entityTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entityTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The description of the property. This is the description that will be shown in the UI.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Search configuration for this property. If not specified, then the property is indexed using the default mapping.
         * from the logical type.
         * 
         */
        public com.linkedin.datahub.DataHubSearchConfig.Fields searchConfiguration() {
            return new com.linkedin.datahub.DataHubSearchConfig.Fields(getPathComponents(), "searchConfiguration");
        }

        /**
         * Whether the structured property value is immutable once applied to an entity.
         * 
         */
        public PathSpec immutable() {
            return new PathSpec(getPathComponents(), "immutable");
        }

        /**
         * Definition version - Allows breaking schema changes. String is compared case-insensitive and new
         *                      versions must be monotonically increasing. Cannot use periods/dots.
         *                      Suggestions: v1, v2
         *                                   20240610, 20240611
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * Created Audit stamp
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.PropertyValueArray.ProjectionMask _allowedValuesMask;
        private com.linkedin.datahub.DataHubSearchConfig.ProjectionMask _searchConfigurationMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
        }

        /**
         * The fully qualified name of the property. e.g. io.acryl.datahub.myProperty
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withQualifiedName() {
            getDataMap().put("qualifiedName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The display name of the property. This is the name that will be shown in the UI and can be used to look up the property id.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The value type of the property. Must be a dataType.
         * e.g. To indicate that the property is of type DATE, use urn:li:dataType:datahub.date
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withValueType() {
            getDataMap().put("valueType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A map that allows for type specialization of the valueType.
         * e.g. a valueType of urn:li:dataType:datahub.urn
         * can be specialized to be a USER or GROUP URN by adding a typeQualifier like 
         * { "allowedTypes": ["urn:li:entityType:datahub.corpuser", "urn:li:entityType:datahub.corpGroup"] }
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withTypeQualifier() {
            getDataMap().put("typeQualifier", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withAllowedValues(Function<com.linkedin.structured.PropertyValueArray.ProjectionMask, com.linkedin.structured.PropertyValueArray.ProjectionMask> nestedMask) {
            _allowedValuesMask = nestedMask.apply(((_allowedValuesMask == null)?PropertyValueArray.createMask():_allowedValuesMask));
            getDataMap().put("allowedValues", _allowedValuesMask.getDataMap());
            return this;
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withAllowedValues() {
            _allowedValuesMask = null;
            getDataMap().put("allowedValues", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withAllowedValues(Function<com.linkedin.structured.PropertyValueArray.ProjectionMask, com.linkedin.structured.PropertyValueArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _allowedValuesMask = nestedMask.apply(((_allowedValuesMask == null)?PropertyValueArray.createMask():_allowedValuesMask));
            getDataMap().put("allowedValues", _allowedValuesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("allowedValues").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("allowedValues").put("$count", count);
            }
            return this;
        }

        /**
         * A list of allowed values that the property is allowed to take. 
         * If this is not specified, then the property can take any value of given type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withAllowedValues(Integer start, Integer count) {
            _allowedValuesMask = null;
            getDataMap().put("allowedValues", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("allowedValues").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("allowedValues").put("$count", count);
            }
            return this;
        }

        /**
         * The cardinality of the property. If not specified, then the property is assumed to be single valued..
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withCardinality() {
            getDataMap().put("cardinality", MaskMap.POSITIVE_MASK);
            return this;
        }

        public StructuredPropertyDefinition.ProjectionMask withEntityTypes() {
            getDataMap().put("entityTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        public StructuredPropertyDefinition.ProjectionMask withEntityTypes(Integer start, Integer count) {
            getDataMap().put("entityTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entityTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entityTypes").put("$count", count);
            }
            return this;
        }

        /**
         * The description of the property. This is the description that will be shown in the UI.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Search configuration for this property. If not specified, then the property is indexed using the default mapping.
         * from the logical type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withSearchConfiguration(Function<com.linkedin.datahub.DataHubSearchConfig.ProjectionMask, com.linkedin.datahub.DataHubSearchConfig.ProjectionMask> nestedMask) {
            _searchConfigurationMask = nestedMask.apply(((_searchConfigurationMask == null)?DataHubSearchConfig.createMask():_searchConfigurationMask));
            getDataMap().put("searchConfiguration", _searchConfigurationMask.getDataMap());
            return this;
        }

        /**
         * Search configuration for this property. If not specified, then the property is indexed using the default mapping.
         * from the logical type.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withSearchConfiguration() {
            _searchConfigurationMask = null;
            getDataMap().put("searchConfiguration", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the structured property value is immutable once applied to an entity.
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withImmutable() {
            getDataMap().put("immutable", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Definition version - Allows breaking schema changes. String is compared case-insensitive and new
         *                      versions must be monotonically increasing. Cannot use periods/dots.
         *                      Suggestions: v1, v2
         *                                   20240610, 20240611
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertyDefinition.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
