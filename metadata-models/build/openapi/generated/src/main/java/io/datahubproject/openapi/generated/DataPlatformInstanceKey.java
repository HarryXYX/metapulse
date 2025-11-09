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
 * Key for a Dataset
 */
@Schema(description = "Key for a Dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPlatformInstanceKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataPlatformInstanceKey") @Builder.Default
  private String __type = "DataPlatformInstanceKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataPlatformInstanceKey"},
  defaultValue = "DataPlatformInstanceKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("instance") @Builder.Default
  private String instance = null;

  public DataPlatformInstanceKey platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Data platform urn associated with the instance
   * @return platform
   **/
  @Schema(required = true, description = "Data platform urn associated with the instance")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public DataPlatformInstanceKey instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Unique instance id
   * @return instance
   **/
  @Schema(required = true, description = "Unique instance id")
      @NotNull

    public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlatformInstanceKey dataPlatformInstanceKey = (DataPlatformInstanceKey) o;
    return Objects.equals(this.platform, dataPlatformInstanceKey.platform) &&
        Objects.equals(this.instance, dataPlatformInstanceKey.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformInstanceKey {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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