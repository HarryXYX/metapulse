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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Key for a Data Platform
 */
@Schema(description = "Key for a Data Platform")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPlatformKey  implements OneOfDataPlatformSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataPlatformKey") @Builder.Default
  private String __type = "DataPlatformKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataPlatformKey"},
  defaultValue = "DataPlatformKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("platformName") @Builder.Default
  private String platformName = null;

  public DataPlatformKey platformName(String platformName) {
    this.platformName = platformName;
    return this;
  }

  /**
   * Data platform name i.e. hdfs, oracle, espresso
   * @return platformName
   **/
  @Schema(required = true, description = "Data platform name i.e. hdfs, oracle, espresso")
      @NotNull

    public String getPlatformName() {
    return platformName;
  }

  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlatformKey dataPlatformKey = (DataPlatformKey) o;
    return Objects.equals(this.platformName, dataPlatformKey.platformName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformKey {\n");
    
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
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