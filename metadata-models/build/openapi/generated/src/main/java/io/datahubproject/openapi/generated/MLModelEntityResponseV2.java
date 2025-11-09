package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectResponseV2;
import io.datahubproject.openapi.generated.ContainerAspectResponseV2;
import io.datahubproject.openapi.generated.CostAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.IntendedUseAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelCaveatsAndRecommendationsAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelEthicalConsiderationsAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelEvaluationDataAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelFactorPromptsAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelKeyAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelMetricsAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelQuantitativeAnalysesAspectResponseV2;
import io.datahubproject.openapi.generated.MLModelTrainingDataAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.SourceCodeAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
import io.datahubproject.openapi.generated.TestResultsAspectResponseV2;
import io.datahubproject.openapi.generated.VersionPropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * MLModel object.
 */
@Schema(description = "MLModel object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlModelKey") @Builder.Default
  private MLModelKeyAspectResponseV2 mlModelKey = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("mlModelProperties") @Builder.Default
  private MLModelPropertiesAspectResponseV2 mlModelProperties = null;

  @JsonProperty("intendedUse") @Builder.Default
  private IntendedUseAspectResponseV2 intendedUse = null;

  @JsonProperty("mlModelFactorPrompts") @Builder.Default
  private MLModelFactorPromptsAspectResponseV2 mlModelFactorPrompts = null;

  @JsonProperty("mlModelMetrics") @Builder.Default
  private MLModelMetricsAspectResponseV2 mlModelMetrics = null;

  @JsonProperty("mlModelEvaluationData") @Builder.Default
  private MLModelEvaluationDataAspectResponseV2 mlModelEvaluationData = null;

  @JsonProperty("mlModelTrainingData") @Builder.Default
  private MLModelTrainingDataAspectResponseV2 mlModelTrainingData = null;

  @JsonProperty("mlModelQuantitativeAnalyses") @Builder.Default
  private MLModelQuantitativeAnalysesAspectResponseV2 mlModelQuantitativeAnalyses = null;

  @JsonProperty("mlModelEthicalConsiderations") @Builder.Default
  private MLModelEthicalConsiderationsAspectResponseV2 mlModelEthicalConsiderations = null;

  @JsonProperty("mlModelCaveatsAndRecommendations") @Builder.Default
  private MLModelCaveatsAndRecommendationsAspectResponseV2 mlModelCaveatsAndRecommendations = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("sourceCode") @Builder.Default
  private SourceCodeAspectResponseV2 sourceCode = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("cost") @Builder.Default
  private CostAspectResponseV2 cost = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectResponseV2 browsePaths = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectResponseV2 browsePathsV2 = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("versionProperties") @Builder.Default
  private VersionPropertiesAspectResponseV2 versionProperties = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectResponseV2 container = null;

  public MLModelEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for mlModel
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for mlModel")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public MLModelEntityResponseV2 mlModelKey(MLModelKeyAspectResponseV2 mlModelKey) {
    this.mlModelKey = mlModelKey;
    return this;
  }

  /**
   * Get mlModelKey
   * @return mlModelKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelKeyAspectResponseV2 getMlModelKey() {
    return mlModelKey;
  }

  public void setMlModelKey(MLModelKeyAspectResponseV2 mlModelKey) {
    this.mlModelKey = mlModelKey;
  }

  public MLModelEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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

  public MLModelEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public MLModelEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
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

  public MLModelEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public MLModelEntityResponseV2 mlModelProperties(MLModelPropertiesAspectResponseV2 mlModelProperties) {
    this.mlModelProperties = mlModelProperties;
    return this;
  }

  /**
   * Get mlModelProperties
   * @return mlModelProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelPropertiesAspectResponseV2 getMlModelProperties() {
    return mlModelProperties;
  }

  public void setMlModelProperties(MLModelPropertiesAspectResponseV2 mlModelProperties) {
    this.mlModelProperties = mlModelProperties;
  }

  public MLModelEntityResponseV2 intendedUse(IntendedUseAspectResponseV2 intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  /**
   * Get intendedUse
   * @return intendedUse
   **/
  @Schema(description = "")
  
    @Valid
    public IntendedUseAspectResponseV2 getIntendedUse() {
    return intendedUse;
  }

  public void setIntendedUse(IntendedUseAspectResponseV2 intendedUse) {
    this.intendedUse = intendedUse;
  }

  public MLModelEntityResponseV2 mlModelFactorPrompts(MLModelFactorPromptsAspectResponseV2 mlModelFactorPrompts) {
    this.mlModelFactorPrompts = mlModelFactorPrompts;
    return this;
  }

  /**
   * Get mlModelFactorPrompts
   * @return mlModelFactorPrompts
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelFactorPromptsAspectResponseV2 getMlModelFactorPrompts() {
    return mlModelFactorPrompts;
  }

  public void setMlModelFactorPrompts(MLModelFactorPromptsAspectResponseV2 mlModelFactorPrompts) {
    this.mlModelFactorPrompts = mlModelFactorPrompts;
  }

  public MLModelEntityResponseV2 mlModelMetrics(MLModelMetricsAspectResponseV2 mlModelMetrics) {
    this.mlModelMetrics = mlModelMetrics;
    return this;
  }

  /**
   * Get mlModelMetrics
   * @return mlModelMetrics
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelMetricsAspectResponseV2 getMlModelMetrics() {
    return mlModelMetrics;
  }

  public void setMlModelMetrics(MLModelMetricsAspectResponseV2 mlModelMetrics) {
    this.mlModelMetrics = mlModelMetrics;
  }

  public MLModelEntityResponseV2 mlModelEvaluationData(MLModelEvaluationDataAspectResponseV2 mlModelEvaluationData) {
    this.mlModelEvaluationData = mlModelEvaluationData;
    return this;
  }

  /**
   * Get mlModelEvaluationData
   * @return mlModelEvaluationData
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelEvaluationDataAspectResponseV2 getMlModelEvaluationData() {
    return mlModelEvaluationData;
  }

  public void setMlModelEvaluationData(MLModelEvaluationDataAspectResponseV2 mlModelEvaluationData) {
    this.mlModelEvaluationData = mlModelEvaluationData;
  }

  public MLModelEntityResponseV2 mlModelTrainingData(MLModelTrainingDataAspectResponseV2 mlModelTrainingData) {
    this.mlModelTrainingData = mlModelTrainingData;
    return this;
  }

  /**
   * Get mlModelTrainingData
   * @return mlModelTrainingData
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelTrainingDataAspectResponseV2 getMlModelTrainingData() {
    return mlModelTrainingData;
  }

  public void setMlModelTrainingData(MLModelTrainingDataAspectResponseV2 mlModelTrainingData) {
    this.mlModelTrainingData = mlModelTrainingData;
  }

  public MLModelEntityResponseV2 mlModelQuantitativeAnalyses(MLModelQuantitativeAnalysesAspectResponseV2 mlModelQuantitativeAnalyses) {
    this.mlModelQuantitativeAnalyses = mlModelQuantitativeAnalyses;
    return this;
  }

  /**
   * Get mlModelQuantitativeAnalyses
   * @return mlModelQuantitativeAnalyses
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelQuantitativeAnalysesAspectResponseV2 getMlModelQuantitativeAnalyses() {
    return mlModelQuantitativeAnalyses;
  }

  public void setMlModelQuantitativeAnalyses(MLModelQuantitativeAnalysesAspectResponseV2 mlModelQuantitativeAnalyses) {
    this.mlModelQuantitativeAnalyses = mlModelQuantitativeAnalyses;
  }

  public MLModelEntityResponseV2 mlModelEthicalConsiderations(MLModelEthicalConsiderationsAspectResponseV2 mlModelEthicalConsiderations) {
    this.mlModelEthicalConsiderations = mlModelEthicalConsiderations;
    return this;
  }

  /**
   * Get mlModelEthicalConsiderations
   * @return mlModelEthicalConsiderations
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelEthicalConsiderationsAspectResponseV2 getMlModelEthicalConsiderations() {
    return mlModelEthicalConsiderations;
  }

  public void setMlModelEthicalConsiderations(MLModelEthicalConsiderationsAspectResponseV2 mlModelEthicalConsiderations) {
    this.mlModelEthicalConsiderations = mlModelEthicalConsiderations;
  }

  public MLModelEntityResponseV2 mlModelCaveatsAndRecommendations(MLModelCaveatsAndRecommendationsAspectResponseV2 mlModelCaveatsAndRecommendations) {
    this.mlModelCaveatsAndRecommendations = mlModelCaveatsAndRecommendations;
    return this;
  }

  /**
   * Get mlModelCaveatsAndRecommendations
   * @return mlModelCaveatsAndRecommendations
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelCaveatsAndRecommendationsAspectResponseV2 getMlModelCaveatsAndRecommendations() {
    return mlModelCaveatsAndRecommendations;
  }

  public void setMlModelCaveatsAndRecommendations(MLModelCaveatsAndRecommendationsAspectResponseV2 mlModelCaveatsAndRecommendations) {
    this.mlModelCaveatsAndRecommendations = mlModelCaveatsAndRecommendations;
  }

  public MLModelEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public MLModelEntityResponseV2 sourceCode(SourceCodeAspectResponseV2 sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  /**
   * Get sourceCode
   * @return sourceCode
   **/
  @Schema(description = "")
  
    @Valid
    public SourceCodeAspectResponseV2 getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(SourceCodeAspectResponseV2 sourceCode) {
    this.sourceCode = sourceCode;
  }

  public MLModelEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public MLModelEntityResponseV2 cost(CostAspectResponseV2 cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   **/
  @Schema(description = "")
  
    @Valid
    public CostAspectResponseV2 getCost() {
    return cost;
  }

  public void setCost(CostAspectResponseV2 cost) {
    this.cost = cost;
  }

  public MLModelEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public MLModelEntityResponseV2 browsePaths(BrowsePathsAspectResponseV2 browsePaths) {
    this.browsePaths = browsePaths;
    return this;
  }

  /**
   * Get browsePaths
   * @return browsePaths
   **/
  @Schema(description = "")
  
    @Valid
    public BrowsePathsAspectResponseV2 getBrowsePaths() {
    return browsePaths;
  }

  public void setBrowsePaths(BrowsePathsAspectResponseV2 browsePaths) {
    this.browsePaths = browsePaths;
  }

  public MLModelEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public MLModelEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public MLModelEntityResponseV2 browsePathsV2(BrowsePathsV2AspectResponseV2 browsePathsV2) {
    this.browsePathsV2 = browsePathsV2;
    return this;
  }

  /**
   * Get browsePathsV2
   * @return browsePathsV2
   **/
  @Schema(description = "")
  
    @Valid
    public BrowsePathsV2AspectResponseV2 getBrowsePathsV2() {
    return browsePathsV2;
  }

  public void setBrowsePathsV2(BrowsePathsV2AspectResponseV2 browsePathsV2) {
    this.browsePathsV2 = browsePathsV2;
  }

  public MLModelEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public MLModelEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public MLModelEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public MLModelEntityResponseV2 versionProperties(VersionPropertiesAspectResponseV2 versionProperties) {
    this.versionProperties = versionProperties;
    return this;
  }

  /**
   * Get versionProperties
   * @return versionProperties
   **/
  @Schema(description = "")
  
    @Valid
    public VersionPropertiesAspectResponseV2 getVersionProperties() {
    return versionProperties;
  }

  public void setVersionProperties(VersionPropertiesAspectResponseV2 versionProperties) {
    this.versionProperties = versionProperties;
  }

  public MLModelEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public MLModelEntityResponseV2 container(ContainerAspectResponseV2 container) {
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
    MLModelEntityResponseV2 mlModelEntityResponseV2 = (MLModelEntityResponseV2) o;
    return Objects.equals(this.urn, mlModelEntityResponseV2.urn) &&
        Objects.equals(this.mlModelKey, mlModelEntityResponseV2.mlModelKey) &&
        Objects.equals(this.glossaryTerms, mlModelEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.domains, mlModelEntityResponseV2.domains) &&
        Objects.equals(this.applications, mlModelEntityResponseV2.applications) &&
        Objects.equals(this.ownership, mlModelEntityResponseV2.ownership) &&
        Objects.equals(this.mlModelProperties, mlModelEntityResponseV2.mlModelProperties) &&
        Objects.equals(this.intendedUse, mlModelEntityResponseV2.intendedUse) &&
        Objects.equals(this.mlModelFactorPrompts, mlModelEntityResponseV2.mlModelFactorPrompts) &&
        Objects.equals(this.mlModelMetrics, mlModelEntityResponseV2.mlModelMetrics) &&
        Objects.equals(this.mlModelEvaluationData, mlModelEntityResponseV2.mlModelEvaluationData) &&
        Objects.equals(this.mlModelTrainingData, mlModelEntityResponseV2.mlModelTrainingData) &&
        Objects.equals(this.mlModelQuantitativeAnalyses, mlModelEntityResponseV2.mlModelQuantitativeAnalyses) &&
        Objects.equals(this.mlModelEthicalConsiderations, mlModelEntityResponseV2.mlModelEthicalConsiderations) &&
        Objects.equals(this.mlModelCaveatsAndRecommendations, mlModelEntityResponseV2.mlModelCaveatsAndRecommendations) &&
        Objects.equals(this.institutionalMemory, mlModelEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.sourceCode, mlModelEntityResponseV2.sourceCode) &&
        Objects.equals(this.status, mlModelEntityResponseV2.status) &&
        Objects.equals(this.cost, mlModelEntityResponseV2.cost) &&
        Objects.equals(this.deprecation, mlModelEntityResponseV2.deprecation) &&
        Objects.equals(this.browsePaths, mlModelEntityResponseV2.browsePaths) &&
        Objects.equals(this.globalTags, mlModelEntityResponseV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlModelEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.browsePathsV2, mlModelEntityResponseV2.browsePathsV2) &&
        Objects.equals(this.structuredProperties, mlModelEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, mlModelEntityResponseV2.forms) &&
        Objects.equals(this.testResults, mlModelEntityResponseV2.testResults) &&
        Objects.equals(this.versionProperties, mlModelEntityResponseV2.versionProperties) &&
        Objects.equals(this.subTypes, mlModelEntityResponseV2.subTypes) &&
        Objects.equals(this.container, mlModelEntityResponseV2.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlModelKey, glossaryTerms, domains, applications, ownership, mlModelProperties, intendedUse, mlModelFactorPrompts, mlModelMetrics, mlModelEvaluationData, mlModelTrainingData, mlModelQuantitativeAnalyses, mlModelEthicalConsiderations, mlModelCaveatsAndRecommendations, institutionalMemory, sourceCode, status, cost, deprecation, browsePaths, globalTags, dataPlatformInstance, browsePathsV2, structuredProperties, forms, testResults, versionProperties, subTypes, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    mlModelKey: ").append(toIndentedString(mlModelKey)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    mlModelProperties: ").append(toIndentedString(mlModelProperties)).append("\n");
    sb.append("    intendedUse: ").append(toIndentedString(intendedUse)).append("\n");
    sb.append("    mlModelFactorPrompts: ").append(toIndentedString(mlModelFactorPrompts)).append("\n");
    sb.append("    mlModelMetrics: ").append(toIndentedString(mlModelMetrics)).append("\n");
    sb.append("    mlModelEvaluationData: ").append(toIndentedString(mlModelEvaluationData)).append("\n");
    sb.append("    mlModelTrainingData: ").append(toIndentedString(mlModelTrainingData)).append("\n");
    sb.append("    mlModelQuantitativeAnalyses: ").append(toIndentedString(mlModelQuantitativeAnalyses)).append("\n");
    sb.append("    mlModelEthicalConsiderations: ").append(toIndentedString(mlModelEthicalConsiderations)).append("\n");
    sb.append("    mlModelCaveatsAndRecommendations: ").append(toIndentedString(mlModelCaveatsAndRecommendations)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    browsePathsV2: ").append(toIndentedString(browsePathsV2)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    versionProperties: ").append(toIndentedString(versionProperties)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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