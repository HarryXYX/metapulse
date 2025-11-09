package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
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
 * Key for a Data Process
 */
@Schema(description = "Key for a Data Process")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessKey  implements OneOfDataProcessSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessKey") @Builder.Default
  private String __type = "DataProcessKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessKey"},
  defaultValue = "DataProcessKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("orchestrator") @Builder.Default
  private String orchestrator = null;

  @JsonProperty("origin") @Builder.Default
  private FabricType origin = null;

  public DataProcessKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Process name i.e. an ETL job name
   * @return name
   **/
  @Schema(required = true, description = "Process name i.e. an ETL job name")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataProcessKey orchestrator(String orchestrator) {
    this.orchestrator = orchestrator;
    return this;
  }

  /**
   * Standardized Orchestrator where data process is defined. TODO: Migrate towards something that can be validated like DataPlatform urn
   * @return orchestrator
   **/
  @Schema(required = true, description = "Standardized Orchestrator where data process is defined. TODO: Migrate towards something that can be validated like DataPlatform urn")
      @NotNull

    public String getOrchestrator() {
    return orchestrator;
  }

  public void setOrchestrator(String orchestrator) {
    this.orchestrator = orchestrator;
  }

  public DataProcessKey origin(FabricType origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FabricType getOrigin() {
    return origin;
  }

  public void setOrigin(FabricType origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessKey dataProcessKey = (DataProcessKey) o;
    return Objects.equals(this.name, dataProcessKey.name) &&
        Objects.equals(this.orchestrator, dataProcessKey.orchestrator) &&
        Objects.equals(this.origin, dataProcessKey.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, orchestrator, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessKey {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orchestrator: ").append(toIndentedString(orchestrator)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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