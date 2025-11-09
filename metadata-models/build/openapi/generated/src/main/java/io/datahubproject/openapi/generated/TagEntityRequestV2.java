package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.TagKeyAspectRequestV2;
import io.datahubproject.openapi.generated.TagPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.TestResultsAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Tag object.
 */
@Schema(description = "Tag object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("tagKey") @Builder.Default
  private TagKeyAspectRequestV2 tagKey = null;

  @JsonProperty("tagProperties") @Builder.Default
  private TagPropertiesAspectRequestV2 tagProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  public TagEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for tag
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for tag")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public TagEntityRequestV2 tagKey(TagKeyAspectRequestV2 tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * Get tagKey
   * @return tagKey
   **/
  @Schema(description = "")
  
    @Valid
    public TagKeyAspectRequestV2 getTagKey() {
    return tagKey;
  }

  public void setTagKey(TagKeyAspectRequestV2 tagKey) {
    this.tagKey = tagKey;
  }

  public TagEntityRequestV2 tagProperties(TagPropertiesAspectRequestV2 tagProperties) {
    this.tagProperties = tagProperties;
    return this;
  }

  /**
   * Get tagProperties
   * @return tagProperties
   **/
  @Schema(description = "")
  
    @Valid
    public TagPropertiesAspectRequestV2 getTagProperties() {
    return tagProperties;
  }

  public void setTagProperties(TagPropertiesAspectRequestV2 tagProperties) {
    this.tagProperties = tagProperties;
  }

  public TagEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipAspectRequestV2 getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipAspectRequestV2 ownership) {
    this.ownership = ownership;
  }

  public TagEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
    this.deprecation = deprecation;
    return this;
  }

  /**
   * Get deprecation
   * @return deprecation
   **/
  @Schema(description = "")
  
    @Valid
    public DeprecationAspectRequestV2 getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(DeprecationAspectRequestV2 deprecation) {
    this.deprecation = deprecation;
  }

  public TagEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public TagEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
    this.testResults = testResults;
    return this;
  }

  /**
   * Get testResults
   * @return testResults
   **/
  @Schema(description = "")
  
    @Valid
    public TestResultsAspectRequestV2 getTestResults() {
    return testResults;
  }

  public void setTestResults(TestResultsAspectRequestV2 testResults) {
    this.testResults = testResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagEntityRequestV2 tagEntityRequestV2 = (TagEntityRequestV2) o;
    return Objects.equals(this.urn, tagEntityRequestV2.urn) &&
        Objects.equals(this.tagKey, tagEntityRequestV2.tagKey) &&
        Objects.equals(this.tagProperties, tagEntityRequestV2.tagProperties) &&
        Objects.equals(this.ownership, tagEntityRequestV2.ownership) &&
        Objects.equals(this.deprecation, tagEntityRequestV2.deprecation) &&
        Objects.equals(this.status, tagEntityRequestV2.status) &&
        Objects.equals(this.testResults, tagEntityRequestV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, tagKey, tagProperties, ownership, deprecation, status, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagProperties: ").append(toIndentedString(tagProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
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