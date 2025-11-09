package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Aspect;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * AspectRowSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AspectRowSummary   {

  @JsonProperty("runId") @Builder.Default
  private String runId = null;

  @JsonProperty("aspectName") @Builder.Default
  private String aspectName = null;

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("timestamp") @Builder.Default
  private Long timestamp = null;

  @JsonProperty("metadata") @Builder.Default
  private String metadata = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  @JsonProperty("keyAspect") @Builder.Default
  private Boolean keyAspect = null;

  @JsonProperty("aspect") @Builder.Default
  private Aspect aspect = null;

  @JsonProperty("telemetryTraceId") @Builder.Default
  private String telemetryTraceId = null;

  public AspectRowSummary runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Get runId
   * @return runId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public AspectRowSummary aspectName(String aspectName) {
    this.aspectName = aspectName;
    return this;
  }

  /**
   * Get aspectName
   * @return aspectName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAspectName() {
    return aspectName;
  }

  public void setAspectName(String aspectName) {
    this.aspectName = aspectName;
  }

  public AspectRowSummary urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Get urn
   * @return urn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public AspectRowSummary timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestamp
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public AspectRowSummary metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public AspectRowSummary version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public AspectRowSummary keyAspect(Boolean keyAspect) {
    this.keyAspect = keyAspect;
    return this;
  }

  /**
   * Get keyAspect
   * @return keyAspect
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isKeyAspect() {
    return keyAspect;
  }

  public void setKeyAspect(Boolean keyAspect) {
    this.keyAspect = keyAspect;
  }

  public AspectRowSummary aspect(Aspect aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Get aspect
   * @return aspect
   **/
  @Schema(description = "")
  
    @Valid
    public Aspect getAspect() {
    return aspect;
  }

  public void setAspect(Aspect aspect) {
    this.aspect = aspect;
  }

  public AspectRowSummary telemetryTraceId(String telemetryTraceId) {
    this.telemetryTraceId = telemetryTraceId;
    return this;
  }

  /**
   * Get telemetryTraceId
   * @return telemetryTraceId
   **/
  @Schema(description = "")
  
    public String getTelemetryTraceId() {
    return telemetryTraceId;
  }

  public void setTelemetryTraceId(String telemetryTraceId) {
    this.telemetryTraceId = telemetryTraceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AspectRowSummary aspectRowSummary = (AspectRowSummary) o;
    return Objects.equals(this.runId, aspectRowSummary.runId) &&
        Objects.equals(this.aspectName, aspectRowSummary.aspectName) &&
        Objects.equals(this.urn, aspectRowSummary.urn) &&
        Objects.equals(this.timestamp, aspectRowSummary.timestamp) &&
        Objects.equals(this.metadata, aspectRowSummary.metadata) &&
        Objects.equals(this.version, aspectRowSummary.version) &&
        Objects.equals(this.keyAspect, aspectRowSummary.keyAspect) &&
        Objects.equals(this.aspect, aspectRowSummary.aspect) &&
        Objects.equals(this.telemetryTraceId, aspectRowSummary.telemetryTraceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, aspectName, urn, timestamp, metadata, version, keyAspect, aspect, telemetryTraceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AspectRowSummary {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    aspectName: ").append(toIndentedString(aspectName)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    keyAspect: ").append(toIndentedString(keyAspect)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    telemetryTraceId: ").append(toIndentedString(telemetryTraceId)).append("\n");
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