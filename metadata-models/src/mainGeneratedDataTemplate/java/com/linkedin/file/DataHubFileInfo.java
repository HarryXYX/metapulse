
package com.linkedin.file;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * Information about a DataHub file - a file stored in S3 for use within DataHub platform features like documentation, home pages, and announcements.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/file/DataHubFileInfo.pdl.")
public class DataHubFileInfo
    extends RecordTemplate
{

    private final static DataHubFileInfo.Fields _fields = new DataHubFileInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.file/**Information about a DataHub file - a file stored in S3 for use within DataHub platform features like documentation, home pages, and announcements.*/@Aspect.name=\"dataHubFileInfo\"record DataHubFileInfo{/**Info about where a file is stored*/bucketStorageLocation:/**Information where a file is stored*/record BucketStorageLocation{/**The storage bucket this file is stored in*/@Searchable.fieldType=\"KEYWORD\"storageBucket:string/**The key for where this file is stored inside of the given bucket*/@Searchable.fieldType=\"KEYWORD\"storageKey:string}/**The original filename as uploaded by the user*/@Searchable.fieldType=\"TEXT_PARTIAL\"originalFileName:string/**MIME type of the file (e.g., image/png, application/pdf)*/@Searchable.fieldType=\"KEYWORD\"mimeType:string/**Size of the file in bytes*/sizeInBytes:long/**The scenario/context in which this file was uploaded*/@Searchable.fieldType=\"KEYWORD\"scenario:enum FileUploadScenario{/**File uploaded for entity documentation*/ASSET_DOCUMENTATION}/**Optional URN of the entity this file is associated with (e.g., the dataset whose docs contain this file)*/@Relationship={\"entityTypes\":[\"dataset\",\"chart\",\"container\",\"dashboard\",\"dataFlow\",\"dataJob\",\"glossaryTerm\",\"glossaryNode\",\"mlModel\",\"mlFeature\",\"notebook\",\"mlFeatureTable\",\"mlPrimaryKey\",\"mlModelGroup\",\"domain\",\"dataProduct\",\"businessAttribute\"],\"name\":\"ReferencedBy\"}@Searchable.fieldType=\"URN\"referencedByAsset:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The dataset schema field urn this file is referenced by*/@Relationship={\"entityTypes\":[\"schemaField\"],\"name\":\"ReferencedBy\"}@Searchable.fieldType=\"URN\"schemaField:optional com.linkedin.common.Urn/**Timestamp when this file was created and by whom*/@Searchable={\"/actor\":{\"fieldName\":\"createdBy\",\"fieldType\":\"URN\"},\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**SHA-256 hash of file contents*/@Searchable.fieldType=\"KEYWORD\"contentHash:optional string}", SchemaFormatType.PDL));
    private BucketStorageLocation _bucketStorageLocationField = null;
    private String _originalFileNameField = null;
    private String _mimeTypeField = null;
    private Long _sizeInBytesField = null;
    private FileUploadScenario _scenarioField = null;
    private com.linkedin.common.urn.Urn _referencedByAssetField = null;
    private com.linkedin.common.urn.Urn _schemaFieldField = null;
    private AuditStamp _createdField = null;
    private String _contentHashField = null;
    private DataHubFileInfo.ChangeListener __changeListener = new DataHubFileInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_BucketStorageLocation = SCHEMA.getField("bucketStorageLocation");
    private final static RecordDataSchema.Field FIELD_OriginalFileName = SCHEMA.getField("originalFileName");
    private final static RecordDataSchema.Field FIELD_MimeType = SCHEMA.getField("mimeType");
    private final static RecordDataSchema.Field FIELD_SizeInBytes = SCHEMA.getField("sizeInBytes");
    private final static RecordDataSchema.Field FIELD_Scenario = SCHEMA.getField("scenario");
    private final static RecordDataSchema.Field FIELD_ReferencedByAsset = SCHEMA.getField("referencedByAsset");
    private final static RecordDataSchema.Field FIELD_SchemaField = SCHEMA.getField("schemaField");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_ContentHash = SCHEMA.getField("contentHash");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataHubFileInfo() {
        super(new DataMap(12, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataHubFileInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubFileInfo.Fields fields() {
        return _fields;
    }

    public static DataHubFileInfo.ProjectionMask createMask() {
        return new DataHubFileInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for bucketStorageLocation
     * 
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    public boolean hasBucketStorageLocation() {
        if (_bucketStorageLocationField!= null) {
            return true;
        }
        return super._map.containsKey("bucketStorageLocation");
    }

    /**
     * Remover for bucketStorageLocation
     * 
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    public void removeBucketStorageLocation() {
        super._map.remove("bucketStorageLocation");
    }

    /**
     * Getter for bucketStorageLocation
     * 
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    @Nullable
    public BucketStorageLocation getBucketStorageLocation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBucketStorageLocation();
            case DEFAULT:
            case NULL:
                if (_bucketStorageLocationField!= null) {
                    return _bucketStorageLocationField;
                } else {
                    Object __rawValue = super._map.get("bucketStorageLocation");
                    _bucketStorageLocationField = ((__rawValue == null)?null:new BucketStorageLocation(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _bucketStorageLocationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for bucketStorageLocation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    @Nonnull
    public BucketStorageLocation getBucketStorageLocation() {
        if (_bucketStorageLocationField!= null) {
            return _bucketStorageLocationField;
        } else {
            Object __rawValue = super._map.get("bucketStorageLocation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("bucketStorageLocation");
            }
            _bucketStorageLocationField = ((__rawValue == null)?null:new BucketStorageLocation(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _bucketStorageLocationField;
        }
    }

    /**
     * Setter for bucketStorageLocation
     * 
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    public DataHubFileInfo setBucketStorageLocation(
        @Nullable
        BucketStorageLocation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBucketStorageLocation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field bucketStorageLocation of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucketStorageLocation", value.data());
                    _bucketStorageLocationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBucketStorageLocation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucketStorageLocation", value.data());
                    _bucketStorageLocationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "bucketStorageLocation", value.data());
                    _bucketStorageLocationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for bucketStorageLocation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#bucketStorageLocation
     */
    public DataHubFileInfo setBucketStorageLocation(
        @Nonnull
        BucketStorageLocation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field bucketStorageLocation of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "bucketStorageLocation", value.data());
            _bucketStorageLocationField = value;
        }
        return this;
    }

    /**
     * Existence checker for originalFileName
     * 
     * @see DataHubFileInfo.Fields#originalFileName
     */
    public boolean hasOriginalFileName() {
        if (_originalFileNameField!= null) {
            return true;
        }
        return super._map.containsKey("originalFileName");
    }

    /**
     * Remover for originalFileName
     * 
     * @see DataHubFileInfo.Fields#originalFileName
     */
    public void removeOriginalFileName() {
        super._map.remove("originalFileName");
    }

    /**
     * Getter for originalFileName
     * 
     * @see DataHubFileInfo.Fields#originalFileName
     */
    @Nullable
    public String getOriginalFileName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOriginalFileName();
            case DEFAULT:
            case NULL:
                if (_originalFileNameField!= null) {
                    return _originalFileNameField;
                } else {
                    Object __rawValue = super._map.get("originalFileName");
                    _originalFileNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _originalFileNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for originalFileName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#originalFileName
     */
    @Nonnull
    public String getOriginalFileName() {
        if (_originalFileNameField!= null) {
            return _originalFileNameField;
        } else {
            Object __rawValue = super._map.get("originalFileName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("originalFileName");
            }
            _originalFileNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _originalFileNameField;
        }
    }

    /**
     * Setter for originalFileName
     * 
     * @see DataHubFileInfo.Fields#originalFileName
     */
    public DataHubFileInfo setOriginalFileName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOriginalFileName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field originalFileName of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "originalFileName", value);
                    _originalFileNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOriginalFileName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "originalFileName", value);
                    _originalFileNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "originalFileName", value);
                    _originalFileNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for originalFileName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#originalFileName
     */
    public DataHubFileInfo setOriginalFileName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field originalFileName of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "originalFileName", value);
            _originalFileNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for mimeType
     * 
     * @see DataHubFileInfo.Fields#mimeType
     */
    public boolean hasMimeType() {
        if (_mimeTypeField!= null) {
            return true;
        }
        return super._map.containsKey("mimeType");
    }

    /**
     * Remover for mimeType
     * 
     * @see DataHubFileInfo.Fields#mimeType
     */
    public void removeMimeType() {
        super._map.remove("mimeType");
    }

    /**
     * Getter for mimeType
     * 
     * @see DataHubFileInfo.Fields#mimeType
     */
    @Nullable
    public String getMimeType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMimeType();
            case DEFAULT:
            case NULL:
                if (_mimeTypeField!= null) {
                    return _mimeTypeField;
                } else {
                    Object __rawValue = super._map.get("mimeType");
                    _mimeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _mimeTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for mimeType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#mimeType
     */
    @Nonnull
    public String getMimeType() {
        if (_mimeTypeField!= null) {
            return _mimeTypeField;
        } else {
            Object __rawValue = super._map.get("mimeType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("mimeType");
            }
            _mimeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _mimeTypeField;
        }
    }

    /**
     * Setter for mimeType
     * 
     * @see DataHubFileInfo.Fields#mimeType
     */
    public DataHubFileInfo setMimeType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMimeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field mimeType of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mimeType", value);
                    _mimeTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMimeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mimeType", value);
                    _mimeTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mimeType", value);
                    _mimeTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mimeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#mimeType
     */
    public DataHubFileInfo setMimeType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mimeType of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mimeType", value);
            _mimeTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for sizeInBytes
     * 
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    public boolean hasSizeInBytes() {
        if (_sizeInBytesField!= null) {
            return true;
        }
        return super._map.containsKey("sizeInBytes");
    }

    /**
     * Remover for sizeInBytes
     * 
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    public void removeSizeInBytes() {
        super._map.remove("sizeInBytes");
    }

    /**
     * Getter for sizeInBytes
     * 
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    @Nullable
    public Long getSizeInBytes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSizeInBytes();
            case DEFAULT:
            case NULL:
                if (_sizeInBytesField!= null) {
                    return _sizeInBytesField;
                } else {
                    Object __rawValue = super._map.get("sizeInBytes");
                    _sizeInBytesField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _sizeInBytesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sizeInBytes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    @Nonnull
    public Long getSizeInBytes() {
        if (_sizeInBytesField!= null) {
            return _sizeInBytesField;
        } else {
            Object __rawValue = super._map.get("sizeInBytes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sizeInBytes");
            }
            _sizeInBytesField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _sizeInBytesField;
        }
    }

    /**
     * Setter for sizeInBytes
     * 
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    public DataHubFileInfo setSizeInBytes(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSizeInBytes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sizeInBytes of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInBytes", DataTemplateUtil.coerceLongInput(value));
                    _sizeInBytesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSizeInBytes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInBytes", DataTemplateUtil.coerceLongInput(value));
                    _sizeInBytesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInBytes", DataTemplateUtil.coerceLongInput(value));
                    _sizeInBytesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sizeInBytes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    public DataHubFileInfo setSizeInBytes(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sizeInBytes of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sizeInBytes", DataTemplateUtil.coerceLongInput(value));
            _sizeInBytesField = value;
        }
        return this;
    }

    /**
     * Setter for sizeInBytes
     * 
     * @see DataHubFileInfo.Fields#sizeInBytes
     */
    public DataHubFileInfo setSizeInBytes(long value) {
        CheckedUtil.putWithoutChecking(super._map, "sizeInBytes", DataTemplateUtil.coerceLongInput(value));
        _sizeInBytesField = value;
        return this;
    }

    /**
     * Existence checker for scenario
     * 
     * @see DataHubFileInfo.Fields#scenario
     */
    public boolean hasScenario() {
        if (_scenarioField!= null) {
            return true;
        }
        return super._map.containsKey("scenario");
    }

    /**
     * Remover for scenario
     * 
     * @see DataHubFileInfo.Fields#scenario
     */
    public void removeScenario() {
        super._map.remove("scenario");
    }

    /**
     * Getter for scenario
     * 
     * @see DataHubFileInfo.Fields#scenario
     */
    @Nullable
    public FileUploadScenario getScenario(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScenario();
            case DEFAULT:
            case NULL:
                if (_scenarioField!= null) {
                    return _scenarioField;
                } else {
                    Object __rawValue = super._map.get("scenario");
                    _scenarioField = DataTemplateUtil.coerceEnumOutput(__rawValue, FileUploadScenario.class, FileUploadScenario.$UNKNOWN);
                    return _scenarioField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for scenario
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#scenario
     */
    @Nonnull
    public FileUploadScenario getScenario() {
        if (_scenarioField!= null) {
            return _scenarioField;
        } else {
            Object __rawValue = super._map.get("scenario");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("scenario");
            }
            _scenarioField = DataTemplateUtil.coerceEnumOutput(__rawValue, FileUploadScenario.class, FileUploadScenario.$UNKNOWN);
            return _scenarioField;
        }
    }

    /**
     * Setter for scenario
     * 
     * @see DataHubFileInfo.Fields#scenario
     */
    public DataHubFileInfo setScenario(
        @Nullable
        FileUploadScenario value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScenario(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field scenario of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScenario();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scenario
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#scenario
     */
    public DataHubFileInfo setScenario(
        @Nonnull
        FileUploadScenario value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scenario of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
            _scenarioField = value;
        }
        return this;
    }

    /**
     * Existence checker for referencedByAsset
     * 
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    public boolean hasReferencedByAsset() {
        if (_referencedByAssetField!= null) {
            return true;
        }
        return super._map.containsKey("referencedByAsset");
    }

    /**
     * Remover for referencedByAsset
     * 
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    public void removeReferencedByAsset() {
        super._map.remove("referencedByAsset");
    }

    /**
     * Getter for referencedByAsset
     * 
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    @Nullable
    public com.linkedin.common.urn.Urn getReferencedByAsset(GetMode mode) {
        return getReferencedByAsset();
    }

    /**
     * Getter for referencedByAsset
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    @Nullable
    public com.linkedin.common.urn.Urn getReferencedByAsset() {
        if (_referencedByAssetField!= null) {
            return _referencedByAssetField;
        } else {
            Object __rawValue = super._map.get("referencedByAsset");
            _referencedByAssetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _referencedByAssetField;
        }
    }

    /**
     * Setter for referencedByAsset
     * 
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    public DataHubFileInfo setReferencedByAsset(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setReferencedByAsset(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeReferencedByAsset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "referencedByAsset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _referencedByAssetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "referencedByAsset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _referencedByAssetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for referencedByAsset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#referencedByAsset
     */
    public DataHubFileInfo setReferencedByAsset(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field referencedByAsset of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "referencedByAsset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _referencedByAssetField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaField
     * 
     * @see DataHubFileInfo.Fields#schemaField
     */
    public boolean hasSchemaField() {
        if (_schemaFieldField!= null) {
            return true;
        }
        return super._map.containsKey("schemaField");
    }

    /**
     * Remover for schemaField
     * 
     * @see DataHubFileInfo.Fields#schemaField
     */
    public void removeSchemaField() {
        super._map.remove("schemaField");
    }

    /**
     * Getter for schemaField
     * 
     * @see DataHubFileInfo.Fields#schemaField
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSchemaField(GetMode mode) {
        return getSchemaField();
    }

    /**
     * Getter for schemaField
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubFileInfo.Fields#schemaField
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSchemaField() {
        if (_schemaFieldField!= null) {
            return _schemaFieldField;
        } else {
            Object __rawValue = super._map.get("schemaField");
            _schemaFieldField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _schemaFieldField;
        }
    }

    /**
     * Setter for schemaField
     * 
     * @see DataHubFileInfo.Fields#schemaField
     */
    public DataHubFileInfo setSchemaField(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaField(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _schemaFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _schemaFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#schemaField
     */
    public DataHubFileInfo setSchemaField(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaField of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _schemaFieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataHubFileInfo.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see DataHubFileInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataHubFileInfo.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreated();
            case DEFAULT:
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubFileInfo.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("created");
            }
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see DataHubFileInfo.Fields#created
     */
    public DataHubFileInfo setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.file.DataHubFileInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#created
     */
    public DataHubFileInfo setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for contentHash
     * 
     * @see DataHubFileInfo.Fields#contentHash
     */
    public boolean hasContentHash() {
        if (_contentHashField!= null) {
            return true;
        }
        return super._map.containsKey("contentHash");
    }

    /**
     * Remover for contentHash
     * 
     * @see DataHubFileInfo.Fields#contentHash
     */
    public void removeContentHash() {
        super._map.remove("contentHash");
    }

    /**
     * Getter for contentHash
     * 
     * @see DataHubFileInfo.Fields#contentHash
     */
    @Nullable
    public String getContentHash(GetMode mode) {
        return getContentHash();
    }

    /**
     * Getter for contentHash
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubFileInfo.Fields#contentHash
     */
    @Nullable
    public String getContentHash() {
        if (_contentHashField!= null) {
            return _contentHashField;
        } else {
            Object __rawValue = super._map.get("contentHash");
            _contentHashField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contentHashField;
        }
    }

    /**
     * Setter for contentHash
     * 
     * @see DataHubFileInfo.Fields#contentHash
     */
    public DataHubFileInfo setContentHash(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContentHash(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContentHash();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentHash", value);
                    _contentHashField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contentHash", value);
                    _contentHashField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for contentHash
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubFileInfo.Fields#contentHash
     */
    public DataHubFileInfo setContentHash(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contentHash of com.linkedin.file.DataHubFileInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contentHash", value);
            _contentHashField = value;
        }
        return this;
    }

    @Override
    public DataHubFileInfo clone()
        throws CloneNotSupportedException
    {
        DataHubFileInfo __clone = ((DataHubFileInfo) super.clone());
        __clone.__changeListener = new DataHubFileInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubFileInfo copy()
        throws CloneNotSupportedException
    {
        DataHubFileInfo __copy = ((DataHubFileInfo) super.copy());
        __copy._originalFileNameField = null;
        __copy._sizeInBytesField = null;
        __copy._scenarioField = null;
        __copy._schemaFieldField = null;
        __copy._createdField = null;
        __copy._mimeTypeField = null;
        __copy._bucketStorageLocationField = null;
        __copy._referencedByAssetField = null;
        __copy._contentHashField = null;
        __copy.__changeListener = new DataHubFileInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubFileInfo __objectRef;

        private ChangeListener(DataHubFileInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "originalFileName":
                    __objectRef._originalFileNameField = null;
                    break;
                case "sizeInBytes":
                    __objectRef._sizeInBytesField = null;
                    break;
                case "scenario":
                    __objectRef._scenarioField = null;
                    break;
                case "schemaField":
                    __objectRef._schemaFieldField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "mimeType":
                    __objectRef._mimeTypeField = null;
                    break;
                case "bucketStorageLocation":
                    __objectRef._bucketStorageLocationField = null;
                    break;
                case "referencedByAsset":
                    __objectRef._referencedByAssetField = null;
                    break;
                case "contentHash":
                    __objectRef._contentHashField = null;
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
         * Info about where a file is stored
         * 
         */
        public com.linkedin.file.BucketStorageLocation.Fields bucketStorageLocation() {
            return new com.linkedin.file.BucketStorageLocation.Fields(getPathComponents(), "bucketStorageLocation");
        }

        /**
         * The original filename as uploaded by the user
         * 
         */
        public PathSpec originalFileName() {
            return new PathSpec(getPathComponents(), "originalFileName");
        }

        /**
         * MIME type of the file (e.g., image/png, application/pdf)
         * 
         */
        public PathSpec mimeType() {
            return new PathSpec(getPathComponents(), "mimeType");
        }

        /**
         * Size of the file in bytes
         * 
         */
        public PathSpec sizeInBytes() {
            return new PathSpec(getPathComponents(), "sizeInBytes");
        }

        /**
         * The scenario/context in which this file was uploaded
         * 
         */
        public PathSpec scenario() {
            return new PathSpec(getPathComponents(), "scenario");
        }

        /**
         * Optional URN of the entity this file is associated with (e.g., the dataset whose docs contain this file)
         * 
         */
        public PathSpec referencedByAsset() {
            return new PathSpec(getPathComponents(), "referencedByAsset");
        }

        /**
         * The dataset schema field urn this file is referenced by
         * 
         */
        public PathSpec schemaField() {
            return new PathSpec(getPathComponents(), "schemaField");
        }

        /**
         * Timestamp when this file was created and by whom
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * SHA-256 hash of file contents
         * 
         */
        public PathSpec contentHash() {
            return new PathSpec(getPathComponents(), "contentHash");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.file.BucketStorageLocation.ProjectionMask _bucketStorageLocationMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Info about where a file is stored
         * 
         */
        public DataHubFileInfo.ProjectionMask withBucketStorageLocation(Function<com.linkedin.file.BucketStorageLocation.ProjectionMask, com.linkedin.file.BucketStorageLocation.ProjectionMask> nestedMask) {
            _bucketStorageLocationMask = nestedMask.apply(((_bucketStorageLocationMask == null)?BucketStorageLocation.createMask():_bucketStorageLocationMask));
            getDataMap().put("bucketStorageLocation", _bucketStorageLocationMask.getDataMap());
            return this;
        }

        /**
         * Info about where a file is stored
         * 
         */
        public DataHubFileInfo.ProjectionMask withBucketStorageLocation() {
            _bucketStorageLocationMask = null;
            getDataMap().put("bucketStorageLocation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The original filename as uploaded by the user
         * 
         */
        public DataHubFileInfo.ProjectionMask withOriginalFileName() {
            getDataMap().put("originalFileName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * MIME type of the file (e.g., image/png, application/pdf)
         * 
         */
        public DataHubFileInfo.ProjectionMask withMimeType() {
            getDataMap().put("mimeType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of the file in bytes
         * 
         */
        public DataHubFileInfo.ProjectionMask withSizeInBytes() {
            getDataMap().put("sizeInBytes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The scenario/context in which this file was uploaded
         * 
         */
        public DataHubFileInfo.ProjectionMask withScenario() {
            getDataMap().put("scenario", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional URN of the entity this file is associated with (e.g., the dataset whose docs contain this file)
         * 
         */
        public DataHubFileInfo.ProjectionMask withReferencedByAsset() {
            getDataMap().put("referencedByAsset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The dataset schema field urn this file is referenced by
         * 
         */
        public DataHubFileInfo.ProjectionMask withSchemaField() {
            getDataMap().put("schemaField", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timestamp when this file was created and by whom
         * 
         */
        public DataHubFileInfo.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Timestamp when this file was created and by whom
         * 
         */
        public DataHubFileInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Timestamp when this file was created and by whom
         * 
         */
        public DataHubFileInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * SHA-256 hash of file contents
         * 
         */
        public DataHubFileInfo.ProjectionMask withContentHash() {
            getDataMap().put("contentHash", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
