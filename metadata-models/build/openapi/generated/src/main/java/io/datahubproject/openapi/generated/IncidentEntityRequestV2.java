package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.IncidentInfoAspectRequestV2;
import io.datahubproject.openapi.generated.IncidentKeyAspectRequestV2;
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
public class IncidentEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("incidentKey") @Builder.Default
  private IncidentKeyAspectRequestV2 incidentKey = null;

  @JsonProperty("incidentInfo") @Builder.Default
  private IncidentInfoAspectRequestV2 incidentInfo = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  public IncidentEntityRequestV2 urn(String urn) {
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

  public IncidentEntityRequestV2 incidentKey(IncidentKeyAspectRequestV2 incidentKey) {
    this.incidentKey = incidentKey;
    return this;
  }

  /**
   * Get incidentKey
   * @return incidentKey
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentKeyAspectRequestV2 getIncidentKey() {
    return incidentKey;
  }

  public void setIncidentKey(IncidentKeyAspectRequestV2 incidentKey) {
    this.incidentKey = incidentKey;
  }

  public IncidentEntityRequestV2 incidentInfo(IncidentInfoAspectRequestV2 incidentInfo) {
    this.incidentInfo = incidentInfo;
    return this;
  }

  /**
   * Get incidentInfo
   * @return incidentInfo
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentInfoAspectRequestV2 getIncidentInfo() {
    return incidentInfo;
  }

  public void setIncidentInfo(IncidentInfoAspectRequestV2 incidentInfo) {
    this.incidentInfo = incidentInfo;
  }

  public IncidentEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
    this.globalTags = globalTags;
    return this;
  }

  /**
   * Get globalTags
   * @return globalTags
   **/
  @Schema(description = "")
  
    @Valid
    public GlobalTagsAspectRequestV2 getGlobalTags() {
    return globalTags;
  }

  public void setGlobalTags(GlobalTagsAspectRequestV2 globalTags) {
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
    IncidentEntityRequestV2 incidentEntityRequestV2 = (IncidentEntityRequestV2) o;
    return Objects.equals(this.urn, incidentEntityRequestV2.urn) &&
        Objects.equals(this.incidentKey, incidentEntityRequestV2.incidentKey) &&
        Objects.equals(this.incidentInfo, incidentEntityRequestV2.incidentInfo) &&
        Objects.equals(this.globalTags, incidentEntityRequestV2.globalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, incidentKey, incidentInfo, globalTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentEntityRequestV2 {\n");
    
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