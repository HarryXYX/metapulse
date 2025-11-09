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
 * The params required if the module is type ASSET_COLLECTION
 */
@Schema(description = "The params required if the module is type ASSET_COLLECTION")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetCollectionModuleParams   {

  @JsonProperty("assetUrns") @Builder.Default
  @Valid
  private List<String> assetUrns = new ArrayList<>();

  @JsonProperty("dynamicFilterJson") @Builder.Default
  private String dynamicFilterJson = null;

  public AssetCollectionModuleParams assetUrns(List<String> assetUrns) {
    this.assetUrns = assetUrns;
    return this;
  }

  public AssetCollectionModuleParams addAssetUrnsItem(String assetUrnsItem) {
    this.assetUrns.add(assetUrnsItem);
    return this;
  }

  /**
   * Get assetUrns
   * @return assetUrns
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getAssetUrns() {
    return assetUrns;
  }

  public void setAssetUrns(List<String> assetUrns) {
    this.assetUrns = assetUrns;
  }

  public AssetCollectionModuleParams dynamicFilterJson(String dynamicFilterJson) {
    this.dynamicFilterJson = dynamicFilterJson;
    return this;
  }

  /**
   * Optional dynamic filters  The stringified json representing the logical predicate built in the UI to select assets. This predicate is turned into orFilters to send through graphql since graphql doesn't support arbitrary nesting. This string is used to restore the UI for this logical predicate.
   * @return dynamicFilterJson
   **/
  @Schema(description = "Optional dynamic filters  The stringified json representing the logical predicate built in the UI to select assets. This predicate is turned into orFilters to send through graphql since graphql doesn't support arbitrary nesting. This string is used to restore the UI for this logical predicate.")
  
    public String getDynamicFilterJson() {
    return dynamicFilterJson;
  }

  public void setDynamicFilterJson(String dynamicFilterJson) {
    this.dynamicFilterJson = dynamicFilterJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetCollectionModuleParams assetCollectionModuleParams = (AssetCollectionModuleParams) o;
    return Objects.equals(this.assetUrns, assetCollectionModuleParams.assetUrns) &&
        Objects.equals(this.dynamicFilterJson, assetCollectionModuleParams.dynamicFilterJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrns, dynamicFilterJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCollectionModuleParams {\n");
    
    sb.append("    assetUrns: ").append(toIndentedString(assetUrns)).append("\n");
    sb.append("    dynamicFilterJson: ").append(toIndentedString(dynamicFilterJson)).append("\n");
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