package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubIngestionSourceConfig;
import io.datahubproject.openapi.generated.DataHubIngestionSourceSchedule;
import io.datahubproject.openapi.generated.DataHubIngestionSourceSource;
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
 * Info about a DataHub ingestion source
 */
@Schema(description = "Info about a DataHub ingestion source")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubIngestionSourceInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubIngestionSourceInfo") @Builder.Default
  private String __type = "DataHubIngestionSourceInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubIngestionSourceInfo"},
  defaultValue = "DataHubIngestionSourceInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("schedule") @Builder.Default
  private DataHubIngestionSourceSchedule schedule = null;

  @JsonProperty("config") @Builder.Default
  private DataHubIngestionSourceConfig config = null;

  @JsonProperty("source") @Builder.Default
  private DataHubIngestionSourceSource source = null;

  public DataHubIngestionSourceInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the ingestion source
   * @return name
   **/
  @Schema(required = true, description = "The display name of the ingestion source")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubIngestionSourceInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
   * @return type
   **/
  @Schema(required = true, description = "The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataHubIngestionSourceInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Data Platform URN associated with the source
   * @return platform
   **/
  @Schema(description = "Data Platform URN associated with the source")
  
    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public DataHubIngestionSourceInfo schedule(DataHubIngestionSourceSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubIngestionSourceSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(DataHubIngestionSourceSchedule schedule) {
    this.schedule = schedule;
  }

  public DataHubIngestionSourceInfo config(DataHubIngestionSourceConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubIngestionSourceConfig getConfig() {
    return config;
  }

  public void setConfig(DataHubIngestionSourceConfig config) {
    this.config = config;
  }

  public DataHubIngestionSourceInfo source(DataHubIngestionSourceSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubIngestionSourceSource getSource() {
    return source;
  }

  public void setSource(DataHubIngestionSourceSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubIngestionSourceInfo dataHubIngestionSourceInfo = (DataHubIngestionSourceInfo) o;
    return Objects.equals(this.name, dataHubIngestionSourceInfo.name) &&
        Objects.equals(this.type, dataHubIngestionSourceInfo.type) &&
        Objects.equals(this.platform, dataHubIngestionSourceInfo.platform) &&
        Objects.equals(this.schedule, dataHubIngestionSourceInfo.schedule) &&
        Objects.equals(this.config, dataHubIngestionSourceInfo.config) &&
        Objects.equals(this.source, dataHubIngestionSourceInfo.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, platform, schedule, config, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubIngestionSourceInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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