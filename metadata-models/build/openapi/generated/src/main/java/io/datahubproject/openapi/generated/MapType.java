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
 * Map field type.
 */
@Schema(description = "Map field type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MapType  implements OneOfSchemaFieldDataTypeType {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MapType") @Builder.Default
  private String __type = "MapType";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MapType"},
  defaultValue = "MapType")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("keyType") @Builder.Default
  private String keyType = null;

  @JsonProperty("valueType") @Builder.Default
  private String valueType = null;

  public MapType keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Key type in a map
   * @return keyType
   **/
  @Schema(description = "Key type in a map")
  
    public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public MapType valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Type of the value in a map
   * @return valueType
   **/
  @Schema(description = "Type of the value in a map")
  
    public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapType mapType = (MapType) o;
    return Objects.equals(this.keyType, mapType.keyType) &&
        Objects.equals(this.valueType, mapType.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyType, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapType {\n");
    
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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