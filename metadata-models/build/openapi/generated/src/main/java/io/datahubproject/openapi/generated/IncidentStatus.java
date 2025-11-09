package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.IncidentStage;
import io.datahubproject.openapi.generated.IncidentState;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about an incident raised on an asset
 */
@Schema(description = "Information about an incident raised on an asset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentStatus   {

  @JsonProperty("state") @Builder.Default
  private IncidentState state = null;

  @JsonProperty("stage") @Builder.Default
  private IncidentStage stage = null;

  @JsonProperty("message") @Builder.Default
  private String message = null;

  @JsonProperty("lastUpdated") @Builder.Default
  private AuditStamp lastUpdated = null;

  public IncidentStatus state(IncidentState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IncidentState getState() {
    return state;
  }

  public void setState(IncidentState state) {
    this.state = state;
  }

  public IncidentStatus stage(IncidentStage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Get stage
   * @return stage
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentStage getStage() {
    return stage;
  }

  public void setStage(IncidentStage stage) {
    this.stage = stage;
  }

  public IncidentStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Optional message associated with the incident
   * @return message
   **/
  @Schema(description = "Optional message associated with the incident")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IncidentStatus lastUpdated(AuditStamp lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(AuditStamp lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatus incidentStatus = (IncidentStatus) o;
    return Objects.equals(this.state, incidentStatus.state) &&
        Objects.equals(this.stage, incidentStatus.stage) &&
        Objects.equals(this.message, incidentStatus.message) &&
        Objects.equals(this.lastUpdated, incidentStatus.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, stage, message, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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