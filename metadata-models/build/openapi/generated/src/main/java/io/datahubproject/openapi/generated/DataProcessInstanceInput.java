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
 * Information about the inputs datasets of a Data process
 */
@Schema(description = "Information about the inputs datasets of a Data process")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInstanceInput  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessInstanceInput") @Builder.Default
  private String __type = "DataProcessInstanceInput";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessInstanceInput"},
  defaultValue = "DataProcessInstanceInput")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("inputs") @Builder.Default
  @Valid
  private List<String> inputs = new ArrayList<>();

  @JsonProperty("inputEdges") @Builder.Default
  @Valid
  private List<Edge> inputEdges = null;

  public DataProcessInstanceInput inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public DataProcessInstanceInput addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Input assets consumed
   * @return inputs
   **/
  @Schema(required = true, description = "Input assets consumed")
      @NotNull

    public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public DataProcessInstanceInput inputEdges(List<Edge> inputEdges) {
    this.inputEdges = inputEdges;
    return this;
  }

  public DataProcessInstanceInput addInputEdgesItem(Edge inputEdgesItem) {
    if (this.inputEdges == null) {
      this.inputEdges = new ArrayList<>();
    }
    this.inputEdges.add(inputEdgesItem);
    return this;
  }

  /**
   * Input assets consumed by the data process instance, with additional metadata. Counts as lineage. Will eventually deprecate the inputs field.
   * @return inputEdges
   **/
  @Schema(description = "Input assets consumed by the data process instance, with additional metadata. Counts as lineage. Will eventually deprecate the inputs field.")
      @Valid
    public List<Edge> getInputEdges() {
    return inputEdges;
  }

  public void setInputEdges(List<Edge> inputEdges) {
    this.inputEdges = inputEdges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInstanceInput dataProcessInstanceInput = (DataProcessInstanceInput) o;
    return Objects.equals(this.inputs, dataProcessInstanceInput.inputs) &&
        Objects.equals(this.inputEdges, dataProcessInstanceInput.inputEdges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, inputEdges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInstanceInput {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    inputEdges: ").append(toIndentedString(inputEdges)).append("\n");
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