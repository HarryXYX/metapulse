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
 * Key for a DataHub Retention
 */
@Schema(description = "Key for a DataHub Retention")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubRetentionKey  implements OneOfDataHubRetentionSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubRetentionKey") @Builder.Default
  private String __type = "DataHubRetentionKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubRetentionKey"},
  defaultValue = "DataHubRetentionKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("entityName") @Builder.Default
  private String entityName = null;

  @JsonProperty("aspectName") @Builder.Default
  private String aspectName = null;

  public DataHubRetentionKey entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Entity name to apply retention to. * (or empty) for applying defaults.
   * @return entityName
   **/
  @Schema(required = true, description = "Entity name to apply retention to. * (or empty) for applying defaults.")
      @NotNull

    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public DataHubRetentionKey aspectName(String aspectName) {
    this.aspectName = aspectName;
    return this;
  }

  /**
   * Aspect name to apply retention to. * (or empty) for applying defaults.
   * @return aspectName
   **/
  @Schema(required = true, description = "Aspect name to apply retention to. * (or empty) for applying defaults.")
      @NotNull

    public String getAspectName() {
    return aspectName;
  }

  public void setAspectName(String aspectName) {
    this.aspectName = aspectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubRetentionKey dataHubRetentionKey = (DataHubRetentionKey) o;
    return Objects.equals(this.entityName, dataHubRetentionKey.entityName) &&
        Objects.equals(this.aspectName, dataHubRetentionKey.aspectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, aspectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRetentionKey {\n");
    
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    aspectName: ").append(toIndentedString(aspectName)).append("\n");
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