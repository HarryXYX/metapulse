package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFilter;
import io.datahubproject.openapi.generated.IncrementingSegmentRowCountChange;
import io.datahubproject.openapi.generated.IncrementingSegmentRowCountTotal;
import io.datahubproject.openapi.generated.RowCountChange;
import io.datahubproject.openapi.generated.RowCountTotal;
import io.datahubproject.openapi.generated.VolumeAssertionType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a dataset Volume Assertion
 */
@Schema(description = "Attributes defining a dataset Volume Assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VolumeAssertionInfo   {

  @JsonProperty("type") @Builder.Default
  private VolumeAssertionType type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("rowCountTotal") @Builder.Default
  private RowCountTotal rowCountTotal = null;

  @JsonProperty("rowCountChange") @Builder.Default
  private RowCountChange rowCountChange = null;

  @JsonProperty("incrementingSegmentRowCountTotal") @Builder.Default
  private IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal = null;

  @JsonProperty("incrementingSegmentRowCountChange") @Builder.Default
  private IncrementingSegmentRowCountChange incrementingSegmentRowCountChange = null;

  @JsonProperty("filter") @Builder.Default
  private DatasetFilter filter = null;

  public VolumeAssertionInfo type(VolumeAssertionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public VolumeAssertionType getType() {
    return type;
  }

  public void setType(VolumeAssertionType type) {
    this.type = type;
  }

  public VolumeAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by this Volume check.
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by this Volume check.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public VolumeAssertionInfo rowCountTotal(RowCountTotal rowCountTotal) {
    this.rowCountTotal = rowCountTotal;
    return this;
  }

  /**
   * Get rowCountTotal
   * @return rowCountTotal
   **/
  @Schema(description = "")
  
    @Valid
    public RowCountTotal getRowCountTotal() {
    return rowCountTotal;
  }

  public void setRowCountTotal(RowCountTotal rowCountTotal) {
    this.rowCountTotal = rowCountTotal;
  }

  public VolumeAssertionInfo rowCountChange(RowCountChange rowCountChange) {
    this.rowCountChange = rowCountChange;
    return this;
  }

  /**
   * Get rowCountChange
   * @return rowCountChange
   **/
  @Schema(description = "")
  
    @Valid
    public RowCountChange getRowCountChange() {
    return rowCountChange;
  }

  public void setRowCountChange(RowCountChange rowCountChange) {
    this.rowCountChange = rowCountChange;
  }

  public VolumeAssertionInfo incrementingSegmentRowCountTotal(IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal) {
    this.incrementingSegmentRowCountTotal = incrementingSegmentRowCountTotal;
    return this;
  }

  /**
   * Get incrementingSegmentRowCountTotal
   * @return incrementingSegmentRowCountTotal
   **/
  @Schema(description = "")
  
    @Valid
    public IncrementingSegmentRowCountTotal getIncrementingSegmentRowCountTotal() {
    return incrementingSegmentRowCountTotal;
  }

  public void setIncrementingSegmentRowCountTotal(IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal) {
    this.incrementingSegmentRowCountTotal = incrementingSegmentRowCountTotal;
  }

  public VolumeAssertionInfo incrementingSegmentRowCountChange(IncrementingSegmentRowCountChange incrementingSegmentRowCountChange) {
    this.incrementingSegmentRowCountChange = incrementingSegmentRowCountChange;
    return this;
  }

  /**
   * Get incrementingSegmentRowCountChange
   * @return incrementingSegmentRowCountChange
   **/
  @Schema(description = "")
  
    @Valid
    public IncrementingSegmentRowCountChange getIncrementingSegmentRowCountChange() {
    return incrementingSegmentRowCountChange;
  }

  public void setIncrementingSegmentRowCountChange(IncrementingSegmentRowCountChange incrementingSegmentRowCountChange) {
    this.incrementingSegmentRowCountChange = incrementingSegmentRowCountChange;
  }

  public VolumeAssertionInfo filter(DatasetFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetFilter getFilter() {
    return filter;
  }

  public void setFilter(DatasetFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeAssertionInfo volumeAssertionInfo = (VolumeAssertionInfo) o;
    return Objects.equals(this.type, volumeAssertionInfo.type) &&
        Objects.equals(this.entity, volumeAssertionInfo.entity) &&
        Objects.equals(this.rowCountTotal, volumeAssertionInfo.rowCountTotal) &&
        Objects.equals(this.rowCountChange, volumeAssertionInfo.rowCountChange) &&
        Objects.equals(this.incrementingSegmentRowCountTotal, volumeAssertionInfo.incrementingSegmentRowCountTotal) &&
        Objects.equals(this.incrementingSegmentRowCountChange, volumeAssertionInfo.incrementingSegmentRowCountChange) &&
        Objects.equals(this.filter, volumeAssertionInfo.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, rowCountTotal, rowCountChange, incrementingSegmentRowCountTotal, incrementingSegmentRowCountChange, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeAssertionInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    rowCountTotal: ").append(toIndentedString(rowCountTotal)).append("\n");
    sb.append("    rowCountChange: ").append(toIndentedString(rowCountChange)).append("\n");
    sb.append("    incrementingSegmentRowCountTotal: ").append(toIndentedString(incrementingSegmentRowCountTotal)).append("\n");
    sb.append("    incrementingSegmentRowCountChange: ").append(toIndentedString(incrementingSegmentRowCountChange)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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