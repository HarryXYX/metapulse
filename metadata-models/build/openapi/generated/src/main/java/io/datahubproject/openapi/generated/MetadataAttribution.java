package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
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
/**
 * Information about who, why, and how this metadata was applied
 */
@Schema(description = "Information about who, why, and how this metadata was applied")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetadataAttribution   {

  @JsonProperty("time") @Builder.Default
  private Long time = null;

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("source") @Builder.Default
  private String source = null;

  @JsonProperty("sourceDetail") @Builder.Default
  @Valid
  private Map<String, String> sourceDetail = new HashMap<>();

  public MetadataAttribution time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * When this metadata was updated.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return time
   **/
  @Schema(required = true, description = "When this metadata was updated.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MetadataAttribution actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * The entity (e.g. a member URN) responsible for applying the assocated metadata. This can either be a user (in case of UI edits) or the datahub system for automation.
   * @return actor
   **/
  @Schema(required = true, description = "The entity (e.g. a member URN) responsible for applying the assocated metadata. This can either be a user (in case of UI edits) or the datahub system for automation.")
      @NotNull

    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public MetadataAttribution source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The DataHub source responsible for applying the associated metadata. This will only be filled out when a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.
   * @return source
   **/
  @Schema(description = "The DataHub source responsible for applying the associated metadata. This will only be filled out when a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MetadataAttribution sourceDetail(Map<String, String> sourceDetail) {
    this.sourceDetail = sourceDetail;
    return this;
  }

  public MetadataAttribution putSourceDetailItem(String key, String sourceDetailItem) {
    this.sourceDetail.put(key, sourceDetailItem);
    return this;
  }

  /**
   * The details associated with why this metadata was applied. For example, this could include the actual regex rule, sql statement, ingestion pipeline ID, etc.
   * @return sourceDetail
   **/
  @Schema(required = true, description = "The details associated with why this metadata was applied. For example, this could include the actual regex rule, sql statement, ingestion pipeline ID, etc.")
      @NotNull

    public Map<String, String> getSourceDetail() {
    return sourceDetail;
  }

  public void setSourceDetail(Map<String, String> sourceDetail) {
    this.sourceDetail = sourceDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataAttribution metadataAttribution = (MetadataAttribution) o;
    return Objects.equals(this.time, metadataAttribution.time) &&
        Objects.equals(this.actor, metadataAttribution.actor) &&
        Objects.equals(this.source, metadataAttribution.source) &&
        Objects.equals(this.sourceDetail, metadataAttribution.sourceDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, actor, source, sourceDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataAttribution {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDetail: ").append(toIndentedString(sourceDetail)).append("\n");
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