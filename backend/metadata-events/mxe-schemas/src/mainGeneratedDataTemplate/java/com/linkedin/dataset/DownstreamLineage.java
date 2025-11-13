
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
 * Downstream lineage of a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DownstreamLineage.pdl.")
public class DownstreamLineage
    extends RecordTemplate
{

    private final static DownstreamLineage.Fields _fields = new DownstreamLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Downstream lineage of a dataset*/record DownstreamLineage{/**List of downstream dataset lineage information*/downstreams:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}", SchemaFormatType.PDL));
    private DownstreamArray _downstreamsField = null;
    private DownstreamLineage.ChangeListener __changeListener = new DownstreamLineage.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Downstreams = SCHEMA.getField("downstreams");

    public DownstreamLineage() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DownstreamLineage(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DownstreamLineage.Fields fields() {
        return _fields;
    }

    public static DownstreamLineage.ProjectionMask createMask() {
        return new DownstreamLineage.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public boolean hasDownstreams() {
        if (_downstreamsField!= null) {
            return true;
        }
        return super._map.containsKey("downstreams");
    }

    /**
     * Remover for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public void removeDownstreams() {
        super._map.remove("downstreams");
    }

    /**
     * Getter for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    @Nullable
    public DownstreamArray getDownstreams(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDownstreams();
            case DEFAULT:
            case NULL:
                if (_downstreamsField!= null) {
                    return _downstreamsField;
                } else {
                    Object __rawValue = super._map.get("downstreams");
                    _downstreamsField = ((__rawValue == null)?null:new DownstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _downstreamsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for downstreams
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamLineage.Fields#downstreams
     */
    @Nonnull
    public DownstreamArray getDownstreams() {
        if (_downstreamsField!= null) {
            return _downstreamsField;
        } else {
            Object __rawValue = super._map.get("downstreams");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("downstreams");
            }
            _downstreamsField = ((__rawValue == null)?null:new DownstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _downstreamsField;
        }
    }

    /**
     * Setter for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public DownstreamLineage setDownstreams(
        @Nullable
        DownstreamArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreams(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field downstreams of com.linkedin.dataset.DownstreamLineage");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
                    _downstreamsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
                    _downstreamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
                    _downstreamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamLineage.Fields#downstreams
     */
    public DownstreamLineage setDownstreams(
        @Nonnull
        DownstreamArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreams of com.linkedin.dataset.DownstreamLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
            _downstreamsField = value;
        }
        return this;
    }

    @Override
    public DownstreamLineage clone()
        throws CloneNotSupportedException
    {
        DownstreamLineage __clone = ((DownstreamLineage) super.clone());
        __clone.__changeListener = new DownstreamLineage.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DownstreamLineage copy()
        throws CloneNotSupportedException
    {
        DownstreamLineage __copy = ((DownstreamLineage) super.copy());
        __copy._downstreamsField = null;
        __copy.__changeListener = new DownstreamLineage.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DownstreamLineage __objectRef;

        private ChangeListener(DownstreamLineage reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "downstreams":
                    __objectRef._downstreamsField = null;
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
         * List of downstream dataset lineage information
         * 
         */
        public com.linkedin.dataset.DownstreamArray.Fields downstreams() {
            return new com.linkedin.dataset.DownstreamArray.Fields(getPathComponents(), "downstreams");
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public PathSpec downstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreams");
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

        private com.linkedin.dataset.DownstreamArray.ProjectionMask _downstreamsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public DownstreamLineage.ProjectionMask withDownstreams(Function<com.linkedin.dataset.DownstreamArray.ProjectionMask, com.linkedin.dataset.DownstreamArray.ProjectionMask> nestedMask) {
            _downstreamsMask = nestedMask.apply(((_downstreamsMask == null)?DownstreamArray.createMask():_downstreamsMask));
            getDataMap().put("downstreams", _downstreamsMask.getDataMap());
            return this;
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public DownstreamLineage.ProjectionMask withDownstreams() {
            _downstreamsMask = null;
            getDataMap().put("downstreams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public DownstreamLineage.ProjectionMask withDownstreams(Function<com.linkedin.dataset.DownstreamArray.ProjectionMask, com.linkedin.dataset.DownstreamArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _downstreamsMask = nestedMask.apply(((_downstreamsMask == null)?DownstreamArray.createMask():_downstreamsMask));
            getDataMap().put("downstreams", _downstreamsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("downstreams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreams").put("$count", count);
            }
            return this;
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public DownstreamLineage.ProjectionMask withDownstreams(Integer start, Integer count) {
            _downstreamsMask = null;
            getDataMap().put("downstreams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("downstreams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreams").put("$count", count);
            }
            return this;
        }

    }

}
