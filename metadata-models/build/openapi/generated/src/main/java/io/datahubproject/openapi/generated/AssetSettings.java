package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssetSummarySettings;
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
 * Settings associated with this asset
 */
@Schema(description = "Settings associated with this asset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetSettings  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "AssetSettings") @Builder.Default
  private String __type = "AssetSettings";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"AssetSettings"},
  defaultValue = "AssetSettings")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("assetSummary") @Builder.Default
  private AssetSummarySettings assetSummary = null;

  public AssetSettings assetSummary(AssetSummarySettings assetSummary) {
    this.assetSummary = assetSummary;
    return this;
  }

  /**
   * Get assetSummary
   * @return assetSummary
   **/
  @Schema(description = "")
  
    @Valid
    public AssetSummarySettings getAssetSummary() {
    return assetSummary;
  }

  public void setAssetSummary(AssetSummarySettings assetSummary) {
    this.assetSummary = assetSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetSettings assetSettings = (AssetSettings) o;
    return Objects.equals(this.assetSummary, assetSettings.assetSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSettings {\n");
    
    sb.append("    assetSummary: ").append(toIndentedString(assetSummary)).append("\n");
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