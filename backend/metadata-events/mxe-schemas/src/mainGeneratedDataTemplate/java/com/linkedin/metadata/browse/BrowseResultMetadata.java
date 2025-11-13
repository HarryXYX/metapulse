
package com.linkedin.metadata.browse;

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
 * The model for browse result metadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultMetadata.pdl.")
public class BrowseResultMetadata
    extends RecordTemplate
{

    private final static BrowseResultMetadata.Fields _fields = new BrowseResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**Total number of entities we can reach from path*/totalNumEntities:long}", SchemaFormatType.PDL));
    private String _pathField = null;
    private Long _totalNumEntitiesField = null;
    private BrowseResultMetadata.ChangeListener __changeListener = new BrowseResultMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static RecordDataSchema.Field FIELD_TotalNumEntities = SCHEMA.getField("totalNumEntities");

    public BrowseResultMetadata() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BrowseResultMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowseResultMetadata.Fields fields() {
        return _fields;
    }

    public static BrowseResultMetadata.ProjectionMask createMask() {
        return new BrowseResultMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public boolean hasPath() {
        if (_pathField!= null) {
            return true;
        }
        return super._map.containsKey("path");
    }

    /**
     * Remover for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    @Nullable
    public String getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPath();
            case DEFAULT:
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _pathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultMetadata.Fields#path
     */
    @Nonnull
    public String getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("path");
            }
            _pathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see BrowseResultMetadata.Fields#path
     */
    public BrowseResultMetadata setPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.metadata.browse.BrowseResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultMetadata.Fields#path
     */
    public BrowseResultMetadata setPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.metadata.browse.BrowseResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value);
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public boolean hasTotalNumEntities() {
        if (_totalNumEntitiesField!= null) {
            return true;
        }
        return super._map.containsKey("totalNumEntities");
    }

    /**
     * Remover for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public void removeTotalNumEntities() {
        super._map.remove("totalNumEntities");
    }

    /**
     * Getter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    @Nullable
    public Long getTotalNumEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTotalNumEntities();
            case DEFAULT:
            case NULL:
                if (_totalNumEntitiesField!= null) {
                    return _totalNumEntitiesField;
                } else {
                    Object __rawValue = super._map.get("totalNumEntities");
                    _totalNumEntitiesField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _totalNumEntitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for totalNumEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    @Nonnull
    public Long getTotalNumEntities() {
        if (_totalNumEntitiesField!= null) {
            return _totalNumEntitiesField;
        } else {
            Object __rawValue = super._map.get("totalNumEntities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("totalNumEntities");
            }
            _totalNumEntitiesField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _totalNumEntitiesField;
        }
    }

    /**
     * Setter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalNumEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field totalNumEntities of com.linkedin.metadata.browse.BrowseResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalNumEntities", DataTemplateUtil.coerceLongInput(value));
                    _totalNumEntitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalNumEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalNumEntities", DataTemplateUtil.coerceLongInput(value));
                    _totalNumEntitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalNumEntities", DataTemplateUtil.coerceLongInput(value));
                    _totalNumEntitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalNumEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalNumEntities of com.linkedin.metadata.browse.BrowseResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalNumEntities", DataTemplateUtil.coerceLongInput(value));
            _totalNumEntitiesField = value;
        }
        return this;
    }

    /**
     * Setter for totalNumEntities
     * 
     * @see BrowseResultMetadata.Fields#totalNumEntities
     */
    public BrowseResultMetadata setTotalNumEntities(long value) {
        CheckedUtil.putWithoutChecking(super._map, "totalNumEntities", DataTemplateUtil.coerceLongInput(value));
        _totalNumEntitiesField = value;
        return this;
    }

    @Override
    public BrowseResultMetadata clone()
        throws CloneNotSupportedException
    {
        BrowseResultMetadata __clone = ((BrowseResultMetadata) super.clone());
        __clone.__changeListener = new BrowseResultMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowseResultMetadata copy()
        throws CloneNotSupportedException
    {
        BrowseResultMetadata __copy = ((BrowseResultMetadata) super.copy());
        __copy._totalNumEntitiesField = null;
        __copy._pathField = null;
        __copy.__changeListener = new BrowseResultMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowseResultMetadata __objectRef;

        private ChangeListener(BrowseResultMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "totalNumEntities":
                    __objectRef._totalNumEntitiesField = null;
                    break;
                case "path":
                    __objectRef._pathField = null;
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
         * Path that is being browsed
         * 
         */
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * Total number of entities we can reach from path
         * 
         */
        public PathSpec totalNumEntities() {
            return new PathSpec(getPathComponents(), "totalNumEntities");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Path that is being browsed
         * 
         */
        public BrowseResultMetadata.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Total number of entities we can reach from path
         * 
         */
        public BrowseResultMetadata.ProjectionMask withTotalNumEntities() {
            getDataMap().put("totalNumEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
