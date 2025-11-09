package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ChangeAuditStamps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about a Notebook Note: This is IN BETA version
 */
@Schema(description = "Information about a Notebook Note: This is IN BETA version")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotebookInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "NotebookInfo") @Builder.Default
  private String __type = "NotebookInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"NotebookInfo"},
  defaultValue = "NotebookInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("externalUrl") @Builder.Default
  private String externalUrl = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("changeAuditStamps") @Builder.Default
  private ChangeAuditStamps changeAuditStamps = null;

  public NotebookInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public NotebookInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public NotebookInfo externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * URL where the reference exist
   * @return externalUrl
   **/
  @Schema(description = "URL where the reference exist")
  
    public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public NotebookInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the Notebook
   * @return title
   **/
  @Schema(required = true, description = "Title of the Notebook")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NotebookInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description about the Notebook
   * @return description
   **/
  @Schema(description = "Detailed description about the Notebook")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotebookInfo changeAuditStamps(ChangeAuditStamps changeAuditStamps) {
    this.changeAuditStamps = changeAuditStamps;
    return this;
  }

  /**
   * Get changeAuditStamps
   * @return changeAuditStamps
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ChangeAuditStamps getChangeAuditStamps() {
    return changeAuditStamps;
  }

  public void setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
    this.changeAuditStamps = changeAuditStamps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookInfo notebookInfo = (NotebookInfo) o;
    return Objects.equals(this.customProperties, notebookInfo.customProperties) &&
        Objects.equals(this.externalUrl, notebookInfo.externalUrl) &&
        Objects.equals(this.title, notebookInfo.title) &&
        Objects.equals(this.description, notebookInfo.description) &&
        Objects.equals(this.changeAuditStamps, notebookInfo.changeAuditStamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, externalUrl, title, description, changeAuditStamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    changeAuditStamps: ").append(toIndentedString(changeAuditStamps)).append("\n");
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