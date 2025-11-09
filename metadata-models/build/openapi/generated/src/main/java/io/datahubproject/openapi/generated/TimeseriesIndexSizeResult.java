package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Encapsulates the response of the getIndexSizes API
 */
@Schema(description = "Encapsulates the response of the getIndexSizes API")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeseriesIndexSizeResult   {

  @JsonProperty("indexName") @Builder.Default
  private String indexName = null;

  @JsonProperty("entityName") @Builder.Default
  private String entityName = null;

  @JsonProperty("aspectName") @Builder.Default
  private String aspectName = null;

  @JsonProperty("sizeMb") @Builder.Default
  private BigDecimal sizeMb = new BigDecimal(0);

  @JsonProperty("sizeInMb") @Builder.Default
  private BigDecimal sizeInMb = new BigDecimal(0);

  public TimeseriesIndexSizeResult indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * Name of the index
   * @return indexName
   **/
  @Schema(required = true, description = "Name of the index")
      @NotNull

    public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public TimeseriesIndexSizeResult entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Name of the entity associated with the index
   * @return entityName
   **/
  @Schema(required = true, description = "Name of the entity associated with the index")
      @NotNull

    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public TimeseriesIndexSizeResult aspectName(String aspectName) {
    this.aspectName = aspectName;
    return this;
  }

  /**
   * Name of the aspect associated with the index
   * @return aspectName
   **/
  @Schema(required = true, description = "Name of the aspect associated with the index")
      @NotNull

    public String getAspectName() {
    return aspectName;
  }

  public void setAspectName(String aspectName) {
    this.aspectName = aspectName;
  }

  public TimeseriesIndexSizeResult sizeMb(BigDecimal sizeMb) {
    this.sizeMb = sizeMb;
    return this;
  }

  /**
   * Size
   * @return sizeMb
   **/
  @Schema(required = true, description = "Size")
      @NotNull

    @Valid
    public BigDecimal getSizeMb() {
    return sizeMb;
  }

  public void setSizeMb(BigDecimal sizeMb) {
    this.sizeMb = sizeMb;
  }

  public TimeseriesIndexSizeResult sizeInMb(BigDecimal sizeInMb) {
    this.sizeInMb = sizeInMb;
    return this;
  }

  /**
   * Get sizeInMb
   * @return sizeInMb
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getSizeInMb() {
    return sizeInMb;
  }

  public void setSizeInMb(BigDecimal sizeInMb) {
    this.sizeInMb = sizeInMb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesIndexSizeResult timeseriesIndexSizeResult = (TimeseriesIndexSizeResult) o;
    return Objects.equals(this.indexName, timeseriesIndexSizeResult.indexName) &&
        Objects.equals(this.entityName, timeseriesIndexSizeResult.entityName) &&
        Objects.equals(this.aspectName, timeseriesIndexSizeResult.aspectName) &&
        Objects.equals(this.sizeMb, timeseriesIndexSizeResult.sizeMb) &&
        Objects.equals(this.sizeInMb, timeseriesIndexSizeResult.sizeInMb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, entityName, aspectName, sizeMb, sizeInMb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesIndexSizeResult {\n");
    
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    aspectName: ").append(toIndentedString(aspectName)).append("\n");
    sb.append("    sizeMb: ").append(toIndentedString(sizeMb)).append("\n");
    sb.append("    sizeInMb: ").append(toIndentedString(sizeInMb)).append("\n");
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