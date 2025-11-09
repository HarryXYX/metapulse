package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubPageModuleKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DataHubPageModulePropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataHubPageModule object.
 */
@Schema(description = "DataHubPageModule object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageModuleEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubPageModuleKey") @Builder.Default
  private DataHubPageModuleKeyAspectResponseV2 dataHubPageModuleKey = null;

  @JsonProperty("dataHubPageModuleProperties") @Builder.Default
  private DataHubPageModulePropertiesAspectResponseV2 dataHubPageModuleProperties = null;

  public DataHubPageModuleEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataHubPageModule
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataHubPageModule")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataHubPageModuleEntityResponseV2 dataHubPageModuleKey(DataHubPageModuleKeyAspectResponseV2 dataHubPageModuleKey) {
    this.dataHubPageModuleKey = dataHubPageModuleKey;
    return this;
  }

  /**
   * Get dataHubPageModuleKey
   * @return dataHubPageModuleKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubPageModuleKeyAspectResponseV2 getDataHubPageModuleKey() {
    return dataHubPageModuleKey;
  }

  public void setDataHubPageModuleKey(DataHubPageModuleKeyAspectResponseV2 dataHubPageModuleKey) {
    this.dataHubPageModuleKey = dataHubPageModuleKey;
  }

  public DataHubPageModuleEntityResponseV2 dataHubPageModuleProperties(DataHubPageModulePropertiesAspectResponseV2 dataHubPageModuleProperties) {
    this.dataHubPageModuleProperties = dataHubPageModuleProperties;
    return this;
  }

  /**
   * Get dataHubPageModuleProperties
   * @return dataHubPageModuleProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubPageModulePropertiesAspectResponseV2 getDataHubPageModuleProperties() {
    return dataHubPageModuleProperties;
  }

  public void setDataHubPageModuleProperties(DataHubPageModulePropertiesAspectResponseV2 dataHubPageModuleProperties) {
    this.dataHubPageModuleProperties = dataHubPageModuleProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageModuleEntityResponseV2 dataHubPageModuleEntityResponseV2 = (DataHubPageModuleEntityResponseV2) o;
    return Objects.equals(this.urn, dataHubPageModuleEntityResponseV2.urn) &&
        Objects.equals(this.dataHubPageModuleKey, dataHubPageModuleEntityResponseV2.dataHubPageModuleKey) &&
        Objects.equals(this.dataHubPageModuleProperties, dataHubPageModuleEntityResponseV2.dataHubPageModuleProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubPageModuleKey, dataHubPageModuleProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageModuleEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataHubPageModuleKey: ").append(toIndentedString(dataHubPageModuleKey)).append("\n");
    sb.append("    dataHubPageModuleProperties: ").append(toIndentedString(dataHubPageModuleProperties)).append("\n");
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