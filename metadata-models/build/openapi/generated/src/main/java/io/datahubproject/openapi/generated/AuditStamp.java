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
 * Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.
 */
@Schema(description = "Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditStamp   {

  @JsonProperty("time") @Builder.Default
  private Long time = null;

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("impersonator") @Builder.Default
  private String impersonator = null;

  @JsonProperty("message") @Builder.Default
  private String message = null;

  public AuditStamp time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return time
   **/
  @Schema(required = true, description = "When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public AuditStamp actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.
   * @return actor
   **/
  @Schema(required = true, description = "The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.")
      @NotNull

    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public AuditStamp impersonator(String impersonator) {
    this.impersonator = impersonator;
    return this;
  }

  /**
   * The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.
   * @return impersonator
   **/
  @Schema(description = "The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.")
  
    public String getImpersonator() {
    return impersonator;
  }

  public void setImpersonator(String impersonator) {
    this.impersonator = impersonator;
  }

  public AuditStamp message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.
   * @return message
   **/
  @Schema(description = "Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditStamp auditStamp = (AuditStamp) o;
    return Objects.equals(this.time, auditStamp.time) &&
        Objects.equals(this.actor, auditStamp.actor) &&
        Objects.equals(this.impersonator, auditStamp.impersonator) &&
        Objects.equals(this.message, auditStamp.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, actor, impersonator, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditStamp {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    impersonator: ").append(toIndentedString(impersonator)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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