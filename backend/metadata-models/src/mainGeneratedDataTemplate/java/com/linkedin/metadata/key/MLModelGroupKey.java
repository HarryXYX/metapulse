
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for an ML model group
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/MLModelGroupKey.pdl.")
public class MLModelGroupKey
    extends RecordTemplate
{

    private final static MLModelGroupKey.Fields _fields = new MLModelGroupKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an ML model group*/@Aspect.name=\"mlModelGroupKey\"record MLModelGroupKey{/**Standardized platform urn for the model group*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModelGroup*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fabric type where model group belongs to or where it was generated*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _platformField = null;
    private String _nameField = null;
    private FabricType _originField = null;
    private MLModelGroupKey.ChangeListener __changeListener = new MLModelGroupKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MLModelGroupKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLModelGroupKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelGroupKey.Fields fields() {
        return _fields;
    }

    public static MLModelGroupKey.ProjectionMask createMask() {
        return new MLModelGroupKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for platform
     * 
     * @see MLModelGroupKey.Fields#platform
     */
    public boolean hasPlatform() {
        if (_platformField!= null) {
            return true;
        }
        return super._map.containsKey("platform");
    }

    /**
     * Remover for platform
     * 
     * @see MLModelGroupKey.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see MLModelGroupKey.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatform();
            case DEFAULT:
            case NULL:
                if (_platformField!= null) {
                    return _platformField;
                } else {
                    Object __rawValue = super._map.get("platform");
                    _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _platformField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelGroupKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platform");
            }
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see MLModelGroupKey.Fields#platform
     */
    public MLModelGroupKey setPlatform(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.metadata.key.MLModelGroupKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelGroupKey.Fields#platform
     */
    public MLModelGroupKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.metadata.key.MLModelGroupKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLModelGroupKey.Fields#name
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
     * @see MLModelGroupKey.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see MLModelGroupKey.Fields#name
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
     * @see MLModelGroupKey.Fields#name
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
     * @see MLModelGroupKey.Fields#name
     */
    public MLModelGroupKey setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.key.MLModelGroupKey");
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
     * @see MLModelGroupKey.Fields#name
     */
    public MLModelGroupKey setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.key.MLModelGroupKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see MLModelGroupKey.Fields#origin
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
     * @see MLModelGroupKey.Fields#origin
     */
    public void removeOrigin() {
        super._map.remove("origin");
    }

    /**
     * Getter for origin
     * 
     * @see MLModelGroupKey.Fields#origin
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
     * @see MLModelGroupKey.Fields#origin
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
     * @see MLModelGroupKey.Fields#origin
     */
    public MLModelGroupKey setOrigin(
        @Nullable
        FabricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrigin(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field origin of com.linkedin.metadata.key.MLModelGroupKey");
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
     * @see MLModelGroupKey.Fields#origin
     */
    public MLModelGroupKey setOrigin(
        @Nonnull
        FabricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field origin of com.linkedin.metadata.key.MLModelGroupKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "origin", value.name());
            _originField = value;
        }
        return this;
    }

    @Override
    public MLModelGroupKey clone()
        throws CloneNotSupportedException
    {
        MLModelGroupKey __clone = ((MLModelGroupKey) super.clone());
        __clone.__changeListener = new MLModelGroupKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelGroupKey copy()
        throws CloneNotSupportedException
    {
        MLModelGroupKey __copy = ((MLModelGroupKey) super.copy());
        __copy._originField = null;
        __copy._nameField = null;
        __copy._platformField = null;
        __copy.__changeListener = new MLModelGroupKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelGroupKey __objectRef;

        private ChangeListener(MLModelGroupKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "origin":
                    __objectRef._originField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "platform":
                    __objectRef._platformField = null;
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
         * Standardized platform urn for the model group
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Name of the MLModelGroup
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fabric type where model group belongs to or where it was generated
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
         * Standardized platform urn for the model group
         * 
         */
        public MLModelGroupKey.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the MLModelGroup
         * 
         */
        public MLModelGroupKey.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fabric type where model group belongs to or where it was generated
         * 
         */
        public MLModelGroupKey.ProjectionMask withOrigin() {
            getDataMap().put("origin", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
