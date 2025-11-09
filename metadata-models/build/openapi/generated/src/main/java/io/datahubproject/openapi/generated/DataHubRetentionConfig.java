package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Retention;
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
 * DataHubRetentionConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubRetentionConfig  implements OneOfDataHubRetentionSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubRetentionConfig") @Builder.Default
  private String __type = "DataHubRetentionConfig";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubRetentionConfig"},
  defaultValue = "DataHubRetentionConfig")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("retention") @Builder.Default
  private Retention retention = null;

  public DataHubRetentionConfig retention(Retention retention) {
    this.retention = retention;
    return this;
  }

  /**
   * Get retention
   * @return retention
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Retention getRetention() {
    return retention;
  }

  public void setRetention(Retention retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubRetentionConfig dataHubRetentionConfig = (DataHubRetentionConfig) o;
    return Objects.equals(this.retention, dataHubRetentionConfig.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRetentionConfig {\n");
    
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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