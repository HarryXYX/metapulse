package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AspectType;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.SystemMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * An aspect, along with the metadata about it. Currently, an aspect can be either of type &#x27;timestamp&#x27; or &#x27;versioned&#x27;.
 */
@Schema(description = "An aspect, along with the metadata about it. Currently, an aspect can be either of type 'timestamp' or 'versioned'.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvelopedAspect   {

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("type") @Builder.Default
  private AspectType type = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  @JsonProperty("timestamp") @Builder.Default
  private Long timestamp = null;

  @JsonProperty("value") @Builder.Default
  private OneOfEnvelopedAspectValue value = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  public EnvelopedAspect name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the aspect
   * @return name
   **/
  @Schema(required = true, description = "The name of the aspect")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvelopedAspect type(AspectType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AspectType getType() {
    return type;
  }

  public void setType(AspectType type) {
    this.type = type;
  }

  public EnvelopedAspect version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the aspect, only populated if type is 'VERSIONED'
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(description = "The version of the aspect, only populated if type is 'VERSIONED'")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public EnvelopedAspect timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp of the aspect, only populated if type is 'TIMESTAMP'
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestamp
   **/
  @Schema(description = "The timestamp of the aspect, only populated if type is 'TIMESTAMP'")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public EnvelopedAspect value(OneOfEnvelopedAspectValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfEnvelopedAspectValue getValue() {
    return value;
  }

  public void setValue(OneOfEnvelopedAspectValue value) {
    this.value = value;
  }

  public EnvelopedAspect created(AuditStamp created) {
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

  public EnvelopedAspect systemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
    return this;
  }

  /**
   * Get systemMetadata
   * @return systemMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SystemMetadata getSystemMetadata() {
    return systemMetadata;
  }

  public void setSystemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopedAspect envelopedAspect = (EnvelopedAspect) o;
    return Objects.equals(this.name, envelopedAspect.name) &&
        Objects.equals(this.type, envelopedAspect.type) &&
        Objects.equals(this.version, envelopedAspect.version) &&
        Objects.equals(this.timestamp, envelopedAspect.timestamp) &&
        Objects.equals(this.value, envelopedAspect.value) &&
        Objects.equals(this.created, envelopedAspect.created) &&
        Objects.equals(this.systemMetadata, envelopedAspect.systemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, version, timestamp, value, created, systemMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopedAspect {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    systemMetadata: ").append(toIndentedString(systemMetadata)).append("\n");
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