
package com.linkedin.policy;

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
import com.linkedin.data.template.StringArray;


/**
 * Information used to filter DataHub resource.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/policy/DataHubResourceFilter.pdl.")
public class DataHubResourceFilter
    extends RecordTemplate
{

    private final static DataHubResourceFilter.Fields _fields = new DataHubResourceFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/@deprecated,type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/@deprecated,resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/@deprecated,allResources:boolean=false/**Filter to apply privileges to*/filter:optional/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}/**Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz*/privilegeConstraints:optional PolicyMatchFilter}", SchemaFormatType.PDL));
    private String _typeField = null;
    private StringArray _resourcesField = null;
    private Boolean _allResourcesField = null;
    private PolicyMatchFilter _filterField = null;
    private PolicyMatchFilter _privilegeConstraintsField = null;
    private DataHubResourceFilter.ChangeListener __changeListener = new DataHubResourceFilter.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Resources = SCHEMA.getField("resources");
    private final static RecordDataSchema.Field FIELD_AllResources = SCHEMA.getField("allResources");
    private final static Boolean DEFAULT_AllResources;
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");
    private final static RecordDataSchema.Field FIELD_PrivilegeConstraints = SCHEMA.getField("privilegeConstraints");

    static {
        DEFAULT_AllResources = DataTemplateUtil.coerceBooleanOutput(FIELD_AllResources.getDefault());
    }

    public DataHubResourceFilter() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DataHubResourceFilter(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubResourceFilter.Fields fields() {
        return _fields;
    }

    public static DataHubResourceFilter.ProjectionMask createMask() {
        return new DataHubResourceFilter.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    @Nullable
    public String getType(GetMode mode) {
        return getType();
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    @Nullable
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    public DataHubResourceFilter setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#type
     */
    @Deprecated
    public DataHubResourceFilter setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.policy.DataHubResourceFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    public boolean hasResources() {
        if (_resourcesField!= null) {
            return true;
        }
        return super._map.containsKey("resources");
    }

    /**
     * Remover for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    public void removeResources() {
        super._map.remove("resources");
    }

    /**
     * Getter for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    @Nullable
    public StringArray getResources(GetMode mode) {
        return getResources();
    }

    /**
     * Getter for resources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    @Nullable
    public StringArray getResources() {
        if (_resourcesField!= null) {
            return _resourcesField;
        } else {
            Object __rawValue = super._map.get("resources");
            _resourcesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _resourcesField;
        }
    }

    /**
     * Setter for resources
     * 
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    public DataHubResourceFilter setResources(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResources(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResources();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
                    _resourcesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
                    _resourcesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#resources
     */
    @Deprecated
    public DataHubResourceFilter setResources(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resources of com.linkedin.policy.DataHubResourceFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
            _resourcesField = value;
        }
        return this;
    }

    /**
     * Existence checker for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    public boolean hasAllResources() {
        if (_allResourcesField!= null) {
            return true;
        }
        return super._map.containsKey("allResources");
    }

    /**
     * Remover for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    public void removeAllResources() {
        super._map.remove("allResources");
    }

    /**
     * Getter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    @Nullable
    public Boolean isAllResources(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isAllResources();
            case NULL:
                if (_allResourcesField!= null) {
                    return _allResourcesField;
                } else {
                    Object __rawValue = super._map.get("allResources");
                    _allResourcesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _allResourcesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for allResources
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    @Nonnull
    public Boolean isAllResources() {
        if (_allResourcesField!= null) {
            return _allResourcesField;
        } else {
            Object __rawValue = super._map.get("allResources");
            if (__rawValue == null) {
                return DEFAULT_AllResources;
            }
            _allResourcesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _allResourcesField;
        }
    }

    /**
     * Setter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    public DataHubResourceFilter setAllResources(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAllResources(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field allResources of com.linkedin.policy.DataHubResourceFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allResources", value);
                    _allResourcesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAllResources();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allResources", value);
                    _allResourcesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "allResources", value);
                    _allResourcesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for allResources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    public DataHubResourceFilter setAllResources(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field allResources of com.linkedin.policy.DataHubResourceFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "allResources", value);
            _allResourcesField = value;
        }
        return this;
    }

    /**
     * Setter for allResources
     * 
     * @see DataHubResourceFilter.Fields#allResources
     */
    @Deprecated
    public DataHubResourceFilter setAllResources(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "allResources", value);
        _allResourcesField = value;
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see DataHubResourceFilter.Fields#filter
     */
    public boolean hasFilter() {
        if (_filterField!= null) {
            return true;
        }
        return super._map.containsKey("filter");
    }

    /**
     * Remover for filter
     * 
     * @see DataHubResourceFilter.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see DataHubResourceFilter.Fields#filter
     */
    @Nullable
    public PolicyMatchFilter getFilter(GetMode mode) {
        return getFilter();
    }

    /**
     * Getter for filter
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#filter
     */
    @Nullable
    public PolicyMatchFilter getFilter() {
        if (_filterField!= null) {
            return _filterField;
        } else {
            Object __rawValue = super._map.get("filter");
            _filterField = ((__rawValue == null)?null:new PolicyMatchFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _filterField;
        }
    }

    /**
     * Setter for filter
     * 
     * @see DataHubResourceFilter.Fields#filter
     */
    public DataHubResourceFilter setFilter(
        @Nullable
        PolicyMatchFilter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#filter
     */
    public DataHubResourceFilter setFilter(
        @Nonnull
        PolicyMatchFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.policy.DataHubResourceFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    /**
     * Existence checker for privilegeConstraints
     * 
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    public boolean hasPrivilegeConstraints() {
        if (_privilegeConstraintsField!= null) {
            return true;
        }
        return super._map.containsKey("privilegeConstraints");
    }

    /**
     * Remover for privilegeConstraints
     * 
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    public void removePrivilegeConstraints() {
        super._map.remove("privilegeConstraints");
    }

    /**
     * Getter for privilegeConstraints
     * 
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    @Nullable
    public PolicyMatchFilter getPrivilegeConstraints(GetMode mode) {
        return getPrivilegeConstraints();
    }

    /**
     * Getter for privilegeConstraints
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    @Nullable
    public PolicyMatchFilter getPrivilegeConstraints() {
        if (_privilegeConstraintsField!= null) {
            return _privilegeConstraintsField;
        } else {
            Object __rawValue = super._map.get("privilegeConstraints");
            _privilegeConstraintsField = ((__rawValue == null)?null:new PolicyMatchFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _privilegeConstraintsField;
        }
    }

    /**
     * Setter for privilegeConstraints
     * 
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    public DataHubResourceFilter setPrivilegeConstraints(
        @Nullable
        PolicyMatchFilter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrivilegeConstraints(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrivilegeConstraints();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "privilegeConstraints", value.data());
                    _privilegeConstraintsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "privilegeConstraints", value.data());
                    _privilegeConstraintsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for privilegeConstraints
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubResourceFilter.Fields#privilegeConstraints
     */
    public DataHubResourceFilter setPrivilegeConstraints(
        @Nonnull
        PolicyMatchFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field privilegeConstraints of com.linkedin.policy.DataHubResourceFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "privilegeConstraints", value.data());
            _privilegeConstraintsField = value;
        }
        return this;
    }

    @Override
    public DataHubResourceFilter clone()
        throws CloneNotSupportedException
    {
        DataHubResourceFilter __clone = ((DataHubResourceFilter) super.clone());
        __clone.__changeListener = new DataHubResourceFilter.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubResourceFilter copy()
        throws CloneNotSupportedException
    {
        DataHubResourceFilter __copy = ((DataHubResourceFilter) super.copy());
        __copy._filterField = null;
        __copy._allResourcesField = null;
        __copy._privilegeConstraintsField = null;
        __copy._resourcesField = null;
        __copy._typeField = null;
        __copy.__changeListener = new DataHubResourceFilter.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubResourceFilter __objectRef;

        private ChangeListener(DataHubResourceFilter reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "allResources":
                    __objectRef._allResourcesField = null;
                    break;
                case "privilegeConstraints":
                    __objectRef._privilegeConstraintsField = null;
                    break;
                case "resources":
                    __objectRef._resourcesField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * The type of resource that the policy applies to. This will most often be a data asset entity name, for
         * example 'dataset'. It is not strictly required because in the future we will want to support filtering a resource
         * by domain, as well.
         * 
         */
        @Deprecated
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        @Deprecated
        public PathSpec resources() {
            return new PathSpec(getPathComponents(), "resources");
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        @Deprecated
        public PathSpec resources(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "resources");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether the policy should be applied to all assets matching the filter.
         * 
         */
        @Deprecated
        public PathSpec allResources() {
            return new PathSpec(getPathComponents(), "allResources");
        }

        /**
         * Filter to apply privileges to
         * 
         */
        public com.linkedin.policy.PolicyMatchFilter.Fields filter() {
            return new com.linkedin.policy.PolicyMatchFilter.Fields(getPathComponents(), "filter");
        }

        /**
         * Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz
         * 
         */
        public com.linkedin.policy.PolicyMatchFilter.Fields privilegeConstraints() {
            return new com.linkedin.policy.PolicyMatchFilter.Fields(getPathComponents(), "privilegeConstraints");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.policy.PolicyMatchFilter.ProjectionMask _filterMask;
        private com.linkedin.policy.PolicyMatchFilter.ProjectionMask _privilegeConstraintsMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The type of resource that the policy applies to. This will most often be a data asset entity name, for
         * example 'dataset'. It is not strictly required because in the future we will want to support filtering a resource
         * by domain, as well.
         * 
         */
        @Deprecated
        public DataHubResourceFilter.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        @Deprecated
        public DataHubResourceFilter.ProjectionMask withResources() {
            getDataMap().put("resources", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of resources to apply the policy to, e.g. asset urns
         * 
         */
        @Deprecated
        public DataHubResourceFilter.ProjectionMask withResources(Integer start, Integer count) {
            getDataMap().put("resources", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("resources").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("resources").put("$count", count);
            }
            return this;
        }

        /**
         * Whether the policy should be applied to all assets matching the filter.
         * 
         */
        @Deprecated
        public DataHubResourceFilter.ProjectionMask withAllResources() {
            getDataMap().put("allResources", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Filter to apply privileges to
         * 
         */
        public DataHubResourceFilter.ProjectionMask withFilter(Function<com.linkedin.policy.PolicyMatchFilter.ProjectionMask, com.linkedin.policy.PolicyMatchFilter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?PolicyMatchFilter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * Filter to apply privileges to
         * 
         */
        public DataHubResourceFilter.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz
         * 
         */
        public DataHubResourceFilter.ProjectionMask withPrivilegeConstraints(Function<com.linkedin.policy.PolicyMatchFilter.ProjectionMask, com.linkedin.policy.PolicyMatchFilter.ProjectionMask> nestedMask) {
            _privilegeConstraintsMask = nestedMask.apply(((_privilegeConstraintsMask == null)?PolicyMatchFilter.createMask():_privilegeConstraintsMask));
            getDataMap().put("privilegeConstraints", _privilegeConstraintsMask.getDataMap());
            return this;
        }

        /**
         * Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz
         * 
         */
        public DataHubResourceFilter.ProjectionMask withPrivilegeConstraints() {
            _privilegeConstraintsMask = null;
            getDataMap().put("privilegeConstraints", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
