package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Shared aspect containing Browse Paths to be indexed for an entity.
 */
@Schema(description = "Shared aspect containing Browse Paths to be indexed for an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowsePaths  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryTermSnapshotAspectsItems, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "BrowsePaths") @Builder.Default
  private String __type = "BrowsePaths";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"BrowsePaths"},
  defaultValue = "BrowsePaths")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("paths") @Builder.Default
  @Valid
  private List<String> paths = new ArrayList<>();

  public BrowsePaths paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public BrowsePaths addPathsItem(String pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * A list of valid browse paths for the entity.  Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'
   * @return paths
   **/
  @Schema(required = true, description = "A list of valid browse paths for the entity.  Browse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'")
      @NotNull

    public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowsePaths browsePaths = (BrowsePaths) o;
    return Objects.equals(this.paths, browsePaths.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowsePaths {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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