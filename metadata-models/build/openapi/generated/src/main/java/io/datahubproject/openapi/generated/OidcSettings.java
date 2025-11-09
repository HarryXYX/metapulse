package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Settings for OIDC SSO integration.
 */
@Schema(description = "Settings for OIDC SSO integration.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OidcSettings   {

  @JsonProperty("enabled") @Builder.Default
  private Boolean enabled = null;

  @JsonProperty("clientId") @Builder.Default
  private String clientId = null;

  @JsonProperty("clientSecret") @Builder.Default
  private String clientSecret = null;

  @JsonProperty("discoveryUri") @Builder.Default
  private String discoveryUri = null;

  @JsonProperty("userNameClaim") @Builder.Default
  private String userNameClaim = null;

  @JsonProperty("userNameClaimRegex") @Builder.Default
  private String userNameClaimRegex = null;

  @JsonProperty("scope") @Builder.Default
  private String scope = null;

  @JsonProperty("clientAuthenticationMethod") @Builder.Default
  private String clientAuthenticationMethod = null;

  @JsonProperty("jitProvisioningEnabled") @Builder.Default
  private Boolean jitProvisioningEnabled = null;

  @JsonProperty("preProvisioningRequired") @Builder.Default
  private Boolean preProvisioningRequired = null;

  @JsonProperty("extractGroupsEnabled") @Builder.Default
  private Boolean extractGroupsEnabled = null;

  @JsonProperty("groupsClaim") @Builder.Default
  private String groupsClaim = null;

  @JsonProperty("responseType") @Builder.Default
  private String responseType = null;

  @JsonProperty("responseMode") @Builder.Default
  private String responseMode = null;

  @JsonProperty("useNonce") @Builder.Default
  private Boolean useNonce = null;

  @JsonProperty("readTimeout") @Builder.Default
  private Long readTimeout = null;

  @JsonProperty("extractJwtAccessTokenClaims") @Builder.Default
  private Boolean extractJwtAccessTokenClaims = null;

  @JsonProperty("preferredJwsAlgorithm") @Builder.Default
  private String preferredJwsAlgorithm = null;

  @JsonProperty("preferredJwsAlgorithm2") @Builder.Default
  private String preferredJwsAlgorithm2 = null;

  public OidcSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether OIDC SSO is enabled.
   * @return enabled
   **/
  @Schema(required = true, description = "Whether OIDC SSO is enabled.")
      @NotNull

    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OidcSettings clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Unique client id issued by the identity provider.
   * @return clientId
   **/
  @Schema(required = true, description = "Unique client id issued by the identity provider.")
      @NotNull

    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OidcSettings clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Unique client secret issued by the identity provider.
   * @return clientSecret
   **/
  @Schema(required = true, description = "Unique client secret issued by the identity provider.")
      @NotNull

    public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OidcSettings discoveryUri(String discoveryUri) {
    this.discoveryUri = discoveryUri;
    return this;
  }

  /**
   * The IdP OIDC discovery url.
   * @return discoveryUri
   **/
  @Schema(required = true, description = "The IdP OIDC discovery url.")
      @NotNull

    public String getDiscoveryUri() {
    return discoveryUri;
  }

  public void setDiscoveryUri(String discoveryUri) {
    this.discoveryUri = discoveryUri;
  }

  public OidcSettings userNameClaim(String userNameClaim) {
    this.userNameClaim = userNameClaim;
    return this;
  }

  /**
   * ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to \"preferred_username\".
   * @return userNameClaim
   **/
  @Schema(description = "ADVANCED. The attribute / claim used to derive the DataHub username. Defaults to \"preferred_username\".")
  
    public String getUserNameClaim() {
    return userNameClaim;
  }

  public void setUserNameClaim(String userNameClaim) {
    this.userNameClaim = userNameClaim;
  }

  public OidcSettings userNameClaimRegex(String userNameClaimRegex) {
    this.userNameClaimRegex = userNameClaimRegex;
    return this;
  }

  /**
   * ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).
   * @return userNameClaimRegex
   **/
  @Schema(description = "ADVANCED. TThe regex used to parse the DataHub username from the user name claim. Defaults to (.*) (all).")
  
    public String getUserNameClaimRegex() {
    return userNameClaimRegex;
  }

  public void setUserNameClaimRegex(String userNameClaimRegex) {
    this.userNameClaimRegex = userNameClaimRegex;
  }

  public OidcSettings scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * ADVANCED. String representing the requested scope from the IdP. Defaults to \"oidc email profile\".
   * @return scope
   **/
  @Schema(description = "ADVANCED. String representing the requested scope from the IdP. Defaults to \"oidc email profile\".")
  
    public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OidcSettings clientAuthenticationMethod(String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
    return this;
  }

  /**
   * ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to \"client_secret_basic\".
   * @return clientAuthenticationMethod
   **/
  @Schema(description = "ADVANCED. Which authentication method to use to pass credentials (clientId and clientSecret) to the token endpoint: Defaults to \"client_secret_basic\".")
  
    public String getClientAuthenticationMethod() {
    return clientAuthenticationMethod;
  }

  public void setClientAuthenticationMethod(String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
  }

  public OidcSettings jitProvisioningEnabled(Boolean jitProvisioningEnabled) {
    this.jitProvisioningEnabled = jitProvisioningEnabled;
    return this;
  }

  /**
   * ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.
   * @return jitProvisioningEnabled
   **/
  @Schema(description = "ADVANCED. Whether DataHub users should be provisioned on login if they do not exist. Defaults to true.")
  
    public Boolean isJitProvisioningEnabled() {
    return jitProvisioningEnabled;
  }

  public void setJitProvisioningEnabled(Boolean jitProvisioningEnabled) {
    this.jitProvisioningEnabled = jitProvisioningEnabled;
  }

  public OidcSettings preProvisioningRequired(Boolean preProvisioningRequired) {
    this.preProvisioningRequired = preProvisioningRequired;
    return this;
  }

  /**
   * ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.
   * @return preProvisioningRequired
   **/
  @Schema(description = "ADVANCED. Whether the user should already exist in DataHub on login, failing login if they are not. Defaults to false.")
  
    public Boolean isPreProvisioningRequired() {
    return preProvisioningRequired;
  }

  public void setPreProvisioningRequired(Boolean preProvisioningRequired) {
    this.preProvisioningRequired = preProvisioningRequired;
  }

  public OidcSettings extractGroupsEnabled(Boolean extractGroupsEnabled) {
    this.extractGroupsEnabled = extractGroupsEnabled;
    return this;
  }

  /**
   * ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.
   * @return extractGroupsEnabled
   **/
  @Schema(description = "ADVANCED. Whether groups should be extracted from a claim in the OIDC profile. Only applies if JIT provisioning is enabled. Groups will be created if they do not exist. Defaults to true.")
  
    public Boolean isExtractGroupsEnabled() {
    return extractGroupsEnabled;
  }

  public void setExtractGroupsEnabled(Boolean extractGroupsEnabled) {
    this.extractGroupsEnabled = extractGroupsEnabled;
  }

  public OidcSettings groupsClaim(String groupsClaim) {
    this.groupsClaim = groupsClaim;
    return this;
  }

  /**
   * ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.
   * @return groupsClaim
   **/
  @Schema(description = "ADVANCED. The OIDC claim to extract groups information from. Defaults to 'groups'.")
  
    public String getGroupsClaim() {
    return groupsClaim;
  }

  public void setGroupsClaim(String groupsClaim) {
    this.groupsClaim = groupsClaim;
  }

  public OidcSettings responseType(String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * ADVANCED. Response type.
   * @return responseType
   **/
  @Schema(description = "ADVANCED. Response type.")
  
    public String getResponseType() {
    return responseType;
  }

  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }

  public OidcSettings responseMode(String responseMode) {
    this.responseMode = responseMode;
    return this;
  }

  /**
   * ADVANCED. Response mode.
   * @return responseMode
   **/
  @Schema(description = "ADVANCED. Response mode.")
  
    public String getResponseMode() {
    return responseMode;
  }

  public void setResponseMode(String responseMode) {
    this.responseMode = responseMode;
  }

  public OidcSettings useNonce(Boolean useNonce) {
    this.useNonce = useNonce;
    return this;
  }

  /**
   * ADVANCED. Use Nonce.
   * @return useNonce
   **/
  @Schema(description = "ADVANCED. Use Nonce.")
  
    public Boolean isUseNonce() {
    return useNonce;
  }

  public void setUseNonce(Boolean useNonce) {
    this.useNonce = useNonce;
  }

  public OidcSettings readTimeout(Long readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

  /**
   * ADVANCED. Read timeout.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return readTimeout
   **/
  @Schema(description = "ADVANCED. Read timeout.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Long readTimeout) {
    this.readTimeout = readTimeout;
  }

  public OidcSettings extractJwtAccessTokenClaims(Boolean extractJwtAccessTokenClaims) {
    this.extractJwtAccessTokenClaims = extractJwtAccessTokenClaims;
    return this;
  }

  /**
   * ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.
   * @return extractJwtAccessTokenClaims
   **/
  @Schema(description = "ADVANCED. Whether to extract claims from JWT access token.  Defaults to false.")
  
    public Boolean isExtractJwtAccessTokenClaims() {
    return extractJwtAccessTokenClaims;
  }

  public void setExtractJwtAccessTokenClaims(Boolean extractJwtAccessTokenClaims) {
    this.extractJwtAccessTokenClaims = extractJwtAccessTokenClaims;
  }

  public OidcSettings preferredJwsAlgorithm(String preferredJwsAlgorithm) {
    this.preferredJwsAlgorithm = preferredJwsAlgorithm;
    return this;
  }

  /**
   *  ADVANCED. Which jws algorithm to use. Unused.
   * @return preferredJwsAlgorithm
   **/
  @Schema(description = " ADVANCED. Which jws algorithm to use. Unused.")
  
    public String getPreferredJwsAlgorithm() {
    return preferredJwsAlgorithm;
  }

  public void setPreferredJwsAlgorithm(String preferredJwsAlgorithm) {
    this.preferredJwsAlgorithm = preferredJwsAlgorithm;
  }

  public OidcSettings preferredJwsAlgorithm2(String preferredJwsAlgorithm2) {
    this.preferredJwsAlgorithm2 = preferredJwsAlgorithm2;
    return this;
  }

  /**
   *  ADVANCED. Which jws algorithm to use.
   * @return preferredJwsAlgorithm2
   **/
  @Schema(description = " ADVANCED. Which jws algorithm to use.")
  
    public String getPreferredJwsAlgorithm2() {
    return preferredJwsAlgorithm2;
  }

  public void setPreferredJwsAlgorithm2(String preferredJwsAlgorithm2) {
    this.preferredJwsAlgorithm2 = preferredJwsAlgorithm2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OidcSettings oidcSettings = (OidcSettings) o;
    return Objects.equals(this.enabled, oidcSettings.enabled) &&
        Objects.equals(this.clientId, oidcSettings.clientId) &&
        Objects.equals(this.clientSecret, oidcSettings.clientSecret) &&
        Objects.equals(this.discoveryUri, oidcSettings.discoveryUri) &&
        Objects.equals(this.userNameClaim, oidcSettings.userNameClaim) &&
        Objects.equals(this.userNameClaimRegex, oidcSettings.userNameClaimRegex) &&
        Objects.equals(this.scope, oidcSettings.scope) &&
        Objects.equals(this.clientAuthenticationMethod, oidcSettings.clientAuthenticationMethod) &&
        Objects.equals(this.jitProvisioningEnabled, oidcSettings.jitProvisioningEnabled) &&
        Objects.equals(this.preProvisioningRequired, oidcSettings.preProvisioningRequired) &&
        Objects.equals(this.extractGroupsEnabled, oidcSettings.extractGroupsEnabled) &&
        Objects.equals(this.groupsClaim, oidcSettings.groupsClaim) &&
        Objects.equals(this.responseType, oidcSettings.responseType) &&
        Objects.equals(this.responseMode, oidcSettings.responseMode) &&
        Objects.equals(this.useNonce, oidcSettings.useNonce) &&
        Objects.equals(this.readTimeout, oidcSettings.readTimeout) &&
        Objects.equals(this.extractJwtAccessTokenClaims, oidcSettings.extractJwtAccessTokenClaims) &&
        Objects.equals(this.preferredJwsAlgorithm, oidcSettings.preferredJwsAlgorithm) &&
        Objects.equals(this.preferredJwsAlgorithm2, oidcSettings.preferredJwsAlgorithm2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, clientId, clientSecret, discoveryUri, userNameClaim, userNameClaimRegex, scope, clientAuthenticationMethod, jitProvisioningEnabled, preProvisioningRequired, extractGroupsEnabled, groupsClaim, responseType, responseMode, useNonce, readTimeout, extractJwtAccessTokenClaims, preferredJwsAlgorithm, preferredJwsAlgorithm2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OidcSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    discoveryUri: ").append(toIndentedString(discoveryUri)).append("\n");
    sb.append("    userNameClaim: ").append(toIndentedString(userNameClaim)).append("\n");
    sb.append("    userNameClaimRegex: ").append(toIndentedString(userNameClaimRegex)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    clientAuthenticationMethod: ").append(toIndentedString(clientAuthenticationMethod)).append("\n");
    sb.append("    jitProvisioningEnabled: ").append(toIndentedString(jitProvisioningEnabled)).append("\n");
    sb.append("    preProvisioningRequired: ").append(toIndentedString(preProvisioningRequired)).append("\n");
    sb.append("    extractGroupsEnabled: ").append(toIndentedString(extractGroupsEnabled)).append("\n");
    sb.append("    groupsClaim: ").append(toIndentedString(groupsClaim)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    responseMode: ").append(toIndentedString(responseMode)).append("\n");
    sb.append("    useNonce: ").append(toIndentedString(useNonce)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
    sb.append("    extractJwtAccessTokenClaims: ").append(toIndentedString(extractJwtAccessTokenClaims)).append("\n");
    sb.append("    preferredJwsAlgorithm: ").append(toIndentedString(preferredJwsAlgorithm)).append("\n");
    sb.append("    preferredJwsAlgorithm2: ").append(toIndentedString(preferredJwsAlgorithm2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}