package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.DataHubViewDefinition;
import io.datahubproject.openapi.generated.DataHubViewType;
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
 * Information about a DataHub View. -- TODO: Understand whether an entity type filter is required.
 */
@Schema(description = "Information about a DataHub View. -- TODO: Understand whether an entity type filter is required.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubViewInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubViewInfo") @Builder.Default
  private String __type = "DataHubViewInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubViewInfo"},
  defaultValue = "DataHubViewInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private DataHubViewType type = null;

  @JsonProperty("definition") @Builder.Default
  private DataHubViewDefinition definition = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public DataHubViewInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the View
   * @return name
   **/
  @Schema(required = true, description = "The name of the View")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubViewInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the view
   * @return description
   **/
  @Schema(description = "Description of the view")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataHubViewInfo type(DataHubViewType type) {
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
    public DataHubViewType getType() {
    return type;
  }

  public void setType(DataHubViewType type) {
    this.type = type;
  }

  public DataHubViewInfo definition(DataHubViewDefinition definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubViewDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(DataHubViewDefinition definition) {
    this.definition = definition;
  }

  public DataHubViewInfo created(AuditStamp created) {
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

  public DataHubViewInfo lastModified(AuditStamp lastModified) {
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
    DataHubViewInfo dataHubViewInfo = (DataHubViewInfo) o;
    return Objects.equals(this.name, dataHubViewInfo.name) &&
        Objects.equals(this.description, dataHubViewInfo.description) &&
        Objects.equals(this.type, dataHubViewInfo.type) &&
        Objects.equals(this.definition, dataHubViewInfo.definition) &&
        Objects.equals(this.created, dataHubViewInfo.created) &&
        Objects.equals(this.lastModified, dataHubViewInfo.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, definition, created, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubViewInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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