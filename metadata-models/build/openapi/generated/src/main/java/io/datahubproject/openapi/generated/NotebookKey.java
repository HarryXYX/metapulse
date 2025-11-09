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
 * Key for a Notebook
 */
@Schema(description = "Key for a Notebook")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotebookKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "NotebookKey") @Builder.Default
  private String __type = "NotebookKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"NotebookKey"},
  defaultValue = "NotebookKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("notebookTool") @Builder.Default
  private String notebookTool = null;

  @JsonProperty("notebookId") @Builder.Default
  private String notebookId = null;

  public NotebookKey notebookTool(String notebookTool) {
    this.notebookTool = notebookTool;
    return this;
  }

  /**
   * The name of the Notebook tool such as QueryBook, etc.
   * @return notebookTool
   **/
  @Schema(required = true, description = "The name of the Notebook tool such as QueryBook, etc.")
      @NotNull

    public String getNotebookTool() {
    return notebookTool;
  }

  public void setNotebookTool(String notebookTool) {
    this.notebookTool = notebookTool;
  }

  public NotebookKey notebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  /**
   * Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773'
   * @return notebookId
   **/
  @Schema(required = true, description = "Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773'")
      @NotNull

    public String getNotebookId() {
    return notebookId;
  }

  public void setNotebookId(String notebookId) {
    this.notebookId = notebookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookKey notebookKey = (NotebookKey) o;
    return Objects.equals(this.notebookTool, notebookKey.notebookTool) &&
        Objects.equals(this.notebookId, notebookKey.notebookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebookTool, notebookId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookKey {\n");
    
    sb.append("    notebookTool: ").append(toIndentedString(notebookTool)).append("\n");
    sb.append("    notebookId: ").append(toIndentedString(notebookId)).append("\n");
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