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
 * A row of modules contained in a template
 */
@Schema(description = "A row of modules contained in a template")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageTemplateRow   {

  @JsonProperty("modules") @Builder.Default
  @Valid
  private List<String> modules = new ArrayList<>();

  public DataHubPageTemplateRow modules(List<String> modules) {
    this.modules = modules;
    return this;
  }

  public DataHubPageTemplateRow addModulesItem(String modulesItem) {
    this.modules.add(modulesItem);
    return this;
  }

  /**
   * The modules that exist in this template row
   * @return modules
   **/
  @Schema(required = true, description = "The modules that exist in this template row")
      @NotNull

    public List<String> getModules() {
    return modules;
  }

  public void setModules(List<String> modules) {
    this.modules = modules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageTemplateRow dataHubPageTemplateRow = (DataHubPageTemplateRow) o;
    return Objects.equals(this.modules, dataHubPageTemplateRow.modules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageTemplateRow {\n");
    
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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