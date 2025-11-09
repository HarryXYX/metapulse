
package com.linkedin.metadata.query;

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
 * The model for browse result metadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/BrowseResultMetadata.pdl.")
public class BrowseResultMetadata
    extends RecordTemplate
{

    private final static BrowseResultMetadata.Fields _fields = new BrowseResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**A list of groups and total number of entities inside those groups under the queried path*/groups:array[record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}]=[]/**Total number of entities we can reach from path*/totalNumEntities:long}", SchemaFormatType.PDL));
    private String _pathField = null;
    private BrowseResultGroupArray _groupsField = null;
    private Long _totalNumEntitiesField = null;
    private BrowseResultMetadata.ChangeListener __changeListener = new BrowseResultMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static BrowseResultGroupArray DEFAULT_Groups;
    private final static RecordDataSchema.Field FIELD_TotalNumEntities = SCHEMA.getField("totalNumEntities");

    static {
        DEFAULT_Groups = ((FIELD_Groups.getDefault() == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(FIELD_Groups.getDefault(), DataList.class)));
    }

    public BrowseResultMetadata() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
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
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.metadata.query.BrowseResultMetadata");
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
            throw new NullPointerException("Cannot set field path of com.linkedin.metadata.query.BrowseResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value);
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see BrowseResultMetadata.Fields#groups
     */
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see BrowseResultMetadata.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see BrowseResultMetadata.Fields#groups
     */
    @Nullable
    public BrowseResultGroupArray getGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getGroups();
            case NULL:
                if (_groupsField!= null) {
                    return _groupsField;
                } else {
                    Object __rawValue = super._map.get("groups");
                    _groupsField = ((__rawValue == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _groupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultMetadata.Fields#groups
     */
    @Nonnull
    public BrowseResultGroupArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            if (__rawValue == null) {
                return DEFAULT_Groups;
            }
            _groupsField = ((__rawValue == null)?null:new BrowseResultGroupArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see BrowseResultMetadata.Fields#groups
     */
    public BrowseResultMetadata setGroups(
        @Nullable
        BrowseResultGroupArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groups of com.linkedin.metadata.query.BrowseResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultMetadata.Fields#groups
     */
    public BrowseResultMetadata setGroups(
        @Nonnull
        BrowseResultGroupArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.metadata.query.BrowseResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
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
                    throw new IllegalArgumentException("Cannot remove mandatory field totalNumEntities of com.linkedin.metadata.query.BrowseResultMetadata");
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
            throw new NullPointerException("Cannot set field totalNumEntities of com.linkedin.metadata.query.BrowseResultMetadata to null");
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
        __copy._groupsField = null;
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
                case "groups":
                    __objectRef._groupsField = null;
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public com.linkedin.metadata.query.BrowseResultGroupArray.Fields groups() {
            return new com.linkedin.metadata.query.BrowseResultGroupArray.Fields(getPathComponents(), "groups");
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
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

        private com.linkedin.metadata.query.BrowseResultGroupArray.ProjectionMask _groupsMask;

        ProjectionMask() {
            super(4);
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultMetadata.ProjectionMask withGroups(Function<com.linkedin.metadata.query.BrowseResultGroupArray.ProjectionMask, com.linkedin.metadata.query.BrowseResultGroupArray.ProjectionMask> nestedMask) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultMetadata.ProjectionMask withGroups() {
            _groupsMask = null;
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultMetadata.ProjectionMask withGroups(Function<com.linkedin.metadata.query.BrowseResultGroupArray.ProjectionMask, com.linkedin.metadata.query.BrowseResultGroupArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultMetadata.ProjectionMask withGroups(Integer start, Integer count) {
            _groupsMask = null;
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
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
