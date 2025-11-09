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
 * Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g. propagation parameters.
 */
@Schema(description = "Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g. propagation parameters.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagAssociation   {

  @JsonProperty("tag") @Builder.Default
  private String tag = null;

  @JsonProperty("context") @Builder.Default
  private String context = null;

  @JsonProperty("attribution") @Builder.Default
  private MetadataAttribution attribution = null;

  public TagAssociation tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Urn of the applied tag
   * @return tag
   **/
  @Schema(required = true, description = "Urn of the applied tag")
      @NotNull

    public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TagAssociation context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Additional context about the association
   * @return context
   **/
  @Schema(description = "Additional context about the association")
  
    public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public TagAssociation attribution(MetadataAttribution attribution) {
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
    TagAssociation tagAssociation = (TagAssociation) o;
    return Objects.equals(this.tag, tagAssociation.tag) &&
        Objects.equals(this.context, tagAssociation.context) &&
        Objects.equals(this.attribution, tagAssociation.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, context, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagAssociation {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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