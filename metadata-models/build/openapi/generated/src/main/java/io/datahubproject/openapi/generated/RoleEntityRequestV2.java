package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ActorsAspectRequestV2;
import io.datahubproject.openapi.generated.RoleKeyAspectRequestV2;
import io.datahubproject.openapi.generated.RolePropertiesAspectRequestV2;
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
public class RoleEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("roleKey") @Builder.Default
  private RoleKeyAspectRequestV2 roleKey = null;

  @JsonProperty("roleProperties") @Builder.Default
  private RolePropertiesAspectRequestV2 roleProperties = null;

  @JsonProperty("actors") @Builder.Default
  private ActorsAspectRequestV2 actors = null;

  public RoleEntityRequestV2 urn(String urn) {
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

  public RoleEntityRequestV2 roleKey(RoleKeyAspectRequestV2 roleKey) {
    this.roleKey = roleKey;
    return this;
  }

  /**
   * Get roleKey
   * @return roleKey
   **/
  @Schema(description = "")
  
    @Valid
    public RoleKeyAspectRequestV2 getRoleKey() {
    return roleKey;
  }

  public void setRoleKey(RoleKeyAspectRequestV2 roleKey) {
    this.roleKey = roleKey;
  }

  public RoleEntityRequestV2 roleProperties(RolePropertiesAspectRequestV2 roleProperties) {
    this.roleProperties = roleProperties;
    return this;
  }

  /**
   * Get roleProperties
   * @return roleProperties
   **/
  @Schema(description = "")
  
    @Valid
    public RolePropertiesAspectRequestV2 getRoleProperties() {
    return roleProperties;
  }

  public void setRoleProperties(RolePropertiesAspectRequestV2 roleProperties) {
    this.roleProperties = roleProperties;
  }

  public RoleEntityRequestV2 actors(ActorsAspectRequestV2 actors) {
    this.actors = actors;
    return this;
  }

  /**
   * Get actors
   * @return actors
   **/
  @Schema(description = "")
  
    @Valid
    public ActorsAspectRequestV2 getActors() {
    return actors;
  }

  public void setActors(ActorsAspectRequestV2 actors) {
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
    RoleEntityRequestV2 roleEntityRequestV2 = (RoleEntityRequestV2) o;
    return Objects.equals(this.urn, roleEntityRequestV2.urn) &&
        Objects.equals(this.roleKey, roleEntityRequestV2.roleKey) &&
        Objects.equals(this.roleProperties, roleEntityRequestV2.roleProperties) &&
        Objects.equals(this.actors, roleEntityRequestV2.actors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, roleKey, roleProperties, actors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleEntityRequestV2 {\n");
    
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