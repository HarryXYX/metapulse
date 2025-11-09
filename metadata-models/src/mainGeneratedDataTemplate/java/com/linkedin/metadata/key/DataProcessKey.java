
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.FabricType;
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
 * Key for a Data Process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataProcessKey.pdl.")
public class DataProcessKey
    extends RecordTemplate
{

    private final static DataProcessKey.Fields _fields = new DataProcessKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"boostScore\":4.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _orchestratorField = null;
    private FabricType _originField = null;
    private DataProcessKey.ChangeListener __changeListener = new DataProcessKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    public DataProcessKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataProcessKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessKey.Fields fields() {
        return _fields;
    }

    public static DataProcessKey.ProjectionMask createMask() {
        return new DataProcessKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see DataProcessKey.Fields#name
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
     * @see DataProcessKey.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataProcessKey.Fields#name
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
     * @see DataProcessKey.Fields#name
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
     * @see DataProcessKey.Fields#name
     */
    public DataProcessKey setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.key.DataProcessKey");
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
     * @see DataProcessKey.Fields#name
     */
    public DataProcessKey setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.key.DataProcessKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        if (_orchestratorField!= null) {
            return true;
        }
        return super._map.containsKey("orchestrator");
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public void removeOrchestrator() {
        super._map.remove("orchestrator");
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOrchestrator();
            case DEFAULT:
            case NULL:
                if (_orchestratorField!= null) {
                    return _orchestratorField;
                } else {
                    Object __rawValue = super._map.get("orchestrator");
                    _orchestratorField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _orchestratorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessKey.Fields#orchestrator
     */
    @Nonnull
    public String getOrchestrator() {
        if (_orchestratorField!= null) {
            return _orchestratorField;
        } else {
            Object __rawValue = super._map.get("orchestrator");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("orchestrator");
            }
            _orchestratorField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _orchestratorField;
        }
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public DataProcessKey setOrchestrator(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrchestrator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field orchestrator of com.linkedin.metadata.key.DataProcessKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOrchestrator();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessKey.Fields#orchestrator
     */
    public DataProcessKey setOrchestrator(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field orchestrator of com.linkedin.metadata.key.DataProcessKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
            _orchestratorField = value;
        }
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public boolean hasOrigin() {
        if (_originField!= null) {
            return true;
        }
        return super._map.containsKey("origin");
    }

    /**
     * Remover for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public void removeOrigin() {
        super._map.remove("origin");
    }

    /**
     * Getter for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    @Nullable
    public FabricType getOrigin(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOrigin();
            case DEFAULT:
            case NULL:
                if (_originField!= null) {
                    return _originField;
                } else {
                    Object __rawValue = super._map.get("origin");
                    _originField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
                    return _originField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessKey.Fields#origin
     */
    @Nonnull
    public FabricType getOrigin() {
        if (_originField!= null) {
            return _originField;
        } else {
            Object __rawValue = super._map.get("origin");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("origin");
            }
            _originField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
            return _originField;
        }
    }

    /**
     * Setter for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public DataProcessKey setOrigin(
        @Nullable
        FabricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrigin(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field origin of com.linkedin.metadata.key.DataProcessKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "origin", value.name());
                    _originField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOrigin();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "origin", value.name());
                    _originField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "origin", value.name());
                    _originField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessKey.Fields#origin
     */
    public DataProcessKey setOrigin(
        @Nonnull
        FabricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field origin of com.linkedin.metadata.key.DataProcessKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "origin", value.name());
            _originField = value;
        }
        return this;
    }

    @Override
    public DataProcessKey clone()
        throws CloneNotSupportedException
    {
        DataProcessKey __clone = ((DataProcessKey) super.clone());
        __clone.__changeListener = new DataProcessKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessKey copy()
        throws CloneNotSupportedException
    {
        DataProcessKey __copy = ((DataProcessKey) super.copy());
        __copy._orchestratorField = null;
        __copy._originField = null;
        __copy._nameField = null;
        __copy.__changeListener = new DataProcessKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessKey __objectRef;

        private ChangeListener(DataProcessKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "orchestrator":
                    __objectRef._orchestratorField = null;
                    break;
                case "origin":
                    __objectRef._originField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
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
         * Process name i.e. an ETL job name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Standardized Orchestrator where data process is defined.
         * TODO: Migrate towards something that can be validated like DataPlatform urn
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Fabric type where dataset belongs to or where it was generated.
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Process name i.e. an ETL job name
         * 
         */
        public DataProcessKey.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standardized Orchestrator where data process is defined.
         * TODO: Migrate towards something that can be validated like DataPlatform urn
         * 
         */
        public DataProcessKey.ProjectionMask withOrchestrator() {
            getDataMap().put("orchestrator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fabric type where dataset belongs to or where it was generated.
         * 
         */
        public DataProcessKey.ProjectionMask withOrigin() {
            getDataMap().put("origin", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
