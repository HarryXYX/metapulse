
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.UnionTemplate;


/**
 * Base model representing field mappings
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/BaseFieldMapping.pdl.")
public class BaseFieldMapping
    extends RecordTemplate
{

    private final static BaseFieldMapping.Fields _fields = new BaseFieldMapping.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}", SchemaFormatType.PDL));
    private AuditStamp _createdField = null;
    private BaseFieldMapping.Transformation _transformationField = null;
    private BaseFieldMapping.ChangeListener __changeListener = new BaseFieldMapping.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_Transformation = SCHEMA.getField("transformation");

    public BaseFieldMapping() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public BaseFieldMapping(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BaseFieldMapping.Fields fields() {
        return _fields;
    }

    public static BaseFieldMapping.ProjectionMask createMask() {
        return new BaseFieldMapping.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for created
     * 
     * @see BaseFieldMapping.Fields#created
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
     * @see BaseFieldMapping.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see BaseFieldMapping.Fields#created
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
     * @see BaseFieldMapping.Fields#created
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
     * @see BaseFieldMapping.Fields#created
     */
    public BaseFieldMapping setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.common.BaseFieldMapping");
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
     * @see BaseFieldMapping.Fields#created
     */
    public BaseFieldMapping setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.common.BaseFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
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
     * @see BaseFieldMapping.Fields#transformation
     */
    public void removeTransformation() {
        super._map.remove("transformation");
    }

    /**
     * Getter for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    @Nullable
    public BaseFieldMapping.Transformation getTransformation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTransformation();
            case DEFAULT:
            case NULL:
                if (_transformationField!= null) {
                    return _transformationField;
                } else {
                    Object __rawValue = super._map.get("transformation");
                    _transformationField = ((__rawValue == null)?null:new BaseFieldMapping.Transformation(__rawValue));
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
     * @see BaseFieldMapping.Fields#transformation
     */
    @Nonnull
    public BaseFieldMapping.Transformation getTransformation() {
        if (_transformationField!= null) {
            return _transformationField;
        } else {
            Object __rawValue = super._map.get("transformation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("transformation");
            }
            _transformationField = ((__rawValue == null)?null:new BaseFieldMapping.Transformation(__rawValue));
            return _transformationField;
        }
    }

    /**
     * Setter for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    public BaseFieldMapping setTransformation(
        @Nullable
        BaseFieldMapping.Transformation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransformation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field transformation of com.linkedin.common.BaseFieldMapping");
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
     * @see BaseFieldMapping.Fields#transformation
     */
    public BaseFieldMapping setTransformation(
        @Nonnull
        BaseFieldMapping.Transformation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transformation of com.linkedin.common.BaseFieldMapping to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transformation", value.data());
            _transformationField = value;
        }
        return this;
    }

    @Override
    public BaseFieldMapping clone()
        throws CloneNotSupportedException
    {
        BaseFieldMapping __clone = ((BaseFieldMapping) super.clone());
        __clone.__changeListener = new BaseFieldMapping.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BaseFieldMapping copy()
        throws CloneNotSupportedException
    {
        BaseFieldMapping __copy = ((BaseFieldMapping) super.copy());
        __copy._createdField = null;
        __copy._transformationField = null;
        __copy.__changeListener = new BaseFieldMapping.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BaseFieldMapping __objectRef;

        private ChangeListener(BaseFieldMapping reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "transformation":
                    __objectRef._transformationField = null;
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

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask _transformationMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public BaseFieldMapping.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public BaseFieldMapping.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public BaseFieldMapping.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public BaseFieldMapping.ProjectionMask withTransformation(Function<com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask, com.linkedin.common.BaseFieldMapping.Transformation.ProjectionMask> nestedMask) {
            _transformationMask = nestedMask.apply(((_transformationMask == null)?BaseFieldMapping.Transformation.createMask():_transformationMask));
            getDataMap().put("transformation", _transformationMask.getDataMap());
            return this;
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public BaseFieldMapping.ProjectionMask withTransformation() {
            _transformationMask = null;
            getDataMap().put("transformation", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/BaseFieldMapping.pdl.")
    public static class Transformation
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]", SchemaFormatType.PDL));
        private com.linkedin.common.fieldtransformer.TransformationType _transformationTypeMember = null;
        private com.linkedin.common.fieldtransformer.UDFTransformer _uDFTransformerMember = null;
        private BaseFieldMapping.Transformation.ChangeListener __changeListener = new BaseFieldMapping.Transformation.ChangeListener(this);
        private final static DataSchema MEMBER_TransformationType = SCHEMA.getTypeByMemberKey("com.linkedin.common.fieldtransformer.TransformationType");
        public final static String MEMBERKEY_TransformationType = "com.linkedin.common.fieldtransformer.TransformationType";
        private final static DataSchema MEMBER_UDFTransformer = SCHEMA.getTypeByMemberKey("com.linkedin.common.fieldtransformer.UDFTransformer");
        public final static String MEMBERKEY_UDFTransformer = "com.linkedin.common.fieldtransformer.UDFTransformer";

        public Transformation() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public Transformation(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static BaseFieldMapping.Transformation create(com.linkedin.common.fieldtransformer.TransformationType value) {
            BaseFieldMapping.Transformation newUnion = new BaseFieldMapping.Transformation();
            newUnion.setTransformationType(value);
            return newUnion;
        }

        public boolean isTransformationType() {
            return memberIs("com.linkedin.common.fieldtransformer.TransformationType");
        }

        public com.linkedin.common.fieldtransformer.TransformationType getTransformationType() {
            checkNotNull();
            if (_transformationTypeMember!= null) {
                return _transformationTypeMember;
            }
            Object __rawValue = super._map.get("com.linkedin.common.fieldtransformer.TransformationType");
            _transformationTypeMember = DataTemplateUtil.coerceEnumOutput(__rawValue, com.linkedin.common.fieldtransformer.TransformationType.class, com.linkedin.common.fieldtransformer.TransformationType.$UNKNOWN);
            return _transformationTypeMember;
        }

        public void setTransformationType(com.linkedin.common.fieldtransformer.TransformationType value) {
            checkNotNull();
            super._map.clear();
            _transformationTypeMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.fieldtransformer.TransformationType", value.name());
        }

        public static BaseFieldMapping.Transformation create(com.linkedin.common.fieldtransformer.UDFTransformer value) {
            BaseFieldMapping.Transformation newUnion = new BaseFieldMapping.Transformation();
            newUnion.setUDFTransformer(value);
            return newUnion;
        }

        public boolean isUDFTransformer() {
            return memberIs("com.linkedin.common.fieldtransformer.UDFTransformer");
        }

        public com.linkedin.common.fieldtransformer.UDFTransformer getUDFTransformer() {
            checkNotNull();
            if (_uDFTransformerMember!= null) {
                return _uDFTransformerMember;
            }
            Object __rawValue = super._map.get("com.linkedin.common.fieldtransformer.UDFTransformer");
            _uDFTransformerMember = ((__rawValue == null)?null:new com.linkedin.common.fieldtransformer.UDFTransformer(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _uDFTransformerMember;
        }

        public void setUDFTransformer(com.linkedin.common.fieldtransformer.UDFTransformer value) {
            checkNotNull();
            super._map.clear();
            _uDFTransformerMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.fieldtransformer.UDFTransformer", value.data());
        }

        public static BaseFieldMapping.Transformation.ProjectionMask createMask() {
            return new BaseFieldMapping.Transformation.ProjectionMask();
        }

        @Override
        public BaseFieldMapping.Transformation clone()
            throws CloneNotSupportedException
        {
            BaseFieldMapping.Transformation __clone = ((BaseFieldMapping.Transformation) super.clone());
            __clone.__changeListener = new BaseFieldMapping.Transformation.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public BaseFieldMapping.Transformation copy()
            throws CloneNotSupportedException
        {
            BaseFieldMapping.Transformation __copy = ((BaseFieldMapping.Transformation) super.copy());
            __copy._uDFTransformerMember = null;
            __copy._transformationTypeMember = null;
            __copy.__changeListener = new BaseFieldMapping.Transformation.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
        {

            private final BaseFieldMapping.Transformation __objectRef;

            private ChangeListener(BaseFieldMapping.Transformation reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(String key, Object value) {
                switch (key) {
                    case "com.linkedin.common.fieldtransformer.UDFTransformer":
                        __objectRef._uDFTransformerMember = null;
                        break;
                    case "com.linkedin.common.fieldtransformer.TransformationType":
                        __objectRef._transformationTypeMember = null;
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

            public PathSpec TransformationType() {
                return new PathSpec(getPathComponents(), "com.linkedin.common.fieldtransformer.TransformationType");
            }

            public com.linkedin.common.fieldtransformer.UDFTransformer.Fields UDFTransformer() {
                return new com.linkedin.common.fieldtransformer.UDFTransformer.Fields(getPathComponents(), "com.linkedin.common.fieldtransformer.UDFTransformer");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {

            private com.linkedin.common.fieldtransformer.UDFTransformer.ProjectionMask _UDFTransformerMask;

            ProjectionMask() {
                super(3);
            }

            public BaseFieldMapping.Transformation.ProjectionMask withTransformationType() {
                getDataMap().put("com.linkedin.common.fieldtransformer.TransformationType", MaskMap.POSITIVE_MASK);
                return this;
            }

            public BaseFieldMapping.Transformation.ProjectionMask withUDFTransformer(Function<com.linkedin.common.fieldtransformer.UDFTransformer.ProjectionMask, com.linkedin.common.fieldtransformer.UDFTransformer.ProjectionMask> nestedMask) {
                _UDFTransformerMask = nestedMask.apply(((_UDFTransformerMask == null)?com.linkedin.common.fieldtransformer.UDFTransformer.createMask():_UDFTransformerMask));
                getDataMap().put("com.linkedin.common.fieldtransformer.UDFTransformer", _UDFTransformerMask.getDataMap());
                return this;
            }

        }

    }

}
