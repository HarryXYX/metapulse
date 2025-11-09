
package com.linkedin.settings.global;

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
 * SSO Integrations, supported on the UI.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/SsoSettings.pdl.")
public class SsoSettings
    extends RecordTemplate
{

    private final static SsoSettings.Fields _fields = new SsoSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**SSO Integrations, supported on the UI.*/record SsoSettings{/**Auth base URL.*/baseUrl:string/**Optional OIDC SSO settings.*/oidcSettings:optional/**Settings for OIDC SSO integration.*/record OidcSettings{/**Whether OIDC SSO is enabled.*/enabled:boolean/**Unique client id issued by the identity provider.*/clientId:string/**Unique client secret issued by the identity provider.*/clientSecret:string/**The IdP OIDC discovery url.*/discoveryUri:string/**ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to \"preferred_username\".*/userNameClaim:optional string/**ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).*/userNameClaimRegex:optional string/**ADVANCED. String representing the requested scope from the IdP. Defaults to \"oidc email profile\".*/scope:optional string/**ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to \"client_secret_basic\".*/clientAuthenticationMethod:optional string/**ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.*/jitProvisioningEnabled:optional boolean/**ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.*/preProvisioningRequired:optional boolean/**ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.*/extractGroupsEnabled:optional boolean/**ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.*/groupsClaim:optional string/**ADVANCED. Response type.*/responseType:optional string/**ADVANCED. Response mode.*/responseMode:optional string/**ADVANCED. Use Nonce.*/useNonce:optional boolean/**ADVANCED. Read timeout.*/readTimeout:optional long/**ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.*/extractJwtAccessTokenClaims:optional boolean/** ADVANCED. Which jws algorithm to use. Unused.*/preferredJwsAlgorithm:optional string/** ADVANCED. Which jws algorithm to use.*/preferredJwsAlgorithm2:optional string}}", SchemaFormatType.PDL));
    private String _baseUrlField = null;
    private OidcSettings _oidcSettingsField = null;
    private SsoSettings.ChangeListener __changeListener = new SsoSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_BaseUrl = SCHEMA.getField("baseUrl");
    private final static RecordDataSchema.Field FIELD_OidcSettings = SCHEMA.getField("oidcSettings");

    public SsoSettings() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SsoSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SsoSettings.Fields fields() {
        return _fields;
    }

    public static SsoSettings.ProjectionMask createMask() {
        return new SsoSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for baseUrl
     * 
     * @see SsoSettings.Fields#baseUrl
     */
    public boolean hasBaseUrl() {
        if (_baseUrlField!= null) {
            return true;
        }
        return super._map.containsKey("baseUrl");
    }

    /**
     * Remover for baseUrl
     * 
     * @see SsoSettings.Fields#baseUrl
     */
    public void removeBaseUrl() {
        super._map.remove("baseUrl");
    }

    /**
     * Getter for baseUrl
     * 
     * @see SsoSettings.Fields#baseUrl
     */
    @Nullable
    public String getBaseUrl(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBaseUrl();
            case DEFAULT:
            case NULL:
                if (_baseUrlField!= null) {
                    return _baseUrlField;
                } else {
                    Object __rawValue = super._map.get("baseUrl");
                    _baseUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _baseUrlField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for baseUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SsoSettings.Fields#baseUrl
     */
    @Nonnull
    public String getBaseUrl() {
        if (_baseUrlField!= null) {
            return _baseUrlField;
        } else {
            Object __rawValue = super._map.get("baseUrl");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("baseUrl");
            }
            _baseUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _baseUrlField;
        }
    }

    /**
     * Setter for baseUrl
     * 
     * @see SsoSettings.Fields#baseUrl
     */
    public SsoSettings setBaseUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBaseUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field baseUrl of com.linkedin.settings.global.SsoSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "baseUrl", value);
                    _baseUrlField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBaseUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "baseUrl", value);
                    _baseUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "baseUrl", value);
                    _baseUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for baseUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SsoSettings.Fields#baseUrl
     */
    public SsoSettings setBaseUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field baseUrl of com.linkedin.settings.global.SsoSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "baseUrl", value);
            _baseUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for oidcSettings
     * 
     * @see SsoSettings.Fields#oidcSettings
     */
    public boolean hasOidcSettings() {
        if (_oidcSettingsField!= null) {
            return true;
        }
        return super._map.containsKey("oidcSettings");
    }

    /**
     * Remover for oidcSettings
     * 
     * @see SsoSettings.Fields#oidcSettings
     */
    public void removeOidcSettings() {
        super._map.remove("oidcSettings");
    }

    /**
     * Getter for oidcSettings
     * 
     * @see SsoSettings.Fields#oidcSettings
     */
    @Nullable
    public OidcSettings getOidcSettings(GetMode mode) {
        return getOidcSettings();
    }

    /**
     * Getter for oidcSettings
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SsoSettings.Fields#oidcSettings
     */
    @Nullable
    public OidcSettings getOidcSettings() {
        if (_oidcSettingsField!= null) {
            return _oidcSettingsField;
        } else {
            Object __rawValue = super._map.get("oidcSettings");
            _oidcSettingsField = ((__rawValue == null)?null:new OidcSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _oidcSettingsField;
        }
    }

    /**
     * Setter for oidcSettings
     * 
     * @see SsoSettings.Fields#oidcSettings
     */
    public SsoSettings setOidcSettings(
        @Nullable
        OidcSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOidcSettings(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOidcSettings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "oidcSettings", value.data());
                    _oidcSettingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "oidcSettings", value.data());
                    _oidcSettingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for oidcSettings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SsoSettings.Fields#oidcSettings
     */
    public SsoSettings setOidcSettings(
        @Nonnull
        OidcSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field oidcSettings of com.linkedin.settings.global.SsoSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "oidcSettings", value.data());
            _oidcSettingsField = value;
        }
        return this;
    }

    @Override
    public SsoSettings clone()
        throws CloneNotSupportedException
    {
        SsoSettings __clone = ((SsoSettings) super.clone());
        __clone.__changeListener = new SsoSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SsoSettings copy()
        throws CloneNotSupportedException
    {
        SsoSettings __copy = ((SsoSettings) super.copy());
        __copy._baseUrlField = null;
        __copy._oidcSettingsField = null;
        __copy.__changeListener = new SsoSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SsoSettings __objectRef;

        private ChangeListener(SsoSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "baseUrl":
                    __objectRef._baseUrlField = null;
                    break;
                case "oidcSettings":
                    __objectRef._oidcSettingsField = null;
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
         * Auth base URL.
         * 
         */
        public PathSpec baseUrl() {
            return new PathSpec(getPathComponents(), "baseUrl");
        }

        /**
         * Optional OIDC SSO settings.
         * 
         */
        public com.linkedin.settings.global.OidcSettings.Fields oidcSettings() {
            return new com.linkedin.settings.global.OidcSettings.Fields(getPathComponents(), "oidcSettings");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.settings.global.OidcSettings.ProjectionMask _oidcSettingsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Auth base URL.
         * 
         */
        public SsoSettings.ProjectionMask withBaseUrl() {
            getDataMap().put("baseUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional OIDC SSO settings.
         * 
         */
        public SsoSettings.ProjectionMask withOidcSettings(Function<com.linkedin.settings.global.OidcSettings.ProjectionMask, com.linkedin.settings.global.OidcSettings.ProjectionMask> nestedMask) {
            _oidcSettingsMask = nestedMask.apply(((_oidcSettingsMask == null)?OidcSettings.createMask():_oidcSettingsMask));
            getDataMap().put("oidcSettings", _oidcSettingsMask.getDataMap());
            return this;
        }

        /**
         * Optional OIDC SSO settings.
         * 
         */
        public SsoSettings.ProjectionMask withOidcSettings() {
            _oidcSettingsMask = null;
            getDataMap().put("oidcSettings", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
