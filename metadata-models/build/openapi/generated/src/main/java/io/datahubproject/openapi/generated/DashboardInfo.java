package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AccessLevel;
import io.datahubproject.openapi.generated.ChangeAuditStamps;
import io.datahubproject.openapi.generated.Edge;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a dashboard
 */
@Schema(description = "Information about a dashboard")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardInfo  implements OneOfDashboardSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DashboardInfo") @Builder.Default
  private String __type = "DashboardInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DashboardInfo"},
  defaultValue = "DashboardInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("charts") @Builder.Default
  @Valid
  private List<String> charts = new ArrayList<>();

  @JsonProperty("chartEdges") @Builder.Default
  @Valid
  private List<Edge> chartEdges = null;

  @JsonProperty("datasets") @Builder.Default
  @Valid
  private List<String> datasets = new ArrayList<>();

  @JsonProperty("datasetEdges") @Builder.Default
  @Valid
  private List<Edge> datasetEdges = null;

  @JsonProperty("dashboards") @Builder.Default
  @Valid
  private List<Edge> dashboards = new ArrayList<>();

  @JsonProperty("lastModified") @Builder.Default
  private ChangeAuditStamps lastModified = null;

  @JsonProperty("dashboardUrl") @Builder.Default
  private String dashboardUrl = null;

  @JsonProperty("access") @Builder.Default
  private AccessLevel access = null;

  @JsonProperty("lastRefreshed") @Builder.Default
  private Long lastRefreshed = null;

  public DashboardInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public DashboardInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public DashboardInfo externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * URL where the reference exist
   * @return externalUrl
   **/
  @Schema(description = "URL where the reference exist")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public DashboardInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the dashboard
   * @return title
   **/
  @Schema(required = true, description = "Title of the dashboard")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DashboardInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description about the dashboard
   * @return description
   **/
  @Schema(required = true, description = "Detailed description about the dashboard")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DashboardInfo charts(List<String> charts) {
    this.charts = charts;
    return this;
  }

  public DashboardInfo addChartsItem(String chartsItem) {
    this.charts.add(chartsItem);
    return this;
  }

  /**
   * Charts in a dashboard Deprecated! Use chartEdges instead.
   * @return charts
   **/
  @Schema(required = true, description = "Charts in a dashboard Deprecated! Use chartEdges instead.")
      @NotNull

    public List<String> getCharts() {
    return charts;
  }

  public void setCharts(List<String> charts) {
    this.charts = charts;
  }

  public DashboardInfo chartEdges(List<Edge> chartEdges) {
    this.chartEdges = chartEdges;
    return this;
  }

  public DashboardInfo addChartEdgesItem(Edge chartEdgesItem) {
    if (this.chartEdges == null) {
      this.chartEdges = new ArrayList<>();
    }
    this.chartEdges.add(chartEdgesItem);
    return this;
  }

  /**
   * Charts in a dashboard
   * @return chartEdges
   **/
  @Schema(description = "Charts in a dashboard")
      @Valid
    public List<Edge> getChartEdges() {
    return chartEdges;
  }

  public void setChartEdges(List<Edge> chartEdges) {
    this.chartEdges = chartEdges;
  }

  public DashboardInfo datasets(List<String> datasets) {
    this.datasets = datasets;
    return this;
  }

  public DashboardInfo addDatasetsItem(String datasetsItem) {
    this.datasets.add(datasetsItem);
    return this;
  }

  /**
   * Datasets consumed by a dashboard Deprecated! Use datasetEdges instead.
   * @return datasets
   **/
  @Schema(required = true, description = "Datasets consumed by a dashboard Deprecated! Use datasetEdges instead.")
      @NotNull

    public List<String> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<String> datasets) {
    this.datasets = datasets;
  }

  public DashboardInfo datasetEdges(List<Edge> datasetEdges) {
    this.datasetEdges = datasetEdges;
    return this;
  }

  public DashboardInfo addDatasetEdgesItem(Edge datasetEdgesItem) {
    if (this.datasetEdges == null) {
      this.datasetEdges = new ArrayList<>();
    }
    this.datasetEdges.add(datasetEdgesItem);
    return this;
  }

  /**
   * Datasets consumed by a dashboard
   * @return datasetEdges
   **/
  @Schema(description = "Datasets consumed by a dashboard")
      @Valid
    public List<Edge> getDatasetEdges() {
    return datasetEdges;
  }

  public void setDatasetEdges(List<Edge> datasetEdges) {
    this.datasetEdges = datasetEdges;
  }

  public DashboardInfo dashboards(List<Edge> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public DashboardInfo addDashboardsItem(Edge dashboardsItem) {
    this.dashboards.add(dashboardsItem);
    return this;
  }

  /**
   * Dashboards included by this dashboard. Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.  The Edge's sourceUrn should never be set, as it will always be the base dashboard.
   * @return dashboards
   **/
  @Schema(required = true, description = "Dashboards included by this dashboard. Some dashboard entities (e.g. PowerBI Apps) can contain other dashboards.  The Edge's sourceUrn should never be set, as it will always be the base dashboard.")
      @NotNull
    @Valid
    public List<Edge> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<Edge> dashboards) {
    this.dashboards = dashboards;
  }

  public DashboardInfo lastModified(ChangeAuditStamps lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ChangeAuditStamps getLastModified() {
    return lastModified;
  }

  public void setLastModified(ChangeAuditStamps lastModified) {
    this.lastModified = lastModified;
  }

  public DashboardInfo dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  /**
   * URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard
   * @return dashboardUrl
   **/
  @Schema(description = "URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard")
  
    public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }

  public DashboardInfo access(AccessLevel access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   **/
  @Schema(description = "")
  
    @Valid
    public AccessLevel getAccess() {
    return access;
  }

  public void setAccess(AccessLevel access) {
    this.access = access;
  }

  public DashboardInfo lastRefreshed(Long lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

  /**
   * The time when this dashboard last refreshed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastRefreshed
   **/
  @Schema(description = "The time when this dashboard last refreshed")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(Long lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardInfo dashboardInfo = (DashboardInfo) o;
    return Objects.equals(this.customProperties, dashboardInfo.customProperties) &&
        Objects.equals(this.externalUrl, dashboardInfo.externalUrl) &&
        Objects.equals(this.title, dashboardInfo.title) &&
        Objects.equals(this.description, dashboardInfo.description) &&
        Objects.equals(this.charts, dashboardInfo.charts) &&
        Objects.equals(this.chartEdges, dashboardInfo.chartEdges) &&
        Objects.equals(this.datasets, dashboardInfo.datasets) &&
        Objects.equals(this.datasetEdges, dashboardInfo.datasetEdges) &&
        Objects.equals(this.dashboards, dashboardInfo.dashboards) &&
        Objects.equals(this.lastModified, dashboardInfo.lastModified) &&
        Objects.equals(this.dashboardUrl, dashboardInfo.dashboardUrl) &&
        Objects.equals(this.access, dashboardInfo.access) &&
        Objects.equals(this.lastRefreshed, dashboardInfo.lastRefreshed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, title, description, charts, chartEdges, datasets, datasetEdges, dashboards, lastModified, dashboardUrl, access, lastRefreshed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    chartEdges: ").append(toIndentedString(chartEdges)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    datasetEdges: ").append(toIndentedString(datasetEdges)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
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