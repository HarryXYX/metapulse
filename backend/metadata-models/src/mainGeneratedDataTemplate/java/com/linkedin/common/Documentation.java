
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
 * Aspect used for storing all applicable documentations on assets.
 * This aspect supports multiple documentations from different sources.
 * There is an implicit assumption that there is only one documentation per
 *    source.
 * For example, if there are two documentations from the same source, the
 *    latest one will overwrite the previous one.
 * If there are two documentations from different sources, both will be
 *    stored.
 * Future evolution considerations:
 * The first entity that uses this aspect is Schema Field. We will expand this
 *     aspect to other entities eventually.
 * The values of the documentation are not currently searchable. This will be
 *     changed once this aspect develops opinion on which documentation entry is
 *     the authoritative one.
 * Ensuring that there is only one documentation per source is a business
 *     rule that is not enforced by the aspect yet. This will currently be enforced by the
 *     application that uses this aspect. We will eventually enforce this rule in
 *     the aspect using AspectMutators.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Documentation.pdl.")
public class Documentation
    extends RecordTemplate
{

    private final static Documentation.Fields _fields = new Documentation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Aspect used for storing all applicable documentations on assets.\nThis aspect supports multiple documentations from different sources.\nThere is an implicit assumption that there is only one documentation per\n   source.\nFor example, if there are two documentations from the same source, the\n   latest one will overwrite the previous one.\nIf there are two documentations from different sources, both will be\n   stored.\nFuture evolution considerations:\nThe first entity that uses this aspect is Schema Field. We will expand this\n    aspect to other entities eventually.\nThe values of the documentation are not currently searchable. This will be\n    changed once this aspect develops opinion on which documentation entry is\n    the authoritative one.\nEnsuring that there is only one documentation per source is a business\n    rule that is not enforced by the aspect yet. This will currently be enforced by the\n    application that uses this aspect. We will eventually enforce this rule in\n    the aspect using AspectMutators.*/@Aspect.name=\"documentation\"record Documentation{/**Documentations associated with this asset. We could be receiving docs from different sources*/documentations:array[/**Properties of applied documentation including the attribution of the doc*/record DocumentationAssociation{/**Description of this asset*/documentation:string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"documentationAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"documentationAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"documentationAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}", SchemaFormatType.PDL));
    private DocumentationAssociationArray _documentationsField = null;
    private Documentation.ChangeListener __changeListener = new Documentation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Documentations = SCHEMA.getField("documentations");

    public Documentation() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Documentation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Documentation.Fields fields() {
        return _fields;
    }

    public static Documentation.ProjectionMask createMask() {
        return new Documentation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for documentations
     * 
     * @see Documentation.Fields#documentations
     */
    public boolean hasDocumentations() {
        if (_documentationsField!= null) {
            return true;
        }
        return super._map.containsKey("documentations");
    }

    /**
     * Remover for documentations
     * 
     * @see Documentation.Fields#documentations
     */
    public void removeDocumentations() {
        super._map.remove("documentations");
    }

    /**
     * Getter for documentations
     * 
     * @see Documentation.Fields#documentations
     */
    @Nullable
    public DocumentationAssociationArray getDocumentations(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDocumentations();
            case DEFAULT:
            case NULL:
                if (_documentationsField!= null) {
                    return _documentationsField;
                } else {
                    Object __rawValue = super._map.get("documentations");
                    _documentationsField = ((__rawValue == null)?null:new DocumentationAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _documentationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for documentations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Documentation.Fields#documentations
     */
    @Nonnull
    public DocumentationAssociationArray getDocumentations() {
        if (_documentationsField!= null) {
            return _documentationsField;
        } else {
            Object __rawValue = super._map.get("documentations");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("documentations");
            }
            _documentationsField = ((__rawValue == null)?null:new DocumentationAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _documentationsField;
        }
    }

    /**
     * Setter for documentations
     * 
     * @see Documentation.Fields#documentations
     */
    public Documentation setDocumentations(
        @Nullable
        DocumentationAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocumentations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field documentations of com.linkedin.common.Documentation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentations", value.data());
                    _documentationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDocumentations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentations", value.data());
                    _documentationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "documentations", value.data());
                    _documentationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for documentations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Documentation.Fields#documentations
     */
    public Documentation setDocumentations(
        @Nonnull
        DocumentationAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field documentations of com.linkedin.common.Documentation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "documentations", value.data());
            _documentationsField = value;
        }
        return this;
    }

    @Override
    public Documentation clone()
        throws CloneNotSupportedException
    {
        Documentation __clone = ((Documentation) super.clone());
        __clone.__changeListener = new Documentation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Documentation copy()
        throws CloneNotSupportedException
    {
        Documentation __copy = ((Documentation) super.copy());
        __copy._documentationsField = null;
        __copy.__changeListener = new Documentation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Documentation __objectRef;

        private ChangeListener(Documentation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "documentations":
                    __objectRef._documentationsField = null;
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
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public com.linkedin.common.DocumentationAssociationArray.Fields documentations() {
            return new com.linkedin.common.DocumentationAssociationArray.Fields(getPathComponents(), "documentations");
        }

        /**
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public PathSpec documentations(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "documentations");
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

        private com.linkedin.common.DocumentationAssociationArray.ProjectionMask _documentationsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public Documentation.ProjectionMask withDocumentations(Function<com.linkedin.common.DocumentationAssociationArray.ProjectionMask, com.linkedin.common.DocumentationAssociationArray.ProjectionMask> nestedMask) {
            _documentationsMask = nestedMask.apply(((_documentationsMask == null)?DocumentationAssociationArray.createMask():_documentationsMask));
            getDataMap().put("documentations", _documentationsMask.getDataMap());
            return this;
        }

        /**
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public Documentation.ProjectionMask withDocumentations() {
            _documentationsMask = null;
            getDataMap().put("documentations", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public Documentation.ProjectionMask withDocumentations(Function<com.linkedin.common.DocumentationAssociationArray.ProjectionMask, com.linkedin.common.DocumentationAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _documentationsMask = nestedMask.apply(((_documentationsMask == null)?DocumentationAssociationArray.createMask():_documentationsMask));
            getDataMap().put("documentations", _documentationsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("documentations").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("documentations").put("$count", count);
            }
            return this;
        }

        /**
         * Documentations associated with this asset. We could be receiving docs from different sources
         * 
         */
        public Documentation.ProjectionMask withDocumentations(Integer start, Integer count) {
            _documentationsMask = null;
            getDataMap().put("documentations", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("documentations").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("documentations").put("$count", count);
            }
            return this;
        }

    }

}
