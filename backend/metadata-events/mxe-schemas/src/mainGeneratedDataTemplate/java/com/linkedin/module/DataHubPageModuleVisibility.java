
package com.linkedin.module;

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
 * Info about the visibility of this module
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/module/DataHubPageModuleVisibility.pdl.")
public class DataHubPageModuleVisibility
    extends RecordTemplate
{

    private final static DataHubPageModuleVisibility.Fields _fields = new DataHubPageModuleVisibility.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**Info about the visibility of this module*/record DataHubPageModuleVisibility{/**Audit stamp for when and by whom this module was created*/@Searchable.fieldType=\"KEYWORD\"scope:enum PageModuleScope{/**This module is used for individual use only*/PERSONAL/**This module is discoverable and can be used by any user on the platform*/GLOBAL}}", SchemaFormatType.PDL));
    private PageModuleScope _scopeField = null;
    private DataHubPageModuleVisibility.ChangeListener __changeListener = new DataHubPageModuleVisibility.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Scope = SCHEMA.getField("scope");

    public DataHubPageModuleVisibility() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubPageModuleVisibility(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageModuleVisibility.Fields fields() {
        return _fields;
    }

    public static DataHubPageModuleVisibility.ProjectionMask createMask() {
        return new DataHubPageModuleVisibility.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for scope
     * 
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    public boolean hasScope() {
        if (_scopeField!= null) {
            return true;
        }
        return super._map.containsKey("scope");
    }

    /**
     * Remover for scope
     * 
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    public void removeScope() {
        super._map.remove("scope");
    }

    /**
     * Getter for scope
     * 
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    @Nullable
    public PageModuleScope getScope(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScope();
            case DEFAULT:
            case NULL:
                if (_scopeField!= null) {
                    return _scopeField;
                } else {
                    Object __rawValue = super._map.get("scope");
                    _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageModuleScope.class, PageModuleScope.$UNKNOWN);
                    return _scopeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for scope
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    @Nonnull
    public PageModuleScope getScope() {
        if (_scopeField!= null) {
            return _scopeField;
        } else {
            Object __rawValue = super._map.get("scope");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("scope");
            }
            _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageModuleScope.class, PageModuleScope.$UNKNOWN);
            return _scopeField;
        }
    }

    /**
     * Setter for scope
     * 
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    public DataHubPageModuleVisibility setScope(
        @Nullable
        PageModuleScope value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScope(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field scope of com.linkedin.module.DataHubPageModuleVisibility");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScope();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scope
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleVisibility.Fields#scope
     */
    public DataHubPageModuleVisibility setScope(
        @Nonnull
        PageModuleScope value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scope of com.linkedin.module.DataHubPageModuleVisibility to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
            _scopeField = value;
        }
        return this;
    }

    @Override
    public DataHubPageModuleVisibility clone()
        throws CloneNotSupportedException
    {
        DataHubPageModuleVisibility __clone = ((DataHubPageModuleVisibility) super.clone());
        __clone.__changeListener = new DataHubPageModuleVisibility.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageModuleVisibility copy()
        throws CloneNotSupportedException
    {
        DataHubPageModuleVisibility __copy = ((DataHubPageModuleVisibility) super.copy());
        __copy._scopeField = null;
        __copy.__changeListener = new DataHubPageModuleVisibility.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageModuleVisibility __objectRef;

        private ChangeListener(DataHubPageModuleVisibility reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "scope":
                    __objectRef._scopeField = null;
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
         * Audit stamp for when and by whom this module was created
         * 
         */
        public PathSpec scope() {
            return new PathSpec(getPathComponents(), "scope");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Audit stamp for when and by whom this module was created
         * 
         */
        public DataHubPageModuleVisibility.ProjectionMask withScope() {
            getDataMap().put("scope", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
