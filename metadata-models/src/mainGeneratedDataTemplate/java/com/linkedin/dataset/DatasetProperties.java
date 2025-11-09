
package com.linkedin.dataset;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.TimeStamp;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a Dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetProperties.pdl.")
public class DatasetProperties
    extends RecordTemplate
{

    private final static DatasetProperties.Fields _fields = new DatasetProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Display name of the Dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Fully-qualified name of the Dataset*/@Searchable={\"addToFilters\":false,\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Documentation of the dataset*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/@deprecated=\"Use ExternalReference.externalUrl field instead.\"uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.\nThis is now deprecated.*/@deprecated=\"Use GlobalTags aspect instead.\"tags:array[string]=[]}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _nameField = null;
    private String _qualifiedNameField = null;
    private String _descriptionField = null;
    private java.net.URI _uriField = null;
    private TimeStamp _createdField = null;
    private TimeStamp _lastModifiedField = null;
    private StringArray _tagsField = null;
    private DatasetProperties.ChangeListener __changeListener = new DatasetProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_QualifiedName = SCHEMA.getField("qualifiedName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Uri = SCHEMA.getField("uri");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");
    private final static StringArray DEFAULT_Tags;

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        Custom.initializeCustomClass(java.net.URI.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_Tags = ((FIELD_Tags.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Tags.getDefault(), DataList.class)));
    }

    public DatasetProperties() {
        super(new DataMap(12, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DatasetProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetProperties.Fields fields() {
        return _fields;
    }

    public static DatasetProperties.ProjectionMask createMask() {
        return new DatasetProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
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
     * @see DatasetProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
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
     * @see DatasetProperties.Fields#customProperties
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
     * @see DatasetProperties.Fields#customProperties
     */
    public DatasetProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.dataset.DatasetProperties");
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
     * @see DatasetProperties.Fields#customProperties
     */
    public DatasetProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
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
     * @see DatasetProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
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
     * @see DatasetProperties.Fields#externalUrl
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
     * @see DatasetProperties.Fields#externalUrl
     */
    public DatasetProperties setExternalUrl(
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
     * @see DatasetProperties.Fields#externalUrl
     */
    public DatasetProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DatasetProperties.Fields#name
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
     * @see DatasetProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DatasetProperties.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        return getName();
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProperties.Fields#name
     */
    @Nullable
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see DatasetProperties.Fields#name
     */
    public DatasetProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see DatasetProperties.Fields#name
     */
    public DatasetProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for qualifiedName
     * 
     * @see DatasetProperties.Fields#qualifiedName
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
     * @see DatasetProperties.Fields#qualifiedName
     */
    public void removeQualifiedName() {
        super._map.remove("qualifiedName");
    }

    /**
     * Getter for qualifiedName
     * 
     * @see DatasetProperties.Fields#qualifiedName
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
     * @see DatasetProperties.Fields#qualifiedName
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
     * @see DatasetProperties.Fields#qualifiedName
     */
    public DatasetProperties setQualifiedName(
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
     * @see DatasetProperties.Fields#qualifiedName
     */
    public DatasetProperties setQualifiedName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field qualifiedName of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "qualifiedName", value);
            _qualifiedNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DatasetProperties.Fields#description
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
     * @see DatasetProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DatasetProperties.Fields#description
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
     * @see DatasetProperties.Fields#description
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
     * @see DatasetProperties.Fields#description
     */
    public DatasetProperties setDescription(
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
     * @see DatasetProperties.Fields#description
     */
    public DatasetProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for uri
     * 
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    public boolean hasUri() {
        if (_uriField!= null) {
            return true;
        }
        return super._map.containsKey("uri");
    }

    /**
     * Remover for uri
     * 
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    public void removeUri() {
        super._map.remove("uri");
    }

    /**
     * Getter for uri
     * 
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    @Nullable
    public java.net.URI getUri(GetMode mode) {
        return getUri();
    }

    /**
     * Getter for uri
     * 
     * @return
     *     Optional field. Always check for null.
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    @Nullable
    public java.net.URI getUri() {
        if (_uriField!= null) {
            return _uriField;
        } else {
            Object __rawValue = super._map.get("uri");
            _uriField = DataTemplateUtil.coerceCustomOutput(__rawValue, java.net.URI.class);
            return _uriField;
        }
    }

    /**
     * Setter for uri
     * 
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    public DatasetProperties setUri(
        @Nullable
        java.net.URI value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUri(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUri();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "uri", DataTemplateUtil.coerceCustomInput(value, java.net.URI.class));
                    _uriField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "uri", DataTemplateUtil.coerceCustomInput(value, java.net.URI.class));
                    _uriField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for uri
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     Use ExternalReference.externalUrl field instead.
     * @see DatasetProperties.Fields#uri
     */
    @Deprecated
    public DatasetProperties setUri(
        @Nonnull
        java.net.URI value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field uri of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "uri", DataTemplateUtil.coerceCustomInput(value, java.net.URI.class));
            _uriField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DatasetProperties.Fields#created
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
     * @see DatasetProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DatasetProperties.Fields#created
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
     * @see DatasetProperties.Fields#created
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
     * @see DatasetProperties.Fields#created
     */
    public DatasetProperties setCreated(
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
     * @see DatasetProperties.Fields#created
     */
    public DatasetProperties setCreated(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DatasetProperties.Fields#lastModified
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
     * @see DatasetProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DatasetProperties.Fields#lastModified
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
     * @see DatasetProperties.Fields#lastModified
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
     * @see DatasetProperties.Fields#lastModified
     */
    public DatasetProperties setLastModified(
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
     * @see DatasetProperties.Fields#lastModified
     */
    public DatasetProperties setLastModified(
        @Nonnull
        TimeStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    public boolean hasTags() {
        if (_tagsField!= null) {
            return true;
        }
        return super._map.containsKey("tags");
    }

    /**
     * Remover for tags
     * 
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    public void removeTags() {
        super._map.remove("tags");
    }

    /**
     * Getter for tags
     * 
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    @Nullable
    public StringArray getTags(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getTags();
            case NULL:
                if (_tagsField!= null) {
                    return _tagsField;
                } else {
                    Object __rawValue = super._map.get("tags");
                    _tagsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _tagsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    @Nonnull
    public StringArray getTags() {
        if (_tagsField!= null) {
            return _tagsField;
        } else {
            Object __rawValue = super._map.get("tags");
            if (__rawValue == null) {
                return DEFAULT_Tags;
            }
            _tagsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _tagsField;
        }
    }

    /**
     * Setter for tags
     * 
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    public DatasetProperties setTags(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTags(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tags of com.linkedin.dataset.DatasetProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTags();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     Use GlobalTags aspect instead.
     * @see DatasetProperties.Fields#tags
     */
    @Deprecated
    public DatasetProperties setTags(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tags of com.linkedin.dataset.DatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
            _tagsField = value;
        }
        return this;
    }

    @Override
    public DatasetProperties clone()
        throws CloneNotSupportedException
    {
        DatasetProperties __clone = ((DatasetProperties) super.clone());
        __clone.__changeListener = new DatasetProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetProperties copy()
        throws CloneNotSupportedException
    {
        DatasetProperties __copy = ((DatasetProperties) super.copy());
        __copy._externalUrlField = null;
        __copy._customPropertiesField = null;
        __copy._qualifiedNameField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._lastModifiedField = null;
        __copy._uriField = null;
        __copy._tagsField = null;
        __copy.__changeListener = new DatasetProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetProperties __objectRef;

        private ChangeListener(DatasetProperties reference) {
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
                case "uri":
                    __objectRef._uriField = null;
                    break;
                case "tags":
                    __objectRef._tagsField = null;
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
         * Display name of the Dataset
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fully-qualified name of the Dataset
         * 
         */
        public PathSpec qualifiedName() {
            return new PathSpec(getPathComponents(), "qualifiedName");
        }

        /**
         * Documentation of the dataset
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).
         * 
         * @deprecated
         *     Use ExternalReference.externalUrl field instead.
         */
        @Deprecated
        public PathSpec uri() {
            return new PathSpec(getPathComponents(), "uri");
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

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
         * This is now deprecated.
         * 
         * @deprecated
         *     Use GlobalTags aspect instead.
         */
        @Deprecated
        public PathSpec tags() {
            return new PathSpec(getPathComponents(), "tags");
        }

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
         * This is now deprecated.
         * 
         * @deprecated
         *     Use GlobalTags aspect instead.
         */
        @Deprecated
        public PathSpec tags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "tags");
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

        private com.linkedin.common.TimeStamp.ProjectionMask _createdMask;
        private com.linkedin.common.TimeStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Custom property bag.
         * 
         */
        public DatasetProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public DatasetProperties.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the Dataset
         * 
         */
        public DatasetProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fully-qualified name of the Dataset
         * 
         */
        public DatasetProperties.ProjectionMask withQualifiedName() {
            getDataMap().put("qualifiedName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the dataset
         * 
         */
        public DatasetProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).
         * 
         * @deprecated
         *     Use ExternalReference.externalUrl field instead.
         */
        @Deprecated
        public DatasetProperties.ProjectionMask withUri() {
            getDataMap().put("uri", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withCreated(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?TimeStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withLastModified(Function<com.linkedin.common.TimeStamp.ProjectionMask, com.linkedin.common.TimeStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?TimeStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)
         * 
         */
        public DatasetProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
         * This is now deprecated.
         * 
         * @deprecated
         *     Use GlobalTags aspect instead.
         */
        @Deprecated
        public DatasetProperties.ProjectionMask withTags() {
            getDataMap().put("tags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
         * This is now deprecated.
         * 
         * @deprecated
         *     Use GlobalTags aspect instead.
         */
        @Deprecated
        public DatasetProperties.ProjectionMask withTags(Integer start, Integer count) {
            getDataMap().put("tags", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("tags").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("tags").put("$count", count);
            }
            return this;
        }

    }

}
