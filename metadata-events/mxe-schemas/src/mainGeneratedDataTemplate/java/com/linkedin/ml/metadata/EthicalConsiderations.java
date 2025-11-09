
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
 * This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/EthicalConsiderations.pdl.")
public class EthicalConsiderations
    extends RecordTemplate
{

    private final static EthicalConsiderations.Fields _fields = new EthicalConsiderations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _dataField = null;
    private StringArray _humanLifeField = null;
    private StringArray _mitigationsField = null;
    private StringArray _risksAndHarmsField = null;
    private StringArray _useCasesField = null;
    private EthicalConsiderations.ChangeListener __changeListener = new EthicalConsiderations.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Data = SCHEMA.getField("data");
    private final static RecordDataSchema.Field FIELD_HumanLife = SCHEMA.getField("humanLife");
    private final static RecordDataSchema.Field FIELD_Mitigations = SCHEMA.getField("mitigations");
    private final static RecordDataSchema.Field FIELD_RisksAndHarms = SCHEMA.getField("risksAndHarms");
    private final static RecordDataSchema.Field FIELD_UseCases = SCHEMA.getField("useCases");

    public EthicalConsiderations() {
        super(new DataMap(7, 0.75F), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public EthicalConsiderations(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EthicalConsiderations.Fields fields() {
        return _fields;
    }

    public static EthicalConsiderations.ProjectionMask createMask() {
        return new EthicalConsiderations.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public boolean hasData() {
        if (_dataField!= null) {
            return true;
        }
        return super._map.containsKey("data");
    }

    /**
     * Remover for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public void removeData() {
        super._map.remove("data");
    }

    /**
     * Getter for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    @Nullable
    public StringArray getData(GetMode mode) {
        return getData();
    }

    /**
     * Getter for data
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#data
     */
    @Nullable
    public StringArray getData() {
        if (_dataField!= null) {
            return _dataField;
        } else {
            Object __rawValue = super._map.get("data");
            _dataField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _dataField;
        }
    }

    /**
     * Setter for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public EthicalConsiderations setData(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setData(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeData();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "data", value.data());
                    _dataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "data", value.data());
                    _dataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for data
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#data
     */
    public EthicalConsiderations setData(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field data of com.linkedin.ml.metadata.EthicalConsiderations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "data", value.data());
            _dataField = value;
        }
        return this;
    }

    /**
     * Existence checker for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public boolean hasHumanLife() {
        if (_humanLifeField!= null) {
            return true;
        }
        return super._map.containsKey("humanLife");
    }

    /**
     * Remover for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public void removeHumanLife() {
        super._map.remove("humanLife");
    }

    /**
     * Getter for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    @Nullable
    public StringArray getHumanLife(GetMode mode) {
        return getHumanLife();
    }

    /**
     * Getter for humanLife
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#humanLife
     */
    @Nullable
    public StringArray getHumanLife() {
        if (_humanLifeField!= null) {
            return _humanLifeField;
        } else {
            Object __rawValue = super._map.get("humanLife");
            _humanLifeField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _humanLifeField;
        }
    }

    /**
     * Setter for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public EthicalConsiderations setHumanLife(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHumanLife(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHumanLife();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "humanLife", value.data());
                    _humanLifeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "humanLife", value.data());
                    _humanLifeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for humanLife
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#humanLife
     */
    public EthicalConsiderations setHumanLife(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field humanLife of com.linkedin.ml.metadata.EthicalConsiderations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "humanLife", value.data());
            _humanLifeField = value;
        }
        return this;
    }

    /**
     * Existence checker for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public boolean hasMitigations() {
        if (_mitigationsField!= null) {
            return true;
        }
        return super._map.containsKey("mitigations");
    }

    /**
     * Remover for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public void removeMitigations() {
        super._map.remove("mitigations");
    }

    /**
     * Getter for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    @Nullable
    public StringArray getMitigations(GetMode mode) {
        return getMitigations();
    }

    /**
     * Getter for mitigations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#mitigations
     */
    @Nullable
    public StringArray getMitigations() {
        if (_mitigationsField!= null) {
            return _mitigationsField;
        } else {
            Object __rawValue = super._map.get("mitigations");
            _mitigationsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _mitigationsField;
        }
    }

    /**
     * Setter for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public EthicalConsiderations setMitigations(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMitigations(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMitigations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mitigations", value.data());
                    _mitigationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mitigations", value.data());
                    _mitigationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mitigations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#mitigations
     */
    public EthicalConsiderations setMitigations(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mitigations of com.linkedin.ml.metadata.EthicalConsiderations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mitigations", value.data());
            _mitigationsField = value;
        }
        return this;
    }

    /**
     * Existence checker for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public boolean hasRisksAndHarms() {
        if (_risksAndHarmsField!= null) {
            return true;
        }
        return super._map.containsKey("risksAndHarms");
    }

    /**
     * Remover for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public void removeRisksAndHarms() {
        super._map.remove("risksAndHarms");
    }

    /**
     * Getter for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    @Nullable
    public StringArray getRisksAndHarms(GetMode mode) {
        return getRisksAndHarms();
    }

    /**
     * Getter for risksAndHarms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    @Nullable
    public StringArray getRisksAndHarms() {
        if (_risksAndHarmsField!= null) {
            return _risksAndHarmsField;
        } else {
            Object __rawValue = super._map.get("risksAndHarms");
            _risksAndHarmsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _risksAndHarmsField;
        }
    }

    /**
     * Setter for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public EthicalConsiderations setRisksAndHarms(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRisksAndHarms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRisksAndHarms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "risksAndHarms", value.data());
                    _risksAndHarmsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "risksAndHarms", value.data());
                    _risksAndHarmsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for risksAndHarms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public EthicalConsiderations setRisksAndHarms(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field risksAndHarms of com.linkedin.ml.metadata.EthicalConsiderations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "risksAndHarms", value.data());
            _risksAndHarmsField = value;
        }
        return this;
    }

    /**
     * Existence checker for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public boolean hasUseCases() {
        if (_useCasesField!= null) {
            return true;
        }
        return super._map.containsKey("useCases");
    }

    /**
     * Remover for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public void removeUseCases() {
        super._map.remove("useCases");
    }

    /**
     * Getter for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    @Nullable
    public StringArray getUseCases(GetMode mode) {
        return getUseCases();
    }

    /**
     * Getter for useCases
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#useCases
     */
    @Nullable
    public StringArray getUseCases() {
        if (_useCasesField!= null) {
            return _useCasesField;
        } else {
            Object __rawValue = super._map.get("useCases");
            _useCasesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _useCasesField;
        }
    }

    /**
     * Setter for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public EthicalConsiderations setUseCases(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUseCases(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUseCases();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "useCases", value.data());
                    _useCasesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "useCases", value.data());
                    _useCasesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for useCases
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#useCases
     */
    public EthicalConsiderations setUseCases(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field useCases of com.linkedin.ml.metadata.EthicalConsiderations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "useCases", value.data());
            _useCasesField = value;
        }
        return this;
    }

    @Override
    public EthicalConsiderations clone()
        throws CloneNotSupportedException
    {
        EthicalConsiderations __clone = ((EthicalConsiderations) super.clone());
        __clone.__changeListener = new EthicalConsiderations.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EthicalConsiderations copy()
        throws CloneNotSupportedException
    {
        EthicalConsiderations __copy = ((EthicalConsiderations) super.copy());
        __copy._useCasesField = null;
        __copy._dataField = null;
        __copy._risksAndHarmsField = null;
        __copy._mitigationsField = null;
        __copy._humanLifeField = null;
        __copy.__changeListener = new EthicalConsiderations.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EthicalConsiderations __objectRef;

        private ChangeListener(EthicalConsiderations reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "useCases":
                    __objectRef._useCasesField = null;
                    break;
                case "data":
                    __objectRef._dataField = null;
                    break;
                case "risksAndHarms":
                    __objectRef._risksAndHarmsField = null;
                    break;
                case "mitigations":
                    __objectRef._mitigationsField = null;
                    break;
                case "humanLife":
                    __objectRef._humanLifeField = null;
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
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public PathSpec data() {
            return new PathSpec(getPathComponents(), "data");
        }

        /**
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public PathSpec data(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "data");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public PathSpec humanLife() {
            return new PathSpec(getPathComponents(), "humanLife");
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public PathSpec humanLife(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "humanLife");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public PathSpec mitigations() {
            return new PathSpec(getPathComponents(), "mitigations");
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public PathSpec mitigations(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mitigations");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public PathSpec risksAndHarms() {
            return new PathSpec(getPathComponents(), "risksAndHarms");
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public PathSpec risksAndHarms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "risksAndHarms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public PathSpec useCases() {
            return new PathSpec(getPathComponents(), "useCases");
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public PathSpec useCases(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "useCases");
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
            super(7);
        }

        /**
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public EthicalConsiderations.ProjectionMask withData() {
            getDataMap().put("data", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public EthicalConsiderations.ProjectionMask withData(Integer start, Integer count) {
            getDataMap().put("data", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("data").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("data").put("$count", count);
            }
            return this;
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public EthicalConsiderations.ProjectionMask withHumanLife() {
            getDataMap().put("humanLife", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public EthicalConsiderations.ProjectionMask withHumanLife(Integer start, Integer count) {
            getDataMap().put("humanLife", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("humanLife").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("humanLife").put("$count", count);
            }
            return this;
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public EthicalConsiderations.ProjectionMask withMitigations() {
            getDataMap().put("mitigations", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public EthicalConsiderations.ProjectionMask withMitigations(Integer start, Integer count) {
            getDataMap().put("mitigations", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("mitigations").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("mitigations").put("$count", count);
            }
            return this;
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public EthicalConsiderations.ProjectionMask withRisksAndHarms() {
            getDataMap().put("risksAndHarms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public EthicalConsiderations.ProjectionMask withRisksAndHarms(Integer start, Integer count) {
            getDataMap().put("risksAndHarms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("risksAndHarms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("risksAndHarms").put("$count", count);
            }
            return this;
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public EthicalConsiderations.ProjectionMask withUseCases() {
            getDataMap().put("useCases", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public EthicalConsiderations.ProjectionMask withUseCases(Integer start, Integer count) {
            getDataMap().put("useCases", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("useCases").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("useCases").put("$count", count);
            }
            return this;
        }

    }

}
