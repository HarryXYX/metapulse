
package com.linkedin.metadata.aspect;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/DataHubPolicyAspect.pdl.")
public class DataHubPolicyAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:string/**Description of the Policy*/@Searchable.fieldType=\"TEXT\"description:string/**The type of policy*/@Searchable.fieldType=\"KEYWORD\"type:string/**The state of policy, ACTIVE or INACTIVE*/@Searchable.fieldType=\"KEYWORD\"state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/@deprecated,type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/@deprecated,resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/@deprecated,allResources:boolean=false/**Filter to apply privileges to*/filter:optional/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}/**Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz*/privilegeConstraints:optional PolicyMatchFilter}/**The privileges that the policy grants.*/@Searchable.`/*`={\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Define type of ownership for the policy*/resourceOwnersTypes:optional array[com.linkedin.common.Urn]/**Whether the filter should apply to all users.*/@Searchable.fieldType=\"BOOLEAN\"allUsers:boolean=false/**Whether the filter should apply to all groups.*/@Searchable.fieldType=\"BOOLEAN\"allGroups:boolean=false/**A specific set of roles to apply the policy to (disjunctive).*/@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsAssociatedWithRole\"}@Searchable.`/*`.fieldType=\"URN\"roles:optional array[com.linkedin.common.Urn]}/**Whether the policy should be editable via the UI*/@Searchable.fieldType=\"BOOLEAN\"editable:boolean=true/**Timestamp when the policy was last updated*/@Searchable.fieldType=\"DATETIME\"lastUpdatedTimestamp:optional long}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DataHubPolicyKey _dataHubPolicyKeyMember = null;
    private com.linkedin.policy.DataHubPolicyInfo _dataHubPolicyInfoMember = null;
    private DataHubPolicyAspect.ChangeListener __changeListener = new DataHubPolicyAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DataHubPolicyKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataHubPolicyKey");
    public final static String MEMBERKEY_DataHubPolicyKey = "com.linkedin.metadata.key.DataHubPolicyKey";
    private final static DataSchema MEMBER_DataHubPolicyInfo = SCHEMA.getTypeByMemberKey("com.linkedin.policy.DataHubPolicyInfo");
    public final static String MEMBERKEY_DataHubPolicyInfo = "com.linkedin.policy.DataHubPolicyInfo";
    private final static TyperefInfo TYPEREFINFO = new DataHubPolicyAspect.UnionTyperefInfo();

    public DataHubPolicyAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubPolicyAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataHubPolicyAspect create(com.linkedin.metadata.key.DataHubPolicyKey value) {
        DataHubPolicyAspect newUnion = new DataHubPolicyAspect();
        newUnion.setDataHubPolicyKey(value);
        return newUnion;
    }

    public boolean isDataHubPolicyKey() {
        return memberIs("com.linkedin.metadata.key.DataHubPolicyKey");
    }

    public com.linkedin.metadata.key.DataHubPolicyKey getDataHubPolicyKey() {
        checkNotNull();
        if (_dataHubPolicyKeyMember!= null) {
            return _dataHubPolicyKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataHubPolicyKey");
        _dataHubPolicyKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataHubPolicyKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataHubPolicyKeyMember;
    }

    public void setDataHubPolicyKey(com.linkedin.metadata.key.DataHubPolicyKey value) {
        checkNotNull();
        super._map.clear();
        _dataHubPolicyKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataHubPolicyKey", value.data());
    }

    public static DataHubPolicyAspect create(com.linkedin.policy.DataHubPolicyInfo value) {
        DataHubPolicyAspect newUnion = new DataHubPolicyAspect();
        newUnion.setDataHubPolicyInfo(value);
        return newUnion;
    }

    public boolean isDataHubPolicyInfo() {
        return memberIs("com.linkedin.policy.DataHubPolicyInfo");
    }

    public com.linkedin.policy.DataHubPolicyInfo getDataHubPolicyInfo() {
        checkNotNull();
        if (_dataHubPolicyInfoMember!= null) {
            return _dataHubPolicyInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.policy.DataHubPolicyInfo");
        _dataHubPolicyInfoMember = ((__rawValue == null)?null:new com.linkedin.policy.DataHubPolicyInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataHubPolicyInfoMember;
    }

    public void setDataHubPolicyInfo(com.linkedin.policy.DataHubPolicyInfo value) {
        checkNotNull();
        super._map.clear();
        _dataHubPolicyInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.policy.DataHubPolicyInfo", value.data());
    }

    public static DataHubPolicyAspect.ProjectionMask createMask() {
        return new DataHubPolicyAspect.ProjectionMask();
    }

    @Override
    public DataHubPolicyAspect clone()
        throws CloneNotSupportedException
    {
        DataHubPolicyAspect __clone = ((DataHubPolicyAspect) super.clone());
        __clone.__changeListener = new DataHubPolicyAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPolicyAspect copy()
        throws CloneNotSupportedException
    {
        DataHubPolicyAspect __copy = ((DataHubPolicyAspect) super.copy());
        __copy._dataHubPolicyKeyMember = null;
        __copy._dataHubPolicyInfoMember = null;
        __copy.__changeListener = new DataHubPolicyAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPolicyAspect __objectRef;

        private ChangeListener(DataHubPolicyAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.metadata.key.DataHubPolicyKey":
                    __objectRef._dataHubPolicyKeyMember = null;
                    break;
                case "com.linkedin.policy.DataHubPolicyInfo":
                    __objectRef._dataHubPolicyInfoMember = null;
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

        public com.linkedin.metadata.key.DataHubPolicyKey.Fields DataHubPolicyKey() {
            return new com.linkedin.metadata.key.DataHubPolicyKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataHubPolicyKey");
        }

        public com.linkedin.policy.DataHubPolicyInfo.Fields DataHubPolicyInfo() {
            return new com.linkedin.policy.DataHubPolicyInfo.Fields(getPathComponents(), "com.linkedin.policy.DataHubPolicyInfo");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DataHubPolicyKey.ProjectionMask _DataHubPolicyKeyMask;
        private com.linkedin.policy.DataHubPolicyInfo.ProjectionMask _DataHubPolicyInfoMask;

        ProjectionMask() {
            super(3);
        }

        public DataHubPolicyAspect.ProjectionMask withDataHubPolicyKey(Function<com.linkedin.metadata.key.DataHubPolicyKey.ProjectionMask, com.linkedin.metadata.key.DataHubPolicyKey.ProjectionMask> nestedMask) {
            _DataHubPolicyKeyMask = nestedMask.apply(((_DataHubPolicyKeyMask == null)?com.linkedin.metadata.key.DataHubPolicyKey.createMask():_DataHubPolicyKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataHubPolicyKey", _DataHubPolicyKeyMask.getDataMap());
            return this;
        }

        public DataHubPolicyAspect.ProjectionMask withDataHubPolicyInfo(Function<com.linkedin.policy.DataHubPolicyInfo.ProjectionMask, com.linkedin.policy.DataHubPolicyInfo.ProjectionMask> nestedMask) {
            _DataHubPolicyInfoMask = nestedMask.apply(((_DataHubPolicyInfoMask == null)?com.linkedin.policy.DataHubPolicyInfo.createMask():_DataHubPolicyInfoMask));
            getDataMap().put("com.linkedin.policy.DataHubPolicyInfo", _DataHubPolicyInfoMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a DataHub access policy.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a DataHub access policy.*/typeref DataHubPolicyAspect=union[{namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}}{namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:string/**Description of the Policy*/@Searchable.fieldType=\"TEXT\"description:string/**The type of policy*/@Searchable.fieldType=\"KEYWORD\"type:string/**The state of policy, ACTIVE or INACTIVE*/@Searchable.fieldType=\"KEYWORD\"state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/@deprecated,type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/@deprecated,resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/@deprecated,allResources:boolean=false/**Filter to apply privileges to*/filter:optional/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}/**Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz*/privilegeConstraints:optional PolicyMatchFilter}/**The privileges that the policy grants.*/@Searchable.`/*`={\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Define type of ownership for the policy*/resourceOwnersTypes:optional array[com.linkedin.common.Urn]/**Whether the filter should apply to all users.*/@Searchable.fieldType=\"BOOLEAN\"allUsers:boolean=false/**Whether the filter should apply to all groups.*/@Searchable.fieldType=\"BOOLEAN\"allGroups:boolean=false/**A specific set of roles to apply the policy to (disjunctive).*/@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsAssociatedWithRole\"}@Searchable.`/*`.fieldType=\"URN\"roles:optional array[com.linkedin.common.Urn]}/**Whether the policy should be editable via the UI*/@Searchable.fieldType=\"BOOLEAN\"editable:boolean=true/**Timestamp when the policy was last updated*/@Searchable.fieldType=\"DATETIME\"lastUpdatedTimestamp:optional long}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
