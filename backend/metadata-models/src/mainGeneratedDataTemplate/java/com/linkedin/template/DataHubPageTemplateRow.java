
package com.linkedin.template;

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
 * A row of modules contained in a template
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/DataHubPageTemplateRow.pdl.")
public class DataHubPageTemplateRow
    extends RecordTemplate
{

    private final static DataHubPageTemplateRow.Fields _fields = new DataHubPageTemplateRow.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**A row of modules contained in a template*/record DataHubPageTemplateRow{/**The modules that exist in this template row*/modules:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _modulesField = null;
    private DataHubPageTemplateRow.ChangeListener __changeListener = new DataHubPageTemplateRow.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Modules = SCHEMA.getField("modules");

    public DataHubPageTemplateRow() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubPageTemplateRow(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageTemplateRow.Fields fields() {
        return _fields;
    }

    public static DataHubPageTemplateRow.ProjectionMask createMask() {
        return new DataHubPageTemplateRow.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for modules
     * 
     * @see DataHubPageTemplateRow.Fields#modules
     */
    public boolean hasModules() {
        if (_modulesField!= null) {
            return true;
        }
        return super._map.containsKey("modules");
    }

    /**
     * Remover for modules
     * 
     * @see DataHubPageTemplateRow.Fields#modules
     */
    public void removeModules() {
        super._map.remove("modules");
    }

    /**
     * Getter for modules
     * 
     * @see DataHubPageTemplateRow.Fields#modules
     */
    @Nullable
    public UrnArray getModules(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getModules();
            case DEFAULT:
            case NULL:
                if (_modulesField!= null) {
                    return _modulesField;
                } else {
                    Object __rawValue = super._map.get("modules");
                    _modulesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _modulesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for modules
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageTemplateRow.Fields#modules
     */
    @Nonnull
    public UrnArray getModules() {
        if (_modulesField!= null) {
            return _modulesField;
        } else {
            Object __rawValue = super._map.get("modules");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("modules");
            }
            _modulesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _modulesField;
        }
    }

    /**
     * Setter for modules
     * 
     * @see DataHubPageTemplateRow.Fields#modules
     */
    public DataHubPageTemplateRow setModules(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setModules(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field modules of com.linkedin.template.DataHubPageTemplateRow");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "modules", value.data());
                    _modulesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeModules();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "modules", value.data());
                    _modulesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "modules", value.data());
                    _modulesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for modules
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateRow.Fields#modules
     */
    public DataHubPageTemplateRow setModules(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field modules of com.linkedin.template.DataHubPageTemplateRow to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "modules", value.data());
            _modulesField = value;
        }
        return this;
    }

    @Override
    public DataHubPageTemplateRow clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateRow __clone = ((DataHubPageTemplateRow) super.clone());
        __clone.__changeListener = new DataHubPageTemplateRow.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageTemplateRow copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateRow __copy = ((DataHubPageTemplateRow) super.copy());
        __copy._modulesField = null;
        __copy.__changeListener = new DataHubPageTemplateRow.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageTemplateRow __objectRef;

        private ChangeListener(DataHubPageTemplateRow reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "modules":
                    __objectRef._modulesField = null;
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
         * The modules that exist in this template row
         * 
         */
        public PathSpec modules() {
            return new PathSpec(getPathComponents(), "modules");
        }

        /**
         * The modules that exist in this template row
         * 
         */
        public PathSpec modules(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "modules");
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
         * The modules that exist in this template row
         * 
         */
        public DataHubPageTemplateRow.ProjectionMask withModules() {
            getDataMap().put("modules", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The modules that exist in this template row
         * 
         */
        public DataHubPageTemplateRow.ProjectionMask withModules(Integer start, Integer count) {
            getDataMap().put("modules", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("modules").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("modules").put("$count", count);
            }
            return this;
        }

    }

}
