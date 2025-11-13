
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
import com.linkedin.schema.SchemaField;


/**
 * Information about a field a chart or dashboard references
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InputField.pdl.")
public class InputField
    extends RecordTemplate
{

    private final static InputField.Fields _fields = new InputField.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about a field a chart or dashboard references*/record InputField{/**Urn of the schema being referenced for lineage purposes*/@Relationship={\"entityTypes\":[\"schemaField\"],\"name\":\"consumesField\"}schemaFieldUrn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Copied version of the referenced schema field object for indexing purposes*/schemaField:optional{namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _schemaFieldUrnField = null;
    private SchemaField _schemaFieldField = null;
    private InputField.ChangeListener __changeListener = new InputField.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SchemaFieldUrn = SCHEMA.getField("schemaFieldUrn");
    private final static RecordDataSchema.Field FIELD_SchemaField = SCHEMA.getField("schemaField");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public InputField() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public InputField(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static InputField.Fields fields() {
        return _fields;
    }

    public static InputField.ProjectionMask createMask() {
        return new InputField.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schemaFieldUrn
     * 
     * @see InputField.Fields#schemaFieldUrn
     */
    public boolean hasSchemaFieldUrn() {
        if (_schemaFieldUrnField!= null) {
            return true;
        }
        return super._map.containsKey("schemaFieldUrn");
    }

    /**
     * Remover for schemaFieldUrn
     * 
     * @see InputField.Fields#schemaFieldUrn
     */
    public void removeSchemaFieldUrn() {
        super._map.remove("schemaFieldUrn");
    }

    /**
     * Getter for schemaFieldUrn
     * 
     * @see InputField.Fields#schemaFieldUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSchemaFieldUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchemaFieldUrn();
            case DEFAULT:
            case NULL:
                if (_schemaFieldUrnField!= null) {
                    return _schemaFieldUrnField;
                } else {
                    Object __rawValue = super._map.get("schemaFieldUrn");
                    _schemaFieldUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _schemaFieldUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schemaFieldUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InputField.Fields#schemaFieldUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSchemaFieldUrn() {
        if (_schemaFieldUrnField!= null) {
            return _schemaFieldUrnField;
        } else {
            Object __rawValue = super._map.get("schemaFieldUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schemaFieldUrn");
            }
            _schemaFieldUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _schemaFieldUrnField;
        }
    }

    /**
     * Setter for schemaFieldUrn
     * 
     * @see InputField.Fields#schemaFieldUrn
     */
    public InputField setSchemaFieldUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaFieldUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schemaFieldUrn of com.linkedin.common.InputField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaFieldUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _schemaFieldUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaFieldUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaFieldUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _schemaFieldUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaFieldUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _schemaFieldUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaFieldUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InputField.Fields#schemaFieldUrn
     */
    public InputField setSchemaFieldUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaFieldUrn of com.linkedin.common.InputField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaFieldUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _schemaFieldUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaField
     * 
     * @see InputField.Fields#schemaField
     */
    public boolean hasSchemaField() {
        if (_schemaFieldField!= null) {
            return true;
        }
        return super._map.containsKey("schemaField");
    }

    /**
     * Remover for schemaField
     * 
     * @see InputField.Fields#schemaField
     */
    public void removeSchemaField() {
        super._map.remove("schemaField");
    }

    /**
     * Getter for schemaField
     * 
     * @see InputField.Fields#schemaField
     */
    @Nullable
    public SchemaField getSchemaField(GetMode mode) {
        return getSchemaField();
    }

    /**
     * Getter for schemaField
     * 
     * @return
     *     Optional field. Always check for null.
     * @see InputField.Fields#schemaField
     */
    @Nullable
    public SchemaField getSchemaField() {
        if (_schemaFieldField!= null) {
            return _schemaFieldField;
        } else {
            Object __rawValue = super._map.get("schemaField");
            _schemaFieldField = ((__rawValue == null)?null:new SchemaField(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _schemaFieldField;
        }
    }

    /**
     * Setter for schemaField
     * 
     * @see InputField.Fields#schemaField
     */
    public InputField setSchemaField(
        @Nullable
        SchemaField value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaField(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaField", value.data());
                    _schemaFieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaField", value.data());
                    _schemaFieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InputField.Fields#schemaField
     */
    public InputField setSchemaField(
        @Nonnull
        SchemaField value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaField of com.linkedin.common.InputField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaField", value.data());
            _schemaFieldField = value;
        }
        return this;
    }

    @Override
    public InputField clone()
        throws CloneNotSupportedException
    {
        InputField __clone = ((InputField) super.clone());
        __clone.__changeListener = new InputField.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public InputField copy()
        throws CloneNotSupportedException
    {
        InputField __copy = ((InputField) super.copy());
        __copy._schemaFieldField = null;
        __copy._schemaFieldUrnField = null;
        __copy.__changeListener = new InputField.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final InputField __objectRef;

        private ChangeListener(InputField reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schemaField":
                    __objectRef._schemaFieldField = null;
                    break;
                case "schemaFieldUrn":
                    __objectRef._schemaFieldUrnField = null;
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
         * Urn of the schema being referenced for lineage purposes
         * 
         */
        public PathSpec schemaFieldUrn() {
            return new PathSpec(getPathComponents(), "schemaFieldUrn");
        }

        /**
         * Copied version of the referenced schema field object for indexing purposes
         * 
         */
        public com.linkedin.schema.SchemaField.Fields schemaField() {
            return new com.linkedin.schema.SchemaField.Fields(getPathComponents(), "schemaField");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaField.ProjectionMask _schemaFieldMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Urn of the schema being referenced for lineage purposes
         * 
         */
        public InputField.ProjectionMask withSchemaFieldUrn() {
            getDataMap().put("schemaFieldUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Copied version of the referenced schema field object for indexing purposes
         * 
         */
        public InputField.ProjectionMask withSchemaField(Function<com.linkedin.schema.SchemaField.ProjectionMask, com.linkedin.schema.SchemaField.ProjectionMask> nestedMask) {
            _schemaFieldMask = nestedMask.apply(((_schemaFieldMask == null)?SchemaField.createMask():_schemaFieldMask));
            getDataMap().put("schemaField", _schemaFieldMask.getDataMap());
            return this;
        }

        /**
         * Copied version of the referenced schema field object for indexing purposes
         * 
         */
        public InputField.ProjectionMask withSchemaField() {
            _schemaFieldMask = null;
            getDataMap().put("schemaField", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
