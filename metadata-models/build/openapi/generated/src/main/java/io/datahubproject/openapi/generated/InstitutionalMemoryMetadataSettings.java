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
 * Settings related to a record of InstitutionalMemoryMetadata
 */
@Schema(description = "Settings related to a record of InstitutionalMemoryMetadata")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstitutionalMemoryMetadataSettings   {

  @JsonProperty("showInAssetPreview") @Builder.Default
  private Boolean showInAssetPreview = false;

  public InstitutionalMemoryMetadataSettings showInAssetPreview(Boolean showInAssetPreview) {
    this.showInAssetPreview = showInAssetPreview;
    return this;
  }

  /**
   * Show record in asset preview like on entity header and search previews
   * @return showInAssetPreview
   **/
  @Schema(required = true, description = "Show record in asset preview like on entity header and search previews")
      @NotNull

    public Boolean isShowInAssetPreview() {
    return showInAssetPreview;
  }

  public void setShowInAssetPreview(Boolean showInAssetPreview) {
    this.showInAssetPreview = showInAssetPreview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalMemoryMetadataSettings institutionalMemoryMetadataSettings = (InstitutionalMemoryMetadataSettings) o;
    return Objects.equals(this.showInAssetPreview, institutionalMemoryMetadataSettings.showInAssetPreview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showInAssetPreview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalMemoryMetadataSettings {\n");
    
    sb.append("    showInAssetPreview: ").append(toIndentedString(showInAssetPreview)).append("\n");
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