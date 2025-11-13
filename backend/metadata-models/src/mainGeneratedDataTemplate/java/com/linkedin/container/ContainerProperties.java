
package com.linkedin.container;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.FabricType;
import com.linkedin.common.TimeStamp;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.StringMap;


/**
 * Information about a Asset Container as received from a 3rd party source system
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/container/ContainerProperties.pdl.")
public class ContainerProperties
    extends RecordTemplate
{

    private final static ContainerProperties.Fields _fields = new ContainerProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.container/**Information about a Asset Container as received from a 3rd party source system*/@Aspect.name=\"containerProperties\"record ContainerProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Display name of the Asset Container*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fully-qualified name of the Container*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Description of the Asset Container as it exists inside a source system*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Environment for this flow*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _nameField = null;
    private String _qualifiedNameField = null;
    private String _descriptionField = null;
    private FabricType _envField = null;
    private TimeStamp _createdField = null;
    private TimeStamp _lastModifiedField = null;
    private ContainerProperties.ChangeListener __changeListener = new ContainerProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_QualifiedName = SCHEMA.getField("qualifiedName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Env = SCHEMA.getField("env");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public ContainerProperties() {
        super(new DataMap(11, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public ContainerProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ContainerProperties.Fields fields() {
        return _fields;
    }

    public static ContainerProperties.ProjectionMask createMask() {
        return new ContainerProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see ContainerProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see ContainerProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see ContainerProperties.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ContainerProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see ContainerProperties.Fields#customProperties
     */
    public ContainerProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.container.ContainerProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContainerProperties.Fields#customProperties
     */
    public ContainerProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see ContainerProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        if (_externalUrlField!= null) {
            return true;
        }
        return super._map.containsKey("externalUrl");
    }

    /**
     * Remover for externalUrl
     * 
     * @see ContainerProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see ContainerProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see ContainerProperties.Fields#externalUrl
     */
    public ContainerProperties setExternalUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContainerProperties.Fields#externalUrl
     */
    public ContainerProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see ContainerProperties.Fields#name
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
     * @see ContainerProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see ContainerProperties.Fields#name
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
     * @see ContainerProperties.Fields#name
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
     * @see ContainerProperties.Fields#name
     */
    public ContainerProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.container.ContainerProperties");
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
     * @see ContainerProperties.Fields#name
     */
    public ContainerProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for qualifiedName
     * 
     * @see ContainerProperties.Fields#qualifiedName
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
     * @see ContainerProperties.Fields#qualifiedName
     */
    public void removeQualifiedName() {
        super._map.remove("qualifiedName");
    }

    /**
     * Getter for qualifiedName
     * 
     * @see ContainerProperties.Fields#qualifiedName
     */
    @Nullable
    public String getQualifiedName(GetMode mode) {
        return getQualifiedName();
    }

    /**
     * Getter for qualifiedName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerProperties.Fields#qualifiedName
     */
    @Nullable
    public String getQualifiedName() {
        if (_qualifiedNameField!= null) {
            return _qualifiedNameField;
        } else {
            Object __rawValue = super._map.get("qualifiedName");
            _qualifiedNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _qualifiedNameField;
        }
    }

    /**
     * Setter for qualifiedName
     * 
     * @see ContainerProperties.Fields#qualifiedName
     */
    public ContainerProperties setQualifiedName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQualifiedName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see ContainerProperties.Fields#qualifiedName
     */
    public ContainerProperties setQualifiedName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field qualifiedName of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
            _qualifiedNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see ContainerProperties.Fields#description
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
     * @see ContainerProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see ContainerProperties.Fields#description
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
     * @see ContainerProperties.Fields#description
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
     * @see ContainerProperties.Fields#description
     */
    public ContainerProperties setDescription(
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
     * @see ContainerProperties.Fields#description
     */
    public ContainerProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for env
     * 
     * @see ContainerProperties.Fields#env
     */
    public boolean hasEnv() {
        if (_envField!= null) {
            return true;
        }
        return super._map.containsKey("env");
    }

    /**
     * Remover for env
     * 
     * @see ContainerProperties.Fields#env
     */
    public void removeEnv() {
        super._map.remove("env");
    }

    /**
     * Getter for env
     * 
     * @see ContainerProperties.Fields#env
     */
    @Nullable
    public FabricType getEnv(GetMode mode) {
        return getEnv();
    }

    /**
     * Getter for env
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerProperties.Fields#env
     */
    @Nullable
    public FabricType getEnv() {
        if (_envField!= null) {
            return _envField;
        } else {
            Object __rawValue = super._map.get("env");
            _envField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
            return _envField;
        }
    }

    /**
     * Setter for env
     * 
     * @see ContainerProperties.Fields#env
     */
    public ContainerProperties setEnv(
        @Nullable
        FabricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnv(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnv();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for env
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContainerProperties.Fields#env
     */
    public ContainerProperties setEnv(
        @Nonnull
        FabricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field env of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "env", value.name());
            _envField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see ContainerProperties.Fields#created
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
     * @see ContainerProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see ContainerProperties.Fields#created
     */
    @Nullable
    public TimeStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerProperties.Fields#created
     */
    @Nullable
    public TimeStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new TimeStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see ContainerProperties.Fields#created
     */
    public ContainerProperties setCreated(
        @Nullable
        TimeStamp value, SetMode mode) {
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
     * @see ContainerProperties.Fields#created
     */
    public ContainerProperties setCreated(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see ContainerProperties.Fields#lastModified
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
     * @see ContainerProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see ContainerProperties.Fields#lastModified
     */
    @Nullable
    public TimeStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerProperties.Fields#lastModified
     */
    @Nullable
    public TimeStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new TimeStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see ContainerProperties.Fields#lastModified
     */
    public ContainerProperties setLastModified(
        @Nullable
        TimeStamp value, SetMode mode) {
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
     * @see ContainerProperties.Fields#lastModified
     */
    public ContainerProperties setLastModified(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.container.ContainerProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public ContainerProperties clone()
        throws CloneNotSupportedException
    {
        ContainerProperties __clone = ((ContainerProperties) super.clone());
        __clone.__changeListener = new ContainerProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ContainerProperties copy()
        throws CloneNotSupportedException
    {
        ContainerProperties __copy = ((ContainerProperties) super.copy());
        __copy._externalUrlField = null;
        __copy._customPropertiesField = null;
        __copy._qualifiedNameField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._lastModifiedField = null;
        __copy._envField = null;
        __copy.__changeListener = new ContainerProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ContainerProperties __objectRef;

        private ChangeListener(ContainerProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "qualifiedName":
                    __objectRef._qualifiedNameField = null;
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
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "env":
                    __objectRef._envField = null;
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
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Display name of the Asset Container
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fully-qualified name of the Container
         * 
         */
        public PathSpec qualifiedName() {
            return new PathSpec(getPathComponents(), "qualifiedName");
        }

        /**
         * Description of the Asset Container as it exists inside a source system
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Environment for this flow
         * 
         */
        public PathSpec env() {
            return new PathSpec(getPathComponents(), "env");
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.TimeStamp.Fields created() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "created");
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public com.linkedin.common.TimeStamp.Fields lastModified() {
            return new com.linkedin.common.TimeStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.TimeStamp.ProjectionMask _createdMask;
        private com.linkedin.common.TimeStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * Custom property bag.
         * 
         */
        public ContainerProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public ContainerProperties.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the Asset Container
         * 
         */
        public ContainerProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fully-qualified name of the Container
         * 
         */
        public ContainerProperties.ProjectionMask withQualifiedName() {
            getDataMap().put("qualifiedName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the Asset Container as it exists inside a source system
         * 
         */
        public ContainerProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Environment for this flow
         * 
         */
        public ContainerProperties.ProjectionMask withEnv() {
            getDataMap().put("env", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withCreated(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?TimeStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withLastModified(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?TimeStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public ContainerProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
