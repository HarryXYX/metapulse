package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DocumentationAssociation;
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
 * Aspect used for storing all applicable documentations on assets. This aspect supports multiple documentations from different sources. There is an implicit assumption that there is only one documentation per    source. For example, if there are two documentations from the same source, the    latest one will overwrite the previous one. If there are two documentations from different sources, both will be    stored. Future evolution considerations: The first entity that uses this aspect is Schema Field. We will expand this     aspect to other entities eventually. The values of the documentation are not currently searchable. This will be     changed once this aspect develops opinion on which documentation entry is     the authoritative one. Ensuring that there is only one documentation per source is a business     rule that is not enforced by the aspect yet. This will currently be enforced by the     application that uses this aspect. We will eventually enforce this rule in     the aspect using AspectMutators.
 */
@Schema(description = "Aspect used for storing all applicable documentations on assets. This aspect supports multiple documentations from different sources. There is an implicit assumption that there is only one documentation per    source. For example, if there are two documentations from the same source, the    latest one will overwrite the previous one. If there are two documentations from different sources, both will be    stored. Future evolution considerations: The first entity that uses this aspect is Schema Field. We will expand this     aspect to other entities eventually. The values of the documentation are not currently searchable. This will be     changed once this aspect develops opinion on which documentation entry is     the authoritative one. Ensuring that there is only one documentation per source is a business     rule that is not enforced by the aspect yet. This will currently be enforced by the     application that uses this aspect. We will eventually enforce this rule in     the aspect using AspectMutators.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Documentation  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Documentation") @Builder.Default
  private String __type = "Documentation";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Documentation"},
  defaultValue = "Documentation")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("documentations") @Builder.Default
  @Valid
  private List<DocumentationAssociation> documentations = new ArrayList<>();

  public Documentation documentations(List<DocumentationAssociation> documentations) {
    this.documentations = documentations;
    return this;
  }

  public Documentation addDocumentationsItem(DocumentationAssociation documentationsItem) {
    this.documentations.add(documentationsItem);
    return this;
  }

  /**
   * Documentations associated with this asset. We could be receiving docs from different sources
   * @return documentations
   **/
  @Schema(required = true, description = "Documentations associated with this asset. We could be receiving docs from different sources")
      @NotNull
    @Valid
    public List<DocumentationAssociation> getDocumentations() {
    return documentations;
  }

  public void setDocumentations(List<DocumentationAssociation> documentations) {
    this.documentations = documentations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documentation documentation = (Documentation) o;
    return Objects.equals(this.documentations, documentation.documentations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documentation {\n");
    
    sb.append("    documentations: ").append(toIndentedString(documentations)).append("\n");
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