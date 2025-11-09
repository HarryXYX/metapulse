package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SummaryElement;
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
 * The page template info for asset summaries
 */
@Schema(description = "The page template info for asset summaries")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageTemplateAssetSummary   {

  @JsonProperty("summaryElements") @Builder.Default
  @Valid
  private List<SummaryElement> summaryElements = null;

  public DataHubPageTemplateAssetSummary summaryElements(List<SummaryElement> summaryElements) {
    this.summaryElements = summaryElements;
    return this;
  }

  public DataHubPageTemplateAssetSummary addSummaryElementsItem(SummaryElement summaryElementsItem) {
    if (this.summaryElements == null) {
      this.summaryElements = new ArrayList<>();
    }
    this.summaryElements.add(summaryElementsItem);
    return this;
  }

  /**
   * The optional list of properties shown on an asset summary page header.
   * @return summaryElements
   **/
  @Schema(description = "The optional list of properties shown on an asset summary page header.")
      @Valid
    public List<SummaryElement> getSummaryElements() {
    return summaryElements;
  }

  public void setSummaryElements(List<SummaryElement> summaryElements) {
    this.summaryElements = summaryElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageTemplateAssetSummary dataHubPageTemplateAssetSummary = (DataHubPageTemplateAssetSummary) o;
    return Objects.equals(this.summaryElements, dataHubPageTemplateAssetSummary.summaryElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageTemplateAssetSummary {\n");
    
    sb.append("    summaryElements: ").append(toIndentedString(summaryElements)).append("\n");
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