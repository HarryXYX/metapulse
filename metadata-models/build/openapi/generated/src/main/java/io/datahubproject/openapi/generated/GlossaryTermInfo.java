package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Properties associated with a GlossaryTerm
 */
@Schema(description = "Properties associated with a GlossaryTerm")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryTermInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryTermSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlossaryTermInfo") @Builder.Default
  private String __type = "GlossaryTermInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlossaryTermInfo"},
  defaultValue = "GlossaryTermInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("definition") @Builder.Default
  private String definition = null;

  @JsonProperty("parentNode") @Builder.Default
  private String parentNode = null;

  @JsonProperty("termSource") @Builder.Default
  private String termSource = null;

  @JsonProperty("sourceRef") @Builder.Default
  private String sourceRef = null;

  @JsonProperty("sourceUrl") @Builder.Default
  private String sourceUrl = null;

  @JsonProperty("rawSchema") @Builder.Default
  private String rawSchema = null;

  public GlossaryTermInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public GlossaryTermInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public GlossaryTermInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional id for the term
   * @return id
   **/
  @Schema(description = "Optional id for the term")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GlossaryTermInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the term
   * @return name
   **/
  @Schema(description = "Display name of the term")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlossaryTermInfo definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Definition of business term.
   * @return definition
   **/
  @Schema(required = true, description = "Definition of business term.")
      @NotNull

    public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public GlossaryTermInfo parentNode(String parentNode) {
    this.parentNode = parentNode;
    return this;
  }

  /**
   * Parent node of the glossary term
   * @return parentNode
   **/
  @Schema(description = "Parent node of the glossary term")
  
    public String getParentNode() {
    return parentNode;
  }

  public void setParentNode(String parentNode) {
    this.parentNode = parentNode;
  }

  public GlossaryTermInfo termSource(String termSource) {
    this.termSource = termSource;
    return this;
  }

  /**
   * Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL
   * @return termSource
   **/
  @Schema(required = true, description = "Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL")
      @NotNull

    public String getTermSource() {
    return termSource;
  }

  public void setTermSource(String termSource) {
    this.termSource = termSource;
  }

  public GlossaryTermInfo sourceRef(String sourceRef) {
    this.sourceRef = sourceRef;
    return this;
  }

  /**
   * External Reference to the business-term
   * @return sourceRef
   **/
  @Schema(description = "External Reference to the business-term")
  
    public String getSourceRef() {
    return sourceRef;
  }

  public void setSourceRef(String sourceRef) {
    this.sourceRef = sourceRef;
  }

  public GlossaryTermInfo sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  /**
   * The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.
   * @return sourceUrl
   **/
  @Schema(description = "The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.")
  
    public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public GlossaryTermInfo rawSchema(String rawSchema) {
    this.rawSchema = rawSchema;
    return this;
  }

  /**
   * Schema definition of the glossary term
   * @return rawSchema
   **/
  @Schema(description = "Schema definition of the glossary term")
  
    public String getRawSchema() {
    return rawSchema;
  }

  public void setRawSchema(String rawSchema) {
    this.rawSchema = rawSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryTermInfo glossaryTermInfo = (GlossaryTermInfo) o;
    return Objects.equals(this.customProperties, glossaryTermInfo.customProperties) &&
        Objects.equals(this.id, glossaryTermInfo.id) &&
        Objects.equals(this.name, glossaryTermInfo.name) &&
        Objects.equals(this.definition, glossaryTermInfo.definition) &&
        Objects.equals(this.parentNode, glossaryTermInfo.parentNode) &&
        Objects.equals(this.termSource, glossaryTermInfo.termSource) &&
        Objects.equals(this.sourceRef, glossaryTermInfo.sourceRef) &&
        Objects.equals(this.sourceUrl, glossaryTermInfo.sourceUrl) &&
        Objects.equals(this.rawSchema, glossaryTermInfo.rawSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, id, name, definition, parentNode, termSource, sourceRef, sourceUrl, rawSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTermInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
    sb.append("    termSource: ").append(toIndentedString(termSource)).append("\n");
    sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    rawSchema: ").append(toIndentedString(rawSchema)).append("\n");
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