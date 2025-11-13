
package com.linkedin.glossary;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a GlossaryNode
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/glossary/GlossaryNodeInfo.pdl.")
public class GlossaryNodeInfo
    extends RecordTemplate
{

    private final static GlossaryNodeInfo.Fields _fields = new GlossaryNodeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Display name of the node*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"displayName\",\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Optional id for the GlossaryNode*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _definitionField = null;
    private com.linkedin.common.urn.GlossaryNodeUrn _parentNodeField = null;
    private String _nameField = null;
    private String _idField = null;
    private GlossaryNodeInfo.ChangeListener __changeListener = new GlossaryNodeInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");
    private final static RecordDataSchema.Field FIELD_ParentNode = SCHEMA.getField("parentNode");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryNodeUrn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public GlossaryNodeInfo() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GlossaryNodeInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryNodeInfo.Fields fields() {
        return _fields;
    }

    public static GlossaryNodeInfo.ProjectionMask createMask() {
        return new GlossaryNodeInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see GlossaryNodeInfo.Fields#customProperties
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
     * @see GlossaryNodeInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see GlossaryNodeInfo.Fields#customProperties
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
     * @see GlossaryNodeInfo.Fields#customProperties
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
     * @see GlossaryNodeInfo.Fields#customProperties
     */
    public GlossaryNodeInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.glossary.GlossaryNodeInfo");
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
     * @see GlossaryNodeInfo.Fields#customProperties
     */
    public GlossaryNodeInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.glossary.GlossaryNodeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
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
     * @see GlossaryNodeInfo.Fields#definition
     */
    public void removeDefinition() {
        super._map.remove("definition");
    }

    /**
     * Getter for definition
     * 
     * @see GlossaryNodeInfo.Fields#definition
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
     * @see GlossaryNodeInfo.Fields#definition
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
     * @see GlossaryNodeInfo.Fields#definition
     */
    public GlossaryNodeInfo setDefinition(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDefinition(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field definition of com.linkedin.glossary.GlossaryNodeInfo");
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
     * @see GlossaryNodeInfo.Fields#definition
     */
    public GlossaryNodeInfo setDefinition(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field definition of com.linkedin.glossary.GlossaryNodeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "definition", value);
            _definitionField = value;
        }
        return this;
    }

    /**
     * Existence checker for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
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
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public void removeParentNode() {
        super._map.remove("parentNode");
    }

    /**
     * Getter for parentNode
     * 
     * @see GlossaryNodeInfo.Fields#parentNode
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
     * @see GlossaryNodeInfo.Fields#parentNode
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
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public GlossaryNodeInfo setParentNode(
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
     * @see GlossaryNodeInfo.Fields#parentNode
     */
    public GlossaryNodeInfo setParentNode(
        @Nonnull
        com.linkedin.common.urn.GlossaryNodeUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentNode of com.linkedin.glossary.GlossaryNodeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentNode", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
            _parentNodeField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see GlossaryNodeInfo.Fields#name
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
     * @see GlossaryNodeInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see GlossaryNodeInfo.Fields#name
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
     * @see GlossaryNodeInfo.Fields#name
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
     * @see GlossaryNodeInfo.Fields#name
     */
    public GlossaryNodeInfo setName(
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
     * @see GlossaryNodeInfo.Fields#name
     */
    public GlossaryNodeInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.glossary.GlossaryNodeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for id
     * 
     * @see GlossaryNodeInfo.Fields#id
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
     * @see GlossaryNodeInfo.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see GlossaryNodeInfo.Fields#id
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
     * @see GlossaryNodeInfo.Fields#id
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
     * @see GlossaryNodeInfo.Fields#id
     */
    public GlossaryNodeInfo setId(
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
     * @see GlossaryNodeInfo.Fields#id
     */
    public GlossaryNodeInfo setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.glossary.GlossaryNodeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    @Override
    public GlossaryNodeInfo clone()
        throws CloneNotSupportedException
    {
        GlossaryNodeInfo __clone = ((GlossaryNodeInfo) super.clone());
        __clone.__changeListener = new GlossaryNodeInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryNodeInfo copy()
        throws CloneNotSupportedException
    {
        GlossaryNodeInfo __copy = ((GlossaryNodeInfo) super.copy());
        __copy._customPropertiesField = null;
        __copy._nameField = null;
        __copy._definitionField = null;
        __copy._parentNodeField = null;
        __copy._idField = null;
        __copy.__changeListener = new GlossaryNodeInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryNodeInfo __objectRef;

        private ChangeListener(GlossaryNodeInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "definition":
                    __objectRef._definitionField = null;
                    break;
                case "parentNode":
                    __objectRef._parentNodeField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
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
         * Definition of business node
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
         * Display name of the node
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Optional id for the GlossaryNode
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * Custom property bag.
         * 
         */
        public GlossaryNodeInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Definition of business node
         * 
         */
        public GlossaryNodeInfo.ProjectionMask withDefinition() {
            getDataMap().put("definition", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Parent node of the glossary term
         * 
         */
        public GlossaryNodeInfo.ProjectionMask withParentNode() {
            getDataMap().put("parentNode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the node
         * 
         */
        public GlossaryNodeInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional id for the GlossaryNode
         * 
         */
        public GlossaryNodeInfo.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
