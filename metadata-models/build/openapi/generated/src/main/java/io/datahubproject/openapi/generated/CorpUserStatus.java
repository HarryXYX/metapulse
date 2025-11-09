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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The status of the user, e.g. provisioned, active, suspended, etc.
 */
@Schema(description = "The status of the user, e.g. provisioned, active, suspended, etc.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserStatus  implements OneOfCorpUserSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpUserStatus") @Builder.Default
  private String __type = "CorpUserStatus";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpUserStatus"},
  defaultValue = "CorpUserStatus")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("status") @Builder.Default
  private String status = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public CorpUserStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED
   * @return status
   **/
  @Schema(required = true, description = "Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CorpUserStatus lastModified(AuditStamp lastModified) {
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
    CorpUserStatus corpUserStatus = (CorpUserStatus) o;
    return Objects.equals(this.status, corpUserStatus.status) &&
        Objects.equals(this.lastModified, corpUserStatus.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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