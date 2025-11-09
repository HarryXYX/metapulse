package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * GroupingCriterion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupingCriterion   {

  @JsonProperty("baseEntityType") @Builder.Default
  private String baseEntityType = null;

  @JsonProperty("groupingEntityType") @Builder.Default
  private String groupingEntityType = null;

  public GroupingCriterion baseEntityType(String baseEntityType) {
    this.baseEntityType = baseEntityType;
    return this;
  }

  /**
   * The type of the entity to be grouped. e.g. schemaField Omitting this field will result in all base entities being grouped.
   * @return baseEntityType
   **/
  @Schema(description = "The type of the entity to be grouped. e.g. schemaField Omitting this field will result in all base entities being grouped.")
  
    public String getBaseEntityType() {
    return baseEntityType;
  }

  public void setBaseEntityType(String baseEntityType) {
    this.baseEntityType = baseEntityType;
  }

  public GroupingCriterion groupingEntityType(String groupingEntityType) {
    this.groupingEntityType = groupingEntityType;
    return this;
  }

  /**
   * The type of the entity to be grouped into. e.g. dataset, domain, etc.
   * @return groupingEntityType
   **/
  @Schema(required = true, description = "The type of the entity to be grouped into. e.g. dataset, domain, etc.")
      @NotNull

    public String getGroupingEntityType() {
    return groupingEntityType;
  }

  public void setGroupingEntityType(String groupingEntityType) {
    this.groupingEntityType = groupingEntityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupingCriterion groupingCriterion = (GroupingCriterion) o;
    return Objects.equals(this.baseEntityType, groupingCriterion.baseEntityType) &&
        Objects.equals(this.groupingEntityType, groupingCriterion.groupingEntityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseEntityType, groupingEntityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupingCriterion {\n");
    
    sb.append("    baseEntityType: ").append(toIndentedString(baseEntityType)).append("\n");
    sb.append("    groupingEntityType: ").append(toIndentedString(groupingEntityType)).append("\n");
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