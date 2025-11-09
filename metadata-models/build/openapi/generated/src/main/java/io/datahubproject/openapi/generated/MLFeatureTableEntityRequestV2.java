package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.MLFeatureTableKeyAspectRequestV2;
import io.datahubproject.openapi.generated.MLFeatureTablePropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
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
 * MLFeatureTable object.
 */
@Schema(description = "MLFeatureTable object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLFeatureTableEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlFeatureTableKey") @Builder.Default
  private MLFeatureTableKeyAspectRequestV2 mlFeatureTableKey = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("mlFeatureTableProperties") @Builder.Default
  private MLFeatureTablePropertiesAspectRequestV2 mlFeatureTableProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectRequestV2 browsePaths = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectRequestV2 browsePathsV2 = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  public MLFeatureTableEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for mlFeatureTable
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for mlFeatureTable")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public MLFeatureTableEntityRequestV2 mlFeatureTableKey(MLFeatureTableKeyAspectRequestV2 mlFeatureTableKey) {
    this.mlFeatureTableKey = mlFeatureTableKey;
    return this;
  }

  /**
   * Get mlFeatureTableKey
   * @return mlFeatureTableKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLFeatureTableKeyAspectRequestV2 getMlFeatureTableKey() {
    return mlFeatureTableKey;
  }

  public void setMlFeatureTableKey(MLFeatureTableKeyAspectRequestV2 mlFeatureTableKey) {
    this.mlFeatureTableKey = mlFeatureTableKey;
  }

  public MLFeatureTableEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
    return this;
  }

  /**
   * Get glossaryTerms
   * @return glossaryTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermsAspectRequestV2 getGlossaryTerms() {
    return glossaryTerms;
  }

  public void setGlossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }

  public MLFeatureTableEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Get domains
   * @return domains
   **/
  @Schema(description = "")
  
    @Valid
    public DomainsAspectRequestV2 getDomains() {
    return domains;
  }

  public void setDomains(DomainsAspectRequestV2 domains) {
    this.domains = domains;
  }

  public MLFeatureTableEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * @return applications
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationsAspectRequestV2 getApplications() {
    return applications;
  }

  public void setApplications(ApplicationsAspectRequestV2 applications) {
    this.applications = applications;
  }

  public MLFeatureTableEntityRequestV2 mlFeatureTableProperties(MLFeatureTablePropertiesAspectRequestV2 mlFeatureTableProperties) {
    this.mlFeatureTableProperties = mlFeatureTableProperties;
    return this;
  }

  /**
   * Get mlFeatureTableProperties
   * @return mlFeatureTableProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLFeatureTablePropertiesAspectRequestV2 getMlFeatureTableProperties() {
    return mlFeatureTableProperties;
  }

  public void setMlFeatureTableProperties(MLFeatureTablePropertiesAspectRequestV2 mlFeatureTableProperties) {
    this.mlFeatureTableProperties = mlFeatureTableProperties;
  }

  public MLFeatureTableEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public MLFeatureTableEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
    return this;
  }

  /**
   * Get institutionalMemory
   * @return institutionalMemory
   **/
  @Schema(description = "")
  
    @Valid
    public InstitutionalMemoryAspectRequestV2 getInstitutionalMemory() {
    return institutionalMemory;
  }

  public void setInstitutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
    this.institutionalMemory = institutionalMemory;
  }

  public MLFeatureTableEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public MLFeatureTableEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public MLFeatureTableEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
    this.browsePaths = browsePaths;
    return this;
  }

  /**
   * Get browsePaths
   * @return browsePaths
   **/
  @Schema(description = "")
  
    @Valid
    public BrowsePathsAspectRequestV2 getBrowsePaths() {
    return browsePaths;
  }

  public void setBrowsePaths(BrowsePathsAspectRequestV2 browsePaths) {
    this.browsePaths = browsePaths;
  }

  public MLFeatureTableEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public MLFeatureTableEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public MLFeatureTableEntityRequestV2 browsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
    this.browsePathsV2 = browsePathsV2;
    return this;
  }

  /**
   * Get browsePathsV2
   * @return browsePathsV2
   **/
  @Schema(description = "")
  
    @Valid
    public BrowsePathsV2AspectRequestV2 getBrowsePathsV2() {
    return browsePathsV2;
  }

  public void setBrowsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
    this.browsePathsV2 = browsePathsV2;
  }

  public MLFeatureTableEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
    return this;
  }

  /**
   * Get structuredProperties
   * @return structuredProperties
   **/
  @Schema(description = "")
  
    @Valid
    public StructuredPropertiesAspectRequestV2 getStructuredProperties() {
    return structuredProperties;
  }

  public void setStructuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
    this.structuredProperties = structuredProperties;
  }

  public MLFeatureTableEntityRequestV2 forms(FormsAspectRequestV2 forms) {
    this.forms = forms;
    return this;
  }

  /**
   * Get forms
   * @return forms
   **/
  @Schema(description = "")
  
    @Valid
    public FormsAspectRequestV2 getForms() {
    return forms;
  }

  public void setForms(FormsAspectRequestV2 forms) {
    this.forms = forms;
  }

  public MLFeatureTableEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public MLFeatureTableEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectRequestV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectRequestV2 subTypes) {
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
    MLFeatureTableEntityRequestV2 mlFeatureTableEntityRequestV2 = (MLFeatureTableEntityRequestV2) o;
    return Objects.equals(this.urn, mlFeatureTableEntityRequestV2.urn) &&
        Objects.equals(this.mlFeatureTableKey, mlFeatureTableEntityRequestV2.mlFeatureTableKey) &&
        Objects.equals(this.glossaryTerms, mlFeatureTableEntityRequestV2.glossaryTerms) &&
        Objects.equals(this.domains, mlFeatureTableEntityRequestV2.domains) &&
        Objects.equals(this.applications, mlFeatureTableEntityRequestV2.applications) &&
        Objects.equals(this.mlFeatureTableProperties, mlFeatureTableEntityRequestV2.mlFeatureTableProperties) &&
        Objects.equals(this.ownership, mlFeatureTableEntityRequestV2.ownership) &&
        Objects.equals(this.institutionalMemory, mlFeatureTableEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.status, mlFeatureTableEntityRequestV2.status) &&
        Objects.equals(this.deprecation, mlFeatureTableEntityRequestV2.deprecation) &&
        Objects.equals(this.browsePaths, mlFeatureTableEntityRequestV2.browsePaths) &&
        Objects.equals(this.globalTags, mlFeatureTableEntityRequestV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlFeatureTableEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.browsePathsV2, mlFeatureTableEntityRequestV2.browsePathsV2) &&
        Objects.equals(this.structuredProperties, mlFeatureTableEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, mlFeatureTableEntityRequestV2.forms) &&
        Objects.equals(this.testResults, mlFeatureTableEntityRequestV2.testResults) &&
        Objects.equals(this.subTypes, mlFeatureTableEntityRequestV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlFeatureTableKey, glossaryTerms, domains, applications, mlFeatureTableProperties, ownership, institutionalMemory, status, deprecation, browsePaths, globalTags, dataPlatformInstance, browsePathsV2, structuredProperties, forms, testResults, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLFeatureTableEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    mlFeatureTableKey: ").append(toIndentedString(mlFeatureTableKey)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    mlFeatureTableProperties: ").append(toIndentedString(mlFeatureTableProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    browsePathsV2: ").append(toIndentedString(browsePathsV2)).append("\n");
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