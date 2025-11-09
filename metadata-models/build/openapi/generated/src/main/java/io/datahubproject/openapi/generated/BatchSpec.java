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
 * A batch on which certain operations, e.g. data quality evaluation, is done.
 */
@Schema(description = "A batch on which certain operations, e.g. data quality evaluation, is done.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchSpec   {

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("nativeBatchId") @Builder.Default
  private String nativeBatchId = null;

  @JsonProperty("query") @Builder.Default
  private String query = null;

  @JsonProperty("limit") @Builder.Default
  private Integer limit = null;

  public BatchSpec customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public BatchSpec putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public BatchSpec nativeBatchId(String nativeBatchId) {
    this.nativeBatchId = nativeBatchId;
    return this;
  }

  /**
   * The native identifier as specified by the system operating on the batch.
   * @return nativeBatchId
   **/
  @Schema(description = "The native identifier as specified by the system operating on the batch.")
  
    public String getNativeBatchId() {
    return nativeBatchId;
  }

  public void setNativeBatchId(String nativeBatchId) {
    this.nativeBatchId = nativeBatchId;
  }

  public BatchSpec query(String query) {
    this.query = query;
    return this;
  }

  /**
   * A query that identifies a batch of data
   * @return query
   **/
  @Schema(description = "A query that identifies a batch of data")
  
    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public BatchSpec limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Any limit to the number of rows in the batch, if applied
   * minimum: -2147483648
   * maximum: 2147483647
   * @return limit
   **/
  @Schema(description = "Any limit to the number of rows in the batch, if applied")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchSpec batchSpec = (BatchSpec) o;
    return Objects.equals(this.customProperties, batchSpec.customProperties) &&
        Objects.equals(this.nativeBatchId, batchSpec.nativeBatchId) &&
        Objects.equals(this.query, batchSpec.query) &&
        Objects.equals(this.limit, batchSpec.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, nativeBatchId, query, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSpec {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    nativeBatchId: ").append(toIndentedString(nativeBatchId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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