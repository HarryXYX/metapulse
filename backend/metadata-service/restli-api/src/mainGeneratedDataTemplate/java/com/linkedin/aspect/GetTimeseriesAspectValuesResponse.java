
package com.linkedin.aspect;

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
import com.linkedin.metadata.aspect.EnvelopedAspectArray;
import com.linkedin.metadata.query.filter.Filter;


/**
 * The response structure of the getAspect API.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/pegasus/com/linkedin/aspect/GetTimeseriesAspectValuesResponse.pdl.")
public class GetTimeseriesAspectValuesResponse
    extends RecordTemplate
{

    private final static GetTimeseriesAspectValuesResponse.Fields _fields = new GetTimeseriesAspectValuesResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.aspect/**The response structure of the getAspect API.\n*/record GetTimeseriesAspectValuesResponse{/**The input entity name\n*/entityName:string/**The input aspect name\n*/aspectName:string/**The input start time in milliseconds.\n*/startTimeMillis:optional long/**The input end time in milliseconds.\n*/endTimeMillis:optional long/**The limit on the number of values requested.*/limit:optional long/**The enveloped values returned by the getAspect API.\n*/values:array[{namespace com.linkedin.metadata.aspect/**Enveloped record for an aspect.\n*/record EnvelopedAspect{aspect:{namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}}systemMetadata:{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}}]/**The optional flag to get the latest value of the aspect.\n*/getLatestValue:optional boolean/**The optional filter value for filtering the aspects.*/filter:optional{namespace com.linkedin.metadata.query.filter/**The filter for finding a record or a collection of records*/record Filter{/**A list of disjunctive criterion for the filter. (or operation to combine filters)*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}}}", SchemaFormatType.PDL));
    private String _entityNameField = null;
    private String _aspectNameField = null;
    private Long _startTimeMillisField = null;
    private Long _endTimeMillisField = null;
    private Long _limitField = null;
    private EnvelopedAspectArray _valuesField = null;
    private Boolean _getLatestValueField = null;
    private Filter _filterField = null;
    private GetTimeseriesAspectValuesResponse.ChangeListener __changeListener = new GetTimeseriesAspectValuesResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityName = SCHEMA.getField("entityName");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_StartTimeMillis = SCHEMA.getField("startTimeMillis");
    private final static RecordDataSchema.Field FIELD_EndTimeMillis = SCHEMA.getField("endTimeMillis");
    private final static RecordDataSchema.Field FIELD_Limit = SCHEMA.getField("limit");
    private final static RecordDataSchema.Field FIELD_Values = SCHEMA.getField("values");
    private final static RecordDataSchema.Field FIELD_GetLatestValue = SCHEMA.getField("getLatestValue");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    public GetTimeseriesAspectValuesResponse() {
        super(new DataMap(11, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public GetTimeseriesAspectValuesResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GetTimeseriesAspectValuesResponse.Fields fields() {
        return _fields;
    }

    public static GetTimeseriesAspectValuesResponse.ProjectionMask createMask() {
        return new GetTimeseriesAspectValuesResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    public boolean hasEntityName() {
        if (_entityNameField!= null) {
            return true;
        }
        return super._map.containsKey("entityName");
    }

    /**
     * Remover for entityName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    public void removeEntityName() {
        super._map.remove("entityName");
    }

    /**
     * Getter for entityName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    @Nullable
    public String getEntityName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityName();
            case DEFAULT:
            case NULL:
                if (_entityNameField!= null) {
                    return _entityNameField;
                } else {
                    Object __rawValue = super._map.get("entityName");
                    _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    @Nonnull
    public String getEntityName() {
        if (_entityNameField!= null) {
            return _entityNameField;
        } else {
            Object __rawValue = super._map.get("entityName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityName");
            }
            _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityNameField;
        }
    }

    /**
     * Setter for entityName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    public GetTimeseriesAspectValuesResponse setEntityName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityName of com.linkedin.aspect.GetTimeseriesAspectValuesResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#entityName
     */
    public GetTimeseriesAspectValuesResponse setEntityName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityName of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityName", value);
            _entityNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectName();
            case DEFAULT:
            case NULL:
                if (_aspectNameField!= null) {
                    return _aspectNameField;
                } else {
                    Object __rawValue = super._map.get("aspectName");
                    _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectName");
            }
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    public GetTimeseriesAspectValuesResponse setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectName of com.linkedin.aspect.GetTimeseriesAspectValuesResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#aspectName
     */
    public GetTimeseriesAspectValuesResponse setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for startTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    public boolean hasStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("startTimeMillis");
    }

    /**
     * Remover for startTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    public void removeStartTimeMillis() {
        super._map.remove("startTimeMillis");
    }

    /**
     * Getter for startTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    @Nullable
    public Long getStartTimeMillis(GetMode mode) {
        return getStartTimeMillis();
    }

    /**
     * Getter for startTimeMillis
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    @Nullable
    public Long getStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return _startTimeMillisField;
        } else {
            Object __rawValue = super._map.get("startTimeMillis");
            _startTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _startTimeMillisField;
        }
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setStartTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStartTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStartTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setStartTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field startTimeMillis of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _startTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#startTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setStartTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _startTimeMillisField = value;
        return this;
    }

    /**
     * Existence checker for endTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    public boolean hasEndTimeMillis() {
        if (_endTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("endTimeMillis");
    }

    /**
     * Remover for endTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    public void removeEndTimeMillis() {
        super._map.remove("endTimeMillis");
    }

    /**
     * Getter for endTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    @Nullable
    public Long getEndTimeMillis(GetMode mode) {
        return getEndTimeMillis();
    }

    /**
     * Getter for endTimeMillis
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    @Nullable
    public Long getEndTimeMillis() {
        if (_endTimeMillisField!= null) {
            return _endTimeMillisField;
        } else {
            Object __rawValue = super._map.get("endTimeMillis");
            _endTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _endTimeMillisField;
        }
    }

    /**
     * Setter for endTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setEndTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEndTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEndTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _endTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _endTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for endTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setEndTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field endTimeMillis of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _endTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for endTimeMillis
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#endTimeMillis
     */
    public GetTimeseriesAspectValuesResponse setEndTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _endTimeMillisField = value;
        return this;
    }

    /**
     * Existence checker for limit
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    public boolean hasLimit() {
        if (_limitField!= null) {
            return true;
        }
        return super._map.containsKey("limit");
    }

    /**
     * Remover for limit
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    public void removeLimit() {
        super._map.remove("limit");
    }

    /**
     * Getter for limit
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    @Nullable
    public Long getLimit(GetMode mode) {
        return getLimit();
    }

    /**
     * Getter for limit
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    @Nullable
    public Long getLimit() {
        if (_limitField!= null) {
            return _limitField;
        } else {
            Object __rawValue = super._map.get("limit");
            _limitField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _limitField;
        }
    }

    /**
     * Setter for limit
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    public GetTimeseriesAspectValuesResponse setLimit(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLimit(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLimit();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceLongInput(value));
                    _limitField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceLongInput(value));
                    _limitField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for limit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    public GetTimeseriesAspectValuesResponse setLimit(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field limit of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceLongInput(value));
            _limitField = value;
        }
        return this;
    }

    /**
     * Setter for limit
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#limit
     */
    public GetTimeseriesAspectValuesResponse setLimit(long value) {
        CheckedUtil.putWithoutChecking(super._map, "limit", DataTemplateUtil.coerceLongInput(value));
        _limitField = value;
        return this;
    }

    /**
     * Existence checker for values
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    public boolean hasValues() {
        if (_valuesField!= null) {
            return true;
        }
        return super._map.containsKey("values");
    }

    /**
     * Remover for values
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    public void removeValues() {
        super._map.remove("values");
    }

    /**
     * Getter for values
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    @Nullable
    public EnvelopedAspectArray getValues(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValues();
            case DEFAULT:
            case NULL:
                if (_valuesField!= null) {
                    return _valuesField;
                } else {
                    Object __rawValue = super._map.get("values");
                    _valuesField = ((__rawValue == null)?null:new EnvelopedAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _valuesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for values
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    @Nonnull
    public EnvelopedAspectArray getValues() {
        if (_valuesField!= null) {
            return _valuesField;
        } else {
            Object __rawValue = super._map.get("values");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("values");
            }
            _valuesField = ((__rawValue == null)?null:new EnvelopedAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _valuesField;
        }
    }

    /**
     * Setter for values
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    public GetTimeseriesAspectValuesResponse setValues(
        @Nullable
        EnvelopedAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field values of com.linkedin.aspect.GetTimeseriesAspectValuesResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for values
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#values
     */
    public GetTimeseriesAspectValuesResponse setValues(
        @Nonnull
        EnvelopedAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field values of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "values", value.data());
            _valuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for getLatestValue
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    public boolean hasGetLatestValue() {
        if (_getLatestValueField!= null) {
            return true;
        }
        return super._map.containsKey("getLatestValue");
    }

    /**
     * Remover for getLatestValue
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    public void removeGetLatestValue() {
        super._map.remove("getLatestValue");
    }

    /**
     * Getter for getLatestValue
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    @Nullable
    public Boolean isGetLatestValue(GetMode mode) {
        return isGetLatestValue();
    }

    /**
     * Getter for getLatestValue
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    @Nullable
    public Boolean isGetLatestValue() {
        if (_getLatestValueField!= null) {
            return _getLatestValueField;
        } else {
            Object __rawValue = super._map.get("getLatestValue");
            _getLatestValueField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _getLatestValueField;
        }
    }

    /**
     * Setter for getLatestValue
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    public GetTimeseriesAspectValuesResponse setGetLatestValue(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGetLatestValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGetLatestValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "getLatestValue", value);
                    _getLatestValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "getLatestValue", value);
                    _getLatestValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for getLatestValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    public GetTimeseriesAspectValuesResponse setGetLatestValue(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field getLatestValue of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "getLatestValue", value);
            _getLatestValueField = value;
        }
        return this;
    }

    /**
     * Setter for getLatestValue
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#getLatestValue
     */
    public GetTimeseriesAspectValuesResponse setGetLatestValue(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "getLatestValue", value);
        _getLatestValueField = value;
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    public boolean hasFilter() {
        if (_filterField!= null) {
            return true;
        }
        return super._map.containsKey("filter");
    }

    /**
     * Remover for filter
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    @Nullable
    public Filter getFilter(GetMode mode) {
        return getFilter();
    }

    /**
     * Getter for filter
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    @Nullable
    public Filter getFilter() {
        if (_filterField!= null) {
            return _filterField;
        } else {
            Object __rawValue = super._map.get("filter");
            _filterField = ((__rawValue == null)?null:new Filter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _filterField;
        }
    }

    /**
     * Setter for filter
     * 
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    public GetTimeseriesAspectValuesResponse setFilter(
        @Nullable
        Filter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAspectValuesResponse.Fields#filter
     */
    public GetTimeseriesAspectValuesResponse setFilter(
        @Nonnull
        Filter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.aspect.GetTimeseriesAspectValuesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public GetTimeseriesAspectValuesResponse clone()
        throws CloneNotSupportedException
    {
        GetTimeseriesAspectValuesResponse __clone = ((GetTimeseriesAspectValuesResponse) super.clone());
        __clone.__changeListener = new GetTimeseriesAspectValuesResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GetTimeseriesAspectValuesResponse copy()
        throws CloneNotSupportedException
    {
        GetTimeseriesAspectValuesResponse __copy = ((GetTimeseriesAspectValuesResponse) super.copy());
        __copy._filterField = null;
        __copy._aspectNameField = null;
        __copy._endTimeMillisField = null;
        __copy._getLatestValueField = null;
        __copy._startTimeMillisField = null;
        __copy._entityNameField = null;
        __copy._valuesField = null;
        __copy._limitField = null;
        __copy.__changeListener = new GetTimeseriesAspectValuesResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GetTimeseriesAspectValuesResponse __objectRef;

        private ChangeListener(GetTimeseriesAspectValuesResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "endTimeMillis":
                    __objectRef._endTimeMillisField = null;
                    break;
                case "getLatestValue":
                    __objectRef._getLatestValueField = null;
                    break;
                case "startTimeMillis":
                    __objectRef._startTimeMillisField = null;
                    break;
                case "entityName":
                    __objectRef._entityNameField = null;
                    break;
                case "values":
                    __objectRef._valuesField = null;
                    break;
                case "limit":
                    __objectRef._limitField = null;
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
         * The input entity name
         * 
         * 
         */
        public PathSpec entityName() {
            return new PathSpec(getPathComponents(), "entityName");
        }

        /**
         * The input aspect name
         * 
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        /**
         * The input start time in milliseconds.
         * 
         * 
         */
        public PathSpec startTimeMillis() {
            return new PathSpec(getPathComponents(), "startTimeMillis");
        }

        /**
         * The input end time in milliseconds.
         * 
         * 
         */
        public PathSpec endTimeMillis() {
            return new PathSpec(getPathComponents(), "endTimeMillis");
        }

        /**
         * The limit on the number of values requested.
         * 
         */
        public PathSpec limit() {
            return new PathSpec(getPathComponents(), "limit");
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public com.linkedin.metadata.aspect.EnvelopedAspectArray.Fields values() {
            return new com.linkedin.metadata.aspect.EnvelopedAspectArray.Fields(getPathComponents(), "values");
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public PathSpec values(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "values");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The optional flag to get the latest value of the aspect.
         * 
         * 
         */
        public PathSpec getLatestValue() {
            return new PathSpec(getPathComponents(), "getLatestValue");
        }

        /**
         * The optional filter value for filtering the aspects.
         * 
         */
        public com.linkedin.metadata.query.filter.Filter.Fields filter() {
            return new com.linkedin.metadata.query.filter.Filter.Fields(getPathComponents(), "filter");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.EnvelopedAspectArray.ProjectionMask _valuesMask;
        private com.linkedin.metadata.query.filter.Filter.ProjectionMask _filterMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * The input entity name
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withEntityName() {
            getDataMap().put("entityName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The input aspect name
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The input start time in milliseconds.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withStartTimeMillis() {
            getDataMap().put("startTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The input end time in milliseconds.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withEndTimeMillis() {
            getDataMap().put("endTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The limit on the number of values requested.
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withLimit() {
            getDataMap().put("limit", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withValues(Function<com.linkedin.metadata.aspect.EnvelopedAspectArray.ProjectionMask, com.linkedin.metadata.aspect.EnvelopedAspectArray.ProjectionMask> nestedMask) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?EnvelopedAspectArray.createMask():_valuesMask));
            getDataMap().put("values", _valuesMask.getDataMap());
            return this;
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withValues() {
            _valuesMask = null;
            getDataMap().put("values", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withValues(Function<com.linkedin.metadata.aspect.EnvelopedAspectArray.ProjectionMask, com.linkedin.metadata.aspect.EnvelopedAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?EnvelopedAspectArray.createMask():_valuesMask));
            getDataMap().put("values", _valuesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * The enveloped values returned by the getAspect API.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withValues(Integer start, Integer count) {
            _valuesMask = null;
            getDataMap().put("values", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * The optional flag to get the latest value of the aspect.
         * 
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withGetLatestValue() {
            getDataMap().put("getLatestValue", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The optional filter value for filtering the aspects.
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withFilter(Function<com.linkedin.metadata.query.filter.Filter.ProjectionMask, com.linkedin.metadata.query.filter.Filter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?Filter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * The optional filter value for filtering the aspects.
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withFilter(MaskMap nestedMask) {
            getDataMap().put("filter", nestedMask.getDataMap());
            return this;
        }

        /**
         * The optional filter value for filtering the aspects.
         * 
         */
        public GetTimeseriesAspectValuesResponse.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
