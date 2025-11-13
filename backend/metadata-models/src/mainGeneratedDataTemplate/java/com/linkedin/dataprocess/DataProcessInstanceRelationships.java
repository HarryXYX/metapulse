
package com.linkedin.dataprocess;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataList;
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
 * Information about Data process relationships
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceRelationships.pdl.")
public class DataProcessInstanceRelationships
    extends RecordTemplate
{

    private final static DataProcessInstanceRelationships.Fields _fields = new DataProcessInstanceRelationships.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess/**Information about Data process relationships*/@Aspect.name=\"dataProcessInstanceRelationships\"record DataProcessInstanceRelationships{/**The parent entity whose run instance it is*/@Relationship={\"entityTypes\":[\"dataJob\",\"dataFlow\",\"dataset\"],\"name\":\"InstanceOf\"}@Searchable.`/*`={\"fieldName\":\"parentTemplate\",\"fieldType\":\"URN\",\"queryByDefault\":false}parentTemplate:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The parent DataProcessInstance where it belongs to.\nIf it is a Airflow Task then it should belong to an Airflow Dag run as well\nwhich will be another DataProcessInstance*/@Relationship={\"entityTypes\":[\"dataProcessInstance\"],\"name\":\"ChildOf\"}@Searchable.`/*`={\"fieldName\":\"parentInstance\",\"fieldType\":\"URN\",\"queryByDefault\":false}parentInstance:optional com.linkedin.common.Urn/**Input DataProcessInstance which triggered this dataprocess instance*/@Relationship.`/*`={\"entityTypes\":[\"dataProcessInstance\"],\"name\":\"UpstreamOf\"}@Searchable.`/*`={\"fieldName\":\"upstream\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numUpstreams\",\"queryByDefault\":false}upstreamInstances:array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _parentTemplateField = null;
    private com.linkedin.common.urn.Urn _parentInstanceField = null;
    private UrnArray _upstreamInstancesField = null;
    private DataProcessInstanceRelationships.ChangeListener __changeListener = new DataProcessInstanceRelationships.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ParentTemplate = SCHEMA.getField("parentTemplate");
    private final static RecordDataSchema.Field FIELD_ParentInstance = SCHEMA.getField("parentInstance");
    private final static RecordDataSchema.Field FIELD_UpstreamInstances = SCHEMA.getField("upstreamInstances");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataProcessInstanceRelationships() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataProcessInstanceRelationships(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessInstanceRelationships.Fields fields() {
        return _fields;
    }

    public static DataProcessInstanceRelationships.ProjectionMask createMask() {
        return new DataProcessInstanceRelationships.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for parentTemplate
     * 
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    public boolean hasParentTemplate() {
        if (_parentTemplateField!= null) {
            return true;
        }
        return super._map.containsKey("parentTemplate");
    }

    /**
     * Remover for parentTemplate
     * 
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    public void removeParentTemplate() {
        super._map.remove("parentTemplate");
    }

    /**
     * Getter for parentTemplate
     * 
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    @Nullable
    public com.linkedin.common.urn.Urn getParentTemplate(GetMode mode) {
        return getParentTemplate();
    }

    /**
     * Getter for parentTemplate
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    @Nullable
    public com.linkedin.common.urn.Urn getParentTemplate() {
        if (_parentTemplateField!= null) {
            return _parentTemplateField;
        } else {
            Object __rawValue = super._map.get("parentTemplate");
            _parentTemplateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _parentTemplateField;
        }
    }

    /**
     * Setter for parentTemplate
     * 
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    public DataProcessInstanceRelationships setParentTemplate(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParentTemplate(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParentTemplate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentTemplateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parentTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentTemplateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parentTemplate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceRelationships.Fields#parentTemplate
     */
    public DataProcessInstanceRelationships setParentTemplate(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentTemplate of com.linkedin.dataprocess.DataProcessInstanceRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _parentTemplateField = value;
        }
        return this;
    }

    /**
     * Existence checker for parentInstance
     * 
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    public boolean hasParentInstance() {
        if (_parentInstanceField!= null) {
            return true;
        }
        return super._map.containsKey("parentInstance");
    }

    /**
     * Remover for parentInstance
     * 
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    public void removeParentInstance() {
        super._map.remove("parentInstance");
    }

    /**
     * Getter for parentInstance
     * 
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    @Nullable
    public com.linkedin.common.urn.Urn getParentInstance(GetMode mode) {
        return getParentInstance();
    }

    /**
     * Getter for parentInstance
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    @Nullable
    public com.linkedin.common.urn.Urn getParentInstance() {
        if (_parentInstanceField!= null) {
            return _parentInstanceField;
        } else {
            Object __rawValue = super._map.get("parentInstance");
            _parentInstanceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _parentInstanceField;
        }
    }

    /**
     * Setter for parentInstance
     * 
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    public DataProcessInstanceRelationships setParentInstance(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParentInstance(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParentInstance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parentInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentInstanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parentInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _parentInstanceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parentInstance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceRelationships.Fields#parentInstance
     */
    public DataProcessInstanceRelationships setParentInstance(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parentInstance of com.linkedin.dataprocess.DataProcessInstanceRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parentInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _parentInstanceField = value;
        }
        return this;
    }

    /**
     * Existence checker for upstreamInstances
     * 
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    public boolean hasUpstreamInstances() {
        if (_upstreamInstancesField!= null) {
            return true;
        }
        return super._map.containsKey("upstreamInstances");
    }

    /**
     * Remover for upstreamInstances
     * 
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    public void removeUpstreamInstances() {
        super._map.remove("upstreamInstances");
    }

    /**
     * Getter for upstreamInstances
     * 
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    @Nullable
    public UrnArray getUpstreamInstances(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUpstreamInstances();
            case DEFAULT:
            case NULL:
                if (_upstreamInstancesField!= null) {
                    return _upstreamInstancesField;
                } else {
                    Object __rawValue = super._map.get("upstreamInstances");
                    _upstreamInstancesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _upstreamInstancesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for upstreamInstances
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    @Nonnull
    public UrnArray getUpstreamInstances() {
        if (_upstreamInstancesField!= null) {
            return _upstreamInstancesField;
        } else {
            Object __rawValue = super._map.get("upstreamInstances");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("upstreamInstances");
            }
            _upstreamInstancesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _upstreamInstancesField;
        }
    }

    /**
     * Setter for upstreamInstances
     * 
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    public DataProcessInstanceRelationships setUpstreamInstances(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpstreamInstances(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field upstreamInstances of com.linkedin.dataprocess.DataProcessInstanceRelationships");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamInstances", value.data());
                    _upstreamInstancesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpstreamInstances();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamInstances", value.data());
                    _upstreamInstancesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamInstances", value.data());
                    _upstreamInstancesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for upstreamInstances
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceRelationships.Fields#upstreamInstances
     */
    public DataProcessInstanceRelationships setUpstreamInstances(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field upstreamInstances of com.linkedin.dataprocess.DataProcessInstanceRelationships to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "upstreamInstances", value.data());
            _upstreamInstancesField = value;
        }
        return this;
    }

    @Override
    public DataProcessInstanceRelationships clone()
        throws CloneNotSupportedException
    {
        DataProcessInstanceRelationships __clone = ((DataProcessInstanceRelationships) super.clone());
        __clone.__changeListener = new DataProcessInstanceRelationships.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessInstanceRelationships copy()
        throws CloneNotSupportedException
    {
        DataProcessInstanceRelationships __copy = ((DataProcessInstanceRelationships) super.copy());
        __copy._parentInstanceField = null;
        __copy._parentTemplateField = null;
        __copy._upstreamInstancesField = null;
        __copy.__changeListener = new DataProcessInstanceRelationships.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessInstanceRelationships __objectRef;

        private ChangeListener(DataProcessInstanceRelationships reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "parentInstance":
                    __objectRef._parentInstanceField = null;
                    break;
                case "parentTemplate":
                    __objectRef._parentTemplateField = null;
                    break;
                case "upstreamInstances":
                    __objectRef._upstreamInstancesField = null;
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
         * The parent entity whose run instance it is
         * 
         */
        public PathSpec parentTemplate() {
            return new PathSpec(getPathComponents(), "parentTemplate");
        }

        /**
         * The parent DataProcessInstance where it belongs to.
         * If it is a Airflow Task then it should belong to an Airflow Dag run as well
         * which will be another DataProcessInstance
         * 
         */
        public PathSpec parentInstance() {
            return new PathSpec(getPathComponents(), "parentInstance");
        }

        /**
         * Input DataProcessInstance which triggered this dataprocess instance
         * 
         */
        public PathSpec upstreamInstances() {
            return new PathSpec(getPathComponents(), "upstreamInstances");
        }

        /**
         * Input DataProcessInstance which triggered this dataprocess instance
         * 
         */
        public PathSpec upstreamInstances(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upstreamInstances");
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


        ProjectionMask() {
            super(4);
        }

        /**
         * The parent entity whose run instance it is
         * 
         */
        public DataProcessInstanceRelationships.ProjectionMask withParentTemplate() {
            getDataMap().put("parentTemplate", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parent DataProcessInstance where it belongs to.
         * If it is a Airflow Task then it should belong to an Airflow Dag run as well
         * which will be another DataProcessInstance
         * 
         */
        public DataProcessInstanceRelationships.ProjectionMask withParentInstance() {
            getDataMap().put("parentInstance", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input DataProcessInstance which triggered this dataprocess instance
         * 
         */
        public DataProcessInstanceRelationships.ProjectionMask withUpstreamInstances() {
            getDataMap().put("upstreamInstances", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input DataProcessInstance which triggered this dataprocess instance
         * 
         */
        public DataProcessInstanceRelationships.ProjectionMask withUpstreamInstances(Integer start, Integer count) {
            getDataMap().put("upstreamInstances", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("upstreamInstances").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("upstreamInstances").put("$count", count);
            }
            return this;
        }

    }

}
