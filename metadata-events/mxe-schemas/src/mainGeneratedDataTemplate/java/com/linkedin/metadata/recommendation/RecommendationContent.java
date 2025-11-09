
package com.linkedin.metadata.recommendation;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Content to display within each recommendation module
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationContent.pdl.")
public class RecommendationContent
    extends RecordTemplate
{

    private final static RecommendationContent.Fields _fields = new RecommendationContent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Content to display within each recommendation module*/record RecommendationContent{/**String representation of content*/value:string/**Entity being recommended. Empty if the content being recommended is not an entity*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Additional context required to generate the the recommendation*/params:optional/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:com.linkedin.common.Urn}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}}", SchemaFormatType.PDL));
    private String _valueField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private RecommendationParams _paramsField = null;
    private RecommendationContent.ChangeListener __changeListener = new RecommendationContent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Params = SCHEMA.getField("params");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RecommendationContent() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public RecommendationContent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RecommendationContent.Fields fields() {
        return _fields;
    }

    public static RecommendationContent.ProjectionMask createMask() {
        return new RecommendationContent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see RecommendationContent.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationContent.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public RecommendationContent setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.metadata.recommendation.RecommendationContent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#value
     */
    public RecommendationContent setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.metadata.recommendation.RecommendationContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return getEntity();
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationContent.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public RecommendationContent setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#entity
     */
    public RecommendationContent setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.recommendation.RecommendationContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public boolean hasParams() {
        if (_paramsField!= null) {
            return true;
        }
        return super._map.containsKey("params");
    }

    /**
     * Remover for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public void removeParams() {
        super._map.remove("params");
    }

    /**
     * Getter for params
     * 
     * @see RecommendationContent.Fields#params
     */
    @Nullable
    public RecommendationParams getParams(GetMode mode) {
        return getParams();
    }

    /**
     * Getter for params
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationContent.Fields#params
     */
    @Nullable
    public RecommendationParams getParams() {
        if (_paramsField!= null) {
            return _paramsField;
        } else {
            Object __rawValue = super._map.get("params");
            _paramsField = ((__rawValue == null)?null:new RecommendationParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _paramsField;
        }
    }

    /**
     * Setter for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public RecommendationContent setParams(
        @Nullable
        RecommendationParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for params
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#params
     */
    public RecommendationContent setParams(
        @Nonnull
        RecommendationParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field params of com.linkedin.metadata.recommendation.RecommendationContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "params", value.data());
            _paramsField = value;
        }
        return this;
    }

    @Override
    public RecommendationContent clone()
        throws CloneNotSupportedException
    {
        RecommendationContent __clone = ((RecommendationContent) super.clone());
        __clone.__changeListener = new RecommendationContent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RecommendationContent copy()
        throws CloneNotSupportedException
    {
        RecommendationContent __copy = ((RecommendationContent) super.copy());
        __copy._paramsField = null;
        __copy._valueField = null;
        __copy._entityField = null;
        __copy.__changeListener = new RecommendationContent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RecommendationContent __objectRef;

        private ChangeListener(RecommendationContent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "params":
                    __objectRef._paramsField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * String representation of content
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Entity being recommended. Empty if the content being recommended is not an entity
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Additional context required to generate the the recommendation
         * 
         */
        public com.linkedin.metadata.recommendation.RecommendationParams.Fields params() {
            return new com.linkedin.metadata.recommendation.RecommendationParams.Fields(getPathComponents(), "params");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.recommendation.RecommendationParams.ProjectionMask _paramsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * String representation of content
         * 
         */
        public RecommendationContent.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Entity being recommended. Empty if the content being recommended is not an entity
         * 
         */
        public RecommendationContent.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context required to generate the the recommendation
         * 
         */
        public RecommendationContent.ProjectionMask withParams(Function<com.linkedin.metadata.recommendation.RecommendationParams.ProjectionMask, com.linkedin.metadata.recommendation.RecommendationParams.ProjectionMask> nestedMask) {
            _paramsMask = nestedMask.apply(((_paramsMask == null)?RecommendationParams.createMask():_paramsMask));
            getDataMap().put("params", _paramsMask.getDataMap());
            return this;
        }

        /**
         * Additional context required to generate the the recommendation
         * 
         */
        public RecommendationContent.ProjectionMask withParams() {
            _paramsMask = null;
            getDataMap().put("params", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
