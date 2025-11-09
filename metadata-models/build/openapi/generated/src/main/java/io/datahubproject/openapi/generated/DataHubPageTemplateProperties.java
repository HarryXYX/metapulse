package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.DataHubPageTemplateAssetSummary;
import io.datahubproject.openapi.generated.DataHubPageTemplateRow;
import io.datahubproject.openapi.generated.DataHubPageTemplateSurface;
import io.datahubproject.openapi.generated.DataHubPageTemplateVisibility;
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
 * The main properties of a DataHub page template
 */
@Schema(description = "The main properties of a DataHub page template")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageTemplateProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubPageTemplateProperties") @Builder.Default
  private String __type = "DataHubPageTemplateProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubPageTemplateProperties"},
  defaultValue = "DataHubPageTemplateProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("rows") @Builder.Default
  @Valid
  private List<DataHubPageTemplateRow> rows = new ArrayList<>();

  @JsonProperty("assetSummary") @Builder.Default
  private DataHubPageTemplateAssetSummary assetSummary = null;

  @JsonProperty("surface") @Builder.Default
  private DataHubPageTemplateSurface surface = null;

  @JsonProperty("visibility") @Builder.Default
  private DataHubPageTemplateVisibility visibility = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public DataHubPageTemplateProperties rows(List<DataHubPageTemplateRow> rows) {
    this.rows = rows;
    return this;
  }

  public DataHubPageTemplateProperties addRowsItem(DataHubPageTemplateRow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * The rows of modules contained in this template
   * @return rows
   **/
  @Schema(required = true, description = "The rows of modules contained in this template")
      @NotNull
    @Valid
    public List<DataHubPageTemplateRow> getRows() {
    return rows;
  }

  public void setRows(List<DataHubPageTemplateRow> rows) {
    this.rows = rows;
  }

  public DataHubPageTemplateProperties assetSummary(DataHubPageTemplateAssetSummary assetSummary) {
    this.assetSummary = assetSummary;
    return this;
  }

  /**
   * Get assetSummary
   * @return assetSummary
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubPageTemplateAssetSummary getAssetSummary() {
    return assetSummary;
  }

  public void setAssetSummary(DataHubPageTemplateAssetSummary assetSummary) {
    this.assetSummary = assetSummary;
  }

  public DataHubPageTemplateProperties surface(DataHubPageTemplateSurface surface) {
    this.surface = surface;
    return this;
  }

  /**
   * Get surface
   * @return surface
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DataHubPageTemplateSurface getSurface() {
    return surface;
  }

  public void setSurface(DataHubPageTemplateSurface surface) {
    this.surface = surface;
  }

  public DataHubPageTemplateProperties visibility(DataHubPageTemplateVisibility visibility) {
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
    public DataHubPageTemplateVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(DataHubPageTemplateVisibility visibility) {
    this.visibility = visibility;
  }

  public DataHubPageTemplateProperties created(AuditStamp created) {
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

  public DataHubPageTemplateProperties lastModified(AuditStamp lastModified) {
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
    DataHubPageTemplateProperties dataHubPageTemplateProperties = (DataHubPageTemplateProperties) o;
    return Objects.equals(this.rows, dataHubPageTemplateProperties.rows) &&
        Objects.equals(this.assetSummary, dataHubPageTemplateProperties.assetSummary) &&
        Objects.equals(this.surface, dataHubPageTemplateProperties.surface) &&
        Objects.equals(this.visibility, dataHubPageTemplateProperties.visibility) &&
        Objects.equals(this.created, dataHubPageTemplateProperties.created) &&
        Objects.equals(this.lastModified, dataHubPageTemplateProperties.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows, assetSummary, surface, visibility, created, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageTemplateProperties {\n");
    
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    assetSummary: ").append(toIndentedString(assetSummary)).append("\n");
    sb.append("    surface: ").append(toIndentedString(surface)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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