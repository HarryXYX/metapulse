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
 * Properties of an applied glossary term.
 */
@Schema(description = "Properties of an applied glossary term.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryTermAssociation   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("context") @Builder.Default
  private String context = null;

  @JsonProperty("attribution") @Builder.Default
  private MetadataAttribution attribution = null;

  public GlossaryTermAssociation urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Urn of the applied glossary term
   * @return urn
   **/
  @Schema(required = true, description = "Urn of the applied glossary term")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public GlossaryTermAssociation actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * The user URN which will be credited for adding associating this term to the entity
   * @return actor
   **/
  @Schema(description = "The user URN which will be credited for adding associating this term to the entity")
  
    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public GlossaryTermAssociation context(String context) {
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

  public GlossaryTermAssociation attribution(MetadataAttribution attribution) {
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
    GlossaryTermAssociation glossaryTermAssociation = (GlossaryTermAssociation) o;
    return Objects.equals(this.urn, glossaryTermAssociation.urn) &&
        Objects.equals(this.actor, glossaryTermAssociation.actor) &&
        Objects.equals(this.context, glossaryTermAssociation.context) &&
        Objects.equals(this.attribution, glossaryTermAssociation.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, actor, context, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTermAssociation {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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