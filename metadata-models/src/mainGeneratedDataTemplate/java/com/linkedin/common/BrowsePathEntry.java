
package com.linkedin.common;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Represents a single level in an entity's browsePathV2
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/BrowsePathEntry.pdl.")
public class BrowsePathEntry
    extends RecordTemplate
{

    private final static BrowsePathEntry.Fields _fields = new BrowsePathEntry.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}", SchemaFormatType.PDL));
    private String _idField = null;
    private com.linkedin.common.urn.Urn _urnField = null;
    private BrowsePathEntry.ChangeListener __changeListener = new BrowsePathEntry.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public BrowsePathEntry() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BrowsePathEntry(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowsePathEntry.Fields fields() {
        return _fields;
    }

    public static BrowsePathEntry.ProjectionMask createMask() {
        return new BrowsePathEntry.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see BrowsePathEntry.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see BrowsePathEntry.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see BrowsePathEntry.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BrowsePathEntry.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see BrowsePathEntry.Fields#id
     */
    public BrowsePathEntry setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.common.BrowsePathEntry");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowsePathEntry.Fields#id
     */
    public BrowsePathEntry setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.common.BrowsePathEntry to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see BrowsePathEntry.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see BrowsePathEntry.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see BrowsePathEntry.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return getUrn();
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BrowsePathEntry.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see BrowsePathEntry.Fields#urn
     */
    public BrowsePathEntry setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BrowsePathEntry.Fields#urn
     */
    public BrowsePathEntry setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.common.BrowsePathEntry to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    @Override
    public BrowsePathEntry clone()
        throws CloneNotSupportedException
    {
        BrowsePathEntry __clone = ((BrowsePathEntry) super.clone());
        __clone.__changeListener = new BrowsePathEntry.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowsePathEntry copy()
        throws CloneNotSupportedException
    {
        BrowsePathEntry __copy = ((BrowsePathEntry) super.copy());
        __copy._urnField = null;
        __copy._idField = null;
        __copy.__changeListener = new BrowsePathEntry.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowsePathEntry __objectRef;

        private ChangeListener(BrowsePathEntry reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
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
         * The ID of the browse path entry. This is what gets stored in the index.
         * If there's an urn associated with this entry, id and urn will be the same
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * Optional urn pointing to some entity in DataHub
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The ID of the browse path entry. This is what gets stored in the index.
         * If there's an urn associated with this entry, id and urn will be the same
         * 
         */
        public BrowsePathEntry.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional urn pointing to some entity in DataHub
         * 
         */
        public BrowsePathEntry.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
