package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Set of flags to control lineage search behavior
 */
@Schema(description = "Set of flags to control lineage search behavior")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineageFlags   {

  @JsonProperty("entitiesExploredPerHopLimit") @Builder.Default
  private Integer entitiesExploredPerHopLimit = null;

  @JsonProperty("startTimeMillis") @Builder.Default
  private Long startTimeMillis = null;

  @JsonProperty("endTimeMillis") @Builder.Default
  private Long endTimeMillis = null;

  @JsonProperty("ignoreAsHops") @Builder.Default
  @Valid
  private Map<String, List<String>> ignoreAsHops = null;

  public LineageFlags entitiesExploredPerHopLimit(Integer entitiesExploredPerHopLimit) {
    this.entitiesExploredPerHopLimit = entitiesExploredPerHopLimit;
    return this;
  }

  /**
   * Limits number of entities explored per hop
   * minimum: -2147483648
   * maximum: 2147483647
   * @return entitiesExploredPerHopLimit
   **/
  @Schema(description = "Limits number of entities explored per hop")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getEntitiesExploredPerHopLimit() {
    return entitiesExploredPerHopLimit;
  }

  public void setEntitiesExploredPerHopLimit(Integer entitiesExploredPerHopLimit) {
    this.entitiesExploredPerHopLimit = entitiesExploredPerHopLimit;
  }

  public LineageFlags startTimeMillis(Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  /**
   * Start time for lineage edges to filter
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return startTimeMillis
   **/
  @Schema(description = "Start time for lineage edges to filter")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getStartTimeMillis() {
    return startTimeMillis;
  }

  public void setStartTimeMillis(Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
  }

  public LineageFlags endTimeMillis(Long endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
    return this;
  }

  /**
   * End time for lineage edges to filter
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return endTimeMillis
   **/
  @Schema(description = "End time for lineage edges to filter")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getEndTimeMillis() {
    return endTimeMillis;
  }

  public void setEndTimeMillis(Long endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
  }

  public LineageFlags ignoreAsHops(Map<String, List<String>> ignoreAsHops) {
    this.ignoreAsHops = ignoreAsHops;
    return this;
  }

  public LineageFlags putIgnoreAsHopsItem(String key, List<String> ignoreAsHopsItem) {
    if (this.ignoreAsHops == null) {
      this.ignoreAsHops = new HashMap<>();
    }
    this.ignoreAsHops.put(key, ignoreAsHopsItem);
    return this;
  }

  /**
   * Map of entity type to list of platform urns to ignore as hops during graph walk. Note: this can potentially cause a large amount of additional hops to occur and should be used with caution.
   * @return ignoreAsHops
   **/
  @Schema(description = "Map of entity type to list of platform urns to ignore as hops during graph walk. Note: this can potentially cause a large amount of additional hops to occur and should be used with caution.")
      @Valid
    public Map<String, List<String>> getIgnoreAsHops() {
    return ignoreAsHops;
  }

  public void setIgnoreAsHops(Map<String, List<String>> ignoreAsHops) {
    this.ignoreAsHops = ignoreAsHops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageFlags lineageFlags = (LineageFlags) o;
    return Objects.equals(this.entitiesExploredPerHopLimit, lineageFlags.entitiesExploredPerHopLimit) &&
        Objects.equals(this.startTimeMillis, lineageFlags.startTimeMillis) &&
        Objects.equals(this.endTimeMillis, lineageFlags.endTimeMillis) &&
        Objects.equals(this.ignoreAsHops, lineageFlags.ignoreAsHops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesExploredPerHopLimit, startTimeMillis, endTimeMillis, ignoreAsHops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageFlags {\n");
    
    sb.append("    entitiesExploredPerHopLimit: ").append(toIndentedString(entitiesExploredPerHopLimit)).append("\n");
    sb.append("    startTimeMillis: ").append(toIndentedString(startTimeMillis)).append("\n");
    sb.append("    endTimeMillis: ").append(toIndentedString(endTimeMillis)).append("\n");
    sb.append("    ignoreAsHops: ").append(toIndentedString(ignoreAsHops)).append("\n");
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