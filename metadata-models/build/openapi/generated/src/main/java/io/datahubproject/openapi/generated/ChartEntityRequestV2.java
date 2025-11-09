package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectRequestV2;
import io.datahubproject.openapi.generated.ChartInfoAspectRequestV2;
import io.datahubproject.openapi.generated.ChartKeyAspectRequestV2;
import io.datahubproject.openapi.generated.ChartQueryAspectRequestV2;
import io.datahubproject.openapi.generated.ChartUsageStatisticsAspectRequestV2;
import io.datahubproject.openapi.generated.ContainerAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.EditableChartPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.EmbedAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectRequestV2;
import io.datahubproject.openapi.generated.InputFieldsAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
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
 * Chart object.
 */
@Schema(description = "Chart object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("chartKey") @Builder.Default
  private ChartKeyAspectRequestV2 chartKey = null;

  @JsonProperty("chartInfo") @Builder.Default
  private ChartInfoAspectRequestV2 chartInfo = null;

  @JsonProperty("editableChartProperties") @Builder.Default
  private EditableChartPropertiesAspectRequestV2 editableChartProperties = null;

  @JsonProperty("chartQuery") @Builder.Default
  private ChartQueryAspectRequestV2 chartQuery = null;

  @JsonProperty("inputFields") @Builder.Default
  private InputFieldsAspectRequestV2 inputFields = null;

  @JsonProperty("chartUsageStatistics") @Builder.Default
  private ChartUsageStatisticsAspectRequestV2 chartUsageStatistics = null;

  @JsonProperty("embed") @Builder.Default
  private EmbedAspectRequestV2 embed = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectRequestV2 browsePaths = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectRequestV2 container = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectRequestV2 browsePathsV2 = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectRequestV2 incidentsSummary = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  public ChartEntityRequestV2 urn(String urn) {
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

  public ChartEntityRequestV2 chartKey(ChartKeyAspectRequestV2 chartKey) {
    this.chartKey = chartKey;
    return this;
  }

  /**
   * Get chartKey
   * @return chartKey
   **/
  @Schema(description = "")
  
    @Valid
    public ChartKeyAspectRequestV2 getChartKey() {
    return chartKey;
  }

  public void setChartKey(ChartKeyAspectRequestV2 chartKey) {
    this.chartKey = chartKey;
  }

  public ChartEntityRequestV2 chartInfo(ChartInfoAspectRequestV2 chartInfo) {
    this.chartInfo = chartInfo;
    return this;
  }

  /**
   * Get chartInfo
   * @return chartInfo
   **/
  @Schema(description = "")
  
    @Valid
    public ChartInfoAspectRequestV2 getChartInfo() {
    return chartInfo;
  }

  public void setChartInfo(ChartInfoAspectRequestV2 chartInfo) {
    this.chartInfo = chartInfo;
  }

  public ChartEntityRequestV2 editableChartProperties(EditableChartPropertiesAspectRequestV2 editableChartProperties) {
    this.editableChartProperties = editableChartProperties;
    return this;
  }

  /**
   * Get editableChartProperties
   * @return editableChartProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableChartPropertiesAspectRequestV2 getEditableChartProperties() {
    return editableChartProperties;
  }

  public void setEditableChartProperties(EditableChartPropertiesAspectRequestV2 editableChartProperties) {
    this.editableChartProperties = editableChartProperties;
  }

  public ChartEntityRequestV2 chartQuery(ChartQueryAspectRequestV2 chartQuery) {
    this.chartQuery = chartQuery;
    return this;
  }

  /**
   * Get chartQuery
   * @return chartQuery
   **/
  @Schema(description = "")
  
    @Valid
    public ChartQueryAspectRequestV2 getChartQuery() {
    return chartQuery;
  }

  public void setChartQuery(ChartQueryAspectRequestV2 chartQuery) {
    this.chartQuery = chartQuery;
  }

  public ChartEntityRequestV2 inputFields(InputFieldsAspectRequestV2 inputFields) {
    this.inputFields = inputFields;
    return this;
  }

  /**
   * Get inputFields
   * @return inputFields
   **/
  @Schema(description = "")
  
    @Valid
    public InputFieldsAspectRequestV2 getInputFields() {
    return inputFields;
  }

  public void setInputFields(InputFieldsAspectRequestV2 inputFields) {
    this.inputFields = inputFields;
  }

  public ChartEntityRequestV2 chartUsageStatistics(ChartUsageStatisticsAspectRequestV2 chartUsageStatistics) {
    this.chartUsageStatistics = chartUsageStatistics;
    return this;
  }

  /**
   * Get chartUsageStatistics
   * @return chartUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public ChartUsageStatisticsAspectRequestV2 getChartUsageStatistics() {
    return chartUsageStatistics;
  }

  public void setChartUsageStatistics(ChartUsageStatisticsAspectRequestV2 chartUsageStatistics) {
    this.chartUsageStatistics = chartUsageStatistics;
  }

  public ChartEntityRequestV2 embed(EmbedAspectRequestV2 embed) {
    this.embed = embed;
    return this;
  }

  /**
   * Get embed
   * @return embed
   **/
  @Schema(description = "")
  
    @Valid
    public EmbedAspectRequestV2 getEmbed() {
    return embed;
  }

  public void setEmbed(EmbedAspectRequestV2 embed) {
    this.embed = embed;
  }

  public ChartEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
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

  public ChartEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
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

  public ChartEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
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

  public ChartEntityRequestV2 container(ContainerAspectRequestV2 container) {
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

  public ChartEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public ChartEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public ChartEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public ChartEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public ChartEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public ChartEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public ChartEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
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

  public ChartEntityRequestV2 browsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
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

  public ChartEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public ChartEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public ChartEntityRequestV2 incidentsSummary(IncidentsSummaryAspectRequestV2 incidentsSummary) {
    this.incidentsSummary = incidentsSummary;
    return this;
  }

  /**
   * Get incidentsSummary
   * @return incidentsSummary
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentsSummaryAspectRequestV2 getIncidentsSummary() {
    return incidentsSummary;
  }

  public void setIncidentsSummary(IncidentsSummaryAspectRequestV2 incidentsSummary) {
    this.incidentsSummary = incidentsSummary;
  }

  public ChartEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public ChartEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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
    ChartEntityRequestV2 chartEntityRequestV2 = (ChartEntityRequestV2) o;
    return Objects.equals(this.urn, chartEntityRequestV2.urn) &&
        Objects.equals(this.chartKey, chartEntityRequestV2.chartKey) &&
        Objects.equals(this.chartInfo, chartEntityRequestV2.chartInfo) &&
        Objects.equals(this.editableChartProperties, chartEntityRequestV2.editableChartProperties) &&
        Objects.equals(this.chartQuery, chartEntityRequestV2.chartQuery) &&
        Objects.equals(this.inputFields, chartEntityRequestV2.inputFields) &&
        Objects.equals(this.chartUsageStatistics, chartEntityRequestV2.chartUsageStatistics) &&
        Objects.equals(this.embed, chartEntityRequestV2.embed) &&
        Objects.equals(this.browsePaths, chartEntityRequestV2.browsePaths) &&
        Objects.equals(this.domains, chartEntityRequestV2.domains) &&
        Objects.equals(this.applications, chartEntityRequestV2.applications) &&
        Objects.equals(this.container, chartEntityRequestV2.container) &&
        Objects.equals(this.deprecation, chartEntityRequestV2.deprecation) &&
        Objects.equals(this.ownership, chartEntityRequestV2.ownership) &&
        Objects.equals(this.status, chartEntityRequestV2.status) &&
        Objects.equals(this.institutionalMemory, chartEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.dataPlatformInstance, chartEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.globalTags, chartEntityRequestV2.globalTags) &&
        Objects.equals(this.glossaryTerms, chartEntityRequestV2.glossaryTerms) &&
        Objects.equals(this.browsePathsV2, chartEntityRequestV2.browsePathsV2) &&
        Objects.equals(this.subTypes, chartEntityRequestV2.subTypes) &&
        Objects.equals(this.structuredProperties, chartEntityRequestV2.structuredProperties) &&
        Objects.equals(this.incidentsSummary, chartEntityRequestV2.incidentsSummary) &&
        Objects.equals(this.forms, chartEntityRequestV2.forms) &&
        Objects.equals(this.testResults, chartEntityRequestV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, chartKey, chartInfo, editableChartProperties, chartQuery, inputFields, chartUsageStatistics, embed, browsePaths, domains, applications, container, deprecation, ownership, status, institutionalMemory, dataPlatformInstance, globalTags, glossaryTerms, browsePathsV2, subTypes, structuredProperties, incidentsSummary, forms, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartEntityRequestV2 {\n");
    
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