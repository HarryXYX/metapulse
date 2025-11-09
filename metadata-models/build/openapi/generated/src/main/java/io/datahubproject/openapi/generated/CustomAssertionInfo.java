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
/**
 * Attributes that are applicable to Custom Assertions
 */
@Schema(description = "Attributes that are applicable to Custom Assertions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomAssertionInfo   {

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("field") @Builder.Default
  private String field = null;

  @JsonProperty("logic") @Builder.Default
  private String logic = null;

  public CustomAssertionInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of custom assertion. This is how your assertion will appear categorized in DataHub UI. 
   * @return type
   **/
  @Schema(required = true, description = "The type of custom assertion. This is how your assertion will appear categorized in DataHub UI. ")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by this assertion. This can have support more entityTypes (e.g. dataJob) in future
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by this assertion. This can have support more entityTypes (e.g. dataJob) in future")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CustomAssertionInfo field(String field) {
    this.field = field;
    return this;
  }

  /**
   * dataset schema field targeted by this assertion.  This field is expected to be provided if the assertion is on dataset field
   * @return field
   **/
  @Schema(description = "dataset schema field targeted by this assertion.  This field is expected to be provided if the assertion is on dataset field")
  
    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public CustomAssertionInfo logic(String logic) {
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
    CustomAssertionInfo customAssertionInfo = (CustomAssertionInfo) o;
    return Objects.equals(this.type, customAssertionInfo.type) &&
        Objects.equals(this.entity, customAssertionInfo.entity) &&
        Objects.equals(this.field, customAssertionInfo.field) &&
        Objects.equals(this.logic, customAssertionInfo.logic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, field, logic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAssertionInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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