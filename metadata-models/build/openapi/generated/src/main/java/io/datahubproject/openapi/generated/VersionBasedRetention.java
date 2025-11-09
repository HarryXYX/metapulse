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
 * Keep max N latest records
 */
@Schema(description = "Keep max N latest records")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionBasedRetention   {

  @JsonProperty("maxVersions") @Builder.Default
  private Integer maxVersions = null;

  public VersionBasedRetention maxVersions(Integer maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Get maxVersions
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxVersions
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(Integer maxVersions) {
    this.maxVersions = maxVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionBasedRetention versionBasedRetention = (VersionBasedRetention) o;
    return Objects.equals(this.maxVersions, versionBasedRetention.maxVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionBasedRetention {\n");
    
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
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