
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/CaveatDetails.pdl.")
public class CaveatDetails
    extends RecordTemplate
{

    private final static CaveatDetails.Fields _fields = new CaveatDetails.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}", SchemaFormatType.PDL));
    private Boolean _needsFurtherTestingField = null;
    private String _caveatDescriptionField = null;
    private StringArray _groupsNotRepresentedField = null;
    private CaveatDetails.ChangeListener __changeListener = new CaveatDetails.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NeedsFurtherTesting = SCHEMA.getField("needsFurtherTesting");
    private final static RecordDataSchema.Field FIELD_CaveatDescription = SCHEMA.getField("caveatDescription");
    private final static RecordDataSchema.Field FIELD_GroupsNotRepresented = SCHEMA.getField("groupsNotRepresented");

    public CaveatDetails() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CaveatDetails(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CaveatDetails.Fields fields() {
        return _fields;
    }

    public static CaveatDetails.ProjectionMask createMask() {
        return new CaveatDetails.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public boolean hasNeedsFurtherTesting() {
        if (_needsFurtherTestingField!= null) {
            return true;
        }
        return super._map.containsKey("needsFurtherTesting");
    }

    /**
     * Remover for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public void removeNeedsFurtherTesting() {
        super._map.remove("needsFurtherTesting");
    }

    /**
     * Getter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    @Nullable
    public Boolean isNeedsFurtherTesting(GetMode mode) {
        return isNeedsFurtherTesting();
    }

    /**
     * Getter for needsFurtherTesting
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    @Nullable
    public Boolean isNeedsFurtherTesting() {
        if (_needsFurtherTestingField!= null) {
            return _needsFurtherTestingField;
        } else {
            Object __rawValue = super._map.get("needsFurtherTesting");
            _needsFurtherTestingField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _needsFurtherTestingField;
        }
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNeedsFurtherTesting(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNeedsFurtherTesting();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "needsFurtherTesting", value);
                    _needsFurtherTestingField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "needsFurtherTesting", value);
                    _needsFurtherTestingField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field needsFurtherTesting of com.linkedin.ml.metadata.CaveatDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "needsFurtherTesting", value);
            _needsFurtherTestingField = value;
        }
        return this;
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "needsFurtherTesting", value);
        _needsFurtherTestingField = value;
        return this;
    }

    /**
     * Existence checker for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public boolean hasCaveatDescription() {
        if (_caveatDescriptionField!= null) {
            return true;
        }
        return super._map.containsKey("caveatDescription");
    }

    /**
     * Remover for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public void removeCaveatDescription() {
        super._map.remove("caveatDescription");
    }

    /**
     * Getter for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    @Nullable
    public String getCaveatDescription(GetMode mode) {
        return getCaveatDescription();
    }

    /**
     * Getter for caveatDescription
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#caveatDescription
     */
    @Nullable
    public String getCaveatDescription() {
        if (_caveatDescriptionField!= null) {
            return _caveatDescriptionField;
        } else {
            Object __rawValue = super._map.get("caveatDescription");
            _caveatDescriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _caveatDescriptionField;
        }
    }

    /**
     * Setter for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public CaveatDetails setCaveatDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCaveatDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCaveatDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "caveatDescription", value);
                    _caveatDescriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "caveatDescription", value);
                    _caveatDescriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for caveatDescription
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#caveatDescription
     */
    public CaveatDetails setCaveatDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field caveatDescription of com.linkedin.ml.metadata.CaveatDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "caveatDescription", value);
            _caveatDescriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public boolean hasGroupsNotRepresented() {
        if (_groupsNotRepresentedField!= null) {
            return true;
        }
        return super._map.containsKey("groupsNotRepresented");
    }

    /**
     * Remover for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public void removeGroupsNotRepresented() {
        super._map.remove("groupsNotRepresented");
    }

    /**
     * Getter for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    @Nullable
    public StringArray getGroupsNotRepresented(GetMode mode) {
        return getGroupsNotRepresented();
    }

    /**
     * Getter for groupsNotRepresented
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    @Nullable
    public StringArray getGroupsNotRepresented() {
        if (_groupsNotRepresentedField!= null) {
            return _groupsNotRepresentedField;
        } else {
            Object __rawValue = super._map.get("groupsNotRepresented");
            _groupsNotRepresentedField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsNotRepresentedField;
        }
    }

    /**
     * Setter for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public CaveatDetails setGroupsNotRepresented(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupsNotRepresented(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupsNotRepresented();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupsNotRepresented", value.data());
                    _groupsNotRepresentedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupsNotRepresented", value.data());
                    _groupsNotRepresentedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupsNotRepresented
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public CaveatDetails setGroupsNotRepresented(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupsNotRepresented of com.linkedin.ml.metadata.CaveatDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupsNotRepresented", value.data());
            _groupsNotRepresentedField = value;
        }
        return this;
    }

    @Override
    public CaveatDetails clone()
        throws CloneNotSupportedException
    {
        CaveatDetails __clone = ((CaveatDetails) super.clone());
        __clone.__changeListener = new CaveatDetails.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CaveatDetails copy()
        throws CloneNotSupportedException
    {
        CaveatDetails __copy = ((CaveatDetails) super.copy());
        __copy._caveatDescriptionField = null;
        __copy._groupsNotRepresentedField = null;
        __copy._needsFurtherTestingField = null;
        __copy.__changeListener = new CaveatDetails.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CaveatDetails __objectRef;

        private ChangeListener(CaveatDetails reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "caveatDescription":
                    __objectRef._caveatDescriptionField = null;
                    break;
                case "groupsNotRepresented":
                    __objectRef._groupsNotRepresentedField = null;
                    break;
                case "needsFurtherTesting":
                    __objectRef._needsFurtherTestingField = null;
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
         * Did the results suggest any further testing?
         * 
         */
        public PathSpec needsFurtherTesting() {
            return new PathSpec(getPathComponents(), "needsFurtherTesting");
        }

        /**
         * Caveat Description
         * For ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.
         * 
         */
        public PathSpec caveatDescription() {
            return new PathSpec(getPathComponents(), "caveatDescription");
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public PathSpec groupsNotRepresented() {
            return new PathSpec(getPathComponents(), "groupsNotRepresented");
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public PathSpec groupsNotRepresented(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groupsNotRepresented");
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
            super(4);
        }

        /**
         * Did the results suggest any further testing?
         * 
         */
        public CaveatDetails.ProjectionMask withNeedsFurtherTesting() {
            getDataMap().put("needsFurtherTesting", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Caveat Description
         * For ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.
         * 
         */
        public CaveatDetails.ProjectionMask withCaveatDescription() {
            getDataMap().put("caveatDescription", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public CaveatDetails.ProjectionMask withGroupsNotRepresented() {
            getDataMap().put("groupsNotRepresented", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public CaveatDetails.ProjectionMask withGroupsNotRepresented(Integer start, Integer count) {
            getDataMap().put("groupsNotRepresented", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groupsNotRepresented").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groupsNotRepresented").put("$count", count);
            }
            return this;
        }

    }

}
