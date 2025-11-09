package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BrowsePathEntry;
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
 * Shared aspect containing a Browse Path to be indexed for an entity.
 */
@Schema(description = "Shared aspect containing a Browse Path to be indexed for an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowsePathsV2  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "BrowsePathsV2") @Builder.Default
  private String __type = "BrowsePathsV2";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"BrowsePathsV2"},
  defaultValue = "BrowsePathsV2")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("path") @Builder.Default
  @Valid
  private List<BrowsePathEntry> path = new ArrayList<>();

  public BrowsePathsV2 path(List<BrowsePathEntry> path) {
    this.path = path;
    return this;
  }

  public BrowsePathsV2 addPathItem(BrowsePathEntry pathItem) {
    this.path.add(pathItem);
    return this;
  }

  /**
   * A valid browse path for the entity. This field is provided by DataHub by default. This aspect is a newer version of browsePaths where we can encode more information in the path. This path is also based on containers for a given entity if it has containers.  This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers. These paths should not include high level info captured elsewhere ie. Platform and Environment.
   * @return path
   **/
  @Schema(required = true, description = "A valid browse path for the entity. This field is provided by DataHub by default. This aspect is a newer version of browsePaths where we can encode more information in the path. This path is also based on containers for a given entity if it has containers.  This is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers. These paths should not include high level info captured elsewhere ie. Platform and Environment.")
      @NotNull
    @Valid
    public List<BrowsePathEntry> getPath() {
    return path;
  }

  public void setPath(List<BrowsePathEntry> path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowsePathsV2 browsePathsV2 = (BrowsePathsV2) o;
    return Objects.equals(this.path, browsePathsV2.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowsePathsV2 {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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