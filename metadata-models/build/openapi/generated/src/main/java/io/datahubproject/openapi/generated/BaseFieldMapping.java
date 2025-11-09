package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Base model representing field mappings
 */
@Schema(description = "Base model representing field mappings")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseFieldMapping   {

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("transformation") @Builder.Default
  private OneOfBaseFieldMappingTransformation transformation = null;

  public BaseFieldMapping created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public BaseFieldMapping transformation(OneOfBaseFieldMappingTransformation transformation) {
    this.transformation = transformation;
    return this;
  }

  /**
   * Transfomration function between the fields involved
   * @return transformation
   **/
  @Schema(required = true, description = "Transfomration function between the fields involved")
      @NotNull

    public OneOfBaseFieldMappingTransformation getTransformation() {
    return transformation;
  }

  public void setTransformation(OneOfBaseFieldMappingTransformation transformation) {
    this.transformation = transformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseFieldMapping baseFieldMapping = (BaseFieldMapping) o;
    return Objects.equals(this.created, baseFieldMapping.created) &&
        Objects.equals(this.transformation, baseFieldMapping.transformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, transformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseFieldMapping {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
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