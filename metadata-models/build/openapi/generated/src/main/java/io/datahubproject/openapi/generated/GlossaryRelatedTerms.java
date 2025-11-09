package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Has A / Is A lineage information about a glossary Term reporting the lineage
 */
@Schema(description = "Has A / Is A lineage information about a glossary Term reporting the lineage")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryRelatedTerms  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryTermSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlossaryRelatedTerms") @Builder.Default
  private String __type = "GlossaryRelatedTerms";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlossaryRelatedTerms"},
  defaultValue = "GlossaryRelatedTerms")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("isRelatedTerms") @Builder.Default
  @Valid
  private List<String> isRelatedTerms = null;

  @JsonProperty("hasRelatedTerms") @Builder.Default
  @Valid
  private List<String> hasRelatedTerms = null;

  @JsonProperty("values") @Builder.Default
  @Valid
  private List<String> values = null;

  @JsonProperty("relatedTerms") @Builder.Default
  @Valid
  private List<String> relatedTerms = null;

  public GlossaryRelatedTerms isRelatedTerms(List<String> isRelatedTerms) {
    this.isRelatedTerms = isRelatedTerms;
    return this;
  }

  public GlossaryRelatedTerms addIsRelatedTermsItem(String isRelatedTermsItem) {
    if (this.isRelatedTerms == null) {
      this.isRelatedTerms = new ArrayList<>();
    }
    this.isRelatedTerms.add(isRelatedTermsItem);
    return this;
  }

  /**
   * The relationship Is A with glossary term
   * @return isRelatedTerms
   **/
  @Schema(description = "The relationship Is A with glossary term")
  
    public List<String> getIsRelatedTerms() {
    return isRelatedTerms;
  }

  public void setIsRelatedTerms(List<String> isRelatedTerms) {
    this.isRelatedTerms = isRelatedTerms;
  }

  public GlossaryRelatedTerms hasRelatedTerms(List<String> hasRelatedTerms) {
    this.hasRelatedTerms = hasRelatedTerms;
    return this;
  }

  public GlossaryRelatedTerms addHasRelatedTermsItem(String hasRelatedTermsItem) {
    if (this.hasRelatedTerms == null) {
      this.hasRelatedTerms = new ArrayList<>();
    }
    this.hasRelatedTerms.add(hasRelatedTermsItem);
    return this;
  }

  /**
   * The relationship Has A with glossary term
   * @return hasRelatedTerms
   **/
  @Schema(description = "The relationship Has A with glossary term")
  
    public List<String> getHasRelatedTerms() {
    return hasRelatedTerms;
  }

  public void setHasRelatedTerms(List<String> hasRelatedTerms) {
    this.hasRelatedTerms = hasRelatedTerms;
  }

  public GlossaryRelatedTerms values(List<String> values) {
    this.values = values;
    return this;
  }

  public GlossaryRelatedTerms addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The relationship Has Value with glossary term. These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.
   * @return values
   **/
  @Schema(description = "The relationship Has Value with glossary term. These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.")
  
    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public GlossaryRelatedTerms relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  public GlossaryRelatedTerms addRelatedTermsItem(String relatedTermsItem) {
    if (this.relatedTerms == null) {
      this.relatedTerms = new ArrayList<>();
    }
    this.relatedTerms.add(relatedTermsItem);
    return this;
  }

  /**
   * The relationship isRelatedTo with glossary term
   * @return relatedTerms
   **/
  @Schema(description = "The relationship isRelatedTo with glossary term")
  
    public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryRelatedTerms glossaryRelatedTerms = (GlossaryRelatedTerms) o;
    return Objects.equals(this.isRelatedTerms, glossaryRelatedTerms.isRelatedTerms) &&
        Objects.equals(this.hasRelatedTerms, glossaryRelatedTerms.hasRelatedTerms) &&
        Objects.equals(this.values, glossaryRelatedTerms.values) &&
        Objects.equals(this.relatedTerms, glossaryRelatedTerms.relatedTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRelatedTerms, hasRelatedTerms, values, relatedTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryRelatedTerms {\n");
    
    sb.append("    isRelatedTerms: ").append(toIndentedString(isRelatedTerms)).append("\n");
    sb.append("    hasRelatedTerms: ").append(toIndentedString(hasRelatedTerms)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    relatedTerms: ").append(toIndentedString(relatedTerms)).append("\n");
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