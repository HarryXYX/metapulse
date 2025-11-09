package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.PlatformResourceInfoAspectResponseV2;
import io.datahubproject.openapi.generated.PlatformResourceKeyAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Platform Resources are assets that are unmodeled and stored outside of the core data model. They are stored in DataHub primarily to help with application-specific use-cases that are not sufficiently generalized to move into the core data model.
 */
@Schema(description = "Platform Resources are assets that are unmodeled and stored outside of the core data model. They are stored in DataHub primarily to help with application-specific use-cases that are not sufficiently generalized to move into the core data model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformResourceEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("platformResourceKey") @Builder.Default
  private PlatformResourceKeyAspectResponseV2 platformResourceKey = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("platformResourceInfo") @Builder.Default
  private PlatformResourceInfoAspectResponseV2 platformResourceInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  public PlatformResourceEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for platformResource
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for platformResource")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public PlatformResourceEntityResponseV2 platformResourceKey(PlatformResourceKeyAspectResponseV2 platformResourceKey) {
    this.platformResourceKey = platformResourceKey;
    return this;
  }

  /**
   * Get platformResourceKey
   * @return platformResourceKey
   **/
  @Schema(description = "")
  
    @Valid
    public PlatformResourceKeyAspectResponseV2 getPlatformResourceKey() {
    return platformResourceKey;
  }

  public void setPlatformResourceKey(PlatformResourceKeyAspectResponseV2 platformResourceKey) {
    this.platformResourceKey = platformResourceKey;
  }

  public PlatformResourceEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectResponseV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public PlatformResourceEntityResponseV2 platformResourceInfo(PlatformResourceInfoAspectResponseV2 platformResourceInfo) {
    this.platformResourceInfo = platformResourceInfo;
    return this;
  }

  /**
   * Get platformResourceInfo
   * @return platformResourceInfo
   **/
  @Schema(description = "")
  
    @Valid
    public PlatformResourceInfoAspectResponseV2 getPlatformResourceInfo() {
    return platformResourceInfo;
  }

  public void setPlatformResourceInfo(PlatformResourceInfoAspectResponseV2 platformResourceInfo) {
    this.platformResourceInfo = platformResourceInfo;
  }

  public PlatformResourceEntityResponseV2 status(StatusAspectResponseV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectResponseV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectResponseV2 status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformResourceEntityResponseV2 platformResourceEntityResponseV2 = (PlatformResourceEntityResponseV2) o;
    return Objects.equals(this.urn, platformResourceEntityResponseV2.urn) &&
        Objects.equals(this.platformResourceKey, platformResourceEntityResponseV2.platformResourceKey) &&
        Objects.equals(this.dataPlatformInstance, platformResourceEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.platformResourceInfo, platformResourceEntityResponseV2.platformResourceInfo) &&
        Objects.equals(this.status, platformResourceEntityResponseV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, platformResourceKey, dataPlatformInstance, platformResourceInfo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResourceEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    platformResourceKey: ").append(toIndentedString(platformResourceKey)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    platformResourceInfo: ").append(toIndentedString(platformResourceInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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