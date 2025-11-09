package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PlatformType;
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
 * Information about a data platform
 */
@Schema(description = "Information about a data platform")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPlatformInfo  implements OneOfDataPlatformSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataPlatformInfo") @Builder.Default
  private String __type = "DataPlatformInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataPlatformInfo"},
  defaultValue = "DataPlatformInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("type") @Builder.Default
  private PlatformType type = null;

  @JsonProperty("datasetNameDelimiter") @Builder.Default
  private String datasetNameDelimiter = null;

  @JsonProperty("logoUrl") @Builder.Default
  private String logoUrl = null;

  public DataPlatformInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the data platform
   * @return name
   **/
  @Schema(required = true, description = "Name of the data platform")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataPlatformInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The name that will be used for displaying a platform type.
   * @return displayName
   **/
  @Schema(description = "The name that will be used for displaying a platform type.")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DataPlatformInfo type(PlatformType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PlatformType getType() {
    return type;
  }

  public void setType(PlatformType type) {
    this.type = type;
  }

  public DataPlatformInfo datasetNameDelimiter(String datasetNameDelimiter) {
    this.datasetNameDelimiter = datasetNameDelimiter;
    return this;
  }

  /**
   * The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle
   * @return datasetNameDelimiter
   **/
  @Schema(required = true, description = "The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle")
      @NotNull

    public String getDatasetNameDelimiter() {
    return datasetNameDelimiter;
  }

  public void setDatasetNameDelimiter(String datasetNameDelimiter) {
    this.datasetNameDelimiter = datasetNameDelimiter;
  }

  public DataPlatformInfo logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * The URL for a logo associated with the platform
   * @return logoUrl
   **/
  @Schema(description = "The URL for a logo associated with the platform")
  
    public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlatformInfo dataPlatformInfo = (DataPlatformInfo) o;
    return Objects.equals(this.name, dataPlatformInfo.name) &&
        Objects.equals(this.displayName, dataPlatformInfo.displayName) &&
        Objects.equals(this.type, dataPlatformInfo.type) &&
        Objects.equals(this.datasetNameDelimiter, dataPlatformInfo.datasetNameDelimiter) &&
        Objects.equals(this.logoUrl, dataPlatformInfo.logoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, type, datasetNameDelimiter, logoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datasetNameDelimiter: ").append(toIndentedString(datasetNameDelimiter)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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