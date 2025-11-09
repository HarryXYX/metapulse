package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdAggregation;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.DatasetAssertionScope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
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
/**
 * Attributes that are applicable to single-Dataset Assertions
 */
@Schema(description = "Attributes that are applicable to single-Dataset Assertions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetAssertionInfo   {

  @JsonProperty("dataset") @Builder.Default
  private String dataset = null;

  @JsonProperty("scope") @Builder.Default
  private DatasetAssertionScope scope = null;

  @JsonProperty("fields") @Builder.Default
  @Valid
  private List<String> fields = null;

  @JsonProperty("aggregation") @Builder.Default
  private AssertionStdAggregation aggregation = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  @JsonProperty("nativeType") @Builder.Default
  private String nativeType = null;

  @JsonProperty("nativeParameters") @Builder.Default
  @Valid
  private Map<String, String> nativeParameters = null;

  @JsonProperty("logic") @Builder.Default
  private String logic = null;

  public DatasetAssertionInfo dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The dataset targeted by this assertion.
   * @return dataset
   **/
  @Schema(required = true, description = "The dataset targeted by this assertion.")
      @NotNull

    public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public DatasetAssertionInfo scope(DatasetAssertionScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DatasetAssertionScope getScope() {
    return scope;
  }

  public void setScope(DatasetAssertionScope scope) {
    this.scope = scope;
  }

  public DatasetAssertionInfo fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public DatasetAssertionInfo addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * One or more dataset schema fields that are targeted by this assertion.  This field is expected to be provided if the assertion scope is DATASET_COLUMN.
   * @return fields
   **/
  @Schema(description = "One or more dataset schema fields that are targeted by this assertion.  This field is expected to be provided if the assertion scope is DATASET_COLUMN.")
  
    public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public DatasetAssertionInfo aggregation(AssertionStdAggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Get aggregation
   * @return aggregation
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(AssertionStdAggregation aggregation) {
    this.aggregation = aggregation;
  }

  public DatasetAssertionInfo operator(AssertionStdOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssertionStdOperator getOperator() {
    return operator;
  }

  public void setOperator(AssertionStdOperator operator) {
    this.operator = operator;
  }

  public DatasetAssertionInfo parameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionStdParameters getParameters() {
    return parameters;
  }

  public void setParameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
  }

  public DatasetAssertionInfo nativeType(String nativeType) {
    this.nativeType = nativeType;
    return this;
  }

  /**
   * Native assertion type
   * @return nativeType
   **/
  @Schema(description = "Native assertion type")
  
    public String getNativeType() {
    return nativeType;
  }

  public void setNativeType(String nativeType) {
    this.nativeType = nativeType;
  }

  public DatasetAssertionInfo nativeParameters(Map<String, String> nativeParameters) {
    this.nativeParameters = nativeParameters;
    return this;
  }

  public DatasetAssertionInfo putNativeParametersItem(String key, String nativeParametersItem) {
    if (this.nativeParameters == null) {
      this.nativeParameters = new HashMap<>();
    }
    this.nativeParameters.put(key, nativeParametersItem);
    return this;
  }

  /**
   * Native parameters required for the assertion.
   * @return nativeParameters
   **/
  @Schema(description = "Native parameters required for the assertion.")
  
    public Map<String, String> getNativeParameters() {
    return nativeParameters;
  }

  public void setNativeParameters(Map<String, String> nativeParameters) {
    this.nativeParameters = nativeParameters;
  }

  public DatasetAssertionInfo logic(String logic) {
    this.logic = logic;
    return this;
  }

  /**
   * Get logic
   * @return logic
   **/
  @Schema(description = "")
  
    public String getLogic() {
    return logic;
  }

  public void setLogic(String logic) {
    this.logic = logic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetAssertionInfo datasetAssertionInfo = (DatasetAssertionInfo) o;
    return Objects.equals(this.dataset, datasetAssertionInfo.dataset) &&
        Objects.equals(this.scope, datasetAssertionInfo.scope) &&
        Objects.equals(this.fields, datasetAssertionInfo.fields) &&
        Objects.equals(this.aggregation, datasetAssertionInfo.aggregation) &&
        Objects.equals(this.operator, datasetAssertionInfo.operator) &&
        Objects.equals(this.parameters, datasetAssertionInfo.parameters) &&
        Objects.equals(this.nativeType, datasetAssertionInfo.nativeType) &&
        Objects.equals(this.nativeParameters, datasetAssertionInfo.nativeParameters) &&
        Objects.equals(this.logic, datasetAssertionInfo.logic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, scope, fields, aggregation, operator, parameters, nativeType, nativeParameters, logic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetAssertionInfo {\n");
    
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    nativeType: ").append(toIndentedString(nativeType)).append("\n");
    sb.append("    nativeParameters: ").append(toIndentedString(nativeParameters)).append("\n");
    sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
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