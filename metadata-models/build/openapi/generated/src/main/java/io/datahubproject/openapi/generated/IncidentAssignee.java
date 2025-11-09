package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The incident assignee type. This is in a record so that we can add additional fields if we need to later (e.g. the type of the assignee.
 */
@Schema(description = "The incident assignee type. This is in a record so that we can add additional fields if we need to later (e.g. the type of the assignee.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentAssignee   {

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("assignedAt") @Builder.Default
  private AuditStamp assignedAt = null;

  public IncidentAssignee actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * The user or group assigned to the incident.
   * @return actor
   **/
  @Schema(required = true, description = "The user or group assigned to the incident.")
      @NotNull

    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public IncidentAssignee assignedAt(AuditStamp assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

  /**
   * Get assignedAt
   * @return assignedAt
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(AuditStamp assignedAt) {
    this.assignedAt = assignedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAssignee incidentAssignee = (IncidentAssignee) o;
    return Objects.equals(this.actor, incidentAssignee.actor) &&
        Objects.equals(this.assignedAt, incidentAssignee.assignedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, assignedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAssignee {\n");
    
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
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