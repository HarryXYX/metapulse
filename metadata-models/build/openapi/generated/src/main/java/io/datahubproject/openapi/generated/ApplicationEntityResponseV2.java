package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ApplicationKeyAspectResponseV2;
import io.datahubproject.openapi.generated.ApplicationPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.DomainsAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
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
 * Application object.
 */
@Schema(description = "Application object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("applicationKey") @Builder.Default
  private ApplicationKeyAspectResponseV2 applicationKey = null;

  @JsonProperty("applicationProperties") @Builder.Default
  private ApplicationPropertiesAspectResponseV2 applicationProperties = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("domains") @Builder.Default
  private DomainsAspectResponseV2 domains = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  public ApplicationEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for application
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for application")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public ApplicationEntityResponseV2 applicationKey(ApplicationKeyAspectResponseV2 applicationKey) {
    this.applicationKey = applicationKey;
    return this;
  }

  /**
   * Get applicationKey
   * @return applicationKey
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationKeyAspectResponseV2 getApplicationKey() {
    return applicationKey;
  }

  public void setApplicationKey(ApplicationKeyAspectResponseV2 applicationKey) {
    this.applicationKey = applicationKey;
  }

  public ApplicationEntityResponseV2 applicationProperties(ApplicationPropertiesAspectResponseV2 applicationProperties) {
    this.applicationProperties = applicationProperties;
    return this;
  }

  /**
   * Get applicationProperties
   * @return applicationProperties
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationPropertiesAspectResponseV2 getApplicationProperties() {
    return applicationProperties;
  }

  public void setApplicationProperties(ApplicationPropertiesAspectResponseV2 applicationProperties) {
    this.applicationProperties = applicationProperties;
  }

  public ApplicationEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public ApplicationEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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

  public ApplicationEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public ApplicationEntityResponseV2 domains(DomainsAspectResponseV2 domains) {
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

  public ApplicationEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public ApplicationEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public ApplicationEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public ApplicationEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public ApplicationEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public ApplicationEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationEntityResponseV2 applicationEntityResponseV2 = (ApplicationEntityResponseV2) o;
    return Objects.equals(this.urn, applicationEntityResponseV2.urn) &&
        Objects.equals(this.applicationKey, applicationEntityResponseV2.applicationKey) &&
        Objects.equals(this.applicationProperties, applicationEntityResponseV2.applicationProperties) &&
        Objects.equals(this.ownership, applicationEntityResponseV2.ownership) &&
        Objects.equals(this.glossaryTerms, applicationEntityResponseV2.glossaryTerms) &&
        Objects.equals(this.globalTags, applicationEntityResponseV2.globalTags) &&
        Objects.equals(this.domains, applicationEntityResponseV2.domains) &&
        Objects.equals(this.institutionalMemory, applicationEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.status, applicationEntityResponseV2.status) &&
        Objects.equals(this.structuredProperties, applicationEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, applicationEntityResponseV2.forms) &&
        Objects.equals(this.testResults, applicationEntityResponseV2.testResults) &&
        Objects.equals(this.subTypes, applicationEntityResponseV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, applicationKey, applicationProperties, ownership, glossaryTerms, globalTags, domains, institutionalMemory, status, structuredProperties, forms, testResults, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    applicationProperties: ").append(toIndentedString(applicationProperties)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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