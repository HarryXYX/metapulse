package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MetadataAttribution;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Properties of applied documentation including the attribution of the doc
 */
@Schema(description = "Properties of applied documentation including the attribution of the doc")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentationAssociation   {

  @JsonProperty("documentation") @Builder.Default
  private String documentation = null;

  @JsonProperty("attribution") @Builder.Default
  private MetadataAttribution attribution = null;

  public DocumentationAssociation documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Description of this asset
   * @return documentation
   **/
  @Schema(required = true, description = "Description of this asset")
      @NotNull

    public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public DocumentationAssociation attribution(MetadataAttribution attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Get attribution
   * @return attribution
   **/
  @Schema(description = "")
  
    @Valid
    public MetadataAttribution getAttribution() {
    return attribution;
  }

  public void setAttribution(MetadataAttribution attribution) {
    this.attribution = attribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentationAssociation documentationAssociation = (DocumentationAssociation) o;
    return Objects.equals(this.documentation, documentationAssociation.documentation) &&
        Objects.equals(this.attribution, documentationAssociation.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentation, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentationAssociation {\n");
    
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
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