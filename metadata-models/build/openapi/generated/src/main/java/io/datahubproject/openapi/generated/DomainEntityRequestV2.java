package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSettingsAspectRequestV2;
import io.datahubproject.openapi.generated.DisplayPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.DomainKeyAspectRequestV2;
import io.datahubproject.openapi.generated.DomainPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectRequestV2;
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
 * A data domain within an organization.
 */
@Schema(description = "A data domain within an organization.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("domainKey") @Builder.Default
  private DomainKeyAspectRequestV2 domainKey = null;

  @JsonProperty("domainProperties") @Builder.Default
  private DomainPropertiesAspectRequestV2 domainProperties = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("displayProperties") @Builder.Default
  private DisplayPropertiesAspectRequestV2 displayProperties = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectRequestV2 assetSettings = null;

  public DomainEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for domain
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for domain")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DomainEntityRequestV2 domainKey(DomainKeyAspectRequestV2 domainKey) {
    this.domainKey = domainKey;
    return this;
  }

  /**
   * Get domainKey
   * @return domainKey
   **/
  @Schema(description = "")
  
    @Valid
    public DomainKeyAspectRequestV2 getDomainKey() {
    return domainKey;
  }

  public void setDomainKey(DomainKeyAspectRequestV2 domainKey) {
    this.domainKey = domainKey;
  }

  public DomainEntityRequestV2 domainProperties(DomainPropertiesAspectRequestV2 domainProperties) {
    this.domainProperties = domainProperties;
    return this;
  }

  /**
   * Get domainProperties
   * @return domainProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DomainPropertiesAspectRequestV2 getDomainProperties() {
    return domainProperties;
  }

  public void setDomainProperties(DomainPropertiesAspectRequestV2 domainProperties) {
    this.domainProperties = domainProperties;
  }

  public DomainEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public DomainEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public DomainEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public DomainEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public DomainEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public DomainEntityRequestV2 displayProperties(DisplayPropertiesAspectRequestV2 displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

  /**
   * Get displayProperties
   * @return displayProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DisplayPropertiesAspectRequestV2 getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DisplayPropertiesAspectRequestV2 displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DomainEntityRequestV2 assetSettings(AssetSettingsAspectRequestV2 assetSettings) {
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
    DomainEntityRequestV2 domainEntityRequestV2 = (DomainEntityRequestV2) o;
    return Objects.equals(this.urn, domainEntityRequestV2.urn) &&
        Objects.equals(this.domainKey, domainEntityRequestV2.domainKey) &&
        Objects.equals(this.domainProperties, domainEntityRequestV2.domainProperties) &&
        Objects.equals(this.institutionalMemory, domainEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.ownership, domainEntityRequestV2.ownership) &&
        Objects.equals(this.structuredProperties, domainEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, domainEntityRequestV2.forms) &&
        Objects.equals(this.testResults, domainEntityRequestV2.testResults) &&
        Objects.equals(this.displayProperties, domainEntityRequestV2.displayProperties) &&
        Objects.equals(this.assetSettings, domainEntityRequestV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, domainKey, domainProperties, institutionalMemory, ownership, structuredProperties, forms, testResults, displayProperties, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    domainKey: ").append(toIndentedString(domainKey)).append("\n");
    sb.append("    domainProperties: ").append(toIndentedString(domainProperties)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
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