package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.InstitutionalMemoryMetadataSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Metadata corresponding to a record of institutional memory.
 */
@Schema(description = "Metadata corresponding to a record of institutional memory.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstitutionalMemoryMetadata   {

  @JsonProperty("url") @Builder.Default
  private String url = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("createStamp") @Builder.Default
  private AuditStamp createStamp = null;

  @JsonProperty("updateStamp") @Builder.Default
  private AuditStamp updateStamp = null;

  @JsonProperty("settings") @Builder.Default
  private InstitutionalMemoryMetadataSettings settings = null;

  public InstitutionalMemoryMetadata url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Link to an engineering design document or a wiki page.
   * @return url
   **/
  @Schema(required = true, description = "Link to an engineering design document or a wiki page.")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InstitutionalMemoryMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the link.
   * @return description
   **/
  @Schema(required = true, description = "Description of the link.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InstitutionalMemoryMetadata createStamp(AuditStamp createStamp) {
    this.createStamp = createStamp;
    return this;
  }

  /**
   * Get createStamp
   * @return createStamp
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreateStamp() {
    return createStamp;
  }

  public void setCreateStamp(AuditStamp createStamp) {
    this.createStamp = createStamp;
  }

  public InstitutionalMemoryMetadata updateStamp(AuditStamp updateStamp) {
    this.updateStamp = updateStamp;
    return this;
  }

  /**
   * Get updateStamp
   * @return updateStamp
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getUpdateStamp() {
    return updateStamp;
  }

  public void setUpdateStamp(AuditStamp updateStamp) {
    this.updateStamp = updateStamp;
  }

  public InstitutionalMemoryMetadata settings(InstitutionalMemoryMetadataSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   **/
  @Schema(description = "")
  
    @Valid
    public InstitutionalMemoryMetadataSettings getSettings() {
    return settings;
  }

  public void setSettings(InstitutionalMemoryMetadataSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalMemoryMetadata institutionalMemoryMetadata = (InstitutionalMemoryMetadata) o;
    return Objects.equals(this.url, institutionalMemoryMetadata.url) &&
        Objects.equals(this.description, institutionalMemoryMetadata.description) &&
        Objects.equals(this.createStamp, institutionalMemoryMetadata.createStamp) &&
        Objects.equals(this.updateStamp, institutionalMemoryMetadata.updateStamp) &&
        Objects.equals(this.settings, institutionalMemoryMetadata.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, description, createStamp, updateStamp, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalMemoryMetadata {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createStamp: ").append(toIndentedString(createStamp)).append("\n");
    sb.append("    updateStamp: ").append(toIndentedString(updateStamp)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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