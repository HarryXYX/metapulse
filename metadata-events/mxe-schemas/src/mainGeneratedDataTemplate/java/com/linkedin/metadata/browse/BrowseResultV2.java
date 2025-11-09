
package com.linkedin.metadata.browse;

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
 * The model for the result of a browseV2 query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultV2.pdl.")
public class BrowseResultV2
    extends RecordTemplate
{

    private final static BrowseResultV2 .Fields _fields = new BrowseResultV2 .Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.browse/**The model for the result of a browseV2 query*/record BrowseResultV2{/**A list of groups and total number of entities inside those groups under the queried path*/groups:array[/**The model for the result of a browse query*/record BrowseResultGroupV2{/**Name of the group*/name:string/**Urn of the group if this is an entity*/urn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of entities that can be reached from this path*/count:long/**Whether or not this group has any sub-groups underneath it*/hasSubGroups:boolean}]=[]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for browse result metadata*/record BrowseResultMetadata{/**Path that is being browsed*/path:string/**Total number of entities we can reach from path*/totalNumEntities:long}/**Offset of the first entity in the result*/from:int/**Size of each page in the result*/pageSize:int/**The total number of groups directly under queried path*/numGroups:int}", SchemaFormatType.PDL));
    private BrowseResultGroupV2Array _groupsField = null;
    private BrowseResultMetadata _metadataField = null;
    private Integer _fromField = null;
    private Integer _pageSizeField = null;
    private Integer _numGroupsField = null;
    private BrowseResultV2 .ChangeListener __changeListener = new BrowseResultV2 .ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static BrowseResultGroupV2Array DEFAULT_Groups;
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_From = SCHEMA.getField("from");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumGroups = SCHEMA.getField("numGroups");

    static {
        DEFAULT_Groups = ((FIELD_Groups.getDefault() == null)?null:new BrowseResultGroupV2Array(DataTemplateUtil.castOrThrow(FIELD_Groups.getDefault(), DataList.class)));
    }

    public BrowseResultV2() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public BrowseResultV2(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowseResultV2 .Fields fields() {
        return _fields;
    }

    public static BrowseResultV2 .ProjectionMask createMask() {
        return new BrowseResultV2 .ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for groups
     * 
     * @see BrowseResultV2.Fields#groups
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
     * @see BrowseResultV2.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see BrowseResultV2.Fields#groups
     */
    @Nullable
    public BrowseResultGroupV2Array getGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getGroups();
            case NULL:
                if (_groupsField!= null) {
                    return _groupsField;
                } else {
                    Object __rawValue = super._map.get("groups");
                    _groupsField = ((__rawValue == null)?null:new BrowseResultGroupV2Array(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see BrowseResultV2.Fields#groups
     */
    @Nonnull
    public BrowseResultGroupV2Array getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            if (__rawValue == null) {
                return DEFAULT_Groups;
            }
            _groupsField = ((__rawValue == null)?null:new BrowseResultGroupV2Array(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see BrowseResultV2.Fields#groups
     */
    public BrowseResultV2 setGroups(
        @Nullable
        BrowseResultGroupV2Array value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groups of com.linkedin.metadata.browse.BrowseResultV2");
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
     * @see BrowseResultV2.Fields#groups
     */
    public BrowseResultV2 setGroups(
        @Nonnull
        BrowseResultGroupV2Array value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.metadata.browse.BrowseResultV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see BrowseResultV2.Fields#metadata
     */
    public boolean hasMetadata() {
        if (_metadataField!= null) {
            return true;
        }
        return super._map.containsKey("metadata");
    }

    /**
     * Remover for metadata
     * 
     * @see BrowseResultV2.Fields#metadata
     */
    public void removeMetadata() {
        super._map.remove("metadata");
    }

    /**
     * Getter for metadata
     * 
     * @see BrowseResultV2.Fields#metadata
     */
    @Nullable
    public BrowseResultMetadata getMetadata(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetadata();
            case DEFAULT:
            case NULL:
                if (_metadataField!= null) {
                    return _metadataField;
                } else {
                    Object __rawValue = super._map.get("metadata");
                    _metadataField = ((__rawValue == null)?null:new BrowseResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _metadataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultV2.Fields#metadata
     */
    @Nonnull
    public BrowseResultMetadata getMetadata() {
        if (_metadataField!= null) {
            return _metadataField;
        } else {
            Object __rawValue = super._map.get("metadata");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metadata");
            }
            _metadataField = ((__rawValue == null)?null:new BrowseResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metadataField;
        }
    }

    /**
     * Setter for metadata
     * 
     * @see BrowseResultV2.Fields#metadata
     */
    public BrowseResultV2 setMetadata(
        @Nullable
        BrowseResultMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadata of com.linkedin.metadata.browse.BrowseResultV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultV2.Fields#metadata
     */
    public BrowseResultV2 setMetadata(
        @Nonnull
        BrowseResultMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadata of com.linkedin.metadata.browse.BrowseResultV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
            _metadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for from
     * 
     * @see BrowseResultV2.Fields#from
     */
    public boolean hasFrom() {
        if (_fromField!= null) {
            return true;
        }
        return super._map.containsKey("from");
    }

    /**
     * Remover for from
     * 
     * @see BrowseResultV2.Fields#from
     */
    public void removeFrom() {
        super._map.remove("from");
    }

    /**
     * Getter for from
     * 
     * @see BrowseResultV2.Fields#from
     */
    @Nullable
    public Integer getFrom(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFrom();
            case DEFAULT:
            case NULL:
                if (_fromField!= null) {
                    return _fromField;
                } else {
                    Object __rawValue = super._map.get("from");
                    _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _fromField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for from
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultV2.Fields#from
     */
    @Nonnull
    public Integer getFrom() {
        if (_fromField!= null) {
            return _fromField;
        } else {
            Object __rawValue = super._map.get("from");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("from");
            }
            _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _fromField;
        }
    }

    /**
     * Setter for from
     * 
     * @see BrowseResultV2.Fields#from
     */
    public BrowseResultV2 setFrom(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFrom(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field from of com.linkedin.metadata.browse.BrowseResultV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFrom();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultV2.Fields#from
     */
    public BrowseResultV2 setFrom(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field from of com.linkedin.metadata.browse.BrowseResultV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
            _fromField = value;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @see BrowseResultV2.Fields#from
     */
    public BrowseResultV2 setFrom(int value) {
        CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
        _fromField = value;
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see BrowseResultV2.Fields#pageSize
     */
    public boolean hasPageSize() {
        if (_pageSizeField!= null) {
            return true;
        }
        return super._map.containsKey("pageSize");
    }

    /**
     * Remover for pageSize
     * 
     * @see BrowseResultV2.Fields#pageSize
     */
    public void removePageSize() {
        super._map.remove("pageSize");
    }

    /**
     * Getter for pageSize
     * 
     * @see BrowseResultV2.Fields#pageSize
     */
    @Nullable
    public Integer getPageSize(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPageSize();
            case DEFAULT:
            case NULL:
                if (_pageSizeField!= null) {
                    return _pageSizeField;
                } else {
                    Object __rawValue = super._map.get("pageSize");
                    _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _pageSizeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for pageSize
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultV2.Fields#pageSize
     */
    @Nonnull
    public Integer getPageSize() {
        if (_pageSizeField!= null) {
            return _pageSizeField;
        } else {
            Object __rawValue = super._map.get("pageSize");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("pageSize");
            }
            _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _pageSizeField;
        }
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResultV2.Fields#pageSize
     */
    public BrowseResultV2 setPageSize(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPageSize(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pageSize of com.linkedin.metadata.browse.BrowseResultV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePageSize();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultV2.Fields#pageSize
     */
    public BrowseResultV2 setPageSize(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pageSize of com.linkedin.metadata.browse.BrowseResultV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
            _pageSizeField = value;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see BrowseResultV2.Fields#pageSize
     */
    public BrowseResultV2 setPageSize(int value) {
        CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
        _pageSizeField = value;
        return this;
    }

    /**
     * Existence checker for numGroups
     * 
     * @see BrowseResultV2.Fields#numGroups
     */
    public boolean hasNumGroups() {
        if (_numGroupsField!= null) {
            return true;
        }
        return super._map.containsKey("numGroups");
    }

    /**
     * Remover for numGroups
     * 
     * @see BrowseResultV2.Fields#numGroups
     */
    public void removeNumGroups() {
        super._map.remove("numGroups");
    }

    /**
     * Getter for numGroups
     * 
     * @see BrowseResultV2.Fields#numGroups
     */
    @Nullable
    public Integer getNumGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNumGroups();
            case DEFAULT:
            case NULL:
                if (_numGroupsField!= null) {
                    return _numGroupsField;
                } else {
                    Object __rawValue = super._map.get("numGroups");
                    _numGroupsField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _numGroupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowseResultV2.Fields#numGroups
     */
    @Nonnull
    public Integer getNumGroups() {
        if (_numGroupsField!= null) {
            return _numGroupsField;
        } else {
            Object __rawValue = super._map.get("numGroups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("numGroups");
            }
            _numGroupsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _numGroupsField;
        }
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResultV2.Fields#numGroups
     */
    public BrowseResultV2 setNumGroups(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numGroups of com.linkedin.metadata.browse.BrowseResultV2");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
                    _numGroupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowseResultV2.Fields#numGroups
     */
    public BrowseResultV2 setNumGroups(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numGroups of com.linkedin.metadata.browse.BrowseResultV2 to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
            _numGroupsField = value;
        }
        return this;
    }

    /**
     * Setter for numGroups
     * 
     * @see BrowseResultV2.Fields#numGroups
     */
    public BrowseResultV2 setNumGroups(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numGroups", DataTemplateUtil.coerceIntInput(value));
        _numGroupsField = value;
        return this;
    }

    @Override
    public BrowseResultV2 clone()
        throws CloneNotSupportedException
    {
        BrowseResultV2 __clone = ((BrowseResultV2) super.clone());
        __clone.__changeListener = new BrowseResultV2 .ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowseResultV2 copy()
        throws CloneNotSupportedException
    {
        BrowseResultV2 __copy = ((BrowseResultV2) super.copy());
        __copy._numGroupsField = null;
        __copy._metadataField = null;
        __copy._groupsField = null;
        __copy._pageSizeField = null;
        __copy._fromField = null;
        __copy.__changeListener = new BrowseResultV2 .ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowseResultV2 __objectRef;

        private ChangeListener(BrowseResultV2 reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "numGroups":
                    __objectRef._numGroupsField = null;
                    break;
                case "metadata":
                    __objectRef._metadataField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "pageSize":
                    __objectRef._pageSizeField = null;
                    break;
                case "from":
                    __objectRef._fromField = null;
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
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultGroupV2Array.Fields groups() {
            return new com.linkedin.metadata.browse.BrowseResultGroupV2Array.Fields(getPathComponents(), "groups");
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
         * Metadata specific to the browse result of the queried path
         * 
         */
        public com.linkedin.metadata.browse.BrowseResultMetadata.Fields metadata() {
            return new com.linkedin.metadata.browse.BrowseResultMetadata.Fields(getPathComponents(), "metadata");
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec from() {
            return new PathSpec(getPathComponents(), "from");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec pageSize() {
            return new PathSpec(getPathComponents(), "pageSize");
        }

        /**
         * The total number of groups directly under queried path
         * 
         */
        public PathSpec numGroups() {
            return new PathSpec(getPathComponents(), "numGroups");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.browse.BrowseResultGroupV2Array.ProjectionMask _groupsMask;
        private com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask _metadataMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withGroups(Function<com.linkedin.metadata.browse.BrowseResultGroupV2Array.ProjectionMask, com.linkedin.metadata.browse.BrowseResultGroupV2Array.ProjectionMask> nestedMask) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupV2Array.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withGroups() {
            _groupsMask = null;
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of groups and total number of entities inside those groups under the queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withGroups(Function<com.linkedin.metadata.browse.BrowseResultGroupV2Array.ProjectionMask, com.linkedin.metadata.browse.BrowseResultGroupV2Array.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?BrowseResultGroupV2Array.createMask():_groupsMask));
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
        public BrowseResultV2 .ProjectionMask withGroups(Integer start, Integer count) {
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
         * Metadata specific to the browse result of the queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withMetadata(Function<com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask, com.linkedin.metadata.browse.BrowseResultMetadata.ProjectionMask> nestedMask) {
            _metadataMask = nestedMask.apply(((_metadataMask == null)?BrowseResultMetadata.createMask():_metadataMask));
            getDataMap().put("metadata", _metadataMask.getDataMap());
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withMetadata() {
            _metadataMask = null;
            getDataMap().put("metadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public BrowseResultV2 .ProjectionMask withFrom() {
            getDataMap().put("from", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of each page in the result
         * 
         */
        public BrowseResultV2 .ProjectionMask withPageSize() {
            getDataMap().put("pageSize", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of groups directly under queried path
         * 
         */
        public BrowseResultV2 .ProjectionMask withNumGroups() {
            getDataMap().put("numGroups", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
