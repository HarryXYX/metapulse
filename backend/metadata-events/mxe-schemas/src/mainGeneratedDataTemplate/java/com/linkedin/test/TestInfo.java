
package com.linkedin.test;

import java.util.List;
import java.util.function.Function;
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
 * Information about a DataHub Test
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/test/TestInfo.pdl.")
public class TestInfo
    extends RecordTemplate
{

    private final static TestInfo.Fields _fields = new TestInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.test/**Information about a DataHub Test*/@Aspect.name=\"testInfo\"record TestInfo{/**The name of the test*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**Category of the test*/@Searchable.fieldType=\"KEYWORD\"category:string/**Description of the test*/@Searchable={\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Configuration for the Test*/definition:record TestDefinition{/**The Test Definition Type*/type:enum TestDefinitionType{/**JSON / YAML test def*/JSON}/**JSON format configuration for the test*/json:optional string}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _categoryField = null;
    private String _descriptionField = null;
    private TestDefinition _definitionField = null;
    private TestInfo.ChangeListener __changeListener = new TestInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Category = SCHEMA.getField("category");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Definition = SCHEMA.getField("definition");

    public TestInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TestInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TestInfo.Fields fields() {
        return _fields;
    }

    public static TestInfo.ProjectionMask createMask() {
        return new TestInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see TestInfo.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see TestInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see TestInfo.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestInfo.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see TestInfo.Fields#name
     */
    public TestInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.test.TestInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestInfo.Fields#name
     */
    public TestInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.test.TestInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for category
     * 
     * @see TestInfo.Fields#category
     */
    public boolean hasCategory() {
        if (_categoryField!= null) {
            return true;
        }
        return super._map.containsKey("category");
    }

    /**
     * Remover for category
     * 
     * @see TestInfo.Fields#category
     */
    public void removeCategory() {
        super._map.remove("category");
    }

    /**
     * Getter for category
     * 
     * @see TestInfo.Fields#category
     */
    @Nullable
    public String getCategory(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCategory();
            case DEFAULT:
            case NULL:
                if (_categoryField!= null) {
                    return _categoryField;
                } else {
                    Object __rawValue = super._map.get("category");
                    _categoryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _categoryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for category
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestInfo.Fields#category
     */
    @Nonnull
    public String getCategory() {
        if (_categoryField!= null) {
            return _categoryField;
        } else {
            Object __rawValue = super._map.get("category");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("category");
            }
            _categoryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _categoryField;
        }
    }

    /**
     * Setter for category
     * 
     * @see TestInfo.Fields#category
     */
    public TestInfo setCategory(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCategory(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field category of com.linkedin.test.TestInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCategory();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for category
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestInfo.Fields#category
     */
    public TestInfo setCategory(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field category of com.linkedin.test.TestInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "category", value);
            _categoryField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see TestInfo.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see TestInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see TestInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TestInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see TestInfo.Fields#description
     */
    public TestInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestInfo.Fields#description
     */
    public TestInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.test.TestInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for definition
     * 
     * @see TestInfo.Fields#definition
     */
    public boolean hasDefinition() {
        if (_definitionField!= null) {
            return true;
        }
        return super._map.containsKey("definition");
    }

    /**
     * Remover for definition
     * 
     * @see TestInfo.Fields#definition
     */
    public void removeDefinition() {
        super._map.remove("definition");
    }

    /**
     * Getter for definition
     * 
     * @see TestInfo.Fields#definition
     */
    @Nullable
    public TestDefinition getDefinition(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDefinition();
            case DEFAULT:
            case NULL:
                if (_definitionField!= null) {
                    return _definitionField;
                } else {
                    Object __rawValue = super._map.get("definition");
                    _definitionField = ((__rawValue == null)?null:new TestDefinition(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _definitionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for definition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TestInfo.Fields#definition
     */
    @Nonnull
    public TestDefinition getDefinition() {
        if (_definitionField!= null) {
            return _definitionField;
        } else {
            Object __rawValue = super._map.get("definition");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("definition");
            }
            _definitionField = ((__rawValue == null)?null:new TestDefinition(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _definitionField;
        }
    }

    /**
     * Setter for definition
     * 
     * @see TestInfo.Fields#definition
     */
    public TestInfo setDefinition(
        @Nullable
        TestDefinition value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDefinition(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field definition of com.linkedin.test.TestInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value.data());
                    _definitionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDefinition();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value.data());
                    _definitionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "definition", value.data());
                    _definitionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for definition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TestInfo.Fields#definition
     */
    public TestInfo setDefinition(
        @Nonnull
        TestDefinition value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field definition of com.linkedin.test.TestInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "definition", value.data());
            _definitionField = value;
        }
        return this;
    }

    @Override
    public TestInfo clone()
        throws CloneNotSupportedException
    {
        TestInfo __clone = ((TestInfo) super.clone());
        __clone.__changeListener = new TestInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TestInfo copy()
        throws CloneNotSupportedException
    {
        TestInfo __copy = ((TestInfo) super.copy());
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._definitionField = null;
        __copy._categoryField = null;
        __copy.__changeListener = new TestInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TestInfo __objectRef;

        private ChangeListener(TestInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "definition":
                    __objectRef._definitionField = null;
                    break;
                case "category":
                    __objectRef._categoryField = null;
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
         * The name of the test
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Category of the test
         * 
         */
        public PathSpec category() {
            return new PathSpec(getPathComponents(), "category");
        }

        /**
         * Description of the test
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Configuration for the Test
         * 
         */
        public com.linkedin.test.TestDefinition.Fields definition() {
            return new com.linkedin.test.TestDefinition.Fields(getPathComponents(), "definition");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.test.TestDefinition.ProjectionMask _definitionMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The name of the test
         * 
         */
        public TestInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Category of the test
         * 
         */
        public TestInfo.ProjectionMask withCategory() {
            getDataMap().put("category", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the test
         * 
         */
        public TestInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Configuration for the Test
         * 
         */
        public TestInfo.ProjectionMask withDefinition(Function<com.linkedin.test.TestDefinition.ProjectionMask, com.linkedin.test.TestDefinition.ProjectionMask> nestedMask) {
            _definitionMask = nestedMask.apply(((_definitionMask == null)?TestDefinition.createMask():_definitionMask));
            getDataMap().put("definition", _definitionMask.getDataMap());
            return this;
        }

        /**
         * Configuration for the Test
         * 
         */
        public TestInfo.ProjectionMask withDefinition() {
            _definitionMask = null;
            getDataMap().put("definition", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
