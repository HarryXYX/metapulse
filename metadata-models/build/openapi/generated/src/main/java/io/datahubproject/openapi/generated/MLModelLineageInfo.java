package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups
 */
@Schema(description = "A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelLineageInfo   {

  @JsonProperty("trainingJobs") @Builder.Default
  @Valid
  private List<String> trainingJobs = null;

  @JsonProperty("downstreamJobs") @Builder.Default
  @Valid
  private List<String> downstreamJobs = null;

  public MLModelLineageInfo trainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
    return this;
  }

  public MLModelLineageInfo addTrainingJobsItem(String trainingJobsItem) {
    if (this.trainingJobs == null) {
      this.trainingJobs = new ArrayList<>();
    }
    this.trainingJobs.add(trainingJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
   * @return trainingJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.")
  
    public List<String> getTrainingJobs() {
    return trainingJobs;
  }

  public void setTrainingJobs(List<String> trainingJobs) {
    this.trainingJobs = trainingJobs;
  }

  public MLModelLineageInfo downstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
    return this;
  }

  public MLModelLineageInfo addDownstreamJobsItem(String downstreamJobsItem) {
    if (this.downstreamJobs == null) {
      this.downstreamJobs = new ArrayList<>();
    }
    this.downstreamJobs.add(downstreamJobsItem);
    return this;
  }

  /**
   * List of jobs or process instances (if any) that use the model or group.
   * @return downstreamJobs
   **/
  @Schema(description = "List of jobs or process instances (if any) that use the model or group.")
  
    public List<String> getDownstreamJobs() {
    return downstreamJobs;
  }

  public void setDownstreamJobs(List<String> downstreamJobs) {
    this.downstreamJobs = downstreamJobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelLineageInfo mlModelLineageInfo = (MLModelLineageInfo) o;
    return Objects.equals(this.trainingJobs, mlModelLineageInfo.trainingJobs) &&
        Objects.equals(this.downstreamJobs, mlModelLineageInfo.downstreamJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingJobs, downstreamJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelLineageInfo {\n");
    
    sb.append("    trainingJobs: ").append(toIndentedString(trainingJobs)).append("\n");
    sb.append("    downstreamJobs: ").append(toIndentedString(downstreamJobs)).append("\n");
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