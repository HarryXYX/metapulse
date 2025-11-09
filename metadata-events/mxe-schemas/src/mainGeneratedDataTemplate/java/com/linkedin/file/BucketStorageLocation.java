
package com.linkedin.file;

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
 * Information where a file is stored
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/file/BucketStorageLocation.pdl.")
public class BucketStorageLocation
    extends RecordTemplate
{

    private final static BucketStorageLocation.Fields _fields = new BucketStorageLocation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.file/**Information where a file is stored*/record BucketStorageLocation{/**The storage bucket this file is stored in*/@Searchable.fieldType=\"KEYWORD\"storageBucket:string/**The key for where this file is stored inside of the given bucket*/@Searchable.fieldType=\"KEYWORD\"storageKey:string}", SchemaFormatType.PDL));
    private String _storageBucketField = null;
    private String _storageKeyField = null;
    private BucketStorageLocation.ChangeListener __changeListener = new BucketStorageLocation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_StorageBucket = SCHEMA.getField("storageBucket");
    private final static RecordDataSchema.Field FIELD_StorageKey = SCHEMA.getField("storageKey");

    public BucketStorageLocation() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BucketStorageLocation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BucketStorageLocation.Fields fields() {
        return _fields;
    }

    public static BucketStorageLocation.ProjectionMask createMask() {
        return new BucketStorageLocation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for storageBucket
     * 
     * @see BucketStorageLocation.Fields#storageBucket
     */
    public boolean hasStorageBucket() {
        if (_storageBucketField!= null) {
            return true;
        }
        return super._map.containsKey("storageBucket");
    }

    /**
     * Remover for storageBucket
     * 
     * @see BucketStorageLocation.Fields#storageBucket
     */
    public void removeStorageBucket() {
        super._map.remove("storageBucket");
    }

    /**
     * Getter for storageBucket
     * 
     * @see BucketStorageLocation.Fields#storageBucket
     */
    @Nullable
    public String getStorageBucket(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStorageBucket();
            case DEFAULT:
            case NULL:
                if (_storageBucketField!= null) {
                    return _storageBucketField;
                } else {
                    Object __rawValue = super._map.get("storageBucket");
                    _storageBucketField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _storageBucketField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for storageBucket
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BucketStorageLocation.Fields#storageBucket
     */
    @Nonnull
    public String getStorageBucket() {
        if (_storageBucketField!= null) {
            return _storageBucketField;
        } else {
            Object __rawValue = super._map.get("storageBucket");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("storageBucket");
            }
            _storageBucketField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _storageBucketField;
        }
    }

    /**
     * Setter for storageBucket
     * 
     * @see BucketStorageLocation.Fields#storageBucket
     */
    public BucketStorageLocation setStorageBucket(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStorageBucket(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field storageBucket of com.linkedin.file.BucketStorageLocation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "storageBucket", value);
                    _storageBucketField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStorageBucket();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "storageBucket", value);
                    _storageBucketField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "storageBucket", value);
                    _storageBucketField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for storageBucket
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BucketStorageLocation.Fields#storageBucket
     */
    public BucketStorageLocation setStorageBucket(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field storageBucket of com.linkedin.file.BucketStorageLocation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "storageBucket", value);
            _storageBucketField = value;
        }
        return this;
    }

    /**
     * Existence checker for storageKey
     * 
     * @see BucketStorageLocation.Fields#storageKey
     */
    public boolean hasStorageKey() {
        if (_storageKeyField!= null) {
            return true;
        }
        return super._map.containsKey("storageKey");
    }

    /**
     * Remover for storageKey
     * 
     * @see BucketStorageLocation.Fields#storageKey
     */
    public void removeStorageKey() {
        super._map.remove("storageKey");
    }

    /**
     * Getter for storageKey
     * 
     * @see BucketStorageLocation.Fields#storageKey
     */
    @Nullable
    public String getStorageKey(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStorageKey();
            case DEFAULT:
            case NULL:
                if (_storageKeyField!= null) {
                    return _storageKeyField;
                } else {
                    Object __rawValue = super._map.get("storageKey");
                    _storageKeyField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _storageKeyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for storageKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BucketStorageLocation.Fields#storageKey
     */
    @Nonnull
    public String getStorageKey() {
        if (_storageKeyField!= null) {
            return _storageKeyField;
        } else {
            Object __rawValue = super._map.get("storageKey");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("storageKey");
            }
            _storageKeyField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _storageKeyField;
        }
    }

    /**
     * Setter for storageKey
     * 
     * @see BucketStorageLocation.Fields#storageKey
     */
    public BucketStorageLocation setStorageKey(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStorageKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field storageKey of com.linkedin.file.BucketStorageLocation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "storageKey", value);
                    _storageKeyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStorageKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "storageKey", value);
                    _storageKeyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "storageKey", value);
                    _storageKeyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for storageKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BucketStorageLocation.Fields#storageKey
     */
    public BucketStorageLocation setStorageKey(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field storageKey of com.linkedin.file.BucketStorageLocation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "storageKey", value);
            _storageKeyField = value;
        }
        return this;
    }

    @Override
    public BucketStorageLocation clone()
        throws CloneNotSupportedException
    {
        BucketStorageLocation __clone = ((BucketStorageLocation) super.clone());
        __clone.__changeListener = new BucketStorageLocation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BucketStorageLocation copy()
        throws CloneNotSupportedException
    {
        BucketStorageLocation __copy = ((BucketStorageLocation) super.copy());
        __copy._storageBucketField = null;
        __copy._storageKeyField = null;
        __copy.__changeListener = new BucketStorageLocation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BucketStorageLocation __objectRef;

        private ChangeListener(BucketStorageLocation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "storageBucket":
                    __objectRef._storageBucketField = null;
                    break;
                case "storageKey":
                    __objectRef._storageKeyField = null;
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
         * The storage bucket this file is stored in
         * 
         */
        public PathSpec storageBucket() {
            return new PathSpec(getPathComponents(), "storageBucket");
        }

        /**
         * The key for where this file is stored inside of the given bucket
         * 
         */
        public PathSpec storageKey() {
            return new PathSpec(getPathComponents(), "storageKey");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The storage bucket this file is stored in
         * 
         */
        public BucketStorageLocation.ProjectionMask withStorageBucket() {
            getDataMap().put("storageBucket", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The key for where this file is stored inside of the given bucket
         * 
         */
        public BucketStorageLocation.ProjectionMask withStorageKey() {
            getDataMap().put("storageKey", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
