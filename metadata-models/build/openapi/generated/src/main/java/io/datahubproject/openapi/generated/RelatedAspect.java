package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Metadata about how an aspect is related to some urn
 */
@Schema(description = "Metadata about how an aspect is related to some urn")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedAspect   {

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("aspect") @Builder.Default
  private String aspect = null;

  @JsonProperty("relationship") @Builder.Default
  private String relationship = null;

  public RelatedAspect entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   *  Urn of the entity that is referenced by the aspect.
   * @return entity
   **/
  @Schema(required = true, description = " Urn of the entity that is referenced by the aspect.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public RelatedAspect aspect(String aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Get aspect
   * @return aspect
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAspect() {
    return aspect;
  }

  public void setAspect(String aspect) {
    this.aspect = aspect;
  }

  public RelatedAspect relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Get relationship
   * @return relationship
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedAspect relatedAspect = (RelatedAspect) o;
    return Objects.equals(this.entity, relatedAspect.entity) &&
        Objects.equals(this.aspect, relatedAspect.aspect) &&
        Objects.equals(this.relationship, relatedAspect.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, aspect, relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedAspect {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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