
package com.linkedin.datahub;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DoubleMap;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Configuration for how any given field should be indexed and matched in the DataHub search index.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datahub/DataHubSearchConfig.pdl.")
public class DataHubSearchConfig
    extends RecordTemplate
{

    private final static DataHubSearchConfig.Fields _fields = new DataHubSearchConfig.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datahub/**Configuration for how any given field should be indexed and matched in the DataHub search index.\n*/record DataHubSearchConfig{/**Name of the field in the search index. Defaults to the field name otherwise\n*/fieldName:optional string/**Type of the field. Defines how the field is indexed and matched\n*/fieldType:optional enum SearchFieldType{KEYWORD,TEXT,TEXT_PARTIAL,BROWSE_PATH,URN,URN_PARTIAL,BOOLEAN,COUNT,DATETIME,OBJECT,BROWSE_PATH_V2,WORD_GRAM}/**Whether we should match the field for the default search query\n*/queryByDefault:boolean=false/**Whether we should use the field for default autocomplete\n*/enableAutocomplete:boolean=false/**Whether or not to add field to filters.\n*/addToFilters:boolean=false/**Whether or not to add the \"has values\" to filters.\ncheck if this is conditional on addToFilters being true\n*/addHasValuesToFilters:boolean=true/**Display name of the filter\n*/filterNameOverride:optional string/**Display name of the has values filter\n*/hasValuesFilterNameOverride:optional string/**Boost multiplier to the match score. Matches on fields with higher boost score ranks higher\n*/boostScore:double=1.0/**If set, add a index field of the given name that checks whether the field exists\n*/hasValuesFieldName:optional string/**If set, add a index field of the given name that checks the number of elements\n*/numValuesFieldName:optional string/**(Optional) Weights to apply to score for a given value\n*/weightsPerFieldValue:optional map[string,double]/**(Optional) Aliases for this given field that can be used for sorting etc.\n*/fieldNameAliases:optional array[string]}", SchemaFormatType.PDL));
    private String _fieldNameField = null;
    private SearchFieldType _fieldTypeField = null;
    private Boolean _queryByDefaultField = null;
    private Boolean _enableAutocompleteField = null;
    private Boolean _addToFiltersField = null;
    private Boolean _addHasValuesToFiltersField = null;
    private String _filterNameOverrideField = null;
    private String _hasValuesFilterNameOverrideField = null;
    private Double _boostScoreField = null;
    private String _hasValuesFieldNameField = null;
    private String _numValuesFieldNameField = null;
    private DoubleMap _weightsPerFieldValueField = null;
    private StringArray _fieldNameAliasesField = null;
    private DataHubSearchConfig.ChangeListener __changeListener = new DataHubSearchConfig.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldName = SCHEMA.getField("fieldName");
    private final static RecordDataSchema.Field FIELD_FieldType = SCHEMA.getField("fieldType");
    private final static RecordDataSchema.Field FIELD_QueryByDefault = SCHEMA.getField("queryByDefault");
    private final static Boolean DEFAULT_QueryByDefault;
    private final static RecordDataSchema.Field FIELD_EnableAutocomplete = SCHEMA.getField("enableAutocomplete");
    private final static Boolean DEFAULT_EnableAutocomplete;
    private final static RecordDataSchema.Field FIELD_AddToFilters = SCHEMA.getField("addToFilters");
    private final static Boolean DEFAULT_AddToFilters;
    private final static RecordDataSchema.Field FIELD_AddHasValuesToFilters = SCHEMA.getField("addHasValuesToFilters");
    private final static Boolean DEFAULT_AddHasValuesToFilters;
    private final static RecordDataSchema.Field FIELD_FilterNameOverride = SCHEMA.getField("filterNameOverride");
    private final static RecordDataSchema.Field FIELD_HasValuesFilterNameOverride = SCHEMA.getField("hasValuesFilterNameOverride");
    private final static RecordDataSchema.Field FIELD_BoostScore = SCHEMA.getField("boostScore");
    private final static Double DEFAULT_BoostScore;
    private final static RecordDataSchema.Field FIELD_HasValuesFieldName = SCHEMA.getField("hasValuesFieldName");
    private final static RecordDataSchema.Field FIELD_NumValuesFieldName = SCHEMA.getField("numValuesFieldName");
    private final static RecordDataSchema.Field FIELD_WeightsPerFieldValue = SCHEMA.getField("weightsPerFieldValue");
    private final static RecordDataSchema.Field FIELD_FieldNameAliases = SCHEMA.getField("fieldNameAliases");

    static {
        DEFAULT_QueryByDefault = DataTemplateUtil.coerceBooleanOutput(FIELD_QueryByDefault.getDefault());
        DEFAULT_EnableAutocomplete = DataTemplateUtil.coerceBooleanOutput(FIELD_EnableAutocomplete.getDefault());
        DEFAULT_AddToFilters = DataTemplateUtil.coerceBooleanOutput(FIELD_AddToFilters.getDefault());
        DEFAULT_AddHasValuesToFilters = DataTemplateUtil.coerceBooleanOutput(FIELD_AddHasValuesToFilters.getDefault());
        DEFAULT_BoostScore = DataTemplateUtil.coerceDoubleOutput(FIELD_BoostScore.getDefault());
    }

    public DataHubSearchConfig() {
        super(new DataMap(), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataHubSearchConfig(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubSearchConfig.Fields fields() {
        return _fields;
    }

    public static DataHubSearchConfig.ProjectionMask createMask() {
        return new DataHubSearchConfig.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldName
     * 
     * @see DataHubSearchConfig.Fields#fieldName
     */
    public boolean hasFieldName() {
        if (_fieldNameField!= null) {
            return true;
        }
        return super._map.containsKey("fieldName");
    }

    /**
     * Remover for fieldName
     * 
     * @see DataHubSearchConfig.Fields#fieldName
     */
    public void removeFieldName() {
        super._map.remove("fieldName");
    }

    /**
     * Getter for fieldName
     * 
     * @see DataHubSearchConfig.Fields#fieldName
     */
    @Nullable
    public String getFieldName(GetMode mode) {
        return getFieldName();
    }

    /**
     * Getter for fieldName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#fieldName
     */
    @Nullable
    public String getFieldName() {
        if (_fieldNameField!= null) {
            return _fieldNameField;
        } else {
            Object __rawValue = super._map.get("fieldName");
            _fieldNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldNameField;
        }
    }

    /**
     * Setter for fieldName
     * 
     * @see DataHubSearchConfig.Fields#fieldName
     */
    public DataHubSearchConfig setFieldName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
                    _fieldNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
                    _fieldNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#fieldName
     */
    public DataHubSearchConfig setFieldName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldName of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
            _fieldNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldType
     * 
     * @see DataHubSearchConfig.Fields#fieldType
     */
    public boolean hasFieldType() {
        if (_fieldTypeField!= null) {
            return true;
        }
        return super._map.containsKey("fieldType");
    }

    /**
     * Remover for fieldType
     * 
     * @see DataHubSearchConfig.Fields#fieldType
     */
    public void removeFieldType() {
        super._map.remove("fieldType");
    }

    /**
     * Getter for fieldType
     * 
     * @see DataHubSearchConfig.Fields#fieldType
     */
    @Nullable
    public SearchFieldType getFieldType(GetMode mode) {
        return getFieldType();
    }

    /**
     * Getter for fieldType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#fieldType
     */
    @Nullable
    public SearchFieldType getFieldType() {
        if (_fieldTypeField!= null) {
            return _fieldTypeField;
        } else {
            Object __rawValue = super._map.get("fieldType");
            _fieldTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SearchFieldType.class, SearchFieldType.$UNKNOWN);
            return _fieldTypeField;
        }
    }

    /**
     * Setter for fieldType
     * 
     * @see DataHubSearchConfig.Fields#fieldType
     */
    public DataHubSearchConfig setFieldType(
        @Nullable
        SearchFieldType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldType", value.name());
                    _fieldTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldType", value.name());
                    _fieldTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#fieldType
     */
    public DataHubSearchConfig setFieldType(
        @Nonnull
        SearchFieldType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldType of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldType", value.name());
            _fieldTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for queryByDefault
     * 
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    public boolean hasQueryByDefault() {
        if (_queryByDefaultField!= null) {
            return true;
        }
        return super._map.containsKey("queryByDefault");
    }

    /**
     * Remover for queryByDefault
     * 
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    public void removeQueryByDefault() {
        super._map.remove("queryByDefault");
    }

    /**
     * Getter for queryByDefault
     * 
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    @Nullable
    public Boolean isQueryByDefault(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isQueryByDefault();
            case NULL:
                if (_queryByDefaultField!= null) {
                    return _queryByDefaultField;
                } else {
                    Object __rawValue = super._map.get("queryByDefault");
                    _queryByDefaultField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _queryByDefaultField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for queryByDefault
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    @Nonnull
    public Boolean isQueryByDefault() {
        if (_queryByDefaultField!= null) {
            return _queryByDefaultField;
        } else {
            Object __rawValue = super._map.get("queryByDefault");
            if (__rawValue == null) {
                return DEFAULT_QueryByDefault;
            }
            _queryByDefaultField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _queryByDefaultField;
        }
    }

    /**
     * Setter for queryByDefault
     * 
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    public DataHubSearchConfig setQueryByDefault(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQueryByDefault(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field queryByDefault of com.linkedin.datahub.DataHubSearchConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "queryByDefault", value);
                    _queryByDefaultField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQueryByDefault();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "queryByDefault", value);
                    _queryByDefaultField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "queryByDefault", value);
                    _queryByDefaultField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for queryByDefault
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    public DataHubSearchConfig setQueryByDefault(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field queryByDefault of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "queryByDefault", value);
            _queryByDefaultField = value;
        }
        return this;
    }

    /**
     * Setter for queryByDefault
     * 
     * @see DataHubSearchConfig.Fields#queryByDefault
     */
    public DataHubSearchConfig setQueryByDefault(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "queryByDefault", value);
        _queryByDefaultField = value;
        return this;
    }

    /**
     * Existence checker for enableAutocomplete
     * 
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    public boolean hasEnableAutocomplete() {
        if (_enableAutocompleteField!= null) {
            return true;
        }
        return super._map.containsKey("enableAutocomplete");
    }

    /**
     * Remover for enableAutocomplete
     * 
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    public void removeEnableAutocomplete() {
        super._map.remove("enableAutocomplete");
    }

    /**
     * Getter for enableAutocomplete
     * 
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    @Nullable
    public Boolean isEnableAutocomplete(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isEnableAutocomplete();
            case NULL:
                if (_enableAutocompleteField!= null) {
                    return _enableAutocompleteField;
                } else {
                    Object __rawValue = super._map.get("enableAutocomplete");
                    _enableAutocompleteField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _enableAutocompleteField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for enableAutocomplete
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    @Nonnull
    public Boolean isEnableAutocomplete() {
        if (_enableAutocompleteField!= null) {
            return _enableAutocompleteField;
        } else {
            Object __rawValue = super._map.get("enableAutocomplete");
            if (__rawValue == null) {
                return DEFAULT_EnableAutocomplete;
            }
            _enableAutocompleteField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _enableAutocompleteField;
        }
    }

    /**
     * Setter for enableAutocomplete
     * 
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    public DataHubSearchConfig setEnableAutocomplete(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnableAutocomplete(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field enableAutocomplete of com.linkedin.datahub.DataHubSearchConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enableAutocomplete", value);
                    _enableAutocompleteField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnableAutocomplete();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enableAutocomplete", value);
                    _enableAutocompleteField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "enableAutocomplete", value);
                    _enableAutocompleteField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for enableAutocomplete
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    public DataHubSearchConfig setEnableAutocomplete(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field enableAutocomplete of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "enableAutocomplete", value);
            _enableAutocompleteField = value;
        }
        return this;
    }

    /**
     * Setter for enableAutocomplete
     * 
     * @see DataHubSearchConfig.Fields#enableAutocomplete
     */
    public DataHubSearchConfig setEnableAutocomplete(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "enableAutocomplete", value);
        _enableAutocompleteField = value;
        return this;
    }

    /**
     * Existence checker for addToFilters
     * 
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    public boolean hasAddToFilters() {
        if (_addToFiltersField!= null) {
            return true;
        }
        return super._map.containsKey("addToFilters");
    }

    /**
     * Remover for addToFilters
     * 
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    public void removeAddToFilters() {
        super._map.remove("addToFilters");
    }

    /**
     * Getter for addToFilters
     * 
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    @Nullable
    public Boolean isAddToFilters(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isAddToFilters();
            case NULL:
                if (_addToFiltersField!= null) {
                    return _addToFiltersField;
                } else {
                    Object __rawValue = super._map.get("addToFilters");
                    _addToFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _addToFiltersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for addToFilters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    @Nonnull
    public Boolean isAddToFilters() {
        if (_addToFiltersField!= null) {
            return _addToFiltersField;
        } else {
            Object __rawValue = super._map.get("addToFilters");
            if (__rawValue == null) {
                return DEFAULT_AddToFilters;
            }
            _addToFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _addToFiltersField;
        }
    }

    /**
     * Setter for addToFilters
     * 
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    public DataHubSearchConfig setAddToFilters(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAddToFilters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field addToFilters of com.linkedin.datahub.DataHubSearchConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "addToFilters", value);
                    _addToFiltersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAddToFilters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "addToFilters", value);
                    _addToFiltersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "addToFilters", value);
                    _addToFiltersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for addToFilters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    public DataHubSearchConfig setAddToFilters(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field addToFilters of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "addToFilters", value);
            _addToFiltersField = value;
        }
        return this;
    }

    /**
     * Setter for addToFilters
     * 
     * @see DataHubSearchConfig.Fields#addToFilters
     */
    public DataHubSearchConfig setAddToFilters(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "addToFilters", value);
        _addToFiltersField = value;
        return this;
    }

    /**
     * Existence checker for addHasValuesToFilters
     * 
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    public boolean hasAddHasValuesToFilters() {
        if (_addHasValuesToFiltersField!= null) {
            return true;
        }
        return super._map.containsKey("addHasValuesToFilters");
    }

    /**
     * Remover for addHasValuesToFilters
     * 
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    public void removeAddHasValuesToFilters() {
        super._map.remove("addHasValuesToFilters");
    }

    /**
     * Getter for addHasValuesToFilters
     * 
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    @Nullable
    public Boolean isAddHasValuesToFilters(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isAddHasValuesToFilters();
            case NULL:
                if (_addHasValuesToFiltersField!= null) {
                    return _addHasValuesToFiltersField;
                } else {
                    Object __rawValue = super._map.get("addHasValuesToFilters");
                    _addHasValuesToFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _addHasValuesToFiltersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for addHasValuesToFilters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    @Nonnull
    public Boolean isAddHasValuesToFilters() {
        if (_addHasValuesToFiltersField!= null) {
            return _addHasValuesToFiltersField;
        } else {
            Object __rawValue = super._map.get("addHasValuesToFilters");
            if (__rawValue == null) {
                return DEFAULT_AddHasValuesToFilters;
            }
            _addHasValuesToFiltersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _addHasValuesToFiltersField;
        }
    }

    /**
     * Setter for addHasValuesToFilters
     * 
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    public DataHubSearchConfig setAddHasValuesToFilters(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAddHasValuesToFilters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field addHasValuesToFilters of com.linkedin.datahub.DataHubSearchConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "addHasValuesToFilters", value);
                    _addHasValuesToFiltersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAddHasValuesToFilters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "addHasValuesToFilters", value);
                    _addHasValuesToFiltersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "addHasValuesToFilters", value);
                    _addHasValuesToFiltersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for addHasValuesToFilters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    public DataHubSearchConfig setAddHasValuesToFilters(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field addHasValuesToFilters of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "addHasValuesToFilters", value);
            _addHasValuesToFiltersField = value;
        }
        return this;
    }

    /**
     * Setter for addHasValuesToFilters
     * 
     * @see DataHubSearchConfig.Fields#addHasValuesToFilters
     */
    public DataHubSearchConfig setAddHasValuesToFilters(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "addHasValuesToFilters", value);
        _addHasValuesToFiltersField = value;
        return this;
    }

    /**
     * Existence checker for filterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    public boolean hasFilterNameOverride() {
        if (_filterNameOverrideField!= null) {
            return true;
        }
        return super._map.containsKey("filterNameOverride");
    }

    /**
     * Remover for filterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    public void removeFilterNameOverride() {
        super._map.remove("filterNameOverride");
    }

    /**
     * Getter for filterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    @Nullable
    public String getFilterNameOverride(GetMode mode) {
        return getFilterNameOverride();
    }

    /**
     * Getter for filterNameOverride
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    @Nullable
    public String getFilterNameOverride() {
        if (_filterNameOverrideField!= null) {
            return _filterNameOverrideField;
        } else {
            Object __rawValue = super._map.get("filterNameOverride");
            _filterNameOverrideField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _filterNameOverrideField;
        }
    }

    /**
     * Setter for filterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    public DataHubSearchConfig setFilterNameOverride(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilterNameOverride(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilterNameOverride();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filterNameOverride", value);
                    _filterNameOverrideField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filterNameOverride", value);
                    _filterNameOverrideField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filterNameOverride
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#filterNameOverride
     */
    public DataHubSearchConfig setFilterNameOverride(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filterNameOverride of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filterNameOverride", value);
            _filterNameOverrideField = value;
        }
        return this;
    }

    /**
     * Existence checker for hasValuesFilterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    public boolean hasHasValuesFilterNameOverride() {
        if (_hasValuesFilterNameOverrideField!= null) {
            return true;
        }
        return super._map.containsKey("hasValuesFilterNameOverride");
    }

    /**
     * Remover for hasValuesFilterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    public void removeHasValuesFilterNameOverride() {
        super._map.remove("hasValuesFilterNameOverride");
    }

    /**
     * Getter for hasValuesFilterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    @Nullable
    public String getHasValuesFilterNameOverride(GetMode mode) {
        return getHasValuesFilterNameOverride();
    }

    /**
     * Getter for hasValuesFilterNameOverride
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    @Nullable
    public String getHasValuesFilterNameOverride() {
        if (_hasValuesFilterNameOverrideField!= null) {
            return _hasValuesFilterNameOverrideField;
        } else {
            Object __rawValue = super._map.get("hasValuesFilterNameOverride");
            _hasValuesFilterNameOverrideField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _hasValuesFilterNameOverrideField;
        }
    }

    /**
     * Setter for hasValuesFilterNameOverride
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    public DataHubSearchConfig setHasValuesFilterNameOverride(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHasValuesFilterNameOverride(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHasValuesFilterNameOverride();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hasValuesFilterNameOverride", value);
                    _hasValuesFilterNameOverrideField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hasValuesFilterNameOverride", value);
                    _hasValuesFilterNameOverrideField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hasValuesFilterNameOverride
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#hasValuesFilterNameOverride
     */
    public DataHubSearchConfig setHasValuesFilterNameOverride(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hasValuesFilterNameOverride of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hasValuesFilterNameOverride", value);
            _hasValuesFilterNameOverrideField = value;
        }
        return this;
    }

    /**
     * Existence checker for boostScore
     * 
     * @see DataHubSearchConfig.Fields#boostScore
     */
    public boolean hasBoostScore() {
        if (_boostScoreField!= null) {
            return true;
        }
        return super._map.containsKey("boostScore");
    }

    /**
     * Remover for boostScore
     * 
     * @see DataHubSearchConfig.Fields#boostScore
     */
    public void removeBoostScore() {
        super._map.remove("boostScore");
    }

    /**
     * Getter for boostScore
     * 
     * @see DataHubSearchConfig.Fields#boostScore
     */
    @Nullable
    public Double getBoostScore(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getBoostScore();
            case NULL:
                if (_boostScoreField!= null) {
                    return _boostScoreField;
                } else {
                    Object __rawValue = super._map.get("boostScore");
                    _boostScoreField = DataTemplateUtil.coerceDoubleOutput(__rawValue);
                    return _boostScoreField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for boostScore
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubSearchConfig.Fields#boostScore
     */
    @Nonnull
    public Double getBoostScore() {
        if (_boostScoreField!= null) {
            return _boostScoreField;
        } else {
            Object __rawValue = super._map.get("boostScore");
            if (__rawValue == null) {
                return DEFAULT_BoostScore;
            }
            _boostScoreField = DataTemplateUtil.coerceDoubleOutput(__rawValue);
            return _boostScoreField;
        }
    }

    /**
     * Setter for boostScore
     * 
     * @see DataHubSearchConfig.Fields#boostScore
     */
    public DataHubSearchConfig setBoostScore(
        @Nullable
        Double value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBoostScore(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field boostScore of com.linkedin.datahub.DataHubSearchConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "boostScore", DataTemplateUtil.coerceDoubleInput(value));
                    _boostScoreField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBoostScore();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "boostScore", DataTemplateUtil.coerceDoubleInput(value));
                    _boostScoreField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "boostScore", DataTemplateUtil.coerceDoubleInput(value));
                    _boostScoreField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for boostScore
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#boostScore
     */
    public DataHubSearchConfig setBoostScore(
        @Nonnull
        Double value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field boostScore of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "boostScore", DataTemplateUtil.coerceDoubleInput(value));
            _boostScoreField = value;
        }
        return this;
    }

    /**
     * Setter for boostScore
     * 
     * @see DataHubSearchConfig.Fields#boostScore
     */
    public DataHubSearchConfig setBoostScore(double value) {
        CheckedUtil.putWithoutChecking(super._map, "boostScore", DataTemplateUtil.coerceDoubleInput(value));
        _boostScoreField = value;
        return this;
    }

    /**
     * Existence checker for hasValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    public boolean hasHasValuesFieldName() {
        if (_hasValuesFieldNameField!= null) {
            return true;
        }
        return super._map.containsKey("hasValuesFieldName");
    }

    /**
     * Remover for hasValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    public void removeHasValuesFieldName() {
        super._map.remove("hasValuesFieldName");
    }

    /**
     * Getter for hasValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    @Nullable
    public String getHasValuesFieldName(GetMode mode) {
        return getHasValuesFieldName();
    }

    /**
     * Getter for hasValuesFieldName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    @Nullable
    public String getHasValuesFieldName() {
        if (_hasValuesFieldNameField!= null) {
            return _hasValuesFieldNameField;
        } else {
            Object __rawValue = super._map.get("hasValuesFieldName");
            _hasValuesFieldNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _hasValuesFieldNameField;
        }
    }

    /**
     * Setter for hasValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    public DataHubSearchConfig setHasValuesFieldName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHasValuesFieldName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHasValuesFieldName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hasValuesFieldName", value);
                    _hasValuesFieldNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hasValuesFieldName", value);
                    _hasValuesFieldNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hasValuesFieldName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#hasValuesFieldName
     */
    public DataHubSearchConfig setHasValuesFieldName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hasValuesFieldName of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hasValuesFieldName", value);
            _hasValuesFieldNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for numValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    public boolean hasNumValuesFieldName() {
        if (_numValuesFieldNameField!= null) {
            return true;
        }
        return super._map.containsKey("numValuesFieldName");
    }

    /**
     * Remover for numValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    public void removeNumValuesFieldName() {
        super._map.remove("numValuesFieldName");
    }

    /**
     * Getter for numValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    @Nullable
    public String getNumValuesFieldName(GetMode mode) {
        return getNumValuesFieldName();
    }

    /**
     * Getter for numValuesFieldName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    @Nullable
    public String getNumValuesFieldName() {
        if (_numValuesFieldNameField!= null) {
            return _numValuesFieldNameField;
        } else {
            Object __rawValue = super._map.get("numValuesFieldName");
            _numValuesFieldNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _numValuesFieldNameField;
        }
    }

    /**
     * Setter for numValuesFieldName
     * 
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    public DataHubSearchConfig setNumValuesFieldName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumValuesFieldName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumValuesFieldName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numValuesFieldName", value);
                    _numValuesFieldNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numValuesFieldName", value);
                    _numValuesFieldNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numValuesFieldName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#numValuesFieldName
     */
    public DataHubSearchConfig setNumValuesFieldName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numValuesFieldName of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numValuesFieldName", value);
            _numValuesFieldNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for weightsPerFieldValue
     * 
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    public boolean hasWeightsPerFieldValue() {
        if (_weightsPerFieldValueField!= null) {
            return true;
        }
        return super._map.containsKey("weightsPerFieldValue");
    }

    /**
     * Remover for weightsPerFieldValue
     * 
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    public void removeWeightsPerFieldValue() {
        super._map.remove("weightsPerFieldValue");
    }

    /**
     * Getter for weightsPerFieldValue
     * 
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    @Nullable
    public DoubleMap getWeightsPerFieldValue(GetMode mode) {
        return getWeightsPerFieldValue();
    }

    /**
     * Getter for weightsPerFieldValue
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    @Nullable
    public DoubleMap getWeightsPerFieldValue() {
        if (_weightsPerFieldValueField!= null) {
            return _weightsPerFieldValueField;
        } else {
            Object __rawValue = super._map.get("weightsPerFieldValue");
            _weightsPerFieldValueField = ((__rawValue == null)?null:new DoubleMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _weightsPerFieldValueField;
        }
    }

    /**
     * Setter for weightsPerFieldValue
     * 
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    public DataHubSearchConfig setWeightsPerFieldValue(
        @Nullable
        DoubleMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setWeightsPerFieldValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeWeightsPerFieldValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "weightsPerFieldValue", value.data());
                    _weightsPerFieldValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "weightsPerFieldValue", value.data());
                    _weightsPerFieldValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for weightsPerFieldValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#weightsPerFieldValue
     */
    public DataHubSearchConfig setWeightsPerFieldValue(
        @Nonnull
        DoubleMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field weightsPerFieldValue of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "weightsPerFieldValue", value.data());
            _weightsPerFieldValueField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldNameAliases
     * 
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    public boolean hasFieldNameAliases() {
        if (_fieldNameAliasesField!= null) {
            return true;
        }
        return super._map.containsKey("fieldNameAliases");
    }

    /**
     * Remover for fieldNameAliases
     * 
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    public void removeFieldNameAliases() {
        super._map.remove("fieldNameAliases");
    }

    /**
     * Getter for fieldNameAliases
     * 
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    @Nullable
    public StringArray getFieldNameAliases(GetMode mode) {
        return getFieldNameAliases();
    }

    /**
     * Getter for fieldNameAliases
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    @Nullable
    public StringArray getFieldNameAliases() {
        if (_fieldNameAliasesField!= null) {
            return _fieldNameAliasesField;
        } else {
            Object __rawValue = super._map.get("fieldNameAliases");
            _fieldNameAliasesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fieldNameAliasesField;
        }
    }

    /**
     * Setter for fieldNameAliases
     * 
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    public DataHubSearchConfig setFieldNameAliases(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldNameAliases(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldNameAliases();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldNameAliases", value.data());
                    _fieldNameAliasesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldNameAliases", value.data());
                    _fieldNameAliasesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldNameAliases
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubSearchConfig.Fields#fieldNameAliases
     */
    public DataHubSearchConfig setFieldNameAliases(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldNameAliases of com.linkedin.datahub.DataHubSearchConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldNameAliases", value.data());
            _fieldNameAliasesField = value;
        }
        return this;
    }

    @Override
    public DataHubSearchConfig clone()
        throws CloneNotSupportedException
    {
        DataHubSearchConfig __clone = ((DataHubSearchConfig) super.clone());
        __clone.__changeListener = new DataHubSearchConfig.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubSearchConfig copy()
        throws CloneNotSupportedException
    {
        DataHubSearchConfig __copy = ((DataHubSearchConfig) super.copy());
        __copy._enableAutocompleteField = null;
        __copy._fieldNameAliasesField = null;
        __copy._fieldNameField = null;
        __copy._weightsPerFieldValueField = null;
        __copy._boostScoreField = null;
        __copy._hasValuesFieldNameField = null;
        __copy._queryByDefaultField = null;
        __copy._numValuesFieldNameField = null;
        __copy._addToFiltersField = null;
        __copy._addHasValuesToFiltersField = null;
        __copy._hasValuesFilterNameOverrideField = null;
        __copy._filterNameOverrideField = null;
        __copy._fieldTypeField = null;
        __copy.__changeListener = new DataHubSearchConfig.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubSearchConfig __objectRef;

        private ChangeListener(DataHubSearchConfig reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "enableAutocomplete":
                    __objectRef._enableAutocompleteField = null;
                    break;
                case "fieldNameAliases":
                    __objectRef._fieldNameAliasesField = null;
                    break;
                case "fieldName":
                    __objectRef._fieldNameField = null;
                    break;
                case "weightsPerFieldValue":
                    __objectRef._weightsPerFieldValueField = null;
                    break;
                case "boostScore":
                    __objectRef._boostScoreField = null;
                    break;
                case "hasValuesFieldName":
                    __objectRef._hasValuesFieldNameField = null;
                    break;
                case "queryByDefault":
                    __objectRef._queryByDefaultField = null;
                    break;
                case "numValuesFieldName":
                    __objectRef._numValuesFieldNameField = null;
                    break;
                case "addToFilters":
                    __objectRef._addToFiltersField = null;
                    break;
                case "addHasValuesToFilters":
                    __objectRef._addHasValuesToFiltersField = null;
                    break;
                case "hasValuesFilterNameOverride":
                    __objectRef._hasValuesFilterNameOverrideField = null;
                    break;
                case "filterNameOverride":
                    __objectRef._filterNameOverrideField = null;
                    break;
                case "fieldType":
                    __objectRef._fieldTypeField = null;
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
         * Name of the field in the search index. Defaults to the field name otherwise
         * 
         * 
         */
        public PathSpec fieldName() {
            return new PathSpec(getPathComponents(), "fieldName");
        }

        /**
         * Type of the field. Defines how the field is indexed and matched
         * 
         * 
         */
        public PathSpec fieldType() {
            return new PathSpec(getPathComponents(), "fieldType");
        }

        /**
         * Whether we should match the field for the default search query
         * 
         * 
         */
        public PathSpec queryByDefault() {
            return new PathSpec(getPathComponents(), "queryByDefault");
        }

        /**
         * Whether we should use the field for default autocomplete
         * 
         * 
         */
        public PathSpec enableAutocomplete() {
            return new PathSpec(getPathComponents(), "enableAutocomplete");
        }

        /**
         * Whether or not to add field to filters.
         * 
         * 
         */
        public PathSpec addToFilters() {
            return new PathSpec(getPathComponents(), "addToFilters");
        }

        /**
         * Whether or not to add the "has values" to filters.
         * check if this is conditional on addToFilters being true
         * 
         * 
         */
        public PathSpec addHasValuesToFilters() {
            return new PathSpec(getPathComponents(), "addHasValuesToFilters");
        }

        /**
         * Display name of the filter
         * 
         * 
         */
        public PathSpec filterNameOverride() {
            return new PathSpec(getPathComponents(), "filterNameOverride");
        }

        /**
         * Display name of the has values filter
         * 
         * 
         */
        public PathSpec hasValuesFilterNameOverride() {
            return new PathSpec(getPathComponents(), "hasValuesFilterNameOverride");
        }

        /**
         * Boost multiplier to the match score. Matches on fields with higher boost score ranks higher
         * 
         * 
         */
        public PathSpec boostScore() {
            return new PathSpec(getPathComponents(), "boostScore");
        }

        /**
         * If set, add a index field of the given name that checks whether the field exists
         * 
         * 
         */
        public PathSpec hasValuesFieldName() {
            return new PathSpec(getPathComponents(), "hasValuesFieldName");
        }

        /**
         * If set, add a index field of the given name that checks the number of elements
         * 
         * 
         */
        public PathSpec numValuesFieldName() {
            return new PathSpec(getPathComponents(), "numValuesFieldName");
        }

        /**
         * (Optional) Weights to apply to score for a given value
         * 
         * 
         */
        public PathSpec weightsPerFieldValue() {
            return new PathSpec(getPathComponents(), "weightsPerFieldValue");
        }

        /**
         * (Optional) Aliases for this given field that can be used for sorting etc.
         * 
         * 
         */
        public PathSpec fieldNameAliases() {
            return new PathSpec(getPathComponents(), "fieldNameAliases");
        }

        /**
         * (Optional) Aliases for this given field that can be used for sorting etc.
         * 
         * 
         */
        public PathSpec fieldNameAliases(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldNameAliases");
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


        ProjectionMask() {
        }

        /**
         * Name of the field in the search index. Defaults to the field name otherwise
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withFieldName() {
            getDataMap().put("fieldName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of the field. Defines how the field is indexed and matched
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withFieldType() {
            getDataMap().put("fieldType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether we should match the field for the default search query
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withQueryByDefault() {
            getDataMap().put("queryByDefault", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether we should use the field for default autocomplete
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withEnableAutocomplete() {
            getDataMap().put("enableAutocomplete", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not to add field to filters.
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withAddToFilters() {
            getDataMap().put("addToFilters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not to add the "has values" to filters.
         * check if this is conditional on addToFilters being true
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withAddHasValuesToFilters() {
            getDataMap().put("addHasValuesToFilters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the filter
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withFilterNameOverride() {
            getDataMap().put("filterNameOverride", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the has values filter
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withHasValuesFilterNameOverride() {
            getDataMap().put("hasValuesFilterNameOverride", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Boost multiplier to the match score. Matches on fields with higher boost score ranks higher
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withBoostScore() {
            getDataMap().put("boostScore", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If set, add a index field of the given name that checks whether the field exists
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withHasValuesFieldName() {
            getDataMap().put("hasValuesFieldName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If set, add a index field of the given name that checks the number of elements
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withNumValuesFieldName() {
            getDataMap().put("numValuesFieldName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * (Optional) Weights to apply to score for a given value
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withWeightsPerFieldValue() {
            getDataMap().put("weightsPerFieldValue", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * (Optional) Aliases for this given field that can be used for sorting etc.
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withFieldNameAliases() {
            getDataMap().put("fieldNameAliases", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * (Optional) Aliases for this given field that can be used for sorting etc.
         * 
         * 
         */
        public DataHubSearchConfig.ProjectionMask withFieldNameAliases(Integer start, Integer count) {
            getDataMap().put("fieldNameAliases", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fieldNameAliases").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fieldNameAliases").put("$count", count);
            }
            return this;
        }

    }

}
