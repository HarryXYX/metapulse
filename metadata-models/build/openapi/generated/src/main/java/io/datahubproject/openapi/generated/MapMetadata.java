package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The model for map metadata
 */
@Schema(description = "The model for map metadata")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MapMetadata   {

  @JsonProperty("longMap") @Builder.Default
  @Valid
  private Map<String, Long> longMap = new HashMap<>();

  public MapMetadata longMap(Map<String, Long> longMap) {
    this.longMap = longMap;
    return this;
  }

  public MapMetadata putLongMapItem(String key, Long longMapItem) {
    this.longMap.put(key, longMapItem);
    return this;
  }

  /**
   * Map for string keys to long values
   * @return longMap
   **/
  @Schema(required = true, description = "Map for string keys to long values")
      @NotNull

    public Map<String, Long> getLongMap() {
    return longMap;
  }

  public void setLongMap(Map<String, Long> longMap) {
    this.longMap = longMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapMetadata mapMetadata = (MapMetadata) o;
    return Objects.equals(this.longMap, mapMetadata.longMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapMetadata {\n");
    
    sb.append("    longMap: ").append(toIndentedString(longMap)).append("\n");
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