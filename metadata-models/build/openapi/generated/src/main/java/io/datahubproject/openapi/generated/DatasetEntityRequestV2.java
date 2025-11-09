package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AccessAspectRequestV2;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectRequestV2;
import io.datahubproject.openapi.generated.ContainerAspectRequestV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetDeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetKeyAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetProfileAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetUpstreamLineageAspectRequestV2;
import io.datahubproject.openapi.generated.DatasetUsageStatisticsAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.EditableDatasetPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.EditableSchemaMetadataAspectRequestV2;
import io.datahubproject.openapi.generated.EmbedAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.IcebergCatalogInfoAspectRequestV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.LogicalParentAspectRequestV2;
import io.datahubproject.openapi.generated.OperationAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.PartitionsSummaryAspectRequestV2;
import io.datahubproject.openapi.generated.SchemaMetadataAspectRequestV2;
import io.datahubproject.openapi.generated.SiblingsAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
import io.datahubproject.openapi.generated.TestResultsAspectRequestV2;
import io.datahubproject.openapi.generated.UpstreamLineageAspectRequestV2;
import io.datahubproject.openapi.generated.VersionPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.ViewPropertiesAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Datasets represent logical or physical data assets stored or represented in various data platforms. Tables, Views, Streams are all instances of datasets.
 */
@Schema(description = "Datasets represent logical or physical data assets stored or represented in various data platforms. Tables, Views, Streams are all instances of datasets.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("datasetKey") @Builder.Default
  private DatasetKeyAspectRequestV2 datasetKey = null;

  @JsonProperty("viewProperties") @Builder.Default
  private ViewPropertiesAspectRequestV2 viewProperties = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("datasetProfile") @Builder.Default
  private DatasetProfileAspectRequestV2 datasetProfile = null;

  @JsonProperty("datasetUsageStatistics") @Builder.Default
  private DatasetUsageStatisticsAspectRequestV2 datasetUsageStatistics = null;

  @JsonProperty("operation") @Builder.Default
  private OperationAspectRequestV2 operation = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("schemaMetadata") @Builder.Default
  private SchemaMetadataAspectRequestV2 schemaMetadata = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectRequestV2 container = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("siblings") @Builder.Default
  private SiblingsAspectRequestV2 siblings = null;

  @JsonProperty("embed") @Builder.Default
  private EmbedAspectRequestV2 embed = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectRequestV2 incidentsSummary = null;

  @JsonProperty("datasetProperties") @Builder.Default
  private DatasetPropertiesAspectRequestV2 datasetProperties = null;

  @JsonProperty("editableDatasetProperties") @Builder.Default
  private EditableDatasetPropertiesAspectRequestV2 editableDatasetProperties = null;

  @JsonProperty("datasetDeprecation") @Builder.Default
  private DatasetDeprecationAspectRequestV2 datasetDeprecation = null;

  @JsonProperty("datasetUpstreamLineage") @Builder.Default
  private DatasetUpstreamLineageAspectRequestV2 datasetUpstreamLineage = null;

  @JsonProperty("upstreamLineage") @Builder.Default
  private UpstreamLineageAspectRequestV2 upstreamLineage = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("editableSchemaMetadata") @Builder.Default
  private EditableSchemaMetadataAspectRequestV2 editableSchemaMetadata = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectRequestV2 browsePaths = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectRequestV2 browsePathsV2 = null;

  @JsonProperty("access") @Builder.Default
  private AccessAspectRequestV2 access = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("partitionsSummary") @Builder.Default
  private PartitionsSummaryAspectRequestV2 partitionsSummary = null;

  @JsonProperty("versionProperties") @Builder.Default
  private VersionPropertiesAspectRequestV2 versionProperties = null;

  @JsonProperty("icebergCatalogInfo") @Builder.Default
  private IcebergCatalogInfoAspectRequestV2 icebergCatalogInfo = null;

  @JsonProperty("logicalParent") @Builder.Default
  private LogicalParentAspectRequestV2 logicalParent = null;

  public DatasetEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataset
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataset")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DatasetEntityRequestV2 datasetKey(DatasetKeyAspectRequestV2 datasetKey) {
    this.datasetKey = datasetKey;
    return this;
  }

  /**
   * Get datasetKey
   * @return datasetKey
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetKeyAspectRequestV2 getDatasetKey() {
    return datasetKey;
  }

  public void setDatasetKey(DatasetKeyAspectRequestV2 datasetKey) {
    this.datasetKey = datasetKey;
  }

  public DatasetEntityRequestV2 viewProperties(ViewPropertiesAspectRequestV2 viewProperties) {
    this.viewProperties = viewProperties;
    return this;
  }

  /**
   * Get viewProperties
   * @return viewProperties
   **/
  @Schema(description = "")
  
    @Valid
    public ViewPropertiesAspectRequestV2 getViewProperties() {
    return viewProperties;
  }

  public void setViewProperties(ViewPropertiesAspectRequestV2 viewProperties) {
    this.viewProperties = viewProperties;
  }

  public DatasetEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public DatasetEntityRequestV2 datasetProfile(DatasetProfileAspectRequestV2 datasetProfile) {
    this.datasetProfile = datasetProfile;
    return this;
  }

  /**
   * Get datasetProfile
   * @return datasetProfile
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetProfileAspectRequestV2 getDatasetProfile() {
    return datasetProfile;
  }

  public void setDatasetProfile(DatasetProfileAspectRequestV2 datasetProfile) {
    this.datasetProfile = datasetProfile;
  }

  public DatasetEntityRequestV2 datasetUsageStatistics(DatasetUsageStatisticsAspectRequestV2 datasetUsageStatistics) {
    this.datasetUsageStatistics = datasetUsageStatistics;
    return this;
  }

  /**
   * Get datasetUsageStatistics
   * @return datasetUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetUsageStatisticsAspectRequestV2 getDatasetUsageStatistics() {
    return datasetUsageStatistics;
  }

  public void setDatasetUsageStatistics(DatasetUsageStatisticsAspectRequestV2 datasetUsageStatistics) {
    this.datasetUsageStatistics = datasetUsageStatistics;
  }

  public DatasetEntityRequestV2 operation(OperationAspectRequestV2 operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @Schema(description = "")
  
    @Valid
    public OperationAspectRequestV2 getOperation() {
    return operation;
  }

  public void setOperation(OperationAspectRequestV2 operation) {
    this.operation = operation;
  }

  public DatasetEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
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

  public DatasetEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
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

  public DatasetEntityRequestV2 schemaMetadata(SchemaMetadataAspectRequestV2 schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
    return this;
  }

  /**
   * Get schemaMetadata
   * @return schemaMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaMetadataAspectRequestV2 getSchemaMetadata() {
    return schemaMetadata;
  }

  public void setSchemaMetadata(SchemaMetadataAspectRequestV2 schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
  }

  public DatasetEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public DatasetEntityRequestV2 container(ContainerAspectRequestV2 container) {
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

  public DatasetEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public DatasetEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public DatasetEntityRequestV2 siblings(SiblingsAspectRequestV2 siblings) {
    this.siblings = siblings;
    return this;
  }

  /**
   * Get siblings
   * @return siblings
   **/
  @Schema(description = "")
  
    @Valid
    public SiblingsAspectRequestV2 getSiblings() {
    return siblings;
  }

  public void setSiblings(SiblingsAspectRequestV2 siblings) {
    this.siblings = siblings;
  }

  public DatasetEntityRequestV2 embed(EmbedAspectRequestV2 embed) {
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

  public DatasetEntityRequestV2 incidentsSummary(IncidentsSummaryAspectRequestV2 incidentsSummary) {
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

  public DatasetEntityRequestV2 datasetProperties(DatasetPropertiesAspectRequestV2 datasetProperties) {
    this.datasetProperties = datasetProperties;
    return this;
  }

  /**
   * Get datasetProperties
   * @return datasetProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetPropertiesAspectRequestV2 getDatasetProperties() {
    return datasetProperties;
  }

  public void setDatasetProperties(DatasetPropertiesAspectRequestV2 datasetProperties) {
    this.datasetProperties = datasetProperties;
  }

  public DatasetEntityRequestV2 editableDatasetProperties(EditableDatasetPropertiesAspectRequestV2 editableDatasetProperties) {
    this.editableDatasetProperties = editableDatasetProperties;
    return this;
  }

  /**
   * Get editableDatasetProperties
   * @return editableDatasetProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableDatasetPropertiesAspectRequestV2 getEditableDatasetProperties() {
    return editableDatasetProperties;
  }

  public void setEditableDatasetProperties(EditableDatasetPropertiesAspectRequestV2 editableDatasetProperties) {
    this.editableDatasetProperties = editableDatasetProperties;
  }

  public DatasetEntityRequestV2 datasetDeprecation(DatasetDeprecationAspectRequestV2 datasetDeprecation) {
    this.datasetDeprecation = datasetDeprecation;
    return this;
  }

  /**
   * Get datasetDeprecation
   * @return datasetDeprecation
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetDeprecationAspectRequestV2 getDatasetDeprecation() {
    return datasetDeprecation;
  }

  public void setDatasetDeprecation(DatasetDeprecationAspectRequestV2 datasetDeprecation) {
    this.datasetDeprecation = datasetDeprecation;
  }

  public DatasetEntityRequestV2 datasetUpstreamLineage(DatasetUpstreamLineageAspectRequestV2 datasetUpstreamLineage) {
    this.datasetUpstreamLineage = datasetUpstreamLineage;
    return this;
  }

  /**
   * Get datasetUpstreamLineage
   * @return datasetUpstreamLineage
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetUpstreamLineageAspectRequestV2 getDatasetUpstreamLineage() {
    return datasetUpstreamLineage;
  }

  public void setDatasetUpstreamLineage(DatasetUpstreamLineageAspectRequestV2 datasetUpstreamLineage) {
    this.datasetUpstreamLineage = datasetUpstreamLineage;
  }

  public DatasetEntityRequestV2 upstreamLineage(UpstreamLineageAspectRequestV2 upstreamLineage) {
    this.upstreamLineage = upstreamLineage;
    return this;
  }

  /**
   * Get upstreamLineage
   * @return upstreamLineage
   **/
  @Schema(description = "")
  
    @Valid
    public UpstreamLineageAspectRequestV2 getUpstreamLineage() {
    return upstreamLineage;
  }

  public void setUpstreamLineage(UpstreamLineageAspectRequestV2 upstreamLineage) {
    this.upstreamLineage = upstreamLineage;
  }

  public DatasetEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public DatasetEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public DatasetEntityRequestV2 editableSchemaMetadata(EditableSchemaMetadataAspectRequestV2 editableSchemaMetadata) {
    this.editableSchemaMetadata = editableSchemaMetadata;
    return this;
  }

  /**
   * Get editableSchemaMetadata
   * @return editableSchemaMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public EditableSchemaMetadataAspectRequestV2 getEditableSchemaMetadata() {
    return editableSchemaMetadata;
  }

  public void setEditableSchemaMetadata(EditableSchemaMetadataAspectRequestV2 editableSchemaMetadata) {
    this.editableSchemaMetadata = editableSchemaMetadata;
  }

  public DatasetEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public DatasetEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
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

  public DatasetEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
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

  public DatasetEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
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

  public DatasetEntityRequestV2 browsePathsV2(BrowsePathsV2AspectRequestV2 browsePathsV2) {
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

  public DatasetEntityRequestV2 access(AccessAspectRequestV2 access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   **/
  @Schema(description = "")
  
    @Valid
    public AccessAspectRequestV2 getAccess() {
    return access;
  }

  public void setAccess(AccessAspectRequestV2 access) {
    this.access = access;
  }

  public DatasetEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public DatasetEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public DatasetEntityRequestV2 partitionsSummary(PartitionsSummaryAspectRequestV2 partitionsSummary) {
    this.partitionsSummary = partitionsSummary;
    return this;
  }

  /**
   * Get partitionsSummary
   * @return partitionsSummary
   **/
  @Schema(description = "")
  
    @Valid
    public PartitionsSummaryAspectRequestV2 getPartitionsSummary() {
    return partitionsSummary;
  }

  public void setPartitionsSummary(PartitionsSummaryAspectRequestV2 partitionsSummary) {
    this.partitionsSummary = partitionsSummary;
  }

  public DatasetEntityRequestV2 versionProperties(VersionPropertiesAspectRequestV2 versionProperties) {
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

  public DatasetEntityRequestV2 icebergCatalogInfo(IcebergCatalogInfoAspectRequestV2 icebergCatalogInfo) {
    this.icebergCatalogInfo = icebergCatalogInfo;
    return this;
  }

  /**
   * Get icebergCatalogInfo
   * @return icebergCatalogInfo
   **/
  @Schema(description = "")
  
    @Valid
    public IcebergCatalogInfoAspectRequestV2 getIcebergCatalogInfo() {
    return icebergCatalogInfo;
  }

  public void setIcebergCatalogInfo(IcebergCatalogInfoAspectRequestV2 icebergCatalogInfo) {
    this.icebergCatalogInfo = icebergCatalogInfo;
  }

  public DatasetEntityRequestV2 logicalParent(LogicalParentAspectRequestV2 logicalParent) {
    this.logicalParent = logicalParent;
    return this;
  }

  /**
   * Get logicalParent
   * @return logicalParent
   **/
  @Schema(description = "")
  
    @Valid
    public LogicalParentAspectRequestV2 getLogicalParent() {
    return logicalParent;
  }

  public void setLogicalParent(LogicalParentAspectRequestV2 logicalParent) {
    this.logicalParent = logicalParent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetEntityRequestV2 datasetEntityRequestV2 = (DatasetEntityRequestV2) o;
    return Objects.equals(this.urn, datasetEntityRequestV2.urn) &&
        Objects.equals(this.datasetKey, datasetEntityRequestV2.datasetKey) &&
        Objects.equals(this.viewProperties, datasetEntityRequestV2.viewProperties) &&
        Objects.equals(this.subTypes, datasetEntityRequestV2.subTypes) &&
        Objects.equals(this.datasetProfile, datasetEntityRequestV2.datasetProfile) &&
        Objects.equals(this.datasetUsageStatistics, datasetEntityRequestV2.datasetUsageStatistics) &&
        Objects.equals(this.operation, datasetEntityRequestV2.operation) &&
        Objects.equals(this.domains, datasetEntityRequestV2.domains) &&
        Objects.equals(this.applications, datasetEntityRequestV2.applications) &&
        Objects.equals(this.schemaMetadata, datasetEntityRequestV2.schemaMetadata) &&
        Objects.equals(this.status, datasetEntityRequestV2.status) &&
        Objects.equals(this.container, datasetEntityRequestV2.container) &&
        Objects.equals(this.deprecation, datasetEntityRequestV2.deprecation) &&
        Objects.equals(this.testResults, datasetEntityRequestV2.testResults) &&
        Objects.equals(this.siblings, datasetEntityRequestV2.siblings) &&
        Objects.equals(this.embed, datasetEntityRequestV2.embed) &&
        Objects.equals(this.incidentsSummary, datasetEntityRequestV2.incidentsSummary) &&
        Objects.equals(this.datasetProperties, datasetEntityRequestV2.datasetProperties) &&
        Objects.equals(this.editableDatasetProperties, datasetEntityRequestV2.editableDatasetProperties) &&
        Objects.equals(this.datasetDeprecation, datasetEntityRequestV2.datasetDeprecation) &&
        Objects.equals(this.datasetUpstreamLineage, datasetEntityRequestV2.datasetUpstreamLineage) &&
        Objects.equals(this.upstreamLineage, datasetEntityRequestV2.upstreamLineage) &&
        Objects.equals(this.institutionalMemory, datasetEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.ownership, datasetEntityRequestV2.ownership) &&
        Objects.equals(this.editableSchemaMetadata, datasetEntityRequestV2.editableSchemaMetadata) &&
        Objects.equals(this.globalTags, datasetEntityRequestV2.globalTags) &&
        Objects.equals(this.glossaryTerms, datasetEntityRequestV2.glossaryTerms) &&
        Objects.equals(this.browsePaths, datasetEntityRequestV2.browsePaths) &&
        Objects.equals(this.dataPlatformInstance, datasetEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.browsePathsV2, datasetEntityRequestV2.browsePathsV2) &&
        Objects.equals(this.access, datasetEntityRequestV2.access) &&
        Objects.equals(this.structuredProperties, datasetEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, datasetEntityRequestV2.forms) &&
        Objects.equals(this.partitionsSummary, datasetEntityRequestV2.partitionsSummary) &&
        Objects.equals(this.versionProperties, datasetEntityRequestV2.versionProperties) &&
        Objects.equals(this.icebergCatalogInfo, datasetEntityRequestV2.icebergCatalogInfo) &&
        Objects.equals(this.logicalParent, datasetEntityRequestV2.logicalParent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, datasetKey, viewProperties, subTypes, datasetProfile, datasetUsageStatistics, operation, domains, applications, schemaMetadata, status, container, deprecation, testResults, siblings, embed, incidentsSummary, datasetProperties, editableDatasetProperties, datasetDeprecation, datasetUpstreamLineage, upstreamLineage, institutionalMemory, ownership, editableSchemaMetadata, globalTags, glossaryTerms, browsePaths, dataPlatformInstance, browsePathsV2, access, structuredProperties, forms, partitionsSummary, versionProperties, icebergCatalogInfo, logicalParent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    datasetKey: ").append(toIndentedString(datasetKey)).append("\n");
    sb.append("    viewProperties: ").append(toIndentedString(viewProperties)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    datasetProfile: ").append(toIndentedString(datasetProfile)).append("\n");
    sb.append("    datasetUsageStatistics: ").append(toIndentedString(datasetUsageStatistics)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    schemaMetadata: ").append(toIndentedString(schemaMetadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    siblings: ").append(toIndentedString(siblings)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    incidentsSummary: ").append(toIndentedString(incidentsSummary)).append("\n");
    sb.append("    datasetProperties: ").append(toIndentedString(datasetProperties)).append("\n");
    sb.append("    editableDatasetProperties: ").append(toIndentedString(editableDatasetProperties)).append("\n");
    sb.append("    datasetDeprecation: ").append(toIndentedString(datasetDeprecation)).append("\n");
    sb.append("    datasetUpstreamLineage: ").append(toIndentedString(datasetUpstreamLineage)).append("\n");
    sb.append("    upstreamLineage: ").append(toIndentedString(upstreamLineage)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    editableSchemaMetadata: ").append(toIndentedString(editableSchemaMetadata)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    browsePathsV2: ").append(toIndentedString(browsePathsV2)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    partitionsSummary: ").append(toIndentedString(partitionsSummary)).append("\n");
    sb.append("    versionProperties: ").append(toIndentedString(versionProperties)).append("\n");
    sb.append("    icebergCatalogInfo: ").append(toIndentedString(icebergCatalogInfo)).append("\n");
    sb.append("    logicalParent: ").append(toIndentedString(logicalParent)).append("\n");
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