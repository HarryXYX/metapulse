package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AccessLevel;
import io.datahubproject.openapi.generated.ChangeAuditStamps;
import io.datahubproject.openapi.generated.ChartType;
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
 * Information about a chart
 */
@Schema(description = "Information about a chart")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartInfo  implements OneOfChartSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ChartInfo") @Builder.Default
  private String __type = "ChartInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ChartInfo"},
  defaultValue = "ChartInfo")
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

  @JsonProperty("lastModified") @Builder.Default
  private ChangeAuditStamps lastModified = null;

  @JsonProperty("chartUrl") @Builder.Default
  private String chartUrl = null;

  @JsonProperty("inputs") @Builder.Default
  @Valid
  private List<String> inputs = null;

  @JsonProperty("inputEdges") @Builder.Default
  @Valid
  private List<Edge> inputEdges = null;

  @JsonProperty("type") @Builder.Default
  private ChartType type = null;

  @JsonProperty("access") @Builder.Default
  private AccessLevel access = null;

  @JsonProperty("lastRefreshed") @Builder.Default
  private Long lastRefreshed = null;

  public ChartInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public ChartInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public ChartInfo externalUrl(String externalUrl) {
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

  public ChartInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the chart
   * @return title
   **/
  @Schema(required = true, description = "Title of the chart")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ChartInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description about the chart
   * @return description
   **/
  @Schema(required = true, description = "Detailed description about the chart")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChartInfo lastModified(ChangeAuditStamps lastModified) {
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

  public ChartInfo chartUrl(String chartUrl) {
    this.chartUrl = chartUrl;
    return this;
  }

  /**
   * URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart
   * @return chartUrl
   **/
  @Schema(description = "URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart")
  
    public String getChartUrl() {
    return chartUrl;
  }

  public void setChartUrl(String chartUrl) {
    this.chartUrl = chartUrl;
  }

  public ChartInfo inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ChartInfo addInputsItem(String inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Data sources for the chart Deprecated! Use inputEdges instead.
   * @return inputs
   **/
  @Schema(description = "Data sources for the chart Deprecated! Use inputEdges instead.")
  
    public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ChartInfo inputEdges(List<Edge> inputEdges) {
    this.inputEdges = inputEdges;
    return this;
  }

  public ChartInfo addInputEdgesItem(Edge inputEdgesItem) {
    if (this.inputEdges == null) {
      this.inputEdges = new ArrayList<>();
    }
    this.inputEdges.add(inputEdgesItem);
    return this;
  }

  /**
   * Data sources for the chart
   * @return inputEdges
   **/
  @Schema(description = "Data sources for the chart")
      @Valid
    public List<Edge> getInputEdges() {
    return inputEdges;
  }

  public void setInputEdges(List<Edge> inputEdges) {
    this.inputEdges = inputEdges;
  }

  public ChartInfo type(ChartType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    @Valid
    public ChartType getType() {
    return type;
  }

  public void setType(ChartType type) {
    this.type = type;
  }

  public ChartInfo access(AccessLevel access) {
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

  public ChartInfo lastRefreshed(Long lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

  /**
   * The time when this chart last refreshed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return lastRefreshed
   **/
  @Schema(description = "The time when this chart last refreshed")
  
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
    ChartInfo chartInfo = (ChartInfo) o;
    return Objects.equals(this.customProperties, chartInfo.customProperties) &&
        Objects.equals(this.externalUrl, chartInfo.externalUrl) &&
        Objects.equals(this.title, chartInfo.title) &&
        Objects.equals(this.description, chartInfo.description) &&
        Objects.equals(this.lastModified, chartInfo.lastModified) &&
        Objects.equals(this.chartUrl, chartInfo.chartUrl) &&
        Objects.equals(this.inputs, chartInfo.inputs) &&
        Objects.equals(this.inputEdges, chartInfo.inputEdges) &&
        Objects.equals(this.type, chartInfo.type) &&
        Objects.equals(this.access, chartInfo.access) &&
        Objects.equals(this.lastRefreshed, chartInfo.lastRefreshed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, title, description, lastModified, chartUrl, inputs, inputEdges, type, access, lastRefreshed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    chartUrl: ").append(toIndentedString(chartUrl)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    inputEdges: ").append(toIndentedString(inputEdges)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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