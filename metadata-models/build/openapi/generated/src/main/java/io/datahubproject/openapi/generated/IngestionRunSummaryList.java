package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IngestionRunSummary;
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
 * IngestionRunSummaryList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IngestionRunSummaryList   {

  @JsonProperty("ingestionRunSummaries") @Builder.Default
  @Valid
  private List<IngestionRunSummary> ingestionRunSummaries = new ArrayList<>();

  public IngestionRunSummaryList ingestionRunSummaries(List<IngestionRunSummary> ingestionRunSummaries) {
    this.ingestionRunSummaries = ingestionRunSummaries;
    return this;
  }

  public IngestionRunSummaryList addIngestionRunSummariesItem(IngestionRunSummary ingestionRunSummariesItem) {
    this.ingestionRunSummaries.add(ingestionRunSummariesItem);
    return this;
  }

  /**
   * Get ingestionRunSummaries
   * @return ingestionRunSummaries
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<IngestionRunSummary> getIngestionRunSummaries() {
    return ingestionRunSummaries;
  }

  public void setIngestionRunSummaries(List<IngestionRunSummary> ingestionRunSummaries) {
    this.ingestionRunSummaries = ingestionRunSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestionRunSummaryList ingestionRunSummaryList = (IngestionRunSummaryList) o;
    return Objects.equals(this.ingestionRunSummaries, ingestionRunSummaryList.ingestionRunSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionRunSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestionRunSummaryList {\n");
    
    sb.append("    ingestionRunSummaries: ").append(toIndentedString(ingestionRunSummaries)).append("\n");
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