package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AspectRowSummary;
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
 * AspectRowSummaryList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AspectRowSummaryList   {

  @JsonProperty("aspectRowSummaries") @Builder.Default
  @Valid
  private List<AspectRowSummary> aspectRowSummaries = new ArrayList<>();

  public AspectRowSummaryList aspectRowSummaries(List<AspectRowSummary> aspectRowSummaries) {
    this.aspectRowSummaries = aspectRowSummaries;
    return this;
  }

  public AspectRowSummaryList addAspectRowSummariesItem(AspectRowSummary aspectRowSummariesItem) {
    this.aspectRowSummaries.add(aspectRowSummariesItem);
    return this;
  }

  /**
   * Get aspectRowSummaries
   * @return aspectRowSummaries
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<AspectRowSummary> getAspectRowSummaries() {
    return aspectRowSummaries;
  }

  public void setAspectRowSummaries(List<AspectRowSummary> aspectRowSummaries) {
    this.aspectRowSummaries = aspectRowSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AspectRowSummaryList aspectRowSummaryList = (AspectRowSummaryList) o;
    return Objects.equals(this.aspectRowSummaries, aspectRowSummaryList.aspectRowSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRowSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AspectRowSummaryList {\n");
    
    sb.append("    aspectRowSummaries: ").append(toIndentedString(aspectRowSummaries)).append("\n");
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