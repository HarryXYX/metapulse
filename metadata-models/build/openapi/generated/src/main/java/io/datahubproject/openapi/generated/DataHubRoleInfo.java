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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a DataHub Role.
 */
@Schema(description = "Information about a DataHub Role.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubRoleInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubRoleInfo") @Builder.Default
  private String __type = "DataHubRoleInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubRoleInfo"},
  defaultValue = "DataHubRoleInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("editable") @Builder.Default
  private Boolean editable = false;

  public DataHubRoleInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Role
   * @return name
   **/
  @Schema(required = true, description = "Name of the Role")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubRoleInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Role
   * @return description
   **/
  @Schema(required = true, description = "Description of the Role")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataHubRoleInfo editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Whether the role should be editable via the UI
   * @return editable
   **/
  @Schema(required = true, description = "Whether the role should be editable via the UI")
      @NotNull

    public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubRoleInfo dataHubRoleInfo = (DataHubRoleInfo) o;
    return Objects.equals(this.name, dataHubRoleInfo.name) &&
        Objects.equals(this.description, dataHubRoleInfo.description) &&
        Objects.equals(this.editable, dataHubRoleInfo.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, editable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRoleInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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