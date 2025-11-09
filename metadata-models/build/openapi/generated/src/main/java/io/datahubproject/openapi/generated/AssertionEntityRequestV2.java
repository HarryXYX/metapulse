package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionActionsAspectRequestV2;
import io.datahubproject.openapi.generated.AssertionInfoAspectRequestV2;
import io.datahubproject.openapi.generated.AssertionKeyAspectRequestV2;
import io.datahubproject.openapi.generated.AssertionRunEventAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
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
public class AssertionEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("assertionKey") @Builder.Default
  private AssertionKeyAspectRequestV2 assertionKey = null;

  @JsonProperty("assertionInfo") @Builder.Default
  private AssertionInfoAspectRequestV2 assertionInfo = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("assertionRunEvent") @Builder.Default
  private AssertionRunEventAspectRequestV2 assertionRunEvent = null;

  @JsonProperty("assertionActions") @Builder.Default
  private AssertionActionsAspectRequestV2 assertionActions = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  public AssertionEntityRequestV2 urn(String urn) {
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

  public AssertionEntityRequestV2 assertionKey(AssertionKeyAspectRequestV2 assertionKey) {
    this.assertionKey = assertionKey;
    return this;
  }

  /**
   * Get assertionKey
   * @return assertionKey
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionKeyAspectRequestV2 getAssertionKey() {
    return assertionKey;
  }

  public void setAssertionKey(AssertionKeyAspectRequestV2 assertionKey) {
    this.assertionKey = assertionKey;
  }

  public AssertionEntityRequestV2 assertionInfo(AssertionInfoAspectRequestV2 assertionInfo) {
    this.assertionInfo = assertionInfo;
    return this;
  }

  /**
   * Get assertionInfo
   * @return assertionInfo
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionInfoAspectRequestV2 getAssertionInfo() {
    return assertionInfo;
  }

  public void setAssertionInfo(AssertionInfoAspectRequestV2 assertionInfo) {
    this.assertionInfo = assertionInfo;
  }

  public AssertionEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectRequestV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public AssertionEntityRequestV2 assertionRunEvent(AssertionRunEventAspectRequestV2 assertionRunEvent) {
    this.assertionRunEvent = assertionRunEvent;
    return this;
  }

  /**
   * Get assertionRunEvent
   * @return assertionRunEvent
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionRunEventAspectRequestV2 getAssertionRunEvent() {
    return assertionRunEvent;
  }

  public void setAssertionRunEvent(AssertionRunEventAspectRequestV2 assertionRunEvent) {
    this.assertionRunEvent = assertionRunEvent;
  }

  public AssertionEntityRequestV2 assertionActions(AssertionActionsAspectRequestV2 assertionActions) {
    this.assertionActions = assertionActions;
    return this;
  }

  /**
   * Get assertionActions
   * @return assertionActions
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionActionsAspectRequestV2 getAssertionActions() {
    return assertionActions;
  }

  public void setAssertionActions(AssertionActionsAspectRequestV2 assertionActions) {
    this.assertionActions = assertionActions;
  }

  public AssertionEntityRequestV2 status(StatusAspectRequestV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectRequestV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectRequestV2 status) {
    this.status = status;
  }

  public AssertionEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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
    AssertionEntityRequestV2 assertionEntityRequestV2 = (AssertionEntityRequestV2) o;
    return Objects.equals(this.urn, assertionEntityRequestV2.urn) &&
        Objects.equals(this.assertionKey, assertionEntityRequestV2.assertionKey) &&
        Objects.equals(this.assertionInfo, assertionEntityRequestV2.assertionInfo) &&
        Objects.equals(this.dataPlatformInstance, assertionEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.assertionRunEvent, assertionEntityRequestV2.assertionRunEvent) &&
        Objects.equals(this.assertionActions, assertionEntityRequestV2.assertionActions) &&
        Objects.equals(this.status, assertionEntityRequestV2.status) &&
        Objects.equals(this.globalTags, assertionEntityRequestV2.globalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, assertionKey, assertionInfo, dataPlatformInstance, assertionRunEvent, assertionActions, status, globalTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionEntityRequestV2 {\n");
    
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