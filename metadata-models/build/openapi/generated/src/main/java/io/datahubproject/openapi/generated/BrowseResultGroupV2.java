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
 * The model for the result of a browse query
 */
@Schema(description = "The model for the result of a browse query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowseResultGroupV2   {

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("count") @Builder.Default
  private Long count = null;

  @JsonProperty("hasSubGroups") @Builder.Default
  private Boolean hasSubGroups = null;

  public BrowseResultGroupV2 name(String name) {
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

  public BrowseResultGroupV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Urn of the group if this is an entity
   * @return urn
   **/
  @Schema(description = "Urn of the group if this is an entity")
  
    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public BrowseResultGroupV2 count(Long count) {
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

  public BrowseResultGroupV2 hasSubGroups(Boolean hasSubGroups) {
    this.hasSubGroups = hasSubGroups;
    return this;
  }

  /**
   * Whether or not this group has any sub-groups underneath it
   * @return hasSubGroups
   **/
  @Schema(required = true, description = "Whether or not this group has any sub-groups underneath it")
      @NotNull

    public Boolean isHasSubGroups() {
    return hasSubGroups;
  }

  public void setHasSubGroups(Boolean hasSubGroups) {
    this.hasSubGroups = hasSubGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseResultGroupV2 browseResultGroupV2 = (BrowseResultGroupV2) o;
    return Objects.equals(this.name, browseResultGroupV2.name) &&
        Objects.equals(this.urn, browseResultGroupV2.urn) &&
        Objects.equals(this.count, browseResultGroupV2.count) &&
        Objects.equals(this.hasSubGroups, browseResultGroupV2.hasSubGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urn, count, hasSubGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseResultGroupV2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasSubGroups: ").append(toIndentedString(hasSubGroups)).append("\n");
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