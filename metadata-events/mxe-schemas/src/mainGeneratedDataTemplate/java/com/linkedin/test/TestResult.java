
package com.linkedin.test;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * Information about a Test Result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/test/TestResult.pdl.")
public class TestResult
    extends RecordTemplate
{

    private final static TestResult.Fields _fields = new TestResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.test/**Information about a Test Result*/record TestResult{/**The urn of the test*/test:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The type of the result*/type:enum TestResultType{/** The Test Succeeded*/SUCCESS/** The Test Failed*/FAILURE}/**The md5 of the test definition that was used to compute this result.\nSee TestInfo.testDefinition.md5 for more information.*/testDefinitionMd5:optional string/**The audit stamp of when the result was computed, including the actor who computed it.*/lastComputed:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _testField = null;
    private TestResultType _typeField = null;
    private String _testDefinitionMd5Field = null;
    private AuditStamp _lastComputedField = null;
    private TestResult.ChangeListener __changeListener = new TestResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Test = SCHEMA.getField("test");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_TestDefinitionMd5 = SCHEMA.getField("testDefinitionMd5");
    private final static RecordDataSchema.Field FIELD_LastComputed = SCHEMA.getField("lastComputed");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public TestResult() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TestResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TestResult.Fields fields() {
        return _fields;
    }

    public static TestResult.ProjectionMask createMask() {
        return new TestResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for test
     * 
     * @see TestResult.Fields#test
     */
    public boolean hasTest() {
        if (_testField!= null) {
            return true;
        }
        return super._map.containsKey("test");
    }

    /**
     * Remover for test
     * 
     * @see TestResult.Fields#test
     */
    public void removeTest() {
        super._map.remove("test");
    }

    /**
     * Getter for test
     * 
     * @see TestResult.Fields#test
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTest(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTest();
            case DEFAULT:
            case NULL:
                if (_testField!= null) {
                    return _testField;
                } else {
                    Object __rawValue = super._map.get("test");
                    _testField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _testField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for test
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestResult.Fields#test
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getTest() {
        if (_testField!= null) {
            return _testField;
        } else {
            Object __rawValue = super._map.get("test");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("test");
            }
            _testField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _testField;
        }
    }

    /**
     * Setter for test
     * 
     * @see TestResult.Fields#test
     */
    public TestResult setTest(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTest(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field test of com.linkedin.test.TestResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "test", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _testField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTest();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "test", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _testField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "test", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _testField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for test
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestResult.Fields#test
     */
    public TestResult setTest(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field test of com.linkedin.test.TestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "test", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _testField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see TestResult.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see TestResult.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see TestResult.Fields#type
     */
    @Nullable
    public TestResultType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, TestResultType.class, TestResultType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestResult.Fields#type
     */
    @Nonnull
    public TestResultType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, TestResultType.class, TestResultType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see TestResult.Fields#type
     */
    public TestResult setType(
        @Nullable
        TestResultType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.test.TestResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
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
     * @see TestResult.Fields#type
     */
    public TestResult setType(
        @Nonnull
        TestResultType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.test.TestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for testDefinitionMd5
     * 
     * @see TestResult.Fields#testDefinitionMd5
     */
    public boolean hasTestDefinitionMd5() {
        if (_testDefinitionMd5Field!= null) {
            return true;
        }
        return super._map.containsKey("testDefinitionMd5");
    }

    /**
     * Remover for testDefinitionMd5
     * 
     * @see TestResult.Fields#testDefinitionMd5
     */
    public void removeTestDefinitionMd5() {
        super._map.remove("testDefinitionMd5");
    }

    /**
     * Getter for testDefinitionMd5
     * 
     * @see TestResult.Fields#testDefinitionMd5
     */
    @Nullable
    public String getTestDefinitionMd5(GetMode mode) {
        return getTestDefinitionMd5();
    }

    /**
     * Getter for testDefinitionMd5
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TestResult.Fields#testDefinitionMd5
     */
    @Nullable
    public String getTestDefinitionMd5() {
        if (_testDefinitionMd5Field!= null) {
            return _testDefinitionMd5Field;
        } else {
            Object __rawValue = super._map.get("testDefinitionMd5");
            _testDefinitionMd5Field = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _testDefinitionMd5Field;
        }
    }

    /**
     * Setter for testDefinitionMd5
     * 
     * @see TestResult.Fields#testDefinitionMd5
     */
    public TestResult setTestDefinitionMd5(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTestDefinitionMd5(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTestDefinitionMd5();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "testDefinitionMd5", value);
                    _testDefinitionMd5Field = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "testDefinitionMd5", value);
                    _testDefinitionMd5Field = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for testDefinitionMd5
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestResult.Fields#testDefinitionMd5
     */
    public TestResult setTestDefinitionMd5(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field testDefinitionMd5 of com.linkedin.test.TestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "testDefinitionMd5", value);
            _testDefinitionMd5Field = value;
        }
        return this;
    }

    /**
     * Existence checker for lastComputed
     * 
     * @see TestResult.Fields#lastComputed
     */
    public boolean hasLastComputed() {
        if (_lastComputedField!= null) {
            return true;
        }
        return super._map.containsKey("lastComputed");
    }

    /**
     * Remover for lastComputed
     * 
     * @see TestResult.Fields#lastComputed
     */
    public void removeLastComputed() {
        super._map.remove("lastComputed");
    }

    /**
     * Getter for lastComputed
     * 
     * @see TestResult.Fields#lastComputed
     */
    @Nullable
    public AuditStamp getLastComputed(GetMode mode) {
        return getLastComputed();
    }

    /**
     * Getter for lastComputed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TestResult.Fields#lastComputed
     */
    @Nullable
    public AuditStamp getLastComputed() {
        if (_lastComputedField!= null) {
            return _lastComputedField;
        } else {
            Object __rawValue = super._map.get("lastComputed");
            _lastComputedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastComputedField;
        }
    }

    /**
     * Setter for lastComputed
     * 
     * @see TestResult.Fields#lastComputed
     */
    public TestResult setLastComputed(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastComputed(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastComputed();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastComputed", value.data());
                    _lastComputedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastComputed", value.data());
                    _lastComputedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastComputed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestResult.Fields#lastComputed
     */
    public TestResult setLastComputed(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastComputed of com.linkedin.test.TestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastComputed", value.data());
            _lastComputedField = value;
        }
        return this;
    }

    @Override
    public TestResult clone()
        throws CloneNotSupportedException
    {
        TestResult __clone = ((TestResult) super.clone());
        __clone.__changeListener = new TestResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TestResult copy()
        throws CloneNotSupportedException
    {
        TestResult __copy = ((TestResult) super.copy());
        __copy._testDefinitionMd5Field = null;
        __copy._testField = null;
        __copy._typeField = null;
        __copy._lastComputedField = null;
        __copy.__changeListener = new TestResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TestResult __objectRef;

        private ChangeListener(TestResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "testDefinitionMd5":
                    __objectRef._testDefinitionMd5Field = null;
                    break;
                case "test":
                    __objectRef._testField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "lastComputed":
                    __objectRef._lastComputedField = null;
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
         * The urn of the test
         * 
         */
        public PathSpec test() {
            return new PathSpec(getPathComponents(), "test");
        }

        /**
         * The type of the result
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The md5 of the test definition that was used to compute this result.
         * See TestInfo.testDefinition.md5 for more information.
         * 
         */
        public PathSpec testDefinitionMd5() {
            return new PathSpec(getPathComponents(), "testDefinitionMd5");
        }

        /**
         * The audit stamp of when the result was computed, including the actor who computed it.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastComputed() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastComputed");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastComputedMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The urn of the test
         * 
         */
        public TestResult.ProjectionMask withTest() {
            getDataMap().put("test", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the result
         * 
         */
        public TestResult.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The md5 of the test definition that was used to compute this result.
         * See TestInfo.testDefinition.md5 for more information.
         * 
         */
        public TestResult.ProjectionMask withTestDefinitionMd5() {
            getDataMap().put("testDefinitionMd5", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The audit stamp of when the result was computed, including the actor who computed it.
         * 
         */
        public TestResult.ProjectionMask withLastComputed(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastComputedMask = nestedMask.apply(((_lastComputedMask == null)?AuditStamp.createMask():_lastComputedMask));
            getDataMap().put("lastComputed", _lastComputedMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp of when the result was computed, including the actor who computed it.
         * 
         */
        public TestResult.ProjectionMask withLastComputed(MaskMap nestedMask) {
            getDataMap().put("lastComputed", nestedMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp of when the result was computed, including the actor who computed it.
         * 
         */
        public TestResult.ProjectionMask withLastComputed() {
            _lastComputedMask = null;
            getDataMap().put("lastComputed", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
