
package com.linkedin.identity;

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


/**
 * Aspect used to store invite tokens.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/InviteToken.pdl.")
public class InviteToken
    extends RecordTemplate
{

    private final static InviteToken.Fields _fields = new InviteToken.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Aspect used to store invite tokens.*/@Aspect.name=\"inviteToken\"record InviteToken{/**The encrypted invite token.*/token:string/**The role that this invite token may be associated with*/@Searchable={\"fieldName\":\"role\",\"fieldType\":\"KEYWORD\",\"hasValuesFieldName\":\"hasRole\"}role:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private String _tokenField = null;
    private com.linkedin.common.urn.Urn _roleField = null;
    private InviteToken.ChangeListener __changeListener = new InviteToken.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Token = SCHEMA.getField("token");
    private final static RecordDataSchema.Field FIELD_Role = SCHEMA.getField("role");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public InviteToken() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public InviteToken(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static InviteToken.Fields fields() {
        return _fields;
    }

    public static InviteToken.ProjectionMask createMask() {
        return new InviteToken.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for token
     * 
     * @see InviteToken.Fields#token
     */
    public boolean hasToken() {
        if (_tokenField!= null) {
            return true;
        }
        return super._map.containsKey("token");
    }

    /**
     * Remover for token
     * 
     * @see InviteToken.Fields#token
     */
    public void removeToken() {
        super._map.remove("token");
    }

    /**
     * Getter for token
     * 
     * @see InviteToken.Fields#token
     */
    @Nullable
    public String getToken(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getToken();
            case DEFAULT:
            case NULL:
                if (_tokenField!= null) {
                    return _tokenField;
                } else {
                    Object __rawValue = super._map.get("token");
                    _tokenField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _tokenField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for token
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InviteToken.Fields#token
     */
    @Nonnull
    public String getToken() {
        if (_tokenField!= null) {
            return _tokenField;
        } else {
            Object __rawValue = super._map.get("token");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("token");
            }
            _tokenField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _tokenField;
        }
    }

    /**
     * Setter for token
     * 
     * @see InviteToken.Fields#token
     */
    public InviteToken setToken(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setToken(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field token of com.linkedin.identity.InviteToken");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "token", value);
                    _tokenField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeToken();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "token", value);
                    _tokenField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "token", value);
                    _tokenField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for token
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InviteToken.Fields#token
     */
    public InviteToken setToken(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field token of com.linkedin.identity.InviteToken to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "token", value);
            _tokenField = value;
        }
        return this;
    }

    /**
     * Existence checker for role
     * 
     * @see InviteToken.Fields#role
     */
    public boolean hasRole() {
        if (_roleField!= null) {
            return true;
        }
        return super._map.containsKey("role");
    }

    /**
     * Remover for role
     * 
     * @see InviteToken.Fields#role
     */
    public void removeRole() {
        super._map.remove("role");
    }

    /**
     * Getter for role
     * 
     * @see InviteToken.Fields#role
     */
    @Nullable
    public com.linkedin.common.urn.Urn getRole(GetMode mode) {
        return getRole();
    }

    /**
     * Getter for role
     * 
     * @return
     *     Optional field. Always check for null.
     * @see InviteToken.Fields#role
     */
    @Nullable
    public com.linkedin.common.urn.Urn getRole() {
        if (_roleField!= null) {
            return _roleField;
        } else {
            Object __rawValue = super._map.get("role");
            _roleField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _roleField;
        }
    }

    /**
     * Setter for role
     * 
     * @see InviteToken.Fields#role
     */
    public InviteToken setRole(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRole(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRole();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "role", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _roleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "role", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _roleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for role
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InviteToken.Fields#role
     */
    public InviteToken setRole(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field role of com.linkedin.identity.InviteToken to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "role", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _roleField = value;
        }
        return this;
    }

    @Override
    public InviteToken clone()
        throws CloneNotSupportedException
    {
        InviteToken __clone = ((InviteToken) super.clone());
        __clone.__changeListener = new InviteToken.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public InviteToken copy()
        throws CloneNotSupportedException
    {
        InviteToken __copy = ((InviteToken) super.copy());
        __copy._roleField = null;
        __copy._tokenField = null;
        __copy.__changeListener = new InviteToken.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final InviteToken __objectRef;

        private ChangeListener(InviteToken reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "role":
                    __objectRef._roleField = null;
                    break;
                case "token":
                    __objectRef._tokenField = null;
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
         * The encrypted invite token.
         * 
         */
        public PathSpec token() {
            return new PathSpec(getPathComponents(), "token");
        }

        /**
         * The role that this invite token may be associated with
         * 
         */
        public PathSpec role() {
            return new PathSpec(getPathComponents(), "role");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The encrypted invite token.
         * 
         */
        public InviteToken.ProjectionMask withToken() {
            getDataMap().put("token", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The role that this invite token may be associated with
         * 
         */
        public InviteToken.ProjectionMask withRole() {
            getDataMap().put("role", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
