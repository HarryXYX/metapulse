
package com.linkedin.dataset;

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
 * Downstream lineage information about a dataset including the source reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/Downstream.pdl.")
public class Downstream
    extends RecordTemplate
{

    private final static Downstream.Fields _fields = new Downstream.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}", SchemaFormatType.PDL));
    private AuditStamp _auditStampField = null;
    private com.linkedin.common.urn.DatasetUrn _datasetField = null;
    private DatasetLineageType _typeField = null;
    private Downstream.ChangeListener __changeListener = new Downstream.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public Downstream() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Downstream(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Downstream.Fields fields() {
        return _fields;
    }

    public static Downstream.ProjectionMask createMask() {
        return new Downstream.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public boolean hasAuditStamp() {
        if (_auditStampField!= null) {
            return true;
        }
        return super._map.containsKey("auditStamp");
    }

    /**
     * Remover for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public void removeAuditStamp() {
        super._map.remove("auditStamp");
    }

    /**
     * Getter for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    @Nullable
    public AuditStamp getAuditStamp(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAuditStamp();
            case DEFAULT:
            case NULL:
                if (_auditStampField!= null) {
                    return _auditStampField;
                } else {
                    Object __rawValue = super._map.get("auditStamp");
                    _auditStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _auditStampField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#auditStamp
     */
    @Nonnull
    public AuditStamp getAuditStamp() {
        if (_auditStampField!= null) {
            return _auditStampField;
        } else {
            Object __rawValue = super._map.get("auditStamp");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("auditStamp");
            }
            _auditStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _auditStampField;
        }
    }

    /**
     * Setter for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public Downstream setAuditStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field auditStamp of com.linkedin.dataset.Downstream");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAuditStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#auditStamp
     */
    public Downstream setAuditStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditStamp of com.linkedin.dataset.Downstream to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
            _auditStampField = value;
        }
        return this;
    }

    /**
     * Existence checker for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public boolean hasDataset() {
        if (_datasetField!= null) {
            return true;
        }
        return super._map.containsKey("dataset");
    }

    /**
     * Remover for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public void removeDataset() {
        super._map.remove("dataset");
    }

    /**
     * Getter for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDataset();
            case DEFAULT:
            case NULL:
                if (_datasetField!= null) {
                    return _datasetField;
                } else {
                    Object __rawValue = super._map.get("dataset");
                    _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
                    return _datasetField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        if (_datasetField!= null) {
            return _datasetField;
        } else {
            Object __rawValue = super._map.get("dataset");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dataset");
            }
            _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
            return _datasetField;
        }
    }

    /**
     * Setter for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public Downstream setDataset(
        @Nullable
        com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dataset of com.linkedin.dataset.Downstream");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#dataset
     */
    public Downstream setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataset of com.linkedin.dataset.Downstream to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
            _datasetField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see Downstream.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see Downstream.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see Downstream.Fields#type
     */
    @Nullable
    public DatasetLineageType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetLineageType.class, DatasetLineageType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#type
     */
    @Nonnull
    public DatasetLineageType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetLineageType.class, DatasetLineageType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see Downstream.Fields#type
     */
    public Downstream setType(
        @Nullable
        DatasetLineageType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.dataset.Downstream");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#type
     */
    public Downstream setType(
        @Nonnull
        DatasetLineageType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.dataset.Downstream to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    @Override
    public Downstream clone()
        throws CloneNotSupportedException
    {
        Downstream __clone = ((Downstream) super.clone());
        __clone.__changeListener = new Downstream.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Downstream copy()
        throws CloneNotSupportedException
    {
        Downstream __copy = ((Downstream) super.copy());
        __copy._auditStampField = null;
        __copy._typeField = null;
        __copy._datasetField = null;
        __copy.__changeListener = new Downstream.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Downstream __objectRef;

        private ChangeListener(Downstream reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditStamp":
                    __objectRef._auditStampField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "dataset":
                    __objectRef._datasetField = null;
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
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

        /**
         * The downstream dataset the lineage points to
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * The type of the lineage
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _auditStampMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public Downstream.ProjectionMask withAuditStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditStampMask = nestedMask.apply(((_auditStampMask == null)?AuditStamp.createMask():_auditStampMask));
            getDataMap().put("auditStamp", _auditStampMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public Downstream.ProjectionMask withAuditStamp(MaskMap nestedMask) {
            getDataMap().put("auditStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public Downstream.ProjectionMask withAuditStamp() {
            _auditStampMask = null;
            getDataMap().put("auditStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The downstream dataset the lineage points to
         * 
         */
        public Downstream.ProjectionMask withDataset() {
            getDataMap().put("dataset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the lineage
         * 
         */
        public Downstream.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
