
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Key for an MLFeature
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/MLFeatureKey.pdl.")
public class MLFeatureKey
    extends RecordTemplate
{

    private final static MLFeatureKey.Fields _fields = new MLFeatureKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}", SchemaFormatType.PDL));
    private String _featureNamespaceField = null;
    private String _nameField = null;
    private MLFeatureKey.ChangeListener __changeListener = new MLFeatureKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FeatureNamespace = SCHEMA.getField("featureNamespace");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    public MLFeatureKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLFeatureKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLFeatureKey.Fields fields() {
        return _fields;
    }

    public static MLFeatureKey.ProjectionMask createMask() {
        return new MLFeatureKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public boolean hasFeatureNamespace() {
        if (_featureNamespaceField!= null) {
            return true;
        }
        return super._map.containsKey("featureNamespace");
    }

    /**
     * Remover for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public void removeFeatureNamespace() {
        super._map.remove("featureNamespace");
    }

    /**
     * Getter for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    @Nullable
    public String getFeatureNamespace(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFeatureNamespace();
            case DEFAULT:
            case NULL:
                if (_featureNamespaceField!= null) {
                    return _featureNamespaceField;
                } else {
                    Object __rawValue = super._map.get("featureNamespace");
                    _featureNamespaceField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _featureNamespaceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for featureNamespace
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureKey.Fields#featureNamespace
     */
    @Nonnull
    public String getFeatureNamespace() {
        if (_featureNamespaceField!= null) {
            return _featureNamespaceField;
        } else {
            Object __rawValue = super._map.get("featureNamespace");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("featureNamespace");
            }
            _featureNamespaceField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _featureNamespaceField;
        }
    }

    /**
     * Setter for featureNamespace
     * 
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public MLFeatureKey setFeatureNamespace(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFeatureNamespace(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field featureNamespace of com.linkedin.metadata.key.MLFeatureKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "featureNamespace", value);
                    _featureNamespaceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFeatureNamespace();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "featureNamespace", value);
                    _featureNamespaceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "featureNamespace", value);
                    _featureNamespaceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for featureNamespace
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureKey.Fields#featureNamespace
     */
    public MLFeatureKey setFeatureNamespace(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field featureNamespace of com.linkedin.metadata.key.MLFeatureKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "featureNamespace", value);
            _featureNamespaceField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLFeatureKey.Fields#name
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
     * @see MLFeatureKey.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see MLFeatureKey.Fields#name
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
     * @see MLFeatureKey.Fields#name
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
     * @see MLFeatureKey.Fields#name
     */
    public MLFeatureKey setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.key.MLFeatureKey");
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
     * @see MLFeatureKey.Fields#name
     */
    public MLFeatureKey setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.key.MLFeatureKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    @Override
    public MLFeatureKey clone()
        throws CloneNotSupportedException
    {
        MLFeatureKey __clone = ((MLFeatureKey) super.clone());
        __clone.__changeListener = new MLFeatureKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLFeatureKey copy()
        throws CloneNotSupportedException
    {
        MLFeatureKey __copy = ((MLFeatureKey) super.copy());
        __copy._nameField = null;
        __copy._featureNamespaceField = null;
        __copy.__changeListener = new MLFeatureKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLFeatureKey __objectRef;

        private ChangeListener(MLFeatureKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "featureNamespace":
                    __objectRef._featureNamespaceField = null;
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
         * Namespace for the feature
         * 
         */
        public PathSpec featureNamespace() {
            return new PathSpec(getPathComponents(), "featureNamespace");
        }

        /**
         * Name of the feature
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Namespace for the feature
         * 
         */
        public MLFeatureKey.ProjectionMask withFeatureNamespace() {
            getDataMap().put("featureNamespace", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the feature
         * 
         */
        public MLFeatureKey.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
