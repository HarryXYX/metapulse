package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.IncidentInfoAspectResponseV2;
import io.datahubproject.openapi.generated.IncidentKeyAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * An incident for an asset.
 */
@Schema(description = "An incident for an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("incidentKey") @Builder.Default
  private IncidentKeyAspectResponseV2 incidentKey = null;

  @JsonProperty("incidentInfo") @Builder.Default
  private IncidentInfoAspectResponseV2 incidentInfo = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  public IncidentEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for incident
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for incident")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public IncidentEntityResponseV2 incidentKey(IncidentKeyAspectResponseV2 incidentKey) {
    this.incidentKey = incidentKey;
    return this;
  }

  /**
   * Get incidentKey
   * @return incidentKey
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentKeyAspectResponseV2 getIncidentKey() {
    return incidentKey;
  }

  public void setIncidentKey(IncidentKeyAspectResponseV2 incidentKey) {
    this.incidentKey = incidentKey;
  }

  public IncidentEntityResponseV2 incidentInfo(IncidentInfoAspectResponseV2 incidentInfo) {
    this.incidentInfo = incidentInfo;
    return this;
  }

  /**
   * Get incidentInfo
   * @return incidentInfo
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentInfoAspectResponseV2 getIncidentInfo() {
    return incidentInfo;
  }

  public void setIncidentInfo(IncidentInfoAspectResponseV2 incidentInfo) {
    this.incidentInfo = incidentInfo;
  }

  public IncidentEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
    this.globalTags = globalTags;
    return this;
  }

  /**
   * Get globalTags
   * @return globalTags
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalTagsAspectResponseV2 getGlobalTags() {
    return globalTags;
  }

  public void setGlobalTags(GlobalTagsAspectResponseV2 globalTags) {
    this.globalTags = globalTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentEntityResponseV2 incidentEntityResponseV2 = (IncidentEntityResponseV2) o;
    return Objects.equals(this.urn, incidentEntityResponseV2.urn) &&
        Objects.equals(this.incidentKey, incidentEntityResponseV2.incidentKey) &&
        Objects.equals(this.incidentInfo, incidentEntityResponseV2.incidentInfo) &&
        Objects.equals(this.globalTags, incidentEntityResponseV2.globalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, incidentKey, incidentInfo, globalTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    incidentKey: ").append(toIndentedString(incidentKey)).append("\n");
    sb.append("    incidentInfo: ").append(toIndentedString(incidentInfo)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
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