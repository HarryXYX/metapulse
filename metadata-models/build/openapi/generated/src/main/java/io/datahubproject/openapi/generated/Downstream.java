package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.DatasetLineageType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Downstream lineage information about a dataset including the source reporting the lineage
 */
@Schema(description = "Downstream lineage information about a dataset including the source reporting the lineage")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Downstream   {

  @JsonProperty("auditStamp") @Builder.Default
  private AuditStamp auditStamp = null;

  @JsonProperty("dataset") @Builder.Default
  private String dataset = null;

  @JsonProperty("type") @Builder.Default
  private DatasetLineageType type = null;

  public Downstream auditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
    return this;
  }

  /**
   * Get auditStamp
   * @return auditStamp
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getAuditStamp() {
    return auditStamp;
  }

  public void setAuditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
  }

  public Downstream dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The downstream dataset the lineage points to
   * @return dataset
   **/
  @Schema(required = true, description = "The downstream dataset the lineage points to")
      @NotNull

    public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public Downstream type(DatasetLineageType type) {
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
    public DatasetLineageType getType() {
    return type;
  }

  public void setType(DatasetLineageType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Downstream downstream = (Downstream) o;
    return Objects.equals(this.auditStamp, downstream.auditStamp) &&
        Objects.equals(this.dataset, downstream.dataset) &&
        Objects.equals(this.type, downstream.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStamp, dataset, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Downstream {\n");
    
    sb.append("    auditStamp: ").append(toIndentedString(auditStamp)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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