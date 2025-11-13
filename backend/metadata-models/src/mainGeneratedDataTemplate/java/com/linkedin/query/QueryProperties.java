
package com.linkedin.query;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about a Query against one or more data assets (e.g. Tables or Views).
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/query/QueryProperties.pdl.")
public class QueryProperties
    extends RecordTemplate
{

    private final static QueryProperties.Fields _fields = new QueryProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.query/**Information about a Query against one or more data assets (e.g. Tables or Views).*/@Aspect.name=\"queryProperties\"record QueryProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**The Query Statement.*/statement:/**A query statement against one or more data assets.*/record QueryStatement{/**The query text*/value:string/**The language of the Query, e.g. SQL.*/language:enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}=\"SQL\"}/**The source of the Query*/@Searchable={}source:enum QuerySource{/**The query was entered manually by a user (via the UI).*/MANUAL/**The query was discovered by a crawler.*/SYSTEM}/**Optional display name to identify the query.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:optional string/**The Query description.*/description:optional string/**Audit stamp capturing the time and actor who created the Query.*/@Searchable={\"/actor\":{\"fieldName\":\"createdBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp capturing the time and actor who last modified the Query.*/@Searchable={\"/actor\":{\"fieldName\":\"lastModifiedBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}}lastModified:com.linkedin.common.AuditStamp/**The origin of the Query.\nThis is the source of the Query (e.g. a View, Stored Procedure, dbt Model, etc.) that the Query was created from.*/@Searchable={\"addToFilters\":false,\"fieldType\":\"URN\",\"queryByDefault\":false}origin:optional com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private QueryStatement _statementField = null;
    private QuerySource _sourceField = null;
    private String _nameField = null;
    private String _descriptionField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private com.linkedin.common.urn.Urn _originField = null;
    private QueryProperties.ChangeListener __changeListener = new QueryProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Statement = SCHEMA.getField("statement");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public QueryProperties() {
        super(new DataMap(11, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public QueryProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static QueryProperties.Fields fields() {
        return _fields;
    }

    public static QueryProperties.ProjectionMask createMask() {
        return new QueryProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see QueryProperties.Fields#customProperties
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
     * @see QueryProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see QueryProperties.Fields#customProperties
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
     * @see QueryProperties.Fields#customProperties
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
     * @see QueryProperties.Fields#customProperties
     */
    public QueryProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.query.QueryProperties");
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
     * @see QueryProperties.Fields#customProperties
     */
    public QueryProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for statement
     * 
     * @see QueryProperties.Fields#statement
     */
    public boolean hasStatement() {
        if (_statementField!= null) {
            return true;
        }
        return super._map.containsKey("statement");
    }

    /**
     * Remover for statement
     * 
     * @see QueryProperties.Fields#statement
     */
    public void removeStatement() {
        super._map.remove("statement");
    }

    /**
     * Getter for statement
     * 
     * @see QueryProperties.Fields#statement
     */
    @Nullable
    public QueryStatement getStatement(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatement();
            case DEFAULT:
            case NULL:
                if (_statementField!= null) {
                    return _statementField;
                } else {
                    Object __rawValue = super._map.get("statement");
                    _statementField = ((__rawValue == null)?null:new QueryStatement(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _statementField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for statement
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryProperties.Fields#statement
     */
    @Nonnull
    public QueryStatement getStatement() {
        if (_statementField!= null) {
            return _statementField;
        } else {
            Object __rawValue = super._map.get("statement");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("statement");
            }
            _statementField = ((__rawValue == null)?null:new QueryStatement(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _statementField;
        }
    }

    /**
     * Setter for statement
     * 
     * @see QueryProperties.Fields#statement
     */
    public QueryProperties setStatement(
        @Nullable
        QueryStatement value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatement(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field statement of com.linkedin.query.QueryProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value.data());
                    _statementField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatement();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value.data());
                    _statementField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value.data());
                    _statementField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for statement
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryProperties.Fields#statement
     */
    public QueryProperties setStatement(
        @Nonnull
        QueryStatement value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field statement of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "statement", value.data());
            _statementField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see QueryProperties.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see QueryProperties.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see QueryProperties.Fields#source
     */
    @Nullable
    public QuerySource getSource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSource();
            case DEFAULT:
            case NULL:
                if (_sourceField!= null) {
                    return _sourceField;
                } else {
                    Object __rawValue = super._map.get("source");
                    _sourceField = DataTemplateUtil.coerceEnumOutput(__rawValue, QuerySource.class, QuerySource.$UNKNOWN);
                    return _sourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryProperties.Fields#source
     */
    @Nonnull
    public QuerySource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("source");
            }
            _sourceField = DataTemplateUtil.coerceEnumOutput(__rawValue, QuerySource.class, QuerySource.$UNKNOWN);
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see QueryProperties.Fields#source
     */
    public QueryProperties setSource(
        @Nullable
        QuerySource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field source of com.linkedin.query.QueryProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.name());
                    _sourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.name());
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.name());
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryProperties.Fields#source
     */
    public QueryProperties setSource(
        @Nonnull
        QuerySource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.name());
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see QueryProperties.Fields#name
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
     * @see QueryProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see QueryProperties.Fields#name
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
     * @see QueryProperties.Fields#name
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
     * @see QueryProperties.Fields#name
     */
    public QueryProperties setName(
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
     * @see QueryProperties.Fields#name
     */
    public QueryProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see QueryProperties.Fields#description
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
     * @see QueryProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see QueryProperties.Fields#description
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
     * @see QueryProperties.Fields#description
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
     * @see QueryProperties.Fields#description
     */
    public QueryProperties setDescription(
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
     * @see QueryProperties.Fields#description
     */
    public QueryProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see QueryProperties.Fields#created
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
     * @see QueryProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see QueryProperties.Fields#created
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
     * @see QueryProperties.Fields#created
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
     * @see QueryProperties.Fields#created
     */
    public QueryProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.query.QueryProperties");
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
     * @see QueryProperties.Fields#created
     */
    public QueryProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see QueryProperties.Fields#lastModified
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
     * @see QueryProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see QueryProperties.Fields#lastModified
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
     * @see QueryProperties.Fields#lastModified
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
     * @see QueryProperties.Fields#lastModified
     */
    public QueryProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.query.QueryProperties");
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
     * @see QueryProperties.Fields#lastModified
     */
    public QueryProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see QueryProperties.Fields#origin
     */
    public boolean hasOrigin() {
        if (_originField!= null) {
            return true;
        }
        return super._map.containsKey("origin");
    }

    /**
     * Remover for origin
     * 
     * @see QueryProperties.Fields#origin
     */
    public void removeOrigin() {
        super._map.remove("origin");
    }

    /**
     * Getter for origin
     * 
     * @see QueryProperties.Fields#origin
     */
    @Nullable
    public com.linkedin.common.urn.Urn getOrigin(GetMode mode) {
        return getOrigin();
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QueryProperties.Fields#origin
     */
    @Nullable
    public com.linkedin.common.urn.Urn getOrigin() {
        if (_originField!= null) {
            return _originField;
        } else {
            Object __rawValue = super._map.get("origin");
            _originField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _originField;
        }
    }

    /**
     * Setter for origin
     * 
     * @see QueryProperties.Fields#origin
     */
    public QueryProperties setOrigin(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrigin(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOrigin();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "origin", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _originField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "origin", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _originField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryProperties.Fields#origin
     */
    public QueryProperties setOrigin(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field origin of com.linkedin.query.QueryProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "origin", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _originField = value;
        }
        return this;
    }

    @Override
    public QueryProperties clone()
        throws CloneNotSupportedException
    {
        QueryProperties __clone = ((QueryProperties) super.clone());
        __clone.__changeListener = new QueryProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public QueryProperties copy()
        throws CloneNotSupportedException
    {
        QueryProperties __copy = ((QueryProperties) super.copy());
        __copy._customPropertiesField = null;
        __copy._createdField = null;
        __copy._originField = null;
        __copy._statementField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._sourceField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new QueryProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final QueryProperties __objectRef;

        private ChangeListener(QueryProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "origin":
                    __objectRef._originField = null;
                    break;
                case "statement":
                    __objectRef._statementField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * The Query Statement.
         * 
         */
        public com.linkedin.query.QueryStatement.Fields statement() {
            return new com.linkedin.query.QueryStatement.Fields(getPathComponents(), "statement");
        }

        /**
         * The source of the Query
         * 
         */
        public PathSpec source() {
            return new PathSpec(getPathComponents(), "source");
        }

        /**
         * Optional display name to identify the query.
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The Query description.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Audit stamp capturing the time and actor who created the Query.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Query.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * The origin of the Query.
         * This is the source of the Query (e.g. a View, Stored Procedure, dbt Model, etc.) that the Query was created from.
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.query.QueryStatement.ProjectionMask _statementMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * Custom property bag.
         * 
         */
        public QueryProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The Query Statement.
         * 
         */
        public QueryProperties.ProjectionMask withStatement(Function<com.linkedin.query.QueryStatement.ProjectionMask, com.linkedin.query.QueryStatement.ProjectionMask> nestedMask) {
            _statementMask = nestedMask.apply(((_statementMask == null)?QueryStatement.createMask():_statementMask));
            getDataMap().put("statement", _statementMask.getDataMap());
            return this;
        }

        /**
         * The Query Statement.
         * 
         */
        public QueryProperties.ProjectionMask withStatement() {
            _statementMask = null;
            getDataMap().put("statement", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The source of the Query
         * 
         */
        public QueryProperties.ProjectionMask withSource() {
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional display name to identify the query.
         * 
         */
        public QueryProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The Query description.
         * 
         */
        public QueryProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Query.
         * 
         */
        public QueryProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Query.
         * 
         */
        public QueryProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who created the Query.
         * 
         */
        public QueryProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Query.
         * 
         */
        public QueryProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Query.
         * 
         */
        public QueryProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp capturing the time and actor who last modified the Query.
         * 
         */
        public QueryProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The origin of the Query.
         * This is the source of the Query (e.g. a View, Stored Procedure, dbt Model, etc.) that the Query was created from.
         * 
         */
        public QueryProperties.ProjectionMask withOrigin() {
            getDataMap().put("origin", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
