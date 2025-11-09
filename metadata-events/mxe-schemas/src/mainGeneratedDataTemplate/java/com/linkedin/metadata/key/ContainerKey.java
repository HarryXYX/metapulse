
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
import com.linkedin.data.template.SetMode;


/**
 * Key for an Asset Container
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/ContainerKey.pdl.")
public class ContainerKey
    extends RecordTemplate
{

    private final static ContainerKey.Fields _fields = new ContainerKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an Asset Container*/@Aspect.name=\"containerKey\"record ContainerKey{/**Unique guid for container*/guid:optional string}", SchemaFormatType.PDL));
    private String _guidField = null;
    private ContainerKey.ChangeListener __changeListener = new ContainerKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Guid = SCHEMA.getField("guid");

    public ContainerKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ContainerKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ContainerKey.Fields fields() {
        return _fields;
    }

    public static ContainerKey.ProjectionMask createMask() {
        return new ContainerKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for guid
     * 
     * @see ContainerKey.Fields#guid
     */
    public boolean hasGuid() {
        if (_guidField!= null) {
            return true;
        }
        return super._map.containsKey("guid");
    }

    /**
     * Remover for guid
     * 
     * @see ContainerKey.Fields#guid
     */
    public void removeGuid() {
        super._map.remove("guid");
    }

    /**
     * Getter for guid
     * 
     * @see ContainerKey.Fields#guid
     */
    @Nullable
    public String getGuid(GetMode mode) {
        return getGuid();
    }

    /**
     * Getter for guid
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ContainerKey.Fields#guid
     */
    @Nullable
    public String getGuid() {
        if (_guidField!= null) {
            return _guidField;
        } else {
            Object __rawValue = super._map.get("guid");
            _guidField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _guidField;
        }
    }

    /**
     * Setter for guid
     * 
     * @see ContainerKey.Fields#guid
     */
    public ContainerKey setGuid(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGuid(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGuid();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "guid", value);
                    _guidField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "guid", value);
                    _guidField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for guid
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ContainerKey.Fields#guid
     */
    public ContainerKey setGuid(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field guid of com.linkedin.metadata.key.ContainerKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "guid", value);
            _guidField = value;
        }
        return this;
    }

    @Override
    public ContainerKey clone()
        throws CloneNotSupportedException
    {
        ContainerKey __clone = ((ContainerKey) super.clone());
        __clone.__changeListener = new ContainerKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ContainerKey copy()
        throws CloneNotSupportedException
    {
        ContainerKey __copy = ((ContainerKey) super.copy());
        __copy._guidField = null;
        __copy.__changeListener = new ContainerKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ContainerKey __objectRef;

        private ChangeListener(ContainerKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "guid":
                    __objectRef._guidField = null;
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
         * Unique guid for container
         * 
         */
        public PathSpec guid() {
            return new PathSpec(getPathComponents(), "guid");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Unique guid for container
         * 
         */
        public ContainerKey.ProjectionMask withGuid() {
            getDataMap().put("guid", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
