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
 * Summary statistics about incidents on an entity.
 */
@Schema(description = "Summary statistics about incidents on an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentSummaryDetails   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("createdAt") @Builder.Default
  private Long createdAt = null;

  @JsonProperty("resolvedAt") @Builder.Default
  private Long resolvedAt = null;

  @JsonProperty("priority") @Builder.Default
  private Integer priority = null;

  public IncidentSummaryDetails urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * The urn of the incident
   * @return urn
   **/
  @Schema(required = true, description = "The urn of the incident")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public IncidentSummaryDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of an incident
   * @return type
   **/
  @Schema(required = true, description = "The type of an incident")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IncidentSummaryDetails createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the incident was raised in milliseconds since epoch.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdAt
   **/
  @Schema(required = true, description = "The time at which the incident was raised in milliseconds since epoch.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public IncidentSummaryDetails resolvedAt(Long resolvedAt) {
    this.resolvedAt = resolvedAt;
    return this;
  }

  /**
   * The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return resolvedAt
   **/
  @Schema(description = "The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getResolvedAt() {
    return resolvedAt;
  }

  public void setResolvedAt(Long resolvedAt) {
    this.resolvedAt = resolvedAt;
  }

  public IncidentSummaryDetails priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the incident
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
   **/
  @Schema(description = "The priority of the incident")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSummaryDetails incidentSummaryDetails = (IncidentSummaryDetails) o;
    return Objects.equals(this.urn, incidentSummaryDetails.urn) &&
        Objects.equals(this.type, incidentSummaryDetails.type) &&
        Objects.equals(this.createdAt, incidentSummaryDetails.createdAt) &&
        Objects.equals(this.resolvedAt, incidentSummaryDetails.resolvedAt) &&
        Objects.equals(this.priority, incidentSummaryDetails.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, type, createdAt, resolvedAt, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSummaryDetails {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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