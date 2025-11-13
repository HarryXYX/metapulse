
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
 * Info about the surface area of the product that this template is deployed in
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/template/DataHubPageTemplateSurface.pdl.")
public class DataHubPageTemplateSurface
    extends RecordTemplate
{

    private final static DataHubPageTemplateSurface.Fields _fields = new DataHubPageTemplateSurface.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**Info about the surface area of the product that this template is deployed in*/record DataHubPageTemplateSurface{/**Where exactly is this template being used*/@Searchable.fieldType=\"KEYWORD\"surfaceType:enum PageTemplateSurfaceType{/**This template applies to what to display on the home page for users.*/HOME_PAGE/**This template applies to what to display on asset summary pages*/ASSET_SUMMARY}}", SchemaFormatType.PDL));
    private PageTemplateSurfaceType _surfaceTypeField = null;
    private DataHubPageTemplateSurface.ChangeListener __changeListener = new DataHubPageTemplateSurface.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SurfaceType = SCHEMA.getField("surfaceType");

    public DataHubPageTemplateSurface() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubPageTemplateSurface(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageTemplateSurface.Fields fields() {
        return _fields;
    }

    public static DataHubPageTemplateSurface.ProjectionMask createMask() {
        return new DataHubPageTemplateSurface.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for surfaceType
     * 
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    public boolean hasSurfaceType() {
        if (_surfaceTypeField!= null) {
            return true;
        }
        return super._map.containsKey("surfaceType");
    }

    /**
     * Remover for surfaceType
     * 
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    public void removeSurfaceType() {
        super._map.remove("surfaceType");
    }

    /**
     * Getter for surfaceType
     * 
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    @Nullable
    public PageTemplateSurfaceType getSurfaceType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSurfaceType();
            case DEFAULT:
            case NULL:
                if (_surfaceTypeField!= null) {
                    return _surfaceTypeField;
                } else {
                    Object __rawValue = super._map.get("surfaceType");
                    _surfaceTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageTemplateSurfaceType.class, PageTemplateSurfaceType.$UNKNOWN);
                    return _surfaceTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for surfaceType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    @Nonnull
    public PageTemplateSurfaceType getSurfaceType() {
        if (_surfaceTypeField!= null) {
            return _surfaceTypeField;
        } else {
            Object __rawValue = super._map.get("surfaceType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("surfaceType");
            }
            _surfaceTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PageTemplateSurfaceType.class, PageTemplateSurfaceType.$UNKNOWN);
            return _surfaceTypeField;
        }
    }

    /**
     * Setter for surfaceType
     * 
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    public DataHubPageTemplateSurface setSurfaceType(
        @Nullable
        PageTemplateSurfaceType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSurfaceType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field surfaceType of com.linkedin.template.DataHubPageTemplateSurface");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "surfaceType", value.name());
                    _surfaceTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSurfaceType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "surfaceType", value.name());
                    _surfaceTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "surfaceType", value.name());
                    _surfaceTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for surfaceType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateSurface.Fields#surfaceType
     */
    public DataHubPageTemplateSurface setSurfaceType(
        @Nonnull
        PageTemplateSurfaceType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field surfaceType of com.linkedin.template.DataHubPageTemplateSurface to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "surfaceType", value.name());
            _surfaceTypeField = value;
        }
        return this;
    }

    @Override
    public DataHubPageTemplateSurface clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateSurface __clone = ((DataHubPageTemplateSurface) super.clone());
        __clone.__changeListener = new DataHubPageTemplateSurface.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageTemplateSurface copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateSurface __copy = ((DataHubPageTemplateSurface) super.copy());
        __copy._surfaceTypeField = null;
        __copy.__changeListener = new DataHubPageTemplateSurface.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageTemplateSurface __objectRef;

        private ChangeListener(DataHubPageTemplateSurface reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "surfaceType":
                    __objectRef._surfaceTypeField = null;
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
         * Where exactly is this template being used
         * 
         */
        public PathSpec surfaceType() {
            return new PathSpec(getPathComponents(), "surfaceType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Where exactly is this template being used
         * 
         */
        public DataHubPageTemplateSurface.ProjectionMask withSurfaceType() {
            getDataMap().put("surfaceType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
