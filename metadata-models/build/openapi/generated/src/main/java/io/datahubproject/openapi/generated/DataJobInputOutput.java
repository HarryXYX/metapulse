package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Edge;
import io.datahubproject.openapi.generated.FineGrainedLineage;
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
 * Information about the inputs and outputs of a Data processing job
 */
@Schema(description = "Information about the inputs and outputs of a Data processing job")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataJobInputOutput  implements OneOfDataJobSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataJobInputOutput") @Builder.Default
  private String __type = "DataJobInputOutput";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataJobInputOutput"},
  defaultValue = "DataJobInputOutput")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("inputDatasets") @Builder.Default
  @Valid
  private List<String> inputDatasets = new ArrayList<>();

  @JsonProperty("inputDatasetEdges") @Builder.Default
  @Valid
  private List<Edge> inputDatasetEdges = null;

  @JsonProperty("outputDatasets") @Builder.Default
  @Valid
  private List<String> outputDatasets = new ArrayList<>();

  @JsonProperty("outputDatasetEdges") @Builder.Default
  @Valid
  private List<Edge> outputDatasetEdges = null;

  @JsonProperty("inputDatajobs") @Builder.Default
  @Valid
  private List<String> inputDatajobs = null;

  @JsonProperty("inputDatajobEdges") @Builder.Default
  @Valid
  private List<Edge> inputDatajobEdges = null;

  @JsonProperty("inputDatasetFields") @Builder.Default
  @Valid
  private List<String> inputDatasetFields = null;

  @JsonProperty("outputDatasetFields") @Builder.Default
  @Valid
  private List<String> outputDatasetFields = null;

  @JsonProperty("fineGrainedLineages") @Builder.Default
  @Valid
  private List<FineGrainedLineage> fineGrainedLineages = null;

  public DataJobInputOutput inputDatasets(List<String> inputDatasets) {
    this.inputDatasets = inputDatasets;
    return this;
  }

  public DataJobInputOutput addInputDatasetsItem(String inputDatasetsItem) {
    this.inputDatasets.add(inputDatasetsItem);
    return this;
  }

  /**
   * Input datasets consumed by the data job during processing Deprecated! Use inputDatasetEdges instead.
   * @return inputDatasets
   **/
  @Schema(required = true, description = "Input datasets consumed by the data job during processing Deprecated! Use inputDatasetEdges instead.")
      @NotNull

    public List<String> getInputDatasets() {
    return inputDatasets;
  }

  public void setInputDatasets(List<String> inputDatasets) {
    this.inputDatasets = inputDatasets;
  }

  public DataJobInputOutput inputDatasetEdges(List<Edge> inputDatasetEdges) {
    this.inputDatasetEdges = inputDatasetEdges;
    return this;
  }

  public DataJobInputOutput addInputDatasetEdgesItem(Edge inputDatasetEdgesItem) {
    if (this.inputDatasetEdges == null) {
      this.inputDatasetEdges = new ArrayList<>();
    }
    this.inputDatasetEdges.add(inputDatasetEdgesItem);
    return this;
  }

  /**
   * Input datasets consumed by the data job during processing
   * @return inputDatasetEdges
   **/
  @Schema(description = "Input datasets consumed by the data job during processing")
      @Valid
    public List<Edge> getInputDatasetEdges() {
    return inputDatasetEdges;
  }

  public void setInputDatasetEdges(List<Edge> inputDatasetEdges) {
    this.inputDatasetEdges = inputDatasetEdges;
  }

  public DataJobInputOutput outputDatasets(List<String> outputDatasets) {
    this.outputDatasets = outputDatasets;
    return this;
  }

  public DataJobInputOutput addOutputDatasetsItem(String outputDatasetsItem) {
    this.outputDatasets.add(outputDatasetsItem);
    return this;
  }

  /**
   * Output datasets produced by the data job during processing Deprecated! Use outputDatasetEdges instead.
   * @return outputDatasets
   **/
  @Schema(required = true, description = "Output datasets produced by the data job during processing Deprecated! Use outputDatasetEdges instead.")
      @NotNull

    public List<String> getOutputDatasets() {
    return outputDatasets;
  }

  public void setOutputDatasets(List<String> outputDatasets) {
    this.outputDatasets = outputDatasets;
  }

  public DataJobInputOutput outputDatasetEdges(List<Edge> outputDatasetEdges) {
    this.outputDatasetEdges = outputDatasetEdges;
    return this;
  }

  public DataJobInputOutput addOutputDatasetEdgesItem(Edge outputDatasetEdgesItem) {
    if (this.outputDatasetEdges == null) {
      this.outputDatasetEdges = new ArrayList<>();
    }
    this.outputDatasetEdges.add(outputDatasetEdgesItem);
    return this;
  }

  /**
   * Output datasets produced by the data job during processing
   * @return outputDatasetEdges
   **/
  @Schema(description = "Output datasets produced by the data job during processing")
      @Valid
    public List<Edge> getOutputDatasetEdges() {
    return outputDatasetEdges;
  }

  public void setOutputDatasetEdges(List<Edge> outputDatasetEdges) {
    this.outputDatasetEdges = outputDatasetEdges;
  }

  public DataJobInputOutput inputDatajobs(List<String> inputDatajobs) {
    this.inputDatajobs = inputDatajobs;
    return this;
  }

  public DataJobInputOutput addInputDatajobsItem(String inputDatajobsItem) {
    if (this.inputDatajobs == null) {
      this.inputDatajobs = new ArrayList<>();
    }
    this.inputDatajobs.add(inputDatajobsItem);
    return this;
  }

  /**
   * Input datajobs that this data job depends on Deprecated! Use inputDatajobEdges instead.
   * @return inputDatajobs
   **/
  @Schema(description = "Input datajobs that this data job depends on Deprecated! Use inputDatajobEdges instead.")
  
    public List<String> getInputDatajobs() {
    return inputDatajobs;
  }

  public void setInputDatajobs(List<String> inputDatajobs) {
    this.inputDatajobs = inputDatajobs;
  }

  public DataJobInputOutput inputDatajobEdges(List<Edge> inputDatajobEdges) {
    this.inputDatajobEdges = inputDatajobEdges;
    return this;
  }

  public DataJobInputOutput addInputDatajobEdgesItem(Edge inputDatajobEdgesItem) {
    if (this.inputDatajobEdges == null) {
      this.inputDatajobEdges = new ArrayList<>();
    }
    this.inputDatajobEdges.add(inputDatajobEdgesItem);
    return this;
  }

  /**
   * Input datajobs that this data job depends on
   * @return inputDatajobEdges
   **/
  @Schema(description = "Input datajobs that this data job depends on")
      @Valid
    public List<Edge> getInputDatajobEdges() {
    return inputDatajobEdges;
  }

  public void setInputDatajobEdges(List<Edge> inputDatajobEdges) {
    this.inputDatajobEdges = inputDatajobEdges;
  }

  public DataJobInputOutput inputDatasetFields(List<String> inputDatasetFields) {
    this.inputDatasetFields = inputDatasetFields;
    return this;
  }

  public DataJobInputOutput addInputDatasetFieldsItem(String inputDatasetFieldsItem) {
    if (this.inputDatasetFields == null) {
      this.inputDatasetFields = new ArrayList<>();
    }
    this.inputDatasetFields.add(inputDatasetFieldsItem);
    return this;
  }

  /**
   * Fields of the input datasets used by this job
   * @return inputDatasetFields
   **/
  @Schema(description = "Fields of the input datasets used by this job")
  
    public List<String> getInputDatasetFields() {
    return inputDatasetFields;
  }

  public void setInputDatasetFields(List<String> inputDatasetFields) {
    this.inputDatasetFields = inputDatasetFields;
  }

  public DataJobInputOutput outputDatasetFields(List<String> outputDatasetFields) {
    this.outputDatasetFields = outputDatasetFields;
    return this;
  }

  public DataJobInputOutput addOutputDatasetFieldsItem(String outputDatasetFieldsItem) {
    if (this.outputDatasetFields == null) {
      this.outputDatasetFields = new ArrayList<>();
    }
    this.outputDatasetFields.add(outputDatasetFieldsItem);
    return this;
  }

  /**
   * Fields of the output datasets this job writes to
   * @return outputDatasetFields
   **/
  @Schema(description = "Fields of the output datasets this job writes to")
  
    public List<String> getOutputDatasetFields() {
    return outputDatasetFields;
  }

  public void setOutputDatasetFields(List<String> outputDatasetFields) {
    this.outputDatasetFields = outputDatasetFields;
  }

  public DataJobInputOutput fineGrainedLineages(List<FineGrainedLineage> fineGrainedLineages) {
    this.fineGrainedLineages = fineGrainedLineages;
    return this;
  }

  public DataJobInputOutput addFineGrainedLineagesItem(FineGrainedLineage fineGrainedLineagesItem) {
    if (this.fineGrainedLineages == null) {
      this.fineGrainedLineages = new ArrayList<>();
    }
    this.fineGrainedLineages.add(fineGrainedLineagesItem);
    return this;
  }

  /**
   * Fine-grained column-level lineages Not currently supported in the UI Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
   * @return fineGrainedLineages
   **/
  @Schema(description = "Fine-grained column-level lineages Not currently supported in the UI Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI")
      @Valid
    public List<FineGrainedLineage> getFineGrainedLineages() {
    return fineGrainedLineages;
  }

  public void setFineGrainedLineages(List<FineGrainedLineage> fineGrainedLineages) {
    this.fineGrainedLineages = fineGrainedLineages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataJobInputOutput dataJobInputOutput = (DataJobInputOutput) o;
    return Objects.equals(this.inputDatasets, dataJobInputOutput.inputDatasets) &&
        Objects.equals(this.inputDatasetEdges, dataJobInputOutput.inputDatasetEdges) &&
        Objects.equals(this.outputDatasets, dataJobInputOutput.outputDatasets) &&
        Objects.equals(this.outputDatasetEdges, dataJobInputOutput.outputDatasetEdges) &&
        Objects.equals(this.inputDatajobs, dataJobInputOutput.inputDatajobs) &&
        Objects.equals(this.inputDatajobEdges, dataJobInputOutput.inputDatajobEdges) &&
        Objects.equals(this.inputDatasetFields, dataJobInputOutput.inputDatasetFields) &&
        Objects.equals(this.outputDatasetFields, dataJobInputOutput.outputDatasetFields) &&
        Objects.equals(this.fineGrainedLineages, dataJobInputOutput.fineGrainedLineages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputDatasets, inputDatasetEdges, outputDatasets, outputDatasetEdges, inputDatajobs, inputDatajobEdges, inputDatasetFields, outputDatasetFields, fineGrainedLineages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataJobInputOutput {\n");
    
    sb.append("    inputDatasets: ").append(toIndentedString(inputDatasets)).append("\n");
    sb.append("    inputDatasetEdges: ").append(toIndentedString(inputDatasetEdges)).append("\n");
    sb.append("    outputDatasets: ").append(toIndentedString(outputDatasets)).append("\n");
    sb.append("    outputDatasetEdges: ").append(toIndentedString(outputDatasetEdges)).append("\n");
    sb.append("    inputDatajobs: ").append(toIndentedString(inputDatajobs)).append("\n");
    sb.append("    inputDatajobEdges: ").append(toIndentedString(inputDatajobEdges)).append("\n");
    sb.append("    inputDatasetFields: ").append(toIndentedString(inputDatasetFields)).append("\n");
    sb.append("    outputDatasetFields: ").append(toIndentedString(outputDatasetFields)).append("\n");
    sb.append("    fineGrainedLineages: ").append(toIndentedString(fineGrainedLineages)).append("\n");
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