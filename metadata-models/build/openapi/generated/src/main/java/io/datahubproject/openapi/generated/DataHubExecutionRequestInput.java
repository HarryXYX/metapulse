package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ExecutionRequestSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * An request to execution some remote logic or action. TODO: Determine who is responsible for emitting execution request success or failure. Executor?
 */
@Schema(description = "An request to execution some remote logic or action. TODO: Determine who is responsible for emitting execution request success or failure. Executor?")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubExecutionRequestInput  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubExecutionRequestInput") @Builder.Default
  private String __type = "DataHubExecutionRequestInput";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubExecutionRequestInput"},
  defaultValue = "DataHubExecutionRequestInput")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("task") @Builder.Default
  private String task = null;

  @JsonProperty("args") @Builder.Default
  @Valid
  private Map<String, String> args = new HashMap<>();

  @JsonProperty("executorId") @Builder.Default
  private String executorId = null;

  @JsonProperty("source") @Builder.Default
  private ExecutionRequestSource source = null;

  @JsonProperty("requestedAt") @Builder.Default
  private Long requestedAt = null;

  @JsonProperty("actorUrn") @Builder.Default
  private String actorUrn = null;

  public DataHubExecutionRequestInput task(String task) {
    this.task = task;
    return this;
  }

  /**
   * The name of the task to execute, for example RUN_INGEST
   * @return task
   **/
  @Schema(required = true, description = "The name of the task to execute, for example RUN_INGEST")
      @NotNull

    public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public DataHubExecutionRequestInput args(Map<String, String> args) {
    this.args = args;
    return this;
  }

  public DataHubExecutionRequestInput putArgsItem(String key, String argsItem) {
    this.args.put(key, argsItem);
    return this;
  }

  /**
   * Arguments provided to the task
   * @return args
   **/
  @Schema(required = true, description = "Arguments provided to the task")
      @NotNull

    public Map<String, String> getArgs() {
    return args;
  }

  public void setArgs(Map<String, String> args) {
    this.args = args;
  }

  public DataHubExecutionRequestInput executorId(String executorId) {
    this.executorId = executorId;
    return this;
  }

  /**
   * Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.
   * @return executorId
   **/
  @Schema(required = true, description = "Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.")
      @NotNull

    public String getExecutorId() {
    return executorId;
  }

  public void setExecutorId(String executorId) {
    this.executorId = executorId;
  }

  public DataHubExecutionRequestInput source(ExecutionRequestSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ExecutionRequestSource getSource() {
    return source;
  }

  public void setSource(ExecutionRequestSource source) {
    this.source = source;
  }

  public DataHubExecutionRequestInput requestedAt(Long requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Time at which the execution request input was created
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return requestedAt
   **/
  @Schema(required = true, description = "Time at which the execution request input was created")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(Long requestedAt) {
    this.requestedAt = requestedAt;
  }

  public DataHubExecutionRequestInput actorUrn(String actorUrn) {
    this.actorUrn = actorUrn;
    return this;
  }

  /**
   * Urn of the actor who created this execution request.
   * @return actorUrn
   **/
  @Schema(description = "Urn of the actor who created this execution request.")
  
    public String getActorUrn() {
    return actorUrn;
  }

  public void setActorUrn(String actorUrn) {
    this.actorUrn = actorUrn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubExecutionRequestInput dataHubExecutionRequestInput = (DataHubExecutionRequestInput) o;
    return Objects.equals(this.task, dataHubExecutionRequestInput.task) &&
        Objects.equals(this.args, dataHubExecutionRequestInput.args) &&
        Objects.equals(this.executorId, dataHubExecutionRequestInput.executorId) &&
        Objects.equals(this.source, dataHubExecutionRequestInput.source) &&
        Objects.equals(this.requestedAt, dataHubExecutionRequestInput.requestedAt) &&
        Objects.equals(this.actorUrn, dataHubExecutionRequestInput.actorUrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task, args, executorId, source, requestedAt, actorUrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubExecutionRequestInput {\n");
    
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    actorUrn: ").append(toIndentedString(actorUrn)).append("\n");
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