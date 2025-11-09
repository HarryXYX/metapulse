
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Properties of applied documentation including the attribution of the doc
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/DocumentationAssociation.pdl.")
public class DocumentationAssociation
    extends RecordTemplate
{

    private final static DocumentationAssociation.Fields _fields = new DocumentationAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of applied documentation including the attribution of the doc*/record DocumentationAssociation{/**Description of this asset*/documentation:string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"documentationAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"documentationAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"documentationAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}", SchemaFormatType.PDL));
    private String _documentationField = null;
    private MetadataAttribution _attributionField = null;
    private DocumentationAssociation.ChangeListener __changeListener = new DocumentationAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Documentation = SCHEMA.getField("documentation");
    private final static RecordDataSchema.Field FIELD_Attribution = SCHEMA.getField("attribution");

    public DocumentationAssociation() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DocumentationAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DocumentationAssociation.Fields fields() {
        return _fields;
    }

    public static DocumentationAssociation.ProjectionMask createMask() {
        return new DocumentationAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for documentation
     * 
     * @see DocumentationAssociation.Fields#documentation
     */
    public boolean hasDocumentation() {
        if (_documentationField!= null) {
            return true;
        }
        return super._map.containsKey("documentation");
    }

    /**
     * Remover for documentation
     * 
     * @see DocumentationAssociation.Fields#documentation
     */
    public void removeDocumentation() {
        super._map.remove("documentation");
    }

    /**
     * Getter for documentation
     * 
     * @see DocumentationAssociation.Fields#documentation
     */
    @Nullable
    public String getDocumentation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDocumentation();
            case DEFAULT:
            case NULL:
                if (_documentationField!= null) {
                    return _documentationField;
                } else {
                    Object __rawValue = super._map.get("documentation");
                    _documentationField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _documentationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for documentation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DocumentationAssociation.Fields#documentation
     */
    @Nonnull
    public String getDocumentation() {
        if (_documentationField!= null) {
            return _documentationField;
        } else {
            Object __rawValue = super._map.get("documentation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("documentation");
            }
            _documentationField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _documentationField;
        }
    }

    /**
     * Setter for documentation
     * 
     * @see DocumentationAssociation.Fields#documentation
     */
    public DocumentationAssociation setDocumentation(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocumentation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field documentation of com.linkedin.common.DocumentationAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentation", value);
                    _documentationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDocumentation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentation", value);
                    _documentationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "documentation", value);
                    _documentationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for documentation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DocumentationAssociation.Fields#documentation
     */
    public DocumentationAssociation setDocumentation(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field documentation of com.linkedin.common.DocumentationAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "documentation", value);
            _documentationField = value;
        }
        return this;
    }

    /**
     * Existence checker for attribution
     * 
     * @see DocumentationAssociation.Fields#attribution
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
     * @see DocumentationAssociation.Fields#attribution
     */
    public void removeAttribution() {
        super._map.remove("attribution");
    }

    /**
     * Getter for attribution
     * 
     * @see DocumentationAssociation.Fields#attribution
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
     * @see DocumentationAssociation.Fields#attribution
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
     * @see DocumentationAssociation.Fields#attribution
     */
    public DocumentationAssociation setAttribution(
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
     * @see DocumentationAssociation.Fields#attribution
     */
    public DocumentationAssociation setAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field attribution of com.linkedin.common.DocumentationAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
            _attributionField = value;
        }
        return this;
    }

    @Override
    public DocumentationAssociation clone()
        throws CloneNotSupportedException
    {
        DocumentationAssociation __clone = ((DocumentationAssociation) super.clone());
        __clone.__changeListener = new DocumentationAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DocumentationAssociation copy()
        throws CloneNotSupportedException
    {
        DocumentationAssociation __copy = ((DocumentationAssociation) super.copy());
        __copy._documentationField = null;
        __copy._attributionField = null;
        __copy.__changeListener = new DocumentationAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DocumentationAssociation __objectRef;

        private ChangeListener(DocumentationAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "documentation":
                    __objectRef._documentationField = null;
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
         * Description of this asset
         * 
         */
        public PathSpec documentation() {
            return new PathSpec(getPathComponents(), "documentation");
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
            super(3);
        }

        /**
         * Description of this asset
         * 
         */
        public DocumentationAssociation.ProjectionMask withDocumentation() {
            getDataMap().put("documentation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public DocumentationAssociation.ProjectionMask withAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _attributionMask = nestedMask.apply(((_attributionMask == null)?MetadataAttribution.createMask():_attributionMask));
            getDataMap().put("attribution", _attributionMask.getDataMap());
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public DocumentationAssociation.ProjectionMask withAttribution() {
            _attributionMask = null;
            getDataMap().put("attribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
