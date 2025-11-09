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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Key for a Chart
 */
@Schema(description = "Key for a Chart")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartKey  implements OneOfChartSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ChartKey") @Builder.Default
  private String __type = "ChartKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ChartKey"},
  defaultValue = "ChartKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("dashboardTool") @Builder.Default
  private String dashboardTool = null;

  @JsonProperty("chartId") @Builder.Default
  private String chartId = null;

  public ChartKey dashboardTool(String dashboardTool) {
    this.dashboardTool = dashboardTool;
    return this;
  }

  /**
   * The name of the dashboard tool such as looker, redash etc.
   * @return dashboardTool
   **/
  @Schema(required = true, description = "The name of the dashboard tool such as looker, redash etc.")
      @NotNull

    public String getDashboardTool() {
    return dashboardTool;
  }

  public void setDashboardTool(String dashboardTool) {
    this.dashboardTool = dashboardTool;
  }

  public ChartKey chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'
   * @return chartId
   **/
  @Schema(required = true, description = "Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'")
      @NotNull

    public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartKey chartKey = (ChartKey) o;
    return Objects.equals(this.dashboardTool, chartKey.dashboardTool) &&
        Objects.equals(this.chartId, chartKey.chartId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardTool, chartId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartKey {\n");
    
    sb.append("    dashboardTool: ").append(toIndentedString(dashboardTool)).append("\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
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