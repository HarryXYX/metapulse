package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.PolicyMatchFilter;
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
 * Information used to filter DataHub resource.
 */
@Schema(description = "Information used to filter DataHub resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubResourceFilter   {

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("resources") @Builder.Default
  @Valid
  private List<String> resources = null;

  @JsonProperty("allResources") @Builder.Default
  private Boolean allResources = false;

  @JsonProperty("filter") @Builder.Default
  private PolicyMatchFilter filter = null;

  @JsonProperty("privilegeConstraints") @Builder.Default
  private PolicyMatchFilter privilegeConstraints = null;

  public DataHubResourceFilter type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of resource that the policy applies to. This will most often be a data asset entity name, for example 'dataset'. It is not strictly required because in the future we will want to support filtering a resource by domain, as well.
   * @return type
   **/
  @Schema(description = "The type of resource that the policy applies to. This will most often be a data asset entity name, for example 'dataset'. It is not strictly required because in the future we will want to support filtering a resource by domain, as well.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataHubResourceFilter resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public DataHubResourceFilter addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * A specific set of resources to apply the policy to, e.g. asset urns
   * @return resources
   **/
  @Schema(description = "A specific set of resources to apply the policy to, e.g. asset urns")
  
    public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public DataHubResourceFilter allResources(Boolean allResources) {
    this.allResources = allResources;
    return this;
  }

  /**
   * Whether the policy should be applied to all assets matching the filter.
   * @return allResources
   **/
  @Schema(required = true, description = "Whether the policy should be applied to all assets matching the filter.")
      @NotNull

    public Boolean isAllResources() {
    return allResources;
  }

  public void setAllResources(Boolean allResources) {
    this.allResources = allResources;
  }

  public DataHubResourceFilter filter(PolicyMatchFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(description = "")
  
    @Valid
    public PolicyMatchFilter getFilter() {
    return filter;
  }

  public void setFilter(PolicyMatchFilter filter) {
    this.filter = filter;
  }

  public DataHubResourceFilter privilegeConstraints(PolicyMatchFilter privilegeConstraints) {
    this.privilegeConstraints = privilegeConstraints;
    return this;
  }

  /**
   * Get privilegeConstraints
   * @return privilegeConstraints
   **/
  @Schema(description = "")
  
    @Valid
    public PolicyMatchFilter getPrivilegeConstraints() {
    return privilegeConstraints;
  }

  public void setPrivilegeConstraints(PolicyMatchFilter privilegeConstraints) {
    this.privilegeConstraints = privilegeConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubResourceFilter dataHubResourceFilter = (DataHubResourceFilter) o;
    return Objects.equals(this.type, dataHubResourceFilter.type) &&
        Objects.equals(this.resources, dataHubResourceFilter.resources) &&
        Objects.equals(this.allResources, dataHubResourceFilter.allResources) &&
        Objects.equals(this.filter, dataHubResourceFilter.filter) &&
        Objects.equals(this.privilegeConstraints, dataHubResourceFilter.privilegeConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, resources, allResources, filter, privilegeConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubResourceFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    allResources: ").append(toIndentedString(allResources)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    privilegeConstraints: ").append(toIndentedString(privilegeConstraints)).append("\n");
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