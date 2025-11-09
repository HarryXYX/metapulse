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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Deprecation status of an entity
 */
@Schema(description = "Deprecation status of an entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Deprecation  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelDeploymentSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Deprecation") @Builder.Default
  private String __type = "Deprecation";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Deprecation"},
  defaultValue = "Deprecation")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("deprecated") @Builder.Default
  private Boolean deprecated = null;

  @JsonProperty("decommissionTime") @Builder.Default
  private Long decommissionTime = null;

  @JsonProperty("note") @Builder.Default
  private String note = null;

  @JsonProperty("actor") @Builder.Default
  private String actor = null;

  @JsonProperty("replacement") @Builder.Default
  private String replacement = null;

  public Deprecation deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Whether the entity is deprecated.
   * @return deprecated
   **/
  @Schema(required = true, description = "Whether the entity is deprecated.")
      @NotNull

    public Boolean isDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public Deprecation decommissionTime(Long decommissionTime) {
    this.decommissionTime = decommissionTime;
    return this;
  }

  /**
   * The time user plan to decommission this entity.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return decommissionTime
   **/
  @Schema(description = "The time user plan to decommission this entity.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getDecommissionTime() {
    return decommissionTime;
  }

  public void setDecommissionTime(Long decommissionTime) {
    this.decommissionTime = decommissionTime;
  }

  public Deprecation note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Additional information about the entity deprecation plan, such as the wiki, doc, RB.
   * @return note
   **/
  @Schema(required = true, description = "Additional information about the entity deprecation plan, such as the wiki, doc, RB.")
      @NotNull

    public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Deprecation actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * The user URN which will be credited for modifying this deprecation content.
   * @return actor
   **/
  @Schema(required = true, description = "The user URN which will be credited for modifying this deprecation content.")
      @NotNull

    public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public Deprecation replacement(String replacement) {
    this.replacement = replacement;
    return this;
  }

  /**
   * Get replacement
   * @return replacement
   **/
  @Schema(description = "")
  
    public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deprecation deprecation = (Deprecation) o;
    return Objects.equals(this.deprecated, deprecation.deprecated) &&
        Objects.equals(this.decommissionTime, deprecation.decommissionTime) &&
        Objects.equals(this.note, deprecation.note) &&
        Objects.equals(this.actor, deprecation.actor) &&
        Objects.equals(this.replacement, deprecation.replacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecated, decommissionTime, note, actor, replacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deprecation {\n");
    
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    decommissionTime: ").append(toIndentedString(decommissionTime)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
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