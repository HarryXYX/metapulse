package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Edge;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about the outputs of a Data process
 */
@Schema(description = "Information about the outputs of a Data process")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInstanceOutput  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessInstanceOutput") @Builder.Default
  private String __type = "DataProcessInstanceOutput";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessInstanceOutput"},
  defaultValue = "DataProcessInstanceOutput")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("outputs") @Builder.Default
  @Valid
  private List<String> outputs = new ArrayList<>();

  @JsonProperty("outputEdges") @Builder.Default
  @Valid
  private List<Edge> outputEdges = null;

  public DataProcessInstanceOutput outputs(List<String> outputs) {
    this.outputs = outputs;
    return this;
  }

  public DataProcessInstanceOutput addOutputsItem(String outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Output assets produced
   * @return outputs
   **/
  @Schema(required = true, description = "Output assets produced")
      @NotNull

    public List<String> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<String> outputs) {
    this.outputs = outputs;
  }

  public DataProcessInstanceOutput outputEdges(List<Edge> outputEdges) {
    this.outputEdges = outputEdges;
    return this;
  }

  public DataProcessInstanceOutput addOutputEdgesItem(Edge outputEdgesItem) {
    if (this.outputEdges == null) {
      this.outputEdges = new ArrayList<>();
    }
    this.outputEdges.add(outputEdgesItem);
    return this;
  }

  /**
   * Output assets produced by the data process instance during processing, with additional metadata. Counts as lineage. Will eventually deprecate the outputs field.
   * @return outputEdges
   **/
  @Schema(description = "Output assets produced by the data process instance during processing, with additional metadata. Counts as lineage. Will eventually deprecate the outputs field.")
      @Valid
    public List<Edge> getOutputEdges() {
    return outputEdges;
  }

  public void setOutputEdges(List<Edge> outputEdges) {
    this.outputEdges = outputEdges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInstanceOutput dataProcessInstanceOutput = (DataProcessInstanceOutput) o;
    return Objects.equals(this.outputs, dataProcessInstanceOutput.outputs) &&
        Objects.equals(this.outputEdges, dataProcessInstanceOutput.outputEdges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputs, outputEdges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInstanceOutput {\n");
    
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    outputEdges: ").append(toIndentedString(outputEdges)).append("\n");
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