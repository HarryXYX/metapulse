package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ContainerAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelDeploymentKeyAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelDeploymentPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
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
 * MLModelDeployment object.
 */
@Schema(description = "MLModelDeployment object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelDeploymentEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlModelDeploymentKey") @Builder.Default
  private MLModelDeploymentKeyAspectRequestV2 mlModelDeploymentKey = null;

  @JsonProperty("mlModelDeploymentProperties") @Builder.Default
  private MLModelDeploymentPropertiesAspectRequestV2 mlModelDeploymentProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectRequestV2 container = null;

  public MLModelDeploymentEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for mlModelDeployment
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for mlModelDeployment")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public MLModelDeploymentEntityRequestV2 mlModelDeploymentKey(MLModelDeploymentKeyAspectRequestV2 mlModelDeploymentKey) {
    this.mlModelDeploymentKey = mlModelDeploymentKey;
    return this;
  }

  /**
   * Get mlModelDeploymentKey
   * @return mlModelDeploymentKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelDeploymentKeyAspectRequestV2 getMlModelDeploymentKey() {
    return mlModelDeploymentKey;
  }

  public void setMlModelDeploymentKey(MLModelDeploymentKeyAspectRequestV2 mlModelDeploymentKey) {
    this.mlModelDeploymentKey = mlModelDeploymentKey;
  }

  public MLModelDeploymentEntityRequestV2 mlModelDeploymentProperties(MLModelDeploymentPropertiesAspectRequestV2 mlModelDeploymentProperties) {
    this.mlModelDeploymentProperties = mlModelDeploymentProperties;
    return this;
  }

  /**
   * Get mlModelDeploymentProperties
   * @return mlModelDeploymentProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelDeploymentPropertiesAspectRequestV2 getMlModelDeploymentProperties() {
    return mlModelDeploymentProperties;
  }

  public void setMlModelDeploymentProperties(MLModelDeploymentPropertiesAspectRequestV2 mlModelDeploymentProperties) {
    this.mlModelDeploymentProperties = mlModelDeploymentProperties;
  }

  public MLModelDeploymentEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public MLModelDeploymentEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public MLModelDeploymentEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public MLModelDeploymentEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public MLModelDeploymentEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public MLModelDeploymentEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public MLModelDeploymentEntityRequestV2 container(ContainerAspectRequestV2 container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   **/
  @Schema(description = "")
  
    @Valid
    public ContainerAspectRequestV2 getContainer() {
    return container;
  }

  public void setContainer(ContainerAspectRequestV2 container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelDeploymentEntityRequestV2 mlModelDeploymentEntityRequestV2 = (MLModelDeploymentEntityRequestV2) o;
    return Objects.equals(this.urn, mlModelDeploymentEntityRequestV2.urn) &&
        Objects.equals(this.mlModelDeploymentKey, mlModelDeploymentEntityRequestV2.mlModelDeploymentKey) &&
        Objects.equals(this.mlModelDeploymentProperties, mlModelDeploymentEntityRequestV2.mlModelDeploymentProperties) &&
        Objects.equals(this.ownership, mlModelDeploymentEntityRequestV2.ownership) &&
        Objects.equals(this.status, mlModelDeploymentEntityRequestV2.status) &&
        Objects.equals(this.deprecation, mlModelDeploymentEntityRequestV2.deprecation) &&
        Objects.equals(this.globalTags, mlModelDeploymentEntityRequestV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlModelDeploymentEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.testResults, mlModelDeploymentEntityRequestV2.testResults) &&
        Objects.equals(this.container, mlModelDeploymentEntityRequestV2.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlModelDeploymentKey, mlModelDeploymentProperties, ownership, status, deprecation, globalTags, dataPlatformInstance, testResults, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelDeploymentEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    mlModelDeploymentKey: ").append(toIndentedString(mlModelDeploymentKey)).append("\n");
    sb.append("    mlModelDeploymentProperties: ").append(toIndentedString(mlModelDeploymentProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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