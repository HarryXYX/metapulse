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
 * Stats that describe the freshness of a dataset or query result. Useful to describe consistency and staleness of results when served out of a cache or other eventually consistent system.
 */
@Schema(description = "Stats that describe the freshness of a dataset or query result. Useful to describe consistency and staleness of results when served out of a cache or other eventually consistent system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreshnessStats   {

  @JsonProperty("cached") @Builder.Default
  private Boolean cached = null;

  @JsonProperty("systemFreshness") @Builder.Default
  @Valid
  private Map<String, Long> systemFreshness = null;

  public FreshnessStats cached(Boolean cached) {
    this.cached = cached;
    return this;
  }

  /**
   * Get cached
   * @return cached
   **/
  @Schema(description = "")
  
    public Boolean isCached() {
    return cached;
  }

  public void setCached(Boolean cached) {
    this.cached = cached;
  }

  public FreshnessStats systemFreshness(Map<String, Long> systemFreshness) {
    this.systemFreshness = systemFreshness;
    return this;
  }

  public FreshnessStats putSystemFreshnessItem(String key, Long systemFreshnessItem) {
    if (this.systemFreshness == null) {
      this.systemFreshness = new HashMap<>();
    }
    this.systemFreshness.put(key, systemFreshnessItem);
    return this;
  }

  /**
   * Get systemFreshness
   * @return systemFreshness
   **/
  @Schema(description = "")
  
    public Map<String, Long> getSystemFreshness() {
    return systemFreshness;
  }

  public void setSystemFreshness(Map<String, Long> systemFreshness) {
    this.systemFreshness = systemFreshness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshnessStats freshnessStats = (FreshnessStats) o;
    return Objects.equals(this.cached, freshnessStats.cached) &&
        Objects.equals(this.systemFreshness, freshnessStats.systemFreshness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cached, systemFreshness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshnessStats {\n");
    
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    systemFreshness: ").append(toIndentedString(systemFreshness)).append("\n");
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