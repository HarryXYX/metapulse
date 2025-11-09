
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
 * Key for a GlossaryNode
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/GlossaryNodeKey.pdl.")
public class GlossaryNodeKey
    extends RecordTemplate
{

    private final static GlossaryNodeKey.Fields _fields = new GlossaryNodeKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string}", SchemaFormatType.PDL));
    private String _nameField = null;
    private GlossaryNodeKey.ChangeListener __changeListener = new GlossaryNodeKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    public GlossaryNodeKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GlossaryNodeKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryNodeKey.Fields fields() {
        return _fields;
    }

    public static GlossaryNodeKey.ProjectionMask createMask() {
        return new GlossaryNodeKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see GlossaryNodeKey.Fields#name
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
     * @see GlossaryNodeKey.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see GlossaryNodeKey.Fields#name
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
     * @see GlossaryNodeKey.Fields#name
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
     * @see GlossaryNodeKey.Fields#name
     */
    public GlossaryNodeKey setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.key.GlossaryNodeKey");
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
     * @see GlossaryNodeKey.Fields#name
     */
    public GlossaryNodeKey setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.key.GlossaryNodeKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    @Override
    public GlossaryNodeKey clone()
        throws CloneNotSupportedException
    {
        GlossaryNodeKey __clone = ((GlossaryNodeKey) super.clone());
        __clone.__changeListener = new GlossaryNodeKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryNodeKey copy()
        throws CloneNotSupportedException
    {
        GlossaryNodeKey __copy = ((GlossaryNodeKey) super.copy());
        __copy._nameField = null;
        __copy.__changeListener = new GlossaryNodeKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryNodeKey __objectRef;

        private ChangeListener(GlossaryNodeKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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

        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public GlossaryNodeKey.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
