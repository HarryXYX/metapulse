package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OAuthProvider;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Trust oauth providers to use for authentication.
 */
@Schema(description = "Trust oauth providers to use for authentication.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthSettings   {

  @JsonProperty("providers") @Builder.Default
  @Valid
  private List<OAuthProvider> providers = new ArrayList<>();

  public OAuthSettings providers(List<OAuthProvider> providers) {
    this.providers = providers;
    return this;
  }

  public OAuthSettings addProvidersItem(OAuthProvider providersItem) {
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Trusted OAuth Providers
   * @return providers
   **/
  @Schema(required = true, description = "Trusted OAuth Providers")
      @NotNull
    @Valid
    public List<OAuthProvider> getProviders() {
    return providers;
  }

  public void setProviders(List<OAuthProvider> providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthSettings oauthSettings = (OAuthSettings) o;
    return Objects.equals(this.providers, oauthSettings.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthSettings {\n");
    
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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