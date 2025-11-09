package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.CostCostDiscriminator;
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
 * CostCost
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CostCost   {

  @JsonProperty("costId") @Builder.Default
  private BigDecimal costId = null;

  @JsonProperty("costCode") @Builder.Default
  private String costCode = null;

  @JsonProperty("fieldDiscriminator") @Builder.Default
  private CostCostDiscriminator fieldDiscriminator = null;

  public CostCost costId(BigDecimal costId) {
    this.costId = costId;
    return this;
  }

  /**
   * Get costId
   * @return costId
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getCostId() {
    return costId;
  }

  public void setCostId(BigDecimal costId) {
    this.costId = costId;
  }

  public CostCost costCode(String costCode) {
    this.costCode = costCode;
    return this;
  }

  /**
   * Get costCode
   * @return costCode
   **/
  @Schema(description = "")
  
    public String getCostCode() {
    return costCode;
  }

  public void setCostCode(String costCode) {
    this.costCode = costCode;
  }

  public CostCost fieldDiscriminator(CostCostDiscriminator fieldDiscriminator) {
    this.fieldDiscriminator = fieldDiscriminator;
    return this;
  }

  /**
   * Get fieldDiscriminator
   * @return fieldDiscriminator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CostCostDiscriminator getFieldDiscriminator() {
    return fieldDiscriminator;
  }

  public void setFieldDiscriminator(CostCostDiscriminator fieldDiscriminator) {
    this.fieldDiscriminator = fieldDiscriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostCost costCost = (CostCost) o;
    return Objects.equals(this.costId, costCost.costId) &&
        Objects.equals(this.costCode, costCost.costCode) &&
        Objects.equals(this.fieldDiscriminator, costCost.fieldDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costId, costCode, fieldDiscriminator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostCost {\n");
    
    sb.append("    costId: ").append(toIndentedString(costId)).append("\n");
    sb.append("    costCode: ").append(toIndentedString(costCode)).append("\n");
    sb.append("    fieldDiscriminator: ").append(toIndentedString(fieldDiscriminator)).append("\n");
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