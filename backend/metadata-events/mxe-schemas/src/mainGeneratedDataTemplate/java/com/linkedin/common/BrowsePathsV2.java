
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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


/**
 * Shared aspect containing a Browse Path to be indexed for an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BrowsePathsV2.pdl.")
public class BrowsePathsV2
    extends RecordTemplate
{

    private final static BrowsePathsV2 .Fields _fields = new BrowsePathsV2 .Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private BrowsePathEntryArray _pathField = null;
    private BrowsePathsV2 .ChangeListener __changeListener = new BrowsePathsV2 .ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");

    public BrowsePathsV2() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BrowsePathsV2(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowsePathsV2 .Fields fields() {
        return _fields;
    }

    public static BrowsePathsV2 .ProjectionMask createMask() {
        return new BrowsePathsV2 .ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for path
     * 
     * @see BrowsePathsV2.Fields#path
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
     * @see BrowsePathsV2.Fields#path
     */
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see BrowsePathsV2.Fields#path
     */
    @Nullable
    public BrowsePathEntryArray getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPath();
            case DEFAULT:
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = ((__rawValue == null)?null:new BrowsePathEntryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see BrowsePathsV2.Fields#path
     */
    @Nonnull
    public BrowsePathEntryArray getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("path");
            }
            _pathField = ((__rawValue == null)?null:new BrowsePathEntryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see BrowsePathsV2.Fields#path
     */
    public BrowsePathsV2 setPath(
        @Nullable
        BrowsePathEntryArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.common.BrowsePathsV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
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
     * @see BrowsePathsV2.Fields#path
     */
    public BrowsePathsV2 setPath(
        @Nonnull
        BrowsePathEntryArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.common.BrowsePathsV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value.data());
            _pathField = value;
        }
        return this;
    }

    @Override
    public BrowsePathsV2 clone()
        throws CloneNotSupportedException
    {
        BrowsePathsV2 __clone = ((BrowsePathsV2) super.clone());
        __clone.__changeListener = new BrowsePathsV2 .ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowsePathsV2 copy()
        throws CloneNotSupportedException
    {
        BrowsePathsV2 __copy = ((BrowsePathsV2) super.copy());
        __copy._pathField = null;
        __copy.__changeListener = new BrowsePathsV2 .ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowsePathsV2 __objectRef;

        private ChangeListener(BrowsePathsV2 reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public com.linkedin.common.BrowsePathEntryArray.Fields path() {
            return new com.linkedin.common.BrowsePathEntryArray.Fields(getPathComponents(), "path");
        }

        /**
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public PathSpec path(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "path");
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

        private com.linkedin.common.BrowsePathEntryArray.ProjectionMask _pathMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public BrowsePathsV2 .ProjectionMask withPath(Function<com.linkedin.common.BrowsePathEntryArray.ProjectionMask, com.linkedin.common.BrowsePathEntryArray.ProjectionMask> nestedMask) {
            _pathMask = nestedMask.apply(((_pathMask == null)?BrowsePathEntryArray.createMask():_pathMask));
            getDataMap().put("path", _pathMask.getDataMap());
            return this;
        }

        /**
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public BrowsePathsV2 .ProjectionMask withPath() {
            _pathMask = null;
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public BrowsePathsV2 .ProjectionMask withPath(Function<com.linkedin.common.BrowsePathEntryArray.ProjectionMask, com.linkedin.common.BrowsePathEntryArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _pathMask = nestedMask.apply(((_pathMask == null)?BrowsePathEntryArray.createMask():_pathMask));
            getDataMap().put("path", _pathMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("path").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("path").put("$count", count);
            }
            return this;
        }

        /**
         * A valid browse path for the entity. This field is provided by DataHub by default.
         * This aspect is a newer version of browsePaths where we can encode more information in the path.
         * This path is also based on containers for a given entity if it has containers.
         * 
         * This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.
         * These paths should not include high level info captured elsewhere ie. Platform and Environment.
         * 
         */
        public BrowsePathsV2 .ProjectionMask withPath(Integer start, Integer count) {
            _pathMask = null;
            getDataMap().put("path", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("path").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("path").put("$count", count);
            }
            return this;
        }

    }

}
