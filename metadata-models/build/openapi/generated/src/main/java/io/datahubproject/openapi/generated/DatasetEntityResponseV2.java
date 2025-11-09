package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AccessAspectResponseV2;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsV2AspectResponseV2;
import io.datahubproject.openapi.generated.ContainerAspectResponseV2;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetDeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetProfileAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetUpstreamLineageAspectResponseV2;
import io.datahubproject.openapi.generated.DatasetUsageStatisticsAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.EditableDatasetPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.EditableSchemaMetadataAspectResponseV2;
import io.datahubproject.openapi.generated.EmbedAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.IcebergCatalogInfoAspectResponseV2;
import io.datahubproject.openapi.generated.IncidentsSummaryAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.LogicalParentAspectResponseV2;
import io.datahubproject.openapi.generated.OperationAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.PartitionsSummaryAspectResponseV2;
import io.datahubproject.openapi.generated.SchemaMetadataAspectResponseV2;
import io.datahubproject.openapi.generated.SiblingsAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
import io.datahubproject.openapi.generated.TestResultsAspectResponseV2;
import io.datahubproject.openapi.generated.UpstreamLineageAspectResponseV2;
import io.datahubproject.openapi.generated.VersionPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.ViewPropertiesAspectResponseV2;
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
public class DatasetEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("datasetKey") @Builder.Default
  private DatasetKeyAspectResponseV2 datasetKey = null;

  @JsonProperty("viewProperties") @Builder.Default
  private ViewPropertiesAspectResponseV2 viewProperties = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("datasetProfile") @Builder.Default
  private DatasetProfileAspectResponseV2 datasetProfile = null;

  @JsonProperty("datasetUsageStatistics") @Builder.Default
  private DatasetUsageStatisticsAspectResponseV2 datasetUsageStatistics = null;

  @JsonProperty("operation") @Builder.Default
  private OperationAspectResponseV2 operation = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("schemaMetadata") @Builder.Default
  private SchemaMetadataAspectResponseV2 schemaMetadata = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("container") @Builder.Default
  private ContainerAspectResponseV2 container = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("siblings") @Builder.Default
  private SiblingsAspectResponseV2 siblings = null;

  @JsonProperty("embed") @Builder.Default
  private EmbedAspectResponseV2 embed = null;

  @JsonProperty("incidentsSummary") @Builder.Default
  private IncidentsSummaryAspectResponseV2 incidentsSummary = null;

  @JsonProperty("datasetProperties") @Builder.Default
  private DatasetPropertiesAspectResponseV2 datasetProperties = null;

  @JsonProperty("editableDatasetProperties") @Builder.Default
  private EditableDatasetPropertiesAspectResponseV2 editableDatasetProperties = null;

  @JsonProperty("datasetDeprecation") @Builder.Default
  private DatasetDeprecationAspectResponseV2 datasetDeprecation = null;

  @JsonProperty("datasetUpstreamLineage") @Builder.Default
  private DatasetUpstreamLineageAspectResponseV2 datasetUpstreamLineage = null;

  @JsonProperty("upstreamLineage") @Builder.Default
  private UpstreamLineageAspectResponseV2 upstreamLineage = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("editableSchemaMetadata") @Builder.Default
  private EditableSchemaMetadataAspectResponseV2 editableSchemaMetadata = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectResponseV2 browsePaths = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("browsePathsV2") @Builder.Default
  private BrowsePathsV2AspectResponseV2 browsePathsV2 = null;

  @JsonProperty("access") @Builder.Default
  private AccessAspectResponseV2 access = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("partitionsSummary") @Builder.Default
  private PartitionsSummaryAspectResponseV2 partitionsSummary = null;

  @JsonProperty("versionProperties") @Builder.Default
  private VersionPropertiesAspectResponseV2 versionProperties = null;

  @JsonProperty("icebergCatalogInfo") @Builder.Default
  private IcebergCatalogInfoAspectResponseV2 icebergCatalogInfo = null;

  @JsonProperty("logicalParent") @Builder.Default
  private LogicalParentAspectResponseV2 logicalParent = null;

  public DatasetEntityResponseV2 urn(String urn) {
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

  public DatasetEntityResponseV2 datasetKey(DatasetKeyAspectResponseV2 datasetKey) {
    this.datasetKey = datasetKey;
    return this;
  }

  /**
   * Get datasetKey
   * @return datasetKey
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetKeyAspectResponseV2 getDatasetKey() {
    return datasetKey;
  }

  public void setDatasetKey(DatasetKeyAspectResponseV2 datasetKey) {
    this.datasetKey = datasetKey;
  }

  public DatasetEntityResponseV2 viewProperties(ViewPropertiesAspectResponseV2 viewProperties) {
    this.viewProperties = viewProperties;
    return this;
  }

  /**
   * Get viewProperties
   * @return viewProperties
   **/
  @Schema(description = "")
  
    @Valid
    public ViewPropertiesAspectResponseV2 getViewProperties() {
    return viewProperties;
  }

  public void setViewProperties(ViewPropertiesAspectResponseV2 viewProperties) {
    this.viewProperties = viewProperties;
  }

  public DatasetEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public DatasetEntityResponseV2 datasetProfile(DatasetProfileAspectResponseV2 datasetProfile) {
    this.datasetProfile = datasetProfile;
    return this;
  }

  /**
   * Get datasetProfile
   * @return datasetProfile
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetProfileAspectResponseV2 getDatasetProfile() {
    return datasetProfile;
  }

  public void setDatasetProfile(DatasetProfileAspectResponseV2 datasetProfile) {
    this.datasetProfile = datasetProfile;
  }

  public DatasetEntityResponseV2 datasetUsageStatistics(DatasetUsageStatisticsAspectResponseV2 datasetUsageStatistics) {
    this.datasetUsageStatistics = datasetUsageStatistics;
    return this;
  }

  /**
   * Get datasetUsageStatistics
   * @return datasetUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetUsageStatisticsAspectResponseV2 getDatasetUsageStatistics() {
    return datasetUsageStatistics;
  }

  public void setDatasetUsageStatistics(DatasetUsageStatisticsAspectResponseV2 datasetUsageStatistics) {
    this.datasetUsageStatistics = datasetUsageStatistics;
  }

  public DatasetEntityResponseV2 operation(OperationAspectResponseV2 operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @Schema(description = "")
  
    @Valid
    public OperationAspectResponseV2 getOperation() {
    return operation;
  }

  public void setOperation(OperationAspectResponseV2 operation) {
    this.operation = operation;
  }

  public DatasetEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public DatasetEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
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

  public DatasetEntityResponseV2 schemaMetadata(SchemaMetadataAspectResponseV2 schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
    return this;
  }

  /**
   * Get schemaMetadata
   * @return schemaMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaMetadataAspectResponseV2 getSchemaMetadata() {
    return schemaMetadata;
  }

  public void setSchemaMetadata(SchemaMetadataAspectResponseV2 schemaMetadata) {
    this.schemaMetadata = schemaMetadata;
  }

  public DatasetEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public DatasetEntityResponseV2 container(ContainerAspectResponseV2 container) {
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

  public DatasetEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public DatasetEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public DatasetEntityResponseV2 siblings(SiblingsAspectResponseV2 siblings) {
    this.siblings = siblings;
    return this;
  }

  /**
   * Get siblings
   * @return siblings
   **/
  @Schema(description = "")
  
    @Valid
    public SiblingsAspectResponseV2 getSiblings() {
    return siblings;
  }

  public void setSiblings(SiblingsAspectResponseV2 siblings) {
    this.siblings = siblings;
  }

  public DatasetEntityResponseV2 embed(EmbedAspectResponseV2 embed) {
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

  public DatasetEntityResponseV2 incidentsSummary(IncidentsSummaryAspectResponseV2 incidentsSummary) {
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

  public DatasetEntityResponseV2 datasetProperties(DatasetPropertiesAspectResponseV2 datasetProperties) {
    this.datasetProperties = datasetProperties;
    return this;
  }

  /**
   * Get datasetProperties
   * @return datasetProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetPropertiesAspectResponseV2 getDatasetProperties() {
    return datasetProperties;
  }

  public void setDatasetProperties(DatasetPropertiesAspectResponseV2 datasetProperties) {
    this.datasetProperties = datasetProperties;
  }

  public DatasetEntityResponseV2 editableDatasetProperties(EditableDatasetPropertiesAspectResponseV2 editableDatasetProperties) {
    this.editableDatasetProperties = editableDatasetProperties;
    return this;
  }

  /**
   * Get editableDatasetProperties
   * @return editableDatasetProperties
   **/
  @Schema(description = "")
  
    @Valid
    public EditableDatasetPropertiesAspectResponseV2 getEditableDatasetProperties() {
    return editableDatasetProperties;
  }

  public void setEditableDatasetProperties(EditableDatasetPropertiesAspectResponseV2 editableDatasetProperties) {
    this.editableDatasetProperties = editableDatasetProperties;
  }

  public DatasetEntityResponseV2 datasetDeprecation(DatasetDeprecationAspectResponseV2 datasetDeprecation) {
    this.datasetDeprecation = datasetDeprecation;
    return this;
  }

  /**
   * Get datasetDeprecation
   * @return datasetDeprecation
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetDeprecationAspectResponseV2 getDatasetDeprecation() {
    return datasetDeprecation;
  }

  public void setDatasetDeprecation(DatasetDeprecationAspectResponseV2 datasetDeprecation) {
    this.datasetDeprecation = datasetDeprecation;
  }

  public DatasetEntityResponseV2 datasetUpstreamLineage(DatasetUpstreamLineageAspectResponseV2 datasetUpstreamLineage) {
    this.datasetUpstreamLineage = datasetUpstreamLineage;
    return this;
  }

  /**
   * Get datasetUpstreamLineage
   * @return datasetUpstreamLineage
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetUpstreamLineageAspectResponseV2 getDatasetUpstreamLineage() {
    return datasetUpstreamLineage;
  }

  public void setDatasetUpstreamLineage(DatasetUpstreamLineageAspectResponseV2 datasetUpstreamLineage) {
    this.datasetUpstreamLineage = datasetUpstreamLineage;
  }

  public DatasetEntityResponseV2 upstreamLineage(UpstreamLineageAspectResponseV2 upstreamLineage) {
    this.upstreamLineage = upstreamLineage;
    return this;
  }

  /**
   * Get upstreamLineage
   * @return upstreamLineage
   **/
  @Schema(description = "")
  
    @Valid
    public UpstreamLineageAspectResponseV2 getUpstreamLineage() {
    return upstreamLineage;
  }

  public void setUpstreamLineage(UpstreamLineageAspectResponseV2 upstreamLineage) {
    this.upstreamLineage = upstreamLineage;
  }

  public DatasetEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public DatasetEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public DatasetEntityResponseV2 editableSchemaMetadata(EditableSchemaMetadataAspectResponseV2 editableSchemaMetadata) {
    this.editableSchemaMetadata = editableSchemaMetadata;
    return this;
  }

  /**
   * Get editableSchemaMetadata
   * @return editableSchemaMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public EditableSchemaMetadataAspectResponseV2 getEditableSchemaMetadata() {
    return editableSchemaMetadata;
  }

  public void setEditableSchemaMetadata(EditableSchemaMetadataAspectResponseV2 editableSchemaMetadata) {
    this.editableSchemaMetadata = editableSchemaMetadata;
  }

  public DatasetEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public DatasetEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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

  public DatasetEntityResponseV2 browsePaths(BrowsePathsAspectResponseV2 browsePaths) {
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

  public DatasetEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
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

  public DatasetEntityResponseV2 browsePathsV2(BrowsePathsV2AspectResponseV2 browsePathsV2) {
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

  public DatasetEntityResponseV2 access(AccessAspectResponseV2 access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   **/
  @Schema(description = "")
  
    @Valid
    public AccessAspectResponseV2 getAccess() {
    return access;
  }

  public void setAccess(AccessAspectResponseV2 access) {
    this.access = access;
  }

  public DatasetEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public DatasetEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public DatasetEntityResponseV2 partitionsSummary(PartitionsSummaryAspectResponseV2 partitionsSummary) {
    this.partitionsSummary = partitionsSummary;
    return this;
  }

  /**
   * Get partitionsSummary
   * @return partitionsSummary
   **/
  @Schema(description = "")
  
    @Valid
    public PartitionsSummaryAspectResponseV2 getPartitionsSummary() {
    return partitionsSummary;
  }

  public void setPartitionsSummary(PartitionsSummaryAspectResponseV2 partitionsSummary) {
    this.partitionsSummary = partitionsSummary;
  }

  public DatasetEntityResponseV2 versionProperties(VersionPropertiesAspectResponseV2 versionProperties) {
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

  public DatasetEntityResponseV2 icebergCatalogInfo(IcebergCatalogInfoAspectResponseV2 icebergCatalogInfo) {
    this.icebergCatalogInfo = icebergCatalogInfo;
    return this;
  }

  /**
   * Get icebergCatalogInfo
   * @return icebergCatalogInfo
   **/
  @Schema(description = "")
  
    @Valid
    public IcebergCatalogInfoAspectResponseV2 getIcebergCatalogInfo() {
    return icebergCatalogInfo;
  }

  public void setIcebergCatalogInfo(IcebergCatalogInfoAspectResponseV2 icebergCatalogInfo) {
    this.icebergCatalogInfo = icebergCatalogInfo;
  }

  public DatasetEntityResponseV2 logicalParent(LogicalParentAspectResponseV2 logicalParent) {
    this.logicalParent = logicalParent;
    return this;
  }

  /**
   * Get logicalParent
   * @return logicalParent
   **/
  @Schema(description = "")
  
    @Valid
    public LogicalParentAspectResponseV2 getLogicalParent() {
    return logicalParent;
  }

  public void setLogicalParent(LogicalParentAspectResponseV2 logicalParent) {
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
    DatasetEntityResponseV2 datasetEntityResponseV2 = (DatasetEntityResponseV2) o;
    return Objects.equals(this.urn, datasetEntityResponseV2.urn) &&
        Objects.equals(this.datasetKey, datasetEntityResponseV2.datasetKey) &&
        Objects.equals(this.viewProperties, datasetEntityResponseV2.viewProperties) &&
        Objects.equals(this.subTypes, datasetEntityResponseV2.subTypes) &&
        Objects.equals(this.datasetProfile, datasetEntityResponseV2.datasetProfile) &&
        Objects.equals(this.datasetUsageStatistics, datasetEntityResponseV2.datasetUsageStatistics) &&
        Objects.equals(this.operation, datasetEntityResponseV2.operation) &&
        Objects.equals(this.domains, datasetEntityResponseV2.domains) &&
        Objects.equals(this.applications, datasetEntityResponseV2.applications) &&
        Objects.equals(this.schemaMetadata, datasetEntityResponseV2.schemaMetadata) &&
        Objects.equals(this.status, datasetEntityResponseV2.status) &&
        Objects.equals(this.container, datasetEntityResponseV2.container) &&
        Objects.equals(this.deprecation, datasetEntityResponseV2.deprecation) &&
        Objects.equals(this.testResults, datasetEntityResponseV2.testResults) &&
        Objects.equals(this.siblings, datasetEntityResponseV2.siblings) &&
        Objects.equals(this.embed, datasetEntityResponseV2.embed) &&
        Objects.equals(this.incidentsSummary, datasetEntityResponseV2.incidentsSummary) &&
        Objects.equals(this.datasetProperties, datasetEntityResponseV2.datasetProperties) &&
        Objects.equals(this.editableDatasetProperties, datasetEntityResponseV2.editableDatasetProperties) &&
        Objects.equals(this.datasetDeprecation, datasetEntityResponseV2.datasetDeprecation) &&
        Objects.equals(this.datasetUpstreamLineage, datasetEntityResponseV2.datasetUpstreamLineage) &&
        Objects.equals(this.upstreamLineage, datasetEntityResponseV2.upstreamLineage) &&
        Objects.equals(this.institutionalMemory, datasetEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.ownership, datasetEntityResponseV2.ownership) &&
        Objects.equals(this.editableSchemaMetadata, datasetEntityResponseV2.editableSchemaMetadata) &&
        Objects.equals(this.globalTags, datasetEntityResponseV2.globalTags) &&
        Objects.equals(this.glossaryTerms, datasetEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.browsePaths, datasetEntityResponseV2.browsePaths) &&
        Objects.equals(this.dataPlatformInstance, datasetEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.browsePathsV2, datasetEntityResponseV2.browsePathsV2) &&
        Objects.equals(this.access, datasetEntityResponseV2.access) &&
        Objects.equals(this.structuredProperties, datasetEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, datasetEntityResponseV2.forms) &&
        Objects.equals(this.partitionsSummary, datasetEntityResponseV2.partitionsSummary) &&
        Objects.equals(this.versionProperties, datasetEntityResponseV2.versionProperties) &&
        Objects.equals(this.icebergCatalogInfo, datasetEntityResponseV2.icebergCatalogInfo) &&
        Objects.equals(this.logicalParent, datasetEntityResponseV2.logicalParent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, datasetKey, viewProperties, subTypes, datasetProfile, datasetUsageStatistics, operation, domains, applications, schemaMetadata, status, container, deprecation, testResults, siblings, embed, incidentsSummary, datasetProperties, editableDatasetProperties, datasetDeprecation, datasetUpstreamLineage, upstreamLineage, institutionalMemory, ownership, editableSchemaMetadata, globalTags, glossaryTerms, browsePaths, dataPlatformInstance, browsePathsV2, access, structuredProperties, forms, partitionsSummary, versionProperties, icebergCatalogInfo, logicalParent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetEntityResponseV2 {\n");
    
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