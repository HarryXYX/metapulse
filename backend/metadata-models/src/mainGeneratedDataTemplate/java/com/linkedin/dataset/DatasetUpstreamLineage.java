
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
 * Fine Grained upstream lineage for fields in a dataset
 * 
 * @deprecated
 *     use UpstreamLineage.fineGrainedLineages instead
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetUpstreamLineage.pdl.")
@Deprecated
public class DatasetUpstreamLineage
    extends RecordTemplate
{

    private final static DatasetUpstreamLineage.Fields _fields = new DatasetUpstreamLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Fine Grained upstream lineage for fields in a dataset*/@Aspect.name=\"datasetUpstreamLineage\"@deprecated=\"use UpstreamLineage.fineGrainedLineages instead\"record DatasetUpstreamLineage{/**Upstream to downstream field level lineage mappings*/fieldMappings:array[/**Representation of mapping between fields in source dataset to the field in destination dataset*/@deprecated=\"use FineGrainedLineage instead\"record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/@deprecated=\"refer FineGrainedLineage for alternative representation\"typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}]}", SchemaFormatType.PDL));
    private DatasetFieldMappingArray _fieldMappingsField = null;
    private DatasetUpstreamLineage.ChangeListener __changeListener = new DatasetUpstreamLineage.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldMappings = SCHEMA.getField("fieldMappings");

    public DatasetUpstreamLineage() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DatasetUpstreamLineage(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetUpstreamLineage.Fields fields() {
        return _fields;
    }

    public static DatasetUpstreamLineage.ProjectionMask createMask() {
        return new DatasetUpstreamLineage.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public boolean hasFieldMappings() {
        if (_fieldMappingsField!= null) {
            return true;
        }
        return super._map.containsKey("fieldMappings");
    }

    /**
     * Remover for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public void removeFieldMappings() {
        super._map.remove("fieldMappings");
    }

    /**
     * Getter for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    @Nullable
    public DatasetFieldMappingArray getFieldMappings(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldMappings();
            case DEFAULT:
            case NULL:
                if (_fieldMappingsField!= null) {
                    return _fieldMappingsField;
                } else {
                    Object __rawValue = super._map.get("fieldMappings");
                    _fieldMappingsField = ((__rawValue == null)?null:new DatasetFieldMappingArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _fieldMappingsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldMappings
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    @Nonnull
    public DatasetFieldMappingArray getFieldMappings() {
        if (_fieldMappingsField!= null) {
            return _fieldMappingsField;
        } else {
            Object __rawValue = super._map.get("fieldMappings");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldMappings");
            }
            _fieldMappingsField = ((__rawValue == null)?null:new DatasetFieldMappingArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fieldMappingsField;
        }
    }

    /**
     * Setter for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public DatasetUpstreamLineage setFieldMappings(
        @Nullable
        DatasetFieldMappingArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldMappings(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldMappings of com.linkedin.dataset.DatasetUpstreamLineage");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldMappings", value.data());
                    _fieldMappingsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldMappings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldMappings", value.data());
                    _fieldMappingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldMappings", value.data());
                    _fieldMappingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldMappings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public DatasetUpstreamLineage setFieldMappings(
        @Nonnull
        DatasetFieldMappingArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldMappings of com.linkedin.dataset.DatasetUpstreamLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldMappings", value.data());
            _fieldMappingsField = value;
        }
        return this;
    }

    @Override
    public DatasetUpstreamLineage clone()
        throws CloneNotSupportedException
    {
        DatasetUpstreamLineage __clone = ((DatasetUpstreamLineage) super.clone());
        __clone.__changeListener = new DatasetUpstreamLineage.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetUpstreamLineage copy()
        throws CloneNotSupportedException
    {
        DatasetUpstreamLineage __copy = ((DatasetUpstreamLineage) super.copy());
        __copy._fieldMappingsField = null;
        __copy.__changeListener = new DatasetUpstreamLineage.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetUpstreamLineage __objectRef;

        private ChangeListener(DatasetUpstreamLineage reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "fieldMappings":
                    __objectRef._fieldMappingsField = null;
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
         * Upstream to downstream field level lineage mappings
         * 
         */
        public com.linkedin.dataset.DatasetFieldMappingArray.Fields fieldMappings() {
            return new com.linkedin.dataset.DatasetFieldMappingArray.Fields(getPathComponents(), "fieldMappings");
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public PathSpec fieldMappings(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldMappings");
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

        private com.linkedin.dataset.DatasetFieldMappingArray.ProjectionMask _fieldMappingsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public DatasetUpstreamLineage.ProjectionMask withFieldMappings(Function<com.linkedin.dataset.DatasetFieldMappingArray.ProjectionMask, com.linkedin.dataset.DatasetFieldMappingArray.ProjectionMask> nestedMask) {
            _fieldMappingsMask = nestedMask.apply(((_fieldMappingsMask == null)?DatasetFieldMappingArray.createMask():_fieldMappingsMask));
            getDataMap().put("fieldMappings", _fieldMappingsMask.getDataMap());
            return this;
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public DatasetUpstreamLineage.ProjectionMask withFieldMappings() {
            _fieldMappingsMask = null;
            getDataMap().put("fieldMappings", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public DatasetUpstreamLineage.ProjectionMask withFieldMappings(Function<com.linkedin.dataset.DatasetFieldMappingArray.ProjectionMask, com.linkedin.dataset.DatasetFieldMappingArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _fieldMappingsMask = nestedMask.apply(((_fieldMappingsMask == null)?DatasetFieldMappingArray.createMask():_fieldMappingsMask));
            getDataMap().put("fieldMappings", _fieldMappingsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("fieldMappings").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fieldMappings").put("$count", count);
            }
            return this;
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public DatasetUpstreamLineage.ProjectionMask withFieldMappings(Integer start, Integer count) {
            _fieldMappingsMask = null;
            getDataMap().put("fieldMappings", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fieldMappings").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fieldMappings").put("$count", count);
            }
            return this;
        }

    }

}
