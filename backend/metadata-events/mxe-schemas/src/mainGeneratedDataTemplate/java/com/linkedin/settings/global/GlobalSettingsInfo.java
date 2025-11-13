
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
import com.linkedin.data.template.SetMode;


/**
 * DataHub Global platform settings. Careful - these should not be modified by the outside world!
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/global/GlobalSettingsInfo.pdl.")
public class GlobalSettingsInfo
    extends RecordTemplate
{

    private final static GlobalSettingsInfo.Fields _fields = new GlobalSettingsInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**DataHub Global platform settings. Careful - these should not be modified by the outside world!*/@Aspect.name=\"globalSettingsInfo\"record GlobalSettingsInfo{/**SSO integrations between DataHub and identity providers*/sso:optional/**SSO Integrations, supported on the UI.*/record SsoSettings{/**Auth base URL.*/baseUrl:string/**Optional OIDC SSO settings.*/oidcSettings:optional/**Settings for OIDC SSO integration.*/record OidcSettings{/**Whether OIDC SSO is enabled.*/enabled:boolean/**Unique client id issued by the identity provider.*/clientId:string/**Unique client secret issued by the identity provider.*/clientSecret:string/**The IdP OIDC discovery url.*/discoveryUri:string/**ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to \"preferred_username\".*/userNameClaim:optional string/**ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).*/userNameClaimRegex:optional string/**ADVANCED. String representing the requested scope from the IdP. Defaults to \"oidc email profile\".*/scope:optional string/**ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to \"client_secret_basic\".*/clientAuthenticationMethod:optional string/**ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.*/jitProvisioningEnabled:optional boolean/**ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.*/preProvisioningRequired:optional boolean/**ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.*/extractGroupsEnabled:optional boolean/**ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.*/groupsClaim:optional string/**ADVANCED. Response type.*/responseType:optional string/**ADVANCED. Response mode.*/responseMode:optional string/**ADVANCED. Use Nonce.*/useNonce:optional boolean/**ADVANCED. Read timeout.*/readTimeout:optional long/**ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.*/extractJwtAccessTokenClaims:optional boolean/** ADVANCED. Which jws algorithm to use. Unused.*/preferredJwsAlgorithm:optional string/** ADVANCED. Which jws algorithm to use.*/preferredJwsAlgorithm2:optional string}}/**Settings related to the oauth authentication provider*/oauth:optional/**Trust oauth providers to use for authentication.*/record OAuthSettings{/**Trusted OAuth Providers*/providers:array[/**An OAuth Provider. This provides information required to validate inbound\nrequests with OAuth 2.0 bearer tokens.*/record OAuthProvider{/**Whether this OAuth provider is enabled.*/enabled:boolean/**The name of this OAuth provider. This is used for display purposes only.*/name:string/**The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.*/jwksUri:optional string/**The expected issuer (iss) claim in the JWTs issued by this OAuth provider.*/issuer:string/**The expected audience (aud) claim in the JWTs issued by this OAuth provider.*/audience:string/**The JWT signing algorithm required for this provider.\nPrevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256*/algorithm:string=\"RS256\"/**The JWT claim to use as the user identifier for this provider.\nDifferent providers use different claims (sub, email, preferred_username, etc.)*/userIdClaim:string=\"sub\"}]}/**Settings related to the Views Feature*/views:optional/**Settings for DataHub Views feature.*/record GlobalViewsSettings{/**The default View for the instance, or organization.*/@Relationship={\"entityTypes\":[\"dataHubView\"],\"name\":\"viewedWith\"}defaultView:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Settings related to the documentation propagation feature*/docPropagation:optional record DocPropagationFeatureSettings includes/**A standardized settings template for a feature.*/record FeatureSettings{enabled:boolean/**The configuration for the feature, in JSON format.*/config:optional string/**The version of the configuration schema that has been used to serialize\n       the config.\nIf not provided, the version is assumed to be the latest version.*/configVersion:optional string}{columnPropagationEnabled:boolean=true}={\"enabled\":true,\"columnPropagationEnabled\":true}/**Global settings related to the home page for an instance*/homePage:optional/**Global settings related to the home page for an instance*/record GlobalHomePageSettings{/**The urn that will be rendered in the UI by default for all users*/defaultTemplate:com.linkedin.common.Urn}/**Settings related to applications. If not enabled, applications won't show up in navigation*/applications:optional record ApplicationsSettings includes FeatureSettings{}}", SchemaFormatType.PDL));
    private SsoSettings _ssoField = null;
    private OAuthSettings _oauthField = null;
    private GlobalViewsSettings _viewsField = null;
    private DocPropagationFeatureSettings _docPropagationField = null;
    private GlobalHomePageSettings _homePageField = null;
    private ApplicationsSettings _applicationsField = null;
    private GlobalSettingsInfo.ChangeListener __changeListener = new GlobalSettingsInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Sso = SCHEMA.getField("sso");
    private final static RecordDataSchema.Field FIELD_Oauth = SCHEMA.getField("oauth");
    private final static RecordDataSchema.Field FIELD_Views = SCHEMA.getField("views");
    private final static RecordDataSchema.Field FIELD_DocPropagation = SCHEMA.getField("docPropagation");
    private final static DocPropagationFeatureSettings DEFAULT_DocPropagation;
    private final static RecordDataSchema.Field FIELD_HomePage = SCHEMA.getField("homePage");
    private final static RecordDataSchema.Field FIELD_Applications = SCHEMA.getField("applications");

    static {
        DEFAULT_DocPropagation = ((FIELD_DocPropagation.getDefault() == null)?null:new DocPropagationFeatureSettings(DataTemplateUtil.castOrThrow(FIELD_DocPropagation.getDefault(), DataMap.class)));
    }

    public GlobalSettingsInfo() {
        super(new DataMap(8, 0.75F), SCHEMA, 8);
        addChangeListener(__changeListener);
    }

    public GlobalSettingsInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlobalSettingsInfo.Fields fields() {
        return _fields;
    }

    public static GlobalSettingsInfo.ProjectionMask createMask() {
        return new GlobalSettingsInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for sso
     * 
     * @see GlobalSettingsInfo.Fields#sso
     */
    public boolean hasSso() {
        if (_ssoField!= null) {
            return true;
        }
        return super._map.containsKey("sso");
    }

    /**
     * Remover for sso
     * 
     * @see GlobalSettingsInfo.Fields#sso
     */
    public void removeSso() {
        super._map.remove("sso");
    }

    /**
     * Getter for sso
     * 
     * @see GlobalSettingsInfo.Fields#sso
     */
    @Nullable
    public SsoSettings getSso(GetMode mode) {
        return getSso();
    }

    /**
     * Getter for sso
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#sso
     */
    @Nullable
    public SsoSettings getSso() {
        if (_ssoField!= null) {
            return _ssoField;
        } else {
            Object __rawValue = super._map.get("sso");
            _ssoField = ((__rawValue == null)?null:new SsoSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _ssoField;
        }
    }

    /**
     * Setter for sso
     * 
     * @see GlobalSettingsInfo.Fields#sso
     */
    public GlobalSettingsInfo setSso(
        @Nullable
        SsoSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSso(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSso();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sso", value.data());
                    _ssoField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sso", value.data());
                    _ssoField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sso
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#sso
     */
    public GlobalSettingsInfo setSso(
        @Nonnull
        SsoSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sso of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sso", value.data());
            _ssoField = value;
        }
        return this;
    }

    /**
     * Existence checker for oauth
     * 
     * @see GlobalSettingsInfo.Fields#oauth
     */
    public boolean hasOauth() {
        if (_oauthField!= null) {
            return true;
        }
        return super._map.containsKey("oauth");
    }

    /**
     * Remover for oauth
     * 
     * @see GlobalSettingsInfo.Fields#oauth
     */
    public void removeOauth() {
        super._map.remove("oauth");
    }

    /**
     * Getter for oauth
     * 
     * @see GlobalSettingsInfo.Fields#oauth
     */
    @Nullable
    public OAuthSettings getOauth(GetMode mode) {
        return getOauth();
    }

    /**
     * Getter for oauth
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#oauth
     */
    @Nullable
    public OAuthSettings getOauth() {
        if (_oauthField!= null) {
            return _oauthField;
        } else {
            Object __rawValue = super._map.get("oauth");
            _oauthField = ((__rawValue == null)?null:new OAuthSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _oauthField;
        }
    }

    /**
     * Setter for oauth
     * 
     * @see GlobalSettingsInfo.Fields#oauth
     */
    public GlobalSettingsInfo setOauth(
        @Nullable
        OAuthSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOauth(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOauth();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "oauth", value.data());
                    _oauthField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "oauth", value.data());
                    _oauthField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for oauth
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#oauth
     */
    public GlobalSettingsInfo setOauth(
        @Nonnull
        OAuthSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field oauth of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "oauth", value.data());
            _oauthField = value;
        }
        return this;
    }

    /**
     * Existence checker for views
     * 
     * @see GlobalSettingsInfo.Fields#views
     */
    public boolean hasViews() {
        if (_viewsField!= null) {
            return true;
        }
        return super._map.containsKey("views");
    }

    /**
     * Remover for views
     * 
     * @see GlobalSettingsInfo.Fields#views
     */
    public void removeViews() {
        super._map.remove("views");
    }

    /**
     * Getter for views
     * 
     * @see GlobalSettingsInfo.Fields#views
     */
    @Nullable
    public GlobalViewsSettings getViews(GetMode mode) {
        return getViews();
    }

    /**
     * Getter for views
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#views
     */
    @Nullable
    public GlobalViewsSettings getViews() {
        if (_viewsField!= null) {
            return _viewsField;
        } else {
            Object __rawValue = super._map.get("views");
            _viewsField = ((__rawValue == null)?null:new GlobalViewsSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _viewsField;
        }
    }

    /**
     * Setter for views
     * 
     * @see GlobalSettingsInfo.Fields#views
     */
    public GlobalSettingsInfo setViews(
        @Nullable
        GlobalViewsSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setViews(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeViews();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "views", value.data());
                    _viewsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "views", value.data());
                    _viewsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for views
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#views
     */
    public GlobalSettingsInfo setViews(
        @Nonnull
        GlobalViewsSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field views of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "views", value.data());
            _viewsField = value;
        }
        return this;
    }

    /**
     * Existence checker for docPropagation
     * 
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    public boolean hasDocPropagation() {
        if (_docPropagationField!= null) {
            return true;
        }
        return super._map.containsKey("docPropagation");
    }

    /**
     * Remover for docPropagation
     * 
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    public void removeDocPropagation() {
        super._map.remove("docPropagation");
    }

    /**
     * Getter for docPropagation
     * 
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    @Nullable
    public DocPropagationFeatureSettings getDocPropagation(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDocPropagation();
            case NULL:
                if (_docPropagationField!= null) {
                    return _docPropagationField;
                } else {
                    Object __rawValue = super._map.get("docPropagation");
                    _docPropagationField = ((__rawValue == null)?null:new DocPropagationFeatureSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _docPropagationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for docPropagation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    @Nullable
    public DocPropagationFeatureSettings getDocPropagation() {
        if (_docPropagationField!= null) {
            return _docPropagationField;
        } else {
            Object __rawValue = super._map.get("docPropagation");
            if (__rawValue == null) {
                return DEFAULT_DocPropagation;
            }
            _docPropagationField = ((__rawValue == null)?null:new DocPropagationFeatureSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _docPropagationField;
        }
    }

    /**
     * Setter for docPropagation
     * 
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    public GlobalSettingsInfo setDocPropagation(
        @Nullable
        DocPropagationFeatureSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocPropagation(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDocPropagation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "docPropagation", value.data());
                    _docPropagationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "docPropagation", value.data());
                    _docPropagationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for docPropagation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#docPropagation
     */
    public GlobalSettingsInfo setDocPropagation(
        @Nonnull
        DocPropagationFeatureSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field docPropagation of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "docPropagation", value.data());
            _docPropagationField = value;
        }
        return this;
    }

    /**
     * Existence checker for homePage
     * 
     * @see GlobalSettingsInfo.Fields#homePage
     */
    public boolean hasHomePage() {
        if (_homePageField!= null) {
            return true;
        }
        return super._map.containsKey("homePage");
    }

    /**
     * Remover for homePage
     * 
     * @see GlobalSettingsInfo.Fields#homePage
     */
    public void removeHomePage() {
        super._map.remove("homePage");
    }

    /**
     * Getter for homePage
     * 
     * @see GlobalSettingsInfo.Fields#homePage
     */
    @Nullable
    public GlobalHomePageSettings getHomePage(GetMode mode) {
        return getHomePage();
    }

    /**
     * Getter for homePage
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#homePage
     */
    @Nullable
    public GlobalHomePageSettings getHomePage() {
        if (_homePageField!= null) {
            return _homePageField;
        } else {
            Object __rawValue = super._map.get("homePage");
            _homePageField = ((__rawValue == null)?null:new GlobalHomePageSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _homePageField;
        }
    }

    /**
     * Setter for homePage
     * 
     * @see GlobalSettingsInfo.Fields#homePage
     */
    public GlobalSettingsInfo setHomePage(
        @Nullable
        GlobalHomePageSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHomePage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHomePage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
                    _homePageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
                    _homePageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for homePage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#homePage
     */
    public GlobalSettingsInfo setHomePage(
        @Nonnull
        GlobalHomePageSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field homePage of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
            _homePageField = value;
        }
        return this;
    }

    /**
     * Existence checker for applications
     * 
     * @see GlobalSettingsInfo.Fields#applications
     */
    public boolean hasApplications() {
        if (_applicationsField!= null) {
            return true;
        }
        return super._map.containsKey("applications");
    }

    /**
     * Remover for applications
     * 
     * @see GlobalSettingsInfo.Fields#applications
     */
    public void removeApplications() {
        super._map.remove("applications");
    }

    /**
     * Getter for applications
     * 
     * @see GlobalSettingsInfo.Fields#applications
     */
    @Nullable
    public ApplicationsSettings getApplications(GetMode mode) {
        return getApplications();
    }

    /**
     * Getter for applications
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlobalSettingsInfo.Fields#applications
     */
    @Nullable
    public ApplicationsSettings getApplications() {
        if (_applicationsField!= null) {
            return _applicationsField;
        } else {
            Object __rawValue = super._map.get("applications");
            _applicationsField = ((__rawValue == null)?null:new ApplicationsSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _applicationsField;
        }
    }

    /**
     * Setter for applications
     * 
     * @see GlobalSettingsInfo.Fields#applications
     */
    public GlobalSettingsInfo setApplications(
        @Nullable
        ApplicationsSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setApplications(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeApplications();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
                    _applicationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
                    _applicationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for applications
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalSettingsInfo.Fields#applications
     */
    public GlobalSettingsInfo setApplications(
        @Nonnull
        ApplicationsSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field applications of com.linkedin.settings.global.GlobalSettingsInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "applications", value.data());
            _applicationsField = value;
        }
        return this;
    }

    @Override
    public GlobalSettingsInfo clone()
        throws CloneNotSupportedException
    {
        GlobalSettingsInfo __clone = ((GlobalSettingsInfo) super.clone());
        __clone.__changeListener = new GlobalSettingsInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlobalSettingsInfo copy()
        throws CloneNotSupportedException
    {
        GlobalSettingsInfo __copy = ((GlobalSettingsInfo) super.copy());
        __copy._docPropagationField = null;
        __copy._oauthField = null;
        __copy._homePageField = null;
        __copy._ssoField = null;
        __copy._viewsField = null;
        __copy._applicationsField = null;
        __copy.__changeListener = new GlobalSettingsInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlobalSettingsInfo __objectRef;

        private ChangeListener(GlobalSettingsInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "docPropagation":
                    __objectRef._docPropagationField = null;
                    break;
                case "oauth":
                    __objectRef._oauthField = null;
                    break;
                case "homePage":
                    __objectRef._homePageField = null;
                    break;
                case "sso":
                    __objectRef._ssoField = null;
                    break;
                case "views":
                    __objectRef._viewsField = null;
                    break;
                case "applications":
                    __objectRef._applicationsField = null;
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
         * SSO integrations between DataHub and identity providers
         * 
         */
        public com.linkedin.settings.global.SsoSettings.Fields sso() {
            return new com.linkedin.settings.global.SsoSettings.Fields(getPathComponents(), "sso");
        }

        /**
         * Settings related to the oauth authentication provider
         * 
         */
        public com.linkedin.settings.global.OAuthSettings.Fields oauth() {
            return new com.linkedin.settings.global.OAuthSettings.Fields(getPathComponents(), "oauth");
        }

        /**
         * Settings related to the Views Feature
         * 
         */
        public com.linkedin.settings.global.GlobalViewsSettings.Fields views() {
            return new com.linkedin.settings.global.GlobalViewsSettings.Fields(getPathComponents(), "views");
        }

        /**
         * Settings related to the documentation propagation feature
         * 
         */
        public com.linkedin.settings.global.DocPropagationFeatureSettings.Fields docPropagation() {
            return new com.linkedin.settings.global.DocPropagationFeatureSettings.Fields(getPathComponents(), "docPropagation");
        }

        /**
         * Global settings related to the home page for an instance
         * 
         */
        public com.linkedin.settings.global.GlobalHomePageSettings.Fields homePage() {
            return new com.linkedin.settings.global.GlobalHomePageSettings.Fields(getPathComponents(), "homePage");
        }

        /**
         * Settings related to applications. If not enabled, applications won't show up in navigation
         * 
         */
        public com.linkedin.settings.global.ApplicationsSettings.Fields applications() {
            return new com.linkedin.settings.global.ApplicationsSettings.Fields(getPathComponents(), "applications");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.settings.global.SsoSettings.ProjectionMask _ssoMask;
        private com.linkedin.settings.global.OAuthSettings.ProjectionMask _oauthMask;
        private com.linkedin.settings.global.GlobalViewsSettings.ProjectionMask _viewsMask;
        private com.linkedin.settings.global.DocPropagationFeatureSettings.ProjectionMask _docPropagationMask;
        private com.linkedin.settings.global.GlobalHomePageSettings.ProjectionMask _homePageMask;
        private com.linkedin.settings.global.ApplicationsSettings.ProjectionMask _applicationsMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * SSO integrations between DataHub and identity providers
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withSso(Function<com.linkedin.settings.global.SsoSettings.ProjectionMask, com.linkedin.settings.global.SsoSettings.ProjectionMask> nestedMask) {
            _ssoMask = nestedMask.apply(((_ssoMask == null)?SsoSettings.createMask():_ssoMask));
            getDataMap().put("sso", _ssoMask.getDataMap());
            return this;
        }

        /**
         * SSO integrations between DataHub and identity providers
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withSso() {
            _ssoMask = null;
            getDataMap().put("sso", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings related to the oauth authentication provider
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withOauth(Function<com.linkedin.settings.global.OAuthSettings.ProjectionMask, com.linkedin.settings.global.OAuthSettings.ProjectionMask> nestedMask) {
            _oauthMask = nestedMask.apply(((_oauthMask == null)?OAuthSettings.createMask():_oauthMask));
            getDataMap().put("oauth", _oauthMask.getDataMap());
            return this;
        }

        /**
         * Settings related to the oauth authentication provider
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withOauth() {
            _oauthMask = null;
            getDataMap().put("oauth", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings related to the Views Feature
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withViews(Function<com.linkedin.settings.global.GlobalViewsSettings.ProjectionMask, com.linkedin.settings.global.GlobalViewsSettings.ProjectionMask> nestedMask) {
            _viewsMask = nestedMask.apply(((_viewsMask == null)?GlobalViewsSettings.createMask():_viewsMask));
            getDataMap().put("views", _viewsMask.getDataMap());
            return this;
        }

        /**
         * Settings related to the Views Feature
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withViews() {
            _viewsMask = null;
            getDataMap().put("views", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings related to the documentation propagation feature
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withDocPropagation(Function<com.linkedin.settings.global.DocPropagationFeatureSettings.ProjectionMask, com.linkedin.settings.global.DocPropagationFeatureSettings.ProjectionMask> nestedMask) {
            _docPropagationMask = nestedMask.apply(((_docPropagationMask == null)?DocPropagationFeatureSettings.createMask():_docPropagationMask));
            getDataMap().put("docPropagation", _docPropagationMask.getDataMap());
            return this;
        }

        /**
         * Settings related to the documentation propagation feature
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withDocPropagation() {
            _docPropagationMask = null;
            getDataMap().put("docPropagation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Global settings related to the home page for an instance
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withHomePage(Function<com.linkedin.settings.global.GlobalHomePageSettings.ProjectionMask, com.linkedin.settings.global.GlobalHomePageSettings.ProjectionMask> nestedMask) {
            _homePageMask = nestedMask.apply(((_homePageMask == null)?GlobalHomePageSettings.createMask():_homePageMask));
            getDataMap().put("homePage", _homePageMask.getDataMap());
            return this;
        }

        /**
         * Global settings related to the home page for an instance
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withHomePage() {
            _homePageMask = null;
            getDataMap().put("homePage", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings related to applications. If not enabled, applications won't show up in navigation
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withApplications(Function<com.linkedin.settings.global.ApplicationsSettings.ProjectionMask, com.linkedin.settings.global.ApplicationsSettings.ProjectionMask> nestedMask) {
            _applicationsMask = nestedMask.apply(((_applicationsMask == null)?ApplicationsSettings.createMask():_applicationsMask));
            getDataMap().put("applications", _applicationsMask.getDataMap());
            return this;
        }

        /**
         * Settings related to applications. If not enabled, applications won't show up in navigation
         * 
         */
        public GlobalSettingsInfo.ProjectionMask withApplications() {
            _applicationsMask = null;
            getDataMap().put("applications", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
