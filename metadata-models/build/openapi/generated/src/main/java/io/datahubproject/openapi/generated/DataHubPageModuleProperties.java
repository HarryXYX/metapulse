package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.DataHubPageModuleParams;
import io.datahubproject.openapi.generated.DataHubPageModuleType;
import io.datahubproject.openapi.generated.DataHubPageModuleVisibility;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The main properties of a DataHub page module
 */
@Schema(description = "The main properties of a DataHub page module")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageModuleProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubPageModuleProperties") @Builder.Default
  private String __type = "DataHubPageModuleProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubPageModuleProperties"},
  defaultValue = "DataHubPageModuleProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("type") @Builder.Default
  private DataHubPageModuleType type = null;

  @JsonProperty("visibility") @Builder.Default
  private DataHubPageModuleVisibility visibility = null;

  @JsonProperty("params") @Builder.Default
  private DataHubPageModuleParams params = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public DataHubPageModuleProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of this module
   * @return name
   **/
  @Schema(required = true, description = "The display name of this module")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubPageModuleProperties type(DataHubPageModuleType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubPageModuleType getType() {
    return type;
  }

  public void setType(DataHubPageModuleType type) {
    this.type = type;
  }

  public DataHubPageModuleProperties visibility(DataHubPageModuleVisibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubPageModuleVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(DataHubPageModuleVisibility visibility) {
    this.visibility = visibility;
  }

  public DataHubPageModuleProperties params(DataHubPageModuleParams params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubPageModuleParams getParams() {
    return params;
  }

  public void setParams(DataHubPageModuleParams params) {
    this.params = params;
  }

  public DataHubPageModuleProperties created(AuditStamp created) {
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

  public DataHubPageModuleProperties lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageModuleProperties dataHubPageModuleProperties = (DataHubPageModuleProperties) o;
    return Objects.equals(this.name, dataHubPageModuleProperties.name) &&
        Objects.equals(this.type, dataHubPageModuleProperties.type) &&
        Objects.equals(this.visibility, dataHubPageModuleProperties.visibility) &&
        Objects.equals(this.params, dataHubPageModuleProperties.params) &&
        Objects.equals(this.created, dataHubPageModuleProperties.created) &&
        Objects.equals(this.lastModified, dataHubPageModuleProperties.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, visibility, params, created, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageModuleProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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