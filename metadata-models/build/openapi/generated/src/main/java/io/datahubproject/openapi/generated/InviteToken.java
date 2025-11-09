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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Aspect used to store invite tokens.
 */
@Schema(description = "Aspect used to store invite tokens.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteToken  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "InviteToken") @Builder.Default
  private String __type = "InviteToken";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"InviteToken"},
  defaultValue = "InviteToken")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("token") @Builder.Default
  private String token = null;

  @JsonProperty("role") @Builder.Default
  private String role = null;

  public InviteToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The encrypted invite token.
   * @return token
   **/
  @Schema(required = true, description = "The encrypted invite token.")
      @NotNull

    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InviteToken role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role that this invite token may be associated with
   * @return role
   **/
  @Schema(description = "The role that this invite token may be associated with")
  
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteToken inviteToken = (InviteToken) o;
    return Objects.equals(this.token, inviteToken.token) &&
        Objects.equals(this.role, inviteToken.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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