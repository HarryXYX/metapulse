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
 * Key for a Version Set entity
 */
@Schema(description = "Key for a Version Set entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionSetKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "VersionSetKey") @Builder.Default
  private String __type = "VersionSetKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"VersionSetKey"},
  defaultValue = "VersionSetKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("entityType") @Builder.Default
  private String entityType = null;

  public VersionSetKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the Version Set, generated from platform + asset id / name
   * @return id
   **/
  @Schema(required = true, description = "ID of the Version Set, generated from platform + asset id / name")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionSetKey entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Type of entities included in version set, limits to a single entity type between linked versioned entities
   * @return entityType
   **/
  @Schema(required = true, description = "Type of entities included in version set, limits to a single entity type between linked versioned entities")
      @NotNull

    public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionSetKey versionSetKey = (VersionSetKey) o;
    return Objects.equals(this.id, versionSetKey.id) &&
        Objects.equals(this.entityType, versionSetKey.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionSetKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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