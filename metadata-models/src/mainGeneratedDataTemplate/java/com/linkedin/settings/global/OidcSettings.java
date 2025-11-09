
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
 * Settings for OIDC SSO integration.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/OidcSettings.pdl.")
public class OidcSettings
    extends RecordTemplate
{

    private final static OidcSettings.Fields _fields = new OidcSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**Settings for OIDC SSO integration.*/record OidcSettings{/**Whether OIDC SSO is enabled.*/enabled:boolean/**Unique client id issued by the identity provider.*/clientId:string/**Unique client secret issued by the identity provider.*/clientSecret:string/**The IdP OIDC discovery url.*/discoveryUri:string/**ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to \"preferred_username\".*/userNameClaim:optional string/**ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).*/userNameClaimRegex:optional string/**ADVANCED. String representing the requested scope from the IdP. Defaults to \"oidc email profile\".*/scope:optional string/**ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to \"client_secret_basic\".*/clientAuthenticationMethod:optional string/**ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.*/jitProvisioningEnabled:optional boolean/**ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.*/preProvisioningRequired:optional boolean/**ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.*/extractGroupsEnabled:optional boolean/**ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.*/groupsClaim:optional string/**ADVANCED. Response type.*/responseType:optional string/**ADVANCED. Response mode.*/responseMode:optional string/**ADVANCED. Use Nonce.*/useNonce:optional boolean/**ADVANCED. Read timeout.*/readTimeout:optional long/**ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.*/extractJwtAccessTokenClaims:optional boolean/** ADVANCED. Which jws algorithm to use. Unused.*/preferredJwsAlgorithm:optional string/** ADVANCED. Which jws algorithm to use.*/preferredJwsAlgorithm2:optional string}", SchemaFormatType.PDL));
    private Boolean _enabledField = null;
    private String _clientIdField = null;
    private String _clientSecretField = null;
    private String _discoveryUriField = null;
    private String _userNameClaimField = null;
    private String _userNameClaimRegexField = null;
    private String _scopeField = null;
    private String _clientAuthenticationMethodField = null;
    private Boolean _jitProvisioningEnabledField = null;
    private Boolean _preProvisioningRequiredField = null;
    private Boolean _extractGroupsEnabledField = null;
    private String _groupsClaimField = null;
    private String _responseTypeField = null;
    private String _responseModeField = null;
    private Boolean _useNonceField = null;
    private Long _readTimeoutField = null;
    private Boolean _extractJwtAccessTokenClaimsField = null;
    private String _preferredJwsAlgorithmField = null;
    private String _preferredJwsAlgorithm2Field = null;
    private OidcSettings.ChangeListener __changeListener = new OidcSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Enabled = SCHEMA.getField("enabled");
    private final static RecordDataSchema.Field FIELD_ClientId = SCHEMA.getField("clientId");
    private final static RecordDataSchema.Field FIELD_ClientSecret = SCHEMA.getField("clientSecret");
    private final static RecordDataSchema.Field FIELD_DiscoveryUri = SCHEMA.getField("discoveryUri");
    private final static RecordDataSchema.Field FIELD_UserNameClaim = SCHEMA.getField("userNameClaim");
    private final static RecordDataSchema.Field FIELD_UserNameClaimRegex = SCHEMA.getField("userNameClaimRegex");
    private final static RecordDataSchema.Field FIELD_Scope = SCHEMA.getField("scope");
    private final static RecordDataSchema.Field FIELD_ClientAuthenticationMethod = SCHEMA.getField("clientAuthenticationMethod");
    private final static RecordDataSchema.Field FIELD_JitProvisioningEnabled = SCHEMA.getField("jitProvisioningEnabled");
    private final static RecordDataSchema.Field FIELD_PreProvisioningRequired = SCHEMA.getField("preProvisioningRequired");
    private final static RecordDataSchema.Field FIELD_ExtractGroupsEnabled = SCHEMA.getField("extractGroupsEnabled");
    private final static RecordDataSchema.Field FIELD_GroupsClaim = SCHEMA.getField("groupsClaim");
    private final static RecordDataSchema.Field FIELD_ResponseType = SCHEMA.getField("responseType");
    private final static RecordDataSchema.Field FIELD_ResponseMode = SCHEMA.getField("responseMode");
    private final static RecordDataSchema.Field FIELD_UseNonce = SCHEMA.getField("useNonce");
    private final static RecordDataSchema.Field FIELD_ReadTimeout = SCHEMA.getField("readTimeout");
    private final static RecordDataSchema.Field FIELD_ExtractJwtAccessTokenClaims = SCHEMA.getField("extractJwtAccessTokenClaims");
    private final static RecordDataSchema.Field FIELD_PreferredJwsAlgorithm = SCHEMA.getField("preferredJwsAlgorithm");
    private final static RecordDataSchema.Field FIELD_PreferredJwsAlgorithm2 = SCHEMA.getField("preferredJwsAlgorithm2");

    public OidcSettings() {
        super(new DataMap(), SCHEMA);
        addChangeListener(__changeListener);
    }

    public OidcSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OidcSettings.Fields fields() {
        return _fields;
    }

    public static OidcSettings.ProjectionMask createMask() {
        return new OidcSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for enabled
     * 
     * @see OidcSettings.Fields#enabled
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
     * @see OidcSettings.Fields#enabled
     */
    public void removeEnabled() {
        super._map.remove("enabled");
    }

    /**
     * Getter for enabled
     * 
     * @see OidcSettings.Fields#enabled
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
     * @see OidcSettings.Fields#enabled
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
     * @see OidcSettings.Fields#enabled
     */
    public OidcSettings setEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field enabled of com.linkedin.settings.global.OidcSettings");
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
     * @see OidcSettings.Fields#enabled
     */
    public OidcSettings setEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field enabled of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "enabled", value);
            _enabledField = value;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @see OidcSettings.Fields#enabled
     */
    public OidcSettings setEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "enabled", value);
        _enabledField = value;
        return this;
    }

    /**
     * Existence checker for clientId
     * 
     * @see OidcSettings.Fields#clientId
     */
    public boolean hasClientId() {
        if (_clientIdField!= null) {
            return true;
        }
        return super._map.containsKey("clientId");
    }

    /**
     * Remover for clientId
     * 
     * @see OidcSettings.Fields#clientId
     */
    public void removeClientId() {
        super._map.remove("clientId");
    }

    /**
     * Getter for clientId
     * 
     * @see OidcSettings.Fields#clientId
     */
    @Nullable
    public String getClientId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getClientId();
            case DEFAULT:
            case NULL:
                if (_clientIdField!= null) {
                    return _clientIdField;
                } else {
                    Object __rawValue = super._map.get("clientId");
                    _clientIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _clientIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for clientId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OidcSettings.Fields#clientId
     */
    @Nonnull
    public String getClientId() {
        if (_clientIdField!= null) {
            return _clientIdField;
        } else {
            Object __rawValue = super._map.get("clientId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("clientId");
            }
            _clientIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clientIdField;
        }
    }

    /**
     * Setter for clientId
     * 
     * @see OidcSettings.Fields#clientId
     */
    public OidcSettings setClientId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field clientId of com.linkedin.settings.global.OidcSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#clientId
     */
    public OidcSettings setClientId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientId of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientId", value);
            _clientIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for clientSecret
     * 
     * @see OidcSettings.Fields#clientSecret
     */
    public boolean hasClientSecret() {
        if (_clientSecretField!= null) {
            return true;
        }
        return super._map.containsKey("clientSecret");
    }

    /**
     * Remover for clientSecret
     * 
     * @see OidcSettings.Fields#clientSecret
     */
    public void removeClientSecret() {
        super._map.remove("clientSecret");
    }

    /**
     * Getter for clientSecret
     * 
     * @see OidcSettings.Fields#clientSecret
     */
    @Nullable
    public String getClientSecret(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getClientSecret();
            case DEFAULT:
            case NULL:
                if (_clientSecretField!= null) {
                    return _clientSecretField;
                } else {
                    Object __rawValue = super._map.get("clientSecret");
                    _clientSecretField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _clientSecretField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for clientSecret
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OidcSettings.Fields#clientSecret
     */
    @Nonnull
    public String getClientSecret() {
        if (_clientSecretField!= null) {
            return _clientSecretField;
        } else {
            Object __rawValue = super._map.get("clientSecret");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("clientSecret");
            }
            _clientSecretField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clientSecretField;
        }
    }

    /**
     * Setter for clientSecret
     * 
     * @see OidcSettings.Fields#clientSecret
     */
    public OidcSettings setClientSecret(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientSecret(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field clientSecret of com.linkedin.settings.global.OidcSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", value);
                    _clientSecretField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientSecret();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", value);
                    _clientSecretField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", value);
                    _clientSecretField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientSecret
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#clientSecret
     */
    public OidcSettings setClientSecret(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientSecret of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientSecret", value);
            _clientSecretField = value;
        }
        return this;
    }

    /**
     * Existence checker for discoveryUri
     * 
     * @see OidcSettings.Fields#discoveryUri
     */
    public boolean hasDiscoveryUri() {
        if (_discoveryUriField!= null) {
            return true;
        }
        return super._map.containsKey("discoveryUri");
    }

    /**
     * Remover for discoveryUri
     * 
     * @see OidcSettings.Fields#discoveryUri
     */
    public void removeDiscoveryUri() {
        super._map.remove("discoveryUri");
    }

    /**
     * Getter for discoveryUri
     * 
     * @see OidcSettings.Fields#discoveryUri
     */
    @Nullable
    public String getDiscoveryUri(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDiscoveryUri();
            case DEFAULT:
            case NULL:
                if (_discoveryUriField!= null) {
                    return _discoveryUriField;
                } else {
                    Object __rawValue = super._map.get("discoveryUri");
                    _discoveryUriField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _discoveryUriField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for discoveryUri
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OidcSettings.Fields#discoveryUri
     */
    @Nonnull
    public String getDiscoveryUri() {
        if (_discoveryUriField!= null) {
            return _discoveryUriField;
        } else {
            Object __rawValue = super._map.get("discoveryUri");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("discoveryUri");
            }
            _discoveryUriField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _discoveryUriField;
        }
    }

    /**
     * Setter for discoveryUri
     * 
     * @see OidcSettings.Fields#discoveryUri
     */
    public OidcSettings setDiscoveryUri(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDiscoveryUri(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field discoveryUri of com.linkedin.settings.global.OidcSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "discoveryUri", value);
                    _discoveryUriField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDiscoveryUri();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "discoveryUri", value);
                    _discoveryUriField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "discoveryUri", value);
                    _discoveryUriField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for discoveryUri
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#discoveryUri
     */
    public OidcSettings setDiscoveryUri(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field discoveryUri of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "discoveryUri", value);
            _discoveryUriField = value;
        }
        return this;
    }

    /**
     * Existence checker for userNameClaim
     * 
     * @see OidcSettings.Fields#userNameClaim
     */
    public boolean hasUserNameClaim() {
        if (_userNameClaimField!= null) {
            return true;
        }
        return super._map.containsKey("userNameClaim");
    }

    /**
     * Remover for userNameClaim
     * 
     * @see OidcSettings.Fields#userNameClaim
     */
    public void removeUserNameClaim() {
        super._map.remove("userNameClaim");
    }

    /**
     * Getter for userNameClaim
     * 
     * @see OidcSettings.Fields#userNameClaim
     */
    @Nullable
    public String getUserNameClaim(GetMode mode) {
        return getUserNameClaim();
    }

    /**
     * Getter for userNameClaim
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#userNameClaim
     */
    @Nullable
    public String getUserNameClaim() {
        if (_userNameClaimField!= null) {
            return _userNameClaimField;
        } else {
            Object __rawValue = super._map.get("userNameClaim");
            _userNameClaimField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userNameClaimField;
        }
    }

    /**
     * Setter for userNameClaim
     * 
     * @see OidcSettings.Fields#userNameClaim
     */
    public OidcSettings setUserNameClaim(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserNameClaim(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserNameClaim();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userNameClaim", value);
                    _userNameClaimField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userNameClaim", value);
                    _userNameClaimField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userNameClaim
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#userNameClaim
     */
    public OidcSettings setUserNameClaim(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userNameClaim of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userNameClaim", value);
            _userNameClaimField = value;
        }
        return this;
    }

    /**
     * Existence checker for userNameClaimRegex
     * 
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    public boolean hasUserNameClaimRegex() {
        if (_userNameClaimRegexField!= null) {
            return true;
        }
        return super._map.containsKey("userNameClaimRegex");
    }

    /**
     * Remover for userNameClaimRegex
     * 
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    public void removeUserNameClaimRegex() {
        super._map.remove("userNameClaimRegex");
    }

    /**
     * Getter for userNameClaimRegex
     * 
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    @Nullable
    public String getUserNameClaimRegex(GetMode mode) {
        return getUserNameClaimRegex();
    }

    /**
     * Getter for userNameClaimRegex
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    @Nullable
    public String getUserNameClaimRegex() {
        if (_userNameClaimRegexField!= null) {
            return _userNameClaimRegexField;
        } else {
            Object __rawValue = super._map.get("userNameClaimRegex");
            _userNameClaimRegexField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userNameClaimRegexField;
        }
    }

    /**
     * Setter for userNameClaimRegex
     * 
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    public OidcSettings setUserNameClaimRegex(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserNameClaimRegex(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserNameClaimRegex();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userNameClaimRegex", value);
                    _userNameClaimRegexField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userNameClaimRegex", value);
                    _userNameClaimRegexField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userNameClaimRegex
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#userNameClaimRegex
     */
    public OidcSettings setUserNameClaimRegex(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userNameClaimRegex of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userNameClaimRegex", value);
            _userNameClaimRegexField = value;
        }
        return this;
    }

    /**
     * Existence checker for scope
     * 
     * @see OidcSettings.Fields#scope
     */
    public boolean hasScope() {
        if (_scopeField!= null) {
            return true;
        }
        return super._map.containsKey("scope");
    }

    /**
     * Remover for scope
     * 
     * @see OidcSettings.Fields#scope
     */
    public void removeScope() {
        super._map.remove("scope");
    }

    /**
     * Getter for scope
     * 
     * @see OidcSettings.Fields#scope
     */
    @Nullable
    public String getScope(GetMode mode) {
        return getScope();
    }

    /**
     * Getter for scope
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#scope
     */
    @Nullable
    public String getScope() {
        if (_scopeField!= null) {
            return _scopeField;
        } else {
            Object __rawValue = super._map.get("scope");
            _scopeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _scopeField;
        }
    }

    /**
     * Setter for scope
     * 
     * @see OidcSettings.Fields#scope
     */
    public OidcSettings setScope(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScope(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScope();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value);
                    _scopeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value);
                    _scopeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scope
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#scope
     */
    public OidcSettings setScope(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scope of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scope", value);
            _scopeField = value;
        }
        return this;
    }

    /**
     * Existence checker for clientAuthenticationMethod
     * 
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    public boolean hasClientAuthenticationMethod() {
        if (_clientAuthenticationMethodField!= null) {
            return true;
        }
        return super._map.containsKey("clientAuthenticationMethod");
    }

    /**
     * Remover for clientAuthenticationMethod
     * 
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    public void removeClientAuthenticationMethod() {
        super._map.remove("clientAuthenticationMethod");
    }

    /**
     * Getter for clientAuthenticationMethod
     * 
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    @Nullable
    public String getClientAuthenticationMethod(GetMode mode) {
        return getClientAuthenticationMethod();
    }

    /**
     * Getter for clientAuthenticationMethod
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    @Nullable
    public String getClientAuthenticationMethod() {
        if (_clientAuthenticationMethodField!= null) {
            return _clientAuthenticationMethodField;
        } else {
            Object __rawValue = super._map.get("clientAuthenticationMethod");
            _clientAuthenticationMethodField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clientAuthenticationMethodField;
        }
    }

    /**
     * Setter for clientAuthenticationMethod
     * 
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    public OidcSettings setClientAuthenticationMethod(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientAuthenticationMethod(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientAuthenticationMethod();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientAuthenticationMethod", value);
                    _clientAuthenticationMethodField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientAuthenticationMethod", value);
                    _clientAuthenticationMethodField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientAuthenticationMethod
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#clientAuthenticationMethod
     */
    public OidcSettings setClientAuthenticationMethod(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientAuthenticationMethod of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientAuthenticationMethod", value);
            _clientAuthenticationMethodField = value;
        }
        return this;
    }

    /**
     * Existence checker for jitProvisioningEnabled
     * 
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    public boolean hasJitProvisioningEnabled() {
        if (_jitProvisioningEnabledField!= null) {
            return true;
        }
        return super._map.containsKey("jitProvisioningEnabled");
    }

    /**
     * Remover for jitProvisioningEnabled
     * 
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    public void removeJitProvisioningEnabled() {
        super._map.remove("jitProvisioningEnabled");
    }

    /**
     * Getter for jitProvisioningEnabled
     * 
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    @Nullable
    public Boolean isJitProvisioningEnabled(GetMode mode) {
        return isJitProvisioningEnabled();
    }

    /**
     * Getter for jitProvisioningEnabled
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    @Nullable
    public Boolean isJitProvisioningEnabled() {
        if (_jitProvisioningEnabledField!= null) {
            return _jitProvisioningEnabledField;
        } else {
            Object __rawValue = super._map.get("jitProvisioningEnabled");
            _jitProvisioningEnabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _jitProvisioningEnabledField;
        }
    }

    /**
     * Setter for jitProvisioningEnabled
     * 
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    public OidcSettings setJitProvisioningEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJitProvisioningEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJitProvisioningEnabled();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jitProvisioningEnabled", value);
                    _jitProvisioningEnabledField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "jitProvisioningEnabled", value);
                    _jitProvisioningEnabledField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for jitProvisioningEnabled
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    public OidcSettings setJitProvisioningEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field jitProvisioningEnabled of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "jitProvisioningEnabled", value);
            _jitProvisioningEnabledField = value;
        }
        return this;
    }

    /**
     * Setter for jitProvisioningEnabled
     * 
     * @see OidcSettings.Fields#jitProvisioningEnabled
     */
    public OidcSettings setJitProvisioningEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "jitProvisioningEnabled", value);
        _jitProvisioningEnabledField = value;
        return this;
    }

    /**
     * Existence checker for preProvisioningRequired
     * 
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    public boolean hasPreProvisioningRequired() {
        if (_preProvisioningRequiredField!= null) {
            return true;
        }
        return super._map.containsKey("preProvisioningRequired");
    }

    /**
     * Remover for preProvisioningRequired
     * 
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    public void removePreProvisioningRequired() {
        super._map.remove("preProvisioningRequired");
    }

    /**
     * Getter for preProvisioningRequired
     * 
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    @Nullable
    public Boolean isPreProvisioningRequired(GetMode mode) {
        return isPreProvisioningRequired();
    }

    /**
     * Getter for preProvisioningRequired
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    @Nullable
    public Boolean isPreProvisioningRequired() {
        if (_preProvisioningRequiredField!= null) {
            return _preProvisioningRequiredField;
        } else {
            Object __rawValue = super._map.get("preProvisioningRequired");
            _preProvisioningRequiredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _preProvisioningRequiredField;
        }
    }

    /**
     * Setter for preProvisioningRequired
     * 
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    public OidcSettings setPreProvisioningRequired(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPreProvisioningRequired(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePreProvisioningRequired();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "preProvisioningRequired", value);
                    _preProvisioningRequiredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "preProvisioningRequired", value);
                    _preProvisioningRequiredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for preProvisioningRequired
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    public OidcSettings setPreProvisioningRequired(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field preProvisioningRequired of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "preProvisioningRequired", value);
            _preProvisioningRequiredField = value;
        }
        return this;
    }

    /**
     * Setter for preProvisioningRequired
     * 
     * @see OidcSettings.Fields#preProvisioningRequired
     */
    public OidcSettings setPreProvisioningRequired(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "preProvisioningRequired", value);
        _preProvisioningRequiredField = value;
        return this;
    }

    /**
     * Existence checker for extractGroupsEnabled
     * 
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    public boolean hasExtractGroupsEnabled() {
        if (_extractGroupsEnabledField!= null) {
            return true;
        }
        return super._map.containsKey("extractGroupsEnabled");
    }

    /**
     * Remover for extractGroupsEnabled
     * 
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    public void removeExtractGroupsEnabled() {
        super._map.remove("extractGroupsEnabled");
    }

    /**
     * Getter for extractGroupsEnabled
     * 
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    @Nullable
    public Boolean isExtractGroupsEnabled(GetMode mode) {
        return isExtractGroupsEnabled();
    }

    /**
     * Getter for extractGroupsEnabled
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    @Nullable
    public Boolean isExtractGroupsEnabled() {
        if (_extractGroupsEnabledField!= null) {
            return _extractGroupsEnabledField;
        } else {
            Object __rawValue = super._map.get("extractGroupsEnabled");
            _extractGroupsEnabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _extractGroupsEnabledField;
        }
    }

    /**
     * Setter for extractGroupsEnabled
     * 
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    public OidcSettings setExtractGroupsEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExtractGroupsEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExtractGroupsEnabled();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extractGroupsEnabled", value);
                    _extractGroupsEnabledField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "extractGroupsEnabled", value);
                    _extractGroupsEnabledField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for extractGroupsEnabled
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    public OidcSettings setExtractGroupsEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extractGroupsEnabled of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extractGroupsEnabled", value);
            _extractGroupsEnabledField = value;
        }
        return this;
    }

    /**
     * Setter for extractGroupsEnabled
     * 
     * @see OidcSettings.Fields#extractGroupsEnabled
     */
    public OidcSettings setExtractGroupsEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "extractGroupsEnabled", value);
        _extractGroupsEnabledField = value;
        return this;
    }

    /**
     * Existence checker for groupsClaim
     * 
     * @see OidcSettings.Fields#groupsClaim
     */
    public boolean hasGroupsClaim() {
        if (_groupsClaimField!= null) {
            return true;
        }
        return super._map.containsKey("groupsClaim");
    }

    /**
     * Remover for groupsClaim
     * 
     * @see OidcSettings.Fields#groupsClaim
     */
    public void removeGroupsClaim() {
        super._map.remove("groupsClaim");
    }

    /**
     * Getter for groupsClaim
     * 
     * @see OidcSettings.Fields#groupsClaim
     */
    @Nullable
    public String getGroupsClaim(GetMode mode) {
        return getGroupsClaim();
    }

    /**
     * Getter for groupsClaim
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#groupsClaim
     */
    @Nullable
    public String getGroupsClaim() {
        if (_groupsClaimField!= null) {
            return _groupsClaimField;
        } else {
            Object __rawValue = super._map.get("groupsClaim");
            _groupsClaimField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _groupsClaimField;
        }
    }

    /**
     * Setter for groupsClaim
     * 
     * @see OidcSettings.Fields#groupsClaim
     */
    public OidcSettings setGroupsClaim(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupsClaim(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupsClaim();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupsClaim", value);
                    _groupsClaimField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupsClaim", value);
                    _groupsClaimField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupsClaim
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#groupsClaim
     */
    public OidcSettings setGroupsClaim(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupsClaim of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupsClaim", value);
            _groupsClaimField = value;
        }
        return this;
    }

    /**
     * Existence checker for responseType
     * 
     * @see OidcSettings.Fields#responseType
     */
    public boolean hasResponseType() {
        if (_responseTypeField!= null) {
            return true;
        }
        return super._map.containsKey("responseType");
    }

    /**
     * Remover for responseType
     * 
     * @see OidcSettings.Fields#responseType
     */
    public void removeResponseType() {
        super._map.remove("responseType");
    }

    /**
     * Getter for responseType
     * 
     * @see OidcSettings.Fields#responseType
     */
    @Nullable
    public String getResponseType(GetMode mode) {
        return getResponseType();
    }

    /**
     * Getter for responseType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#responseType
     */
    @Nullable
    public String getResponseType() {
        if (_responseTypeField!= null) {
            return _responseTypeField;
        } else {
            Object __rawValue = super._map.get("responseType");
            _responseTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _responseTypeField;
        }
    }

    /**
     * Setter for responseType
     * 
     * @see OidcSettings.Fields#responseType
     */
    public OidcSettings setResponseType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResponseType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResponseType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "responseType", value);
                    _responseTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "responseType", value);
                    _responseTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for responseType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#responseType
     */
    public OidcSettings setResponseType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field responseType of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "responseType", value);
            _responseTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for responseMode
     * 
     * @see OidcSettings.Fields#responseMode
     */
    public boolean hasResponseMode() {
        if (_responseModeField!= null) {
            return true;
        }
        return super._map.containsKey("responseMode");
    }

    /**
     * Remover for responseMode
     * 
     * @see OidcSettings.Fields#responseMode
     */
    public void removeResponseMode() {
        super._map.remove("responseMode");
    }

    /**
     * Getter for responseMode
     * 
     * @see OidcSettings.Fields#responseMode
     */
    @Nullable
    public String getResponseMode(GetMode mode) {
        return getResponseMode();
    }

    /**
     * Getter for responseMode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#responseMode
     */
    @Nullable
    public String getResponseMode() {
        if (_responseModeField!= null) {
            return _responseModeField;
        } else {
            Object __rawValue = super._map.get("responseMode");
            _responseModeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _responseModeField;
        }
    }

    /**
     * Setter for responseMode
     * 
     * @see OidcSettings.Fields#responseMode
     */
    public OidcSettings setResponseMode(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResponseMode(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResponseMode();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "responseMode", value);
                    _responseModeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "responseMode", value);
                    _responseModeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for responseMode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#responseMode
     */
    public OidcSettings setResponseMode(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field responseMode of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "responseMode", value);
            _responseModeField = value;
        }
        return this;
    }

    /**
     * Existence checker for useNonce
     * 
     * @see OidcSettings.Fields#useNonce
     */
    public boolean hasUseNonce() {
        if (_useNonceField!= null) {
            return true;
        }
        return super._map.containsKey("useNonce");
    }

    /**
     * Remover for useNonce
     * 
     * @see OidcSettings.Fields#useNonce
     */
    public void removeUseNonce() {
        super._map.remove("useNonce");
    }

    /**
     * Getter for useNonce
     * 
     * @see OidcSettings.Fields#useNonce
     */
    @Nullable
    public Boolean isUseNonce(GetMode mode) {
        return isUseNonce();
    }

    /**
     * Getter for useNonce
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#useNonce
     */
    @Nullable
    public Boolean isUseNonce() {
        if (_useNonceField!= null) {
            return _useNonceField;
        } else {
            Object __rawValue = super._map.get("useNonce");
            _useNonceField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _useNonceField;
        }
    }

    /**
     * Setter for useNonce
     * 
     * @see OidcSettings.Fields#useNonce
     */
    public OidcSettings setUseNonce(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUseNonce(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUseNonce();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "useNonce", value);
                    _useNonceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "useNonce", value);
                    _useNonceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for useNonce
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#useNonce
     */
    public OidcSettings setUseNonce(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field useNonce of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "useNonce", value);
            _useNonceField = value;
        }
        return this;
    }

    /**
     * Setter for useNonce
     * 
     * @see OidcSettings.Fields#useNonce
     */
    public OidcSettings setUseNonce(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "useNonce", value);
        _useNonceField = value;
        return this;
    }

    /**
     * Existence checker for readTimeout
     * 
     * @see OidcSettings.Fields#readTimeout
     */
    public boolean hasReadTimeout() {
        if (_readTimeoutField!= null) {
            return true;
        }
        return super._map.containsKey("readTimeout");
    }

    /**
     * Remover for readTimeout
     * 
     * @see OidcSettings.Fields#readTimeout
     */
    public void removeReadTimeout() {
        super._map.remove("readTimeout");
    }

    /**
     * Getter for readTimeout
     * 
     * @see OidcSettings.Fields#readTimeout
     */
    @Nullable
    public Long getReadTimeout(GetMode mode) {
        return getReadTimeout();
    }

    /**
     * Getter for readTimeout
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#readTimeout
     */
    @Nullable
    public Long getReadTimeout() {
        if (_readTimeoutField!= null) {
            return _readTimeoutField;
        } else {
            Object __rawValue = super._map.get("readTimeout");
            _readTimeoutField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _readTimeoutField;
        }
    }

    /**
     * Setter for readTimeout
     * 
     * @see OidcSettings.Fields#readTimeout
     */
    public OidcSettings setReadTimeout(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setReadTimeout(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeReadTimeout();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "readTimeout", DataTemplateUtil.coerceLongInput(value));
                    _readTimeoutField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "readTimeout", DataTemplateUtil.coerceLongInput(value));
                    _readTimeoutField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for readTimeout
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#readTimeout
     */
    public OidcSettings setReadTimeout(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field readTimeout of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "readTimeout", DataTemplateUtil.coerceLongInput(value));
            _readTimeoutField = value;
        }
        return this;
    }

    /**
     * Setter for readTimeout
     * 
     * @see OidcSettings.Fields#readTimeout
     */
    public OidcSettings setReadTimeout(long value) {
        CheckedUtil.putWithoutChecking(super._map, "readTimeout", DataTemplateUtil.coerceLongInput(value));
        _readTimeoutField = value;
        return this;
    }

    /**
     * Existence checker for extractJwtAccessTokenClaims
     * 
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    public boolean hasExtractJwtAccessTokenClaims() {
        if (_extractJwtAccessTokenClaimsField!= null) {
            return true;
        }
        return super._map.containsKey("extractJwtAccessTokenClaims");
    }

    /**
     * Remover for extractJwtAccessTokenClaims
     * 
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    public void removeExtractJwtAccessTokenClaims() {
        super._map.remove("extractJwtAccessTokenClaims");
    }

    /**
     * Getter for extractJwtAccessTokenClaims
     * 
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    @Nullable
    public Boolean isExtractJwtAccessTokenClaims(GetMode mode) {
        return isExtractJwtAccessTokenClaims();
    }

    /**
     * Getter for extractJwtAccessTokenClaims
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    @Nullable
    public Boolean isExtractJwtAccessTokenClaims() {
        if (_extractJwtAccessTokenClaimsField!= null) {
            return _extractJwtAccessTokenClaimsField;
        } else {
            Object __rawValue = super._map.get("extractJwtAccessTokenClaims");
            _extractJwtAccessTokenClaimsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _extractJwtAccessTokenClaimsField;
        }
    }

    /**
     * Setter for extractJwtAccessTokenClaims
     * 
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    public OidcSettings setExtractJwtAccessTokenClaims(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExtractJwtAccessTokenClaims(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExtractJwtAccessTokenClaims();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extractJwtAccessTokenClaims", value);
                    _extractJwtAccessTokenClaimsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "extractJwtAccessTokenClaims", value);
                    _extractJwtAccessTokenClaimsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for extractJwtAccessTokenClaims
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    public OidcSettings setExtractJwtAccessTokenClaims(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extractJwtAccessTokenClaims of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extractJwtAccessTokenClaims", value);
            _extractJwtAccessTokenClaimsField = value;
        }
        return this;
    }

    /**
     * Setter for extractJwtAccessTokenClaims
     * 
     * @see OidcSettings.Fields#extractJwtAccessTokenClaims
     */
    public OidcSettings setExtractJwtAccessTokenClaims(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "extractJwtAccessTokenClaims", value);
        _extractJwtAccessTokenClaimsField = value;
        return this;
    }

    /**
     * Existence checker for preferredJwsAlgorithm
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    public boolean hasPreferredJwsAlgorithm() {
        if (_preferredJwsAlgorithmField!= null) {
            return true;
        }
        return super._map.containsKey("preferredJwsAlgorithm");
    }

    /**
     * Remover for preferredJwsAlgorithm
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    public void removePreferredJwsAlgorithm() {
        super._map.remove("preferredJwsAlgorithm");
    }

    /**
     * Getter for preferredJwsAlgorithm
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    @Nullable
    public String getPreferredJwsAlgorithm(GetMode mode) {
        return getPreferredJwsAlgorithm();
    }

    /**
     * Getter for preferredJwsAlgorithm
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    @Nullable
    public String getPreferredJwsAlgorithm() {
        if (_preferredJwsAlgorithmField!= null) {
            return _preferredJwsAlgorithmField;
        } else {
            Object __rawValue = super._map.get("preferredJwsAlgorithm");
            _preferredJwsAlgorithmField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _preferredJwsAlgorithmField;
        }
    }

    /**
     * Setter for preferredJwsAlgorithm
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    public OidcSettings setPreferredJwsAlgorithm(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPreferredJwsAlgorithm(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePreferredJwsAlgorithm();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm", value);
                    _preferredJwsAlgorithmField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm", value);
                    _preferredJwsAlgorithmField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for preferredJwsAlgorithm
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#preferredJwsAlgorithm
     */
    public OidcSettings setPreferredJwsAlgorithm(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field preferredJwsAlgorithm of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm", value);
            _preferredJwsAlgorithmField = value;
        }
        return this;
    }

    /**
     * Existence checker for preferredJwsAlgorithm2
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    public boolean hasPreferredJwsAlgorithm2() {
        if (_preferredJwsAlgorithm2Field!= null) {
            return true;
        }
        return super._map.containsKey("preferredJwsAlgorithm2");
    }

    /**
     * Remover for preferredJwsAlgorithm2
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    public void removePreferredJwsAlgorithm2() {
        super._map.remove("preferredJwsAlgorithm2");
    }

    /**
     * Getter for preferredJwsAlgorithm2
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    @Nullable
    public String getPreferredJwsAlgorithm2(GetMode mode) {
        return getPreferredJwsAlgorithm2();
    }

    /**
     * Getter for preferredJwsAlgorithm2
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    @Nullable
    public String getPreferredJwsAlgorithm2() {
        if (_preferredJwsAlgorithm2Field!= null) {
            return _preferredJwsAlgorithm2Field;
        } else {
            Object __rawValue = super._map.get("preferredJwsAlgorithm2");
            _preferredJwsAlgorithm2Field = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _preferredJwsAlgorithm2Field;
        }
    }

    /**
     * Setter for preferredJwsAlgorithm2
     * 
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    public OidcSettings setPreferredJwsAlgorithm2(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPreferredJwsAlgorithm2(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePreferredJwsAlgorithm2();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm2", value);
                    _preferredJwsAlgorithm2Field = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm2", value);
                    _preferredJwsAlgorithm2Field = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for preferredJwsAlgorithm2
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OidcSettings.Fields#preferredJwsAlgorithm2
     */
    public OidcSettings setPreferredJwsAlgorithm2(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field preferredJwsAlgorithm2 of com.linkedin.settings.global.OidcSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "preferredJwsAlgorithm2", value);
            _preferredJwsAlgorithm2Field = value;
        }
        return this;
    }

    @Override
    public OidcSettings clone()
        throws CloneNotSupportedException
    {
        OidcSettings __clone = ((OidcSettings) super.clone());
        __clone.__changeListener = new OidcSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OidcSettings copy()
        throws CloneNotSupportedException
    {
        OidcSettings __copy = ((OidcSettings) super.copy());
        __copy._responseModeField = null;
        __copy._clientIdField = null;
        __copy._jitProvisioningEnabledField = null;
        __copy._preProvisioningRequiredField = null;
        __copy._useNonceField = null;
        __copy._userNameClaimField = null;
        __copy._extractGroupsEnabledField = null;
        __copy._enabledField = null;
        __copy._groupsClaimField = null;
        __copy._responseTypeField = null;
        __copy._preferredJwsAlgorithmField = null;
        __copy._preferredJwsAlgorithm2Field = null;
        __copy._scopeField = null;
        __copy._readTimeoutField = null;
        __copy._clientSecretField = null;
        __copy._discoveryUriField = null;
        __copy._clientAuthenticationMethodField = null;
        __copy._extractJwtAccessTokenClaimsField = null;
        __copy._userNameClaimRegexField = null;
        __copy.__changeListener = new OidcSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OidcSettings __objectRef;

        private ChangeListener(OidcSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "responseMode":
                    __objectRef._responseModeField = null;
                    break;
                case "clientId":
                    __objectRef._clientIdField = null;
                    break;
                case "jitProvisioningEnabled":
                    __objectRef._jitProvisioningEnabledField = null;
                    break;
                case "preProvisioningRequired":
                    __objectRef._preProvisioningRequiredField = null;
                    break;
                case "useNonce":
                    __objectRef._useNonceField = null;
                    break;
                case "userNameClaim":
                    __objectRef._userNameClaimField = null;
                    break;
                case "extractGroupsEnabled":
                    __objectRef._extractGroupsEnabledField = null;
                    break;
                case "enabled":
                    __objectRef._enabledField = null;
                    break;
                case "groupsClaim":
                    __objectRef._groupsClaimField = null;
                    break;
                case "responseType":
                    __objectRef._responseTypeField = null;
                    break;
                case "preferredJwsAlgorithm":
                    __objectRef._preferredJwsAlgorithmField = null;
                    break;
                case "preferredJwsAlgorithm2":
                    __objectRef._preferredJwsAlgorithm2Field = null;
                    break;
                case "scope":
                    __objectRef._scopeField = null;
                    break;
                case "readTimeout":
                    __objectRef._readTimeoutField = null;
                    break;
                case "clientSecret":
                    __objectRef._clientSecretField = null;
                    break;
                case "discoveryUri":
                    __objectRef._discoveryUriField = null;
                    break;
                case "clientAuthenticationMethod":
                    __objectRef._clientAuthenticationMethodField = null;
                    break;
                case "extractJwtAccessTokenClaims":
                    __objectRef._extractJwtAccessTokenClaimsField = null;
                    break;
                case "userNameClaimRegex":
                    __objectRef._userNameClaimRegexField = null;
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
         * Whether OIDC SSO is enabled.
         * 
         */
        public PathSpec enabled() {
            return new PathSpec(getPathComponents(), "enabled");
        }

        /**
         * Unique client id issued by the identity provider.
         * 
         */
        public PathSpec clientId() {
            return new PathSpec(getPathComponents(), "clientId");
        }

        /**
         * Unique client secret issued by the identity provider.
         * 
         */
        public PathSpec clientSecret() {
            return new PathSpec(getPathComponents(), "clientSecret");
        }

        /**
         * The IdP OIDC discovery url.
         * 
         */
        public PathSpec discoveryUri() {
            return new PathSpec(getPathComponents(), "discoveryUri");
        }

        /**
         * ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to "preferred_username".
         * 
         */
        public PathSpec userNameClaim() {
            return new PathSpec(getPathComponents(), "userNameClaim");
        }

        /**
         * ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).
         * 
         */
        public PathSpec userNameClaimRegex() {
            return new PathSpec(getPathComponents(), "userNameClaimRegex");
        }

        /**
         * ADVANCED. String representing the requested scope from the IdP. Defaults to "oidc email profile".
         * 
         */
        public PathSpec scope() {
            return new PathSpec(getPathComponents(), "scope");
        }

        /**
         * ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to "client_secret_basic".
         * 
         */
        public PathSpec clientAuthenticationMethod() {
            return new PathSpec(getPathComponents(), "clientAuthenticationMethod");
        }

        /**
         * ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.
         * 
         */
        public PathSpec jitProvisioningEnabled() {
            return new PathSpec(getPathComponents(), "jitProvisioningEnabled");
        }

        /**
         * ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.
         * 
         */
        public PathSpec preProvisioningRequired() {
            return new PathSpec(getPathComponents(), "preProvisioningRequired");
        }

        /**
         * ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.
         * 
         */
        public PathSpec extractGroupsEnabled() {
            return new PathSpec(getPathComponents(), "extractGroupsEnabled");
        }

        /**
         * ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.
         * 
         */
        public PathSpec groupsClaim() {
            return new PathSpec(getPathComponents(), "groupsClaim");
        }

        /**
         * ADVANCED. Response type.
         * 
         */
        public PathSpec responseType() {
            return new PathSpec(getPathComponents(), "responseType");
        }

        /**
         * ADVANCED. Response mode.
         * 
         */
        public PathSpec responseMode() {
            return new PathSpec(getPathComponents(), "responseMode");
        }

        /**
         * ADVANCED. Use Nonce.
         * 
         */
        public PathSpec useNonce() {
            return new PathSpec(getPathComponents(), "useNonce");
        }

        /**
         * ADVANCED. Read timeout.
         * 
         */
        public PathSpec readTimeout() {
            return new PathSpec(getPathComponents(), "readTimeout");
        }

        /**
         * ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.
         * 
         */
        public PathSpec extractJwtAccessTokenClaims() {
            return new PathSpec(getPathComponents(), "extractJwtAccessTokenClaims");
        }

        /**
         *  ADVANCED. Which jws algorithm to use. Unused.
         * 
         */
        public PathSpec preferredJwsAlgorithm() {
            return new PathSpec(getPathComponents(), "preferredJwsAlgorithm");
        }

        /**
         *  ADVANCED. Which jws algorithm to use.
         * 
         */
        public PathSpec preferredJwsAlgorithm2() {
            return new PathSpec(getPathComponents(), "preferredJwsAlgorithm2");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
        }

        /**
         * Whether OIDC SSO is enabled.
         * 
         */
        public OidcSettings.ProjectionMask withEnabled() {
            getDataMap().put("enabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique client id issued by the identity provider.
         * 
         */
        public OidcSettings.ProjectionMask withClientId() {
            getDataMap().put("clientId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique client secret issued by the identity provider.
         * 
         */
        public OidcSettings.ProjectionMask withClientSecret() {
            getDataMap().put("clientSecret", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The IdP OIDC discovery url.
         * 
         */
        public OidcSettings.ProjectionMask withDiscoveryUri() {
            getDataMap().put("discoveryUri", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to "preferred_username".
         * 
         */
        public OidcSettings.ProjectionMask withUserNameClaim() {
            getDataMap().put("userNameClaim", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).
         * 
         */
        public OidcSettings.ProjectionMask withUserNameClaimRegex() {
            getDataMap().put("userNameClaimRegex", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. String representing the requested scope from the IdP. Defaults to "oidc email profile".
         * 
         */
        public OidcSettings.ProjectionMask withScope() {
            getDataMap().put("scope", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to "client_secret_basic".
         * 
         */
        public OidcSettings.ProjectionMask withClientAuthenticationMethod() {
            getDataMap().put("clientAuthenticationMethod", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.
         * 
         */
        public OidcSettings.ProjectionMask withJitProvisioningEnabled() {
            getDataMap().put("jitProvisioningEnabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.
         * 
         */
        public OidcSettings.ProjectionMask withPreProvisioningRequired() {
            getDataMap().put("preProvisioningRequired", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.
         * 
         */
        public OidcSettings.ProjectionMask withExtractGroupsEnabled() {
            getDataMap().put("extractGroupsEnabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.
         * 
         */
        public OidcSettings.ProjectionMask withGroupsClaim() {
            getDataMap().put("groupsClaim", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Response type.
         * 
         */
        public OidcSettings.ProjectionMask withResponseType() {
            getDataMap().put("responseType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Response mode.
         * 
         */
        public OidcSettings.ProjectionMask withResponseMode() {
            getDataMap().put("responseMode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Use Nonce.
         * 
         */
        public OidcSettings.ProjectionMask withUseNonce() {
            getDataMap().put("useNonce", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Read timeout.
         * 
         */
        public OidcSettings.ProjectionMask withReadTimeout() {
            getDataMap().put("readTimeout", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.
         * 
         */
        public OidcSettings.ProjectionMask withExtractJwtAccessTokenClaims() {
            getDataMap().put("extractJwtAccessTokenClaims", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  ADVANCED. Which jws algorithm to use. Unused.
         * 
         */
        public OidcSettings.ProjectionMask withPreferredJwsAlgorithm() {
            getDataMap().put("preferredJwsAlgorithm", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  ADVANCED. Which jws algorithm to use.
         * 
         */
        public OidcSettings.ProjectionMask withPreferredJwsAlgorithm2() {
            getDataMap().put("preferredJwsAlgorithm2", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
