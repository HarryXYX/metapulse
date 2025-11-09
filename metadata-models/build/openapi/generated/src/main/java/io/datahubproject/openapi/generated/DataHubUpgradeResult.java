package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubUpgradeState;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information collected when a DataHubUpgrade successfully finishes
 */
@Schema(description = "Information collected when a DataHubUpgrade successfully finishes")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubUpgradeResult  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubUpgradeResult") @Builder.Default
  private String __type = "DataHubUpgradeResult";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubUpgradeResult"},
  defaultValue = "DataHubUpgradeResult")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("state") @Builder.Default
  private DataHubUpgradeState state = null;

  @JsonProperty("timestampMs") @Builder.Default
  private Long timestampMs = null;

  @JsonProperty("result") @Builder.Default
  @Valid
  private Map<String, String> result = null;

  public DataHubUpgradeResult state(DataHubUpgradeState state) {
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
    public DataHubUpgradeState getState() {
    return state;
  }

  public void setState(DataHubUpgradeState state) {
    this.state = state;
  }

  public DataHubUpgradeResult timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Timestamp when we started this DataHubUpgrade
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestampMs
   **/
  @Schema(required = true, description = "Timestamp when we started this DataHubUpgrade")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
  }

  public DataHubUpgradeResult result(Map<String, String> result) {
    this.result = result;
    return this;
  }

  public DataHubUpgradeResult putResultItem(String key, String resultItem) {
    if (this.result == null) {
      this.result = new HashMap<>();
    }
    this.result.put(key, resultItem);
    return this;
  }

  /**
   * Result map to place helpful information about this upgrade job
   * @return result
   **/
  @Schema(description = "Result map to place helpful information about this upgrade job")
  
    public Map<String, String> getResult() {
    return result;
  }

  public void setResult(Map<String, String> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubUpgradeResult dataHubUpgradeResult = (DataHubUpgradeResult) o;
    return Objects.equals(this.state, dataHubUpgradeResult.state) &&
        Objects.equals(this.timestampMs, dataHubUpgradeResult.timestampMs) &&
        Objects.equals(this.result, dataHubUpgradeResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, timestampMs, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubUpgradeResult {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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