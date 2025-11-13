
package com.linkedin.test;

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
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/test/TestInfo.pdl.")
public class TestDefinition
    extends RecordTemplate
{

    private final static TestDefinition.Fields _fields = new TestDefinition.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.test,record TestDefinition{/**The Test Definition Type*/type:enum TestDefinitionType{/**JSON / YAML test def*/JSON}/**JSON format configuration for the test*/json:optional string}", SchemaFormatType.PDL));
    private TestDefinitionType _typeField = null;
    private String _jsonField = null;
    private TestDefinition.ChangeListener __changeListener = new TestDefinition.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Json = SCHEMA.getField("json");

    public TestDefinition() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TestDefinition(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TestDefinition.Fields fields() {
        return _fields;
    }

    public static TestDefinition.ProjectionMask createMask() {
        return new TestDefinition.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see TestDefinition.Fields#type
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
     * @see TestDefinition.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see TestDefinition.Fields#type
     */
    @Nullable
    public TestDefinitionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, TestDefinitionType.class, TestDefinitionType.$UNKNOWN);
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
     * @see TestDefinition.Fields#type
     */
    @Nonnull
    public TestDefinitionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, TestDefinitionType.class, TestDefinitionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see TestDefinition.Fields#type
     */
    public TestDefinition setType(
        @Nullable
        TestDefinitionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.test.TestDefinition");
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
     * @see TestDefinition.Fields#type
     */
    public TestDefinition setType(
        @Nonnull
        TestDefinitionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.test.TestDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for json
     * 
     * @see TestDefinition.Fields#json
     */
    public boolean hasJson() {
        if (_jsonField!= null) {
            return true;
        }
        return super._map.containsKey("json");
    }

    /**
     * Remover for json
     * 
     * @see TestDefinition.Fields#json
     */
    public void removeJson() {
        super._map.remove("json");
    }

    /**
     * Getter for json
     * 
     * @see TestDefinition.Fields#json
     */
    @Nullable
    public String getJson(GetMode mode) {
        return getJson();
    }

    /**
     * Getter for json
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TestDefinition.Fields#json
     */
    @Nullable
    public String getJson() {
        if (_jsonField!= null) {
            return _jsonField;
        } else {
            Object __rawValue = super._map.get("json");
            _jsonField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _jsonField;
        }
    }

    /**
     * Setter for json
     * 
     * @see TestDefinition.Fields#json
     */
    public TestDefinition setJson(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJson(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJson();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "json", value);
                    _jsonField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "json", value);
                    _jsonField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for json
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestDefinition.Fields#json
     */
    public TestDefinition setJson(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field json of com.linkedin.test.TestDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "json", value);
            _jsonField = value;
        }
        return this;
    }

    @Override
    public TestDefinition clone()
        throws CloneNotSupportedException
    {
        TestDefinition __clone = ((TestDefinition) super.clone());
        __clone.__changeListener = new TestDefinition.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TestDefinition copy()
        throws CloneNotSupportedException
    {
        TestDefinition __copy = ((TestDefinition) super.copy());
        __copy._jsonField = null;
        __copy._typeField = null;
        __copy.__changeListener = new TestDefinition.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TestDefinition __objectRef;

        private ChangeListener(TestDefinition reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "json":
                    __objectRef._jsonField = null;
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
         * The Test Definition Type
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * JSON format configuration for the test
         * 
         */
        public PathSpec json() {
            return new PathSpec(getPathComponents(), "json");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The Test Definition Type
         * 
         */
        public TestDefinition.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * JSON format configuration for the test
         * 
         */
        public TestDefinition.ProjectionMask withJson() {
            getDataMap().put("json", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
