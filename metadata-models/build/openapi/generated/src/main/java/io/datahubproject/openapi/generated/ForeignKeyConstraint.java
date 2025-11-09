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
 * Description of a foreign key constraint in a schema.
 */
@Schema(description = "Description of a foreign key constraint in a schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForeignKeyConstraint   {

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("foreignFields") @Builder.Default
  @Valid
  private List<String> foreignFields = new ArrayList<>();

  @JsonProperty("sourceFields") @Builder.Default
  @Valid
  private List<String> sourceFields = new ArrayList<>();

  @JsonProperty("foreignDataset") @Builder.Default
  private String foreignDataset = null;

  public ForeignKeyConstraint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the constraint, likely provided from the source
   * @return name
   **/
  @Schema(required = true, description = "Name of the constraint, likely provided from the source")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ForeignKeyConstraint foreignFields(List<String> foreignFields) {
    this.foreignFields = foreignFields;
    return this;
  }

  public ForeignKeyConstraint addForeignFieldsItem(String foreignFieldsItem) {
    this.foreignFields.add(foreignFieldsItem);
    return this;
  }

  /**
   * Fields the constraint maps to on the foreign dataset
   * @return foreignFields
   **/
  @Schema(required = true, description = "Fields the constraint maps to on the foreign dataset")
      @NotNull

    public List<String> getForeignFields() {
    return foreignFields;
  }

  public void setForeignFields(List<String> foreignFields) {
    this.foreignFields = foreignFields;
  }

  public ForeignKeyConstraint sourceFields(List<String> sourceFields) {
    this.sourceFields = sourceFields;
    return this;
  }

  public ForeignKeyConstraint addSourceFieldsItem(String sourceFieldsItem) {
    this.sourceFields.add(sourceFieldsItem);
    return this;
  }

  /**
   * Fields the constraint maps to on the source dataset
   * @return sourceFields
   **/
  @Schema(required = true, description = "Fields the constraint maps to on the source dataset")
      @NotNull

    public List<String> getSourceFields() {
    return sourceFields;
  }

  public void setSourceFields(List<String> sourceFields) {
    this.sourceFields = sourceFields;
  }

  public ForeignKeyConstraint foreignDataset(String foreignDataset) {
    this.foreignDataset = foreignDataset;
    return this;
  }

  /**
   * Reference to the foreign dataset for ease of lookup
   * @return foreignDataset
   **/
  @Schema(required = true, description = "Reference to the foreign dataset for ease of lookup")
      @NotNull

    public String getForeignDataset() {
    return foreignDataset;
  }

  public void setForeignDataset(String foreignDataset) {
    this.foreignDataset = foreignDataset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForeignKeyConstraint foreignKeyConstraint = (ForeignKeyConstraint) o;
    return Objects.equals(this.name, foreignKeyConstraint.name) &&
        Objects.equals(this.foreignFields, foreignKeyConstraint.foreignFields) &&
        Objects.equals(this.sourceFields, foreignKeyConstraint.sourceFields) &&
        Objects.equals(this.foreignDataset, foreignKeyConstraint.foreignDataset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, foreignFields, sourceFields, foreignDataset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForeignKeyConstraint {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    foreignFields: ").append(toIndentedString(foreignFields)).append("\n");
    sb.append("    sourceFields: ").append(toIndentedString(sourceFields)).append("\n");
    sb.append("    foreignDataset: ").append(toIndentedString(foreignDataset)).append("\n");
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