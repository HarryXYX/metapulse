
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Intended Use for the ML Model
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/IntendedUse.pdl.")
public class IntendedUse
    extends RecordTemplate
{

    private final static IntendedUse.Fields _fields = new IntendedUse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _primaryUsesField = null;
    private IntendedUserTypeArray _primaryUsersField = null;
    private StringArray _outOfScopeUsesField = null;
    private IntendedUse.ChangeListener __changeListener = new IntendedUse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_PrimaryUses = SCHEMA.getField("primaryUses");
    private final static RecordDataSchema.Field FIELD_PrimaryUsers = SCHEMA.getField("primaryUsers");
    private final static RecordDataSchema.Field FIELD_OutOfScopeUses = SCHEMA.getField("outOfScopeUses");

    public IntendedUse() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public IntendedUse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IntendedUse.Fields fields() {
        return _fields;
    }

    public static IntendedUse.ProjectionMask createMask() {
        return new IntendedUse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public boolean hasPrimaryUses() {
        if (_primaryUsesField!= null) {
            return true;
        }
        return super._map.containsKey("primaryUses");
    }

    /**
     * Remover for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public void removePrimaryUses() {
        super._map.remove("primaryUses");
    }

    /**
     * Getter for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    @Nullable
    public StringArray getPrimaryUses(GetMode mode) {
        return getPrimaryUses();
    }

    /**
     * Getter for primaryUses
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#primaryUses
     */
    @Nullable
    public StringArray getPrimaryUses() {
        if (_primaryUsesField!= null) {
            return _primaryUsesField;
        } else {
            Object __rawValue = super._map.get("primaryUses");
            _primaryUsesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _primaryUsesField;
        }
    }

    /**
     * Setter for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public IntendedUse setPrimaryUses(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrimaryUses(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrimaryUses();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primaryUses", value.data());
                    _primaryUsesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "primaryUses", value.data());
                    _primaryUsesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for primaryUses
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#primaryUses
     */
    public IntendedUse setPrimaryUses(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field primaryUses of com.linkedin.ml.metadata.IntendedUse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "primaryUses", value.data());
            _primaryUsesField = value;
        }
        return this;
    }

    /**
     * Existence checker for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public boolean hasPrimaryUsers() {
        if (_primaryUsersField!= null) {
            return true;
        }
        return super._map.containsKey("primaryUsers");
    }

    /**
     * Remover for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public void removePrimaryUsers() {
        super._map.remove("primaryUsers");
    }

    /**
     * Getter for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    @Nullable
    public IntendedUserTypeArray getPrimaryUsers(GetMode mode) {
        return getPrimaryUsers();
    }

    /**
     * Getter for primaryUsers
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#primaryUsers
     */
    @Nullable
    public IntendedUserTypeArray getPrimaryUsers() {
        if (_primaryUsersField!= null) {
            return _primaryUsersField;
        } else {
            Object __rawValue = super._map.get("primaryUsers");
            _primaryUsersField = ((__rawValue == null)?null:new IntendedUserTypeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _primaryUsersField;
        }
    }

    /**
     * Setter for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public IntendedUse setPrimaryUsers(
        @Nullable
        IntendedUserTypeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrimaryUsers(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrimaryUsers();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primaryUsers", value.data());
                    _primaryUsersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "primaryUsers", value.data());
                    _primaryUsersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for primaryUsers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#primaryUsers
     */
    public IntendedUse setPrimaryUsers(
        @Nonnull
        IntendedUserTypeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field primaryUsers of com.linkedin.ml.metadata.IntendedUse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "primaryUsers", value.data());
            _primaryUsersField = value;
        }
        return this;
    }

    /**
     * Existence checker for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public boolean hasOutOfScopeUses() {
        if (_outOfScopeUsesField!= null) {
            return true;
        }
        return super._map.containsKey("outOfScopeUses");
    }

    /**
     * Remover for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public void removeOutOfScopeUses() {
        super._map.remove("outOfScopeUses");
    }

    /**
     * Getter for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    @Nullable
    public StringArray getOutOfScopeUses(GetMode mode) {
        return getOutOfScopeUses();
    }

    /**
     * Getter for outOfScopeUses
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#outOfScopeUses
     */
    @Nullable
    public StringArray getOutOfScopeUses() {
        if (_outOfScopeUsesField!= null) {
            return _outOfScopeUsesField;
        } else {
            Object __rawValue = super._map.get("outOfScopeUses");
            _outOfScopeUsesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outOfScopeUsesField;
        }
    }

    /**
     * Setter for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public IntendedUse setOutOfScopeUses(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutOfScopeUses(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutOfScopeUses();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outOfScopeUses", value.data());
                    _outOfScopeUsesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outOfScopeUses", value.data());
                    _outOfScopeUsesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outOfScopeUses
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public IntendedUse setOutOfScopeUses(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outOfScopeUses of com.linkedin.ml.metadata.IntendedUse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outOfScopeUses", value.data());
            _outOfScopeUsesField = value;
        }
        return this;
    }

    @Override
    public IntendedUse clone()
        throws CloneNotSupportedException
    {
        IntendedUse __clone = ((IntendedUse) super.clone());
        __clone.__changeListener = new IntendedUse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IntendedUse copy()
        throws CloneNotSupportedException
    {
        IntendedUse __copy = ((IntendedUse) super.copy());
        __copy._primaryUsesField = null;
        __copy._outOfScopeUsesField = null;
        __copy._primaryUsersField = null;
        __copy.__changeListener = new IntendedUse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IntendedUse __objectRef;

        private ChangeListener(IntendedUse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "primaryUses":
                    __objectRef._primaryUsesField = null;
                    break;
                case "outOfScopeUses":
                    __objectRef._outOfScopeUsesField = null;
                    break;
                case "primaryUsers":
                    __objectRef._primaryUsersField = null;
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
         * Primary Use cases for the MLModel.
         * 
         */
        public PathSpec primaryUses() {
            return new PathSpec(getPathComponents(), "primaryUses");
        }

        /**
         * Primary Use cases for the MLModel.
         * 
         */
        public PathSpec primaryUses(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryUses");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public PathSpec primaryUsers() {
            return new PathSpec(getPathComponents(), "primaryUsers");
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public PathSpec primaryUsers(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryUsers");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public PathSpec outOfScopeUses() {
            return new PathSpec(getPathComponents(), "outOfScopeUses");
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public PathSpec outOfScopeUses(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outOfScopeUses");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Primary Use cases for the MLModel.
         * 
         */
        public IntendedUse.ProjectionMask withPrimaryUses() {
            getDataMap().put("primaryUses", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Primary Use cases for the MLModel.
         * 
         */
        public IntendedUse.ProjectionMask withPrimaryUses(Integer start, Integer count) {
            getDataMap().put("primaryUses", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("primaryUses").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("primaryUses").put("$count", count);
            }
            return this;
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public IntendedUse.ProjectionMask withPrimaryUsers() {
            getDataMap().put("primaryUsers", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public IntendedUse.ProjectionMask withPrimaryUsers(Integer start, Integer count) {
            getDataMap().put("primaryUsers", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("primaryUsers").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("primaryUsers").put("$count", count);
            }
            return this;
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public IntendedUse.ProjectionMask withOutOfScopeUses() {
            getDataMap().put("outOfScopeUses", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public IntendedUse.ProjectionMask withOutOfScopeUses(Integer start, Integer count) {
            getDataMap().put("outOfScopeUses", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outOfScopeUses").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outOfScopeUses").put("$count", count);
            }
            return this;
        }

    }

}
