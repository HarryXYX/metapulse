
package com.linkedin.ermodelrelation;

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
 * Individual Field Mapping of a relationship- one of several
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ermodelrelation/RelationshipFieldMapping.pdl.")
public class RelationshipFieldMapping
    extends RecordTemplate
{

    private final static RelationshipFieldMapping.Fields _fields = new RelationshipFieldMapping.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ermodelrelation/**Individual Field Mapping of a relationship- one of several*/record RelationshipFieldMapping{/**All fields from dataset A that are required for the join, maps to bFields 1:1*/sourceField:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**All fields from dataset B that are required for the join, maps to aFields 1:1*/destinationField:com.linkedin.dataset.SchemaFieldPath}", SchemaFormatType.PDL));
    private String _sourceFieldField = null;
    private String _destinationFieldField = null;
    private RelationshipFieldMapping.ChangeListener __changeListener = new RelationshipFieldMapping.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SourceField = SCHEMA.getField("sourceField");
    private final static RecordDataSchema.Field FIELD_DestinationField = SCHEMA.getField("destinationField");

    public RelationshipFieldMapping() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public RelationshipFieldMapping(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RelationshipFieldMapping.Fields fields() {
        return _fields;
    }

    public static RelationshipFieldMapping.ProjectionMask createMask() {
        return new RelationshipFieldMapping.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for sourceField
     * 
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    public boolean hasSourceField() {
        if (_sourceFieldField!= null) {
            return true;
        }
        return super._map.containsKey("sourceField");
    }

    /**
     * Remover for sourceField
     * 
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    public void removeSourceField() {
        super._map.remove("sourceField");
    }

    /**
     * Getter for sourceField
     * 
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    @Nullable
    public String getSourceField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceField();
            case DEFAULT:
            case NULL:
                if (_sourceFieldField!= null) {
                    return _sourceFieldField;
                } else {
                    Object __rawValue = super._map.get("sourceField");
                    _sourceFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _sourceFieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    @Nonnull
    public String getSourceField() {
        if (_sourceFieldField!= null) {
            return _sourceFieldField;
        } else {
            Object __rawValue = super._map.get("sourceField");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceField");
            }
            _sourceFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _sourceFieldField;
        }
    }

    /**
     * Setter for sourceField
     * 
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    public RelationshipFieldMapping setSourceField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceField of com.linkedin.ermodelrelation.RelationshipFieldMapping");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceField", value);
                    _sourceFieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceField", value);
                    _sourceFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceField", value);
                    _sourceFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFieldMapping.Fields#sourceField
     */
    public RelationshipFieldMapping setSourceField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceField of com.linkedin.ermodelrelation.RelationshipFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceField", value);
            _sourceFieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for destinationField
     * 
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    public boolean hasDestinationField() {
        if (_destinationFieldField!= null) {
            return true;
        }
        return super._map.containsKey("destinationField");
    }

    /**
     * Remover for destinationField
     * 
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    public void removeDestinationField() {
        super._map.remove("destinationField");
    }

    /**
     * Getter for destinationField
     * 
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    @Nullable
    public String getDestinationField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDestinationField();
            case DEFAULT:
            case NULL:
                if (_destinationFieldField!= null) {
                    return _destinationFieldField;
                } else {
                    Object __rawValue = super._map.get("destinationField");
                    _destinationFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _destinationFieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for destinationField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    @Nonnull
    public String getDestinationField() {
        if (_destinationFieldField!= null) {
            return _destinationFieldField;
        } else {
            Object __rawValue = super._map.get("destinationField");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("destinationField");
            }
            _destinationFieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _destinationFieldField;
        }
    }

    /**
     * Setter for destinationField
     * 
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    public RelationshipFieldMapping setDestinationField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDestinationField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field destinationField of com.linkedin.ermodelrelation.RelationshipFieldMapping");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", value);
                    _destinationFieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDestinationField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", value);
                    _destinationFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", value);
                    _destinationFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for destinationField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFieldMapping.Fields#destinationField
     */
    public RelationshipFieldMapping setDestinationField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field destinationField of com.linkedin.ermodelrelation.RelationshipFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "destinationField", value);
            _destinationFieldField = value;
        }
        return this;
    }

    @Override
    public RelationshipFieldMapping clone()
        throws CloneNotSupportedException
    {
        RelationshipFieldMapping __clone = ((RelationshipFieldMapping) super.clone());
        __clone.__changeListener = new RelationshipFieldMapping.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RelationshipFieldMapping copy()
        throws CloneNotSupportedException
    {
        RelationshipFieldMapping __copy = ((RelationshipFieldMapping) super.copy());
        __copy._sourceFieldField = null;
        __copy._destinationFieldField = null;
        __copy.__changeListener = new RelationshipFieldMapping.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RelationshipFieldMapping __objectRef;

        private ChangeListener(RelationshipFieldMapping reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceField":
                    __objectRef._sourceFieldField = null;
                    break;
                case "destinationField":
                    __objectRef._destinationFieldField = null;
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
         * All fields from dataset A that are required for the join, maps to bFields 1:1
         * 
         */
        public PathSpec sourceField() {
            return new PathSpec(getPathComponents(), "sourceField");
        }

        /**
         * All fields from dataset B that are required for the join, maps to aFields 1:1
         * 
         */
        public PathSpec destinationField() {
            return new PathSpec(getPathComponents(), "destinationField");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * All fields from dataset A that are required for the join, maps to bFields 1:1
         * 
         */
        public RelationshipFieldMapping.ProjectionMask withSourceField() {
            getDataMap().put("sourceField", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * All fields from dataset B that are required for the join, maps to aFields 1:1
         * 
         */
        public RelationshipFieldMapping.ProjectionMask withDestinationField() {
            getDataMap().put("destinationField", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
