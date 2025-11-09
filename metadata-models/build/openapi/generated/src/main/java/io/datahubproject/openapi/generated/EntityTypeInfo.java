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
 * EntityTypeInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityTypeInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "EntityTypeInfo") @Builder.Default
  private String __type = "EntityTypeInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"EntityTypeInfo"},
  defaultValue = "EntityTypeInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("qualifiedName") @Builder.Default
  private String qualifiedName = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  public EntityTypeInfo qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
  }

  /**
   * The fully qualified name for the entity type, which usually consists of a namespace plus an identifier or name, e.g. datahub.dataset
   * @return qualifiedName
   **/
  @Schema(required = true, description = "The fully qualified name for the entity type, which usually consists of a namespace plus an identifier or name, e.g. datahub.dataset")
      @NotNull

    public String getQualifiedName() {
    return qualifiedName;
  }

  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }

  public EntityTypeInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for the Entity Type.
   * @return displayName
   **/
  @Schema(description = "The display name for the Entity Type.")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EntityTypeInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the Entity Type: what is it for?
   * @return description
   **/
  @Schema(description = "A description for the Entity Type: what is it for?")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityTypeInfo entityTypeInfo = (EntityTypeInfo) o;
    return Objects.equals(this.qualifiedName, entityTypeInfo.qualifiedName) &&
        Objects.equals(this.displayName, entityTypeInfo.displayName) &&
        Objects.equals(this.description, entityTypeInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifiedName, displayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeInfo {\n");
    
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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