
package com.linkedin.dataset;

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
 * Describes a delta change to a dataset downstream lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DownstreamLineageDelta.pdl.")
public class DownstreamLineageDelta
    extends RecordTemplate
{

    private final static DownstreamLineageDelta.Fields _fields = new DownstreamLineageDelta.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Describes a delta change to a dataset downstream lineage*/record DownstreamLineageDelta{/**The list of downstream lineages to be updated for a dataset*/downstreamsToUpdate:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}", SchemaFormatType.PDL));
    private DownstreamArray _downstreamsToUpdateField = null;
    private DownstreamLineageDelta.ChangeListener __changeListener = new DownstreamLineageDelta.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DownstreamsToUpdate = SCHEMA.getField("downstreamsToUpdate");

    public DownstreamLineageDelta() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DownstreamLineageDelta(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DownstreamLineageDelta.Fields fields() {
        return _fields;
    }

    public static DownstreamLineageDelta.ProjectionMask createMask() {
        return new DownstreamLineageDelta.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public boolean hasDownstreamsToUpdate() {
        if (_downstreamsToUpdateField!= null) {
            return true;
        }
        return super._map.containsKey("downstreamsToUpdate");
    }

    /**
     * Remover for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public void removeDownstreamsToUpdate() {
        super._map.remove("downstreamsToUpdate");
    }

    /**
     * Getter for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    @Nullable
    public DownstreamArray getDownstreamsToUpdate(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDownstreamsToUpdate();
            case DEFAULT:
            case NULL:
                if (_downstreamsToUpdateField!= null) {
                    return _downstreamsToUpdateField;
                } else {
                    Object __rawValue = super._map.get("downstreamsToUpdate");
                    _downstreamsToUpdateField = ((__rawValue == null)?null:new DownstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _downstreamsToUpdateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for downstreamsToUpdate
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    @Nonnull
    public DownstreamArray getDownstreamsToUpdate() {
        if (_downstreamsToUpdateField!= null) {
            return _downstreamsToUpdateField;
        } else {
            Object __rawValue = super._map.get("downstreamsToUpdate");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("downstreamsToUpdate");
            }
            _downstreamsToUpdateField = ((__rawValue == null)?null:new DownstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _downstreamsToUpdateField;
        }
    }

    /**
     * Setter for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public DownstreamLineageDelta setDownstreamsToUpdate(
        @Nullable
        DownstreamArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreamsToUpdate(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field downstreamsToUpdate of com.linkedin.dataset.DownstreamLineageDelta");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamsToUpdate", value.data());
                    _downstreamsToUpdateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreamsToUpdate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamsToUpdate", value.data());
                    _downstreamsToUpdateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamsToUpdate", value.data());
                    _downstreamsToUpdateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreamsToUpdate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public DownstreamLineageDelta setDownstreamsToUpdate(
        @Nonnull
        DownstreamArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreamsToUpdate of com.linkedin.dataset.DownstreamLineageDelta to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreamsToUpdate", value.data());
            _downstreamsToUpdateField = value;
        }
        return this;
    }

    @Override
    public DownstreamLineageDelta clone()
        throws CloneNotSupportedException
    {
        DownstreamLineageDelta __clone = ((DownstreamLineageDelta) super.clone());
        __clone.__changeListener = new DownstreamLineageDelta.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DownstreamLineageDelta copy()
        throws CloneNotSupportedException
    {
        DownstreamLineageDelta __copy = ((DownstreamLineageDelta) super.copy());
        __copy._downstreamsToUpdateField = null;
        __copy.__changeListener = new DownstreamLineageDelta.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DownstreamLineageDelta __objectRef;

        private ChangeListener(DownstreamLineageDelta reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "downstreamsToUpdate":
                    __objectRef._downstreamsToUpdateField = null;
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
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public com.linkedin.dataset.DownstreamArray.Fields downstreamsToUpdate() {
            return new com.linkedin.dataset.DownstreamArray.Fields(getPathComponents(), "downstreamsToUpdate");
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public PathSpec downstreamsToUpdate(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreamsToUpdate");
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

        private com.linkedin.dataset.DownstreamArray.ProjectionMask _downstreamsToUpdateMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public DownstreamLineageDelta.ProjectionMask withDownstreamsToUpdate(Function<com.linkedin.dataset.DownstreamArray.ProjectionMask, com.linkedin.dataset.DownstreamArray.ProjectionMask> nestedMask) {
            _downstreamsToUpdateMask = nestedMask.apply(((_downstreamsToUpdateMask == null)?DownstreamArray.createMask():_downstreamsToUpdateMask));
            getDataMap().put("downstreamsToUpdate", _downstreamsToUpdateMask.getDataMap());
            return this;
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public DownstreamLineageDelta.ProjectionMask withDownstreamsToUpdate() {
            _downstreamsToUpdateMask = null;
            getDataMap().put("downstreamsToUpdate", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public DownstreamLineageDelta.ProjectionMask withDownstreamsToUpdate(Function<com.linkedin.dataset.DownstreamArray.ProjectionMask, com.linkedin.dataset.DownstreamArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _downstreamsToUpdateMask = nestedMask.apply(((_downstreamsToUpdateMask == null)?DownstreamArray.createMask():_downstreamsToUpdateMask));
            getDataMap().put("downstreamsToUpdate", _downstreamsToUpdateMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("downstreamsToUpdate").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreamsToUpdate").put("$count", count);
            }
            return this;
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public DownstreamLineageDelta.ProjectionMask withDownstreamsToUpdate(Integer start, Integer count) {
            _downstreamsToUpdateMask = null;
            getDataMap().put("downstreamsToUpdate", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("downstreamsToUpdate").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreamsToUpdate").put("$count", count);
            }
            return this;
        }

    }

}
