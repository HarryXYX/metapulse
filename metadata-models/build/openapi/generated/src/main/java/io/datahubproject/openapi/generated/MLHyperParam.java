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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Properties associated with an ML Hyper Param
 */
@Schema(description = "Properties associated with an ML Hyper Param")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLHyperParam  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLHyperParam") @Builder.Default
  private String __type = "MLHyperParam";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLHyperParam"},
  defaultValue = "MLHyperParam")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("createdAt") @Builder.Default
  private Long createdAt = null;

  public MLHyperParam name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the MLHyperParam
   * @return name
   **/
  @Schema(required = true, description = "Name of the MLHyperParam")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MLHyperParam description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the MLHyperParam
   * @return description
   **/
  @Schema(description = "Documentation of the MLHyperParam")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MLHyperParam value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the MLHyperParam
   * @return value
   **/
  @Schema(description = "The value of the MLHyperParam")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MLHyperParam createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the MLHyperParam was developed
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdAt
   **/
  @Schema(description = "Date when the MLHyperParam was developed")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLHyperParam mlHyperParam = (MLHyperParam) o;
    return Objects.equals(this.name, mlHyperParam.name) &&
        Objects.equals(this.description, mlHyperParam.description) &&
        Objects.equals(this.value, mlHyperParam.value) &&
        Objects.equals(this.createdAt, mlHyperParam.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, value, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLHyperParam {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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