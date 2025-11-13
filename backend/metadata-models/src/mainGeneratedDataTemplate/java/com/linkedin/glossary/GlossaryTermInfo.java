
package com.linkedin.glossary;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Properties associated with a GlossaryTerm
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/glossary/GlossaryTermInfo.pdl.")
public class GlossaryTermInfo
    extends RecordTemplate
{

    private final static GlossaryTermInfo.Fields _fields = new GlossaryTermInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _idField = null;
    private String _nameField = null;
    private String _definitionField = null;
    private com.linkedin.common.urn.GlossaryNodeUrn _parentNodeField = null;
    private String _termSourceField = null;
    private String _sourceRefField = null;
    private com.linkedin.common.url.Url _sourceUrlField = null;
    private String _rawSchemaField = null;
    private GlossaryTermInfo.ChangeListener __changeListener = new GlossaryTermInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");
    private final static RecordDataSchema.Field FIELD_ParentNode = SCHEMA.getField("parentNode");
    private final static RecordDataSchema.Field FIELD_TermSource = SCHEMA.getField("termSource");
    private final static RecordDataSchema.Field FIELD_SourceRef = SCHEMA.getField("sourceRef");
    private final static RecordDataSchema.Field FIELD_SourceUrl = SCHEMA.getField("sourceUrl");
    private final static RecordDataSchema.Field FIELD_RawSchema = SCHEMA.getField("rawSchema");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryNodeUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public GlossaryTermInfo() {
        super(new DataMap(12, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GlossaryTermInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryTermInfo.Fields fields() {
        return _fields;
    }

    public static GlossaryTermInfo.ProjectionMask createMask() {
        return new GlossaryTermInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
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
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see GlossaryTermInfo.Fields#customProperties
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
     * @see GlossaryTermInfo.Fields#customProperties
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
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public GlossaryTermInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.glossary.GlossaryTermInfo");
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
     * @see GlossaryTermInfo.Fields#customProperties
     */
    public GlossaryTermInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for id
     * 
     * @see GlossaryTermInfo.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see GlossaryTermInfo.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see GlossaryTermInfo.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        return getId();
    }

    /**
     * Getter for id
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#id
     */
    @Nullable
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see GlossaryTermInfo.Fields#id
     */
    public GlossaryTermInfo setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#id
     */
    public GlossaryTermInfo setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see GlossaryTermInfo.Fields#name
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
     * @see GlossaryTermInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see GlossaryTermInfo.Fields#name
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
     * @see GlossaryTermInfo.Fields#name
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
     * @see GlossaryTermInfo.Fields#name
     */
    public GlossaryTermInfo setName(
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
     * @see GlossaryTermInfo.Fields#name
     */
    public GlossaryTermInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public boolean hasDefinition() {
        if (_definitionField!= null) {
            return true;
        }
        return super._map.containsKey("definition");
    }

    /**
     * Remover for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public void removeDefinition() {
        super._map.remove("definition");
    }

    /**
     * Getter for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    @Nullable
    public String getDefinition(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDefinition();
            case DEFAULT:
            case NULL:
                if (_definitionField!= null) {
                    return _definitionField;
                } else {
                    Object __rawValue = super._map.get("definition");
                    _definitionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _definitionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for definition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfo.Fields#definition
     */
    @Nonnull
    public String getDefinition() {
        if (_definitionField!= null) {
            return _definitionField;
        } else {
            Object __rawValue = super._map.get("definition");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("definition");
            }
            _definitionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _definitionField;
        }
    }

    /**
     * Setter for definition
     * 
     * @see GlossaryTermInfo.Fields#definition
     */
    public GlossaryTermInfo setDefinition(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDefinition(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field definition of com.linkedin.glossary.GlossaryTermInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value);
                    _definitionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDefinition();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value);
                    _definitionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value);
                    _definitionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for definition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#definition
     */
    public GlossaryTermInfo setDefinition(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field definition of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "definition", value);
            _definitionField = value;
        }
        return this;
    }

    /**
     * Existence checker for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public boolean hasParentNode() {
        if (_parentNodeField!= null) {
            return true;
        }
        return super._map.containsKey("parentNode");
    }

    /**
     * Remover for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public void removeParentNode() {
        super._map.remove("parentNode");
    }

    /**
     * Getter for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode(GetMode mode) {
        return getParentNode();
    }

    /**
     * Getter for parentNode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#parentNode
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryNodeUrn getParentNode() {
        if (_parentNodeField!= null) {
            return _parentNodeField;
        } else {
            Object __rawValue = super._map.get("parentNode");
            _parentNodeField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.GlossaryNodeUrn.class);
            return _parentNodeField;
        }
    }

    /**
     * Setter for parentNode
     * 
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public GlossaryTermInfo setParentNode(
        @Nullable
        com.linkedin.common.urn.GlossaryNodeUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParentNode(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParentNode();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentNode", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
                    _parentNodeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parentNode", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
                    _parentNodeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parentNode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#parentNode
     */
    public GlossaryTermInfo setParentNode(
        @Nonnull
        com.linkedin.common.urn.GlossaryNodeUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentNode of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentNode", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
            _parentNodeField = value;
        }
        return this;
    }

    /**
     * Existence checker for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public boolean hasTermSource() {
        if (_termSourceField!= null) {
            return true;
        }
        return super._map.containsKey("termSource");
    }

    /**
     * Remover for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public void removeTermSource() {
        super._map.remove("termSource");
    }

    /**
     * Getter for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    @Nullable
    public String getTermSource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTermSource();
            case DEFAULT:
            case NULL:
                if (_termSourceField!= null) {
                    return _termSourceField;
                } else {
                    Object __rawValue = super._map.get("termSource");
                    _termSourceField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _termSourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for termSource
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermInfo.Fields#termSource
     */
    @Nonnull
    public String getTermSource() {
        if (_termSourceField!= null) {
            return _termSourceField;
        } else {
            Object __rawValue = super._map.get("termSource");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("termSource");
            }
            _termSourceField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _termSourceField;
        }
    }

    /**
     * Setter for termSource
     * 
     * @see GlossaryTermInfo.Fields#termSource
     */
    public GlossaryTermInfo setTermSource(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTermSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field termSource of com.linkedin.glossary.GlossaryTermInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "termSource", value);
                    _termSourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTermSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "termSource", value);
                    _termSourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "termSource", value);
                    _termSourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for termSource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#termSource
     */
    public GlossaryTermInfo setTermSource(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field termSource of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "termSource", value);
            _termSourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public boolean hasSourceRef() {
        if (_sourceRefField!= null) {
            return true;
        }
        return super._map.containsKey("sourceRef");
    }

    /**
     * Remover for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public void removeSourceRef() {
        super._map.remove("sourceRef");
    }

    /**
     * Getter for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    @Nullable
    public String getSourceRef(GetMode mode) {
        return getSourceRef();
    }

    /**
     * Getter for sourceRef
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    @Nullable
    public String getSourceRef() {
        if (_sourceRefField!= null) {
            return _sourceRefField;
        } else {
            Object __rawValue = super._map.get("sourceRef");
            _sourceRefField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _sourceRefField;
        }
    }

    /**
     * Setter for sourceRef
     * 
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public GlossaryTermInfo setSourceRef(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceRef(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceRef();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceRef", value);
                    _sourceRefField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceRef", value);
                    _sourceRefField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceRef
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#sourceRef
     */
    public GlossaryTermInfo setSourceRef(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceRef of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceRef", value);
            _sourceRefField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public boolean hasSourceUrl() {
        if (_sourceUrlField!= null) {
            return true;
        }
        return super._map.containsKey("sourceUrl");
    }

    /**
     * Remover for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public void removeSourceUrl() {
        super._map.remove("sourceUrl");
    }

    /**
     * Getter for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getSourceUrl(GetMode mode) {
        return getSourceUrl();
    }

    /**
     * Getter for sourceUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getSourceUrl() {
        if (_sourceUrlField!= null) {
            return _sourceUrlField;
        } else {
            Object __rawValue = super._map.get("sourceUrl");
            _sourceUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _sourceUrlField;
        }
    }

    /**
     * Setter for sourceUrl
     * 
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public GlossaryTermInfo setSourceUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _sourceUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _sourceUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#sourceUrl
     */
    public GlossaryTermInfo setSourceUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceUrl of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _sourceUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    public boolean hasRawSchema() {
        if (_rawSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("rawSchema");
    }

    /**
     * Remover for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    public void removeRawSchema() {
        super._map.remove("rawSchema");
    }

    /**
     * Getter for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    @Nullable
    public String getRawSchema(GetMode mode) {
        return getRawSchema();
    }

    /**
     * Getter for rawSchema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    @Nullable
    public String getRawSchema() {
        if (_rawSchemaField!= null) {
            return _rawSchemaField;
        } else {
            Object __rawValue = super._map.get("rawSchema");
            _rawSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _rawSchemaField;
        }
    }

    /**
     * Setter for rawSchema
     * 
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    public GlossaryTermInfo setRawSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRawSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
                    _rawSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
                    _rawSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rawSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermInfo.Fields#rawSchema
     */
    @Deprecated
    public GlossaryTermInfo setRawSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawSchema of com.linkedin.glossary.GlossaryTermInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
            _rawSchemaField = value;
        }
        return this;
    }

    @Override
    public GlossaryTermInfo clone()
        throws CloneNotSupportedException
    {
        GlossaryTermInfo __clone = ((GlossaryTermInfo) super.clone());
        __clone.__changeListener = new GlossaryTermInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryTermInfo copy()
        throws CloneNotSupportedException
    {
        GlossaryTermInfo __copy = ((GlossaryTermInfo) super.copy());
        __copy._sourceUrlField = null;
        __copy._customPropertiesField = null;
        __copy._nameField = null;
        __copy._definitionField = null;
        __copy._idField = null;
        __copy._parentNodeField = null;
        __copy._sourceRefField = null;
        __copy._termSourceField = null;
        __copy._rawSchemaField = null;
        __copy.__changeListener = new GlossaryTermInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryTermInfo __objectRef;

        private ChangeListener(GlossaryTermInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceUrl":
                    __objectRef._sourceUrlField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "definition":
                    __objectRef._definitionField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
                    break;
                case "parentNode":
                    __objectRef._parentNodeField = null;
                    break;
                case "sourceRef":
                    __objectRef._sourceRefField = null;
                    break;
                case "termSource":
                    __objectRef._termSourceField = null;
                    break;
                case "rawSchema":
                    __objectRef._rawSchemaField = null;
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
         * Optional id for the term
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * Display name of the term
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Definition of business term.
         * 
         */
        public PathSpec definition() {
            return new PathSpec(getPathComponents(), "definition");
        }

        /**
         * Parent node of the glossary term
         * 
         */
        public PathSpec parentNode() {
            return new PathSpec(getPathComponents(), "parentNode");
        }

        /**
         * Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL
         * 
         */
        public PathSpec termSource() {
            return new PathSpec(getPathComponents(), "termSource");
        }

        /**
         * External Reference to the business-term
         * 
         */
        public PathSpec sourceRef() {
            return new PathSpec(getPathComponents(), "sourceRef");
        }

        /**
         * The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.
         * 
         */
        public PathSpec sourceUrl() {
            return new PathSpec(getPathComponents(), "sourceUrl");
        }

        /**
         * Schema definition of the glossary term
         * 
         */
        @Deprecated
        public PathSpec rawSchema() {
            return new PathSpec(getPathComponents(), "rawSchema");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(12);
        }

        /**
         * Custom property bag.
         * 
         */
        public GlossaryTermInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional id for the term
         * 
         */
        public GlossaryTermInfo.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the term
         * 
         */
        public GlossaryTermInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Definition of business term.
         * 
         */
        public GlossaryTermInfo.ProjectionMask withDefinition() {
            getDataMap().put("definition", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Parent node of the glossary term
         * 
         */
        public GlossaryTermInfo.ProjectionMask withParentNode() {
            getDataMap().put("parentNode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL
         * 
         */
        public GlossaryTermInfo.ProjectionMask withTermSource() {
            getDataMap().put("termSource", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * External Reference to the business-term
         * 
         */
        public GlossaryTermInfo.ProjectionMask withSourceRef() {
            getDataMap().put("sourceRef", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.
         * 
         */
        public GlossaryTermInfo.ProjectionMask withSourceUrl() {
            getDataMap().put("sourceUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Schema definition of the glossary term
         * 
         */
        @Deprecated
        public GlossaryTermInfo.ProjectionMask withRawSchema() {
            getDataMap().put("rawSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
