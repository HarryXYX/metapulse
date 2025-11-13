
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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


/**
 * Properties of an applied glossary term.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlossaryTermAssociation.pdl.")
public class GlossaryTermAssociation
    extends RecordTemplate
{

    private final static GlossaryTermAssociation.Fields _fields = new GlossaryTermAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.GlossaryTermUrn _urnField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private String _contextField = null;
    private MetadataAttribution _attributionField = null;
    private GlossaryTermAssociation.ChangeListener __changeListener = new GlossaryTermAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");
    private final static RecordDataSchema.Field FIELD_Context = SCHEMA.getField("context");
    private final static RecordDataSchema.Field FIELD_Attribution = SCHEMA.getField("attribution");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public GlossaryTermAssociation() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GlossaryTermAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryTermAssociation.Fields fields() {
        return _fields;
    }

    public static GlossaryTermAssociation.ProjectionMask createMask() {
        return new GlossaryTermAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryTermUrn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.GlossaryTermUrn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermAssociation.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryTermUrn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.GlossaryTermUrn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public GlossaryTermAssociation setUrn(
        @Nullable
        com.linkedin.common.urn.GlossaryTermUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.common.GlossaryTermAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryTermUrn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryTermUrn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryTermUrn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermAssociation.Fields#urn
     */
    public GlossaryTermAssociation setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryTermUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.common.GlossaryTermAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryTermUrn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see GlossaryTermAssociation.Fields#actor
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
     * @see GlossaryTermAssociation.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see GlossaryTermAssociation.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        return getActor();
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermAssociation.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see GlossaryTermAssociation.Fields#actor
     */
    public GlossaryTermAssociation setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see GlossaryTermAssociation.Fields#actor
     */
    public GlossaryTermAssociation setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.common.GlossaryTermAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    /**
     * Existence checker for context
     * 
     * @see GlossaryTermAssociation.Fields#context
     */
    public boolean hasContext() {
        if (_contextField!= null) {
            return true;
        }
        return super._map.containsKey("context");
    }

    /**
     * Remover for context
     * 
     * @see GlossaryTermAssociation.Fields#context
     */
    public void removeContext() {
        super._map.remove("context");
    }

    /**
     * Getter for context
     * 
     * @see GlossaryTermAssociation.Fields#context
     */
    @Nullable
    public String getContext(GetMode mode) {
        return getContext();
    }

    /**
     * Getter for context
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermAssociation.Fields#context
     */
    @Nullable
    public String getContext() {
        if (_contextField!= null) {
            return _contextField;
        } else {
            Object __rawValue = super._map.get("context");
            _contextField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contextField;
        }
    }

    /**
     * Setter for context
     * 
     * @see GlossaryTermAssociation.Fields#context
     */
    public GlossaryTermAssociation setContext(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "context", value);
                    _contextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "context", value);
                    _contextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for context
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermAssociation.Fields#context
     */
    public GlossaryTermAssociation setContext(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field context of com.linkedin.common.GlossaryTermAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "context", value);
            _contextField = value;
        }
        return this;
    }

    /**
     * Existence checker for attribution
     * 
     * @see GlossaryTermAssociation.Fields#attribution
     */
    public boolean hasAttribution() {
        if (_attributionField!= null) {
            return true;
        }
        return super._map.containsKey("attribution");
    }

    /**
     * Remover for attribution
     * 
     * @see GlossaryTermAssociation.Fields#attribution
     */
    public void removeAttribution() {
        super._map.remove("attribution");
    }

    /**
     * Getter for attribution
     * 
     * @see GlossaryTermAssociation.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution(GetMode mode) {
        return getAttribution();
    }

    /**
     * Getter for attribution
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermAssociation.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution() {
        if (_attributionField!= null) {
            return _attributionField;
        } else {
            Object __rawValue = super._map.get("attribution");
            _attributionField = ((__rawValue == null)?null:new MetadataAttribution(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _attributionField;
        }
    }

    /**
     * Setter for attribution
     * 
     * @see GlossaryTermAssociation.Fields#attribution
     */
    public GlossaryTermAssociation setAttribution(
        @Nullable
        MetadataAttribution value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAttribution(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAttribution();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for attribution
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermAssociation.Fields#attribution
     */
    public GlossaryTermAssociation setAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field attribution of com.linkedin.common.GlossaryTermAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
            _attributionField = value;
        }
        return this;
    }

    @Override
    public GlossaryTermAssociation clone()
        throws CloneNotSupportedException
    {
        GlossaryTermAssociation __clone = ((GlossaryTermAssociation) super.clone());
        __clone.__changeListener = new GlossaryTermAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryTermAssociation copy()
        throws CloneNotSupportedException
    {
        GlossaryTermAssociation __copy = ((GlossaryTermAssociation) super.copy());
        __copy._urnField = null;
        __copy._actorField = null;
        __copy._contextField = null;
        __copy._attributionField = null;
        __copy.__changeListener = new GlossaryTermAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryTermAssociation __objectRef;

        private ChangeListener(GlossaryTermAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "context":
                    __objectRef._contextField = null;
                    break;
                case "attribution":
                    __objectRef._attributionField = null;
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
         * Urn of the applied glossary term
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The user URN which will be credited for adding associating this term to the entity
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

        /**
         * Additional context about the association
         * 
         */
        public PathSpec context() {
            return new PathSpec(getPathComponents(), "context");
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public com.linkedin.common.MetadataAttribution.Fields attribution() {
            return new com.linkedin.common.MetadataAttribution.Fields(getPathComponents(), "attribution");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.MetadataAttribution.ProjectionMask _attributionMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Urn of the applied glossary term
         * 
         */
        public GlossaryTermAssociation.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The user URN which will be credited for adding associating this term to the entity
         * 
         */
        public GlossaryTermAssociation.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context about the association
         * 
         */
        public GlossaryTermAssociation.ProjectionMask withContext() {
            getDataMap().put("context", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public GlossaryTermAssociation.ProjectionMask withAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _attributionMask = nestedMask.apply(((_attributionMask == null)?MetadataAttribution.createMask():_attributionMask));
            getDataMap().put("attribution", _attributionMask.getDataMap());
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public GlossaryTermAssociation.ProjectionMask withAttribution() {
            _attributionMask = null;
            getDataMap().put("attribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
