
package com.linkedin.application;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Links from an Asset to its Applications
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/application/Applications.pdl.")
public class Applications
    extends RecordTemplate
{

    private final static Applications.Fields _fields = new Applications.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.application/**Links from an Asset to its Applications*/@Aspect.name=\"applications\"record Applications{/**The Applications attached to an Asset*/@Relationship.`/*`={\"entityTypes\":[\"application\"],\"name\":\"AssociatedWith\"}@Searchable.`/*`={\"addToFilters\":true,\"fieldName\":\"applications\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Application\",\"hasValuesFieldName\":\"hasApplication\"}applications:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _applicationsField = null;
    private Applications.ChangeListener __changeListener = new Applications.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Applications = SCHEMA.getField("applications");

    public Applications() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Applications(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Applications.Fields fields() {
        return _fields;
    }

    public static Applications.ProjectionMask createMask() {
        return new Applications.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for applications
     * 
     * @see Applications.Fields#applications
     */
    public boolean hasApplications() {
        if (_applicationsField!= null) {
            return true;
        }
        return super._map.containsKey("applications");
    }

    /**
     * Remover for applications
     * 
     * @see Applications.Fields#applications
     */
    public void removeApplications() {
        super._map.remove("applications");
    }

    /**
     * Getter for applications
     * 
     * @see Applications.Fields#applications
     */
    @Nullable
    public UrnArray getApplications(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getApplications();
            case DEFAULT:
            case NULL:
                if (_applicationsField!= null) {
                    return _applicationsField;
                } else {
                    Object __rawValue = super._map.get("applications");
                    _applicationsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _applicationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for applications
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Applications.Fields#applications
     */
    @Nonnull
    public UrnArray getApplications() {
        if (_applicationsField!= null) {
            return _applicationsField;
        } else {
            Object __rawValue = super._map.get("applications");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("applications");
            }
            _applicationsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _applicationsField;
        }
    }

    /**
     * Setter for applications
     * 
     * @see Applications.Fields#applications
     */
    public Applications setApplications(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setApplications(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field applications of com.linkedin.application.Applications");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
                    _applicationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeApplications();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
                    _applicationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
                    _applicationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for applications
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Applications.Fields#applications
     */
    public Applications setApplications(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field applications of com.linkedin.application.Applications to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
            _applicationsField = value;
        }
        return this;
    }

    @Override
    public Applications clone()
        throws CloneNotSupportedException
    {
        Applications __clone = ((Applications) super.clone());
        __clone.__changeListener = new Applications.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Applications copy()
        throws CloneNotSupportedException
    {
        Applications __copy = ((Applications) super.copy());
        __copy._applicationsField = null;
        __copy.__changeListener = new Applications.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Applications __objectRef;

        private ChangeListener(Applications reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "applications":
                    __objectRef._applicationsField = null;
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
         * The Applications attached to an Asset
         * 
         */
        public PathSpec applications() {
            return new PathSpec(getPathComponents(), "applications");
        }

        /**
         * The Applications attached to an Asset
         * 
         */
        public PathSpec applications(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "applications");
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
            super(2);
        }

        /**
         * The Applications attached to an Asset
         * 
         */
        public Applications.ProjectionMask withApplications() {
            getDataMap().put("applications", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The Applications attached to an Asset
         * 
         */
        public Applications.ProjectionMask withApplications(Integer start, Integer count) {
            getDataMap().put("applications", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("applications").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("applications").put("$count", count);
            }
            return this;
        }

    }

}
