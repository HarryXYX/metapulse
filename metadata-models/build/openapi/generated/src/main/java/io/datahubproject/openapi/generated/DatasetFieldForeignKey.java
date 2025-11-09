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
 * For non-urn based foregin keys.
 */
@Schema(description = "For non-urn based foregin keys.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetFieldForeignKey  implements OneOfForeignKeySpecForeignKey {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatasetFieldForeignKey") @Builder.Default
  private String __type = "DatasetFieldForeignKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatasetFieldForeignKey"},
  defaultValue = "DatasetFieldForeignKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("parentDataset") @Builder.Default
  private String parentDataset = null;

  @JsonProperty("currentFieldPaths") @Builder.Default
  @Valid
  private List<String> currentFieldPaths = new ArrayList<>();

  @JsonProperty("parentField") @Builder.Default
  private String parentField = null;

  public DatasetFieldForeignKey parentDataset(String parentDataset) {
    this.parentDataset = parentDataset;
    return this;
  }

  /**
   * dataset that stores the resource.
   * @return parentDataset
   **/
  @Schema(required = true, description = "dataset that stores the resource.")
      @NotNull

    public String getParentDataset() {
    return parentDataset;
  }

  public void setParentDataset(String parentDataset) {
    this.parentDataset = parentDataset;
  }

  public DatasetFieldForeignKey currentFieldPaths(List<String> currentFieldPaths) {
    this.currentFieldPaths = currentFieldPaths;
    return this;
  }

  public DatasetFieldForeignKey addCurrentFieldPathsItem(String currentFieldPathsItem) {
    this.currentFieldPaths.add(currentFieldPathsItem);
    return this;
  }

  /**
   * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
   * @return currentFieldPaths
   **/
  @Schema(required = true, description = "List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.")
      @NotNull

    public List<String> getCurrentFieldPaths() {
    return currentFieldPaths;
  }

  public void setCurrentFieldPaths(List<String> currentFieldPaths) {
    this.currentFieldPaths = currentFieldPaths;
  }

  public DatasetFieldForeignKey parentField(String parentField) {
    this.parentField = parentField;
    return this;
  }

  /**
   * SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.
   * @return parentField
   **/
  @Schema(required = true, description = "SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.")
      @NotNull

    public String getParentField() {
    return parentField;
  }

  public void setParentField(String parentField) {
    this.parentField = parentField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetFieldForeignKey datasetFieldForeignKey = (DatasetFieldForeignKey) o;
    return Objects.equals(this.parentDataset, datasetFieldForeignKey.parentDataset) &&
        Objects.equals(this.currentFieldPaths, datasetFieldForeignKey.currentFieldPaths) &&
        Objects.equals(this.parentField, datasetFieldForeignKey.parentField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentDataset, currentFieldPaths, parentField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetFieldForeignKey {\n");
    
    sb.append("    parentDataset: ").append(toIndentedString(parentDataset)).append("\n");
    sb.append("    currentFieldPaths: ").append(toIndentedString(currentFieldPaths)).append("\n");
    sb.append("    parentField: ").append(toIndentedString(parentField)).append("\n");
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