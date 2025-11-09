package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.TagKeyAspectResponseV2;
import io.datahubproject.openapi.generated.TagPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.TestResultsAspectResponseV2;
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
public class TagEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("tagKey") @Builder.Default
  private TagKeyAspectResponseV2 tagKey = null;

  @JsonProperty("tagProperties") @Builder.Default
  private TagPropertiesAspectResponseV2 tagProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  public TagEntityResponseV2 urn(String urn) {
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

  public TagEntityResponseV2 tagKey(TagKeyAspectResponseV2 tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * Get tagKey
   * @return tagKey
   **/
  @Schema(description = "")
  
    @Valid
    public TagKeyAspectResponseV2 getTagKey() {
    return tagKey;
  }

  public void setTagKey(TagKeyAspectResponseV2 tagKey) {
    this.tagKey = tagKey;
  }

  public TagEntityResponseV2 tagProperties(TagPropertiesAspectResponseV2 tagProperties) {
    this.tagProperties = tagProperties;
    return this;
  }

  /**
   * Get tagProperties
   * @return tagProperties
   **/
  @Schema(description = "")
  
    @Valid
    public TagPropertiesAspectResponseV2 getTagProperties() {
    return tagProperties;
  }

  public void setTagProperties(TagPropertiesAspectResponseV2 tagProperties) {
    this.tagProperties = tagProperties;
  }

  public TagEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipAspectResponseV2 getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipAspectResponseV2 ownership) {
    this.ownership = ownership;
  }

  public TagEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
    this.deprecation = deprecation;
    return this;
  }

  /**
   * Get deprecation
   * @return deprecation
   **/
  @Schema(description = "")
  
    @Valid
    public DeprecationAspectResponseV2 getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(DeprecationAspectResponseV2 deprecation) {
    this.deprecation = deprecation;
  }

  public TagEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public TagEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
    this.testResults = testResults;
    return this;
  }

  /**
   * Get testResults
   * @return testResults
   **/
  @Schema(description = "")
  
    @Valid
    public TestResultsAspectResponseV2 getTestResults() {
    return testResults;
  }

  public void setTestResults(TestResultsAspectResponseV2 testResults) {
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
    TagEntityResponseV2 tagEntityResponseV2 = (TagEntityResponseV2) o;
    return Objects.equals(this.urn, tagEntityResponseV2.urn) &&
        Objects.equals(this.tagKey, tagEntityResponseV2.tagKey) &&
        Objects.equals(this.tagProperties, tagEntityResponseV2.tagProperties) &&
        Objects.equals(this.ownership, tagEntityResponseV2.ownership) &&
        Objects.equals(this.deprecation, tagEntityResponseV2.deprecation) &&
        Objects.equals(this.status, tagEntityResponseV2.status) &&
        Objects.equals(this.testResults, tagEntityResponseV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, tagKey, tagProperties, ownership, deprecation, status, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagEntityResponseV2 {\n");
    
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