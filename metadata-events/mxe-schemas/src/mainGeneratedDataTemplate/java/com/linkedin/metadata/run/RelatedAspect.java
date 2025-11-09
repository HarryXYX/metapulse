
package com.linkedin.metadata.run;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Metadata about how an aspect is related to some urn
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/RelatedAspect.pdl.")
public class RelatedAspect
    extends RecordTemplate
{

    private final static RelatedAspect.Fields _fields = new RelatedAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run/**Metadata about how an aspect is related to some urn*/record RelatedAspect{/** Urn of the entity that is referenced by the aspect.*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}aspect:string,relationship:string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _entityField = null;
    private String _aspectField = null;
    private String _relationshipField = null;
    private RelatedAspect.ChangeListener __changeListener = new RelatedAspect.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_Relationship = SCHEMA.getField("relationship");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RelatedAspect() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public RelatedAspect(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RelatedAspect.Fields fields() {
        return _fields;
    }

    public static RelatedAspect.ProjectionMask createMask() {
        return new RelatedAspect.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entity
     * 
     * @see RelatedAspect.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see RelatedAspect.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see RelatedAspect.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelatedAspect.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see RelatedAspect.Fields#entity
     */
    public RelatedAspect setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.metadata.run.RelatedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelatedAspect.Fields#entity
     */
    public RelatedAspect setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.run.RelatedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspect
     * 
     * @see RelatedAspect.Fields#aspect
     */
    public boolean hasAspect() {
        if (_aspectField!= null) {
            return true;
        }
        return super._map.containsKey("aspect");
    }

    /**
     * Remover for aspect
     * 
     * @see RelatedAspect.Fields#aspect
     */
    public void removeAspect() {
        super._map.remove("aspect");
    }

    /**
     * Getter for aspect
     * 
     * @see RelatedAspect.Fields#aspect
     */
    @Nullable
    public String getAspect(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspect();
            case DEFAULT:
            case NULL:
                if (_aspectField!= null) {
                    return _aspectField;
                } else {
                    Object __rawValue = super._map.get("aspect");
                    _aspectField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelatedAspect.Fields#aspect
     */
    @Nonnull
    public String getAspect() {
        if (_aspectField!= null) {
            return _aspectField;
        } else {
            Object __rawValue = super._map.get("aspect");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspect");
            }
            _aspectField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectField;
        }
    }

    /**
     * Setter for aspect
     * 
     * @see RelatedAspect.Fields#aspect
     */
    public RelatedAspect setAspect(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspect of com.linkedin.metadata.run.RelatedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelatedAspect.Fields#aspect
     */
    public RelatedAspect setAspect(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspect of com.linkedin.metadata.run.RelatedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspect", value);
            _aspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for relationship
     * 
     * @see RelatedAspect.Fields#relationship
     */
    public boolean hasRelationship() {
        if (_relationshipField!= null) {
            return true;
        }
        return super._map.containsKey("relationship");
    }

    /**
     * Remover for relationship
     * 
     * @see RelatedAspect.Fields#relationship
     */
    public void removeRelationship() {
        super._map.remove("relationship");
    }

    /**
     * Getter for relationship
     * 
     * @see RelatedAspect.Fields#relationship
     */
    @Nullable
    public String getRelationship(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelationship();
            case DEFAULT:
            case NULL:
                if (_relationshipField!= null) {
                    return _relationshipField;
                } else {
                    Object __rawValue = super._map.get("relationship");
                    _relationshipField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _relationshipField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for relationship
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelatedAspect.Fields#relationship
     */
    @Nonnull
    public String getRelationship() {
        if (_relationshipField!= null) {
            return _relationshipField;
        } else {
            Object __rawValue = super._map.get("relationship");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relationship");
            }
            _relationshipField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _relationshipField;
        }
    }

    /**
     * Setter for relationship
     * 
     * @see RelatedAspect.Fields#relationship
     */
    public RelatedAspect setRelationship(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelationship(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relationship of com.linkedin.metadata.run.RelatedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationship", value);
                    _relationshipField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelationship();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationship", value);
                    _relationshipField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relationship", value);
                    _relationshipField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relationship
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelatedAspect.Fields#relationship
     */
    public RelatedAspect setRelationship(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relationship of com.linkedin.metadata.run.RelatedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relationship", value);
            _relationshipField = value;
        }
        return this;
    }

    @Override
    public RelatedAspect clone()
        throws CloneNotSupportedException
    {
        RelatedAspect __clone = ((RelatedAspect) super.clone());
        __clone.__changeListener = new RelatedAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RelatedAspect copy()
        throws CloneNotSupportedException
    {
        RelatedAspect __copy = ((RelatedAspect) super.copy());
        __copy._aspectField = null;
        __copy._relationshipField = null;
        __copy._entityField = null;
        __copy.__changeListener = new RelatedAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RelatedAspect __objectRef;

        private ChangeListener(RelatedAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspect":
                    __objectRef._aspectField = null;
                    break;
                case "relationship":
                    __objectRef._relationshipField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         *  Urn of the entity that is referenced by the aspect.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        public PathSpec aspect() {
            return new PathSpec(getPathComponents(), "aspect");
        }

        public PathSpec relationship() {
            return new PathSpec(getPathComponents(), "relationship");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         *  Urn of the entity that is referenced by the aspect.
         * 
         */
        public RelatedAspect.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RelatedAspect.ProjectionMask withAspect() {
            getDataMap().put("aspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RelatedAspect.ProjectionMask withRelationship() {
            getDataMap().put("relationship", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
