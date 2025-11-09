package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * Settings specific to a structured property entity
 */
@Schema(description = "Settings specific to a structured property entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredPropertySettings  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "StructuredPropertySettings") @Builder.Default
  private String __type = "StructuredPropertySettings";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"StructuredPropertySettings"},
  defaultValue = "StructuredPropertySettings")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("isHidden") @Builder.Default
  private Boolean isHidden = false;

  @JsonProperty("showInSearchFilters") @Builder.Default
  private Boolean showInSearchFilters = false;

  @JsonProperty("showInAssetSummary") @Builder.Default
  private Boolean showInAssetSummary = false;

  @JsonProperty("hideInAssetSummaryWhenEmpty") @Builder.Default
  private Boolean hideInAssetSummaryWhenEmpty = false;

  @JsonProperty("showAsAssetBadge") @Builder.Default
  private Boolean showAsAssetBadge = false;

  @JsonProperty("showInColumnsTable") @Builder.Default
  private Boolean showInColumnsTable = false;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public StructuredPropertySettings isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Whether or not this asset should be hidden in the main application
   * @return isHidden
   **/
  @Schema(required = true, description = "Whether or not this asset should be hidden in the main application")
      @NotNull

    public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public StructuredPropertySettings showInSearchFilters(Boolean showInSearchFilters) {
    this.showInSearchFilters = showInSearchFilters;
    return this;
  }

  /**
   * Whether or not this asset should be displayed as a search filter
   * @return showInSearchFilters
   **/
  @Schema(required = true, description = "Whether or not this asset should be displayed as a search filter")
      @NotNull

    public Boolean isShowInSearchFilters() {
    return showInSearchFilters;
  }

  public void setShowInSearchFilters(Boolean showInSearchFilters) {
    this.showInSearchFilters = showInSearchFilters;
  }

  public StructuredPropertySettings showInAssetSummary(Boolean showInAssetSummary) {
    this.showInAssetSummary = showInAssetSummary;
    return this;
  }

  /**
   * Whether or not this asset should be displayed in the asset sidebar
   * @return showInAssetSummary
   **/
  @Schema(required = true, description = "Whether or not this asset should be displayed in the asset sidebar")
      @NotNull

    public Boolean isShowInAssetSummary() {
    return showInAssetSummary;
  }

  public void setShowInAssetSummary(Boolean showInAssetSummary) {
    this.showInAssetSummary = showInAssetSummary;
  }

  public StructuredPropertySettings hideInAssetSummaryWhenEmpty(Boolean hideInAssetSummaryWhenEmpty) {
    this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
    return this;
  }

  /**
   * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled) when its value is empty
   * @return hideInAssetSummaryWhenEmpty
   **/
  @Schema(required = true, description = "Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled) when its value is empty")
      @NotNull

    public Boolean isHideInAssetSummaryWhenEmpty() {
    return hideInAssetSummaryWhenEmpty;
  }

  public void setHideInAssetSummaryWhenEmpty(Boolean hideInAssetSummaryWhenEmpty) {
    this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
  }

  public StructuredPropertySettings showAsAssetBadge(Boolean showAsAssetBadge) {
    this.showAsAssetBadge = showAsAssetBadge;
    return this;
  }

  /**
   * Whether or not this asset should be displayed as an asset badge on other asset's headers
   * @return showAsAssetBadge
   **/
  @Schema(required = true, description = "Whether or not this asset should be displayed as an asset badge on other asset's headers")
      @NotNull

    public Boolean isShowAsAssetBadge() {
    return showAsAssetBadge;
  }

  public void setShowAsAssetBadge(Boolean showAsAssetBadge) {
    this.showAsAssetBadge = showAsAssetBadge;
  }

  public StructuredPropertySettings showInColumnsTable(Boolean showInColumnsTable) {
    this.showInColumnsTable = showInColumnsTable;
    return this;
  }

  /**
   * Whether or not this asset should be displayed as a column in the schema field table in a Dataset's \"Columns\" tab.
   * @return showInColumnsTable
   **/
  @Schema(required = true, description = "Whether or not this asset should be displayed as a column in the schema field table in a Dataset's \"Columns\" tab.")
      @NotNull

    public Boolean isShowInColumnsTable() {
    return showInColumnsTable;
  }

  public void setShowInColumnsTable(Boolean showInColumnsTable) {
    this.showInColumnsTable = showInColumnsTable;
  }

  public StructuredPropertySettings lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredPropertySettings structuredPropertySettings = (StructuredPropertySettings) o;
    return Objects.equals(this.isHidden, structuredPropertySettings.isHidden) &&
        Objects.equals(this.showInSearchFilters, structuredPropertySettings.showInSearchFilters) &&
        Objects.equals(this.showInAssetSummary, structuredPropertySettings.showInAssetSummary) &&
        Objects.equals(this.hideInAssetSummaryWhenEmpty, structuredPropertySettings.hideInAssetSummaryWhenEmpty) &&
        Objects.equals(this.showAsAssetBadge, structuredPropertySettings.showAsAssetBadge) &&
        Objects.equals(this.showInColumnsTable, structuredPropertySettings.showInColumnsTable) &&
        Objects.equals(this.lastModified, structuredPropertySettings.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, showInSearchFilters, showInAssetSummary, hideInAssetSummaryWhenEmpty, showAsAssetBadge, showInColumnsTable, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPropertySettings {\n");
    
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    showInSearchFilters: ").append(toIndentedString(showInSearchFilters)).append("\n");
    sb.append("    showInAssetSummary: ").append(toIndentedString(showInAssetSummary)).append("\n");
    sb.append("    hideInAssetSummaryWhenEmpty: ").append(toIndentedString(hideInAssetSummaryWhenEmpty)).append("\n");
    sb.append("    showAsAssetBadge: ").append(toIndentedString(showAsAssetBadge)).append("\n");
    sb.append("    showInColumnsTable: ").append(toIndentedString(showInColumnsTable)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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