
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
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
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/CaveatsAndRecommendations.pdl.")
public class CaveatsAndRecommendations
    extends RecordTemplate
{

    private final static CaveatsAndRecommendations.Fields _fields = new CaveatsAndRecommendations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}", SchemaFormatType.PDL));
    private CaveatDetails _caveatsField = null;
    private String _recommendationsField = null;
    private StringArray _idealDatasetCharacteristicsField = null;
    private CaveatsAndRecommendations.ChangeListener __changeListener = new CaveatsAndRecommendations.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Caveats = SCHEMA.getField("caveats");
    private final static RecordDataSchema.Field FIELD_Recommendations = SCHEMA.getField("recommendations");
    private final static RecordDataSchema.Field FIELD_IdealDatasetCharacteristics = SCHEMA.getField("idealDatasetCharacteristics");

    public CaveatsAndRecommendations() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public CaveatsAndRecommendations(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CaveatsAndRecommendations.Fields fields() {
        return _fields;
    }

    public static CaveatsAndRecommendations.ProjectionMask createMask() {
        return new CaveatsAndRecommendations.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public boolean hasCaveats() {
        if (_caveatsField!= null) {
            return true;
        }
        return super._map.containsKey("caveats");
    }

    /**
     * Remover for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public void removeCaveats() {
        super._map.remove("caveats");
    }

    /**
     * Getter for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    @Nullable
    public CaveatDetails getCaveats(GetMode mode) {
        return getCaveats();
    }

    /**
     * Getter for caveats
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    @Nullable
    public CaveatDetails getCaveats() {
        if (_caveatsField!= null) {
            return _caveatsField;
        } else {
            Object __rawValue = super._map.get("caveats");
            _caveatsField = ((__rawValue == null)?null:new CaveatDetails(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _caveatsField;
        }
    }

    /**
     * Setter for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public CaveatsAndRecommendations setCaveats(
        @Nullable
        CaveatDetails value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCaveats(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCaveats();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "caveats", value.data());
                    _caveatsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "caveats", value.data());
                    _caveatsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for caveats
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public CaveatsAndRecommendations setCaveats(
        @Nonnull
        CaveatDetails value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field caveats of com.linkedin.ml.metadata.CaveatsAndRecommendations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "caveats", value.data());
            _caveatsField = value;
        }
        return this;
    }

    /**
     * Existence checker for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public boolean hasRecommendations() {
        if (_recommendationsField!= null) {
            return true;
        }
        return super._map.containsKey("recommendations");
    }

    /**
     * Remover for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public void removeRecommendations() {
        super._map.remove("recommendations");
    }

    /**
     * Getter for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    @Nullable
    public String getRecommendations(GetMode mode) {
        return getRecommendations();
    }

    /**
     * Getter for recommendations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    @Nullable
    public String getRecommendations() {
        if (_recommendationsField!= null) {
            return _recommendationsField;
        } else {
            Object __rawValue = super._map.get("recommendations");
            _recommendationsField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _recommendationsField;
        }
    }

    /**
     * Setter for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public CaveatsAndRecommendations setRecommendations(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRecommendations(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRecommendations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "recommendations", value);
                    _recommendationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "recommendations", value);
                    _recommendationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for recommendations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public CaveatsAndRecommendations setRecommendations(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field recommendations of com.linkedin.ml.metadata.CaveatsAndRecommendations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "recommendations", value);
            _recommendationsField = value;
        }
        return this;
    }

    /**
     * Existence checker for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public boolean hasIdealDatasetCharacteristics() {
        if (_idealDatasetCharacteristicsField!= null) {
            return true;
        }
        return super._map.containsKey("idealDatasetCharacteristics");
    }

    /**
     * Remover for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public void removeIdealDatasetCharacteristics() {
        super._map.remove("idealDatasetCharacteristics");
    }

    /**
     * Getter for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    @Nullable
    public StringArray getIdealDatasetCharacteristics(GetMode mode) {
        return getIdealDatasetCharacteristics();
    }

    /**
     * Getter for idealDatasetCharacteristics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    @Nullable
    public StringArray getIdealDatasetCharacteristics() {
        if (_idealDatasetCharacteristicsField!= null) {
            return _idealDatasetCharacteristicsField;
        } else {
            Object __rawValue = super._map.get("idealDatasetCharacteristics");
            _idealDatasetCharacteristicsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _idealDatasetCharacteristicsField;
        }
    }

    /**
     * Setter for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public CaveatsAndRecommendations setIdealDatasetCharacteristics(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIdealDatasetCharacteristics(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIdealDatasetCharacteristics();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "idealDatasetCharacteristics", value.data());
                    _idealDatasetCharacteristicsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "idealDatasetCharacteristics", value.data());
                    _idealDatasetCharacteristicsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for idealDatasetCharacteristics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public CaveatsAndRecommendations setIdealDatasetCharacteristics(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field idealDatasetCharacteristics of com.linkedin.ml.metadata.CaveatsAndRecommendations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "idealDatasetCharacteristics", value.data());
            _idealDatasetCharacteristicsField = value;
        }
        return this;
    }

    @Override
    public CaveatsAndRecommendations clone()
        throws CloneNotSupportedException
    {
        CaveatsAndRecommendations __clone = ((CaveatsAndRecommendations) super.clone());
        __clone.__changeListener = new CaveatsAndRecommendations.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CaveatsAndRecommendations copy()
        throws CloneNotSupportedException
    {
        CaveatsAndRecommendations __copy = ((CaveatsAndRecommendations) super.copy());
        __copy._recommendationsField = null;
        __copy._idealDatasetCharacteristicsField = null;
        __copy._caveatsField = null;
        __copy.__changeListener = new CaveatsAndRecommendations.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CaveatsAndRecommendations __objectRef;

        private ChangeListener(CaveatsAndRecommendations reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "recommendations":
                    __objectRef._recommendationsField = null;
                    break;
                case "idealDatasetCharacteristics":
                    __objectRef._idealDatasetCharacteristicsField = null;
                    break;
                case "caveats":
                    __objectRef._caveatsField = null;
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
         * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public com.linkedin.ml.metadata.CaveatDetails.Fields caveats() {
            return new com.linkedin.ml.metadata.CaveatDetails.Fields(getPathComponents(), "caveats");
        }

        /**
         * Recommendations on where this MLModel should be used.
         * 
         */
        public PathSpec recommendations() {
            return new PathSpec(getPathComponents(), "recommendations");
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public PathSpec idealDatasetCharacteristics() {
            return new PathSpec(getPathComponents(), "idealDatasetCharacteristics");
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public PathSpec idealDatasetCharacteristics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "idealDatasetCharacteristics");
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

        private com.linkedin.ml.metadata.CaveatDetails.ProjectionMask _caveatsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public CaveatsAndRecommendations.ProjectionMask withCaveats(Function<com.linkedin.ml.metadata.CaveatDetails.ProjectionMask, com.linkedin.ml.metadata.CaveatDetails.ProjectionMask> nestedMask) {
            _caveatsMask = nestedMask.apply(((_caveatsMask == null)?CaveatDetails.createMask():_caveatsMask));
            getDataMap().put("caveats", _caveatsMask.getDataMap());
            return this;
        }

        /**
         * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public CaveatsAndRecommendations.ProjectionMask withCaveats() {
            _caveatsMask = null;
            getDataMap().put("caveats", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Recommendations on where this MLModel should be used.
         * 
         */
        public CaveatsAndRecommendations.ProjectionMask withRecommendations() {
            getDataMap().put("recommendations", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public CaveatsAndRecommendations.ProjectionMask withIdealDatasetCharacteristics() {
            getDataMap().put("idealDatasetCharacteristics", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public CaveatsAndRecommendations.ProjectionMask withIdealDatasetCharacteristics(Integer start, Integer count) {
            getDataMap().put("idealDatasetCharacteristics", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("idealDatasetCharacteristics").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("idealDatasetCharacteristics").put("$count", count);
            }
            return this;
        }

    }

}
