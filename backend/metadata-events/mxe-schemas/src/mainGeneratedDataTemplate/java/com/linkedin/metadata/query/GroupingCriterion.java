
package com.linkedin.metadata.query;

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
 * 
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/GroupingCriterion.pdl.")
public class GroupingCriterion
    extends RecordTemplate
{

    private final static GroupingCriterion.Fields _fields = new GroupingCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query,record GroupingCriterion{/**The type of the entity to be grouped.\ne.g. schemaField\nOmitting this field will result in all base entities being grouped.*/baseEntityType:optional string/**The type of the entity to be grouped into.\ne.g. dataset, domain, etc.*/groupingEntityType:string}", SchemaFormatType.PDL));
    private String _baseEntityTypeField = null;
    private String _groupingEntityTypeField = null;
    private GroupingCriterion.ChangeListener __changeListener = new GroupingCriterion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_BaseEntityType = SCHEMA.getField("baseEntityType");
    private final static RecordDataSchema.Field FIELD_GroupingEntityType = SCHEMA.getField("groupingEntityType");

    public GroupingCriterion() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GroupingCriterion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GroupingCriterion.Fields fields() {
        return _fields;
    }

    public static GroupingCriterion.ProjectionMask createMask() {
        return new GroupingCriterion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for baseEntityType
     * 
     * @see GroupingCriterion.Fields#baseEntityType
     */
    public boolean hasBaseEntityType() {
        if (_baseEntityTypeField!= null) {
            return true;
        }
        return super._map.containsKey("baseEntityType");
    }

    /**
     * Remover for baseEntityType
     * 
     * @see GroupingCriterion.Fields#baseEntityType
     */
    public void removeBaseEntityType() {
        super._map.remove("baseEntityType");
    }

    /**
     * Getter for baseEntityType
     * 
     * @see GroupingCriterion.Fields#baseEntityType
     */
    @Nullable
    public String getBaseEntityType(GetMode mode) {
        return getBaseEntityType();
    }

    /**
     * Getter for baseEntityType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GroupingCriterion.Fields#baseEntityType
     */
    @Nullable
    public String getBaseEntityType() {
        if (_baseEntityTypeField!= null) {
            return _baseEntityTypeField;
        } else {
            Object __rawValue = super._map.get("baseEntityType");
            _baseEntityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _baseEntityTypeField;
        }
    }

    /**
     * Setter for baseEntityType
     * 
     * @see GroupingCriterion.Fields#baseEntityType
     */
    public GroupingCriterion setBaseEntityType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBaseEntityType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBaseEntityType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "baseEntityType", value);
                    _baseEntityTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "baseEntityType", value);
                    _baseEntityTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for baseEntityType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingCriterion.Fields#baseEntityType
     */
    public GroupingCriterion setBaseEntityType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field baseEntityType of com.linkedin.metadata.query.GroupingCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "baseEntityType", value);
            _baseEntityTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for groupingEntityType
     * 
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    public boolean hasGroupingEntityType() {
        if (_groupingEntityTypeField!= null) {
            return true;
        }
        return super._map.containsKey("groupingEntityType");
    }

    /**
     * Remover for groupingEntityType
     * 
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    public void removeGroupingEntityType() {
        super._map.remove("groupingEntityType");
    }

    /**
     * Getter for groupingEntityType
     * 
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    @Nullable
    public String getGroupingEntityType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getGroupingEntityType();
            case DEFAULT:
            case NULL:
                if (_groupingEntityTypeField!= null) {
                    return _groupingEntityTypeField;
                } else {
                    Object __rawValue = super._map.get("groupingEntityType");
                    _groupingEntityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _groupingEntityTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groupingEntityType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    @Nonnull
    public String getGroupingEntityType() {
        if (_groupingEntityTypeField!= null) {
            return _groupingEntityTypeField;
        } else {
            Object __rawValue = super._map.get("groupingEntityType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("groupingEntityType");
            }
            _groupingEntityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _groupingEntityTypeField;
        }
    }

    /**
     * Setter for groupingEntityType
     * 
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    public GroupingCriterion setGroupingEntityType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupingEntityType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groupingEntityType of com.linkedin.metadata.query.GroupingCriterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingEntityType", value);
                    _groupingEntityTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupingEntityType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingEntityType", value);
                    _groupingEntityTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupingEntityType", value);
                    _groupingEntityTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupingEntityType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingCriterion.Fields#groupingEntityType
     */
    public GroupingCriterion setGroupingEntityType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupingEntityType of com.linkedin.metadata.query.GroupingCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupingEntityType", value);
            _groupingEntityTypeField = value;
        }
        return this;
    }

    @Override
    public GroupingCriterion clone()
        throws CloneNotSupportedException
    {
        GroupingCriterion __clone = ((GroupingCriterion) super.clone());
        __clone.__changeListener = new GroupingCriterion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GroupingCriterion copy()
        throws CloneNotSupportedException
    {
        GroupingCriterion __copy = ((GroupingCriterion) super.copy());
        __copy._groupingEntityTypeField = null;
        __copy._baseEntityTypeField = null;
        __copy.__changeListener = new GroupingCriterion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GroupingCriterion __objectRef;

        private ChangeListener(GroupingCriterion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "groupingEntityType":
                    __objectRef._groupingEntityTypeField = null;
                    break;
                case "baseEntityType":
                    __objectRef._baseEntityTypeField = null;
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
         * The type of the entity to be grouped.
         * e.g. schemaField
         * Omitting this field will result in all base entities being grouped.
         * 
         */
        public PathSpec baseEntityType() {
            return new PathSpec(getPathComponents(), "baseEntityType");
        }

        /**
         * The type of the entity to be grouped into.
         * e.g. dataset, domain, etc.
         * 
         */
        public PathSpec groupingEntityType() {
            return new PathSpec(getPathComponents(), "groupingEntityType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The type of the entity to be grouped.
         * e.g. schemaField
         * Omitting this field will result in all base entities being grouped.
         * 
         */
        public GroupingCriterion.ProjectionMask withBaseEntityType() {
            getDataMap().put("baseEntityType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the entity to be grouped into.
         * e.g. dataset, domain, etc.
         * 
         */
        public GroupingCriterion.ProjectionMask withGroupingEntityType() {
            getDataMap().put("groupingEntityType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
