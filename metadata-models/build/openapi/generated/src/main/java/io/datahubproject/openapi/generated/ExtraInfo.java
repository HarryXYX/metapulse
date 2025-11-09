package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Extra information associated to a metadata aspect.
 */
@Schema(description = "Extra information associated to a metadata aspect.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraInfo   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("version") @Builder.Default
  private Long version = null;

  @JsonProperty("audit") @Builder.Default
  private AuditStamp audit = null;

  public ExtraInfo urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * The urn for the entity that owns the metadata aspect
   * @return urn
   **/
  @Schema(required = true, description = "The urn for the entity that owns the metadata aspect")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public ExtraInfo version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version number of the metadata aspect.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return version
   **/
  @Schema(required = true, description = "The version number of the metadata aspect.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public ExtraInfo audit(AuditStamp audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getAudit() {
    return audit;
  }

  public void setAudit(AuditStamp audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraInfo extraInfo = (ExtraInfo) o;
    return Objects.equals(this.urn, extraInfo.urn) &&
        Objects.equals(this.version, extraInfo.version) &&
        Objects.equals(this.audit, extraInfo.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, version, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfo {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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