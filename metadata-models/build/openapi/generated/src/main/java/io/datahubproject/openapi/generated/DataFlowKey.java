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
 * Key for a Data Flow
 */
@Schema(description = "Key for a Data Flow")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFlowKey  implements OneOfDataFlowSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataFlowKey") @Builder.Default
  private String __type = "DataFlowKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataFlowKey"},
  defaultValue = "DataFlowKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("orchestrator") @Builder.Default
  private String orchestrator = null;

  @JsonProperty("flowId") @Builder.Default
  private String flowId = null;

  @JsonProperty("cluster") @Builder.Default
  private String cluster = null;

  public DataFlowKey orchestrator(String orchestrator) {
    this.orchestrator = orchestrator;
    return this;
  }

  /**
   * Workflow manager like azkaban, airflow which orchestrates the flow
   * @return orchestrator
   **/
  @Schema(required = true, description = "Workflow manager like azkaban, airflow which orchestrates the flow")
      @NotNull

    public String getOrchestrator() {
    return orchestrator;
  }

  public void setOrchestrator(String orchestrator) {
    this.orchestrator = orchestrator;
  }

  public DataFlowKey flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

  /**
   * Unique Identifier of the data flow
   * @return flowId
   **/
  @Schema(required = true, description = "Unique Identifier of the data flow")
      @NotNull

    public String getFlowId() {
    return flowId;
  }

  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  public DataFlowKey cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Cluster where the flow is executed
   * @return cluster
   **/
  @Schema(required = true, description = "Cluster where the flow is executed")
      @NotNull

    public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFlowKey dataFlowKey = (DataFlowKey) o;
    return Objects.equals(this.orchestrator, dataFlowKey.orchestrator) &&
        Objects.equals(this.flowId, dataFlowKey.flowId) &&
        Objects.equals(this.cluster, dataFlowKey.cluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orchestrator, flowId, cluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowKey {\n");
    
    sb.append("    orchestrator: ").append(toIndentedString(orchestrator)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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