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
 * The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc. This aspect is used to represent soft deletes conventionally.
 */
@Schema(description = "The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc. This aspect is used to represent soft deletes conventionally.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status  implements OneOfChartSnapshotAspectsItems, OneOfCorpGroupSnapshotAspectsItems, OneOfCorpUserSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDataProcessSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryNodeSnapshotAspectsItems, OneOfGlossaryTermSnapshotAspectsItems, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelDeploymentSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems, OneOfTagSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Status") @Builder.Default
  private String __type = "Status";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Status"},
  defaultValue = "Status")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("removed") @Builder.Default
  private Boolean removed = false;

  public Status removed(Boolean removed) {
    this.removed = removed;
    return this;
  }

  /**
   * Whether the entity has been removed (soft-deleted).
   * @return removed
   **/
  @Schema(required = true, description = "Whether the entity has been removed (soft-deleted).")
      @NotNull

    public Boolean isRemoved() {
    return removed;
  }

  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.removed, status.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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