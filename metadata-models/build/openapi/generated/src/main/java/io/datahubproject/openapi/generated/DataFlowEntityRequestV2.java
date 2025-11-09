package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectRequestV2;
import io.datahubproject.openapi.generated.ContainerAspectRequestV2;
import io.datahubproject.openapi.generated.DataFlowInfoAspectRequestV2;
import io.datahubproject.openapi.generated.DataFlowKeyAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.EditableDataFlowPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
import io.datahubproject.openapi.generated.TestResultsAspectRequestV2;
import io.datahubproject.openapi.generated.VersionInfoAspectRequestV2;
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
public class DataFlowEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataFlowKey") @Builder.Default
  private DataFlowKeyAspectRequestV2 dataFlowKey = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("versionInfo") @Builder.Default
  private VersionInfoAspectRequestV2 versionInfo = null;

  @JsonProperty("dataFlowInfo") @Builder.Default
  private DataFlowInfoAspectRequestV2 dataFlowInfo = null;

  @JsonProperty("editableDataFlowProperties") @Builder.Default
  private EditableDataFlowPropertiesAspectRequestV2 editableDataFlowProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectRequestV2 browsePaths = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectRequestV2 container = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectRequestV2 browsePathsV2 = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectRequestV2 incidentsSummary = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  public DataFlowEntityRequestV2 urn(String urn) {
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

  public DataFlowEntityRequestV2 dataFlowKey(DataFlowKeyAspectRequestV2 dataFlowKey) {
    this.dataFlowKey = dataFlowKey;
    return this;
  }

  /**
   * Get dataFlowKey
   * @return dataFlowKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataFlowKeyAspectRequestV2 getDataFlowKey() {
    return dataFlowKey;
  }

  public void setDataFlowKey(DataFlowKeyAspectRequestV2 dataFlowKey) {
    this.dataFlowKey = dataFlowKey;
  }

  public DataFlowEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
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

  public DataFlowEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
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

  public DataFlowEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public DataFlowEntityRequestV2 versionInfo(VersionInfoAspectRequestV2 versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  /**
   * Get versionInfo
   * @return versionInfo
   **/
  @Schema(description = "")
  
    @Valid
    public VersionInfoAspectRequestV2 getVersionInfo() {
    return versionInfo;
  }

  public void setVersionInfo(VersionInfoAspectRequestV2 versionInfo) {
    this.versionInfo = versionInfo;
  }

  public DataFlowEntityRequestV2 dataFlowInfo(DataFlowInfoAspectRequestV2 dataFlowInfo) {
    this.dataFlowInfo = dataFlowInfo;
    return this;
  }

  /**
   * Get dataFlowInfo
   * @return dataFlowInfo
   **/
  @Schema(description = "")
  
    @Valid
    public DataFlowInfoAspectRequestV2 getDataFlowInfo() {
    return dataFlowInfo;
  }

  public void setDataFlowInfo(DataFlowInfoAspectRequestV2 dataFlowInfo) {
    this.dataFlowInfo = dataFlowInfo;
  }

  public DataFlowEntityRequestV2 editableDataFlowProperties(EditableDataFlowPropertiesAspectRequestV2 editableDataFlowProperties) {
    this.editableDataFlowProperties = editableDataFlowProperties;
    return this;
  }

  /**
   * Get editableDataFlowProperties
   * @return editableDataFlowProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableDataFlowPropertiesAspectRequestV2 getEditableDataFlowProperties() {
    return editableDataFlowProperties;
  }

  public void setEditableDataFlowProperties(EditableDataFlowPropertiesAspectRequestV2 editableDataFlowProperties) {
    this.editableDataFlowProperties = editableDataFlowProperties;
  }

  public DataFlowEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public DataFlowEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public DataFlowEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public DataFlowEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
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

  public DataFlowEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
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

  public DataFlowEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public DataFlowEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public DataFlowEntityRequestV2 container(ContainerAspectRequestV2 container) {
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

  public DataFlowEntityRequestV2 browsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
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

  public DataFlowEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public DataFlowEntityRequestV2 incidentsSummary(IncidentsSummaryAspectRequestV2 incidentsSummary) {
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

  public DataFlowEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public DataFlowEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public DataFlowEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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
    DataFlowEntityRequestV2 dataFlowEntityRequestV2 = (DataFlowEntityRequestV2) o;
    return Objects.equals(this.urn, dataFlowEntityRequestV2.urn) &&
        Objects.equals(this.dataFlowKey, dataFlowEntityRequestV2.dataFlowKey) &&
        Objects.equals(this.domains, dataFlowEntityRequestV2.domains) &&
        Objects.equals(this.applications, dataFlowEntityRequestV2.applications) &&
        Objects.equals(this.deprecation, dataFlowEntityRequestV2.deprecation) &&
        Objects.equals(this.versionInfo, dataFlowEntityRequestV2.versionInfo) &&
        Objects.equals(this.dataFlowInfo, dataFlowEntityRequestV2.dataFlowInfo) &&
        Objects.equals(this.editableDataFlowProperties, dataFlowEntityRequestV2.editableDataFlowProperties) &&
        Objects.equals(this.ownership, dataFlowEntityRequestV2.ownership) &&
        Objects.equals(this.status, dataFlowEntityRequestV2.status) &&
        Objects.equals(this.globalTags, dataFlowEntityRequestV2.globalTags) &&
        Objects.equals(this.browsePaths, dataFlowEntityRequestV2.browsePaths) &&
        Objects.equals(this.glossaryTerms, dataFlowEntityRequestV2.glossaryTerms) &&
        Objects.equals(this.institutionalMemory, dataFlowEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.dataPlatformInstance, dataFlowEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.container, dataFlowEntityRequestV2.container) &&
        Objects.equals(this.browsePathsV2, dataFlowEntityRequestV2.browsePathsV2) &&
        Objects.equals(this.structuredProperties, dataFlowEntityRequestV2.structuredProperties) &&
        Objects.equals(this.incidentsSummary, dataFlowEntityRequestV2.incidentsSummary) &&
        Objects.equals(this.forms, dataFlowEntityRequestV2.forms) &&
        Objects.equals(this.subTypes, dataFlowEntityRequestV2.subTypes) &&
        Objects.equals(this.testResults, dataFlowEntityRequestV2.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataFlowKey, domains, applications, deprecation, versionInfo, dataFlowInfo, editableDataFlowProperties, ownership, status, globalTags, browsePaths, glossaryTerms, institutionalMemory, dataPlatformInstance, container, browsePathsV2, structuredProperties, incidentsSummary, forms, subTypes, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowEntityRequestV2 {\n");
    
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