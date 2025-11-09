package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines
 */
@Schema(description = "EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditableDatasetProperties  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "EditableDatasetProperties") @Builder.Default
  private String __type = "EditableDatasetProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"EditableDatasetProperties"},
  defaultValue = "EditableDatasetProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("deleted") @Builder.Default
  private AuditStamp deleted = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  public EditableDatasetProperties created(AuditStamp created) {
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

  public EditableDatasetProperties lastModified(AuditStamp lastModified) {
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

  public EditableDatasetProperties deleted(AuditStamp deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getDeleted() {
    return deleted;
  }

  public void setDeleted(AuditStamp deleted) {
    this.deleted = deleted;
  }

  public EditableDatasetProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the dataset
   * @return description
   **/
  @Schema(description = "Documentation of the dataset")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditableDatasetProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Editable display name of the Dataset
   * @return name
   **/
  @Schema(description = "Editable display name of the Dataset")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditableDatasetProperties editableDatasetProperties = (EditableDatasetProperties) o;
    return Objects.equals(this.created, editableDatasetProperties.created) &&
        Objects.equals(this.lastModified, editableDatasetProperties.lastModified) &&
        Objects.equals(this.deleted, editableDatasetProperties.deleted) &&
        Objects.equals(this.description, editableDatasetProperties.description) &&
        Objects.equals(this.name, editableDatasetProperties.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, deleted, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableDatasetProperties {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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