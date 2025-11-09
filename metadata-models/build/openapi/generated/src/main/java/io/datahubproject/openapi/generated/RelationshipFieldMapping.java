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
 * Individual Field Mapping of a relationship- one of several
 */
@Schema(description = "Individual Field Mapping of a relationship- one of several")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationshipFieldMapping   {

  @JsonProperty("sourceField") @Builder.Default
  private String sourceField = null;

  @JsonProperty("destinationField") @Builder.Default
  private String destinationField = null;

  public RelationshipFieldMapping sourceField(String sourceField) {
    this.sourceField = sourceField;
    return this;
  }

  /**
   * All fields from dataset A that are required for the join, maps to bFields 1:1
   * @return sourceField
   **/
  @Schema(required = true, description = "All fields from dataset A that are required for the join, maps to bFields 1:1")
      @NotNull

    public String getSourceField() {
    return sourceField;
  }

  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }

  public RelationshipFieldMapping destinationField(String destinationField) {
    this.destinationField = destinationField;
    return this;
  }

  /**
   * All fields from dataset B that are required for the join, maps to aFields 1:1
   * @return destinationField
   **/
  @Schema(required = true, description = "All fields from dataset B that are required for the join, maps to aFields 1:1")
      @NotNull

    public String getDestinationField() {
    return destinationField;
  }

  public void setDestinationField(String destinationField) {
    this.destinationField = destinationField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipFieldMapping relationshipFieldMapping = (RelationshipFieldMapping) o;
    return Objects.equals(this.sourceField, relationshipFieldMapping.sourceField) &&
        Objects.equals(this.destinationField, relationshipFieldMapping.destinationField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceField, destinationField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipFieldMapping {\n");
    
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
    sb.append("    destinationField: ").append(toIndentedString(destinationField)).append("\n");
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