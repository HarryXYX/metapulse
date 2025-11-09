package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectRequestV2;
import io.datahubproject.openapi.generated.AssetSettingsAspectRequestV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DomainsAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryRelatedTermsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermInfoAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermKeyAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.SchemaMetadataAspectRequestV2;
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
 * GlossaryTerm object.
 */
@Schema(description = "GlossaryTerm object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryTermEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("glossaryTermKey") @Builder.Default
  private GlossaryTermKeyAspectRequestV2 glossaryTermKey = null;

  @JsonProperty("glossaryTermInfo") @Builder.Default
  private GlossaryTermInfoAspectRequestV2 glossaryTermInfo = null;

  @JsonProperty("glossaryRelatedTerms") @Builder.Default
  private GlossaryRelatedTermsAspectRequestV2 glossaryRelatedTerms = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("schemaMetadata") @Builder.Default
  private SchemaMetadataAspectRequestV2 schemaMetadata = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectRequestV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectRequestV2 applications = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectRequestV2 browsePaths = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectRequestV2 assetSettings = null;

  public GlossaryTermEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for glossaryTerm
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for glossaryTerm")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public GlossaryTermEntityRequestV2 glossaryTermKey(GlossaryTermKeyAspectRequestV2 glossaryTermKey) {
    this.glossaryTermKey = glossaryTermKey;
    return this;
  }

  /**
   * Get glossaryTermKey
   * @return glossaryTermKey
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermKeyAspectRequestV2 getGlossaryTermKey() {
    return glossaryTermKey;
  }

  public void setGlossaryTermKey(GlossaryTermKeyAspectRequestV2 glossaryTermKey) {
    this.glossaryTermKey = glossaryTermKey;
  }

  public GlossaryTermEntityRequestV2 glossaryTermInfo(GlossaryTermInfoAspectRequestV2 glossaryTermInfo) {
    this.glossaryTermInfo = glossaryTermInfo;
    return this;
  }

  /**
   * Get glossaryTermInfo
   * @return glossaryTermInfo
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermInfoAspectRequestV2 getGlossaryTermInfo() {
    return glossaryTermInfo;
  }

  public void setGlossaryTermInfo(GlossaryTermInfoAspectRequestV2 glossaryTermInfo) {
    this.glossaryTermInfo = glossaryTermInfo;
  }

  public GlossaryTermEntityRequestV2 glossaryRelatedTerms(GlossaryRelatedTermsAspectRequestV2 glossaryRelatedTerms) {
    this.glossaryRelatedTerms = glossaryRelatedTerms;
    return this;
  }

  /**
   * Get glossaryRelatedTerms
   * @return glossaryRelatedTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryRelatedTermsAspectRequestV2 getGlossaryRelatedTerms() {
    return glossaryRelatedTerms;
  }

  public void setGlossaryRelatedTerms(GlossaryRelatedTermsAspectRequestV2 glossaryRelatedTerms) {
    this.glossaryRelatedTerms = glossaryRelatedTerms;
  }

  public GlossaryTermEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public GlossaryTermEntityRequestV2 schemaMetadata(SchemaMetadataAspectRequestV2 schemaMetadata) {
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

  public GlossaryTermEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public GlossaryTermEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public GlossaryTermEntityRequestV2 domains(DomainsAspectRequestV2 domains) {
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

  public GlossaryTermEntityRequestV2 applications(ApplicationsAspectRequestV2 applications) {
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

  public GlossaryTermEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public GlossaryTermEntityRequestV2 browsePaths(BrowsePathsAspectRequestV2 browsePaths) {
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

  public GlossaryTermEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public GlossaryTermEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public GlossaryTermEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public GlossaryTermEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public GlossaryTermEntityRequestV2 assetSettings(AssetSettingsAspectRequestV2 assetSettings) {
    this.assetSettings = assetSettings;
    return this;
  }

  /**
   * Get assetSettings
   * @return assetSettings
   **/
  @Schema(description = "")
  
    @Valid
    public AssetSettingsAspectRequestV2 getAssetSettings() {
    return assetSettings;
  }

  public void setAssetSettings(AssetSettingsAspectRequestV2 assetSettings) {
    this.assetSettings = assetSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryTermEntityRequestV2 glossaryTermEntityRequestV2 = (GlossaryTermEntityRequestV2) o;
    return Objects.equals(this.urn, glossaryTermEntityRequestV2.urn) &&
        Objects.equals(this.glossaryTermKey, glossaryTermEntityRequestV2.glossaryTermKey) &&
        Objects.equals(this.glossaryTermInfo, glossaryTermEntityRequestV2.glossaryTermInfo) &&
        Objects.equals(this.glossaryRelatedTerms, glossaryTermEntityRequestV2.glossaryRelatedTerms) &&
        Objects.equals(this.institutionalMemory, glossaryTermEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.schemaMetadata, glossaryTermEntityRequestV2.schemaMetadata) &&
        Objects.equals(this.ownership, glossaryTermEntityRequestV2.ownership) &&
        Objects.equals(this.deprecation, glossaryTermEntityRequestV2.deprecation) &&
        Objects.equals(this.domains, glossaryTermEntityRequestV2.domains) &&
        Objects.equals(this.applications, glossaryTermEntityRequestV2.applications) &&
        Objects.equals(this.status, glossaryTermEntityRequestV2.status) &&
        Objects.equals(this.browsePaths, glossaryTermEntityRequestV2.browsePaths) &&
        Objects.equals(this.structuredProperties, glossaryTermEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, glossaryTermEntityRequestV2.forms) &&
        Objects.equals(this.testResults, glossaryTermEntityRequestV2.testResults) &&
        Objects.equals(this.subTypes, glossaryTermEntityRequestV2.subTypes) &&
        Objects.equals(this.assetSettings, glossaryTermEntityRequestV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, glossaryTermKey, glossaryTermInfo, glossaryRelatedTerms, institutionalMemory, schemaMetadata, ownership, deprecation, domains, applications, status, browsePaths, structuredProperties, forms, testResults, subTypes, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTermEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    glossaryTermKey: ").append(toIndentedString(glossaryTermKey)).append("\n");
    sb.append("    glossaryTermInfo: ").append(toIndentedString(glossaryTermInfo)).append("\n");
    sb.append("    glossaryRelatedTerms: ").append(toIndentedString(glossaryRelatedTerms)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    schemaMetadata: ").append(toIndentedString(schemaMetadata)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    browsePaths: ").append(toIndentedString(browsePaths)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    assetSettings: ").append(toIndentedString(assetSettings)).append("\n");
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