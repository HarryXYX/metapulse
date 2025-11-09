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
 * BrowseResultGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowseResultGroup   {

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("count") @Builder.Default
  private Long count = null;

  public BrowseResultGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the group
   * @return name
   **/
  @Schema(required = true, description = "Name of the group")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrowseResultGroup count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Number of entities that can be reached from this path
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return count
   **/
  @Schema(required = true, description = "Number of entities that can be reached from this path")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseResultGroup browseResultGroup = (BrowseResultGroup) o;
    return Objects.equals(this.name, browseResultGroup.name) &&
        Objects.equals(this.count, browseResultGroup.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseResultGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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