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
 * The model for browse result metadata
 */
@Schema(description = "The model for browse result metadata")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowseResultMetadata   {

  @JsonProperty("path") @Builder.Default
  private String path = null;

  @JsonProperty("totalNumEntities") @Builder.Default
  private Long totalNumEntities = null;

  public BrowseResultMetadata path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path that is being browsed
   * @return path
   **/
  @Schema(required = true, description = "Path that is being browsed")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public BrowseResultMetadata totalNumEntities(Long totalNumEntities) {
    this.totalNumEntities = totalNumEntities;
    return this;
  }

  /**
   * Total number of entities we can reach from path
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return totalNumEntities
   **/
  @Schema(required = true, description = "Total number of entities we can reach from path")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTotalNumEntities() {
    return totalNumEntities;
  }

  public void setTotalNumEntities(Long totalNumEntities) {
    this.totalNumEntities = totalNumEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseResultMetadata browseResultMetadata = (BrowseResultMetadata) o;
    return Objects.equals(this.path, browseResultMetadata.path) &&
        Objects.equals(this.totalNumEntities, browseResultMetadata.totalNumEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, totalNumEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseResultMetadata {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    totalNumEntities: ").append(toIndentedString(totalNumEntities)).append("\n");
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