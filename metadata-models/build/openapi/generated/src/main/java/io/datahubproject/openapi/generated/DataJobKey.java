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
 * Key for a Data Job
 */
@Schema(description = "Key for a Data Job")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataJobKey  implements OneOfDataJobSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataJobKey") @Builder.Default
  private String __type = "DataJobKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataJobKey"},
  defaultValue = "DataJobKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("flow") @Builder.Default
  private String flow = null;

  @JsonProperty("jobId") @Builder.Default
  private String jobId = null;

  public DataJobKey flow(String flow) {
    this.flow = flow;
    return this;
  }

  /**
   * Standardized data processing flow urn representing the flow for the job
   * @return flow
   **/
  @Schema(required = true, description = "Standardized data processing flow urn representing the flow for the job")
      @NotNull

    public String getFlow() {
    return flow;
  }

  public void setFlow(String flow) {
    this.flow = flow;
  }

  public DataJobKey jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Unique Identifier of the data job
   * @return jobId
   **/
  @Schema(required = true, description = "Unique Identifier of the data job")
      @NotNull

    public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataJobKey dataJobKey = (DataJobKey) o;
    return Objects.equals(this.flow, dataJobKey.flow) &&
        Objects.equals(this.jobId, dataJobKey.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataJobKey {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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