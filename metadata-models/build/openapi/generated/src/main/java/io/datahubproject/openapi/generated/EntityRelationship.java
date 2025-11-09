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
 * Downstream lineage information about a dataset including the source reporting the lineage
 */
@Schema(description = "Downstream lineage information about a dataset including the source reporting the lineage")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityRelationship   {

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  public EntityRelationship created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public EntityRelationship entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The downstream dataset the lineage points to
   * @return entity
   **/
  @Schema(required = true, description = "The downstream dataset the lineage points to")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public EntityRelationship type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the relationship
   * @return type
   **/
  @Schema(required = true, description = "The type of the relationship")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationship entityRelationship = (EntityRelationship) o;
    return Objects.equals(this.created, entityRelationship.created) &&
        Objects.equals(this.entity, entityRelationship.entity) &&
        Objects.equals(this.type, entityRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, entity, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationship {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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