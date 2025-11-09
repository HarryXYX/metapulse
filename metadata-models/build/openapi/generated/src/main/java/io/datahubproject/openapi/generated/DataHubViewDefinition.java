package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Filter;
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
 * A View definition.
 */
@Schema(description = "A View definition.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubViewDefinition   {

  @JsonProperty("entityTypes") @Builder.Default
  @Valid
  private List<String> entityTypes = new ArrayList<>();

  @JsonProperty("filter") @Builder.Default
  private Filter filter = null;

  public DataHubViewDefinition entityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public DataHubViewDefinition addEntityTypesItem(String entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

  /**
   * The Entity Types in the scope of the View.
   * @return entityTypes
   **/
  @Schema(required = true, description = "The Entity Types in the scope of the View.")
      @NotNull

    public List<String> getEntityTypes() {
    return entityTypes;
  }

  public void setEntityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public DataHubViewDefinition filter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubViewDefinition dataHubViewDefinition = (DataHubViewDefinition) o;
    return Objects.equals(this.entityTypes, dataHubViewDefinition.entityTypes) &&
        Objects.equals(this.filter, dataHubViewDefinition.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityTypes, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubViewDefinition {\n");
    
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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