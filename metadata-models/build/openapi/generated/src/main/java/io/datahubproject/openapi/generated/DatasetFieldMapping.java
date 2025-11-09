package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * Representation of mapping between fields in source dataset to the field in destination dataset
 */
@Schema(description = "Representation of mapping between fields in source dataset to the field in destination dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetFieldMapping   {

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("transformation") @Builder.Default
  private OneOfDatasetFieldMappingTransformation transformation = null;

  @JsonProperty("sourceFields") @Builder.Default
  @Valid
  private List<String> sourceFields = new ArrayList<>();

  @JsonProperty("destinationField") @Builder.Default
  private String destinationField = null;

  public DatasetFieldMapping created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public DatasetFieldMapping transformation(OneOfDatasetFieldMappingTransformation transformation) {
    this.transformation = transformation;
    return this;
  }

  /**
   * Transfomration function between the fields involved
   * @return transformation
   **/
  @Schema(required = true, description = "Transfomration function between the fields involved")
      @NotNull

    public OneOfDatasetFieldMappingTransformation getTransformation() {
    return transformation;
  }

  public void setTransformation(OneOfDatasetFieldMappingTransformation transformation) {
    this.transformation = transformation;
  }

  public DatasetFieldMapping sourceFields(List<String> sourceFields) {
    this.sourceFields = sourceFields;
    return this;
  }

  public DatasetFieldMapping addSourceFieldsItem(String sourceFieldsItem) {
    this.sourceFields.add(sourceFieldsItem);
    return this;
  }

  /**
   * Source fields from which the fine grained lineage is derived
   * @return sourceFields
   **/
  @Schema(required = true, description = "Source fields from which the fine grained lineage is derived")
      @NotNull

    public List<String> getSourceFields() {
    return sourceFields;
  }

  public void setSourceFields(List<String> sourceFields) {
    this.sourceFields = sourceFields;
  }

  public DatasetFieldMapping destinationField(String destinationField) {
    this.destinationField = destinationField;
    return this;
  }

  /**
   * Destination field which is derived from source fields
   * @return destinationField
   **/
  @Schema(required = true, description = "Destination field which is derived from source fields")
      @NotNull

    public String getDestinationField() {
    return destinationField;
  }

  public void setDestinationField(String destinationField) {
    this.destinationField = destinationField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetFieldMapping datasetFieldMapping = (DatasetFieldMapping) o;
    return Objects.equals(this.created, datasetFieldMapping.created) &&
        Objects.equals(this.transformation, datasetFieldMapping.transformation) &&
        Objects.equals(this.sourceFields, datasetFieldMapping.sourceFields) &&
        Objects.equals(this.destinationField, datasetFieldMapping.destinationField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, transformation, sourceFields, destinationField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetFieldMapping {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
    sb.append("    sourceFields: ").append(toIndentedString(sourceFields)).append("\n");
    sb.append("    destinationField: ").append(toIndentedString(destinationField)).append("\n");
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