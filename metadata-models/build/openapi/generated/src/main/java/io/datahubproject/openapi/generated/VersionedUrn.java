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
/**
 * An urn combined with a versionStamp, versionStamp can be empty indicating latest for all aspects. Represents a state in time of an entity
 */
@Schema(description = "An urn combined with a versionStamp, versionStamp can be empty indicating latest for all aspects. Represents a state in time of an entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionedUrn   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("versionStamp") @Builder.Default
  private String versionStamp = null;

  public VersionedUrn urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Urn indicating which entity this represents
   * @return urn
   **/
  @Schema(required = true, description = "Urn indicating which entity this represents")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public VersionedUrn versionStamp(String versionStamp) {
    this.versionStamp = versionStamp;
    return this;
  }

  /**
   * String indicating the stamped version of aspects present at a point in time
   * @return versionStamp
   **/
  @Schema(description = "String indicating the stamped version of aspects present at a point in time")
  
    public String getVersionStamp() {
    return versionStamp;
  }

  public void setVersionStamp(String versionStamp) {
    this.versionStamp = versionStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedUrn versionedUrn = (VersionedUrn) o;
    return Objects.equals(this.urn, versionedUrn.urn) &&
        Objects.equals(this.versionStamp, versionedUrn.versionStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, versionStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedUrn {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    versionStamp: ").append(toIndentedString(versionStamp)).append("\n");
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