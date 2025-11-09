
package com.linkedin.common;

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
import com.linkedin.data.template.SetMode;


/**
 * Summary related incidents on an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/IncidentsSummary.pdl.")
public class IncidentsSummary
    extends RecordTemplate
{

    private final static IncidentsSummary.Fields _fields = new IncidentsSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Summary related incidents on an entity.*/@Aspect.name=\"incidentsSummary\"record IncidentsSummary{/**Resolved incidents for an asset\nDeprecated! Use the richer resolvedIncidentsDetails instead.*/@deprecated,resolvedIncidents:array[@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string]=[]/**Active incidents for an asset\nDeprecated! Use the richer activeIncidentsDetails instead.*/@deprecated,activeIncidents:array[Urn]=[]/**Summary details about the set of resolved incidents*/@Relationship.`/*/urn`={\"entityTypes\":[\"incident\"],\"name\":\"ResolvedIncidents\"}@Searchable={\"/*/createdAt\":{\"fieldName\":\"resolvedIncidentCreatedTimes\",\"fieldType\":\"DATETIME\"},\"/*/priority\":{\"fieldName\":\"resolvedIncidentPriorities\",\"fieldType\":\"COUNT\"},\"/*/resolvedAt\":{\"fieldName\":\"resolvedIncidentResolvedTimes\",\"fieldType\":\"DATETIME\"},\"/*/type\":{\"fieldName\":\"resolvedIncidentTypes\",\"fieldType\":\"KEYWORD\"},\"/*/urn\":{\"fieldName\":\"resolvedIncidents\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasResolvedIncidents\",\"numValuesFieldName\":\"numResolvedIncidents\",\"queryByDefault\":false}}resolvedIncidentDetails:array[/**Summary statistics about incidents on an entity.*/record IncidentSummaryDetails{/**The urn of the incident*/urn:Urn/**The type of an incident*/type:string/**The time at which the incident was raised in milliseconds since epoch.*/createdAt:long/**The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.*/resolvedAt:optional long/**The priority of the incident*/priority:optional int}]=[]/**Summary details about the set of active incidents*/@Relationship.`/*/urn`={\"entityTypes\":[\"incident\"],\"name\":\"ActiveIncidents\"}@Searchable={\"/*/createdAt\":{\"fieldName\":\"activeIncidentCreatedTimes\",\"fieldType\":\"DATETIME\"},\"/*/priority\":{\"fieldName\":\"activeIncidentPriorities\",\"fieldType\":\"COUNT\"},\"/*/type\":{\"fieldName\":\"activeIncidentTypes\",\"fieldType\":\"KEYWORD\"},\"/*/urn\":{\"addHasValuesToFilters\":true,\"fieldName\":\"activeIncidents\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasActiveIncidents\",\"numValuesFieldName\":\"numActiveIncidents\",\"queryByDefault\":false}}activeIncidentDetails:array[IncidentSummaryDetails]=[]}", SchemaFormatType.PDL));
    private UrnArray _resolvedIncidentsField = null;
    private UrnArray _activeIncidentsField = null;
    private IncidentSummaryDetailsArray _resolvedIncidentDetailsField = null;
    private IncidentSummaryDetailsArray _activeIncidentDetailsField = null;
    private IncidentsSummary.ChangeListener __changeListener = new IncidentsSummary.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ResolvedIncidents = SCHEMA.getField("resolvedIncidents");
    private final static UrnArray DEFAULT_ResolvedIncidents;
    private final static RecordDataSchema.Field FIELD_ActiveIncidents = SCHEMA.getField("activeIncidents");
    private final static UrnArray DEFAULT_ActiveIncidents;
    private final static RecordDataSchema.Field FIELD_ResolvedIncidentDetails = SCHEMA.getField("resolvedIncidentDetails");
    private final static IncidentSummaryDetailsArray DEFAULT_ResolvedIncidentDetails;
    private final static RecordDataSchema.Field FIELD_ActiveIncidentDetails = SCHEMA.getField("activeIncidentDetails");
    private final static IncidentSummaryDetailsArray DEFAULT_ActiveIncidentDetails;

    static {
        DEFAULT_ResolvedIncidents = ((FIELD_ResolvedIncidents.getDefault() == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(FIELD_ResolvedIncidents.getDefault(), DataList.class)));
        DEFAULT_ActiveIncidents = ((FIELD_ActiveIncidents.getDefault() == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(FIELD_ActiveIncidents.getDefault(), DataList.class)));
        DEFAULT_ResolvedIncidentDetails = ((FIELD_ResolvedIncidentDetails.getDefault() == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(FIELD_ResolvedIncidentDetails.getDefault(), DataList.class)));
        DEFAULT_ActiveIncidentDetails = ((FIELD_ActiveIncidentDetails.getDefault() == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(FIELD_ActiveIncidentDetails.getDefault(), DataList.class)));
    }

    public IncidentsSummary() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public IncidentsSummary(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentsSummary.Fields fields() {
        return _fields;
    }

    public static IncidentsSummary.ProjectionMask createMask() {
        return new IncidentsSummary.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for resolvedIncidents
     * 
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    public boolean hasResolvedIncidents() {
        if (_resolvedIncidentsField!= null) {
            return true;
        }
        return super._map.containsKey("resolvedIncidents");
    }

    /**
     * Remover for resolvedIncidents
     * 
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    public void removeResolvedIncidents() {
        super._map.remove("resolvedIncidents");
    }

    /**
     * Getter for resolvedIncidents
     * 
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    @Nullable
    public UrnArray getResolvedIncidents(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getResolvedIncidents();
            case NULL:
                if (_resolvedIncidentsField!= null) {
                    return _resolvedIncidentsField;
                } else {
                    Object __rawValue = super._map.get("resolvedIncidents");
                    _resolvedIncidentsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _resolvedIncidentsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resolvedIncidents
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    @Nonnull
    public UrnArray getResolvedIncidents() {
        if (_resolvedIncidentsField!= null) {
            return _resolvedIncidentsField;
        } else {
            Object __rawValue = super._map.get("resolvedIncidents");
            if (__rawValue == null) {
                return DEFAULT_ResolvedIncidents;
            }
            _resolvedIncidentsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _resolvedIncidentsField;
        }
    }

    /**
     * Setter for resolvedIncidents
     * 
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    public IncidentsSummary setResolvedIncidents(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResolvedIncidents(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resolvedIncidents of com.linkedin.common.IncidentsSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidents", value.data());
                    _resolvedIncidentsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResolvedIncidents();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidents", value.data());
                    _resolvedIncidentsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidents", value.data());
                    _resolvedIncidentsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resolvedIncidents
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentsSummary.Fields#resolvedIncidents
     */
    @Deprecated
    public IncidentsSummary setResolvedIncidents(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resolvedIncidents of com.linkedin.common.IncidentsSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resolvedIncidents", value.data());
            _resolvedIncidentsField = value;
        }
        return this;
    }

    /**
     * Existence checker for activeIncidents
     * 
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    public boolean hasActiveIncidents() {
        if (_activeIncidentsField!= null) {
            return true;
        }
        return super._map.containsKey("activeIncidents");
    }

    /**
     * Remover for activeIncidents
     * 
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    public void removeActiveIncidents() {
        super._map.remove("activeIncidents");
    }

    /**
     * Getter for activeIncidents
     * 
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    @Nullable
    public UrnArray getActiveIncidents(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getActiveIncidents();
            case NULL:
                if (_activeIncidentsField!= null) {
                    return _activeIncidentsField;
                } else {
                    Object __rawValue = super._map.get("activeIncidents");
                    _activeIncidentsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _activeIncidentsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for activeIncidents
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    @Nonnull
    public UrnArray getActiveIncidents() {
        if (_activeIncidentsField!= null) {
            return _activeIncidentsField;
        } else {
            Object __rawValue = super._map.get("activeIncidents");
            if (__rawValue == null) {
                return DEFAULT_ActiveIncidents;
            }
            _activeIncidentsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _activeIncidentsField;
        }
    }

    /**
     * Setter for activeIncidents
     * 
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    public IncidentsSummary setActiveIncidents(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActiveIncidents(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field activeIncidents of com.linkedin.common.IncidentsSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidents", value.data());
                    _activeIncidentsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActiveIncidents();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidents", value.data());
                    _activeIncidentsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidents", value.data());
                    _activeIncidentsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for activeIncidents
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentsSummary.Fields#activeIncidents
     */
    @Deprecated
    public IncidentsSummary setActiveIncidents(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field activeIncidents of com.linkedin.common.IncidentsSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "activeIncidents", value.data());
            _activeIncidentsField = value;
        }
        return this;
    }

    /**
     * Existence checker for resolvedIncidentDetails
     * 
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    public boolean hasResolvedIncidentDetails() {
        if (_resolvedIncidentDetailsField!= null) {
            return true;
        }
        return super._map.containsKey("resolvedIncidentDetails");
    }

    /**
     * Remover for resolvedIncidentDetails
     * 
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    public void removeResolvedIncidentDetails() {
        super._map.remove("resolvedIncidentDetails");
    }

    /**
     * Getter for resolvedIncidentDetails
     * 
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    @Nullable
    public IncidentSummaryDetailsArray getResolvedIncidentDetails(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getResolvedIncidentDetails();
            case NULL:
                if (_resolvedIncidentDetailsField!= null) {
                    return _resolvedIncidentDetailsField;
                } else {
                    Object __rawValue = super._map.get("resolvedIncidentDetails");
                    _resolvedIncidentDetailsField = ((__rawValue == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _resolvedIncidentDetailsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resolvedIncidentDetails
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    @Nonnull
    public IncidentSummaryDetailsArray getResolvedIncidentDetails() {
        if (_resolvedIncidentDetailsField!= null) {
            return _resolvedIncidentDetailsField;
        } else {
            Object __rawValue = super._map.get("resolvedIncidentDetails");
            if (__rawValue == null) {
                return DEFAULT_ResolvedIncidentDetails;
            }
            _resolvedIncidentDetailsField = ((__rawValue == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _resolvedIncidentDetailsField;
        }
    }

    /**
     * Setter for resolvedIncidentDetails
     * 
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    public IncidentsSummary setResolvedIncidentDetails(
        @Nullable
        IncidentSummaryDetailsArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResolvedIncidentDetails(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resolvedIncidentDetails of com.linkedin.common.IncidentsSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidentDetails", value.data());
                    _resolvedIncidentDetailsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResolvedIncidentDetails();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidentDetails", value.data());
                    _resolvedIncidentDetailsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedIncidentDetails", value.data());
                    _resolvedIncidentDetailsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resolvedIncidentDetails
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentsSummary.Fields#resolvedIncidentDetails
     */
    public IncidentsSummary setResolvedIncidentDetails(
        @Nonnull
        IncidentSummaryDetailsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resolvedIncidentDetails of com.linkedin.common.IncidentsSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resolvedIncidentDetails", value.data());
            _resolvedIncidentDetailsField = value;
        }
        return this;
    }

    /**
     * Existence checker for activeIncidentDetails
     * 
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    public boolean hasActiveIncidentDetails() {
        if (_activeIncidentDetailsField!= null) {
            return true;
        }
        return super._map.containsKey("activeIncidentDetails");
    }

    /**
     * Remover for activeIncidentDetails
     * 
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    public void removeActiveIncidentDetails() {
        super._map.remove("activeIncidentDetails");
    }

    /**
     * Getter for activeIncidentDetails
     * 
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    @Nullable
    public IncidentSummaryDetailsArray getActiveIncidentDetails(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getActiveIncidentDetails();
            case NULL:
                if (_activeIncidentDetailsField!= null) {
                    return _activeIncidentDetailsField;
                } else {
                    Object __rawValue = super._map.get("activeIncidentDetails");
                    _activeIncidentDetailsField = ((__rawValue == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _activeIncidentDetailsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for activeIncidentDetails
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    @Nonnull
    public IncidentSummaryDetailsArray getActiveIncidentDetails() {
        if (_activeIncidentDetailsField!= null) {
            return _activeIncidentDetailsField;
        } else {
            Object __rawValue = super._map.get("activeIncidentDetails");
            if (__rawValue == null) {
                return DEFAULT_ActiveIncidentDetails;
            }
            _activeIncidentDetailsField = ((__rawValue == null)?null:new IncidentSummaryDetailsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _activeIncidentDetailsField;
        }
    }

    /**
     * Setter for activeIncidentDetails
     * 
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    public IncidentsSummary setActiveIncidentDetails(
        @Nullable
        IncidentSummaryDetailsArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActiveIncidentDetails(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field activeIncidentDetails of com.linkedin.common.IncidentsSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidentDetails", value.data());
                    _activeIncidentDetailsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActiveIncidentDetails();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidentDetails", value.data());
                    _activeIncidentDetailsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "activeIncidentDetails", value.data());
                    _activeIncidentDetailsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for activeIncidentDetails
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentsSummary.Fields#activeIncidentDetails
     */
    public IncidentsSummary setActiveIncidentDetails(
        @Nonnull
        IncidentSummaryDetailsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field activeIncidentDetails of com.linkedin.common.IncidentsSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "activeIncidentDetails", value.data());
            _activeIncidentDetailsField = value;
        }
        return this;
    }

    @Override
    public IncidentsSummary clone()
        throws CloneNotSupportedException
    {
        IncidentsSummary __clone = ((IncidentsSummary) super.clone());
        __clone.__changeListener = new IncidentsSummary.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentsSummary copy()
        throws CloneNotSupportedException
    {
        IncidentsSummary __copy = ((IncidentsSummary) super.copy());
        __copy._resolvedIncidentsField = null;
        __copy._activeIncidentsField = null;
        __copy._resolvedIncidentDetailsField = null;
        __copy._activeIncidentDetailsField = null;
        __copy.__changeListener = new IncidentsSummary.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentsSummary __objectRef;

        private ChangeListener(IncidentsSummary reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "resolvedIncidents":
                    __objectRef._resolvedIncidentsField = null;
                    break;
                case "activeIncidents":
                    __objectRef._activeIncidentsField = null;
                    break;
                case "resolvedIncidentDetails":
                    __objectRef._resolvedIncidentDetailsField = null;
                    break;
                case "activeIncidentDetails":
                    __objectRef._activeIncidentDetailsField = null;
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
         * Resolved incidents for an asset
         * Deprecated! Use the richer resolvedIncidentsDetails instead.
         * 
         */
        @Deprecated
        public PathSpec resolvedIncidents() {
            return new PathSpec(getPathComponents(), "resolvedIncidents");
        }

        /**
         * Resolved incidents for an asset
         * Deprecated! Use the richer resolvedIncidentsDetails instead.
         * 
         */
        @Deprecated
        public PathSpec resolvedIncidents(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "resolvedIncidents");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Active incidents for an asset
         * Deprecated! Use the richer activeIncidentsDetails instead.
         * 
         */
        @Deprecated
        public PathSpec activeIncidents() {
            return new PathSpec(getPathComponents(), "activeIncidents");
        }

        /**
         * Active incidents for an asset
         * Deprecated! Use the richer activeIncidentsDetails instead.
         * 
         */
        @Deprecated
        public PathSpec activeIncidents(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "activeIncidents");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public com.linkedin.common.IncidentSummaryDetailsArray.Fields resolvedIncidentDetails() {
            return new com.linkedin.common.IncidentSummaryDetailsArray.Fields(getPathComponents(), "resolvedIncidentDetails");
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public PathSpec resolvedIncidentDetails(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "resolvedIncidentDetails");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public com.linkedin.common.IncidentSummaryDetailsArray.Fields activeIncidentDetails() {
            return new com.linkedin.common.IncidentSummaryDetailsArray.Fields(getPathComponents(), "activeIncidentDetails");
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public PathSpec activeIncidentDetails(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "activeIncidentDetails");
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

        private com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask _resolvedIncidentDetailsMask;
        private com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask _activeIncidentDetailsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Resolved incidents for an asset
         * Deprecated! Use the richer resolvedIncidentsDetails instead.
         * 
         */
        @Deprecated
        public IncidentsSummary.ProjectionMask withResolvedIncidents() {
            getDataMap().put("resolvedIncidents", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Resolved incidents for an asset
         * Deprecated! Use the richer resolvedIncidentsDetails instead.
         * 
         */
        @Deprecated
        public IncidentsSummary.ProjectionMask withResolvedIncidents(Integer start, Integer count) {
            getDataMap().put("resolvedIncidents", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("resolvedIncidents").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("resolvedIncidents").put("$count", count);
            }
            return this;
        }

        /**
         * Active incidents for an asset
         * Deprecated! Use the richer activeIncidentsDetails instead.
         * 
         */
        @Deprecated
        public IncidentsSummary.ProjectionMask withActiveIncidents() {
            getDataMap().put("activeIncidents", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Active incidents for an asset
         * Deprecated! Use the richer activeIncidentsDetails instead.
         * 
         */
        @Deprecated
        public IncidentsSummary.ProjectionMask withActiveIncidents(Integer start, Integer count) {
            getDataMap().put("activeIncidents", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("activeIncidents").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("activeIncidents").put("$count", count);
            }
            return this;
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withResolvedIncidentDetails(Function<com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask, com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask> nestedMask) {
            _resolvedIncidentDetailsMask = nestedMask.apply(((_resolvedIncidentDetailsMask == null)?IncidentSummaryDetailsArray.createMask():_resolvedIncidentDetailsMask));
            getDataMap().put("resolvedIncidentDetails", _resolvedIncidentDetailsMask.getDataMap());
            return this;
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withResolvedIncidentDetails() {
            _resolvedIncidentDetailsMask = null;
            getDataMap().put("resolvedIncidentDetails", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withResolvedIncidentDetails(Function<com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask, com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _resolvedIncidentDetailsMask = nestedMask.apply(((_resolvedIncidentDetailsMask == null)?IncidentSummaryDetailsArray.createMask():_resolvedIncidentDetailsMask));
            getDataMap().put("resolvedIncidentDetails", _resolvedIncidentDetailsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("resolvedIncidentDetails").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("resolvedIncidentDetails").put("$count", count);
            }
            return this;
        }

        /**
         * Summary details about the set of resolved incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withResolvedIncidentDetails(Integer start, Integer count) {
            _resolvedIncidentDetailsMask = null;
            getDataMap().put("resolvedIncidentDetails", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("resolvedIncidentDetails").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("resolvedIncidentDetails").put("$count", count);
            }
            return this;
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withActiveIncidentDetails(Function<com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask, com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask> nestedMask) {
            _activeIncidentDetailsMask = nestedMask.apply(((_activeIncidentDetailsMask == null)?IncidentSummaryDetailsArray.createMask():_activeIncidentDetailsMask));
            getDataMap().put("activeIncidentDetails", _activeIncidentDetailsMask.getDataMap());
            return this;
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withActiveIncidentDetails() {
            _activeIncidentDetailsMask = null;
            getDataMap().put("activeIncidentDetails", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withActiveIncidentDetails(Function<com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask, com.linkedin.common.IncidentSummaryDetailsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _activeIncidentDetailsMask = nestedMask.apply(((_activeIncidentDetailsMask == null)?IncidentSummaryDetailsArray.createMask():_activeIncidentDetailsMask));
            getDataMap().put("activeIncidentDetails", _activeIncidentDetailsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("activeIncidentDetails").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("activeIncidentDetails").put("$count", count);
            }
            return this;
        }

        /**
         * Summary details about the set of active incidents
         * 
         */
        public IncidentsSummary.ProjectionMask withActiveIncidentDetails(Integer start, Integer count) {
            _activeIncidentDetailsMask = null;
            getDataMap().put("activeIncidentDetails", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("activeIncidentDetails").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("activeIncidentDetails").put("$count", count);
            }
            return this;
        }

    }

}
