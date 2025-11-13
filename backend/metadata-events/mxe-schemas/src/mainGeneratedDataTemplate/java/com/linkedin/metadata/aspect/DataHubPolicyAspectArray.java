
package com.linkedin.metadata.aspect;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataHubPolicySnapshot.pdl.")
public class DataHubPolicyAspectArray
    extends WrappingArrayTemplate<DataHubPolicyAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:string/**Description of the Policy*/@Searchable.fieldType=\"TEXT\"description:string/**The type of policy*/@Searchable.fieldType=\"KEYWORD\"type:string/**The state of policy, ACTIVE or INACTIVE*/@Searchable.fieldType=\"KEYWORD\"state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/@deprecated,type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/@deprecated,resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/@deprecated,allResources:boolean=false/**Filter to apply privileges to*/filter:optional/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}/**Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz*/privilegeConstraints:optional PolicyMatchFilter}/**The privileges that the policy grants.*/@Searchable.`/*`={\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Define type of ownership for the policy*/resourceOwnersTypes:optional array[com.linkedin.common.Urn]/**Whether the filter should apply to all users.*/@Searchable.fieldType=\"BOOLEAN\"allUsers:boolean=false/**Whether the filter should apply to all groups.*/@Searchable.fieldType=\"BOOLEAN\"allGroups:boolean=false/**A specific set of roles to apply the policy to (disjunctive).*/@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsAssociatedWithRole\"}@Searchable.`/*`.fieldType=\"URN\"roles:optional array[com.linkedin.common.Urn]}/**Whether the policy should be editable via the UI*/@Searchable.fieldType=\"BOOLEAN\"editable:boolean=true/**Timestamp when the policy was last updated*/@Searchable.fieldType=\"DATETIME\"lastUpdatedTimestamp:optional long}}]]", SchemaFormatType.PDL));

    public DataHubPolicyAspectArray() {
        this(new DataList());
    }

    public DataHubPolicyAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataHubPolicyAspectArray(Collection<DataHubPolicyAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataHubPolicyAspectArray(DataList data) {
        super(data, SCHEMA, DataHubPolicyAspect.class);
    }

    public DataHubPolicyAspectArray(DataHubPolicyAspect first, DataHubPolicyAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataHubPolicyAspectArray.ProjectionMask createMask() {
        return new DataHubPolicyAspectArray.ProjectionMask();
    }

    @Override
    public DataHubPolicyAspectArray clone()
        throws CloneNotSupportedException
    {
        DataHubPolicyAspectArray __clone = ((DataHubPolicyAspectArray) super.clone());
        return __clone;
    }

    @Override
    public DataHubPolicyAspectArray copy()
        throws CloneNotSupportedException
    {
        DataHubPolicyAspectArray __copy = ((DataHubPolicyAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected DataHubPolicyAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataHubPolicyAspect(object));
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

        public com.linkedin.metadata.aspect.DataHubPolicyAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataHubPolicyAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.DataHubPolicyAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataHubPolicyAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.DataHubPolicyAspect.ProjectionMask, com.linkedin.metadata.aspect.DataHubPolicyAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataHubPolicyAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
