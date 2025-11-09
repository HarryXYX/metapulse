
package com.linkedin.settings.global;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * An OAuth Provider. This provides information required to validate inbound
 * requests with OAuth 2.0 bearer tokens.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/global/OAuthProvider.pdl.")
public class OAuthProvider
    extends RecordTemplate
{

    private final static OAuthProvider.Fields _fields = new OAuthProvider.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**An OAuth Provider. This provides information required to validate inbound\nrequests with OAuth 2.0 bearer tokens.*/record OAuthProvider{/**Whether this OAuth provider is enabled.*/enabled:boolean/**The name of this OAuth provider. This is used for display purposes only.*/name:string/**The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.*/jwksUri:optional string/**The expected issuer (iss) claim in the JWTs issued by this OAuth provider.*/issuer:string/**The expected audience (aud) claim in the JWTs issued by this OAuth provider.*/audience:string/**The JWT signing algorithm required for this provider.\nPrevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256*/algorithm:string=\"RS256\"/**The JWT claim to use as the user identifier for this provider.\nDifferent providers use different claims (sub, email, preferred_username, etc.)*/userIdClaim:string=\"sub\"}", SchemaFormatType.PDL));
    private Boolean _enabledField = null;
    private String _nameField = null;
    private String _jwksUriField = null;
    private String _issuerField = null;
    private String _audienceField = null;
    private String _algorithmField = null;
    private String _userIdClaimField = null;
    private OAuthProvider.ChangeListener __changeListener = new OAuthProvider.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Enabled = SCHEMA.getField("enabled");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_JwksUri = SCHEMA.getField("jwksUri");
    private final static RecordDataSchema.Field FIELD_Issuer = SCHEMA.getField("issuer");
    private final static RecordDataSchema.Field FIELD_Audience = SCHEMA.getField("audience");
    private final static RecordDataSchema.Field FIELD_Algorithm = SCHEMA.getField("algorithm");
    private final static String DEFAULT_Algorithm;
    private final static RecordDataSchema.Field FIELD_UserIdClaim = SCHEMA.getField("userIdClaim");
    private final static String DEFAULT_UserIdClaim;

    static {
        DEFAULT_Algorithm = DataTemplateUtil.coerceStringOutput(FIELD_Algorithm.getDefault());
        DEFAULT_UserIdClaim = DataTemplateUtil.coerceStringOutput(FIELD_UserIdClaim.getDefault());
    }

    public OAuthProvider() {
        super(new DataMap(10, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public OAuthProvider(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OAuthProvider.Fields fields() {
        return _fields;
    }

    public static OAuthProvider.ProjectionMask createMask() {
        return new OAuthProvider.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for enabled
     * 
     * @see OAuthProvider.Fields#enabled
     */
    public boolean hasEnabled() {
        if (_enabledField!= null) {
            return true;
        }
        return super._map.containsKey("enabled");
    }

    /**
     * Remover for enabled
     * 
     * @see OAuthProvider.Fields#enabled
     */
    public void removeEnabled() {
        super._map.remove("enabled");
    }

    /**
     * Getter for enabled
     * 
     * @see OAuthProvider.Fields#enabled
     */
    @Nullable
    public Boolean isEnabled(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isEnabled();
            case DEFAULT:
            case NULL:
                if (_enabledField!= null) {
                    return _enabledField;
                } else {
                    Object __rawValue = super._map.get("enabled");
                    _enabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _enabledField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for enabled
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#enabled
     */
    @Nonnull
    public Boolean isEnabled() {
        if (_enabledField!= null) {
            return _enabledField;
        } else {
            Object __rawValue = super._map.get("enabled");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("enabled");
            }
            _enabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _enabledField;
        }
    }

    /**
     * Setter for enabled
     * 
     * @see OAuthProvider.Fields#enabled
     */
    public OAuthProvider setEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field enabled of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnabled();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#enabled
     */
    public OAuthProvider setEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field enabled of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "enabled", value);
            _enabledField = value;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @see OAuthProvider.Fields#enabled
     */
    public OAuthProvider setEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "enabled", value);
        _enabledField = value;
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see OAuthProvider.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see OAuthProvider.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see OAuthProvider.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see OAuthProvider.Fields#name
     */
    public OAuthProvider setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#name
     */
    public OAuthProvider setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for jwksUri
     * 
     * @see OAuthProvider.Fields#jwksUri
     */
    public boolean hasJwksUri() {
        if (_jwksUriField!= null) {
            return true;
        }
        return super._map.containsKey("jwksUri");
    }

    /**
     * Remover for jwksUri
     * 
     * @see OAuthProvider.Fields#jwksUri
     */
    public void removeJwksUri() {
        super._map.remove("jwksUri");
    }

    /**
     * Getter for jwksUri
     * 
     * @see OAuthProvider.Fields#jwksUri
     */
    @Nullable
    public String getJwksUri(GetMode mode) {
        return getJwksUri();
    }

    /**
     * Getter for jwksUri
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OAuthProvider.Fields#jwksUri
     */
    @Nullable
    public String getJwksUri() {
        if (_jwksUriField!= null) {
            return _jwksUriField;
        } else {
            Object __rawValue = super._map.get("jwksUri");
            _jwksUriField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _jwksUriField;
        }
    }

    /**
     * Setter for jwksUri
     * 
     * @see OAuthProvider.Fields#jwksUri
     */
    public OAuthProvider setJwksUri(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJwksUri(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJwksUri();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jwksUri", value);
                    _jwksUriField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "jwksUri", value);
                    _jwksUriField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for jwksUri
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#jwksUri
     */
    public OAuthProvider setJwksUri(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field jwksUri of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "jwksUri", value);
            _jwksUriField = value;
        }
        return this;
    }

    /**
     * Existence checker for issuer
     * 
     * @see OAuthProvider.Fields#issuer
     */
    public boolean hasIssuer() {
        if (_issuerField!= null) {
            return true;
        }
        return super._map.containsKey("issuer");
    }

    /**
     * Remover for issuer
     * 
     * @see OAuthProvider.Fields#issuer
     */
    public void removeIssuer() {
        super._map.remove("issuer");
    }

    /**
     * Getter for issuer
     * 
     * @see OAuthProvider.Fields#issuer
     */
    @Nullable
    public String getIssuer(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIssuer();
            case DEFAULT:
            case NULL:
                if (_issuerField!= null) {
                    return _issuerField;
                } else {
                    Object __rawValue = super._map.get("issuer");
                    _issuerField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _issuerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for issuer
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#issuer
     */
    @Nonnull
    public String getIssuer() {
        if (_issuerField!= null) {
            return _issuerField;
        } else {
            Object __rawValue = super._map.get("issuer");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("issuer");
            }
            _issuerField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _issuerField;
        }
    }

    /**
     * Setter for issuer
     * 
     * @see OAuthProvider.Fields#issuer
     */
    public OAuthProvider setIssuer(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIssuer(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field issuer of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "issuer", value);
                    _issuerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIssuer();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "issuer", value);
                    _issuerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "issuer", value);
                    _issuerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for issuer
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#issuer
     */
    public OAuthProvider setIssuer(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field issuer of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "issuer", value);
            _issuerField = value;
        }
        return this;
    }

    /**
     * Existence checker for audience
     * 
     * @see OAuthProvider.Fields#audience
     */
    public boolean hasAudience() {
        if (_audienceField!= null) {
            return true;
        }
        return super._map.containsKey("audience");
    }

    /**
     * Remover for audience
     * 
     * @see OAuthProvider.Fields#audience
     */
    public void removeAudience() {
        super._map.remove("audience");
    }

    /**
     * Getter for audience
     * 
     * @see OAuthProvider.Fields#audience
     */
    @Nullable
    public String getAudience(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAudience();
            case DEFAULT:
            case NULL:
                if (_audienceField!= null) {
                    return _audienceField;
                } else {
                    Object __rawValue = super._map.get("audience");
                    _audienceField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _audienceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for audience
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#audience
     */
    @Nonnull
    public String getAudience() {
        if (_audienceField!= null) {
            return _audienceField;
        } else {
            Object __rawValue = super._map.get("audience");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("audience");
            }
            _audienceField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _audienceField;
        }
    }

    /**
     * Setter for audience
     * 
     * @see OAuthProvider.Fields#audience
     */
    public OAuthProvider setAudience(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAudience(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field audience of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "audience", value);
                    _audienceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAudience();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "audience", value);
                    _audienceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "audience", value);
                    _audienceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for audience
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#audience
     */
    public OAuthProvider setAudience(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field audience of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "audience", value);
            _audienceField = value;
        }
        return this;
    }

    /**
     * Existence checker for algorithm
     * 
     * @see OAuthProvider.Fields#algorithm
     */
    public boolean hasAlgorithm() {
        if (_algorithmField!= null) {
            return true;
        }
        return super._map.containsKey("algorithm");
    }

    /**
     * Remover for algorithm
     * 
     * @see OAuthProvider.Fields#algorithm
     */
    public void removeAlgorithm() {
        super._map.remove("algorithm");
    }

    /**
     * Getter for algorithm
     * 
     * @see OAuthProvider.Fields#algorithm
     */
    @Nullable
    public String getAlgorithm(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getAlgorithm();
            case NULL:
                if (_algorithmField!= null) {
                    return _algorithmField;
                } else {
                    Object __rawValue = super._map.get("algorithm");
                    _algorithmField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _algorithmField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for algorithm
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#algorithm
     */
    @Nonnull
    public String getAlgorithm() {
        if (_algorithmField!= null) {
            return _algorithmField;
        } else {
            Object __rawValue = super._map.get("algorithm");
            if (__rawValue == null) {
                return DEFAULT_Algorithm;
            }
            _algorithmField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _algorithmField;
        }
    }

    /**
     * Setter for algorithm
     * 
     * @see OAuthProvider.Fields#algorithm
     */
    public OAuthProvider setAlgorithm(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAlgorithm(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field algorithm of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "algorithm", value);
                    _algorithmField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAlgorithm();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "algorithm", value);
                    _algorithmField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "algorithm", value);
                    _algorithmField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for algorithm
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#algorithm
     */
    public OAuthProvider setAlgorithm(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field algorithm of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "algorithm", value);
            _algorithmField = value;
        }
        return this;
    }

    /**
     * Existence checker for userIdClaim
     * 
     * @see OAuthProvider.Fields#userIdClaim
     */
    public boolean hasUserIdClaim() {
        if (_userIdClaimField!= null) {
            return true;
        }
        return super._map.containsKey("userIdClaim");
    }

    /**
     * Remover for userIdClaim
     * 
     * @see OAuthProvider.Fields#userIdClaim
     */
    public void removeUserIdClaim() {
        super._map.remove("userIdClaim");
    }

    /**
     * Getter for userIdClaim
     * 
     * @see OAuthProvider.Fields#userIdClaim
     */
    @Nullable
    public String getUserIdClaim(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getUserIdClaim();
            case NULL:
                if (_userIdClaimField!= null) {
                    return _userIdClaimField;
                } else {
                    Object __rawValue = super._map.get("userIdClaim");
                    _userIdClaimField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _userIdClaimField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for userIdClaim
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthProvider.Fields#userIdClaim
     */
    @Nonnull
    public String getUserIdClaim() {
        if (_userIdClaimField!= null) {
            return _userIdClaimField;
        } else {
            Object __rawValue = super._map.get("userIdClaim");
            if (__rawValue == null) {
                return DEFAULT_UserIdClaim;
            }
            _userIdClaimField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userIdClaimField;
        }
    }

    /**
     * Setter for userIdClaim
     * 
     * @see OAuthProvider.Fields#userIdClaim
     */
    public OAuthProvider setUserIdClaim(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserIdClaim(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field userIdClaim of com.linkedin.settings.global.OAuthProvider");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userIdClaim", value);
                    _userIdClaimField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserIdClaim();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userIdClaim", value);
                    _userIdClaimField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userIdClaim", value);
                    _userIdClaimField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userIdClaim
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthProvider.Fields#userIdClaim
     */
    public OAuthProvider setUserIdClaim(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userIdClaim of com.linkedin.settings.global.OAuthProvider to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userIdClaim", value);
            _userIdClaimField = value;
        }
        return this;
    }

    @Override
    public OAuthProvider clone()
        throws CloneNotSupportedException
    {
        OAuthProvider __clone = ((OAuthProvider) super.clone());
        __clone.__changeListener = new OAuthProvider.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OAuthProvider copy()
        throws CloneNotSupportedException
    {
        OAuthProvider __copy = ((OAuthProvider) super.copy());
        __copy._userIdClaimField = null;
        __copy._audienceField = null;
        __copy._nameField = null;
        __copy._jwksUriField = null;
        __copy._enabledField = null;
        __copy._issuerField = null;
        __copy._algorithmField = null;
        __copy.__changeListener = new OAuthProvider.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OAuthProvider __objectRef;

        private ChangeListener(OAuthProvider reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "userIdClaim":
                    __objectRef._userIdClaimField = null;
                    break;
                case "audience":
                    __objectRef._audienceField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "jwksUri":
                    __objectRef._jwksUriField = null;
                    break;
                case "enabled":
                    __objectRef._enabledField = null;
                    break;
                case "issuer":
                    __objectRef._issuerField = null;
                    break;
                case "algorithm":
                    __objectRef._algorithmField = null;
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
         * Whether this OAuth provider is enabled.
         * 
         */
        public PathSpec enabled() {
            return new PathSpec(getPathComponents(), "enabled");
        }

        /**
         * The name of this OAuth provider. This is used for display purposes only.
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.
         * 
         */
        public PathSpec jwksUri() {
            return new PathSpec(getPathComponents(), "jwksUri");
        }

        /**
         * The expected issuer (iss) claim in the JWTs issued by this OAuth provider.
         * 
         */
        public PathSpec issuer() {
            return new PathSpec(getPathComponents(), "issuer");
        }

        /**
         * The expected audience (aud) claim in the JWTs issued by this OAuth provider.
         * 
         */
        public PathSpec audience() {
            return new PathSpec(getPathComponents(), "audience");
        }

        /**
         * The JWT signing algorithm required for this provider.
         * Prevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256
         * 
         */
        public PathSpec algorithm() {
            return new PathSpec(getPathComponents(), "algorithm");
        }

        /**
         * The JWT claim to use as the user identifier for this provider.
         * Different providers use different claims (sub, email, preferred_username, etc.)
         * 
         */
        public PathSpec userIdClaim() {
            return new PathSpec(getPathComponents(), "userIdClaim");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(10);
        }

        /**
         * Whether this OAuth provider is enabled.
         * 
         */
        public OAuthProvider.ProjectionMask withEnabled() {
            getDataMap().put("enabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The name of this OAuth provider. This is used for display purposes only.
         * 
         */
        public OAuthProvider.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.
         * 
         */
        public OAuthProvider.ProjectionMask withJwksUri() {
            getDataMap().put("jwksUri", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The expected issuer (iss) claim in the JWTs issued by this OAuth provider.
         * 
         */
        public OAuthProvider.ProjectionMask withIssuer() {
            getDataMap().put("issuer", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The expected audience (aud) claim in the JWTs issued by this OAuth provider.
         * 
         */
        public OAuthProvider.ProjectionMask withAudience() {
            getDataMap().put("audience", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The JWT signing algorithm required for this provider.
         * Prevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256
         * 
         */
        public OAuthProvider.ProjectionMask withAlgorithm() {
            getDataMap().put("algorithm", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The JWT claim to use as the user identifier for this provider.
         * Different providers use different claims (sub, email, preferred_username, etc.)
         * 
         */
        public OAuthProvider.ProjectionMask withUserIdClaim() {
            getDataMap().put("userIdClaim", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
