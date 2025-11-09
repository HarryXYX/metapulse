package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MetadataAttribution;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A resource-defined string representing the resource state for the purpose of concurrency control
 */
@Schema(description = "A resource-defined string representing the resource state for the purpose of concurrency control")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionTag   {

  @JsonProperty("versionTag") @Builder.Default
  private String versionTag = null;

  @JsonProperty("metadataAttribution") @Builder.Default
  private MetadataAttribution metadataAttribution = null;

  public VersionTag versionTag(String versionTag) {
    this.versionTag = versionTag;
    return this;
  }

  /**
   * Get versionTag
   * @return versionTag
   **/
  @Schema(description = "")
  
    public String getVersionTag() {
    return versionTag;
  }

  public void setVersionTag(String versionTag) {
    this.versionTag = versionTag;
  }

  public VersionTag metadataAttribution(MetadataAttribution metadataAttribution) {
    this.metadataAttribution = metadataAttribution;
    return this;
  }

  /**
   * Get metadataAttribution
   * @return metadataAttribution
   **/
  @Schema(description = "")
  
    @Valid
    public MetadataAttribution getMetadataAttribution() {
    return metadataAttribution;
  }

  public void setMetadataAttribution(MetadataAttribution metadataAttribution) {
    this.metadataAttribution = metadataAttribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionTag versionTag = (VersionTag) o;
    return Objects.equals(this.versionTag, versionTag.versionTag) &&
        Objects.equals(this.metadataAttribution, versionTag.metadataAttribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionTag, metadataAttribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionTag {\n");
    
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    metadataAttribution: ").append(toIndentedString(metadataAttribution)).append("\n");
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