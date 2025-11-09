
package com.linkedin.template;

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
 * Info about the visibility of this template
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/DataHubPageTemplateVisibility.pdl.")
public class DataHubPageTemplateVisibility
    extends RecordTemplate
{

    private final static DataHubPageTemplateVisibility.Fields _fields = new DataHubPageTemplateVisibility.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**Info about the visibility of this template*/record DataHubPageTemplateVisibility{/**The scope of this template and who can use/see it*/@Searchable.fieldType=\"KEYWORD\"scope:enum PageTemplateScope{/**This template is used for individual use only*/PERSONAL/**This template is used across users*/GLOBAL}}", SchemaFormatType.PDL));
    private PageTemplateScope _scopeField = null;
    private DataHubPageTemplateVisibility.ChangeListener __changeListener = new DataHubPageTemplateVisibility.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Scope = SCHEMA.getField("scope");

    public DataHubPageTemplateVisibility() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubPageTemplateVisibility(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageTemplateVisibility.Fields fields() {
        return _fields;
    }

    public static DataHubPageTemplateVisibility.ProjectionMask createMask() {
        return new DataHubPageTemplateVisibility.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for scope
     * 
     * @see DataHubPageTemplateVisibility.Fields#scope
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
     * @see DataHubPageTemplateVisibility.Fields#scope
     */
    public void removeScope() {
        super._map.remove("scope");
    }

    /**
     * Getter for scope
     * 
     * @see DataHubPageTemplateVisibility.Fields#scope
     */
    @Nullable
    public PageTemplateScope getScope(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScope();
            case DEFAULT:
            case NULL:
                if (_scopeField!= null) {
                    return _scopeField;
                } else {
                    Object __rawValue = super._map.get("scope");
                    _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageTemplateScope.class, PageTemplateScope.$UNKNOWN);
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
     * @see DataHubPageTemplateVisibility.Fields#scope
     */
    @Nonnull
    public PageTemplateScope getScope() {
        if (_scopeField!= null) {
            return _scopeField;
        } else {
            Object __rawValue = super._map.get("scope");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("scope");
            }
            _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageTemplateScope.class, PageTemplateScope.$UNKNOWN);
            return _scopeField;
        }
    }

    /**
     * Setter for scope
     * 
     * @see DataHubPageTemplateVisibility.Fields#scope
     */
    public DataHubPageTemplateVisibility setScope(
        @Nullable
        PageTemplateScope value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScope(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field scope of com.linkedin.template.DataHubPageTemplateVisibility");
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
     * @see DataHubPageTemplateVisibility.Fields#scope
     */
    public DataHubPageTemplateVisibility setScope(
        @Nonnull
        PageTemplateScope value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scope of com.linkedin.template.DataHubPageTemplateVisibility to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
            _scopeField = value;
        }
        return this;
    }

    @Override
    public DataHubPageTemplateVisibility clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateVisibility __clone = ((DataHubPageTemplateVisibility) super.clone());
        __clone.__changeListener = new DataHubPageTemplateVisibility.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageTemplateVisibility copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateVisibility __copy = ((DataHubPageTemplateVisibility) super.copy());
        __copy._scopeField = null;
        __copy.__changeListener = new DataHubPageTemplateVisibility.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageTemplateVisibility __objectRef;

        private ChangeListener(DataHubPageTemplateVisibility reference) {
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
         * The scope of this template and who can use/see it
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
         * The scope of this template and who can use/see it
         * 
         */
        public DataHubPageTemplateVisibility.ProjectionMask withScope() {
            getDataMap().put("scope", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
