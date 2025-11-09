
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.MLFeatureDataType;
import com.linkedin.common.UrnArray;
import com.linkedin.common.VersionTag;
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
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a MLPrimaryKey
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/MLPrimaryKeyProperties.pdl.")
public class MLPrimaryKeyProperties
    extends RecordTemplate
{

    private final static MLPrimaryKeyProperties.Fields _fields = new MLPrimaryKeyProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyProperties\"record MLPrimaryKeyProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Documentation of the MLPrimaryKey*/description:optional string/**Data Type of the MLPrimaryKey*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories - mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories - either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data - no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period- daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLPrimaryKey*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}/**Source of the MLPrimaryKey*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DerivedFrom\"}sources:array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _descriptionField = null;
    private MLFeatureDataType _dataTypeField = null;
    private VersionTag _versionField = null;
    private UrnArray _sourcesField = null;
    private MLPrimaryKeyProperties.ChangeListener __changeListener = new MLPrimaryKeyProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_DataType = SCHEMA.getField("dataType");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Sources = SCHEMA.getField("sources");

    static {
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public MLPrimaryKeyProperties() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public MLPrimaryKeyProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLPrimaryKeyProperties.Fields fields() {
        return _fields;
    }

    public static MLPrimaryKeyProperties.ProjectionMask createMask() {
        return new MLPrimaryKeyProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLPrimaryKeyProperties.Fields#customProperties
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
     * @see MLPrimaryKeyProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see MLPrimaryKeyProperties.Fields#customProperties
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
     * @see MLPrimaryKeyProperties.Fields#customProperties
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
     * @see MLPrimaryKeyProperties.Fields#customProperties
     */
    public MLPrimaryKeyProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ml.metadata.MLPrimaryKeyProperties");
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
     * @see MLPrimaryKeyProperties.Fields#customProperties
     */
    public MLPrimaryKeyProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ml.metadata.MLPrimaryKeyProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLPrimaryKeyProperties.Fields#description
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
     * @see MLPrimaryKeyProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see MLPrimaryKeyProperties.Fields#description
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
     * @see MLPrimaryKeyProperties.Fields#description
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
     * @see MLPrimaryKeyProperties.Fields#description
     */
    public MLPrimaryKeyProperties setDescription(
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
     * @see MLPrimaryKeyProperties.Fields#description
     */
    public MLPrimaryKeyProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.MLPrimaryKeyProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for dataType
     * 
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    public boolean hasDataType() {
        if (_dataTypeField!= null) {
            return true;
        }
        return super._map.containsKey("dataType");
    }

    /**
     * Remover for dataType
     * 
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    public void removeDataType() {
        super._map.remove("dataType");
    }

    /**
     * Getter for dataType
     * 
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    @Nullable
    public MLFeatureDataType getDataType(GetMode mode) {
        return getDataType();
    }

    /**
     * Getter for dataType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    @Nullable
    public MLFeatureDataType getDataType() {
        if (_dataTypeField!= null) {
            return _dataTypeField;
        } else {
            Object __rawValue = super._map.get("dataType");
            _dataTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, MLFeatureDataType.class, MLFeatureDataType.$UNKNOWN);
            return _dataTypeField;
        }
    }

    /**
     * Setter for dataType
     * 
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    public MLPrimaryKeyProperties setDataType(
        @Nullable
        MLFeatureDataType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataType", value.name());
                    _dataTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataType", value.name());
                    _dataTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLPrimaryKeyProperties.Fields#dataType
     */
    public MLPrimaryKeyProperties setDataType(
        @Nonnull
        MLFeatureDataType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataType of com.linkedin.ml.metadata.MLPrimaryKeyProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataType", value.name());
            _dataTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLPrimaryKeyProperties.Fields#version
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
     * @see MLPrimaryKeyProperties.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see MLPrimaryKeyProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLPrimaryKeyProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = ((__rawValue == null)?null:new VersionTag(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see MLPrimaryKeyProperties.Fields#version
     */
    public MLPrimaryKeyProperties setVersion(
        @Nullable
        VersionTag value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
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
     * @see MLPrimaryKeyProperties.Fields#version
     */
    public MLPrimaryKeyProperties setVersion(
        @Nonnull
        VersionTag value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.ml.metadata.MLPrimaryKeyProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value.data());
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for sources
     * 
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    public boolean hasSources() {
        if (_sourcesField!= null) {
            return true;
        }
        return super._map.containsKey("sources");
    }

    /**
     * Remover for sources
     * 
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    public void removeSources() {
        super._map.remove("sources");
    }

    /**
     * Getter for sources
     * 
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    @Nullable
    public UrnArray getSources(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSources();
            case DEFAULT:
            case NULL:
                if (_sourcesField!= null) {
                    return _sourcesField;
                } else {
                    Object __rawValue = super._map.get("sources");
                    _sourcesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _sourcesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sources
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    @Nonnull
    public UrnArray getSources() {
        if (_sourcesField!= null) {
            return _sourcesField;
        } else {
            Object __rawValue = super._map.get("sources");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sources");
            }
            _sourcesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sourcesField;
        }
    }

    /**
     * Setter for sources
     * 
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    public MLPrimaryKeyProperties setSources(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSources(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sources of com.linkedin.ml.metadata.MLPrimaryKeyProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sources", value.data());
                    _sourcesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSources();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sources", value.data());
                    _sourcesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sources", value.data());
                    _sourcesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLPrimaryKeyProperties.Fields#sources
     */
    public MLPrimaryKeyProperties setSources(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sources of com.linkedin.ml.metadata.MLPrimaryKeyProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sources", value.data());
            _sourcesField = value;
        }
        return this;
    }

    @Override
    public MLPrimaryKeyProperties clone()
        throws CloneNotSupportedException
    {
        MLPrimaryKeyProperties __clone = ((MLPrimaryKeyProperties) super.clone());
        __clone.__changeListener = new MLPrimaryKeyProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLPrimaryKeyProperties copy()
        throws CloneNotSupportedException
    {
        MLPrimaryKeyProperties __copy = ((MLPrimaryKeyProperties) super.copy());
        __copy._customPropertiesField = null;
        __copy._sourcesField = null;
        __copy._dataTypeField = null;
        __copy._descriptionField = null;
        __copy._versionField = null;
        __copy.__changeListener = new MLPrimaryKeyProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLPrimaryKeyProperties __objectRef;

        private ChangeListener(MLPrimaryKeyProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "sources":
                    __objectRef._sourcesField = null;
                    break;
                case "dataType":
                    __objectRef._dataTypeField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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
         * Documentation of the MLPrimaryKey
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Data Type of the MLPrimaryKey
         * 
         */
        public PathSpec dataType() {
            return new PathSpec(getPathComponents(), "dataType");
        }

        /**
         * Version of the MLPrimaryKey
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Source of the MLPrimaryKey
         * 
         */
        public PathSpec sources() {
            return new PathSpec(getPathComponents(), "sources");
        }

        /**
         * Source of the MLPrimaryKey
         * 
         */
        public PathSpec sources(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sources");
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

        private com.linkedin.common.VersionTag.ProjectionMask _versionMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Custom property bag.
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Data Type of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withDataType() {
            getDataMap().put("dataType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Version of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withVersion(Function<com.linkedin.common.VersionTag.ProjectionMask, com.linkedin.common.VersionTag.ProjectionMask> nestedMask) {
            _versionMask = nestedMask.apply(((_versionMask == null)?VersionTag.createMask():_versionMask));
            getDataMap().put("version", _versionMask.getDataMap());
            return this;
        }

        /**
         * Version of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withVersion() {
            _versionMask = null;
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withSources() {
            getDataMap().put("sources", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source of the MLPrimaryKey
         * 
         */
        public MLPrimaryKeyProperties.ProjectionMask withSources(Integer start, Integer count) {
            getDataMap().put("sources", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sources").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sources").put("$count", count);
            }
            return this;
        }

    }

}
