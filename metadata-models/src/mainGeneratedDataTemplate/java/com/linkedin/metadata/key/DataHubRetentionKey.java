
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
 * Key for a DataHub Retention
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataHubRetentionKey.pdl.")
public class DataHubRetentionKey
    extends RecordTemplate
{

    private final static DataHubRetentionKey.Fields _fields = new DataHubRetentionKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a DataHub Retention*/@Aspect.name=\"dataHubRetentionKey\"record DataHubRetentionKey{/**Entity name to apply retention to. * (or empty) for applying defaults.*/entityName:string/**Aspect name to apply retention to. * (or empty) for applying defaults.*/aspectName:string}", SchemaFormatType.PDL));
    private String _entityNameField = null;
    private String _aspectNameField = null;
    private DataHubRetentionKey.ChangeListener __changeListener = new DataHubRetentionKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityName = SCHEMA.getField("entityName");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");

    public DataHubRetentionKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubRetentionKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubRetentionKey.Fields fields() {
        return _fields;
    }

    public static DataHubRetentionKey.ProjectionMask createMask() {
        return new DataHubRetentionKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityName
     * 
     * @see DataHubRetentionKey.Fields#entityName
     */
    public boolean hasEntityName() {
        if (_entityNameField!= null) {
            return true;
        }
        return super._map.containsKey("entityName");
    }

    /**
     * Remover for entityName
     * 
     * @see DataHubRetentionKey.Fields#entityName
     */
    public void removeEntityName() {
        super._map.remove("entityName");
    }

    /**
     * Getter for entityName
     * 
     * @see DataHubRetentionKey.Fields#entityName
     */
    @Nullable
    public String getEntityName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityName();
            case DEFAULT:
            case NULL:
                if (_entityNameField!= null) {
                    return _entityNameField;
                } else {
                    Object __rawValue = super._map.get("entityName");
                    _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRetentionKey.Fields#entityName
     */
    @Nonnull
    public String getEntityName() {
        if (_entityNameField!= null) {
            return _entityNameField;
        } else {
            Object __rawValue = super._map.get("entityName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityName");
            }
            _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityNameField;
        }
    }

    /**
     * Setter for entityName
     * 
     * @see DataHubRetentionKey.Fields#entityName
     */
    public DataHubRetentionKey setEntityName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityName of com.linkedin.metadata.key.DataHubRetentionKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubRetentionKey.Fields#entityName
     */
    public DataHubRetentionKey setEntityName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityName of com.linkedin.metadata.key.DataHubRetentionKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityName", value);
            _entityNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see DataHubRetentionKey.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see DataHubRetentionKey.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see DataHubRetentionKey.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectName();
            case DEFAULT:
            case NULL:
                if (_aspectNameField!= null) {
                    return _aspectNameField;
                } else {
                    Object __rawValue = super._map.get("aspectName");
                    _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRetentionKey.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectName");
            }
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see DataHubRetentionKey.Fields#aspectName
     */
    public DataHubRetentionKey setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectName of com.linkedin.metadata.key.DataHubRetentionKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubRetentionKey.Fields#aspectName
     */
    public DataHubRetentionKey setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.metadata.key.DataHubRetentionKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    @Override
    public DataHubRetentionKey clone()
        throws CloneNotSupportedException
    {
        DataHubRetentionKey __clone = ((DataHubRetentionKey) super.clone());
        __clone.__changeListener = new DataHubRetentionKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubRetentionKey copy()
        throws CloneNotSupportedException
    {
        DataHubRetentionKey __copy = ((DataHubRetentionKey) super.copy());
        __copy._aspectNameField = null;
        __copy._entityNameField = null;
        __copy.__changeListener = new DataHubRetentionKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubRetentionKey __objectRef;

        private ChangeListener(DataHubRetentionKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "entityName":
                    __objectRef._entityNameField = null;
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
         * Entity name to apply retention to. * (or empty) for applying defaults.
         * 
         */
        public PathSpec entityName() {
            return new PathSpec(getPathComponents(), "entityName");
        }

        /**
         * Aspect name to apply retention to. * (or empty) for applying defaults.
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Entity name to apply retention to. * (or empty) for applying defaults.
         * 
         */
        public DataHubRetentionKey.ProjectionMask withEntityName() {
            getDataMap().put("entityName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Aspect name to apply retention to. * (or empty) for applying defaults.
         * 
         */
        public DataHubRetentionKey.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
