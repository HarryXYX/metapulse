package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionActionsAspectResponseV2;
import io.datahubproject.openapi.generated.AssertionInfoAspectResponseV2;
import io.datahubproject.openapi.generated.AssertionKeyAspectResponseV2;
import io.datahubproject.openapi.generated.AssertionRunEventAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Assertion represents a data quality rule applied on one or more dataset.
 */
@Schema(description = "Assertion represents a data quality rule applied on one or more dataset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("assertionKey") @Builder.Default
  private AssertionKeyAspectResponseV2 assertionKey = null;

  @JsonProperty("assertionInfo") @Builder.Default
  private AssertionInfoAspectResponseV2 assertionInfo = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("assertionRunEvent") @Builder.Default
  private AssertionRunEventAspectResponseV2 assertionRunEvent = null;

  @JsonProperty("assertionActions") @Builder.Default
  private AssertionActionsAspectResponseV2 assertionActions = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  public AssertionEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for assertion
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for assertion")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public AssertionEntityResponseV2 assertionKey(AssertionKeyAspectResponseV2 assertionKey) {
    this.assertionKey = assertionKey;
    return this;
  }

  /**
   * Get assertionKey
   * @return assertionKey
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionKeyAspectResponseV2 getAssertionKey() {
    return assertionKey;
  }

  public void setAssertionKey(AssertionKeyAspectResponseV2 assertionKey) {
    this.assertionKey = assertionKey;
  }

  public AssertionEntityResponseV2 assertionInfo(AssertionInfoAspectResponseV2 assertionInfo) {
    this.assertionInfo = assertionInfo;
    return this;
  }

  /**
   * Get assertionInfo
   * @return assertionInfo
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionInfoAspectResponseV2 getAssertionInfo() {
    return assertionInfo;
  }

  public void setAssertionInfo(AssertionInfoAspectResponseV2 assertionInfo) {
    this.assertionInfo = assertionInfo;
  }

  public AssertionEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectResponseV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public AssertionEntityResponseV2 assertionRunEvent(AssertionRunEventAspectResponseV2 assertionRunEvent) {
    this.assertionRunEvent = assertionRunEvent;
    return this;
  }

  /**
   * Get assertionRunEvent
   * @return assertionRunEvent
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionRunEventAspectResponseV2 getAssertionRunEvent() {
    return assertionRunEvent;
  }

  public void setAssertionRunEvent(AssertionRunEventAspectResponseV2 assertionRunEvent) {
    this.assertionRunEvent = assertionRunEvent;
  }

  public AssertionEntityResponseV2 assertionActions(AssertionActionsAspectResponseV2 assertionActions) {
    this.assertionActions = assertionActions;
    return this;
  }

  /**
   * Get assertionActions
   * @return assertionActions
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionActionsAspectResponseV2 getAssertionActions() {
    return assertionActions;
  }

  public void setAssertionActions(AssertionActionsAspectResponseV2 assertionActions) {
    this.assertionActions = assertionActions;
  }

  public AssertionEntityResponseV2 status(StatusAspectResponseV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectResponseV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectResponseV2 status) {
    this.status = status;
  }

  public AssertionEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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
    AssertionEntityResponseV2 assertionEntityResponseV2 = (AssertionEntityResponseV2) o;
    return Objects.equals(this.urn, assertionEntityResponseV2.urn) &&
        Objects.equals(this.assertionKey, assertionEntityResponseV2.assertionKey) &&
        Objects.equals(this.assertionInfo, assertionEntityResponseV2.assertionInfo) &&
        Objects.equals(this.dataPlatformInstance, assertionEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.assertionRunEvent, assertionEntityResponseV2.assertionRunEvent) &&
        Objects.equals(this.assertionActions, assertionEntityResponseV2.assertionActions) &&
        Objects.equals(this.status, assertionEntityResponseV2.status) &&
        Objects.equals(this.globalTags, assertionEntityResponseV2.globalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, assertionKey, assertionInfo, dataPlatformInstance, assertionRunEvent, assertionActions, status, globalTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    assertionKey: ").append(toIndentedString(assertionKey)).append("\n");
    sb.append("    assertionInfo: ").append(toIndentedString(assertionInfo)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    assertionRunEvent: ").append(toIndentedString(assertionRunEvent)).append("\n");
    sb.append("    assertionActions: ").append(toIndentedString(assertionActions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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