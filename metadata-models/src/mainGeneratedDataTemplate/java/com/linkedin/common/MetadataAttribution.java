
package com.linkedin.common;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about who, why, and how this metadata was applied
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/MetadataAttribution.pdl.")
public class MetadataAttribution
    extends RecordTemplate
{

    private final static MetadataAttribution.Fields _fields = new MetadataAttribution.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}", SchemaFormatType.PDL));
    private Long _timeField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private com.linkedin.common.urn.Urn _sourceField = null;
    private StringMap _sourceDetailField = null;
    private MetadataAttribution.ChangeListener __changeListener = new MetadataAttribution.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Time = SCHEMA.getField("time");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_SourceDetail = SCHEMA.getField("sourceDetail");
    private final static StringMap DEFAULT_SourceDetail;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_SourceDetail = ((FIELD_SourceDetail.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_SourceDetail.getDefault(), DataMap.class)));
    }

    public MetadataAttribution() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public MetadataAttribution(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MetadataAttribution.Fields fields() {
        return _fields;
    }

    public static MetadataAttribution.ProjectionMask createMask() {
        return new MetadataAttribution.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for time
     * 
     * @see MetadataAttribution.Fields#time
     */
    public boolean hasTime() {
        if (_timeField!= null) {
            return true;
        }
        return super._map.containsKey("time");
    }

    /**
     * Remover for time
     * 
     * @see MetadataAttribution.Fields#time
     */
    public void removeTime() {
        super._map.remove("time");
    }

    /**
     * Getter for time
     * 
     * @see MetadataAttribution.Fields#time
     */
    @Nullable
    public Long getTime(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTime();
            case DEFAULT:
            case NULL:
                if (_timeField!= null) {
                    return _timeField;
                } else {
                    Object __rawValue = super._map.get("time");
                    _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for time
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataAttribution.Fields#time
     */
    @Nonnull
    public Long getTime() {
        if (_timeField!= null) {
            return _timeField;
        } else {
            Object __rawValue = super._map.get("time");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("time");
            }
            _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timeField;
        }
    }

    /**
     * Setter for time
     * 
     * @see MetadataAttribution.Fields#time
     */
    public MetadataAttribution setTime(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field time of com.linkedin.common.MetadataAttribution");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataAttribution.Fields#time
     */
    public MetadataAttribution setTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field time of com.linkedin.common.MetadataAttribution to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
            _timeField = value;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @see MetadataAttribution.Fields#time
     */
    public MetadataAttribution setTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
        _timeField = value;
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see MetadataAttribution.Fields#actor
     */
    public boolean hasActor() {
        if (_actorField!= null) {
            return true;
        }
        return super._map.containsKey("actor");
    }

    /**
     * Remover for actor
     * 
     * @see MetadataAttribution.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see MetadataAttribution.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getActor();
            case DEFAULT:
            case NULL:
                if (_actorField!= null) {
                    return _actorField;
                } else {
                    Object __rawValue = super._map.get("actor");
                    _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _actorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataAttribution.Fields#actor
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("actor");
            }
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see MetadataAttribution.Fields#actor
     */
    public MetadataAttribution setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actor of com.linkedin.common.MetadataAttribution");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataAttribution.Fields#actor
     */
    public MetadataAttribution setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.common.MetadataAttribution to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see MetadataAttribution.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see MetadataAttribution.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see MetadataAttribution.Fields#source
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSource(GetMode mode) {
        return getSource();
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataAttribution.Fields#source
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            _sourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see MetadataAttribution.Fields#source
     */
    public MetadataAttribution setSource(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataAttribution.Fields#source
     */
    public MetadataAttribution setSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.common.MetadataAttribution to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceDetail
     * 
     * @see MetadataAttribution.Fields#sourceDetail
     */
    public boolean hasSourceDetail() {
        if (_sourceDetailField!= null) {
            return true;
        }
        return super._map.containsKey("sourceDetail");
    }

    /**
     * Remover for sourceDetail
     * 
     * @see MetadataAttribution.Fields#sourceDetail
     */
    public void removeSourceDetail() {
        super._map.remove("sourceDetail");
    }

    /**
     * Getter for sourceDetail
     * 
     * @see MetadataAttribution.Fields#sourceDetail
     */
    @Nullable
    public StringMap getSourceDetail(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getSourceDetail();
            case NULL:
                if (_sourceDetailField!= null) {
                    return _sourceDetailField;
                } else {
                    Object __rawValue = super._map.get("sourceDetail");
                    _sourceDetailField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _sourceDetailField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceDetail
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataAttribution.Fields#sourceDetail
     */
    @Nonnull
    public StringMap getSourceDetail() {
        if (_sourceDetailField!= null) {
            return _sourceDetailField;
        } else {
            Object __rawValue = super._map.get("sourceDetail");
            if (__rawValue == null) {
                return DEFAULT_SourceDetail;
            }
            _sourceDetailField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceDetailField;
        }
    }

    /**
     * Setter for sourceDetail
     * 
     * @see MetadataAttribution.Fields#sourceDetail
     */
    public MetadataAttribution setSourceDetail(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceDetail(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceDetail of com.linkedin.common.MetadataAttribution");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceDetail", value.data());
                    _sourceDetailField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceDetail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceDetail", value.data());
                    _sourceDetailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceDetail", value.data());
                    _sourceDetailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceDetail
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataAttribution.Fields#sourceDetail
     */
    public MetadataAttribution setSourceDetail(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceDetail of com.linkedin.common.MetadataAttribution to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceDetail", value.data());
            _sourceDetailField = value;
        }
        return this;
    }

    @Override
    public MetadataAttribution clone()
        throws CloneNotSupportedException
    {
        MetadataAttribution __clone = ((MetadataAttribution) super.clone());
        __clone.__changeListener = new MetadataAttribution.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MetadataAttribution copy()
        throws CloneNotSupportedException
    {
        MetadataAttribution __copy = ((MetadataAttribution) super.copy());
        __copy._actorField = null;
        __copy._sourceDetailField = null;
        __copy._timeField = null;
        __copy._sourceField = null;
        __copy.__changeListener = new MetadataAttribution.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MetadataAttribution __objectRef;

        private ChangeListener(MetadataAttribution reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "sourceDetail":
                    __objectRef._sourceDetailField = null;
                    break;
                case "time":
                    __objectRef._timeField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
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
         * When this metadata was updated.
         * 
         */
        public PathSpec time() {
            return new PathSpec(getPathComponents(), "time");
        }

        /**
         * The entity (e.g. a member URN) responsible for applying the assocated metadata. This can
         * either be a user (in case of UI edits) or the datahub system for automation.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

        /**
         * The DataHub source responsible for applying the associated metadata. This will only be filled out
         * when a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.
         * 
         */
        public PathSpec source() {
            return new PathSpec(getPathComponents(), "source");
        }

        /**
         * The details associated with why this metadata was applied. For example, this could include
         * the actual regex rule, sql statement, ingestion pipeline ID, etc.
         * 
         */
        public PathSpec sourceDetail() {
            return new PathSpec(getPathComponents(), "sourceDetail");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * When this metadata was updated.
         * 
         */
        public MetadataAttribution.ProjectionMask withTime() {
            getDataMap().put("time", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity (e.g. a member URN) responsible for applying the assocated metadata. This can
         * either be a user (in case of UI edits) or the datahub system for automation.
         * 
         */
        public MetadataAttribution.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The DataHub source responsible for applying the associated metadata. This will only be filled out
         * when a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.
         * 
         */
        public MetadataAttribution.ProjectionMask withSource() {
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The details associated with why this metadata was applied. For example, this could include
         * the actual regex rule, sql statement, ingestion pipeline ID, etc.
         * 
         */
        public MetadataAttribution.ProjectionMask withSourceDetail() {
            getDataMap().put("sourceDetail", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
