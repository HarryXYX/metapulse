package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TagAssociation;
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
 * Tag aspect used for applying tags to an entity
 */
@Schema(description = "Tag aspect used for applying tags to an entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlobalTags  implements OneOfChartSnapshotAspectsItems, OneOfCorpGroupSnapshotAspectsItems, OneOfCorpUserSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelDeploymentSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlobalTags") @Builder.Default
  private String __type = "GlobalTags";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlobalTags"},
  defaultValue = "GlobalTags")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("tags") @Builder.Default
  @Valid
  private List<TagAssociation> tags = new ArrayList<>();

  public GlobalTags tags(List<TagAssociation> tags) {
    this.tags = tags;
    return this;
  }

  public GlobalTags addTagsItem(TagAssociation tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with a given entity
   * @return tags
   **/
  @Schema(required = true, description = "Tags associated with a given entity")
      @NotNull
    @Valid
    public List<TagAssociation> getTags() {
    return tags;
  }

  public void setTags(List<TagAssociation> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalTags globalTags = (GlobalTags) o;
    return Objects.equals(this.tags, globalTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTags {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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