
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Related business terms information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/GlossaryTerms.pdl.")
public class GlossaryTerms
    extends RecordTemplate
{

    private final static GlossaryTerms.Fields _fields = new GlossaryTerms.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}", SchemaFormatType.PDL));
    private GlossaryTermAssociationArray _termsField = null;
    private AuditStamp _auditStampField = null;
    private GlossaryTerms.ChangeListener __changeListener = new GlossaryTerms.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Terms = SCHEMA.getField("terms");
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");

    public GlossaryTerms() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public GlossaryTerms(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryTerms.Fields fields() {
        return _fields;
    }

    public static GlossaryTerms.ProjectionMask createMask() {
        return new GlossaryTerms.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public boolean hasTerms() {
        if (_termsField!= null) {
            return true;
        }
        return super._map.containsKey("terms");
    }

    /**
     * Remover for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public void removeTerms() {
        super._map.remove("terms");
    }

    /**
     * Getter for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    @Nullable
    public GlossaryTermAssociationArray getTerms(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTerms();
            case DEFAULT:
            case NULL:
                if (_termsField!= null) {
                    return _termsField;
                } else {
                    Object __rawValue = super._map.get("terms");
                    _termsField = ((__rawValue == null)?null:new GlossaryTermAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _termsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for terms
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTerms.Fields#terms
     */
    @Nonnull
    public GlossaryTermAssociationArray getTerms() {
        if (_termsField!= null) {
            return _termsField;
        } else {
            Object __rawValue = super._map.get("terms");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("terms");
            }
            _termsField = ((__rawValue == null)?null:new GlossaryTermAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _termsField;
        }
    }

    /**
     * Setter for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public GlossaryTerms setTerms(
        @Nullable
        GlossaryTermAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTerms(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field terms of com.linkedin.common.GlossaryTerms");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "terms", value.data());
                    _termsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTerms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "terms", value.data());
                    _termsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "terms", value.data());
                    _termsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for terms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTerms.Fields#terms
     */
    public GlossaryTerms setTerms(
        @Nonnull
        GlossaryTermAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field terms of com.linkedin.common.GlossaryTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "terms", value.data());
            _termsField = value;
        }
        return this;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
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
     * @see GlossaryTerms.Fields#auditStamp
     */
    public void removeAuditStamp() {
        super._map.remove("auditStamp");
    }

    /**
     * Getter for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
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
     * @see GlossaryTerms.Fields#auditStamp
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
     * @see GlossaryTerms.Fields#auditStamp
     */
    public GlossaryTerms setAuditStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field auditStamp of com.linkedin.common.GlossaryTerms");
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
     * @see GlossaryTerms.Fields#auditStamp
     */
    public GlossaryTerms setAuditStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditStamp of com.linkedin.common.GlossaryTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
            _auditStampField = value;
        }
        return this;
    }

    @Override
    public GlossaryTerms clone()
        throws CloneNotSupportedException
    {
        GlossaryTerms __clone = ((GlossaryTerms) super.clone());
        __clone.__changeListener = new GlossaryTerms.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryTerms copy()
        throws CloneNotSupportedException
    {
        GlossaryTerms __copy = ((GlossaryTerms) super.copy());
        __copy._auditStampField = null;
        __copy._termsField = null;
        __copy.__changeListener = new GlossaryTerms.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryTerms __objectRef;

        private ChangeListener(GlossaryTerms reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditStamp":
                    __objectRef._auditStampField = null;
                    break;
                case "terms":
                    __objectRef._termsField = null;
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
         * The related business terms
         * 
         */
        public com.linkedin.common.GlossaryTermAssociationArray.Fields terms() {
            return new com.linkedin.common.GlossaryTermAssociationArray.Fields(getPathComponents(), "terms");
        }

        /**
         * The related business terms
         * 
         */
        public PathSpec terms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "terms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Audit stamp containing who reported the related business term
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.GlossaryTermAssociationArray.ProjectionMask _termsMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _auditStampMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The related business terms
         * 
         */
        public GlossaryTerms.ProjectionMask withTerms(Function<com.linkedin.common.GlossaryTermAssociationArray.ProjectionMask, com.linkedin.common.GlossaryTermAssociationArray.ProjectionMask> nestedMask) {
            _termsMask = nestedMask.apply(((_termsMask == null)?GlossaryTermAssociationArray.createMask():_termsMask));
            getDataMap().put("terms", _termsMask.getDataMap());
            return this;
        }

        /**
         * The related business terms
         * 
         */
        public GlossaryTerms.ProjectionMask withTerms() {
            _termsMask = null;
            getDataMap().put("terms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The related business terms
         * 
         */
        public GlossaryTerms.ProjectionMask withTerms(Function<com.linkedin.common.GlossaryTermAssociationArray.ProjectionMask, com.linkedin.common.GlossaryTermAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _termsMask = nestedMask.apply(((_termsMask == null)?GlossaryTermAssociationArray.createMask():_termsMask));
            getDataMap().put("terms", _termsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("terms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("terms").put("$count", count);
            }
            return this;
        }

        /**
         * The related business terms
         * 
         */
        public GlossaryTerms.ProjectionMask withTerms(Integer start, Integer count) {
            _termsMask = null;
            getDataMap().put("terms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("terms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("terms").put("$count", count);
            }
            return this;
        }

        /**
         * Audit stamp containing who reported the related business term
         * 
         */
        public GlossaryTerms.ProjectionMask withAuditStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditStampMask = nestedMask.apply(((_auditStampMask == null)?AuditStamp.createMask():_auditStampMask));
            getDataMap().put("auditStamp", _auditStampMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the related business term
         * 
         */
        public GlossaryTerms.ProjectionMask withAuditStamp(MaskMap nestedMask) {
            getDataMap().put("auditStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the related business term
         * 
         */
        public GlossaryTerms.ProjectionMask withAuditStamp() {
            _auditStampMask = null;
            getDataMap().put("auditStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
