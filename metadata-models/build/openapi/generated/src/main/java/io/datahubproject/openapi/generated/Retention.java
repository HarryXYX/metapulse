package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TimeBasedRetention;
import io.datahubproject.openapi.generated.VersionBasedRetention;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Base class that encapsulates different retention policies. Only one of the fields should be set
 */
@Schema(description = "Base class that encapsulates different retention policies. Only one of the fields should be set")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Retention   {

  @JsonProperty("version") @Builder.Default
  private VersionBasedRetention version = null;

  @JsonProperty("time") @Builder.Default
  private TimeBasedRetention time = null;

  public Retention version(VersionBasedRetention version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    @Valid
    public VersionBasedRetention getVersion() {
    return version;
  }

  public void setVersion(VersionBasedRetention version) {
    this.version = version;
  }

  public Retention time(TimeBasedRetention time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(description = "")
  
    @Valid
    public TimeBasedRetention getTime() {
    return time;
  }

  public void setTime(TimeBasedRetention time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Retention retention = (Retention) o;
    return Objects.equals(this.version, retention.version) &&
        Objects.equals(this.time, retention.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Retention {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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