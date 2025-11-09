package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ContainerAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelDeploymentKeyAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelDeploymentPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
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
 * MLModelDeployment object.
 */
@Schema(description = "MLModelDeployment object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelDeploymentEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlModelDeploymentKey") @Builder.Default
  private MLModelDeploymentKeyAspectResponseV2 mlModelDeploymentKey = null;

  @JsonProperty("mlModelDeploymentProperties") @Builder.Default
  private MLModelDeploymentPropertiesAspectResponseV2 mlModelDeploymentProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectResponseV2 container = null;

  public MLModelDeploymentEntityResponseV2 urn(String urn) {
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

  public MLModelDeploymentEntityResponseV2 mlModelDeploymentKey(MLModelDeploymentKeyAspectResponseV2 mlModelDeploymentKey) {
    this.mlModelDeploymentKey = mlModelDeploymentKey;
    return this;
  }

  /**
   * Get mlModelDeploymentKey
   * @return mlModelDeploymentKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelDeploymentKeyAspectResponseV2 getMlModelDeploymentKey() {
    return mlModelDeploymentKey;
  }

  public void setMlModelDeploymentKey(MLModelDeploymentKeyAspectResponseV2 mlModelDeploymentKey) {
    this.mlModelDeploymentKey = mlModelDeploymentKey;
  }

  public MLModelDeploymentEntityResponseV2 mlModelDeploymentProperties(MLModelDeploymentPropertiesAspectResponseV2 mlModelDeploymentProperties) {
    this.mlModelDeploymentProperties = mlModelDeploymentProperties;
    return this;
  }

  /**
   * Get mlModelDeploymentProperties
   * @return mlModelDeploymentProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelDeploymentPropertiesAspectResponseV2 getMlModelDeploymentProperties() {
    return mlModelDeploymentProperties;
  }

  public void setMlModelDeploymentProperties(MLModelDeploymentPropertiesAspectResponseV2 mlModelDeploymentProperties) {
    this.mlModelDeploymentProperties = mlModelDeploymentProperties;
  }

  public MLModelDeploymentEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public MLModelDeploymentEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public MLModelDeploymentEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public MLModelDeploymentEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public MLModelDeploymentEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public MLModelDeploymentEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public MLModelDeploymentEntityResponseV2 container(ContainerAspectResponseV2 container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   **/
  @Schema(description = "")
  
    @Valid
    public ContainerAspectResponseV2 getContainer() {
    return container;
  }

  public void setContainer(ContainerAspectResponseV2 container) {
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
    MLModelDeploymentEntityResponseV2 mlModelDeploymentEntityResponseV2 = (MLModelDeploymentEntityResponseV2) o;
    return Objects.equals(this.urn, mlModelDeploymentEntityResponseV2.urn) &&
        Objects.equals(this.mlModelDeploymentKey, mlModelDeploymentEntityResponseV2.mlModelDeploymentKey) &&
        Objects.equals(this.mlModelDeploymentProperties, mlModelDeploymentEntityResponseV2.mlModelDeploymentProperties) &&
        Objects.equals(this.ownership, mlModelDeploymentEntityResponseV2.ownership) &&
        Objects.equals(this.status, mlModelDeploymentEntityResponseV2.status) &&
        Objects.equals(this.deprecation, mlModelDeploymentEntityResponseV2.deprecation) &&
        Objects.equals(this.globalTags, mlModelDeploymentEntityResponseV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlModelDeploymentEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.testResults, mlModelDeploymentEntityResponseV2.testResults) &&
        Objects.equals(this.container, mlModelDeploymentEntityResponseV2.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlModelDeploymentKey, mlModelDeploymentProperties, ownership, status, deprecation, globalTags, dataPlatformInstance, testResults, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelDeploymentEntityResponseV2 {\n");
    
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