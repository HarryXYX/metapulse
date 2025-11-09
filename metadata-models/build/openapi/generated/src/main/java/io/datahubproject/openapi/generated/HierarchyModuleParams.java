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
/**
 * The params required if the module is type HIERARCHY_VIEW
 */
@Schema(description = "The params required if the module is type HIERARCHY_VIEW")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HierarchyModuleParams   {

  @JsonProperty("assetUrns") @Builder.Default
  @Valid
  private List<String> assetUrns = null;

  @JsonProperty("showRelatedEntities") @Builder.Default
  private Boolean showRelatedEntities = null;

  @JsonProperty("relatedEntitiesFilterJson") @Builder.Default
  private String relatedEntitiesFilterJson = null;

  public HierarchyModuleParams assetUrns(List<String> assetUrns) {
    this.assetUrns = assetUrns;
    return this;
  }

  public HierarchyModuleParams addAssetUrnsItem(String assetUrnsItem) {
    if (this.assetUrns == null) {
      this.assetUrns = new ArrayList<>();
    }
    this.assetUrns.add(assetUrnsItem);
    return this;
  }

  /**
   * Get assetUrns
   * @return assetUrns
   **/
  @Schema(description = "")
  
    public List<String> getAssetUrns() {
    return assetUrns;
  }

  public void setAssetUrns(List<String> assetUrns) {
    this.assetUrns = assetUrns;
  }

  public HierarchyModuleParams showRelatedEntities(Boolean showRelatedEntities) {
    this.showRelatedEntities = showRelatedEntities;
    return this;
  }

  /**
   * Get showRelatedEntities
   * @return showRelatedEntities
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isShowRelatedEntities() {
    return showRelatedEntities;
  }

  public void setShowRelatedEntities(Boolean showRelatedEntities) {
    this.showRelatedEntities = showRelatedEntities;
  }

  public HierarchyModuleParams relatedEntitiesFilterJson(String relatedEntitiesFilterJson) {
    this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
    return this;
  }

  /**
   * Optional filters to filter relatedEntities (assetUrns) out  The stringified json representing the logical predicate built in the UI to select assets. This predicate is turned into orFilters to send through graphql since graphql doesn't support arbitrary nesting. This string is used to restore the UI for this logical predicate.
   * @return relatedEntitiesFilterJson
   **/
  @Schema(description = "Optional filters to filter relatedEntities (assetUrns) out  The stringified json representing the logical predicate built in the UI to select assets. This predicate is turned into orFilters to send through graphql since graphql doesn't support arbitrary nesting. This string is used to restore the UI for this logical predicate.")
  
    public String getRelatedEntitiesFilterJson() {
    return relatedEntitiesFilterJson;
  }

  public void setRelatedEntitiesFilterJson(String relatedEntitiesFilterJson) {
    this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyModuleParams hierarchyModuleParams = (HierarchyModuleParams) o;
    return Objects.equals(this.assetUrns, hierarchyModuleParams.assetUrns) &&
        Objects.equals(this.showRelatedEntities, hierarchyModuleParams.showRelatedEntities) &&
        Objects.equals(this.relatedEntitiesFilterJson, hierarchyModuleParams.relatedEntitiesFilterJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrns, showRelatedEntities, relatedEntitiesFilterJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyModuleParams {\n");
    
    sb.append("    assetUrns: ").append(toIndentedString(assetUrns)).append("\n");
    sb.append("    showRelatedEntities: ").append(toIndentedString(showRelatedEntities)).append("\n");
    sb.append("    relatedEntitiesFilterJson: ").append(toIndentedString(relatedEntitiesFilterJson)).append("\n");
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