package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * An signal sent to a running execution request
 */
@Schema(description = "An signal sent to a running execution request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubExecutionRequestSignal  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubExecutionRequestSignal") @Builder.Default
  private String __type = "DataHubExecutionRequestSignal";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubExecutionRequestSignal"},
  defaultValue = "DataHubExecutionRequestSignal")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("signal") @Builder.Default
  private String signal = null;

  @JsonProperty("executorId") @Builder.Default
  private String executorId = null;

  @JsonProperty("createdAt") @Builder.Default
  private AuditStamp createdAt = null;

  public DataHubExecutionRequestSignal signal(String signal) {
    this.signal = signal;
    return this;
  }

  /**
   * The signal to issue, e.g. KILL
   * @return signal
   **/
  @Schema(required = true, description = "The signal to issue, e.g. KILL")
      @NotNull

    public String getSignal() {
    return signal;
  }

  public void setSignal(String signal) {
    this.signal = signal;
  }

  public DataHubExecutionRequestSignal executorId(String executorId) {
    this.executorId = executorId;
    return this;
  }

  /**
   * Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.
   * @return executorId
   **/
  @Schema(description = "Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.")
  
    public String getExecutorId() {
    return executorId;
  }

  public void setExecutorId(String executorId) {
    this.executorId = executorId;
  }

  public DataHubExecutionRequestSignal createdAt(AuditStamp createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(AuditStamp createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubExecutionRequestSignal dataHubExecutionRequestSignal = (DataHubExecutionRequestSignal) o;
    return Objects.equals(this.signal, dataHubExecutionRequestSignal.signal) &&
        Objects.equals(this.executorId, dataHubExecutionRequestSignal.executorId) &&
        Objects.equals(this.createdAt, dataHubExecutionRequestSignal.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signal, executorId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubExecutionRequestSignal {\n");
    
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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