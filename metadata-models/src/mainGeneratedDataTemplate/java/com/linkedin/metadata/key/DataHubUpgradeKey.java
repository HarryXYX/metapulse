
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
 * Key for a DataHubUpgrade
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataHubUpgradeKey.pdl.")
public class DataHubUpgradeKey
    extends RecordTemplate
{

    private final static DataHubUpgradeKey.Fields _fields = new DataHubUpgradeKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a DataHubUpgrade*/@Aspect.name=\"dataHubUpgradeKey\"record DataHubUpgradeKey{id:string}", SchemaFormatType.PDL));
    private String _idField = null;
    private DataHubUpgradeKey.ChangeListener __changeListener = new DataHubUpgradeKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");

    public DataHubUpgradeKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubUpgradeKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubUpgradeKey.Fields fields() {
        return _fields;
    }

    public static DataHubUpgradeKey.ProjectionMask createMask() {
        return new DataHubUpgradeKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see DataHubUpgradeKey.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see DataHubUpgradeKey.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see DataHubUpgradeKey.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubUpgradeKey.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see DataHubUpgradeKey.Fields#id
     */
    public DataHubUpgradeKey setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.metadata.key.DataHubUpgradeKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeKey.Fields#id
     */
    public DataHubUpgradeKey setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.metadata.key.DataHubUpgradeKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    @Override
    public DataHubUpgradeKey clone()
        throws CloneNotSupportedException
    {
        DataHubUpgradeKey __clone = ((DataHubUpgradeKey) super.clone());
        __clone.__changeListener = new DataHubUpgradeKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubUpgradeKey copy()
        throws CloneNotSupportedException
    {
        DataHubUpgradeKey __copy = ((DataHubUpgradeKey) super.copy());
        __copy._idField = null;
        __copy.__changeListener = new DataHubUpgradeKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubUpgradeKey __objectRef;

        private ChangeListener(DataHubUpgradeKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "id":
                    __objectRef._idField = null;
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

        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public DataHubUpgradeKey.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
