
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.StringArray;


/**
 * Shared aspect containing Browse Paths to be indexed for an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/BrowsePaths.pdl.")
public class BrowsePaths
    extends RecordTemplate
{

    private final static BrowsePaths.Fields _fields = new BrowsePaths.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}", SchemaFormatType.PDL));
    private StringArray _pathsField = null;
    private BrowsePaths.ChangeListener __changeListener = new BrowsePaths.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Paths = SCHEMA.getField("paths");

    public BrowsePaths() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BrowsePaths(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowsePaths.Fields fields() {
        return _fields;
    }

    public static BrowsePaths.ProjectionMask createMask() {
        return new BrowsePaths.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public boolean hasPaths() {
        if (_pathsField!= null) {
            return true;
        }
        return super._map.containsKey("paths");
    }

    /**
     * Remover for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public void removePaths() {
        super._map.remove("paths");
    }

    /**
     * Getter for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    @Nullable
    public StringArray getPaths(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPaths();
            case DEFAULT:
            case NULL:
                if (_pathsField!= null) {
                    return _pathsField;
                } else {
                    Object __rawValue = super._map.get("paths");
                    _pathsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _pathsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for paths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowsePaths.Fields#paths
     */
    @Nonnull
    public StringArray getPaths() {
        if (_pathsField!= null) {
            return _pathsField;
        } else {
            Object __rawValue = super._map.get("paths");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("paths");
            }
            _pathsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathsField;
        }
    }

    /**
     * Setter for paths
     * 
     * @see BrowsePaths.Fields#paths
     */
    public BrowsePaths setPaths(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPaths(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field paths of com.linkedin.common.BrowsePaths");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePaths();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for paths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowsePaths.Fields#paths
     */
    public BrowsePaths setPaths(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field paths of com.linkedin.common.BrowsePaths to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
            _pathsField = value;
        }
        return this;
    }

    @Override
    public BrowsePaths clone()
        throws CloneNotSupportedException
    {
        BrowsePaths __clone = ((BrowsePaths) super.clone());
        __clone.__changeListener = new BrowsePaths.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowsePaths copy()
        throws CloneNotSupportedException
    {
        BrowsePaths __copy = ((BrowsePaths) super.copy());
        __copy._pathsField = null;
        __copy.__changeListener = new BrowsePaths.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowsePaths __objectRef;

        private ChangeListener(BrowsePaths reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "paths":
                    __objectRef._pathsField = null;
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
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public PathSpec paths() {
            return new PathSpec(getPathComponents(), "paths");
        }

        /**
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public PathSpec paths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "paths");
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
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public BrowsePaths.ProjectionMask withPaths() {
            getDataMap().put("paths", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of valid browse paths for the entity.
         * 
         * Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'
         * 
         */
        public BrowsePaths.ProjectionMask withPaths(Integer start, Integer count) {
            getDataMap().put("paths", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("paths").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("paths").put("$count", count);
            }
            return this;
        }

    }

}
