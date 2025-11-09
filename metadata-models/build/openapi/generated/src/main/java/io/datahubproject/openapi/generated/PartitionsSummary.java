package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PartitionSummary;
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
 * Defines how the data is partitioned for Data Lake tables (e.g. Hive, S3, Iceberg, Delta, Hudi, etc).
 */
@Schema(description = "Defines how the data is partitioned for Data Lake tables (e.g. Hive, S3, Iceberg, Delta, Hudi, etc).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartitionsSummary  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "PartitionsSummary") @Builder.Default
  private String __type = "PartitionsSummary";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"PartitionsSummary"},
  defaultValue = "PartitionsSummary")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("minPartition") @Builder.Default
  private PartitionSummary minPartition = null;

  @JsonProperty("maxPartition") @Builder.Default
  private PartitionSummary maxPartition = null;

  public PartitionsSummary minPartition(PartitionSummary minPartition) {
    this.minPartition = minPartition;
    return this;
  }

  /**
   * Get minPartition
   * @return minPartition
   **/
  @Schema(description = "")
  
    @Valid
    public PartitionSummary getMinPartition() {
    return minPartition;
  }

  public void setMinPartition(PartitionSummary minPartition) {
    this.minPartition = minPartition;
  }

  public PartitionsSummary maxPartition(PartitionSummary maxPartition) {
    this.maxPartition = maxPartition;
    return this;
  }

  /**
   * Get maxPartition
   * @return maxPartition
   **/
  @Schema(description = "")
  
    @Valid
    public PartitionSummary getMaxPartition() {
    return maxPartition;
  }

  public void setMaxPartition(PartitionSummary maxPartition) {
    this.maxPartition = maxPartition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartitionsSummary partitionsSummary = (PartitionsSummary) o;
    return Objects.equals(this.minPartition, partitionsSummary.minPartition) &&
        Objects.equals(this.maxPartition, partitionsSummary.maxPartition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPartition, maxPartition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartitionsSummary {\n");
    
    sb.append("    minPartition: ").append(toIndentedString(minPartition)).append("\n");
    sb.append("    maxPartition: ").append(toIndentedString(maxPartition)).append("\n");
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