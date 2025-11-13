
package com.linkedin.schema;

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
 * If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/UrnForeignKey.pdl.")
public class UrnForeignKey
    extends RecordTemplate
{

    private final static UrnForeignKey.Fields _fields = new UrnForeignKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}}", SchemaFormatType.PDL));
    private String _currentFieldPathField = null;
    private UrnForeignKey.ChangeListener __changeListener = new UrnForeignKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CurrentFieldPath = SCHEMA.getField("currentFieldPath");

    public UrnForeignKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public UrnForeignKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UrnForeignKey.Fields fields() {
        return _fields;
    }

    public static UrnForeignKey.ProjectionMask createMask() {
        return new UrnForeignKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public boolean hasCurrentFieldPath() {
        if (_currentFieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("currentFieldPath");
    }

    /**
     * Remover for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public void removeCurrentFieldPath() {
        super._map.remove("currentFieldPath");
    }

    /**
     * Getter for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    @Nullable
    public String getCurrentFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCurrentFieldPath();
            case DEFAULT:
            case NULL:
                if (_currentFieldPathField!= null) {
                    return _currentFieldPathField;
                } else {
                    Object __rawValue = super._map.get("currentFieldPath");
                    _currentFieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _currentFieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for currentFieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    @Nonnull
    public String getCurrentFieldPath() {
        if (_currentFieldPathField!= null) {
            return _currentFieldPathField;
        } else {
            Object __rawValue = super._map.get("currentFieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("currentFieldPath");
            }
            _currentFieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _currentFieldPathField;
        }
    }

    /**
     * Setter for currentFieldPath
     * 
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public UrnForeignKey setCurrentFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCurrentFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field currentFieldPath of com.linkedin.schema.UrnForeignKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPath", value);
                    _currentFieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCurrentFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPath", value);
                    _currentFieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "currentFieldPath", value);
                    _currentFieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for currentFieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UrnForeignKey.Fields#currentFieldPath
     */
    public UrnForeignKey setCurrentFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field currentFieldPath of com.linkedin.schema.UrnForeignKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "currentFieldPath", value);
            _currentFieldPathField = value;
        }
        return this;
    }

    @Override
    public UrnForeignKey clone()
        throws CloneNotSupportedException
    {
        UrnForeignKey __clone = ((UrnForeignKey) super.clone());
        __clone.__changeListener = new UrnForeignKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UrnForeignKey copy()
        throws CloneNotSupportedException
    {
        UrnForeignKey __copy = ((UrnForeignKey) super.copy());
        __copy._currentFieldPathField = null;
        __copy.__changeListener = new UrnForeignKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UrnForeignKey __objectRef;

        private ChangeListener(UrnForeignKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "currentFieldPath":
                    __objectRef._currentFieldPathField = null;
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
         * Field in hosting(current) SchemaMetadata.
         * 
         */
        public PathSpec currentFieldPath() {
            return new PathSpec(getPathComponents(), "currentFieldPath");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Field in hosting(current) SchemaMetadata.
         * 
         */
        public UrnForeignKey.ProjectionMask withCurrentFieldPath() {
            getDataMap().put("currentFieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
