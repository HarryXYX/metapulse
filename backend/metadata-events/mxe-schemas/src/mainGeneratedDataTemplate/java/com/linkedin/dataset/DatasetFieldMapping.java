
package com.linkedin.dataset;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataList;
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
 * Representation of mapping between fields in source dataset to the field in destination dataset
 * 
 * @deprecated
 *     use FineGrainedLineage instead
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldMapping.pdl.")
@Deprecated
public class DatasetFieldMapping
    extends RecordTemplate
{

    private final static DatasetFieldMapping.Fields _fields = new DatasetFieldMapping.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Representation of mapping between fields in source dataset to the field in destination dataset*/@deprecated=\"use FineGrainedLineage instead\"record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/@deprecated=\"refer FineGrainedLineage for alternative representation\"typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}", SchemaFormatType.PDL));
    private AuditStamp _createdField = null;
    private com.linkedin.common.BaseFieldMapping.Transformation _transformationField = null;
    private DatasetFieldUpstreamArray _sourceFieldsField = null;
    private com.linkedin.common.urn.DatasetFieldUrn _destinationFieldField = null;
    private DatasetFieldMapping.ChangeListener __changeListener = new DatasetFieldMapping.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_Transformation = SCHEMA.getField("transformation");
    private final static RecordDataSchema.Field FIELD_SourceFields = SCHEMA.getField("sourceFields");
    private final static RecordDataSchema.Field FIELD_DestinationField = SCHEMA.getField("destinationField");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetFieldUrn.class);
    }

    public DatasetFieldMapping() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DatasetFieldMapping(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetFieldMapping.Fields fields() {
        return _fields;
    }

    public static DatasetFieldMapping.ProjectionMask createMask() {
        return new DatasetFieldMapping.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for created
     * 
     * @see DatasetFieldMapping.Fields#created
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
     * @see DatasetFieldMapping.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DatasetFieldMapping.Fields#created
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
     * @see DatasetFieldMapping.Fields#created
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
     * @see DatasetFieldMapping.Fields#created
     */
    public DatasetFieldMapping setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.dataset.DatasetFieldMapping");
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
     * @see DatasetFieldMapping.Fields#created
     */
    public DatasetFieldMapping setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.dataset.DatasetFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public boolean hasTransformation() {
        if (_transformationField!= null) {
            return true;
        }
        return super._map.containsKey("transformation");
    }

    /**
     * Remover for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public void removeTransformation() {
        super._map.remove("transformation");
    }

    /**
     * Getter for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    @Nullable
    public com.linkedin.common.BaseFieldMapping.Transformation getTransformation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTransformation();
            case DEFAULT:
            case NULL:
                if (_transformationField!= null) {
                    return _transformationField;
                } else {
                    Object __rawValue = super._map.get("transformation");
                    _transformationField = ((__rawValue == null)?null:new com.linkedin.common.BaseFieldMapping.Transformation(__rawValue));
                    return _transformationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for transformation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#transformation
     */
    @Nonnull
    public com.linkedin.common.BaseFieldMapping.Transformation getTransformation() {
        if (_transformationField!= null) {
            return _transformationField;
        } else {
            Object __rawValue = super._map.get("transformation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("transformation");
            }
            _transformationField = ((__rawValue == null)?null:new com.linkedin.common.BaseFieldMapping.Transformation(__rawValue));
            return _transformationField;
        }
    }

    /**
     * Setter for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public DatasetFieldMapping setTransformation(
        @Nullable
        com.linkedin.common.BaseFieldMapping.Transformation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransformation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field transformation of com.linkedin.dataset.DatasetFieldMapping");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transformation", value.data());
                    _transformationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTransformation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transformation", value.data());
                    _transformationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "transformation", value.data());
                    _transformationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for transformation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#transformation
     */
    public DatasetFieldMapping setTransformation(
        @Nonnull
        com.linkedin.common.BaseFieldMapping.Transformation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transformation of com.linkedin.dataset.DatasetFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transformation", value.data());
            _transformationField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public boolean hasSourceFields() {
        if (_sourceFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("sourceFields");
    }

    /**
     * Remover for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public void removeSourceFields() {
        super._map.remove("sourceFields");
    }

    /**
     * Getter for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    @Nullable
    public DatasetFieldUpstreamArray getSourceFields(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceFields();
            case DEFAULT:
            case NULL:
                if (_sourceFieldsField!= null) {
                    return _sourceFieldsField;
                } else {
                    Object __rawValue = super._map.get("sourceFields");
                    _sourceFieldsField = ((__rawValue == null)?null:new DatasetFieldUpstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _sourceFieldsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    @Nonnull
    public DatasetFieldUpstreamArray getSourceFields() {
        if (_sourceFieldsField!= null) {
            return _sourceFieldsField;
        } else {
            Object __rawValue = super._map.get("sourceFields");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceFields");
            }
            _sourceFieldsField = ((__rawValue == null)?null:new DatasetFieldUpstreamArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sourceFieldsField;
        }
    }

    /**
     * Setter for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public DatasetFieldMapping setSourceFields(
        @Nullable
        DatasetFieldUpstreamArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceFields of com.linkedin.dataset.DatasetFieldMapping");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
                    _sourceFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public DatasetFieldMapping setSourceFields(
        @Nonnull
        DatasetFieldUpstreamArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceFields of com.linkedin.dataset.DatasetFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceFields", value.data());
            _sourceFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public boolean hasDestinationField() {
        if (_destinationFieldField!= null) {
            return true;
        }
        return super._map.containsKey("destinationField");
    }

    /**
     * Remover for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public void removeDestinationField() {
        super._map.remove("destinationField");
    }

    /**
     * Getter for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    @Nullable
    public com.linkedin.common.urn.DatasetFieldUrn getDestinationField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDestinationField();
            case DEFAULT:
            case NULL:
                if (_destinationFieldField!= null) {
                    return _destinationFieldField;
                } else {
                    Object __rawValue = super._map.get("destinationField");
                    _destinationFieldField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetFieldUrn.class);
                    return _destinationFieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for destinationField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#destinationField
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetFieldUrn getDestinationField() {
        if (_destinationFieldField!= null) {
            return _destinationFieldField;
        } else {
            Object __rawValue = super._map.get("destinationField");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("destinationField");
            }
            _destinationFieldField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetFieldUrn.class);
            return _destinationFieldField;
        }
    }

    /**
     * Setter for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public DatasetFieldMapping setDestinationField(
        @Nullable
        com.linkedin.common.urn.DatasetFieldUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDestinationField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field destinationField of com.linkedin.dataset.DatasetFieldMapping");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetFieldUrn.class));
                    _destinationFieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDestinationField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetFieldUrn.class));
                    _destinationFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "destinationField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetFieldUrn.class));
                    _destinationFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for destinationField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public DatasetFieldMapping setDestinationField(
        @Nonnull
        com.linkedin.common.urn.DatasetFieldUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field destinationField of com.linkedin.dataset.DatasetFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "destinationField", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetFieldUrn.class));
            _destinationFieldField = value;
        }
        return this;
    }

    @Override
    public DatasetFieldMapping clone()
        throws CloneNotSupportedException
    {
        DatasetFieldMapping __clone = ((DatasetFieldMapping) super.clone());
        __clone.__changeListener = new DatasetFieldMapping.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFieldMapping copy()
        throws CloneNotSupportedException
    {
        DatasetFieldMapping __copy = ((DatasetFieldMapping) super.copy());
        __copy._sourceFieldsField = null;
        __copy._createdField = null;
        __copy._transformationField = null;
        __copy._destinationFieldField = null;
        __copy.__changeListener = new DatasetFieldMapping.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFieldMapping __objectRef;

        private ChangeListener(DatasetFieldMapping reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceFields":
                    __objectRef._sourceFieldsField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "transformation":
                    __objectRef._transformationField = null;
                    break;
                case "destinationField":
                    __objectRef._destinationFieldField = null;
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
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public com.linkedin.common.BaseFieldMapping.Transformation.Fields transformation() {
            return new com.linkedin.common.BaseFieldMapping.Transformation.Fields(getPathComponents(), "transformation");
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public com.linkedin.dataset.DatasetFieldUpstreamArray.Fields sourceFields() {
            return new com.linkedin.dataset.DatasetFieldUpstreamArray.Fields(getPathComponents(), "sourceFields");
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public PathSpec sourceFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Destination field which is derived from source fields
         * 
         */
        public PathSpec destinationField() {
            return new PathSpec(getPathComponents(), "destinationField");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask _transformationMask;
        private com.linkedin.dataset.DatasetFieldUpstreamArray.ProjectionMask _sourceFieldsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public DatasetFieldMapping.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public DatasetFieldMapping.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public DatasetFieldMapping.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public DatasetFieldMapping.ProjectionMask withTransformation(Function<com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask, com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask> nestedMask) {
            _transformationMask = nestedMask.apply(((_transformationMask == null)?com.linkedin.common.BaseFieldMapping.Transformation.createMask():_transformationMask));
            getDataMap().put("transformation", _transformationMask.getDataMap());
            return this;
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public DatasetFieldMapping.ProjectionMask withTransformation() {
            _transformationMask = null;
            getDataMap().put("transformation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public DatasetFieldMapping.ProjectionMask withSourceFields(Function<com.linkedin.dataset.DatasetFieldUpstreamArray.ProjectionMask, com.linkedin.dataset.DatasetFieldUpstreamArray.ProjectionMask> nestedMask) {
            _sourceFieldsMask = nestedMask.apply(((_sourceFieldsMask == null)?DatasetFieldUpstreamArray.createMask():_sourceFieldsMask));
            getDataMap().put("sourceFields", _sourceFieldsMask.getDataMap());
            return this;
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public DatasetFieldMapping.ProjectionMask withSourceFields() {
            _sourceFieldsMask = null;
            getDataMap().put("sourceFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public DatasetFieldMapping.ProjectionMask withSourceFields(Function<com.linkedin.dataset.DatasetFieldUpstreamArray.ProjectionMask, com.linkedin.dataset.DatasetFieldUpstreamArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _sourceFieldsMask = nestedMask.apply(((_sourceFieldsMask == null)?DatasetFieldUpstreamArray.createMask():_sourceFieldsMask));
            getDataMap().put("sourceFields", _sourceFieldsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("sourceFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sourceFields").put("$count", count);
            }
            return this;
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public DatasetFieldMapping.ProjectionMask withSourceFields(Integer start, Integer count) {
            _sourceFieldsMask = null;
            getDataMap().put("sourceFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sourceFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sourceFields").put("$count", count);
            }
            return this;
        }

        /**
         * Destination field which is derived from source fields
         * 
         */
        public DatasetFieldMapping.ProjectionMask withDestinationField() {
            getDataMap().put("destinationField", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
