
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BrowsePath.pdl.")
public class BrowsePath
    extends RecordTemplate
{

    private final static BrowsePath.Fields _fields = new BrowsePath.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common,record BrowsePath{/**An array of strings comprising the path*/path:array[string]}", SchemaFormatType.PDL));
    private StringArray _pathField = null;
    private BrowsePath.ChangeListener __changeListener = new BrowsePath.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");

    public BrowsePath() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BrowsePath(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BrowsePath.Fields fields() {
        return _fields;
    }

    public static BrowsePath.ProjectionMask createMask() {
        return new BrowsePath.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for path
     * 
     * @see BrowsePath.Fields#path
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
     * @see BrowsePath.Fields#path
     */
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see BrowsePath.Fields#path
     */
    @Nullable
    public StringArray getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPath();
            case DEFAULT:
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see BrowsePath.Fields#path
     */
    @Nonnull
    public StringArray getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("path");
            }
            _pathField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see BrowsePath.Fields#path
     */
    public BrowsePath setPath(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.common.BrowsePath");
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
     * @see BrowsePath.Fields#path
     */
    public BrowsePath setPath(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.common.BrowsePath to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value.data());
            _pathField = value;
        }
        return this;
    }

    @Override
    public BrowsePath clone()
        throws CloneNotSupportedException
    {
        BrowsePath __clone = ((BrowsePath) super.clone());
        __clone.__changeListener = new BrowsePath.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BrowsePath copy()
        throws CloneNotSupportedException
    {
        BrowsePath __copy = ((BrowsePath) super.copy());
        __copy._pathField = null;
        __copy.__changeListener = new BrowsePath.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BrowsePath __objectRef;

        private ChangeListener(BrowsePath reference) {
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
         * An array of strings comprising the path
         * 
         */
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * An array of strings comprising the path
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


        ProjectionMask() {
            super(2);
        }

        /**
         * An array of strings comprising the path
         * 
         */
        public BrowsePath.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An array of strings comprising the path
         * 
         */
        public BrowsePath.ProjectionMask withPath(Integer start, Integer count) {
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
