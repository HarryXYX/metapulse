
package com.linkedin.module;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The main properties of a DataHub page module
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/DataHubPageModuleProperties.pdl.")
public class DataHubPageModuleProperties
    extends RecordTemplate
{

    private final static DataHubPageModuleProperties.Fields _fields = new DataHubPageModuleProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**The main properties of a DataHub page module*/@Aspect.name=\"dataHubPageModuleProperties\"record DataHubPageModuleProperties{/**The display name of this module*/name:string/**The type of this module - the purpose it serves*/@Searchable.fieldType=\"KEYWORD\"type:/**Enum containing the types of page modules that there are*/enum DataHubPageModuleType{/**Link type module*/LINK/**Module containing rich text to be rendered*/RICH_TEXT/**A module with a collection of assets*/ASSET_COLLECTION/**A module displaying a hierarchy to navigate*/HIERARCHY/**Module displaying assets owned by a user*/OWNED_ASSETS/**Module displaying the top domains*/DOMAINS/**Module displaying the assets of parent entity*/ASSETS/**Module displaying the hierarchy of the children of a given entity. Glossary or Domains.*/CHILD_HIERARCHY/**Module displaying child data products of a given domain*/DATA_PRODUCTS/**Module displaying the related terms of a given glossary term*/RELATED_TERMS/**Module displaying the platforms in an instance*/PLATFORMS}/**Info about the visibility of this module*/visibility:/**Info about the visibility of this module*/record DataHubPageModuleVisibility{/**Audit stamp for when and by whom this module was created*/@Searchable.fieldType=\"KEYWORD\"scope:enum PageModuleScope{/**This module is used for individual use only*/PERSONAL/**This module is discoverable and can be used by any user on the platform*/GLOBAL}}/**The specific parameters stored for this module*/params:/**The specific parameters stored for a module*/record DataHubPageModuleParams{/**The params required if the module is type LINK*/linkParams:optional record LinkModuleParams{linkUrl:string,imageUrl:optional string,description:optional string}/**The params required if the module is type RICH_TEXT*/richTextParams:optional record RichTextModuleParams{content:string}/**The params required if the module is type ASSET_COLLECTION*/assetCollectionParams:optional/**The params required if the module is type ASSET_COLLECTION*/record AssetCollectionModuleParams{assetUrns:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Optional dynamic filters\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/dynamicFilterJson:optional string}/**The params required if the module is type HIERARCHY_VIEW*/hierarchyViewParams:optional/**The params required if the module is type HIERARCHY_VIEW*/record HierarchyModuleParams{assetUrns:optional array[com.linkedin.common.Urn]showRelatedEntities:boolean/**Optional filters to filter relatedEntities (assetUrns) out\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/relatedEntitiesFilterJson:optional string}}/**Audit stamp for when and by whom this template was created*/@Searchable={\"/actor\":{\"fieldName\":\"createdBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp for when and by whom this template was last updated*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}lastModified:com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private String _nameField = null;
    private DataHubPageModuleType _typeField = null;
    private DataHubPageModuleVisibility _visibilityField = null;
    private DataHubPageModuleParams _paramsField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private DataHubPageModuleProperties.ChangeListener __changeListener = new DataHubPageModuleProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Visibility = SCHEMA.getField("visibility");
    private final static RecordDataSchema.Field FIELD_Params = SCHEMA.getField("params");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    public DataHubPageModuleProperties() {
        super(new DataMap(8, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DataHubPageModuleProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageModuleProperties.Fields fields() {
        return _fields;
    }

    public static DataHubPageModuleProperties.ProjectionMask createMask() {
        return new DataHubPageModuleProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubPageModuleProperties.Fields#name
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
     * @see DataHubPageModuleProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubPageModuleProperties.Fields#name
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
     * @see DataHubPageModuleProperties.Fields#name
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
     * @see DataHubPageModuleProperties.Fields#name
     */
    public DataHubPageModuleProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.module.DataHubPageModuleProperties");
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
     * @see DataHubPageModuleProperties.Fields#name
     */
    public DataHubPageModuleProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubPageModuleProperties.Fields#type
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
     * @see DataHubPageModuleProperties.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubPageModuleProperties.Fields#type
     */
    @Nullable
    public DataHubPageModuleType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubPageModuleType.class, DataHubPageModuleType.$UNKNOWN);
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
     * @see DataHubPageModuleProperties.Fields#type
     */
    @Nonnull
    public DataHubPageModuleType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubPageModuleType.class, DataHubPageModuleType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubPageModuleProperties.Fields#type
     */
    public DataHubPageModuleProperties setType(
        @Nullable
        DataHubPageModuleType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.module.DataHubPageModuleProperties");
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
     * @see DataHubPageModuleProperties.Fields#type
     */
    public DataHubPageModuleProperties setType(
        @Nonnull
        DataHubPageModuleType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for visibility
     * 
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    public boolean hasVisibility() {
        if (_visibilityField!= null) {
            return true;
        }
        return super._map.containsKey("visibility");
    }

    /**
     * Remover for visibility
     * 
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    public void removeVisibility() {
        super._map.remove("visibility");
    }

    /**
     * Getter for visibility
     * 
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    @Nullable
    public DataHubPageModuleVisibility getVisibility(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVisibility();
            case DEFAULT:
            case NULL:
                if (_visibilityField!= null) {
                    return _visibilityField;
                } else {
                    Object __rawValue = super._map.get("visibility");
                    _visibilityField = ((__rawValue == null)?null:new DataHubPageModuleVisibility(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _visibilityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for visibility
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    @Nonnull
    public DataHubPageModuleVisibility getVisibility() {
        if (_visibilityField!= null) {
            return _visibilityField;
        } else {
            Object __rawValue = super._map.get("visibility");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("visibility");
            }
            _visibilityField = ((__rawValue == null)?null:new DataHubPageModuleVisibility(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _visibilityField;
        }
    }

    /**
     * Setter for visibility
     * 
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    public DataHubPageModuleProperties setVisibility(
        @Nullable
        DataHubPageModuleVisibility value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVisibility(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field visibility of com.linkedin.module.DataHubPageModuleProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "visibility", value.data());
                    _visibilityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVisibility();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "visibility", value.data());
                    _visibilityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "visibility", value.data());
                    _visibilityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for visibility
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleProperties.Fields#visibility
     */
    public DataHubPageModuleProperties setVisibility(
        @Nonnull
        DataHubPageModuleVisibility value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field visibility of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "visibility", value.data());
            _visibilityField = value;
        }
        return this;
    }

    /**
     * Existence checker for params
     * 
     * @see DataHubPageModuleProperties.Fields#params
     */
    public boolean hasParams() {
        if (_paramsField!= null) {
            return true;
        }
        return super._map.containsKey("params");
    }

    /**
     * Remover for params
     * 
     * @see DataHubPageModuleProperties.Fields#params
     */
    public void removeParams() {
        super._map.remove("params");
    }

    /**
     * Getter for params
     * 
     * @see DataHubPageModuleProperties.Fields#params
     */
    @Nullable
    public DataHubPageModuleParams getParams(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getParams();
            case DEFAULT:
            case NULL:
                if (_paramsField!= null) {
                    return _paramsField;
                } else {
                    Object __rawValue = super._map.get("params");
                    _paramsField = ((__rawValue == null)?null:new DataHubPageModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _paramsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for params
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageModuleProperties.Fields#params
     */
    @Nonnull
    public DataHubPageModuleParams getParams() {
        if (_paramsField!= null) {
            return _paramsField;
        } else {
            Object __rawValue = super._map.get("params");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("params");
            }
            _paramsField = ((__rawValue == null)?null:new DataHubPageModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _paramsField;
        }
    }

    /**
     * Setter for params
     * 
     * @see DataHubPageModuleProperties.Fields#params
     */
    public DataHubPageModuleProperties setParams(
        @Nullable
        DataHubPageModuleParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field params of com.linkedin.module.DataHubPageModuleProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for params
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleProperties.Fields#params
     */
    public DataHubPageModuleProperties setParams(
        @Nonnull
        DataHubPageModuleParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field params of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "params", value.data());
            _paramsField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataHubPageModuleProperties.Fields#created
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
     * @see DataHubPageModuleProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataHubPageModuleProperties.Fields#created
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
     * @see DataHubPageModuleProperties.Fields#created
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
     * @see DataHubPageModuleProperties.Fields#created
     */
    public DataHubPageModuleProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.module.DataHubPageModuleProperties");
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
     * @see DataHubPageModuleProperties.Fields#created
     */
    public DataHubPageModuleProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DataHubPageModuleProperties.Fields#lastModified
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
     * @see DataHubPageModuleProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DataHubPageModuleProperties.Fields#lastModified
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
     * @see DataHubPageModuleProperties.Fields#lastModified
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
     * @see DataHubPageModuleProperties.Fields#lastModified
     */
    public DataHubPageModuleProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.module.DataHubPageModuleProperties");
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
     * @see DataHubPageModuleProperties.Fields#lastModified
     */
    public DataHubPageModuleProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.module.DataHubPageModuleProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public DataHubPageModuleProperties clone()
        throws CloneNotSupportedException
    {
        DataHubPageModuleProperties __clone = ((DataHubPageModuleProperties) super.clone());
        __clone.__changeListener = new DataHubPageModuleProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageModuleProperties copy()
        throws CloneNotSupportedException
    {
        DataHubPageModuleProperties __copy = ((DataHubPageModuleProperties) super.copy());
        __copy._visibilityField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._lastModifiedField = null;
        __copy._typeField = null;
        __copy._paramsField = null;
        __copy.__changeListener = new DataHubPageModuleProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageModuleProperties __objectRef;

        private ChangeListener(DataHubPageModuleProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "visibility":
                    __objectRef._visibilityField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "params":
                    __objectRef._paramsField = null;
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
         * The display name of this module
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The type of this module - the purpose it serves
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Info about the visibility of this module
         * 
         */
        public com.linkedin.module.DataHubPageModuleVisibility.Fields visibility() {
            return new com.linkedin.module.DataHubPageModuleVisibility.Fields(getPathComponents(), "visibility");
        }

        /**
         * The specific parameters stored for this module
         * 
         */
        public com.linkedin.module.DataHubPageModuleParams.Fields params() {
            return new com.linkedin.module.DataHubPageModuleParams.Fields(getPathComponents(), "params");
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.module.DataHubPageModuleVisibility.ProjectionMask _visibilityMask;
        private com.linkedin.module.DataHubPageModuleParams.ProjectionMask _paramsMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The display name of this module
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of this module - the purpose it serves
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Info about the visibility of this module
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withVisibility(Function<com.linkedin.module.DataHubPageModuleVisibility.ProjectionMask, com.linkedin.module.DataHubPageModuleVisibility.ProjectionMask> nestedMask) {
            _visibilityMask = nestedMask.apply(((_visibilityMask == null)?DataHubPageModuleVisibility.createMask():_visibilityMask));
            getDataMap().put("visibility", _visibilityMask.getDataMap());
            return this;
        }

        /**
         * Info about the visibility of this module
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withVisibility() {
            _visibilityMask = null;
            getDataMap().put("visibility", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The specific parameters stored for this module
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withParams(Function<com.linkedin.module.DataHubPageModuleParams.ProjectionMask, com.linkedin.module.DataHubPageModuleParams.ProjectionMask> nestedMask) {
            _paramsMask = nestedMask.apply(((_paramsMask == null)?DataHubPageModuleParams.createMask():_paramsMask));
            getDataMap().put("params", _paramsMask.getDataMap());
            return this;
        }

        /**
         * The specific parameters stored for this module
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withParams() {
            _paramsMask = null;
            getDataMap().put("params", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageModuleProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
