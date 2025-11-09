package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.PlatformResourceInfoAspectRequestV2;
import io.datahubproject.openapi.generated.PlatformResourceKeyAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
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
public class PlatformResourceEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("platformResourceKey") @Builder.Default
  private PlatformResourceKeyAspectRequestV2 platformResourceKey = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("platformResourceInfo") @Builder.Default
  private PlatformResourceInfoAspectRequestV2 platformResourceInfo = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  public PlatformResourceEntityRequestV2 urn(String urn) {
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

  public PlatformResourceEntityRequestV2 platformResourceKey(PlatformResourceKeyAspectRequestV2 platformResourceKey) {
    this.platformResourceKey = platformResourceKey;
    return this;
  }

  /**
   * Get platformResourceKey
   * @return platformResourceKey
   **/
  @Schema(description = "")
  
    @Valid
    public PlatformResourceKeyAspectRequestV2 getPlatformResourceKey() {
    return platformResourceKey;
  }

  public void setPlatformResourceKey(PlatformResourceKeyAspectRequestV2 platformResourceKey) {
    this.platformResourceKey = platformResourceKey;
  }

  public PlatformResourceEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectRequestV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public PlatformResourceEntityRequestV2 platformResourceInfo(PlatformResourceInfoAspectRequestV2 platformResourceInfo) {
    this.platformResourceInfo = platformResourceInfo;
    return this;
  }

  /**
   * Get platformResourceInfo
   * @return platformResourceInfo
   **/
  @Schema(description = "")
  
    @Valid
    public PlatformResourceInfoAspectRequestV2 getPlatformResourceInfo() {
    return platformResourceInfo;
  }

  public void setPlatformResourceInfo(PlatformResourceInfoAspectRequestV2 platformResourceInfo) {
    this.platformResourceInfo = platformResourceInfo;
  }

  public PlatformResourceEntityRequestV2 status(StatusAspectRequestV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectRequestV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectRequestV2 status) {
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
    PlatformResourceEntityRequestV2 platformResourceEntityRequestV2 = (PlatformResourceEntityRequestV2) o;
    return Objects.equals(this.urn, platformResourceEntityRequestV2.urn) &&
        Objects.equals(this.platformResourceKey, platformResourceEntityRequestV2.platformResourceKey) &&
        Objects.equals(this.dataPlatformInstance, platformResourceEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.platformResourceInfo, platformResourceEntityRequestV2.platformResourceInfo) &&
        Objects.equals(this.status, platformResourceEntityRequestV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, platformResourceKey, dataPlatformInstance, platformResourceInfo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResourceEntityRequestV2 {\n");
    
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