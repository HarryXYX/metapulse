package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OidcSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * SSO Integrations, supported on the UI.
 */
@Schema(description = "SSO Integrations, supported on the UI.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SsoSettings   {

  @JsonProperty("baseUrl") @Builder.Default
  private String baseUrl = null;

  @JsonProperty("oidcSettings") @Builder.Default
  private OidcSettings oidcSettings = null;

  public SsoSettings baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Auth base URL.
   * @return baseUrl
   **/
  @Schema(required = true, description = "Auth base URL.")
      @NotNull

    public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public SsoSettings oidcSettings(OidcSettings oidcSettings) {
    this.oidcSettings = oidcSettings;
    return this;
  }

  /**
   * Get oidcSettings
   * @return oidcSettings
   **/
  @Schema(description = "")
  
    @Valid
    public OidcSettings getOidcSettings() {
    return oidcSettings;
  }

  public void setOidcSettings(OidcSettings oidcSettings) {
    this.oidcSettings = oidcSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSettings ssoSettings = (SsoSettings) o;
    return Objects.equals(this.baseUrl, ssoSettings.baseUrl) &&
        Objects.equals(this.oidcSettings, ssoSettings.oidcSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, oidcSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsoSettings {\n");
    
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    oidcSettings: ").append(toIndentedString(oidcSettings)).append("\n");
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