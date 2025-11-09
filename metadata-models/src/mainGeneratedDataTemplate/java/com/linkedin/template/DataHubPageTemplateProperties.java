
package com.linkedin.template;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * The main properties of a DataHub page template
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/DataHubPageTemplateProperties.pdl.")
public class DataHubPageTemplateProperties
    extends RecordTemplate
{

    private final static DataHubPageTemplateProperties.Fields _fields = new DataHubPageTemplateProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**The main properties of a DataHub page template*/@Aspect.name=\"dataHubPageTemplateProperties\"record DataHubPageTemplateProperties{/**The rows of modules contained in this template*/@Relationship.`/*/modules/*`={\"entityTypes\":[\"dataHubPageModule\"],\"name\":\"ContainedIn\"}rows:array[/**A row of modules contained in a template*/record DataHubPageTemplateRow{/**The modules that exist in this template row*/modules:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}]/**The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY*/assetSummary:optional/**The page template info for asset summaries*/record DataHubPageTemplateAssetSummary{/**The optional list of properties shown on an asset summary page header.*/summaryElements:optional array[/**Info for a given asset summary element*/record SummaryElement{/**The type of element/property*/elementType:enum SummaryElementType{CREATED,TAGS,GLOSSARY_TERMS,OWNERS,DOMAIN,STRUCTURED_PROPERTY}/**The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY*/@Relationship={\"entityTypes\":[\"structuredProperty\"],\"name\":\"ContainsStructuredProperty\"}structuredPropertyUrn:optional com.linkedin.common.Urn}]}/**Info about the surface area of the product that this template is deployed in*/surface:/**Info about the surface area of the product that this template is deployed in*/record DataHubPageTemplateSurface{/**Where exactly is this template being used*/@Searchable.fieldType=\"KEYWORD\"surfaceType:enum PageTemplateSurfaceType{/**This template applies to what to display on the home page for users.*/HOME_PAGE/**This template applies to what to display on asset summary pages*/ASSET_SUMMARY}}/**Info about the visibility of this template*/visibility:/**Info about the visibility of this template*/record DataHubPageTemplateVisibility{/**The scope of this template and who can use/see it*/@Searchable.fieldType=\"KEYWORD\"scope:enum PageTemplateScope{/**This template is used for individual use only*/PERSONAL/**This template is used across users*/GLOBAL}}/**Audit stamp for when and by whom this template was created*/@Searchable={\"/actor\":{\"fieldName\":\"createdBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp for when and by whom this template was last updated*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}lastModified:com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private DataHubPageTemplateRowArray _rowsField = null;
    private DataHubPageTemplateAssetSummary _assetSummaryField = null;
    private DataHubPageTemplateSurface _surfaceField = null;
    private DataHubPageTemplateVisibility _visibilityField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private DataHubPageTemplateProperties.ChangeListener __changeListener = new DataHubPageTemplateProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");
    private final static RecordDataSchema.Field FIELD_AssetSummary = SCHEMA.getField("assetSummary");
    private final static RecordDataSchema.Field FIELD_Surface = SCHEMA.getField("surface");
    private final static RecordDataSchema.Field FIELD_Visibility = SCHEMA.getField("visibility");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    public DataHubPageTemplateProperties() {
        super(new DataMap(8, 0.75F), SCHEMA, 8);
        addChangeListener(__changeListener);
    }

    public DataHubPageTemplateProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageTemplateProperties.Fields fields() {
        return _fields;
    }

    public static DataHubPageTemplateProperties.ProjectionMask createMask() {
        return new DataHubPageTemplateProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for rows
     * 
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    public boolean hasRows() {
        if (_rowsField!= null) {
            return true;
        }
        return super._map.containsKey("rows");
    }

    /**
     * Remover for rows
     * 
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    public void removeRows() {
        super._map.remove("rows");
    }

    /**
     * Getter for rows
     * 
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    @Nullable
    public DataHubPageTemplateRowArray getRows(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRows();
            case DEFAULT:
            case NULL:
                if (_rowsField!= null) {
                    return _rowsField;
                } else {
                    Object __rawValue = super._map.get("rows");
                    _rowsField = ((__rawValue == null)?null:new DataHubPageTemplateRowArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _rowsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    @Nonnull
    public DataHubPageTemplateRowArray getRows() {
        if (_rowsField!= null) {
            return _rowsField;
        } else {
            Object __rawValue = super._map.get("rows");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rows");
            }
            _rowsField = ((__rawValue == null)?null:new DataHubPageTemplateRowArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rowsField;
        }
    }

    /**
     * Setter for rows
     * 
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    public DataHubPageTemplateProperties setRows(
        @Nullable
        DataHubPageTemplateRowArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRows(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rows of com.linkedin.template.DataHubPageTemplateProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
                    _rowsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRows();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
                    _rowsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
                    _rowsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateProperties.Fields#rows
     */
    public DataHubPageTemplateProperties setRows(
        @Nonnull
        DataHubPageTemplateRowArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rows of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rows", value.data());
            _rowsField = value;
        }
        return this;
    }

    /**
     * Existence checker for assetSummary
     * 
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    public boolean hasAssetSummary() {
        if (_assetSummaryField!= null) {
            return true;
        }
        return super._map.containsKey("assetSummary");
    }

    /**
     * Remover for assetSummary
     * 
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    public void removeAssetSummary() {
        super._map.remove("assetSummary");
    }

    /**
     * Getter for assetSummary
     * 
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    @Nullable
    public DataHubPageTemplateAssetSummary getAssetSummary(GetMode mode) {
        return getAssetSummary();
    }

    /**
     * Getter for assetSummary
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    @Nullable
    public DataHubPageTemplateAssetSummary getAssetSummary() {
        if (_assetSummaryField!= null) {
            return _assetSummaryField;
        } else {
            Object __rawValue = super._map.get("assetSummary");
            _assetSummaryField = ((__rawValue == null)?null:new DataHubPageTemplateAssetSummary(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _assetSummaryField;
        }
    }

    /**
     * Setter for assetSummary
     * 
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    public DataHubPageTemplateProperties setAssetSummary(
        @Nullable
        DataHubPageTemplateAssetSummary value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssetSummary(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssetSummary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
                    _assetSummaryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
                    _assetSummaryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assetSummary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateProperties.Fields#assetSummary
     */
    public DataHubPageTemplateProperties setAssetSummary(
        @Nonnull
        DataHubPageTemplateAssetSummary value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assetSummary of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
            _assetSummaryField = value;
        }
        return this;
    }

    /**
     * Existence checker for surface
     * 
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    public boolean hasSurface() {
        if (_surfaceField!= null) {
            return true;
        }
        return super._map.containsKey("surface");
    }

    /**
     * Remover for surface
     * 
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    public void removeSurface() {
        super._map.remove("surface");
    }

    /**
     * Getter for surface
     * 
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    @Nullable
    public DataHubPageTemplateSurface getSurface(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSurface();
            case DEFAULT:
            case NULL:
                if (_surfaceField!= null) {
                    return _surfaceField;
                } else {
                    Object __rawValue = super._map.get("surface");
                    _surfaceField = ((__rawValue == null)?null:new DataHubPageTemplateSurface(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _surfaceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for surface
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    @Nonnull
    public DataHubPageTemplateSurface getSurface() {
        if (_surfaceField!= null) {
            return _surfaceField;
        } else {
            Object __rawValue = super._map.get("surface");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("surface");
            }
            _surfaceField = ((__rawValue == null)?null:new DataHubPageTemplateSurface(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _surfaceField;
        }
    }

    /**
     * Setter for surface
     * 
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    public DataHubPageTemplateProperties setSurface(
        @Nullable
        DataHubPageTemplateSurface value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSurface(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field surface of com.linkedin.template.DataHubPageTemplateProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "surface", value.data());
                    _surfaceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSurface();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "surface", value.data());
                    _surfaceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "surface", value.data());
                    _surfaceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for surface
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateProperties.Fields#surface
     */
    public DataHubPageTemplateProperties setSurface(
        @Nonnull
        DataHubPageTemplateSurface value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field surface of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "surface", value.data());
            _surfaceField = value;
        }
        return this;
    }

    /**
     * Existence checker for visibility
     * 
     * @see DataHubPageTemplateProperties.Fields#visibility
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
     * @see DataHubPageTemplateProperties.Fields#visibility
     */
    public void removeVisibility() {
        super._map.remove("visibility");
    }

    /**
     * Getter for visibility
     * 
     * @see DataHubPageTemplateProperties.Fields#visibility
     */
    @Nullable
    public DataHubPageTemplateVisibility getVisibility(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVisibility();
            case DEFAULT:
            case NULL:
                if (_visibilityField!= null) {
                    return _visibilityField;
                } else {
                    Object __rawValue = super._map.get("visibility");
                    _visibilityField = ((__rawValue == null)?null:new DataHubPageTemplateVisibility(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
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
     * @see DataHubPageTemplateProperties.Fields#visibility
     */
    @Nonnull
    public DataHubPageTemplateVisibility getVisibility() {
        if (_visibilityField!= null) {
            return _visibilityField;
        } else {
            Object __rawValue = super._map.get("visibility");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("visibility");
            }
            _visibilityField = ((__rawValue == null)?null:new DataHubPageTemplateVisibility(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _visibilityField;
        }
    }

    /**
     * Setter for visibility
     * 
     * @see DataHubPageTemplateProperties.Fields#visibility
     */
    public DataHubPageTemplateProperties setVisibility(
        @Nullable
        DataHubPageTemplateVisibility value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVisibility(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field visibility of com.linkedin.template.DataHubPageTemplateProperties");
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
     * @see DataHubPageTemplateProperties.Fields#visibility
     */
    public DataHubPageTemplateProperties setVisibility(
        @Nonnull
        DataHubPageTemplateVisibility value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field visibility of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "visibility", value.data());
            _visibilityField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataHubPageTemplateProperties.Fields#created
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
     * @see DataHubPageTemplateProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataHubPageTemplateProperties.Fields#created
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
     * @see DataHubPageTemplateProperties.Fields#created
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
     * @see DataHubPageTemplateProperties.Fields#created
     */
    public DataHubPageTemplateProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.template.DataHubPageTemplateProperties");
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
     * @see DataHubPageTemplateProperties.Fields#created
     */
    public DataHubPageTemplateProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DataHubPageTemplateProperties.Fields#lastModified
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
     * @see DataHubPageTemplateProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DataHubPageTemplateProperties.Fields#lastModified
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
     * @see DataHubPageTemplateProperties.Fields#lastModified
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
     * @see DataHubPageTemplateProperties.Fields#lastModified
     */
    public DataHubPageTemplateProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.template.DataHubPageTemplateProperties");
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
     * @see DataHubPageTemplateProperties.Fields#lastModified
     */
    public DataHubPageTemplateProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.template.DataHubPageTemplateProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public DataHubPageTemplateProperties clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateProperties __clone = ((DataHubPageTemplateProperties) super.clone());
        __clone.__changeListener = new DataHubPageTemplateProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageTemplateProperties copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateProperties __copy = ((DataHubPageTemplateProperties) super.copy());
        __copy._surfaceField = null;
        __copy._visibilityField = null;
        __copy._createdField = null;
        __copy._assetSummaryField = null;
        __copy._lastModifiedField = null;
        __copy._rowsField = null;
        __copy.__changeListener = new DataHubPageTemplateProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageTemplateProperties __objectRef;

        private ChangeListener(DataHubPageTemplateProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "surface":
                    __objectRef._surfaceField = null;
                    break;
                case "visibility":
                    __objectRef._visibilityField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "assetSummary":
                    __objectRef._assetSummaryField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "rows":
                    __objectRef._rowsField = null;
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
         * The rows of modules contained in this template
         * 
         */
        public com.linkedin.template.DataHubPageTemplateRowArray.Fields rows() {
            return new com.linkedin.template.DataHubPageTemplateRowArray.Fields(getPathComponents(), "rows");
        }

        /**
         * The rows of modules contained in this template
         * 
         */
        public PathSpec rows(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "rows");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
         * 
         */
        public com.linkedin.template.DataHubPageTemplateAssetSummary.Fields assetSummary() {
            return new com.linkedin.template.DataHubPageTemplateAssetSummary.Fields(getPathComponents(), "assetSummary");
        }

        /**
         * Info about the surface area of the product that this template is deployed in
         * 
         */
        public com.linkedin.template.DataHubPageTemplateSurface.Fields surface() {
            return new com.linkedin.template.DataHubPageTemplateSurface.Fields(getPathComponents(), "surface");
        }

        /**
         * Info about the visibility of this template
         * 
         */
        public com.linkedin.template.DataHubPageTemplateVisibility.Fields visibility() {
            return new com.linkedin.template.DataHubPageTemplateVisibility.Fields(getPathComponents(), "visibility");
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

        private com.linkedin.template.DataHubPageTemplateRowArray.ProjectionMask _rowsMask;
        private com.linkedin.template.DataHubPageTemplateAssetSummary.ProjectionMask _assetSummaryMask;
        private com.linkedin.template.DataHubPageTemplateSurface.ProjectionMask _surfaceMask;
        private com.linkedin.template.DataHubPageTemplateVisibility.ProjectionMask _visibilityMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The rows of modules contained in this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withRows(Function<com.linkedin.template.DataHubPageTemplateRowArray.ProjectionMask, com.linkedin.template.DataHubPageTemplateRowArray.ProjectionMask> nestedMask) {
            _rowsMask = nestedMask.apply(((_rowsMask == null)?DataHubPageTemplateRowArray.createMask():_rowsMask));
            getDataMap().put("rows", _rowsMask.getDataMap());
            return this;
        }

        /**
         * The rows of modules contained in this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withRows() {
            _rowsMask = null;
            getDataMap().put("rows", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The rows of modules contained in this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withRows(Function<com.linkedin.template.DataHubPageTemplateRowArray.ProjectionMask, com.linkedin.template.DataHubPageTemplateRowArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _rowsMask = nestedMask.apply(((_rowsMask == null)?DataHubPageTemplateRowArray.createMask():_rowsMask));
            getDataMap().put("rows", _rowsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("rows").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("rows").put("$count", count);
            }
            return this;
        }

        /**
         * The rows of modules contained in this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withRows(Integer start, Integer count) {
            _rowsMask = null;
            getDataMap().put("rows", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("rows").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("rows").put("$count", count);
            }
            return this;
        }

        /**
         * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withAssetSummary(Function<com.linkedin.template.DataHubPageTemplateAssetSummary.ProjectionMask, com.linkedin.template.DataHubPageTemplateAssetSummary.ProjectionMask> nestedMask) {
            _assetSummaryMask = nestedMask.apply(((_assetSummaryMask == null)?DataHubPageTemplateAssetSummary.createMask():_assetSummaryMask));
            getDataMap().put("assetSummary", _assetSummaryMask.getDataMap());
            return this;
        }

        /**
         * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withAssetSummary() {
            _assetSummaryMask = null;
            getDataMap().put("assetSummary", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Info about the surface area of the product that this template is deployed in
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withSurface(Function<com.linkedin.template.DataHubPageTemplateSurface.ProjectionMask, com.linkedin.template.DataHubPageTemplateSurface.ProjectionMask> nestedMask) {
            _surfaceMask = nestedMask.apply(((_surfaceMask == null)?DataHubPageTemplateSurface.createMask():_surfaceMask));
            getDataMap().put("surface", _surfaceMask.getDataMap());
            return this;
        }

        /**
         * Info about the surface area of the product that this template is deployed in
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withSurface() {
            _surfaceMask = null;
            getDataMap().put("surface", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Info about the visibility of this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withVisibility(Function<com.linkedin.template.DataHubPageTemplateVisibility.ProjectionMask, com.linkedin.template.DataHubPageTemplateVisibility.ProjectionMask> nestedMask) {
            _visibilityMask = nestedMask.apply(((_visibilityMask == null)?DataHubPageTemplateVisibility.createMask():_visibilityMask));
            getDataMap().put("visibility", _visibilityMask.getDataMap());
            return this;
        }

        /**
         * Info about the visibility of this template
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withVisibility() {
            _visibilityMask = null;
            getDataMap().put("visibility", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         * 
         */
        public DataHubPageTemplateProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
