
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
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
 * Siblings information of an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Siblings.pdl.")
public class Siblings
    extends RecordTemplate
{

    private final static Siblings.Fields _fields = new Siblings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Siblings information of an entity.*/@Aspect.name=\"siblings\"record Siblings{/**List of sibling entities*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"name\":\"SiblingOf\"}@Searchable.`/*`={\"addHasValuesToFilters\":true,\"fieldName\":\"siblings\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasSiblings\",\"queryByDefault\":false}siblings:array[@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string]/**If this is the leader entity of the set of siblings*/primary:boolean}", SchemaFormatType.PDL));
    private UrnArray _siblingsField = null;
    private Boolean _primaryField = null;
    private Siblings.ChangeListener __changeListener = new Siblings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Siblings = SCHEMA.getField("siblings");
    private final static RecordDataSchema.Field FIELD_Primary = SCHEMA.getField("primary");

    public Siblings() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Siblings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Siblings.Fields fields() {
        return _fields;
    }

    public static Siblings.ProjectionMask createMask() {
        return new Siblings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for siblings
     * 
     * @see Siblings.Fields#siblings
     */
    public boolean hasSiblings() {
        if (_siblingsField!= null) {
            return true;
        }
        return super._map.containsKey("siblings");
    }

    /**
     * Remover for siblings
     * 
     * @see Siblings.Fields#siblings
     */
    public void removeSiblings() {
        super._map.remove("siblings");
    }

    /**
     * Getter for siblings
     * 
     * @see Siblings.Fields#siblings
     */
    @Nullable
    public UrnArray getSiblings(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSiblings();
            case DEFAULT:
            case NULL:
                if (_siblingsField!= null) {
                    return _siblingsField;
                } else {
                    Object __rawValue = super._map.get("siblings");
                    _siblingsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _siblingsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for siblings
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Siblings.Fields#siblings
     */
    @Nonnull
    public UrnArray getSiblings() {
        if (_siblingsField!= null) {
            return _siblingsField;
        } else {
            Object __rawValue = super._map.get("siblings");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("siblings");
            }
            _siblingsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _siblingsField;
        }
    }

    /**
     * Setter for siblings
     * 
     * @see Siblings.Fields#siblings
     */
    public Siblings setSiblings(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSiblings(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field siblings of com.linkedin.common.Siblings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "siblings", value.data());
                    _siblingsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSiblings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "siblings", value.data());
                    _siblingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "siblings", value.data());
                    _siblingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for siblings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Siblings.Fields#siblings
     */
    public Siblings setSiblings(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field siblings of com.linkedin.common.Siblings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "siblings", value.data());
            _siblingsField = value;
        }
        return this;
    }

    /**
     * Existence checker for primary
     * 
     * @see Siblings.Fields#primary
     */
    public boolean hasPrimary() {
        if (_primaryField!= null) {
            return true;
        }
        return super._map.containsKey("primary");
    }

    /**
     * Remover for primary
     * 
     * @see Siblings.Fields#primary
     */
    public void removePrimary() {
        super._map.remove("primary");
    }

    /**
     * Getter for primary
     * 
     * @see Siblings.Fields#primary
     */
    @Nullable
    public Boolean isPrimary(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isPrimary();
            case DEFAULT:
            case NULL:
                if (_primaryField!= null) {
                    return _primaryField;
                } else {
                    Object __rawValue = super._map.get("primary");
                    _primaryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _primaryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for primary
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Siblings.Fields#primary
     */
    @Nonnull
    public Boolean isPrimary() {
        if (_primaryField!= null) {
            return _primaryField;
        } else {
            Object __rawValue = super._map.get("primary");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("primary");
            }
            _primaryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _primaryField;
        }
    }

    /**
     * Setter for primary
     * 
     * @see Siblings.Fields#primary
     */
    public Siblings setPrimary(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrimary(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field primary of com.linkedin.common.Siblings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primary", value);
                    _primaryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrimary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primary", value);
                    _primaryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "primary", value);
                    _primaryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for primary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Siblings.Fields#primary
     */
    public Siblings setPrimary(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field primary of com.linkedin.common.Siblings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "primary", value);
            _primaryField = value;
        }
        return this;
    }

    /**
     * Setter for primary
     * 
     * @see Siblings.Fields#primary
     */
    public Siblings setPrimary(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "primary", value);
        _primaryField = value;
        return this;
    }

    @Override
    public Siblings clone()
        throws CloneNotSupportedException
    {
        Siblings __clone = ((Siblings) super.clone());
        __clone.__changeListener = new Siblings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Siblings copy()
        throws CloneNotSupportedException
    {
        Siblings __copy = ((Siblings) super.copy());
        __copy._siblingsField = null;
        __copy._primaryField = null;
        __copy.__changeListener = new Siblings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Siblings __objectRef;

        private ChangeListener(Siblings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "siblings":
                    __objectRef._siblingsField = null;
                    break;
                case "primary":
                    __objectRef._primaryField = null;
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
         * List of sibling entities
         * 
         */
        public PathSpec siblings() {
            return new PathSpec(getPathComponents(), "siblings");
        }

        /**
         * List of sibling entities
         * 
         */
        public PathSpec siblings(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "siblings");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * If this is the leader entity of the set of siblings
         * 
         */
        public PathSpec primary() {
            return new PathSpec(getPathComponents(), "primary");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * List of sibling entities
         * 
         */
        public Siblings.ProjectionMask withSiblings() {
            getDataMap().put("siblings", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of sibling entities
         * 
         */
        public Siblings.ProjectionMask withSiblings(Integer start, Integer count) {
            getDataMap().put("siblings", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("siblings").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("siblings").put("$count", count);
            }
            return this;
        }

        /**
         * If this is the leader entity of the set of siblings
         * 
         */
        public Siblings.ProjectionMask withPrimary() {
            getDataMap().put("primary", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
