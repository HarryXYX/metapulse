package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.EditableSchemaFieldInfo;
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
 * EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.
 */
@Schema(description = "EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditableSchemaMetadata  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "EditableSchemaMetadata") @Builder.Default
  private String __type = "EditableSchemaMetadata";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"EditableSchemaMetadata"},
  defaultValue = "EditableSchemaMetadata")
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

  @JsonProperty("editableSchemaFieldInfo") @Builder.Default
  @Valid
  private List<EditableSchemaFieldInfo> editableSchemaFieldInfo = new ArrayList<>();

  public EditableSchemaMetadata created(AuditStamp created) {
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

  public EditableSchemaMetadata lastModified(AuditStamp lastModified) {
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

  public EditableSchemaMetadata deleted(AuditStamp deleted) {
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

  public EditableSchemaMetadata editableSchemaFieldInfo(List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
    this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    return this;
  }

  public EditableSchemaMetadata addEditableSchemaFieldInfoItem(EditableSchemaFieldInfo editableSchemaFieldInfoItem) {
    this.editableSchemaFieldInfo.add(editableSchemaFieldInfoItem);
    return this;
  }

  /**
   * Client provided a list of fields from document schema.
   * @return editableSchemaFieldInfo
   **/
  @Schema(required = true, description = "Client provided a list of fields from document schema.")
      @NotNull
    @Valid
    public List<EditableSchemaFieldInfo> getEditableSchemaFieldInfo() {
    return editableSchemaFieldInfo;
  }

  public void setEditableSchemaFieldInfo(List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
    this.editableSchemaFieldInfo = editableSchemaFieldInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditableSchemaMetadata editableSchemaMetadata = (EditableSchemaMetadata) o;
    return Objects.equals(this.created, editableSchemaMetadata.created) &&
        Objects.equals(this.lastModified, editableSchemaMetadata.lastModified) &&
        Objects.equals(this.deleted, editableSchemaMetadata.deleted) &&
        Objects.equals(this.editableSchemaFieldInfo, editableSchemaMetadata.editableSchemaFieldInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, deleted, editableSchemaFieldInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableSchemaMetadata {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    editableSchemaFieldInfo: ").append(toIndentedString(editableSchemaFieldInfo)).append("\n");
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