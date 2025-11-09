package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ActorsAspectResponseV2;
import io.datahubproject.openapi.generated.RoleKeyAspectResponseV2;
import io.datahubproject.openapi.generated.RolePropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Role object.
 */
@Schema(description = "Role object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("roleKey") @Builder.Default
  private RoleKeyAspectResponseV2 roleKey = null;

  @JsonProperty("roleProperties") @Builder.Default
  private RolePropertiesAspectResponseV2 roleProperties = null;

  @JsonProperty("actors") @Builder.Default
  private ActorsAspectResponseV2 actors = null;

  public RoleEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for role
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for role")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public RoleEntityResponseV2 roleKey(RoleKeyAspectResponseV2 roleKey) {
    this.roleKey = roleKey;
    return this;
  }

  /**
   * Get roleKey
   * @return roleKey
   **/
  @Schema(description = "")
  
    @Valid
    public RoleKeyAspectResponseV2 getRoleKey() {
    return roleKey;
  }

  public void setRoleKey(RoleKeyAspectResponseV2 roleKey) {
    this.roleKey = roleKey;
  }

  public RoleEntityResponseV2 roleProperties(RolePropertiesAspectResponseV2 roleProperties) {
    this.roleProperties = roleProperties;
    return this;
  }

  /**
   * Get roleProperties
   * @return roleProperties
   **/
  @Schema(description = "")
  
    @Valid
    public RolePropertiesAspectResponseV2 getRoleProperties() {
    return roleProperties;
  }

  public void setRoleProperties(RolePropertiesAspectResponseV2 roleProperties) {
    this.roleProperties = roleProperties;
  }

  public RoleEntityResponseV2 actors(ActorsAspectResponseV2 actors) {
    this.actors = actors;
    return this;
  }

  /**
   * Get actors
   * @return actors
   **/
  @Schema(description = "")
  
    @Valid
    public ActorsAspectResponseV2 getActors() {
    return actors;
  }

  public void setActors(ActorsAspectResponseV2 actors) {
    this.actors = actors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleEntityResponseV2 roleEntityResponseV2 = (RoleEntityResponseV2) o;
    return Objects.equals(this.urn, roleEntityResponseV2.urn) &&
        Objects.equals(this.roleKey, roleEntityResponseV2.roleKey) &&
        Objects.equals(this.roleProperties, roleEntityResponseV2.roleProperties) &&
        Objects.equals(this.actors, roleEntityResponseV2.actors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, roleKey, roleProperties, actors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    roleKey: ").append(toIndentedString(roleKey)).append("\n");
    sb.append("    roleProperties: ").append(toIndentedString(roleProperties)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
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