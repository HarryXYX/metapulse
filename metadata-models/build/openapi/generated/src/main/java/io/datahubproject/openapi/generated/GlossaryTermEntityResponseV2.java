package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationsAspectResponseV2;
import io.datahubproject.openapi.generated.AssetSettingsAspectResponseV2;
import io.datahubproject.openapi.generated.BrowsePathsAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryRelatedTermsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermInfoAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermKeyAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.SchemaMetadataAspectResponseV2;
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
 * GlossaryTerm object.
 */
@Schema(description = "GlossaryTerm object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryTermEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("glossaryTermKey") @Builder.Default
  private GlossaryTermKeyAspectResponseV2 glossaryTermKey = null;

  @JsonProperty("glossaryTermInfo") @Builder.Default
  private GlossaryTermInfoAspectResponseV2 glossaryTermInfo = null;

  @JsonProperty("glossaryRelatedTerms") @Builder.Default
  private GlossaryRelatedTermsAspectResponseV2 glossaryRelatedTerms = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("schemaMetadata") @Builder.Default
  private SchemaMetadataAspectResponseV2 schemaMetadata = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("applications") @Builder.Default
  private ApplicationsAspectResponseV2 applications = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("browsePaths") @Builder.Default
  private BrowsePathsAspectResponseV2 browsePaths = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectResponseV2 assetSettings = null;

  public GlossaryTermEntityResponseV2 urn(String urn) {
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

  public GlossaryTermEntityResponseV2 glossaryTermKey(GlossaryTermKeyAspectResponseV2 glossaryTermKey) {
    this.glossaryTermKey = glossaryTermKey;
    return this;
  }

  /**
   * Get glossaryTermKey
   * @return glossaryTermKey
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermKeyAspectResponseV2 getGlossaryTermKey() {
    return glossaryTermKey;
  }

  public void setGlossaryTermKey(GlossaryTermKeyAspectResponseV2 glossaryTermKey) {
    this.glossaryTermKey = glossaryTermKey;
  }

  public GlossaryTermEntityResponseV2 glossaryTermInfo(GlossaryTermInfoAspectResponseV2 glossaryTermInfo) {
    this.glossaryTermInfo = glossaryTermInfo;
    return this;
  }

  /**
   * Get glossaryTermInfo
   * @return glossaryTermInfo
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryTermInfoAspectResponseV2 getGlossaryTermInfo() {
    return glossaryTermInfo;
  }

  public void setGlossaryTermInfo(GlossaryTermInfoAspectResponseV2 glossaryTermInfo) {
    this.glossaryTermInfo = glossaryTermInfo;
  }

  public GlossaryTermEntityResponseV2 glossaryRelatedTerms(GlossaryRelatedTermsAspectResponseV2 glossaryRelatedTerms) {
    this.glossaryRelatedTerms = glossaryRelatedTerms;
    return this;
  }

  /**
   * Get glossaryRelatedTerms
   * @return glossaryRelatedTerms
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryRelatedTermsAspectResponseV2 getGlossaryRelatedTerms() {
    return glossaryRelatedTerms;
  }

  public void setGlossaryRelatedTerms(GlossaryRelatedTermsAspectResponseV2 glossaryRelatedTerms) {
    this.glossaryRelatedTerms = glossaryRelatedTerms;
  }

  public GlossaryTermEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public GlossaryTermEntityResponseV2 schemaMetadata(SchemaMetadataAspectResponseV2 schemaMetadata) {
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

  public GlossaryTermEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public GlossaryTermEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public GlossaryTermEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public GlossaryTermEntityResponseV2 applications(ApplicationsAspectResponseV2 applications) {
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

  public GlossaryTermEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public GlossaryTermEntityResponseV2 browsePaths(BrowsePathsAspectResponseV2 browsePaths) {
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

  public GlossaryTermEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public GlossaryTermEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public GlossaryTermEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public GlossaryTermEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public GlossaryTermEntityResponseV2 assetSettings(AssetSettingsAspectResponseV2 assetSettings) {
    this.assetSettings = assetSettings;
    return this;
  }

  /**
   * Get assetSettings
   * @return assetSettings
   **/
  @Schema(description = "")
  
    @Valid
    public AssetSettingsAspectResponseV2 getAssetSettings() {
    return assetSettings;
  }

  public void setAssetSettings(AssetSettingsAspectResponseV2 assetSettings) {
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
    GlossaryTermEntityResponseV2 glossaryTermEntityResponseV2 = (GlossaryTermEntityResponseV2) o;
    return Objects.equals(this.urn, glossaryTermEntityResponseV2.urn) &&
        Objects.equals(this.glossaryTermKey, glossaryTermEntityResponseV2.glossaryTermKey) &&
        Objects.equals(this.glossaryTermInfo, glossaryTermEntityResponseV2.glossaryTermInfo) &&
        Objects.equals(this.glossaryRelatedTerms, glossaryTermEntityResponseV2.glossaryRelatedTerms) &&
        Objects.equals(this.institutionalMemory, glossaryTermEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.schemaMetadata, glossaryTermEntityResponseV2.schemaMetadata) &&
        Objects.equals(this.ownership, glossaryTermEntityResponseV2.ownership) &&
        Objects.equals(this.deprecation, glossaryTermEntityResponseV2.deprecation) &&
        Objects.equals(this.domains, glossaryTermEntityResponseV2.domains) &&
        Objects.equals(this.applications, glossaryTermEntityResponseV2.applications) &&
        Objects.equals(this.status, glossaryTermEntityResponseV2.status) &&
        Objects.equals(this.browsePaths, glossaryTermEntityResponseV2.browsePaths) &&
        Objects.equals(this.structuredProperties, glossaryTermEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, glossaryTermEntityResponseV2.forms) &&
        Objects.equals(this.testResults, glossaryTermEntityResponseV2.testResults) &&
        Objects.equals(this.subTypes, glossaryTermEntityResponseV2.subTypes) &&
        Objects.equals(this.assetSettings, glossaryTermEntityResponseV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, glossaryTermKey, glossaryTermInfo, glossaryRelatedTerms, institutionalMemory, schemaMetadata, ownership, deprecation, domains, applications, status, browsePaths, structuredProperties, forms, testResults, subTypes, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTermEntityResponseV2 {\n");
    
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