
package com.linkedin.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/test/TestResults.pdl.")
public class TestResultArray
    extends WrappingArrayTemplate<TestResult>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.test/**Information about a Test Result*/record TestResult{/**The urn of the test*/test:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The type of the result*/type:enum TestResultType{/** The Test Succeeded*/SUCCESS/** The Test Failed*/FAILURE}/**The md5 of the test definition that was used to compute this result.\nSee TestInfo.testDefinition.md5 for more information.*/testDefinitionMd5:optional string/**The audit stamp of when the result was computed, including the actor who computed it.*/lastComputed:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}]", SchemaFormatType.PDL));

    public TestResultArray() {
        this(new DataList());
    }

    public TestResultArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public TestResultArray(Collection<TestResult> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public TestResultArray(DataList data) {
        super(data, SCHEMA, TestResult.class);
    }

    public TestResultArray(TestResult first, TestResult... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static TestResultArray.ProjectionMask createMask() {
        return new TestResultArray.ProjectionMask();
    }

    @Override
    public TestResultArray clone()
        throws CloneNotSupportedException
    {
        TestResultArray __clone = ((TestResultArray) super.clone());
        return __clone;
    }

    @Override
    public TestResultArray copy()
        throws CloneNotSupportedException
    {
        TestResultArray __copy = ((TestResultArray) super.copy());
        return __copy;
    }

    @Override
    protected TestResult coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new TestResult(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.test.TestResult.Fields items() {
            return new com.linkedin.test.TestResult.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.test.TestResult.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public TestResultArray.ProjectionMask withItems(Function<com.linkedin.test.TestResult.ProjectionMask, com.linkedin.test.TestResult.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?TestResult.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
