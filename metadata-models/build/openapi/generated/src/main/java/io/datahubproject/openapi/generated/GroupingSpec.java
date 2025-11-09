package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GroupingCriterion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A set of directives to control how results are grouped. The underlying generic groupings are nested to allow for further evolution of the grouping spec.
 */
@Schema(description = "A set of directives to control how results are grouped. The underlying generic groupings are nested to allow for further evolution of the grouping spec.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupingSpec   {

  @JsonProperty("groupingCriteria") @Builder.Default
  @Valid
  private List<GroupingCriterion> groupingCriteria = new ArrayList<>();

  public GroupingSpec groupingCriteria(List<GroupingCriterion> groupingCriteria) {
    this.groupingCriteria = groupingCriteria;
    return this;
  }

  public GroupingSpec addGroupingCriteriaItem(GroupingCriterion groupingCriteriaItem) {
    this.groupingCriteria.add(groupingCriteriaItem);
    return this;
  }

  /**
   * A list of generic directives to group results by.
   * @return groupingCriteria
   **/
  @Schema(required = true, description = "A list of generic directives to group results by.")
      @NotNull
    @Valid
    public List<GroupingCriterion> getGroupingCriteria() {
    return groupingCriteria;
  }

  public void setGroupingCriteria(List<GroupingCriterion> groupingCriteria) {
    this.groupingCriteria = groupingCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupingSpec groupingSpec = (GroupingSpec) o;
    return Objects.equals(this.groupingCriteria, groupingSpec.groupingCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupingSpec {\n");
    
    sb.append("    groupingCriteria: ").append(toIndentedString(groupingCriteria)).append("\n");
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