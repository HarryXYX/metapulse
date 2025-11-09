package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSettingsAspectRequestV2;
import io.datahubproject.openapi.generated.DisplayPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryNodeInfoAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryNodeKeyAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
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
 * GlossaryNode object.
 */
@Schema(description = "GlossaryNode object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryNodeEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("glossaryNodeKey") @Builder.Default
  private GlossaryNodeKeyAspectRequestV2 glossaryNodeKey = null;

  @JsonProperty("glossaryNodeInfo") @Builder.Default
  private GlossaryNodeInfoAspectRequestV2 glossaryNodeInfo = null;

  @JsonProperty("institutionalMemory") @Builder.Default
  private InstitutionalMemoryAspectRequestV2 institutionalMemory = null;

  @JsonProperty("ownership") @Builder.Default
  private OwnershipAspectRequestV2 ownership = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("displayProperties") @Builder.Default
  private DisplayPropertiesAspectRequestV2 displayProperties = null;

  @JsonProperty("assetSettings") @Builder.Default
  private AssetSettingsAspectRequestV2 assetSettings = null;

  public GlossaryNodeEntityRequestV2 urn(String urn) {
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

  public GlossaryNodeEntityRequestV2 glossaryNodeKey(GlossaryNodeKeyAspectRequestV2 glossaryNodeKey) {
    this.glossaryNodeKey = glossaryNodeKey;
    return this;
  }

  /**
   * Get glossaryNodeKey
   * @return glossaryNodeKey
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryNodeKeyAspectRequestV2 getGlossaryNodeKey() {
    return glossaryNodeKey;
  }

  public void setGlossaryNodeKey(GlossaryNodeKeyAspectRequestV2 glossaryNodeKey) {
    this.glossaryNodeKey = glossaryNodeKey;
  }

  public GlossaryNodeEntityRequestV2 glossaryNodeInfo(GlossaryNodeInfoAspectRequestV2 glossaryNodeInfo) {
    this.glossaryNodeInfo = glossaryNodeInfo;
    return this;
  }

  /**
   * Get glossaryNodeInfo
   * @return glossaryNodeInfo
   **/
  @Schema(description = "")
  
    @Valid
    public GlossaryNodeInfoAspectRequestV2 getGlossaryNodeInfo() {
    return glossaryNodeInfo;
  }

  public void setGlossaryNodeInfo(GlossaryNodeInfoAspectRequestV2 glossaryNodeInfo) {
    this.glossaryNodeInfo = glossaryNodeInfo;
  }

  public GlossaryNodeEntityRequestV2 institutionalMemory(InstitutionalMemoryAspectRequestV2 institutionalMemory) {
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

  public GlossaryNodeEntityRequestV2 ownership(OwnershipAspectRequestV2 ownership) {
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

  public GlossaryNodeEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public GlossaryNodeEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public GlossaryNodeEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public GlossaryNodeEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public GlossaryNodeEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public GlossaryNodeEntityRequestV2 displayProperties(DisplayPropertiesAspectRequestV2 displayProperties) {
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

  public GlossaryNodeEntityRequestV2 assetSettings(AssetSettingsAspectRequestV2 assetSettings) {
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
    GlossaryNodeEntityRequestV2 glossaryNodeEntityRequestV2 = (GlossaryNodeEntityRequestV2) o;
    return Objects.equals(this.urn, glossaryNodeEntityRequestV2.urn) &&
        Objects.equals(this.glossaryNodeKey, glossaryNodeEntityRequestV2.glossaryNodeKey) &&
        Objects.equals(this.glossaryNodeInfo, glossaryNodeEntityRequestV2.glossaryNodeInfo) &&
        Objects.equals(this.institutionalMemory, glossaryNodeEntityRequestV2.institutionalMemory) &&
        Objects.equals(this.ownership, glossaryNodeEntityRequestV2.ownership) &&
        Objects.equals(this.status, glossaryNodeEntityRequestV2.status) &&
        Objects.equals(this.structuredProperties, glossaryNodeEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, glossaryNodeEntityRequestV2.forms) &&
        Objects.equals(this.testResults, glossaryNodeEntityRequestV2.testResults) &&
        Objects.equals(this.subTypes, glossaryNodeEntityRequestV2.subTypes) &&
        Objects.equals(this.displayProperties, glossaryNodeEntityRequestV2.displayProperties) &&
        Objects.equals(this.assetSettings, glossaryNodeEntityRequestV2.assetSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, glossaryNodeKey, glossaryNodeInfo, institutionalMemory, ownership, status, structuredProperties, forms, testResults, subTypes, displayProperties, assetSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryNodeEntityRequestV2 {\n");
    
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