
package com.linkedin.dataset;

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
 * Details about a View. 
 * e.g. Gets activated when subTypes is view
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/ViewProperties.pdl.")
public class ViewProperties
    extends RecordTemplate
{

    private final static ViewProperties.Fields _fields = new ViewProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Details about a View. \ne.g. Gets activated when subTypes is view*/@Aspect.name=\"viewProperties\"record ViewProperties{/**Whether the view is materialized*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}materialized:boolean/**The view logic*/viewLogic:string/**The formatted view logic. This is particularly used for SQL sources, where the SQL\nlogic is formatted for better readability, and with dbt, where this contains the\ncompiled SQL logic.*/formattedViewLogic:optional string/**The view logic language / dialect*/viewLanguage:string}", SchemaFormatType.PDL));
    private Boolean _materializedField = null;
    private String _viewLogicField = null;
    private String _formattedViewLogicField = null;
    private String _viewLanguageField = null;
    private ViewProperties.ChangeListener __changeListener = new ViewProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Materialized = SCHEMA.getField("materialized");
    private final static RecordDataSchema.Field FIELD_ViewLogic = SCHEMA.getField("viewLogic");
    private final static RecordDataSchema.Field FIELD_FormattedViewLogic = SCHEMA.getField("formattedViewLogic");
    private final static RecordDataSchema.Field FIELD_ViewLanguage = SCHEMA.getField("viewLanguage");

    public ViewProperties() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ViewProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ViewProperties.Fields fields() {
        return _fields;
    }

    public static ViewProperties.ProjectionMask createMask() {
        return new ViewProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public boolean hasMaterialized() {
        if (_materializedField!= null) {
            return true;
        }
        return super._map.containsKey("materialized");
    }

    /**
     * Remover for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public void removeMaterialized() {
        super._map.remove("materialized");
    }

    /**
     * Getter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    @Nullable
    public Boolean isMaterialized(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isMaterialized();
            case DEFAULT:
            case NULL:
                if (_materializedField!= null) {
                    return _materializedField;
                } else {
                    Object __rawValue = super._map.get("materialized");
                    _materializedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _materializedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for materialized
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#materialized
     */
    @Nonnull
    public Boolean isMaterialized() {
        if (_materializedField!= null) {
            return _materializedField;
        } else {
            Object __rawValue = super._map.get("materialized");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("materialized");
            }
            _materializedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _materializedField;
        }
    }

    /**
     * Setter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMaterialized(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field materialized of com.linkedin.dataset.ViewProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "materialized", value);
                    _materializedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMaterialized();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "materialized", value);
                    _materializedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "materialized", value);
                    _materializedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for materialized
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field materialized of com.linkedin.dataset.ViewProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "materialized", value);
            _materializedField = value;
        }
        return this;
    }

    /**
     * Setter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "materialized", value);
        _materializedField = value;
        return this;
    }

    /**
     * Existence checker for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public boolean hasViewLogic() {
        if (_viewLogicField!= null) {
            return true;
        }
        return super._map.containsKey("viewLogic");
    }

    /**
     * Remover for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public void removeViewLogic() {
        super._map.remove("viewLogic");
    }

    /**
     * Getter for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    @Nullable
    public String getViewLogic(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getViewLogic();
            case DEFAULT:
            case NULL:
                if (_viewLogicField!= null) {
                    return _viewLogicField;
                } else {
                    Object __rawValue = super._map.get("viewLogic");
                    _viewLogicField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _viewLogicField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for viewLogic
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#viewLogic
     */
    @Nonnull
    public String getViewLogic() {
        if (_viewLogicField!= null) {
            return _viewLogicField;
        } else {
            Object __rawValue = super._map.get("viewLogic");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("viewLogic");
            }
            _viewLogicField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _viewLogicField;
        }
    }

    /**
     * Setter for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public ViewProperties setViewLogic(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setViewLogic(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field viewLogic of com.linkedin.dataset.ViewProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "viewLogic", value);
                    _viewLogicField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeViewLogic();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "viewLogic", value);
                    _viewLogicField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "viewLogic", value);
                    _viewLogicField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for viewLogic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#viewLogic
     */
    public ViewProperties setViewLogic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field viewLogic of com.linkedin.dataset.ViewProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "viewLogic", value);
            _viewLogicField = value;
        }
        return this;
    }

    /**
     * Existence checker for formattedViewLogic
     * 
     * @see ViewProperties.Fields#formattedViewLogic
     */
    public boolean hasFormattedViewLogic() {
        if (_formattedViewLogicField!= null) {
            return true;
        }
        return super._map.containsKey("formattedViewLogic");
    }

    /**
     * Remover for formattedViewLogic
     * 
     * @see ViewProperties.Fields#formattedViewLogic
     */
    public void removeFormattedViewLogic() {
        super._map.remove("formattedViewLogic");
    }

    /**
     * Getter for formattedViewLogic
     * 
     * @see ViewProperties.Fields#formattedViewLogic
     */
    @Nullable
    public String getFormattedViewLogic(GetMode mode) {
        return getFormattedViewLogic();
    }

    /**
     * Getter for formattedViewLogic
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ViewProperties.Fields#formattedViewLogic
     */
    @Nullable
    public String getFormattedViewLogic() {
        if (_formattedViewLogicField!= null) {
            return _formattedViewLogicField;
        } else {
            Object __rawValue = super._map.get("formattedViewLogic");
            _formattedViewLogicField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _formattedViewLogicField;
        }
    }

    /**
     * Setter for formattedViewLogic
     * 
     * @see ViewProperties.Fields#formattedViewLogic
     */
    public ViewProperties setFormattedViewLogic(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFormattedViewLogic(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFormattedViewLogic();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "formattedViewLogic", value);
                    _formattedViewLogicField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "formattedViewLogic", value);
                    _formattedViewLogicField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for formattedViewLogic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#formattedViewLogic
     */
    public ViewProperties setFormattedViewLogic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field formattedViewLogic of com.linkedin.dataset.ViewProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "formattedViewLogic", value);
            _formattedViewLogicField = value;
        }
        return this;
    }

    /**
     * Existence checker for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public boolean hasViewLanguage() {
        if (_viewLanguageField!= null) {
            return true;
        }
        return super._map.containsKey("viewLanguage");
    }

    /**
     * Remover for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public void removeViewLanguage() {
        super._map.remove("viewLanguage");
    }

    /**
     * Getter for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    @Nullable
    public String getViewLanguage(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getViewLanguage();
            case DEFAULT:
            case NULL:
                if (_viewLanguageField!= null) {
                    return _viewLanguageField;
                } else {
                    Object __rawValue = super._map.get("viewLanguage");
                    _viewLanguageField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _viewLanguageField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for viewLanguage
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#viewLanguage
     */
    @Nonnull
    public String getViewLanguage() {
        if (_viewLanguageField!= null) {
            return _viewLanguageField;
        } else {
            Object __rawValue = super._map.get("viewLanguage");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("viewLanguage");
            }
            _viewLanguageField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _viewLanguageField;
        }
    }

    /**
     * Setter for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public ViewProperties setViewLanguage(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setViewLanguage(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field viewLanguage of com.linkedin.dataset.ViewProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "viewLanguage", value);
                    _viewLanguageField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeViewLanguage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "viewLanguage", value);
                    _viewLanguageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "viewLanguage", value);
                    _viewLanguageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for viewLanguage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#viewLanguage
     */
    public ViewProperties setViewLanguage(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field viewLanguage of com.linkedin.dataset.ViewProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "viewLanguage", value);
            _viewLanguageField = value;
        }
        return this;
    }

    @Override
    public ViewProperties clone()
        throws CloneNotSupportedException
    {
        ViewProperties __clone = ((ViewProperties) super.clone());
        __clone.__changeListener = new ViewProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ViewProperties copy()
        throws CloneNotSupportedException
    {
        ViewProperties __copy = ((ViewProperties) super.copy());
        __copy._formattedViewLogicField = null;
        __copy._viewLogicField = null;
        __copy._materializedField = null;
        __copy._viewLanguageField = null;
        __copy.__changeListener = new ViewProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ViewProperties __objectRef;

        private ChangeListener(ViewProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "formattedViewLogic":
                    __objectRef._formattedViewLogicField = null;
                    break;
                case "viewLogic":
                    __objectRef._viewLogicField = null;
                    break;
                case "materialized":
                    __objectRef._materializedField = null;
                    break;
                case "viewLanguage":
                    __objectRef._viewLanguageField = null;
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
         * Whether the view is materialized
         * 
         */
        public PathSpec materialized() {
            return new PathSpec(getPathComponents(), "materialized");
        }

        /**
         * The view logic
         * 
         */
        public PathSpec viewLogic() {
            return new PathSpec(getPathComponents(), "viewLogic");
        }

        /**
         * The formatted view logic. This is particularly used for SQL sources, where the SQL
         * logic is formatted for better readability, and with dbt, where this contains the
         * compiled SQL logic.
         * 
         */
        public PathSpec formattedViewLogic() {
            return new PathSpec(getPathComponents(), "formattedViewLogic");
        }

        /**
         * The view logic language / dialect
         * 
         */
        public PathSpec viewLanguage() {
            return new PathSpec(getPathComponents(), "viewLanguage");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Whether the view is materialized
         * 
         */
        public ViewProperties.ProjectionMask withMaterialized() {
            getDataMap().put("materialized", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The view logic
         * 
         */
        public ViewProperties.ProjectionMask withViewLogic() {
            getDataMap().put("viewLogic", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The formatted view logic. This is particularly used for SQL sources, where the SQL
         * logic is formatted for better readability, and with dbt, where this contains the
         * compiled SQL logic.
         * 
         */
        public ViewProperties.ProjectionMask withFormattedViewLogic() {
            getDataMap().put("formattedViewLogic", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The view logic language / dialect
         * 
         */
        public ViewProperties.ProjectionMask withViewLanguage() {
            getDataMap().put("viewLanguage", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
