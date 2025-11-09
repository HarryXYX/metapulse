package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BusinessAttributesAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DocumentationAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.LogicalParentAspectRequestV2;
import io.datahubproject.openapi.generated.SchemaFieldAliasesAspectRequestV2;
import io.datahubproject.openapi.generated.SchemaFieldKeyAspectRequestV2;
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
 * SchemaField object.
 */
@Schema(description = "SchemaField object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaFieldEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("schemaFieldKey") @Builder.Default
  private SchemaFieldKeyAspectRequestV2 schemaFieldKey = null;

  @JsonProperty("structuredProperties") @Builder.Default
  private StructuredPropertiesAspectRequestV2 structuredProperties = null;

  @JsonProperty("forms") @Builder.Default
  private FormsAspectRequestV2 forms = null;

  @JsonProperty("businessAttributes") @Builder.Default
  private BusinessAttributesAspectRequestV2 businessAttributes = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("schemaFieldAliases") @Builder.Default
  private SchemaFieldAliasesAspectRequestV2 schemaFieldAliases = null;

  @JsonProperty("documentation") @Builder.Default
  private DocumentationAspectRequestV2 documentation = null;

  @JsonProperty("testResults") @Builder.Default
  private TestResultsAspectRequestV2 testResults = null;

  @JsonProperty("deprecation") @Builder.Default
  private DeprecationAspectRequestV2 deprecation = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  @JsonProperty("logicalParent") @Builder.Default
  private LogicalParentAspectRequestV2 logicalParent = null;

  @JsonProperty("globalTags") @Builder.Default
  private GlobalTagsAspectRequestV2 globalTags = null;

  @JsonProperty("glossaryTerms") @Builder.Default
  private GlossaryTermsAspectRequestV2 glossaryTerms = null;

  public SchemaFieldEntityRequestV2 urn(String urn) {
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

  public SchemaFieldEntityRequestV2 schemaFieldKey(SchemaFieldKeyAspectRequestV2 schemaFieldKey) {
    this.schemaFieldKey = schemaFieldKey;
    return this;
  }

  /**
   * Get schemaFieldKey
   * @return schemaFieldKey
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaFieldKeyAspectRequestV2 getSchemaFieldKey() {
    return schemaFieldKey;
  }

  public void setSchemaFieldKey(SchemaFieldKeyAspectRequestV2 schemaFieldKey) {
    this.schemaFieldKey = schemaFieldKey;
  }

  public SchemaFieldEntityRequestV2 structuredProperties(StructuredPropertiesAspectRequestV2 structuredProperties) {
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

  public SchemaFieldEntityRequestV2 forms(FormsAspectRequestV2 forms) {
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

  public SchemaFieldEntityRequestV2 businessAttributes(BusinessAttributesAspectRequestV2 businessAttributes) {
    this.businessAttributes = businessAttributes;
    return this;
  }

  /**
   * Get businessAttributes
   * @return businessAttributes
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributesAspectRequestV2 getBusinessAttributes() {
    return businessAttributes;
  }

  public void setBusinessAttributes(BusinessAttributesAspectRequestV2 businessAttributes) {
    this.businessAttributes = businessAttributes;
  }

  public SchemaFieldEntityRequestV2 status(StatusAspectRequestV2 status) {
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

  public SchemaFieldEntityRequestV2 schemaFieldAliases(SchemaFieldAliasesAspectRequestV2 schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
    return this;
  }

  /**
   * Get schemaFieldAliases
   * @return schemaFieldAliases
   **/
  @Schema(description = "")
  
    @Valid
    public SchemaFieldAliasesAspectRequestV2 getSchemaFieldAliases() {
    return schemaFieldAliases;
  }

  public void setSchemaFieldAliases(SchemaFieldAliasesAspectRequestV2 schemaFieldAliases) {
    this.schemaFieldAliases = schemaFieldAliases;
  }

  public SchemaFieldEntityRequestV2 documentation(DocumentationAspectRequestV2 documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
   **/
  @Schema(description = "")
  
    @Valid
    public DocumentationAspectRequestV2 getDocumentation() {
    return documentation;
  }

  public void setDocumentation(DocumentationAspectRequestV2 documentation) {
    this.documentation = documentation;
  }

  public SchemaFieldEntityRequestV2 testResults(TestResultsAspectRequestV2 testResults) {
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

  public SchemaFieldEntityRequestV2 deprecation(DeprecationAspectRequestV2 deprecation) {
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

  public SchemaFieldEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
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

  public SchemaFieldEntityRequestV2 logicalParent(LogicalParentAspectRequestV2 logicalParent) {
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

  public SchemaFieldEntityRequestV2 globalTags(GlobalTagsAspectRequestV2 globalTags) {
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

  public SchemaFieldEntityRequestV2 glossaryTerms(GlossaryTermsAspectRequestV2 glossaryTerms) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaFieldEntityRequestV2 schemaFieldEntityRequestV2 = (SchemaFieldEntityRequestV2) o;
    return Objects.equals(this.urn, schemaFieldEntityRequestV2.urn) &&
        Objects.equals(this.schemaFieldKey, schemaFieldEntityRequestV2.schemaFieldKey) &&
        Objects.equals(this.structuredProperties, schemaFieldEntityRequestV2.structuredProperties) &&
        Objects.equals(this.forms, schemaFieldEntityRequestV2.forms) &&
        Objects.equals(this.businessAttributes, schemaFieldEntityRequestV2.businessAttributes) &&
        Objects.equals(this.status, schemaFieldEntityRequestV2.status) &&
        Objects.equals(this.schemaFieldAliases, schemaFieldEntityRequestV2.schemaFieldAliases) &&
        Objects.equals(this.documentation, schemaFieldEntityRequestV2.documentation) &&
        Objects.equals(this.testResults, schemaFieldEntityRequestV2.testResults) &&
        Objects.equals(this.deprecation, schemaFieldEntityRequestV2.deprecation) &&
        Objects.equals(this.subTypes, schemaFieldEntityRequestV2.subTypes) &&
        Objects.equals(this.logicalParent, schemaFieldEntityRequestV2.logicalParent) &&
        Objects.equals(this.globalTags, schemaFieldEntityRequestV2.globalTags) &&
        Objects.equals(this.glossaryTerms, schemaFieldEntityRequestV2.glossaryTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, schemaFieldKey, structuredProperties, forms, businessAttributes, status, schemaFieldAliases, documentation, testResults, deprecation, subTypes, logicalParent, globalTags, glossaryTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaFieldEntityRequestV2 {\n");
    
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