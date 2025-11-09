package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectResponseV2;
import io.datahubproject.openapi.generated.ChartInfoAspectResponseV2;
import io.datahubproject.openapi.generated.ChartKeyAspectResponseV2;
import io.datahubproject.openapi.generated.ChartQueryAspectResponseV2;
import io.datahubproject.openapi.generated.ChartUsageStatisticsAspectResponseV2;
import io.datahubproject.openapi.generated.ContainerAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.EditableChartPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.EmbedAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectResponseV2;
import io.datahubproject.openapi.generated.InputFieldsAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
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
 * Chart object.
 */
@Schema(description = "Chart object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("chartKey") @Builder.Default
  private ChartKeyAspectResponseV2 chartKey = null;

  @JsonProperty("chartInfo") @Builder.Default
  private ChartInfoAspectResponseV2 chartInfo = null;

  @JsonProperty("editableChartProperties") @Builder.Default
  private EditableChartPropertiesAspectResponseV2 editableChartProperties = null;

  @JsonProperty("chartQuery") @Builder.Default
  private ChartQueryAspectResponseV2 chartQuery = null;

  @JsonProperty("inputFields") @Builder.Default
  private InputFieldsAspectResponseV2 inputFields = null;

  @JsonProperty("chartUsageStatistics") @Builder.Default
  private ChartUsageStatisticsAspectResponseV2 chartUsageStatistics = null;

  @JsonProperty("embed") @Builder.Default
  private EmbedAspectResponseV2 embed = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectResponseV2 browsePaths = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectResponseV2 container = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectResponseV2 browsePathsV2 = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectResponseV2 incidentsSummary = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  public ChartEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for chart
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for chart")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public ChartEntityResponseV2 chartKey(ChartKeyAspectResponseV2 chartKey) {
    this.chartKey = chartKey;
    return this;
  }

  /**
   * Get chartKey
   * @return chartKey
   **/
  @Schema(description = "")
  
    @Valid
    public ChartKeyAspectResponseV2 getChartKey() {
    return chartKey;
  }

  public void setChartKey(ChartKeyAspectResponseV2 chartKey) {
    this.chartKey = chartKey;
  }

  public ChartEntityResponseV2 chartInfo(ChartInfoAspectResponseV2 chartInfo) {
    this.chartInfo = chartInfo;
    return this;
  }

  /**
   * Get chartInfo
   * @return chartInfo
   **/
  @Schema(description = "")
  
    @Valid
    public ChartInfoAspectResponseV2 getChartInfo() {
    return chartInfo;
  }

  public void setChartInfo(ChartInfoAspectResponseV2 chartInfo) {
    this.chartInfo = chartInfo;
  }

  public ChartEntityResponseV2 editableChartProperties(EditableChartPropertiesAspectResponseV2 editableChartProperties) {
    this.editableChartProperties = editableChartProperties;
    return this;
  }

  /**
   * Get editableChartProperties
   * @return editableChartProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableChartPropertiesAspectResponseV2 getEditableChartProperties() {
    return editableChartProperties;
  }

  public void setEditableChartProperties(EditableChartPropertiesAspectResponseV2 editableChartProperties) {
    this.editableChartProperties = editableChartProperties;
  }

  public ChartEntityResponseV2 chartQuery(ChartQueryAspectResponseV2 chartQuery) {
    this.chartQuery = chartQuery;
    return this;
  }

  /**
   * Get chartQuery
   * @return chartQuery
   **/
  @Schema(description = "")
  
    @Valid
    public ChartQueryAspectResponseV2 getChartQuery() {
    return chartQuery;
  }

  public void setChartQuery(ChartQueryAspectResponseV2 chartQuery) {
    this.chartQuery = chartQuery;
  }

  public ChartEntityResponseV2 inputFields(InputFieldsAspectResponseV2 inputFields) {
    this.inputFields = inputFields;
    return this;
  }

  /**
   * Get inputFields
   * @return inputFields
   **/
  @Schema(description = "")
  
    @Valid
    public InputFieldsAspectResponseV2 getInputFields() {
    return inputFields;
  }

  public void setInputFields(InputFieldsAspectResponseV2 inputFields) {
    this.inputFields = inputFields;
  }

  public ChartEntityResponseV2 chartUsageStatistics(ChartUsageStatisticsAspectResponseV2 chartUsageStatistics) {
    this.chartUsageStatistics = chartUsageStatistics;
    return this;
  }

  /**
   * Get chartUsageStatistics
   * @return chartUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public ChartUsageStatisticsAspectResponseV2 getChartUsageStatistics() {
    return chartUsageStatistics;
  }

  public void setChartUsageStatistics(ChartUsageStatisticsAspectResponseV2 chartUsageStatistics) {
    this.chartUsageStatistics = chartUsageStatistics;
  }

  public ChartEntityResponseV2 embed(EmbedAspectResponseV2 embed) {
    this.embed = embed;
    return this;
  }

  /**
   * Get embed
   * @return embed
   **/
  @Schema(description = "")
  
    @Valid
    public EmbedAspectResponseV2 getEmbed() {
    return embed;
  }

  public void setEmbed(EmbedAspectResponseV2 embed) {
    this.embed = embed;
  }

  public ChartEntityResponseV2 browsePaths(BrowsePathsAspectResponseV2 browsePaths) {
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

  public ChartEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public ChartEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
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

  public ChartEntityResponseV2 container(ContainerAspectResponseV2 container) {
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

  public ChartEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public ChartEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public ChartEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public ChartEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public ChartEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public ChartEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public ChartEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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

  public ChartEntityResponseV2 browsePathsV2(BrowsePathsV2AspectResponseV2 browsePathsV2) {
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

  public ChartEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public ChartEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public ChartEntityResponseV2 incidentsSummary(IncidentsSummaryAspectResponseV2 incidentsSummary) {
    this.incidentsSummary = incidentsSummary;
    return this;
  }

  /**
   * Get incidentsSummary
   * @return incidentsSummary
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentsSummaryAspectResponseV2 getIncidentsSummary() {
    return incidentsSummary;
  }

  public void setIncidentsSummary(IncidentsSummaryAspectResponseV2 incidentsSummary) {
    this.incidentsSummary = incidentsSummary;
  }

  public ChartEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public ChartEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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
    ChartEntityResponseV2 chartEntityResponseV2 = (ChartEntityResponseV2) o;
    return Objects.equals(this.urn, chartEntityResponseV2.urn) &&
        Objects.equals(this.chartKey, chartEntityResponseV2.chartKey) &&
        Objects.equals(this.chartInfo, chartEntityResponseV2.chartInfo) &&
        Objects.equals(this.editableChartProperties, chartEntityResponseV2.editableChartProperties) &&
        Objects.equals(this.chartQuery, chartEntityResponseV2.chartQuery) &&
        Objects.equals(this.inputFields, chartEntityResponseV2.inputFields) &&
        Objects.equals(this.chartUsageStatistics, chartEntityResponseV2.chartUsageStatistics) &&
        Objects.equals(this.embed, chartEntityResponseV2.embed) &&
        Objects.equals(this.browsePaths, chartEntityResponseV2.browsePaths) &&
        Objects.equals(this.domains, chartEntityResponseV2.domains) &&
        Objects.equals(this.applications, chartEntityResponseV2.applications) &&
        Objects.equals(this.container, chartEntityResponseV2.container) &&
        Objects.equals(this.deprecation, chartEntityResponseV2.deprecation) &&
        Objects.equals(this.ownership, chartEntityResponseV2.ownership) &&
        Objects.equals(this.status, chartEntityResponseV2.status) &&
        Objects.equals(this.institutionalMemory, chartEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.dataPlatformInstance, chartEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.globalTags, chartEntityResponseV2.globalTags) &&
        Objects.equals(this.glossaryTerms, chartEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.browsePathsV2, chartEntityResponseV2.browsePathsV2) &&
        Objects.equals(this.subTypes, chartEntityResponseV2.subTypes) &&
        Objects.equals(this.structuredProperties, chartEntityResponseV2.structuredProperties) &&
        Objects.equals(this.incidentsSummary, chartEntityResponseV2.incidentsSummary) &&
        Objects.equals(this.forms, chartEntityResponseV2.forms) &&
        Objects.equals(this.testResults, chartEntityResponseV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, chartKey, chartInfo, editableChartProperties, chartQuery, inputFields, chartUsageStatistics, embed, browsePaths, domains, applications, container, deprecation, ownership, status, institutionalMemory, dataPlatformInstance, globalTags, glossaryTerms, browsePathsV2, subTypes, structuredProperties, incidentsSummary, forms, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    chartKey: ").append(toIndentedString(chartKey)).append("\n");
    sb.append("    chartInfo: ").append(toIndentedString(chartInfo)).append("\n");
    sb.append("    editableChartProperties: ").append(toIndentedString(editableChartProperties)).append("\n");
    sb.append("    chartQuery: ").append(toIndentedString(chartQuery)).append("\n");
    sb.append("    inputFields: ").append(toIndentedString(inputFields)).append("\n");
    sb.append("    chartUsageStatistics: ").append(toIndentedString(chartUsageStatistics)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    browsePathsV2: ").append(toIndentedString(browsePathsV2)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    incidentsSummary: ").append(toIndentedString(incidentsSummary)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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