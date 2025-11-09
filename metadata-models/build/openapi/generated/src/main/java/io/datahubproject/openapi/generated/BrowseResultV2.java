package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BrowseResultGroupV2;
import io.datahubproject.openapi.generated.BrowseResultMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The model for the result of a browseV2 query
 */
@Schema(description = "The model for the result of a browseV2 query")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowseResultV2   {

  @JsonProperty("groups") @Builder.Default
  @Valid
  private List<BrowseResultGroupV2> groups = new ArrayList<>();

  @JsonProperty("metadata") @Builder.Default
  private BrowseResultMetadata metadata = null;

  @JsonProperty("from") @Builder.Default
  private Integer from = null;

  @JsonProperty("pageSize") @Builder.Default
  private Integer pageSize = null;

  @JsonProperty("numGroups") @Builder.Default
  private Integer numGroups = null;

  public BrowseResultV2 groups(List<BrowseResultGroupV2> groups) {
    this.groups = groups;
    return this;
  }

  public BrowseResultV2 addGroupsItem(BrowseResultGroupV2 groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A list of groups and total number of entities inside those groups under the queried path
   * @return groups
   **/
  @Schema(required = true, description = "A list of groups and total number of entities inside those groups under the queried path")
      @NotNull
    @Valid
    public List<BrowseResultGroupV2> getGroups() {
    return groups;
  }

  public void setGroups(List<BrowseResultGroupV2> groups) {
    this.groups = groups;
  }

  public BrowseResultV2 metadata(BrowseResultMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BrowseResultMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(BrowseResultMetadata metadata) {
    this.metadata = metadata;
  }

  public BrowseResultV2 from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Offset of the first entity in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return from
   **/
  @Schema(required = true, description = "Offset of the first entity in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public BrowseResultV2 pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Size of each page in the result
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pageSize
   **/
  @Schema(required = true, description = "Size of each page in the result")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public BrowseResultV2 numGroups(Integer numGroups) {
    this.numGroups = numGroups;
    return this;
  }

  /**
   * The total number of groups directly under queried path
   * minimum: -2147483648
   * maximum: 2147483647
   * @return numGroups
   **/
  @Schema(required = true, description = "The total number of groups directly under queried path")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getNumGroups() {
    return numGroups;
  }

  public void setNumGroups(Integer numGroups) {
    this.numGroups = numGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseResultV2 browseResultV2 = (BrowseResultV2) o;
    return Objects.equals(this.groups, browseResultV2.groups) &&
        Objects.equals(this.metadata, browseResultV2.metadata) &&
        Objects.equals(this.from, browseResultV2.from) &&
        Objects.equals(this.pageSize, browseResultV2.pageSize) &&
        Objects.equals(this.numGroups, browseResultV2.numGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, metadata, from, pageSize, numGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseResultV2 {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    numGroups: ").append(toIndentedString(numGroups)).append("\n");
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