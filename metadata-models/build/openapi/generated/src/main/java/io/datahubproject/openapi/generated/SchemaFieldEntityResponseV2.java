package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BusinessAttributesAspectResponseV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.DocumentationAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.LogicalParentAspectResponseV2;
import io.datahubproject.openapi.generated.SchemaFieldAliasesAspectResponseV2;
import io.datahubproject.openapi.generated.SchemaFieldKeyAspectResponseV2;
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
 * SchemaField object.
 */
@Schema(description = "SchemaField object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaFieldEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("schemaFieldKey") @Builder.Default
  private SchemaFieldKeyAspectResponseV2 schemaFieldKey = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectResponseV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectResponseV2 forms = null;

  @JsonProperty("businessAttributes") @Builder.Default
  private BusinessAttributesAspectResponseV2 businessAttributes = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("schemaFieldAliases") @Builder.Default
  private SchemaFieldAliasesAspectResponseV2 schemaFieldAliases = null;

  @JsonProperty("documentation") @Builder.Default
  private DocumentationAspectResponseV2 documentation = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectResponseV2 testResults = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectResponseV2 deprecation = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  @JsonProperty("logicalParent") @Builder.Default
  private LogicalParentAspectResponseV2 logicalParent = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectResponseV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectResponseV2 glossaryTerms = null;

  public SchemaFieldEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for schemaField
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for schemaField")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public SchemaFieldEntityResponseV2 schemaFieldKey(SchemaFieldKeyAspectResponseV2 schemaFieldKey) {
    this.schemaFieldKey = schemaFieldKey;
    return this;
  }

  /**
   * Get schemaFieldKey
   * @return schemaFieldKey
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaFieldKeyAspectResponseV2 getSchemaFieldKey() {
    return schemaFieldKey;
  }

  public void setSchemaFieldKey(SchemaFieldKeyAspectResponseV2 schemaFieldKey) {
    this.schemaFieldKey = schemaFieldKey;
  }

  public SchemaFieldEntityResponseV2 structuredProperties(StructuredPropertiesAspectResponseV2 structuredProperties) {
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

  public SchemaFieldEntityResponseV2 forms(FormsAspectResponseV2 forms) {
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

  public SchemaFieldEntityResponseV2 businessAttributes(BusinessAttributesAspectResponseV2 businessAttributes) {
    this.businessAttributes = businessAttributes;
    return this;
  }

  /**
   * Get businessAttributes
   * @return businessAttributes
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributesAspectResponseV2 getBusinessAttributes() {
    return businessAttributes;
  }

  public void setBusinessAttributes(BusinessAttributesAspectResponseV2 businessAttributes) {
    this.businessAttributes = businessAttributes;
  }

  public SchemaFieldEntityResponseV2 status(StatusAspectResponseV2 status) {
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

  public SchemaFieldEntityResponseV2 schemaFieldAliases(SchemaFieldAliasesAspectResponseV2 schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
    return this;
  }

  /**
   * Get schemaFieldAliases
   * @return schemaFieldAliases
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaFieldAliasesAspectResponseV2 getSchemaFieldAliases() {
    return schemaFieldAliases;
  }

  public void setSchemaFieldAliases(SchemaFieldAliasesAspectResponseV2 schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
  }

  public SchemaFieldEntityResponseV2 documentation(DocumentationAspectResponseV2 documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
   **/
  @Schema(description = "")
  
    @Valid
    public DocumentationAspectResponseV2 getDocumentation() {
    return documentation;
  }

  public void setDocumentation(DocumentationAspectResponseV2 documentation) {
    this.documentation = documentation;
  }

  public SchemaFieldEntityResponseV2 testResults(TestResultsAspectResponseV2 testResults) {
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

  public SchemaFieldEntityResponseV2 deprecation(DeprecationAspectResponseV2 deprecation) {
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

  public SchemaFieldEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
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

  public SchemaFieldEntityResponseV2 logicalParent(LogicalParentAspectResponseV2 logicalParent) {
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

  public SchemaFieldEntityResponseV2 globalTags(GlobalTagsAspectResponseV2 globalTags) {
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

  public SchemaFieldEntityResponseV2 glossaryTerms(GlossaryTermsAspectResponseV2 glossaryTerms) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaFieldEntityResponseV2 schemaFieldEntityResponseV2 = (SchemaFieldEntityResponseV2) o;
    return Objects.equals(this.urn, schemaFieldEntityResponseV2.urn) &&
        Objects.equals(this.schemaFieldKey, schemaFieldEntityResponseV2.schemaFieldKey) &&
        Objects.equals(this.structuredProperties, schemaFieldEntityResponseV2.structuredProperties) &&
        Objects.equals(this.forms, schemaFieldEntityResponseV2.forms) &&
        Objects.equals(this.businessAttributes, schemaFieldEntityResponseV2.businessAttributes) &&
        Objects.equals(this.status, schemaFieldEntityResponseV2.status) &&
        Objects.equals(this.schemaFieldAliases, schemaFieldEntityResponseV2.schemaFieldAliases) &&
        Objects.equals(this.documentation, schemaFieldEntityResponseV2.documentation) &&
        Objects.equals(this.testResults, schemaFieldEntityResponseV2.testResults) &&
        Objects.equals(this.deprecation, schemaFieldEntityResponseV2.deprecation) &&
        Objects.equals(this.subTypes, schemaFieldEntityResponseV2.subTypes) &&
        Objects.equals(this.logicalParent, schemaFieldEntityResponseV2.logicalParent) &&
        Objects.equals(this.globalTags, schemaFieldEntityResponseV2.globalTags) &&
        Objects.equals(this.glossaryTerms, schemaFieldEntityResponseV2.glossaryTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, schemaFieldKey, structuredProperties, forms, businessAttributes, status, schemaFieldAliases, documentation, testResults, deprecation, subTypes, logicalParent, globalTags, glossaryTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaFieldEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    schemaFieldKey: ").append(toIndentedString(schemaFieldKey)).append("\n");
    sb.append("    structuredProperties: ").append(toIndentedString(structuredProperties)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    businessAttributes: ").append(toIndentedString(businessAttributes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schemaFieldAliases: ").append(toIndentedString(schemaFieldAliases)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    logicalParent: ").append(toIndentedString(logicalParent)).append("\n");
    sb.append("    globalTags: ").append(toIndentedString(globalTags)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
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