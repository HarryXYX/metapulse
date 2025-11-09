package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetCollectionModuleParams;
import io.datahubproject.openapi.generated.HierarchyModuleParams;
import io.datahubproject.openapi.generated.LinkModuleParams;
import io.datahubproject.openapi.generated.RichTextModuleParams;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * The specific parameters stored for a module
 */
@Schema(description = "The specific parameters stored for a module")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageModuleParams   {

  @JsonProperty("linkParams") @Builder.Default
  private LinkModuleParams linkParams = null;

  @JsonProperty("richTextParams") @Builder.Default
  private RichTextModuleParams richTextParams = null;

  @JsonProperty("assetCollectionParams") @Builder.Default
  private AssetCollectionModuleParams assetCollectionParams = null;

  @JsonProperty("hierarchyViewParams") @Builder.Default
  private HierarchyModuleParams hierarchyViewParams = null;

  public DataHubPageModuleParams linkParams(LinkModuleParams linkParams) {
    this.linkParams = linkParams;
    return this;
  }

  /**
   * Get linkParams
   * @return linkParams
   **/
  @Schema(description = "")
  
    @Valid
    public LinkModuleParams getLinkParams() {
    return linkParams;
  }

  public void setLinkParams(LinkModuleParams linkParams) {
    this.linkParams = linkParams;
  }

  public DataHubPageModuleParams richTextParams(RichTextModuleParams richTextParams) {
    this.richTextParams = richTextParams;
    return this;
  }

  /**
   * Get richTextParams
   * @return richTextParams
   **/
  @Schema(description = "")
  
    @Valid
    public RichTextModuleParams getRichTextParams() {
    return richTextParams;
  }

  public void setRichTextParams(RichTextModuleParams richTextParams) {
    this.richTextParams = richTextParams;
  }

  public DataHubPageModuleParams assetCollectionParams(AssetCollectionModuleParams assetCollectionParams) {
    this.assetCollectionParams = assetCollectionParams;
    return this;
  }

  /**
   * Get assetCollectionParams
   * @return assetCollectionParams
   **/
  @Schema(description = "")
  
    @Valid
    public AssetCollectionModuleParams getAssetCollectionParams() {
    return assetCollectionParams;
  }

  public void setAssetCollectionParams(AssetCollectionModuleParams assetCollectionParams) {
    this.assetCollectionParams = assetCollectionParams;
  }

  public DataHubPageModuleParams hierarchyViewParams(HierarchyModuleParams hierarchyViewParams) {
    this.hierarchyViewParams = hierarchyViewParams;
    return this;
  }

  /**
   * Get hierarchyViewParams
   * @return hierarchyViewParams
   **/
  @Schema(description = "")
  
    @Valid
    public HierarchyModuleParams getHierarchyViewParams() {
    return hierarchyViewParams;
  }

  public void setHierarchyViewParams(HierarchyModuleParams hierarchyViewParams) {
    this.hierarchyViewParams = hierarchyViewParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageModuleParams dataHubPageModuleParams = (DataHubPageModuleParams) o;
    return Objects.equals(this.linkParams, dataHubPageModuleParams.linkParams) &&
        Objects.equals(this.richTextParams, dataHubPageModuleParams.richTextParams) &&
        Objects.equals(this.assetCollectionParams, dataHubPageModuleParams.assetCollectionParams) &&
        Objects.equals(this.hierarchyViewParams, dataHubPageModuleParams.hierarchyViewParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkParams, richTextParams, assetCollectionParams, hierarchyViewParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageModuleParams {\n");
    
    sb.append("    linkParams: ").append(toIndentedString(linkParams)).append("\n");
    sb.append("    richTextParams: ").append(toIndentedString(richTextParams)).append("\n");
    sb.append("    assetCollectionParams: ").append(toIndentedString(assetCollectionParams)).append("\n");
    sb.append("    hierarchyViewParams: ").append(toIndentedString(hierarchyViewParams)).append("\n");
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