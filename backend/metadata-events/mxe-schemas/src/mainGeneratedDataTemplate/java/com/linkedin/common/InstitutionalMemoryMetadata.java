
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
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
 * Metadata corresponding to a record of institutional memory.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InstitutionalMemoryMetadata.pdl.")
public class InstitutionalMemoryMetadata
    extends RecordTemplate
{

    private final static InstitutionalMemoryMetadata.Fields _fields = new InstitutionalMemoryMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}", SchemaFormatType.PDL));
    private com.linkedin.common.url.Url _urlField = null;
    private String _descriptionField = null;
    private AuditStamp _createStampField = null;
    private AuditStamp _updateStampField = null;
    private InstitutionalMemoryMetadataSettings _settingsField = null;
    private InstitutionalMemoryMetadata.ChangeListener __changeListener = new InstitutionalMemoryMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Url = SCHEMA.getField("url");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreateStamp = SCHEMA.getField("createStamp");
    private final static RecordDataSchema.Field FIELD_UpdateStamp = SCHEMA.getField("updateStamp");
    private final static RecordDataSchema.Field FIELD_Settings = SCHEMA.getField("settings");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public InstitutionalMemoryMetadata() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public InstitutionalMemoryMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static InstitutionalMemoryMetadata.Fields fields() {
        return _fields;
    }

    public static InstitutionalMemoryMetadata.ProjectionMask createMask() {
        return new InstitutionalMemoryMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public boolean hasUrl() {
        if (_urlField!= null) {
            return true;
        }
        return super._map.containsKey("url");
    }

    /**
     * Remover for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public void removeUrl() {
        super._map.remove("url");
    }

    /**
     * Getter for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    @Nullable
    public com.linkedin.common.url.Url getUrl(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrl();
            case DEFAULT:
            case NULL:
                if (_urlField!= null) {
                    return _urlField;
                } else {
                    Object __rawValue = super._map.get("url");
                    _urlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
                    return _urlField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for url
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    @Nonnull
    public com.linkedin.common.url.Url getUrl() {
        if (_urlField!= null) {
            return _urlField;
        } else {
            Object __rawValue = super._map.get("url");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("url");
            }
            _urlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _urlField;
        }
    }

    /**
     * Setter for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public InstitutionalMemoryMetadata setUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field url of com.linkedin.common.InstitutionalMemoryMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "url", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _urlField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "url", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _urlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "url", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _urlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public InstitutionalMemoryMetadata setUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field url of com.linkedin.common.InstitutionalMemoryMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "url", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _urlField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDescription();
            case DEFAULT:
            case NULL:
                if (_descriptionField!= null) {
                    return _descriptionField;
                } else {
                    Object __rawValue = super._map.get("description");
                    _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _descriptionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    @Nonnull
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("description");
            }
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public InstitutionalMemoryMetadata setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field description of com.linkedin.common.InstitutionalMemoryMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public InstitutionalMemoryMetadata setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.common.InstitutionalMemoryMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public boolean hasCreateStamp() {
        if (_createStampField!= null) {
            return true;
        }
        return super._map.containsKey("createStamp");
    }

    /**
     * Remover for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public void removeCreateStamp() {
        super._map.remove("createStamp");
    }

    /**
     * Getter for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    @Nullable
    public AuditStamp getCreateStamp(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreateStamp();
            case DEFAULT:
            case NULL:
                if (_createStampField!= null) {
                    return _createStampField;
                } else {
                    Object __rawValue = super._map.get("createStamp");
                    _createStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createStampField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for createStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    @Nonnull
    public AuditStamp getCreateStamp() {
        if (_createStampField!= null) {
            return _createStampField;
        } else {
            Object __rawValue = super._map.get("createStamp");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("createStamp");
            }
            _createStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createStampField;
        }
    }

    /**
     * Setter for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public InstitutionalMemoryMetadata setCreateStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreateStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field createStamp of com.linkedin.common.InstitutionalMemoryMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createStamp", value.data());
                    _createStampField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreateStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createStamp", value.data());
                    _createStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createStamp", value.data());
                    _createStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public InstitutionalMemoryMetadata setCreateStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createStamp of com.linkedin.common.InstitutionalMemoryMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createStamp", value.data());
            _createStampField = value;
        }
        return this;
    }

    /**
     * Existence checker for updateStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    public boolean hasUpdateStamp() {
        if (_updateStampField!= null) {
            return true;
        }
        return super._map.containsKey("updateStamp");
    }

    /**
     * Remover for updateStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    public void removeUpdateStamp() {
        super._map.remove("updateStamp");
    }

    /**
     * Getter for updateStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    @Nullable
    public AuditStamp getUpdateStamp(GetMode mode) {
        return getUpdateStamp();
    }

    /**
     * Getter for updateStamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    @Nullable
    public AuditStamp getUpdateStamp() {
        if (_updateStampField!= null) {
            return _updateStampField;
        } else {
            Object __rawValue = super._map.get("updateStamp");
            _updateStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _updateStampField;
        }
    }

    /**
     * Setter for updateStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    public InstitutionalMemoryMetadata setUpdateStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpdateStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpdateStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "updateStamp", value.data());
                    _updateStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "updateStamp", value.data());
                    _updateStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for updateStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#updateStamp
     */
    public InstitutionalMemoryMetadata setUpdateStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field updateStamp of com.linkedin.common.InstitutionalMemoryMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "updateStamp", value.data());
            _updateStampField = value;
        }
        return this;
    }

    /**
     * Existence checker for settings
     * 
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    public boolean hasSettings() {
        if (_settingsField!= null) {
            return true;
        }
        return super._map.containsKey("settings");
    }

    /**
     * Remover for settings
     * 
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    public void removeSettings() {
        super._map.remove("settings");
    }

    /**
     * Getter for settings
     * 
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    @Nullable
    public InstitutionalMemoryMetadataSettings getSettings(GetMode mode) {
        return getSettings();
    }

    /**
     * Getter for settings
     * 
     * @return
     *     Optional field. Always check for null.
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    @Nullable
    public InstitutionalMemoryMetadataSettings getSettings() {
        if (_settingsField!= null) {
            return _settingsField;
        } else {
            Object __rawValue = super._map.get("settings");
            _settingsField = ((__rawValue == null)?null:new InstitutionalMemoryMetadataSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _settingsField;
        }
    }

    /**
     * Setter for settings
     * 
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    public InstitutionalMemoryMetadata setSettings(
        @Nullable
        InstitutionalMemoryMetadataSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSettings(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSettings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "settings", value.data());
                    _settingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "settings", value.data());
                    _settingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for settings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#settings
     */
    public InstitutionalMemoryMetadata setSettings(
        @Nonnull
        InstitutionalMemoryMetadataSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field settings of com.linkedin.common.InstitutionalMemoryMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "settings", value.data());
            _settingsField = value;
        }
        return this;
    }

    @Override
    public InstitutionalMemoryMetadata clone()
        throws CloneNotSupportedException
    {
        InstitutionalMemoryMetadata __clone = ((InstitutionalMemoryMetadata) super.clone());
        __clone.__changeListener = new InstitutionalMemoryMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public InstitutionalMemoryMetadata copy()
        throws CloneNotSupportedException
    {
        InstitutionalMemoryMetadata __copy = ((InstitutionalMemoryMetadata) super.copy());
        __copy._settingsField = null;
        __copy._updateStampField = null;
        __copy._descriptionField = null;
        __copy._createStampField = null;
        __copy._urlField = null;
        __copy.__changeListener = new InstitutionalMemoryMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final InstitutionalMemoryMetadata __objectRef;

        private ChangeListener(InstitutionalMemoryMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "settings":
                    __objectRef._settingsField = null;
                    break;
                case "updateStamp":
                    __objectRef._updateStampField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "createStamp":
                    __objectRef._createStampField = null;
                    break;
                case "url":
                    __objectRef._urlField = null;
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
         * Link to an engineering design document or a wiki page.
         * 
         */
        public PathSpec url() {
            return new PathSpec(getPathComponents(), "url");
        }

        /**
         * Description of the link.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Audit stamp associated with creation of this record
         * 
         */
        public com.linkedin.common.AuditStamp.Fields createStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "createStamp");
        }

        /**
         * Audit stamp associated with updation of this record
         * 
         */
        public com.linkedin.common.AuditStamp.Fields updateStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "updateStamp");
        }

        /**
         * Settings for this record
         * 
         */
        public com.linkedin.common.InstitutionalMemoryMetadataSettings.Fields settings() {
            return new com.linkedin.common.InstitutionalMemoryMetadataSettings.Fields(getPathComponents(), "settings");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createStampMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _updateStampMask;
        private com.linkedin.common.InstitutionalMemoryMetadataSettings.ProjectionMask _settingsMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Link to an engineering design document or a wiki page.
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withUrl() {
            getDataMap().put("url", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the link.
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp associated with creation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withCreateStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createStampMask = nestedMask.apply(((_createStampMask == null)?AuditStamp.createMask():_createStampMask));
            getDataMap().put("createStamp", _createStampMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp associated with creation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withCreateStamp(MaskMap nestedMask) {
            getDataMap().put("createStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp associated with creation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withCreateStamp() {
            _createStampMask = null;
            getDataMap().put("createStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp associated with updation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withUpdateStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _updateStampMask = nestedMask.apply(((_updateStampMask == null)?AuditStamp.createMask():_updateStampMask));
            getDataMap().put("updateStamp", _updateStampMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp associated with updation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withUpdateStamp(MaskMap nestedMask) {
            getDataMap().put("updateStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp associated with updation of this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withUpdateStamp() {
            _updateStampMask = null;
            getDataMap().put("updateStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings for this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withSettings(Function<com.linkedin.common.InstitutionalMemoryMetadataSettings.ProjectionMask, com.linkedin.common.InstitutionalMemoryMetadataSettings.ProjectionMask> nestedMask) {
            _settingsMask = nestedMask.apply(((_settingsMask == null)?InstitutionalMemoryMetadataSettings.createMask():_settingsMask));
            getDataMap().put("settings", _settingsMask.getDataMap());
            return this;
        }

        /**
         * Settings for this record
         * 
         */
        public InstitutionalMemoryMetadata.ProjectionMask withSettings() {
            _settingsMask = null;
            getDataMap().put("settings", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
