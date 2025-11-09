package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSettingsAspectResponseV2;
import io.datahubproject.openapi.generated.DisplayPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryNodeInfoAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryNodeKeyAspectResponseV2;
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
 * GlossaryNode object.
 */
@Schema(description = "GlossaryNode object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryNodeEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("glossaryNodeKey") @Builder.Default
  private GlossaryNodeKeyAspectResponseV2 glossaryNodeKey = null;

  @JsonProperty("glossaryNodeInfo") @Builder.Default
  private GlossaryNodeInfoAspectResponseV2 glossaryNodeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectResponseV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectResponseV2 ownership = null;

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

  @JsonProperty("displayProperties") @Builder.Default
  private DisplayPropertiesAspectResponseV2 displayProperties = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectResponseV2 assetSettings = null;

  public GlossaryNodeEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for glossaryNode
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for glossaryNode")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public GlossaryNodeEntityResponseV2 glossaryNodeKey(GlossaryNodeKeyAspectResponseV2 glossaryNodeKey) {
    this.glossaryNodeKey = glossaryNodeKey;
    return this;
  }

  /**
   * Get glossaryNodeKey
   * @return glossaryNodeKey
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryNodeKeyAspectResponseV2 getGlossaryNodeKey() {
    return glossaryNodeKey;
  }

  public void setGlossaryNodeKey(GlossaryNodeKeyAspectResponseV2 glossaryNodeKey) {
    this.glossaryNodeKey = glossaryNodeKey;
  }

  public GlossaryNodeEntityResponseV2 glossaryNodeInfo(GlossaryNodeInfoAspectResponseV2 glossaryNodeInfo) {
    this.glossaryNodeInfo = glossaryNodeInfo;
    return this;
  }

  /**
   * Get glossaryNodeInfo
   * @return glossaryNodeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryNodeInfoAspectResponseV2 getGlossaryNodeInfo() {
    return glossaryNodeInfo;
  }

  public void setGlossaryNodeInfo(GlossaryNodeInfoAspectResponseV2 glossaryNodeInfo) {
    this.glossaryNodeInfo = glossaryNodeInfo;
  }

  public GlossaryNodeEntityResponseV2 institutionalMemory(InstitutionalMemoryAspectResponseV2 institutionalMemory) {
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

  public GlossaryNodeEntityResponseV2 ownership(OwnershipAspectResponseV2 ownership) {
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

  public GlossaryNodeEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public GlossaryNodeEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public GlossaryNodeEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public GlossaryNodeEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public GlossaryNodeEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public GlossaryNodeEntityResponseV2 displayProperties(DisplayPropertiesAspectResponseV2 displayProperties) {
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

  public GlossaryNodeEntityResponseV2 assetSettings(AssetSettingsAspectResponseV2 assetSettings) {
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
    GlossaryNodeEntityResponseV2 glossaryNodeEntityResponseV2 = (GlossaryNodeEntityResponseV2) o;
    return Objects.equals(this.urn, glossaryNodeEntityResponseV2.urn) &&
        Objects.equals(this.glossaryNodeKey, glossaryNodeEntityResponseV2.glossaryNodeKey) &&
        Objects.equals(this.glossaryNodeInfo, glossaryNodeEntityResponseV2.glossaryNodeInfo) &&
        Objects.equals(this.institutionalMemory, glossaryNodeEntityResponseV2.institutionalMemory) &&
        Objects.equals(this.ownership, glossaryNodeEntityResponseV2.ownership) &&
        Objects.equals(this.status, glossaryNodeEntityResponseV2.status) &&
        Objects.equals(this.structuredProperties, glossaryNodeEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, glossaryNodeEntityResponseV2.forms) &&
        Objects.equals(this.testResults, glossaryNodeEntityResponseV2.testResults) &&
        Objects.equals(this.subTypes, glossaryNodeEntityResponseV2.subTypes) &&
        Objects.equals(this.displayProperties, glossaryNodeEntityResponseV2.displayProperties) &&
        Objects.equals(this.assetSettings, glossaryNodeEntityResponseV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, glossaryNodeKey, glossaryNodeInfo, institutionalMemory, ownership, status, structuredProperties, forms, testResults, subTypes, displayProperties, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryNodeEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    glossaryNodeKey: ").append(toIndentedString(glossaryNodeKey)).append("\n");
    sb.append("    glossaryNodeInfo: ").append(toIndentedString(glossaryNodeInfo)).append("\n");
    sb.append("    institutionalMemory: ").append(toIndentedString(institutionalMemory)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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