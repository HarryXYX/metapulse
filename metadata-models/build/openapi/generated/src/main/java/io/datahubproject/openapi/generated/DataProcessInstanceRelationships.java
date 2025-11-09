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
 * Information about Data process relationships
 */
@Schema(description = "Information about Data process relationships")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProcessInstanceRelationships  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataProcessInstanceRelationships") @Builder.Default
  private String __type = "DataProcessInstanceRelationships";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataProcessInstanceRelationships"},
  defaultValue = "DataProcessInstanceRelationships")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("parentTemplate") @Builder.Default
  private String parentTemplate = null;

  @JsonProperty("parentInstance") @Builder.Default
  private String parentInstance = null;

  @JsonProperty("upstreamInstances") @Builder.Default
  @Valid
  private List<String> upstreamInstances = new ArrayList<>();

  public DataProcessInstanceRelationships parentTemplate(String parentTemplate) {
    this.parentTemplate = parentTemplate;
    return this;
  }

  /**
   * The parent entity whose run instance it is
   * @return parentTemplate
   **/
  @Schema(description = "The parent entity whose run instance it is")
  
    public String getParentTemplate() {
    return parentTemplate;
  }

  public void setParentTemplate(String parentTemplate) {
    this.parentTemplate = parentTemplate;
  }

  public DataProcessInstanceRelationships parentInstance(String parentInstance) {
    this.parentInstance = parentInstance;
    return this;
  }

  /**
   * The parent DataProcessInstance where it belongs to. If it is a Airflow Task then it should belong to an Airflow Dag run as well which will be another DataProcessInstance
   * @return parentInstance
   **/
  @Schema(description = "The parent DataProcessInstance where it belongs to. If it is a Airflow Task then it should belong to an Airflow Dag run as well which will be another DataProcessInstance")
  
    public String getParentInstance() {
    return parentInstance;
  }

  public void setParentInstance(String parentInstance) {
    this.parentInstance = parentInstance;
  }

  public DataProcessInstanceRelationships upstreamInstances(List<String> upstreamInstances) {
    this.upstreamInstances = upstreamInstances;
    return this;
  }

  public DataProcessInstanceRelationships addUpstreamInstancesItem(String upstreamInstancesItem) {
    this.upstreamInstances.add(upstreamInstancesItem);
    return this;
  }

  /**
   * Input DataProcessInstance which triggered this dataprocess instance
   * @return upstreamInstances
   **/
  @Schema(required = true, description = "Input DataProcessInstance which triggered this dataprocess instance")
      @NotNull

    public List<String> getUpstreamInstances() {
    return upstreamInstances;
  }

  public void setUpstreamInstances(List<String> upstreamInstances) {
    this.upstreamInstances = upstreamInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessInstanceRelationships dataProcessInstanceRelationships = (DataProcessInstanceRelationships) o;
    return Objects.equals(this.parentTemplate, dataProcessInstanceRelationships.parentTemplate) &&
        Objects.equals(this.parentInstance, dataProcessInstanceRelationships.parentInstance) &&
        Objects.equals(this.upstreamInstances, dataProcessInstanceRelationships.upstreamInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentTemplate, parentInstance, upstreamInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessInstanceRelationships {\n");
    
    sb.append("    parentTemplate: ").append(toIndentedString(parentTemplate)).append("\n");
    sb.append("    parentInstance: ").append(toIndentedString(parentInstance)).append("\n");
    sb.append("    upstreamInstances: ").append(toIndentedString(upstreamInstances)).append("\n");
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