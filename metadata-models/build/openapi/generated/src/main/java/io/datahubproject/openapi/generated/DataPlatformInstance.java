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
 * The specific instance of the data platform that this entity belongs to
 */
@Schema(description = "The specific instance of the data platform that this entity belongs to")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPlatformInstance  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelDeploymentSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataPlatformInstance") @Builder.Default
  private String __type = "DataPlatformInstance";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataPlatformInstance"},
  defaultValue = "DataPlatformInstance")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("platform") @Builder.Default
  private String platform = null;

  @JsonProperty("instance") @Builder.Default
  private String instance = null;

  public DataPlatformInstance platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Data Platform
   * @return platform
   **/
  @Schema(required = true, description = "Data Platform")
      @NotNull

    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public DataPlatformInstance instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Instance of the data platform (e.g. db instance)
   * @return instance
   **/
  @Schema(description = "Instance of the data platform (e.g. db instance)")
  
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
    DataPlatformInstance dataPlatformInstance = (DataPlatformInstance) o;
    return Objects.equals(this.platform, dataPlatformInstance.platform) &&
        Objects.equals(this.instance, dataPlatformInstance.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlatformInstance {\n");
    
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