
package com.linkedin.metadata.query;

import java.util.List;
import java.util.function.Function;
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


/**
 * A set of directives to control how results are grouped.
 * The underlying generic groupings are nested to allow for further evolution of the grouping spec.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/GroupingSpec.pdl.")
public class GroupingSpec
    extends RecordTemplate
{

    private final static GroupingSpec.Fields _fields = new GroupingSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**A set of directives to control how results are grouped.\nThe underlying generic groupings are nested to allow for further evolution of the grouping spec.*/record GroupingSpec{/**A list of generic directives to group results by.\n*/groupingCriteria:array[record GroupingCriterion{/**The type of the entity to be grouped.\ne.g. schemaField\nOmitting this field will result in all base entities being grouped.*/baseEntityType:optional string/**The type of the entity to be grouped into.\ne.g. dataset, domain, etc.*/groupingEntityType:string}]=[]}", SchemaFormatType.PDL));
    private GroupingCriterionArray _groupingCriteriaField = null;
    private GroupingSpec.ChangeListener __changeListener = new GroupingSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_GroupingCriteria = SCHEMA.getField("groupingCriteria");
    private final static GroupingCriterionArray DEFAULT_GroupingCriteria;

    static {
        DEFAULT_GroupingCriteria = ((FIELD_GroupingCriteria.getDefault() == null)?null:new GroupingCriterionArray(DataTemplateUtil.castOrThrow(FIELD_GroupingCriteria.getDefault(), DataList.class)));
    }

    public GroupingSpec() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GroupingSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GroupingSpec.Fields fields() {
        return _fields;
    }

    public static GroupingSpec.ProjectionMask createMask() {
        return new GroupingSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for groupingCriteria
     * 
     * @see GroupingSpec.Fields#groupingCriteria
     */
    public boolean hasGroupingCriteria() {
        if (_groupingCriteriaField!= null) {
            return true;
        }
        return super._map.containsKey("groupingCriteria");
    }

    /**
     * Remover for groupingCriteria
     * 
     * @see GroupingSpec.Fields#groupingCriteria
     */
    public void removeGroupingCriteria() {
        super._map.remove("groupingCriteria");
    }

    /**
     * Getter for groupingCriteria
     * 
     * @see GroupingSpec.Fields#groupingCriteria
     */
    @Nullable
    public GroupingCriterionArray getGroupingCriteria(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getGroupingCriteria();
            case NULL:
                if (_groupingCriteriaField!= null) {
                    return _groupingCriteriaField;
                } else {
                    Object __rawValue = super._map.get("groupingCriteria");
                    _groupingCriteriaField = ((__rawValue == null)?null:new GroupingCriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _groupingCriteriaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groupingCriteria
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupingSpec.Fields#groupingCriteria
     */
    @Nonnull
    public GroupingCriterionArray getGroupingCriteria() {
        if (_groupingCriteriaField!= null) {
            return _groupingCriteriaField;
        } else {
            Object __rawValue = super._map.get("groupingCriteria");
            if (__rawValue == null) {
                return DEFAULT_GroupingCriteria;
            }
            _groupingCriteriaField = ((__rawValue == null)?null:new GroupingCriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupingCriteriaField;
        }
    }

    /**
     * Setter for groupingCriteria
     * 
     * @see GroupingSpec.Fields#groupingCriteria
     */
    public GroupingSpec setGroupingCriteria(
        @Nullable
        GroupingCriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupingCriteria(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groupingCriteria of com.linkedin.metadata.query.GroupingSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingCriteria", value.data());
                    _groupingCriteriaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupingCriteria();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingCriteria", value.data());
                    _groupingCriteriaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupingCriteria", value.data());
                    _groupingCriteriaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupingCriteria
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingSpec.Fields#groupingCriteria
     */
    public GroupingSpec setGroupingCriteria(
        @Nonnull
        GroupingCriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupingCriteria of com.linkedin.metadata.query.GroupingSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupingCriteria", value.data());
            _groupingCriteriaField = value;
        }
        return this;
    }

    @Override
    public GroupingSpec clone()
        throws CloneNotSupportedException
    {
        GroupingSpec __clone = ((GroupingSpec) super.clone());
        __clone.__changeListener = new GroupingSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GroupingSpec copy()
        throws CloneNotSupportedException
    {
        GroupingSpec __copy = ((GroupingSpec) super.copy());
        __copy._groupingCriteriaField = null;
        __copy.__changeListener = new GroupingSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GroupingSpec __objectRef;

        private ChangeListener(GroupingSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "groupingCriteria":
                    __objectRef._groupingCriteriaField = null;
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
         * A list of generic directives to group results by.
         * 
         * 
         */
        public com.linkedin.metadata.query.GroupingCriterionArray.Fields groupingCriteria() {
            return new com.linkedin.metadata.query.GroupingCriterionArray.Fields(getPathComponents(), "groupingCriteria");
        }

        /**
         * A list of generic directives to group results by.
         * 
         * 
         */
        public PathSpec groupingCriteria(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groupingCriteria");
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

        private com.linkedin.metadata.query.GroupingCriterionArray.ProjectionMask _groupingCriteriaMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * A list of generic directives to group results by.
         * 
         * 
         */
        public GroupingSpec.ProjectionMask withGroupingCriteria(Function<com.linkedin.metadata.query.GroupingCriterionArray.ProjectionMask, com.linkedin.metadata.query.GroupingCriterionArray.ProjectionMask> nestedMask) {
            _groupingCriteriaMask = nestedMask.apply(((_groupingCriteriaMask == null)?GroupingCriterionArray.createMask():_groupingCriteriaMask));
            getDataMap().put("groupingCriteria", _groupingCriteriaMask.getDataMap());
            return this;
        }

        /**
         * A list of generic directives to group results by.
         * 
         * 
         */
        public GroupingSpec.ProjectionMask withGroupingCriteria() {
            _groupingCriteriaMask = null;
            getDataMap().put("groupingCriteria", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of generic directives to group results by.
         * 
         * 
         */
        public GroupingSpec.ProjectionMask withGroupingCriteria(Function<com.linkedin.metadata.query.GroupingCriterionArray.ProjectionMask, com.linkedin.metadata.query.GroupingCriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupingCriteriaMask = nestedMask.apply(((_groupingCriteriaMask == null)?GroupingCriterionArray.createMask():_groupingCriteriaMask));
            getDataMap().put("groupingCriteria", _groupingCriteriaMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("groupingCriteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groupingCriteria").put("$count", count);
            }
            return this;
        }

        /**
         * A list of generic directives to group results by.
         * 
         * 
         */
        public GroupingSpec.ProjectionMask withGroupingCriteria(Integer start, Integer count) {
            _groupingCriteriaMask = null;
            getDataMap().put("groupingCriteria", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groupingCriteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groupingCriteria").put("$count", count);
            }
            return this;
        }

    }

}
