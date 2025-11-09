package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.IncidentAssignee;
import io.datahubproject.openapi.generated.IncidentSource;
import io.datahubproject.openapi.generated.IncidentStatus;
import io.datahubproject.openapi.generated.IncidentType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Information about an incident raised on an asset.
 */
@Schema(description = "Information about an incident raised on an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IncidentInfo") @Builder.Default
  private String __type = "IncidentInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IncidentInfo"},
  defaultValue = "IncidentInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("type") @Builder.Default
  private IncidentType type = null;

  @JsonProperty("customType") @Builder.Default
  private String customType = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<String> entities = new ArrayList<>();

  @JsonProperty("priority") @Builder.Default
  private Integer priority = null;

  @JsonProperty("assignees") @Builder.Default
  @Valid
  private List<IncidentAssignee> assignees = null;

  @JsonProperty("status") @Builder.Default
  private IncidentStatus status = null;

  @JsonProperty("source") @Builder.Default
  private IncidentSource source = null;

  @JsonProperty("startedAt") @Builder.Default
  private Long startedAt = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  public IncidentInfo type(IncidentType type) {
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
    public IncidentType getType() {
    return type;
  }

  public void setType(IncidentType type) {
    this.type = type;
  }

  public IncidentInfo customType(String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * An optional custom incident type. Present only if type is 'CUSTOM'.
   * @return customType
   **/
  @Schema(description = "An optional custom incident type. Present only if type is 'CUSTOM'.")
  
    public String getCustomType() {
    return customType;
  }

  public void setCustomType(String customType) {
    this.customType = customType;
  }

  public IncidentInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Optional title associated with the incident
   * @return title
   **/
  @Schema(description = "Optional title associated with the incident")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IncidentInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional description associated with the incident
   * @return description
   **/
  @Schema(description = "Optional description associated with the incident")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncidentInfo entities(List<String> entities) {
    this.entities = entities;
    return this;
  }

  public IncidentInfo addEntitiesItem(String entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * A reference to the entity associated with the incident.
   * @return entities
   **/
  @Schema(required = true, description = "A reference to the entity associated with the incident.")
      @NotNull

    public List<String> getEntities() {
    return entities;
  }

  public void setEntities(List<String> entities) {
    this.entities = entities;
  }

  public IncidentInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A numeric severity or priority for the incident. On the UI we will translate this into something easy to understand. Currently supported: 0 - CRITICAL, 1 - HIGH, 2 - MED, 3 - LOW (We probably should have modeled as an enum)
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
   **/
  @Schema(description = "A numeric severity or priority for the incident. On the UI we will translate this into something easy to understand. Currently supported: 0 - CRITICAL, 1 - HIGH, 2 - MED, 3 - LOW (We probably should have modeled as an enum)")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public IncidentInfo assignees(List<IncidentAssignee> assignees) {
    this.assignees = assignees;
    return this;
  }

  public IncidentInfo addAssigneesItem(IncidentAssignee assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

  /**
   * The parties assigned with resolving the incident
   * @return assignees
   **/
  @Schema(description = "The parties assigned with resolving the incident")
      @Valid
    public List<IncidentAssignee> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<IncidentAssignee> assignees) {
    this.assignees = assignees;
  }

  public IncidentInfo status(IncidentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IncidentStatus getStatus() {
    return status;
  }

  public void setStatus(IncidentStatus status) {
    this.status = status;
  }

  public IncidentInfo source(IncidentSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public IncidentSource getSource() {
    return source;
  }

  public void setSource(IncidentSource source) {
    this.source = source;
  }

  public IncidentInfo startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * The time at which the incident actually started (may be before the date it was raised).
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return startedAt
   **/
  @Schema(description = "The time at which the incident actually started (may be before the date it was raised).")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public IncidentInfo created(AuditStamp created) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentInfo incidentInfo = (IncidentInfo) o;
    return Objects.equals(this.type, incidentInfo.type) &&
        Objects.equals(this.customType, incidentInfo.customType) &&
        Objects.equals(this.title, incidentInfo.title) &&
        Objects.equals(this.description, incidentInfo.description) &&
        Objects.equals(this.entities, incidentInfo.entities) &&
        Objects.equals(this.priority, incidentInfo.priority) &&
        Objects.equals(this.assignees, incidentInfo.assignees) &&
        Objects.equals(this.status, incidentInfo.status) &&
        Objects.equals(this.source, incidentInfo.source) &&
        Objects.equals(this.startedAt, incidentInfo.startedAt) &&
        Objects.equals(this.created, incidentInfo.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, customType, title, description, entities, priority, assignees, status, source, startedAt, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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