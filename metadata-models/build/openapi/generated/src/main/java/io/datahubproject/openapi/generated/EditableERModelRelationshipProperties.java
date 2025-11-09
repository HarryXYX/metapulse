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
 * EditableERModelRelationProperties stores editable changes made to erModelRelationship properties. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines
 */
@Schema(description = "EditableERModelRelationProperties stores editable changes made to erModelRelationship properties. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditableERModelRelationshipProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "EditableERModelRelationshipProperties") @Builder.Default
  private String __type = "EditableERModelRelationshipProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"EditableERModelRelationshipProperties"},
  defaultValue = "EditableERModelRelationshipProperties")
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

  public EditableERModelRelationshipProperties created(AuditStamp created) {
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

  public EditableERModelRelationshipProperties lastModified(AuditStamp lastModified) {
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

  public EditableERModelRelationshipProperties deleted(AuditStamp deleted) {
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

  public EditableERModelRelationshipProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Documentation of the erModelRelationship
   * @return description
   **/
  @Schema(description = "Documentation of the erModelRelationship")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditableERModelRelationshipProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the ERModelRelation
   * @return name
   **/
  @Schema(description = "Display name of the ERModelRelation")
  
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
    EditableERModelRelationshipProperties editableERModelRelationshipProperties = (EditableERModelRelationshipProperties) o;
    return Objects.equals(this.created, editableERModelRelationshipProperties.created) &&
        Objects.equals(this.lastModified, editableERModelRelationshipProperties.lastModified) &&
        Objects.equals(this.deleted, editableERModelRelationshipProperties.deleted) &&
        Objects.equals(this.description, editableERModelRelationshipProperties.description) &&
        Objects.equals(this.name, editableERModelRelationshipProperties.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, deleted, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableERModelRelationshipProperties {\n");
    
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