package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IncidentSummaryDetails;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Summary related incidents on an entity.
 */
@Schema(description = "Summary related incidents on an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentsSummary  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IncidentsSummary") @Builder.Default
  private String __type = "IncidentsSummary";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IncidentsSummary"},
  defaultValue = "IncidentsSummary")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("resolvedIncidents") @Builder.Default
  @Valid
  private List<String> resolvedIncidents = new ArrayList<>();

  @JsonProperty("activeIncidents") @Builder.Default
  @Valid
  private List<String> activeIncidents = new ArrayList<>();

  @JsonProperty("resolvedIncidentDetails") @Builder.Default
  @Valid
  private List<IncidentSummaryDetails> resolvedIncidentDetails = new ArrayList<>();

  @JsonProperty("activeIncidentDetails") @Builder.Default
  @Valid
  private List<IncidentSummaryDetails> activeIncidentDetails = new ArrayList<>();

  public IncidentsSummary resolvedIncidents(List<String> resolvedIncidents) {
    this.resolvedIncidents = resolvedIncidents;
    return this;
  }

  public IncidentsSummary addResolvedIncidentsItem(String resolvedIncidentsItem) {
    this.resolvedIncidents.add(resolvedIncidentsItem);
    return this;
  }

  /**
   * Resolved incidents for an asset Deprecated! Use the richer resolvedIncidentsDetails instead.
   * @return resolvedIncidents
   **/
  @Schema(required = true, description = "Resolved incidents for an asset Deprecated! Use the richer resolvedIncidentsDetails instead.")
      @NotNull

    public List<String> getResolvedIncidents() {
    return resolvedIncidents;
  }

  public void setResolvedIncidents(List<String> resolvedIncidents) {
    this.resolvedIncidents = resolvedIncidents;
  }

  public IncidentsSummary activeIncidents(List<String> activeIncidents) {
    this.activeIncidents = activeIncidents;
    return this;
  }

  public IncidentsSummary addActiveIncidentsItem(String activeIncidentsItem) {
    this.activeIncidents.add(activeIncidentsItem);
    return this;
  }

  /**
   * Active incidents for an asset Deprecated! Use the richer activeIncidentsDetails instead.
   * @return activeIncidents
   **/
  @Schema(required = true, description = "Active incidents for an asset Deprecated! Use the richer activeIncidentsDetails instead.")
      @NotNull

    public List<String> getActiveIncidents() {
    return activeIncidents;
  }

  public void setActiveIncidents(List<String> activeIncidents) {
    this.activeIncidents = activeIncidents;
  }

  public IncidentsSummary resolvedIncidentDetails(List<IncidentSummaryDetails> resolvedIncidentDetails) {
    this.resolvedIncidentDetails = resolvedIncidentDetails;
    return this;
  }

  public IncidentsSummary addResolvedIncidentDetailsItem(IncidentSummaryDetails resolvedIncidentDetailsItem) {
    this.resolvedIncidentDetails.add(resolvedIncidentDetailsItem);
    return this;
  }

  /**
   * Summary details about the set of resolved incidents
   * @return resolvedIncidentDetails
   **/
  @Schema(required = true, description = "Summary details about the set of resolved incidents")
      @NotNull
    @Valid
    public List<IncidentSummaryDetails> getResolvedIncidentDetails() {
    return resolvedIncidentDetails;
  }

  public void setResolvedIncidentDetails(List<IncidentSummaryDetails> resolvedIncidentDetails) {
    this.resolvedIncidentDetails = resolvedIncidentDetails;
  }

  public IncidentsSummary activeIncidentDetails(List<IncidentSummaryDetails> activeIncidentDetails) {
    this.activeIncidentDetails = activeIncidentDetails;
    return this;
  }

  public IncidentsSummary addActiveIncidentDetailsItem(IncidentSummaryDetails activeIncidentDetailsItem) {
    this.activeIncidentDetails.add(activeIncidentDetailsItem);
    return this;
  }

  /**
   * Summary details about the set of active incidents
   * @return activeIncidentDetails
   **/
  @Schema(required = true, description = "Summary details about the set of active incidents")
      @NotNull
    @Valid
    public List<IncidentSummaryDetails> getActiveIncidentDetails() {
    return activeIncidentDetails;
  }

  public void setActiveIncidentDetails(List<IncidentSummaryDetails> activeIncidentDetails) {
    this.activeIncidentDetails = activeIncidentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentsSummary incidentsSummary = (IncidentsSummary) o;
    return Objects.equals(this.resolvedIncidents, incidentsSummary.resolvedIncidents) &&
        Objects.equals(this.activeIncidents, incidentsSummary.activeIncidents) &&
        Objects.equals(this.resolvedIncidentDetails, incidentsSummary.resolvedIncidentDetails) &&
        Objects.equals(this.activeIncidentDetails, incidentsSummary.activeIncidentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolvedIncidents, activeIncidents, resolvedIncidentDetails, activeIncidentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentsSummary {\n");
    
    sb.append("    resolvedIncidents: ").append(toIndentedString(resolvedIncidents)).append("\n");
    sb.append("    activeIncidents: ").append(toIndentedString(activeIncidents)).append("\n");
    sb.append("    resolvedIncidentDetails: ").append(toIndentedString(resolvedIncidentDetails)).append("\n");
    sb.append("    activeIncidentDetails: ").append(toIndentedString(activeIncidentDetails)).append("\n");
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