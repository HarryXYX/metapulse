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
 * An OAuth Provider. This provides information required to validate inbound requests with OAuth 2.0 bearer tokens.
 */
@Schema(description = "An OAuth Provider. This provides information required to validate inbound requests with OAuth 2.0 bearer tokens.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthProvider   {

  @JsonProperty("enabled") @Builder.Default
  private Boolean enabled = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("jwksUri") @Builder.Default
  private String jwksUri = null;

  @JsonProperty("issuer") @Builder.Default
  private String issuer = null;

  @JsonProperty("audience") @Builder.Default
  private String audience = null;

  @JsonProperty("algorithm") @Builder.Default
  private String algorithm = "RS256";

  @JsonProperty("userIdClaim") @Builder.Default
  private String userIdClaim = "sub";

  public OAuthProvider enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this OAuth provider is enabled.
   * @return enabled
   **/
  @Schema(required = true, description = "Whether this OAuth provider is enabled.")
      @NotNull

    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OAuthProvider name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this OAuth provider. This is used for display purposes only.
   * @return name
   **/
  @Schema(required = true, description = "The name of this OAuth provider. This is used for display purposes only.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OAuthProvider jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.
   * @return jwksUri
   **/
  @Schema(description = "The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.")
  
    public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public OAuthProvider issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The expected issuer (iss) claim in the JWTs issued by this OAuth provider.
   * @return issuer
   **/
  @Schema(required = true, description = "The expected issuer (iss) claim in the JWTs issued by this OAuth provider.")
      @NotNull

    public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public OAuthProvider audience(String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * The expected audience (aud) claim in the JWTs issued by this OAuth provider.
   * @return audience
   **/
  @Schema(required = true, description = "The expected audience (aud) claim in the JWTs issued by this OAuth provider.")
      @NotNull

    public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public OAuthProvider algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * The JWT signing algorithm required for this provider. Prevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256
   * @return algorithm
   **/
  @Schema(required = true, description = "The JWT signing algorithm required for this provider. Prevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256")
      @NotNull

    public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public OAuthProvider userIdClaim(String userIdClaim) {
    this.userIdClaim = userIdClaim;
    return this;
  }

  /**
   * The JWT claim to use as the user identifier for this provider. Different providers use different claims (sub, email, preferred_username, etc.)
   * @return userIdClaim
   **/
  @Schema(required = true, description = "The JWT claim to use as the user identifier for this provider. Different providers use different claims (sub, email, preferred_username, etc.)")
      @NotNull

    public String getUserIdClaim() {
    return userIdClaim;
  }

  public void setUserIdClaim(String userIdClaim) {
    this.userIdClaim = userIdClaim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthProvider oauthProvider = (OAuthProvider) o;
    return Objects.equals(this.enabled, oauthProvider.enabled) &&
        Objects.equals(this.name, oauthProvider.name) &&
        Objects.equals(this.jwksUri, oauthProvider.jwksUri) &&
        Objects.equals(this.issuer, oauthProvider.issuer) &&
        Objects.equals(this.audience, oauthProvider.audience) &&
        Objects.equals(this.algorithm, oauthProvider.algorithm) &&
        Objects.equals(this.userIdClaim, oauthProvider.userIdClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, jwksUri, issuer, audience, algorithm, userIdClaim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthProvider {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    userIdClaim: ").append(toIndentedString(userIdClaim)).append("\n");
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