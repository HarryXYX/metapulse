
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
 * An association between a verification and an entity that has been granted
 * via completion of one or more forms of type 'VERIFICATION'.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/FormVerificationAssociation.pdl.")
public class FormVerificationAssociation
    extends RecordTemplate
{

    private final static FormVerificationAssociation.Fields _fields = new FormVerificationAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**An association between a verification and an entity that has been granted\nvia completion of one or more forms of type 'VERIFICATION'.*/record FormVerificationAssociation{/**The urn of the form that granted this verification.*/form:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**An audit stamp capturing who and when verification was applied for this form.*/lastModified:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _formField = null;
    private AuditStamp _lastModifiedField = null;
    private FormVerificationAssociation.ChangeListener __changeListener = new FormVerificationAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Form = SCHEMA.getField("form");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FormVerificationAssociation() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public FormVerificationAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormVerificationAssociation.Fields fields() {
        return _fields;
    }

    public static FormVerificationAssociation.ProjectionMask createMask() {
        return new FormVerificationAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for form
     * 
     * @see FormVerificationAssociation.Fields#form
     */
    public boolean hasForm() {
        if (_formField!= null) {
            return true;
        }
        return super._map.containsKey("form");
    }

    /**
     * Remover for form
     * 
     * @see FormVerificationAssociation.Fields#form
     */
    public void removeForm() {
        super._map.remove("form");
    }

    /**
     * Getter for form
     * 
     * @see FormVerificationAssociation.Fields#form
     */
    @Nullable
    public com.linkedin.common.urn.Urn getForm(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getForm();
            case DEFAULT:
            case NULL:
                if (_formField!= null) {
                    return _formField;
                } else {
                    Object __rawValue = super._map.get("form");
                    _formField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _formField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for form
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormVerificationAssociation.Fields#form
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getForm() {
        if (_formField!= null) {
            return _formField;
        } else {
            Object __rawValue = super._map.get("form");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("form");
            }
            _formField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _formField;
        }
    }

    /**
     * Setter for form
     * 
     * @see FormVerificationAssociation.Fields#form
     */
    public FormVerificationAssociation setForm(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForm(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field form of com.linkedin.common.FormVerificationAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "form", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _formField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForm();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "form", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _formField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "form", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _formField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for form
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormVerificationAssociation.Fields#form
     */
    public FormVerificationAssociation setForm(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field form of com.linkedin.common.FormVerificationAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "form", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _formField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see FormVerificationAssociation.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see FormVerificationAssociation.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see FormVerificationAssociation.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormVerificationAssociation.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see FormVerificationAssociation.Fields#lastModified
     */
    public FormVerificationAssociation setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormVerificationAssociation.Fields#lastModified
     */
    public FormVerificationAssociation setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.common.FormVerificationAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public FormVerificationAssociation clone()
        throws CloneNotSupportedException
    {
        FormVerificationAssociation __clone = ((FormVerificationAssociation) super.clone());
        __clone.__changeListener = new FormVerificationAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormVerificationAssociation copy()
        throws CloneNotSupportedException
    {
        FormVerificationAssociation __copy = ((FormVerificationAssociation) super.copy());
        __copy._formField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new FormVerificationAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormVerificationAssociation __objectRef;

        private ChangeListener(FormVerificationAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "form":
                    __objectRef._formField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
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
         * The urn of the form that granted this verification.
         * 
         */
        public PathSpec form() {
            return new PathSpec(getPathComponents(), "form");
        }

        /**
         * An audit stamp capturing who and when verification was applied for this form.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The urn of the form that granted this verification.
         * 
         */
        public FormVerificationAssociation.ProjectionMask withForm() {
            getDataMap().put("form", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An audit stamp capturing who and when verification was applied for this form.
         * 
         */
        public FormVerificationAssociation.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An audit stamp capturing who and when verification was applied for this form.
         * 
         */
        public FormVerificationAssociation.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An audit stamp capturing who and when verification was applied for this form.
         * 
         */
        public FormVerificationAssociation.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
