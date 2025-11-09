package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.MLPrimaryKeyKeyAspectResponseV2;
import io.datahubproject.openapi.generated.MLPrimaryKeyPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
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
 * MLPrimaryKey object.
 */
@Schema(description = "MLPrimaryKey object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLPrimaryKeyEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlPrimaryKeyKey") @Builder.Default
  private MLPrimaryKeyKeyAspectResponseV2 mlPrimaryKeyKey = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("mlPrimaryKeyProperties") @Builder.Default
  private MLPrimaryKeyPropertiesAspectResponseV2 mlPrimaryKeyProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  public MLPrimaryKeyEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for mlPrimaryKey
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for mlPrimaryKey")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public MLPrimaryKeyEntityResponseV2 mlPrimaryKeyKey(MLPrimaryKeyKeyAspectResponseV2 mlPrimaryKeyKey) {
    this.mlPrimaryKeyKey = mlPrimaryKeyKey;
    return this;
  }

  /**
   * Get mlPrimaryKeyKey
   * @return mlPrimaryKeyKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLPrimaryKeyKeyAspectResponseV2 getMlPrimaryKeyKey() {
    return mlPrimaryKeyKey;
  }

  public void setMlPrimaryKeyKey(MLPrimaryKeyKeyAspectResponseV2 mlPrimaryKeyKey) {
    this.mlPrimaryKeyKey = mlPrimaryKeyKey;
  }

  public MLPrimaryKeyEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
    return this;
  }

  /**
   * Get glossaryTerms
   * @return glossaryTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermsAspectResponseV2 getGlossaryTerms() {
    return glossaryTerms;
  }

  public void setGlossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }

  public MLPrimaryKeyEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Get domains
   * @return domains
   **/
  @Schema(description = "")
  
    @Valid
    public DomainsAspectResponseV2 getDomains() {
    return domains;
  }

  public void setDomains(DomainsAspectResponseV2 domains) {
    this.domains = domains;
  }

  public MLPrimaryKeyEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * @return applications
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationsAspectResponseV2 getApplications() {
    return applications;
  }

  public void setApplications(ApplicationsAspectResponseV2 applications) {
    this.applications = applications;
  }

  public MLPrimaryKeyEntityResponseV2 mlPrimaryKeyProperties(MLPrimaryKeyPropertiesAspectResponseV2 mlPrimaryKeyProperties) {
    this.mlPrimaryKeyProperties = mlPrimaryKeyProperties;
    return this;
  }

  /**
   * Get mlPrimaryKeyProperties
   * @return mlPrimaryKeyProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLPrimaryKeyPropertiesAspectResponseV2 getMlPrimaryKeyProperties() {
    return mlPrimaryKeyProperties;
  }

  public void setMlPrimaryKeyProperties(MLPrimaryKeyPropertiesAspectResponseV2 mlPrimaryKeyProperties) {
    this.mlPrimaryKeyProperties = mlPrimaryKeyProperties;
  }

  public MLPrimaryKeyEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public MLPrimaryKeyEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
    return this;
  }

  /**
   * Get institutionalMemory
   * @return institutionalMemory
   **/
  @Schema(description = "")
  
    @Valid
    public InstitutionalMemoryAspectResponseV2 getInstitutionalMemory() {
    return institutionalMemory;
  }

  public void setInstitutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
  }

  public MLPrimaryKeyEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public MLPrimaryKeyEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public MLPrimaryKeyEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public MLPrimaryKeyEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public MLPrimaryKeyEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
    return this;
  }

  /**
   * Get structuredProperties
   * @return structuredProperties
   **/
  @Schema(description = "")
  
    @Valid
    public StructuredPropertiesAspectResponseV2 getStructuredProperties() {
    return structuredProperties;
  }

  public void setStructuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
  }

  public MLPrimaryKeyEntityResponseV2 forms(FormsAspectResponseV2 forms) {
    this.forms = forms;
    return this;
  }

  /**
   * Get forms
   * @return forms
   **/
  @Schema(description = "")
  
    @Valid
    public FormsAspectResponseV2 getForms() {
    return forms;
  }

  public void setForms(FormsAspectResponseV2 forms) {
    this.forms = forms;
  }

  public MLPrimaryKeyEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public MLPrimaryKeyEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectResponseV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectResponseV2 subTypes) {
    this.subTypes = subTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLPrimaryKeyEntityResponseV2 mlPrimaryKeyEntityResponseV2 = (MLPrimaryKeyEntityResponseV2) o;
    return Objects.equals(this.urn, mlPrimaryKeyEntityResponseV2.urn) &&
        Objects.equals(this.mlPrimaryKeyKey, mlPrimaryKeyEntityResponseV2.mlPrimaryKeyKey) &&
        Objects.equals(this.glossaryTerms, mlPrimaryKeyEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.domains, mlPrimaryKeyEntityResponseV2.domains) &&
        Objects.equals(this.applications, mlPrimaryKeyEntityResponseV2.applications) &&
        Objects.equals(this.mlPrimaryKeyProperties, mlPrimaryKeyEntityResponseV2.mlPrimaryKeyProperties) &&
        Objects.equals(this.ownership, mlPrimaryKeyEntityResponseV2.ownership) &&
        Objects.equals(this.institutionalMemory, mlPrimaryKeyEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.status, mlPrimaryKeyEntityResponseV2.status) &&
        Objects.equals(this.deprecation, mlPrimaryKeyEntityResponseV2.deprecation) &&
        Objects.equals(this.globalTags, mlPrimaryKeyEntityResponseV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlPrimaryKeyEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.structuredProperties, mlPrimaryKeyEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, mlPrimaryKeyEntityResponseV2.forms) &&
        Objects.equals(this.testResults, mlPrimaryKeyEntityResponseV2.testResults) &&
        Objects.equals(this.subTypes, mlPrimaryKeyEntityResponseV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlPrimaryKeyKey, glossaryTerms, domains, applications, mlPrimaryKeyProperties, ownership, institutionalMemory, status, deprecation, globalTags, dataPlatformInstance, structuredProperties, forms, testResults, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLPrimaryKeyEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    mlPrimaryKeyKey: ").append(toIndentedString(mlPrimaryKeyKey)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    mlPrimaryKeyProperties: ").append(toIndentedString(mlPrimaryKeyProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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