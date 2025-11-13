
package com.linkedin.test;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Information about a Test Result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/test/TestResults.pdl.")
public class TestResults
    extends RecordTemplate
{

    private final static TestResults.Fields _fields = new TestResults.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.test/**Information about a Test Result*/@Aspect.name=\"testResults\"record TestResults{/**Results that are failing*/@Relationship.`/*/test`={\"entityTypes\":[\"test\"],\"name\":\"IsFailing\"}@Searchable.`/*/test`={\"fieldName\":\"failingTests\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFailingTests\",\"queryByDefault\":false}failing:array[/**Information about a Test Result*/record TestResult{/**The urn of the test*/test:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The type of the result*/type:enum TestResultType{/** The Test Succeeded*/SUCCESS/** The Test Failed*/FAILURE}/**The md5 of the test definition that was used to compute this result.\nSee TestInfo.testDefinition.md5 for more information.*/testDefinitionMd5:optional string/**The audit stamp of when the result was computed, including the actor who computed it.*/lastComputed:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}]/**Results that are passing*/@Relationship.`/*/test`={\"entityTypes\":[\"test\"],\"name\":\"IsPassing\"}@Searchable.`/*/test`={\"fieldName\":\"passingTests\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasPassingTests\",\"queryByDefault\":false}passing:array[TestResult]}", SchemaFormatType.PDL));
    private TestResultArray _failingField = null;
    private TestResultArray _passingField = null;
    private TestResults.ChangeListener __changeListener = new TestResults.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Failing = SCHEMA.getField("failing");
    private final static RecordDataSchema.Field FIELD_Passing = SCHEMA.getField("passing");

    public TestResults() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public TestResults(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TestResults.Fields fields() {
        return _fields;
    }

    public static TestResults.ProjectionMask createMask() {
        return new TestResults.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for failing
     * 
     * @see TestResults.Fields#failing
     */
    public boolean hasFailing() {
        if (_failingField!= null) {
            return true;
        }
        return super._map.containsKey("failing");
    }

    /**
     * Remover for failing
     * 
     * @see TestResults.Fields#failing
     */
    public void removeFailing() {
        super._map.remove("failing");
    }

    /**
     * Getter for failing
     * 
     * @see TestResults.Fields#failing
     */
    @Nullable
    public TestResultArray getFailing(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFailing();
            case DEFAULT:
            case NULL:
                if (_failingField!= null) {
                    return _failingField;
                } else {
                    Object __rawValue = super._map.get("failing");
                    _failingField = ((__rawValue == null)?null:new TestResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _failingField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for failing
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestResults.Fields#failing
     */
    @Nonnull
    public TestResultArray getFailing() {
        if (_failingField!= null) {
            return _failingField;
        } else {
            Object __rawValue = super._map.get("failing");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("failing");
            }
            _failingField = ((__rawValue == null)?null:new TestResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _failingField;
        }
    }

    /**
     * Setter for failing
     * 
     * @see TestResults.Fields#failing
     */
    public TestResults setFailing(
        @Nullable
        TestResultArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFailing(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field failing of com.linkedin.test.TestResults");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "failing", value.data());
                    _failingField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFailing();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "failing", value.data());
                    _failingField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "failing", value.data());
                    _failingField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for failing
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestResults.Fields#failing
     */
    public TestResults setFailing(
        @Nonnull
        TestResultArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field failing of com.linkedin.test.TestResults to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "failing", value.data());
            _failingField = value;
        }
        return this;
    }

    /**
     * Existence checker for passing
     * 
     * @see TestResults.Fields#passing
     */
    public boolean hasPassing() {
        if (_passingField!= null) {
            return true;
        }
        return super._map.containsKey("passing");
    }

    /**
     * Remover for passing
     * 
     * @see TestResults.Fields#passing
     */
    public void removePassing() {
        super._map.remove("passing");
    }

    /**
     * Getter for passing
     * 
     * @see TestResults.Fields#passing
     */
    @Nullable
    public TestResultArray getPassing(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPassing();
            case DEFAULT:
            case NULL:
                if (_passingField!= null) {
                    return _passingField;
                } else {
                    Object __rawValue = super._map.get("passing");
                    _passingField = ((__rawValue == null)?null:new TestResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _passingField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for passing
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestResults.Fields#passing
     */
    @Nonnull
    public TestResultArray getPassing() {
        if (_passingField!= null) {
            return _passingField;
        } else {
            Object __rawValue = super._map.get("passing");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("passing");
            }
            _passingField = ((__rawValue == null)?null:new TestResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _passingField;
        }
    }

    /**
     * Setter for passing
     * 
     * @see TestResults.Fields#passing
     */
    public TestResults setPassing(
        @Nullable
        TestResultArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPassing(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field passing of com.linkedin.test.TestResults");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "passing", value.data());
                    _passingField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePassing();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "passing", value.data());
                    _passingField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "passing", value.data());
                    _passingField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for passing
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestResults.Fields#passing
     */
    public TestResults setPassing(
        @Nonnull
        TestResultArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field passing of com.linkedin.test.TestResults to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "passing", value.data());
            _passingField = value;
        }
        return this;
    }

    @Override
    public TestResults clone()
        throws CloneNotSupportedException
    {
        TestResults __clone = ((TestResults) super.clone());
        __clone.__changeListener = new TestResults.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TestResults copy()
        throws CloneNotSupportedException
    {
        TestResults __copy = ((TestResults) super.copy());
        __copy._failingField = null;
        __copy._passingField = null;
        __copy.__changeListener = new TestResults.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TestResults __objectRef;

        private ChangeListener(TestResults reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "failing":
                    __objectRef._failingField = null;
                    break;
                case "passing":
                    __objectRef._passingField = null;
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
         * Results that are failing
         * 
         */
        public com.linkedin.test.TestResultArray.Fields failing() {
            return new com.linkedin.test.TestResultArray.Fields(getPathComponents(), "failing");
        }

        /**
         * Results that are failing
         * 
         */
        public PathSpec failing(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "failing");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Results that are passing
         * 
         */
        public com.linkedin.test.TestResultArray.Fields passing() {
            return new com.linkedin.test.TestResultArray.Fields(getPathComponents(), "passing");
        }

        /**
         * Results that are passing
         * 
         */
        public PathSpec passing(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "passing");
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

        private com.linkedin.test.TestResultArray.ProjectionMask _failingMask;
        private com.linkedin.test.TestResultArray.ProjectionMask _passingMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Results that are failing
         * 
         */
        public TestResults.ProjectionMask withFailing(Function<com.linkedin.test.TestResultArray.ProjectionMask, com.linkedin.test.TestResultArray.ProjectionMask> nestedMask) {
            _failingMask = nestedMask.apply(((_failingMask == null)?TestResultArray.createMask():_failingMask));
            getDataMap().put("failing", _failingMask.getDataMap());
            return this;
        }

        /**
         * Results that are failing
         * 
         */
        public TestResults.ProjectionMask withFailing() {
            _failingMask = null;
            getDataMap().put("failing", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Results that are failing
         * 
         */
        public TestResults.ProjectionMask withFailing(Function<com.linkedin.test.TestResultArray.ProjectionMask, com.linkedin.test.TestResultArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _failingMask = nestedMask.apply(((_failingMask == null)?TestResultArray.createMask():_failingMask));
            getDataMap().put("failing", _failingMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("failing").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("failing").put("$count", count);
            }
            return this;
        }

        /**
         * Results that are failing
         * 
         */
        public TestResults.ProjectionMask withFailing(Integer start, Integer count) {
            _failingMask = null;
            getDataMap().put("failing", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("failing").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("failing").put("$count", count);
            }
            return this;
        }

        /**
         * Results that are passing
         * 
         */
        public TestResults.ProjectionMask withPassing(Function<com.linkedin.test.TestResultArray.ProjectionMask, com.linkedin.test.TestResultArray.ProjectionMask> nestedMask) {
            _passingMask = nestedMask.apply(((_passingMask == null)?TestResultArray.createMask():_passingMask));
            getDataMap().put("passing", _passingMask.getDataMap());
            return this;
        }

        /**
         * Results that are passing
         * 
         */
        public TestResults.ProjectionMask withPassing() {
            _passingMask = null;
            getDataMap().put("passing", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Results that are passing
         * 
         */
        public TestResults.ProjectionMask withPassing(Function<com.linkedin.test.TestResultArray.ProjectionMask, com.linkedin.test.TestResultArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _passingMask = nestedMask.apply(((_passingMask == null)?TestResultArray.createMask():_passingMask));
            getDataMap().put("passing", _passingMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("passing").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("passing").put("$count", count);
            }
            return this;
        }

        /**
         * Results that are passing
         * 
         */
        public TestResults.ProjectionMask withPassing(Integer start, Integer count) {
            _passingMask = null;
            getDataMap().put("passing", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("passing").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("passing").put("$count", count);
            }
            return this;
        }

    }

}
