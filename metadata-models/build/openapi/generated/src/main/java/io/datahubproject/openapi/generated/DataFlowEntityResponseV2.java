package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectResponseV2;
import io.datahubproject.openapi.generated.ContainerAspectResponseV2;
import io.datahubproject.openapi.generated.DataFlowInfoAspectResponseV2;
import io.datahubproject.openapi.generated.DataFlowKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.EditableDataFlowPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
import io.datahubproject.openapi.generated.TestResultsAspectResponseV2;
import io.datahubproject.openapi.generated.VersionInfoAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataFlow object.
 */
@Schema(description = "DataFlow object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFlowEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataFlowKey") @Builder.Default
  private DataFlowKeyAspectResponseV2 dataFlowKey = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("versionInfo") @Builder.Default
  private VersionInfoAspectResponseV2 versionInfo = null;

  @JsonProperty("dataFlowInfo") @Builder.Default
  private DataFlowInfoAspectResponseV2 dataFlowInfo = null;

  @JsonProperty("editableDataFlowProperties") @Builder.Default
  private EditableDataFlowPropertiesAspectResponseV2 editableDataFlowProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectResponseV2 browsePaths = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectResponseV2 container = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectResponseV2 browsePathsV2 = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectResponseV2 incidentsSummary = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  public DataFlowEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataFlow
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataFlow")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataFlowEntityResponseV2 dataFlowKey(DataFlowKeyAspectResponseV2 dataFlowKey) {
    this.dataFlowKey = dataFlowKey;
    return this;
  }

  /**
   * Get dataFlowKey
   * @return dataFlowKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataFlowKeyAspectResponseV2 getDataFlowKey() {
    return dataFlowKey;
  }

  public void setDataFlowKey(DataFlowKeyAspectResponseV2 dataFlowKey) {
    this.dataFlowKey = dataFlowKey;
  }

  public DataFlowEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public DataFlowEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
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

  public DataFlowEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public DataFlowEntityResponseV2 versionInfo(VersionInfoAspectResponseV2 versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  /**
   * Get versionInfo
   * @return versionInfo
   **/
  @Schema(description = "")
  
    @Valid
    public VersionInfoAspectResponseV2 getVersionInfo() {
    return versionInfo;
  }

  public void setVersionInfo(VersionInfoAspectResponseV2 versionInfo) {
    this.versionInfo = versionInfo;
  }

  public DataFlowEntityResponseV2 dataFlowInfo(DataFlowInfoAspectResponseV2 dataFlowInfo) {
    this.dataFlowInfo = dataFlowInfo;
    return this;
  }

  /**
   * Get dataFlowInfo
   * @return dataFlowInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataFlowInfoAspectResponseV2 getDataFlowInfo() {
    return dataFlowInfo;
  }

  public void setDataFlowInfo(DataFlowInfoAspectResponseV2 dataFlowInfo) {
    this.dataFlowInfo = dataFlowInfo;
  }

  public DataFlowEntityResponseV2 editableDataFlowProperties(EditableDataFlowPropertiesAspectResponseV2 editableDataFlowProperties) {
    this.editableDataFlowProperties = editableDataFlowProperties;
    return this;
  }

  /**
   * Get editableDataFlowProperties
   * @return editableDataFlowProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableDataFlowPropertiesAspectResponseV2 getEditableDataFlowProperties() {
    return editableDataFlowProperties;
  }

  public void setEditableDataFlowProperties(EditableDataFlowPropertiesAspectResponseV2 editableDataFlowProperties) {
    this.editableDataFlowProperties = editableDataFlowProperties;
  }

  public DataFlowEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public DataFlowEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public DataFlowEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public DataFlowEntityResponseV2 browsePaths(BrowsePathsAspectResponseV2 browsePaths) {
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

  public DataFlowEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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

  public DataFlowEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public DataFlowEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public DataFlowEntityResponseV2 container(ContainerAspectResponseV2 container) {
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

  public DataFlowEntityResponseV2 browsePathsV2(BrowsePathsV2AspectResponseV2 browsePathsV2) {
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

  public DataFlowEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public DataFlowEntityResponseV2 incidentsSummary(IncidentsSummaryAspectResponseV2 incidentsSummary) {
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

  public DataFlowEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public DataFlowEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public DataFlowEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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
    DataFlowEntityResponseV2 dataFlowEntityResponseV2 = (DataFlowEntityResponseV2) o;
    return Objects.equals(this.urn, dataFlowEntityResponseV2.urn) &&
        Objects.equals(this.dataFlowKey, dataFlowEntityResponseV2.dataFlowKey) &&
        Objects.equals(this.domains, dataFlowEntityResponseV2.domains) &&
        Objects.equals(this.applications, dataFlowEntityResponseV2.applications) &&
        Objects.equals(this.deprecation, dataFlowEntityResponseV2.deprecation) &&
        Objects.equals(this.versionInfo, dataFlowEntityResponseV2.versionInfo) &&
        Objects.equals(this.dataFlowInfo, dataFlowEntityResponseV2.dataFlowInfo) &&
        Objects.equals(this.editableDataFlowProperties, dataFlowEntityResponseV2.editableDataFlowProperties) &&
        Objects.equals(this.ownership, dataFlowEntityResponseV2.ownership) &&
        Objects.equals(this.status, dataFlowEntityResponseV2.status) &&
        Objects.equals(this.globalTags, dataFlowEntityResponseV2.globalTags) &&
        Objects.equals(this.browsePaths, dataFlowEntityResponseV2.browsePaths) &&
        Objects.equals(this.glossaryTerms, dataFlowEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.institutionalMemory, dataFlowEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.dataPlatformInstance, dataFlowEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.container, dataFlowEntityResponseV2.container) &&
        Objects.equals(this.browsePathsV2, dataFlowEntityResponseV2.browsePathsV2) &&
        Objects.equals(this.structuredProperties, dataFlowEntityResponseV2.structuredProperties) &&
        Objects.equals(this.incidentsSummary, dataFlowEntityResponseV2.incidentsSummary) &&
        Objects.equals(this.forms, dataFlowEntityResponseV2.forms) &&
        Objects.equals(this.subTypes, dataFlowEntityResponseV2.subTypes) &&
        Objects.equals(this.testResults, dataFlowEntityResponseV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataFlowKey, domains, applications, deprecation, versionInfo, dataFlowInfo, editableDataFlowProperties, ownership, status, globalTags, browsePaths, glossaryTerms, institutionalMemory, dataPlatformInstance, container, browsePathsV2, structuredProperties, incidentsSummary, forms, subTypes, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataFlowKey: ").append(toIndentedString(dataFlowKey)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
    sb.append("    dataFlowInfo: ").append(toIndentedString(dataFlowInfo)).append("\n");
    sb.append("    editableDataFlowProperties: ").append(toIndentedString(editableDataFlowProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    browsePathsV2: ").append(toIndentedString(browsePathsV2)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    incidentsSummary: ").append(toIndentedString(incidentsSummary)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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