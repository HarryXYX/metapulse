package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectRequestV2;
import io.datahubproject.openapi.generated.ContainerAspectRequestV2;
import io.datahubproject.openapi.generated.CostAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.IntendedUseAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelCaveatsAndRecommendationsAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelEthicalConsiderationsAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelEvaluationDataAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelFactorPromptsAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelKeyAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelMetricsAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelQuantitativeAnalysesAspectRequestV2;
import io.datahubproject.openapi.generated.MLModelTrainingDataAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.SourceCodeAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
import io.datahubproject.openapi.generated.TestResultsAspectRequestV2;
import io.datahubproject.openapi.generated.VersionPropertiesAspectRequestV2;
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
public class MLModelEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("mlModelKey") @Builder.Default
  private MLModelKeyAspectRequestV2 mlModelKey = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("mlModelProperties") @Builder.Default
  private MLModelPropertiesAspectRequestV2 mlModelProperties = null;

  @JsonProperty("intendedUse") @Builder.Default
  private IntendedUseAspectRequestV2 intendedUse = null;

  @JsonProperty("mlModelFactorPrompts") @Builder.Default
  private MLModelFactorPromptsAspectRequestV2 mlModelFactorPrompts = null;

  @JsonProperty("mlModelMetrics") @Builder.Default
  private MLModelMetricsAspectRequestV2 mlModelMetrics = null;

  @JsonProperty("mlModelEvaluationData") @Builder.Default
  private MLModelEvaluationDataAspectRequestV2 mlModelEvaluationData = null;

  @JsonProperty("mlModelTrainingData") @Builder.Default
  private MLModelTrainingDataAspectRequestV2 mlModelTrainingData = null;

  @JsonProperty("mlModelQuantitativeAnalyses") @Builder.Default
  private MLModelQuantitativeAnalysesAspectRequestV2 mlModelQuantitativeAnalyses = null;

  @JsonProperty("mlModelEthicalConsiderations") @Builder.Default
  private MLModelEthicalConsiderationsAspectRequestV2 mlModelEthicalConsiderations = null;

  @JsonProperty("mlModelCaveatsAndRecommendations") @Builder.Default
  private MLModelCaveatsAndRecommendationsAspectRequestV2 mlModelCaveatsAndRecommendations = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("sourceCode") @Builder.Default
  private SourceCodeAspectRequestV2 sourceCode = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("cost") @Builder.Default
  private CostAspectRequestV2 cost = null;

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

  @JsonProperty("versionProperties") @Builder.Default
  private VersionPropertiesAspectRequestV2 versionProperties = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectRequestV2 container = null;

  public MLModelEntityRequestV2 urn(String urn) {
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

  public MLModelEntityRequestV2 mlModelKey(MLModelKeyAspectRequestV2 mlModelKey) {
    this.mlModelKey = mlModelKey;
    return this;
  }

  /**
   * Get mlModelKey
   * @return mlModelKey
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelKeyAspectRequestV2 getMlModelKey() {
    return mlModelKey;
  }

  public void setMlModelKey(MLModelKeyAspectRequestV2 mlModelKey) {
    this.mlModelKey = mlModelKey;
  }

  public MLModelEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
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

  public MLModelEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
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

  public MLModelEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
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

  public MLModelEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public MLModelEntityRequestV2 mlModelProperties(MLModelPropertiesAspectRequestV2 mlModelProperties) {
    this.mlModelProperties = mlModelProperties;
    return this;
  }

  /**
   * Get mlModelProperties
   * @return mlModelProperties
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelPropertiesAspectRequestV2 getMlModelProperties() {
    return mlModelProperties;
  }

  public void setMlModelProperties(MLModelPropertiesAspectRequestV2 mlModelProperties) {
    this.mlModelProperties = mlModelProperties;
  }

  public MLModelEntityRequestV2 intendedUse(IntendedUseAspectRequestV2 intendedUse) {
    this.intendedUse = intendedUse;
    return this;
  }

  /**
   * Get intendedUse
   * @return intendedUse
   **/
  @Schema(description = "")
  
    @Valid
    public IntendedUseAspectRequestV2 getIntendedUse() {
    return intendedUse;
  }

  public void setIntendedUse(IntendedUseAspectRequestV2 intendedUse) {
    this.intendedUse = intendedUse;
  }

  public MLModelEntityRequestV2 mlModelFactorPrompts(MLModelFactorPromptsAspectRequestV2 mlModelFactorPrompts) {
    this.mlModelFactorPrompts = mlModelFactorPrompts;
    return this;
  }

  /**
   * Get mlModelFactorPrompts
   * @return mlModelFactorPrompts
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelFactorPromptsAspectRequestV2 getMlModelFactorPrompts() {
    return mlModelFactorPrompts;
  }

  public void setMlModelFactorPrompts(MLModelFactorPromptsAspectRequestV2 mlModelFactorPrompts) {
    this.mlModelFactorPrompts = mlModelFactorPrompts;
  }

  public MLModelEntityRequestV2 mlModelMetrics(MLModelMetricsAspectRequestV2 mlModelMetrics) {
    this.mlModelMetrics = mlModelMetrics;
    return this;
  }

  /**
   * Get mlModelMetrics
   * @return mlModelMetrics
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelMetricsAspectRequestV2 getMlModelMetrics() {
    return mlModelMetrics;
  }

  public void setMlModelMetrics(MLModelMetricsAspectRequestV2 mlModelMetrics) {
    this.mlModelMetrics = mlModelMetrics;
  }

  public MLModelEntityRequestV2 mlModelEvaluationData(MLModelEvaluationDataAspectRequestV2 mlModelEvaluationData) {
    this.mlModelEvaluationData = mlModelEvaluationData;
    return this;
  }

  /**
   * Get mlModelEvaluationData
   * @return mlModelEvaluationData
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelEvaluationDataAspectRequestV2 getMlModelEvaluationData() {
    return mlModelEvaluationData;
  }

  public void setMlModelEvaluationData(MLModelEvaluationDataAspectRequestV2 mlModelEvaluationData) {
    this.mlModelEvaluationData = mlModelEvaluationData;
  }

  public MLModelEntityRequestV2 mlModelTrainingData(MLModelTrainingDataAspectRequestV2 mlModelTrainingData) {
    this.mlModelTrainingData = mlModelTrainingData;
    return this;
  }

  /**
   * Get mlModelTrainingData
   * @return mlModelTrainingData
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelTrainingDataAspectRequestV2 getMlModelTrainingData() {
    return mlModelTrainingData;
  }

  public void setMlModelTrainingData(MLModelTrainingDataAspectRequestV2 mlModelTrainingData) {
    this.mlModelTrainingData = mlModelTrainingData;
  }

  public MLModelEntityRequestV2 mlModelQuantitativeAnalyses(MLModelQuantitativeAnalysesAspectRequestV2 mlModelQuantitativeAnalyses) {
    this.mlModelQuantitativeAnalyses = mlModelQuantitativeAnalyses;
    return this;
  }

  /**
   * Get mlModelQuantitativeAnalyses
   * @return mlModelQuantitativeAnalyses
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelQuantitativeAnalysesAspectRequestV2 getMlModelQuantitativeAnalyses() {
    return mlModelQuantitativeAnalyses;
  }

  public void setMlModelQuantitativeAnalyses(MLModelQuantitativeAnalysesAspectRequestV2 mlModelQuantitativeAnalyses) {
    this.mlModelQuantitativeAnalyses = mlModelQuantitativeAnalyses;
  }

  public MLModelEntityRequestV2 mlModelEthicalConsiderations(MLModelEthicalConsiderationsAspectRequestV2 mlModelEthicalConsiderations) {
    this.mlModelEthicalConsiderations = mlModelEthicalConsiderations;
    return this;
  }

  /**
   * Get mlModelEthicalConsiderations
   * @return mlModelEthicalConsiderations
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelEthicalConsiderationsAspectRequestV2 getMlModelEthicalConsiderations() {
    return mlModelEthicalConsiderations;
  }

  public void setMlModelEthicalConsiderations(MLModelEthicalConsiderationsAspectRequestV2 mlModelEthicalConsiderations) {
    this.mlModelEthicalConsiderations = mlModelEthicalConsiderations;
  }

  public MLModelEntityRequestV2 mlModelCaveatsAndRecommendations(MLModelCaveatsAndRecommendationsAspectRequestV2 mlModelCaveatsAndRecommendations) {
    this.mlModelCaveatsAndRecommendations = mlModelCaveatsAndRecommendations;
    return this;
  }

  /**
   * Get mlModelCaveatsAndRecommendations
   * @return mlModelCaveatsAndRecommendations
   **/
  @Schema(description = "")
  
    @Valid
    public MLModelCaveatsAndRecommendationsAspectRequestV2 getMlModelCaveatsAndRecommendations() {
    return mlModelCaveatsAndRecommendations;
  }

  public void setMlModelCaveatsAndRecommendations(MLModelCaveatsAndRecommendationsAspectRequestV2 mlModelCaveatsAndRecommendations) {
    this.mlModelCaveatsAndRecommendations = mlModelCaveatsAndRecommendations;
  }

  public MLModelEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public MLModelEntityRequestV2 sourceCode(SourceCodeAspectRequestV2 sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  /**
   * Get sourceCode
   * @return sourceCode
   **/
  @Schema(description = "")
  
    @Valid
    public SourceCodeAspectRequestV2 getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(SourceCodeAspectRequestV2 sourceCode) {
    this.sourceCode = sourceCode;
  }

  public MLModelEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public MLModelEntityRequestV2 cost(CostAspectRequestV2 cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   **/
  @Schema(description = "")
  
    @Valid
    public CostAspectRequestV2 getCost() {
    return cost;
  }

  public void setCost(CostAspectRequestV2 cost) {
    this.cost = cost;
  }

  public MLModelEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public MLModelEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
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

  public MLModelEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public MLModelEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public MLModelEntityRequestV2 browsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
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

  public MLModelEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public MLModelEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public MLModelEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public MLModelEntityRequestV2 versionProperties(VersionPropertiesAspectRequestV2 versionProperties) {
    this.versionProperties = versionProperties;
    return this;
  }

  /**
   * Get versionProperties
   * @return versionProperties
   **/
  @Schema(description = "")
  
    @Valid
    public VersionPropertiesAspectRequestV2 getVersionProperties() {
    return versionProperties;
  }

  public void setVersionProperties(VersionPropertiesAspectRequestV2 versionProperties) {
    this.versionProperties = versionProperties;
  }

  public MLModelEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public MLModelEntityRequestV2 container(ContainerAspectRequestV2 container) {
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
    MLModelEntityRequestV2 mlModelEntityRequestV2 = (MLModelEntityRequestV2) o;
    return Objects.equals(this.urn, mlModelEntityRequestV2.urn) &&
        Objects.equals(this.mlModelKey, mlModelEntityRequestV2.mlModelKey) &&
        Objects.equals(this.glossaryTerms, mlModelEntityRequestV2.glossaryTerms) &&
        Objects.equals(this.domains, mlModelEntityRequestV2.domains) &&
        Objects.equals(this.applications, mlModelEntityRequestV2.applications) &&
        Objects.equals(this.ownership, mlModelEntityRequestV2.ownership) &&
        Objects.equals(this.mlModelProperties, mlModelEntityRequestV2.mlModelProperties) &&
        Objects.equals(this.intendedUse, mlModelEntityRequestV2.intendedUse) &&
        Objects.equals(this.mlModelFactorPrompts, mlModelEntityRequestV2.mlModelFactorPrompts) &&
        Objects.equals(this.mlModelMetrics, mlModelEntityRequestV2.mlModelMetrics) &&
        Objects.equals(this.mlModelEvaluationData, mlModelEntityRequestV2.mlModelEvaluationData) &&
        Objects.equals(this.mlModelTrainingData, mlModelEntityRequestV2.mlModelTrainingData) &&
        Objects.equals(this.mlModelQuantitativeAnalyses, mlModelEntityRequestV2.mlModelQuantitativeAnalyses) &&
        Objects.equals(this.mlModelEthicalConsiderations, mlModelEntityRequestV2.mlModelEthicalConsiderations) &&
        Objects.equals(this.mlModelCaveatsAndRecommendations, mlModelEntityRequestV2.mlModelCaveatsAndRecommendations) &&
        Objects.equals(this.institutionalMemory, mlModelEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.sourceCode, mlModelEntityRequestV2.sourceCode) &&
        Objects.equals(this.status, mlModelEntityRequestV2.status) &&
        Objects.equals(this.cost, mlModelEntityRequestV2.cost) &&
        Objects.equals(this.deprecation, mlModelEntityRequestV2.deprecation) &&
        Objects.equals(this.browsePaths, mlModelEntityRequestV2.browsePaths) &&
        Objects.equals(this.globalTags, mlModelEntityRequestV2.globalTags) &&
        Objects.equals(this.dataPlatformInstance, mlModelEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.browsePathsV2, mlModelEntityRequestV2.browsePathsV2) &&
        Objects.equals(this.structuredProperties, mlModelEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, mlModelEntityRequestV2.forms) &&
        Objects.equals(this.testResults, mlModelEntityRequestV2.testResults) &&
        Objects.equals(this.versionProperties, mlModelEntityRequestV2.versionProperties) &&
        Objects.equals(this.subTypes, mlModelEntityRequestV2.subTypes) &&
        Objects.equals(this.container, mlModelEntityRequestV2.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, mlModelKey, glossaryTerms, domains, applications, ownership, mlModelProperties, intendedUse, mlModelFactorPrompts, mlModelMetrics, mlModelEvaluationData, mlModelTrainingData, mlModelQuantitativeAnalyses, mlModelEthicalConsiderations, mlModelCaveatsAndRecommendations, institutionalMemory, sourceCode, status, cost, deprecation, browsePaths, globalTags, dataPlatformInstance, browsePathsV2, structuredProperties, forms, testResults, versionProperties, subTypes, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelEntityRequestV2 {\n");
    
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