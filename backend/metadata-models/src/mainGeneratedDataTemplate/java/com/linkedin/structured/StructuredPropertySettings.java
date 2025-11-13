
package com.linkedin.structured;

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
import com.linkedin.data.template.SetMode;


/**
 * Settings specific to a structured property entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/structured/StructuredPropertySettings.pdl.")
public class StructuredPropertySettings
    extends RecordTemplate
{

    private final static StructuredPropertySettings.Fields _fields = new StructuredPropertySettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.structured/**Settings specific to a structured property entity*/@Aspect.name=\"structuredPropertySettings\"record StructuredPropertySettings{/**Whether or not this asset should be hidden in the main application*/@Searchable.fieldType=\"BOOLEAN\"isHidden:boolean=false/**Whether or not this asset should be displayed as a search filter*/@Searchable.fieldType=\"BOOLEAN\"showInSearchFilters:boolean=false/**Whether or not this asset should be displayed in the asset sidebar*/@Searchable.fieldType=\"BOOLEAN\"showInAssetSummary:boolean=false/**Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)\nwhen its value is empty*/@Searchable.fieldType=\"BOOLEAN\"hideInAssetSummaryWhenEmpty:boolean=false/**Whether or not this asset should be displayed as an asset badge on other\nasset's headers*/@Searchable.fieldType=\"BOOLEAN\"showAsAssetBadge:boolean=false/**Whether or not this asset should be displayed as a column in the schema field table\nin a Dataset's \"Columns\" tab.*/@Searchable.fieldType=\"BOOLEAN\"showInColumnsTable:boolean=false/**Last Modified Audit stamp*/@Searchable.`/time`={\"fieldName\":\"lastModifiedSettings\",\"fieldType\":\"DATETIME\"}lastModified:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private Boolean _isHiddenField = null;
    private Boolean _showInSearchFiltersField = null;
    private Boolean _showInAssetSummaryField = null;
    private Boolean _hideInAssetSummaryWhenEmptyField = null;
    private Boolean _showAsAssetBadgeField = null;
    private Boolean _showInColumnsTableField = null;
    private AuditStamp _lastModifiedField = null;
    private StructuredPropertySettings.ChangeListener __changeListener = new StructuredPropertySettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IsHidden = SCHEMA.getField("isHidden");
    private final static Boolean DEFAULT_IsHidden;
    private final static RecordDataSchema.Field FIELD_ShowInSearchFilters = SCHEMA.getField("showInSearchFilters");
    private final static Boolean DEFAULT_ShowInSearchFilters;
    private final static RecordDataSchema.Field FIELD_ShowInAssetSummary = SCHEMA.getField("showInAssetSummary");
    private final static Boolean DEFAULT_ShowInAssetSummary;
    private final static RecordDataSchema.Field FIELD_HideInAssetSummaryWhenEmpty = SCHEMA.getField("hideInAssetSummaryWhenEmpty");
    private final static Boolean DEFAULT_HideInAssetSummaryWhenEmpty;
    private final static RecordDataSchema.Field FIELD_ShowAsAssetBadge = SCHEMA.getField("showAsAssetBadge");
    private final static Boolean DEFAULT_ShowAsAssetBadge;
    private final static RecordDataSchema.Field FIELD_ShowInColumnsTable = SCHEMA.getField("showInColumnsTable");
    private final static Boolean DEFAULT_ShowInColumnsTable;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    static {
        DEFAULT_IsHidden = DataTemplateUtil.coerceBooleanOutput(FIELD_IsHidden.getDefault());
        DEFAULT_ShowInSearchFilters = DataTemplateUtil.coerceBooleanOutput(FIELD_ShowInSearchFilters.getDefault());
        DEFAULT_ShowInAssetSummary = DataTemplateUtil.coerceBooleanOutput(FIELD_ShowInAssetSummary.getDefault());
        DEFAULT_HideInAssetSummaryWhenEmpty = DataTemplateUtil.coerceBooleanOutput(FIELD_HideInAssetSummaryWhenEmpty.getDefault());
        DEFAULT_ShowAsAssetBadge = DataTemplateUtil.coerceBooleanOutput(FIELD_ShowAsAssetBadge.getDefault());
        DEFAULT_ShowInColumnsTable = DataTemplateUtil.coerceBooleanOutput(FIELD_ShowInColumnsTable.getDefault());
    }

    public StructuredPropertySettings() {
        super(new DataMap(10, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public StructuredPropertySettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static StructuredPropertySettings.Fields fields() {
        return _fields;
    }

    public static StructuredPropertySettings.ProjectionMask createMask() {
        return new StructuredPropertySettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for isHidden
     * 
     * @see StructuredPropertySettings.Fields#isHidden
     */
    public boolean hasIsHidden() {
        if (_isHiddenField!= null) {
            return true;
        }
        return super._map.containsKey("isHidden");
    }

    /**
     * Remover for isHidden
     * 
     * @see StructuredPropertySettings.Fields#isHidden
     */
    public void removeIsHidden() {
        super._map.remove("isHidden");
    }

    /**
     * Getter for isHidden
     * 
     * @see StructuredPropertySettings.Fields#isHidden
     */
    @Nullable
    public Boolean isIsHidden(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isIsHidden();
            case NULL:
                if (_isHiddenField!= null) {
                    return _isHiddenField;
                } else {
                    Object __rawValue = super._map.get("isHidden");
                    _isHiddenField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isHiddenField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isHidden
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#isHidden
     */
    @Nonnull
    public Boolean isIsHidden() {
        if (_isHiddenField!= null) {
            return _isHiddenField;
        } else {
            Object __rawValue = super._map.get("isHidden");
            if (__rawValue == null) {
                return DEFAULT_IsHidden;
            }
            _isHiddenField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isHiddenField;
        }
    }

    /**
     * Setter for isHidden
     * 
     * @see StructuredPropertySettings.Fields#isHidden
     */
    public StructuredPropertySettings setIsHidden(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsHidden(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isHidden of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isHidden", value);
                    _isHiddenField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsHidden();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isHidden", value);
                    _isHiddenField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isHidden", value);
                    _isHiddenField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isHidden
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#isHidden
     */
    public StructuredPropertySettings setIsHidden(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isHidden of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isHidden", value);
            _isHiddenField = value;
        }
        return this;
    }

    /**
     * Setter for isHidden
     * 
     * @see StructuredPropertySettings.Fields#isHidden
     */
    public StructuredPropertySettings setIsHidden(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isHidden", value);
        _isHiddenField = value;
        return this;
    }

    /**
     * Existence checker for showInSearchFilters
     * 
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    public boolean hasShowInSearchFilters() {
        if (_showInSearchFiltersField!= null) {
            return true;
        }
        return super._map.containsKey("showInSearchFilters");
    }

    /**
     * Remover for showInSearchFilters
     * 
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    public void removeShowInSearchFilters() {
        super._map.remove("showInSearchFilters");
    }

    /**
     * Getter for showInSearchFilters
     * 
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    @Nullable
    public Boolean isShowInSearchFilters(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isShowInSearchFilters();
            case NULL:
                if (_showInSearchFiltersField!= null) {
                    return _showInSearchFiltersField;
                } else {
                    Object __rawValue = super._map.get("showInSearchFilters");
                    _showInSearchFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showInSearchFiltersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showInSearchFilters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    @Nonnull
    public Boolean isShowInSearchFilters() {
        if (_showInSearchFiltersField!= null) {
            return _showInSearchFiltersField;
        } else {
            Object __rawValue = super._map.get("showInSearchFilters");
            if (__rawValue == null) {
                return DEFAULT_ShowInSearchFilters;
            }
            _showInSearchFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showInSearchFiltersField;
        }
    }

    /**
     * Setter for showInSearchFilters
     * 
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    public StructuredPropertySettings setShowInSearchFilters(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowInSearchFilters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showInSearchFilters of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInSearchFilters", value);
                    _showInSearchFiltersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowInSearchFilters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInSearchFilters", value);
                    _showInSearchFiltersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showInSearchFilters", value);
                    _showInSearchFiltersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showInSearchFilters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    public StructuredPropertySettings setShowInSearchFilters(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showInSearchFilters of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showInSearchFilters", value);
            _showInSearchFiltersField = value;
        }
        return this;
    }

    /**
     * Setter for showInSearchFilters
     * 
     * @see StructuredPropertySettings.Fields#showInSearchFilters
     */
    public StructuredPropertySettings setShowInSearchFilters(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showInSearchFilters", value);
        _showInSearchFiltersField = value;
        return this;
    }

    /**
     * Existence checker for showInAssetSummary
     * 
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    public boolean hasShowInAssetSummary() {
        if (_showInAssetSummaryField!= null) {
            return true;
        }
        return super._map.containsKey("showInAssetSummary");
    }

    /**
     * Remover for showInAssetSummary
     * 
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    public void removeShowInAssetSummary() {
        super._map.remove("showInAssetSummary");
    }

    /**
     * Getter for showInAssetSummary
     * 
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    @Nullable
    public Boolean isShowInAssetSummary(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isShowInAssetSummary();
            case NULL:
                if (_showInAssetSummaryField!= null) {
                    return _showInAssetSummaryField;
                } else {
                    Object __rawValue = super._map.get("showInAssetSummary");
                    _showInAssetSummaryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showInAssetSummaryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showInAssetSummary
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    @Nonnull
    public Boolean isShowInAssetSummary() {
        if (_showInAssetSummaryField!= null) {
            return _showInAssetSummaryField;
        } else {
            Object __rawValue = super._map.get("showInAssetSummary");
            if (__rawValue == null) {
                return DEFAULT_ShowInAssetSummary;
            }
            _showInAssetSummaryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showInAssetSummaryField;
        }
    }

    /**
     * Setter for showInAssetSummary
     * 
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    public StructuredPropertySettings setShowInAssetSummary(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowInAssetSummary(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showInAssetSummary of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetSummary", value);
                    _showInAssetSummaryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowInAssetSummary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetSummary", value);
                    _showInAssetSummaryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetSummary", value);
                    _showInAssetSummaryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showInAssetSummary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    public StructuredPropertySettings setShowInAssetSummary(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showInAssetSummary of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showInAssetSummary", value);
            _showInAssetSummaryField = value;
        }
        return this;
    }

    /**
     * Setter for showInAssetSummary
     * 
     * @see StructuredPropertySettings.Fields#showInAssetSummary
     */
    public StructuredPropertySettings setShowInAssetSummary(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showInAssetSummary", value);
        _showInAssetSummaryField = value;
        return this;
    }

    /**
     * Existence checker for hideInAssetSummaryWhenEmpty
     * 
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    public boolean hasHideInAssetSummaryWhenEmpty() {
        if (_hideInAssetSummaryWhenEmptyField!= null) {
            return true;
        }
        return super._map.containsKey("hideInAssetSummaryWhenEmpty");
    }

    /**
     * Remover for hideInAssetSummaryWhenEmpty
     * 
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    public void removeHideInAssetSummaryWhenEmpty() {
        super._map.remove("hideInAssetSummaryWhenEmpty");
    }

    /**
     * Getter for hideInAssetSummaryWhenEmpty
     * 
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    @Nullable
    public Boolean isHideInAssetSummaryWhenEmpty(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isHideInAssetSummaryWhenEmpty();
            case NULL:
                if (_hideInAssetSummaryWhenEmptyField!= null) {
                    return _hideInAssetSummaryWhenEmptyField;
                } else {
                    Object __rawValue = super._map.get("hideInAssetSummaryWhenEmpty");
                    _hideInAssetSummaryWhenEmptyField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _hideInAssetSummaryWhenEmptyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for hideInAssetSummaryWhenEmpty
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    @Nonnull
    public Boolean isHideInAssetSummaryWhenEmpty() {
        if (_hideInAssetSummaryWhenEmptyField!= null) {
            return _hideInAssetSummaryWhenEmptyField;
        } else {
            Object __rawValue = super._map.get("hideInAssetSummaryWhenEmpty");
            if (__rawValue == null) {
                return DEFAULT_HideInAssetSummaryWhenEmpty;
            }
            _hideInAssetSummaryWhenEmptyField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _hideInAssetSummaryWhenEmptyField;
        }
    }

    /**
     * Setter for hideInAssetSummaryWhenEmpty
     * 
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    public StructuredPropertySettings setHideInAssetSummaryWhenEmpty(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHideInAssetSummaryWhenEmpty(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field hideInAssetSummaryWhenEmpty of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hideInAssetSummaryWhenEmpty", value);
                    _hideInAssetSummaryWhenEmptyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHideInAssetSummaryWhenEmpty();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hideInAssetSummaryWhenEmpty", value);
                    _hideInAssetSummaryWhenEmptyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hideInAssetSummaryWhenEmpty", value);
                    _hideInAssetSummaryWhenEmptyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hideInAssetSummaryWhenEmpty
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    public StructuredPropertySettings setHideInAssetSummaryWhenEmpty(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hideInAssetSummaryWhenEmpty of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hideInAssetSummaryWhenEmpty", value);
            _hideInAssetSummaryWhenEmptyField = value;
        }
        return this;
    }

    /**
     * Setter for hideInAssetSummaryWhenEmpty
     * 
     * @see StructuredPropertySettings.Fields#hideInAssetSummaryWhenEmpty
     */
    public StructuredPropertySettings setHideInAssetSummaryWhenEmpty(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "hideInAssetSummaryWhenEmpty", value);
        _hideInAssetSummaryWhenEmptyField = value;
        return this;
    }

    /**
     * Existence checker for showAsAssetBadge
     * 
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    public boolean hasShowAsAssetBadge() {
        if (_showAsAssetBadgeField!= null) {
            return true;
        }
        return super._map.containsKey("showAsAssetBadge");
    }

    /**
     * Remover for showAsAssetBadge
     * 
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    public void removeShowAsAssetBadge() {
        super._map.remove("showAsAssetBadge");
    }

    /**
     * Getter for showAsAssetBadge
     * 
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    @Nullable
    public Boolean isShowAsAssetBadge(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isShowAsAssetBadge();
            case NULL:
                if (_showAsAssetBadgeField!= null) {
                    return _showAsAssetBadgeField;
                } else {
                    Object __rawValue = super._map.get("showAsAssetBadge");
                    _showAsAssetBadgeField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showAsAssetBadgeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showAsAssetBadge
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    @Nonnull
    public Boolean isShowAsAssetBadge() {
        if (_showAsAssetBadgeField!= null) {
            return _showAsAssetBadgeField;
        } else {
            Object __rawValue = super._map.get("showAsAssetBadge");
            if (__rawValue == null) {
                return DEFAULT_ShowAsAssetBadge;
            }
            _showAsAssetBadgeField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showAsAssetBadgeField;
        }
    }

    /**
     * Setter for showAsAssetBadge
     * 
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    public StructuredPropertySettings setShowAsAssetBadge(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowAsAssetBadge(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showAsAssetBadge of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showAsAssetBadge", value);
                    _showAsAssetBadgeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowAsAssetBadge();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showAsAssetBadge", value);
                    _showAsAssetBadgeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showAsAssetBadge", value);
                    _showAsAssetBadgeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showAsAssetBadge
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    public StructuredPropertySettings setShowAsAssetBadge(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showAsAssetBadge of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showAsAssetBadge", value);
            _showAsAssetBadgeField = value;
        }
        return this;
    }

    /**
     * Setter for showAsAssetBadge
     * 
     * @see StructuredPropertySettings.Fields#showAsAssetBadge
     */
    public StructuredPropertySettings setShowAsAssetBadge(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showAsAssetBadge", value);
        _showAsAssetBadgeField = value;
        return this;
    }

    /**
     * Existence checker for showInColumnsTable
     * 
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    public boolean hasShowInColumnsTable() {
        if (_showInColumnsTableField!= null) {
            return true;
        }
        return super._map.containsKey("showInColumnsTable");
    }

    /**
     * Remover for showInColumnsTable
     * 
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    public void removeShowInColumnsTable() {
        super._map.remove("showInColumnsTable");
    }

    /**
     * Getter for showInColumnsTable
     * 
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    @Nullable
    public Boolean isShowInColumnsTable(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isShowInColumnsTable();
            case NULL:
                if (_showInColumnsTableField!= null) {
                    return _showInColumnsTableField;
                } else {
                    Object __rawValue = super._map.get("showInColumnsTable");
                    _showInColumnsTableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showInColumnsTableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showInColumnsTable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    @Nonnull
    public Boolean isShowInColumnsTable() {
        if (_showInColumnsTableField!= null) {
            return _showInColumnsTableField;
        } else {
            Object __rawValue = super._map.get("showInColumnsTable");
            if (__rawValue == null) {
                return DEFAULT_ShowInColumnsTable;
            }
            _showInColumnsTableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showInColumnsTableField;
        }
    }

    /**
     * Setter for showInColumnsTable
     * 
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    public StructuredPropertySettings setShowInColumnsTable(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowInColumnsTable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showInColumnsTable of com.linkedin.structured.StructuredPropertySettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInColumnsTable", value);
                    _showInColumnsTableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowInColumnsTable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInColumnsTable", value);
                    _showInColumnsTableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showInColumnsTable", value);
                    _showInColumnsTableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showInColumnsTable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    public StructuredPropertySettings setShowInColumnsTable(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showInColumnsTable of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showInColumnsTable", value);
            _showInColumnsTableField = value;
        }
        return this;
    }

    /**
     * Setter for showInColumnsTable
     * 
     * @see StructuredPropertySettings.Fields#showInColumnsTable
     */
    public StructuredPropertySettings setShowInColumnsTable(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showInColumnsTable", value);
        _showInColumnsTableField = value;
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see StructuredPropertySettings.Fields#lastModified
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
     * @see StructuredPropertySettings.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see StructuredPropertySettings.Fields#lastModified
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
     * @see StructuredPropertySettings.Fields#lastModified
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
     * @see StructuredPropertySettings.Fields#lastModified
     */
    public StructuredPropertySettings setLastModified(
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
     * @see StructuredPropertySettings.Fields#lastModified
     */
    public StructuredPropertySettings setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.structured.StructuredPropertySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public StructuredPropertySettings clone()
        throws CloneNotSupportedException
    {
        StructuredPropertySettings __clone = ((StructuredPropertySettings) super.clone());
        __clone.__changeListener = new StructuredPropertySettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public StructuredPropertySettings copy()
        throws CloneNotSupportedException
    {
        StructuredPropertySettings __copy = ((StructuredPropertySettings) super.copy());
        __copy._showInColumnsTableField = null;
        __copy._hideInAssetSummaryWhenEmptyField = null;
        __copy._showAsAssetBadgeField = null;
        __copy._showInAssetSummaryField = null;
        __copy._showInSearchFiltersField = null;
        __copy._lastModifiedField = null;
        __copy._isHiddenField = null;
        __copy.__changeListener = new StructuredPropertySettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final StructuredPropertySettings __objectRef;

        private ChangeListener(StructuredPropertySettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "showInColumnsTable":
                    __objectRef._showInColumnsTableField = null;
                    break;
                case "hideInAssetSummaryWhenEmpty":
                    __objectRef._hideInAssetSummaryWhenEmptyField = null;
                    break;
                case "showAsAssetBadge":
                    __objectRef._showAsAssetBadgeField = null;
                    break;
                case "showInAssetSummary":
                    __objectRef._showInAssetSummaryField = null;
                    break;
                case "showInSearchFilters":
                    __objectRef._showInSearchFiltersField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "isHidden":
                    __objectRef._isHiddenField = null;
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
         * Whether or not this asset should be hidden in the main application
         * 
         */
        public PathSpec isHidden() {
            return new PathSpec(getPathComponents(), "isHidden");
        }

        /**
         * Whether or not this asset should be displayed as a search filter
         * 
         */
        public PathSpec showInSearchFilters() {
            return new PathSpec(getPathComponents(), "showInSearchFilters");
        }

        /**
         * Whether or not this asset should be displayed in the asset sidebar
         * 
         */
        public PathSpec showInAssetSummary() {
            return new PathSpec(getPathComponents(), "showInAssetSummary");
        }

        /**
         * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)
         * when its value is empty
         * 
         */
        public PathSpec hideInAssetSummaryWhenEmpty() {
            return new PathSpec(getPathComponents(), "hideInAssetSummaryWhenEmpty");
        }

        /**
         * Whether or not this asset should be displayed as an asset badge on other
         * asset's headers
         * 
         */
        public PathSpec showAsAssetBadge() {
            return new PathSpec(getPathComponents(), "showAsAssetBadge");
        }

        /**
         * Whether or not this asset should be displayed as a column in the schema field table
         * in a Dataset's "Columns" tab.
         * 
         */
        public PathSpec showInColumnsTable() {
            return new PathSpec(getPathComponents(), "showInColumnsTable");
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

        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(10);
        }

        /**
         * Whether or not this asset should be hidden in the main application
         * 
         */
        public StructuredPropertySettings.ProjectionMask withIsHidden() {
            getDataMap().put("isHidden", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this asset should be displayed as a search filter
         * 
         */
        public StructuredPropertySettings.ProjectionMask withShowInSearchFilters() {
            getDataMap().put("showInSearchFilters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this asset should be displayed in the asset sidebar
         * 
         */
        public StructuredPropertySettings.ProjectionMask withShowInAssetSummary() {
            getDataMap().put("showInAssetSummary", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)
         * when its value is empty
         * 
         */
        public StructuredPropertySettings.ProjectionMask withHideInAssetSummaryWhenEmpty() {
            getDataMap().put("hideInAssetSummaryWhenEmpty", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this asset should be displayed as an asset badge on other
         * asset's headers
         * 
         */
        public StructuredPropertySettings.ProjectionMask withShowAsAssetBadge() {
            getDataMap().put("showAsAssetBadge", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not this asset should be displayed as a column in the schema field table
         * in a Dataset's "Columns" tab.
         * 
         */
        public StructuredPropertySettings.ProjectionMask withShowInColumnsTable() {
            getDataMap().put("showInColumnsTable", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertySettings.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertySettings.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Last Modified Audit stamp
         * 
         */
        public StructuredPropertySettings.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
