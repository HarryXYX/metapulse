package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.CostCost;
import io.datahubproject.openapi.generated.CostType;
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
 * Cost
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cost  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Cost") @Builder.Default
  private String __type = "Cost";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Cost"},
  defaultValue = "Cost")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("costType") @Builder.Default
  private CostType costType = null;

  @JsonProperty("cost") @Builder.Default
  private CostCost cost = null;

  public Cost costType(CostType costType) {
    this.costType = costType;
    return this;
  }

  /**
   * Get costType
   * @return costType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CostType getCostType() {
    return costType;
  }

  public void setCostType(CostType costType) {
    this.costType = costType;
  }

  public Cost cost(CostCost cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CostCost getCost() {
    return cost;
  }

  public void setCost(CostCost cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cost cost = (Cost) o;
    return Objects.equals(this.costType, cost.costType) &&
        Objects.equals(this.cost, cost.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costType, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cost {\n");
    
    sb.append("    costType: ").append(toIndentedString(costType)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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