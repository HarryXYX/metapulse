package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSettingsAspectResponseV2;
import io.datahubproject.openapi.generated.DisplayPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.DomainKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DomainPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.StructuredPropertiesAspectResponseV2;
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
 * A data domain within an organization.
 */
@Schema(description = "A data domain within an organization.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("domainKey") @Builder.Default
  private DomainKeyAspectResponseV2 domainKey = null;

  @JsonProperty("domainProperties") @Builder.Default
  private DomainPropertiesAspectResponseV2 domainProperties = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("displayProperties") @Builder.Default
  private DisplayPropertiesAspectResponseV2 displayProperties = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectResponseV2 assetSettings = null;

  public DomainEntityResponseV2 urn(String urn) {
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

  public DomainEntityResponseV2 domainKey(DomainKeyAspectResponseV2 domainKey) {
    this.domainKey = domainKey;
    return this;
  }

  /**
   * Get domainKey
   * @return domainKey
   **/
  @Schema(description = "")
  
    @Valid
    public DomainKeyAspectResponseV2 getDomainKey() {
    return domainKey;
  }

  public void setDomainKey(DomainKeyAspectResponseV2 domainKey) {
    this.domainKey = domainKey;
  }

  public DomainEntityResponseV2 domainProperties(DomainPropertiesAspectResponseV2 domainProperties) {
    this.domainProperties = domainProperties;
    return this;
  }

  /**
   * Get domainProperties
   * @return domainProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DomainPropertiesAspectResponseV2 getDomainProperties() {
    return domainProperties;
  }

  public void setDomainProperties(DomainPropertiesAspectResponseV2 domainProperties) {
    this.domainProperties = domainProperties;
  }

  public DomainEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public DomainEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public DomainEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public DomainEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public DomainEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public DomainEntityResponseV2 displayProperties(DisplayPropertiesAspectResponseV2 displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

  /**
   * Get displayProperties
   * @return displayProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DisplayPropertiesAspectResponseV2 getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DisplayPropertiesAspectResponseV2 displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DomainEntityResponseV2 assetSettings(AssetSettingsAspectResponseV2 assetSettings) {
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
    DomainEntityResponseV2 domainEntityResponseV2 = (DomainEntityResponseV2) o;
    return Objects.equals(this.urn, domainEntityResponseV2.urn) &&
        Objects.equals(this.domainKey, domainEntityResponseV2.domainKey) &&
        Objects.equals(this.domainProperties, domainEntityResponseV2.domainProperties) &&
        Objects.equals(this.institutionalMemory, domainEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.ownership, domainEntityResponseV2.ownership) &&
        Objects.equals(this.structuredProperties, domainEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, domainEntityResponseV2.forms) &&
        Objects.equals(this.testResults, domainEntityResponseV2.testResults) &&
        Objects.equals(this.displayProperties, domainEntityResponseV2.displayProperties) &&
        Objects.equals(this.assetSettings, domainEntityResponseV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, domainKey, domainProperties, institutionalMemory, ownership, structuredProperties, forms, testResults, displayProperties, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEntityResponseV2 {\n");
    
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