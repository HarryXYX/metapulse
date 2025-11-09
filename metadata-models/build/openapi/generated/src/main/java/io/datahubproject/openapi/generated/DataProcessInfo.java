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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The inputs and outputs of this data process
 */
@Schema(description = "The inputs and outputs of this data process")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInfo  implements OneOfDataProcessSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessInfo") @Builder.Default
  private String __type = "DataProcessInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessInfo"},
  defaultValue = "DataProcessInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("inputs") @Builder.Default
  @Valid
  private List<String> inputs = null;

  @JsonProperty("outputs") @Builder.Default
  @Valid
  private List<String> outputs = null;

  public DataProcessInfo inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public DataProcessInfo addInputsItem(String inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * the inputs of the data process
   * @return inputs
   **/
  @Schema(description = "the inputs of the data process")
  
    public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public DataProcessInfo outputs(List<String> outputs) {
    this.outputs = outputs;
    return this;
  }

  public DataProcessInfo addOutputsItem(String outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * the outputs of the data process
   * @return outputs
   **/
  @Schema(description = "the outputs of the data process")
  
    public List<String> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<String> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInfo dataProcessInfo = (DataProcessInfo) o;
    return Objects.equals(this.inputs, dataProcessInfo.inputs) &&
        Objects.equals(this.outputs, dataProcessInfo.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInfo {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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