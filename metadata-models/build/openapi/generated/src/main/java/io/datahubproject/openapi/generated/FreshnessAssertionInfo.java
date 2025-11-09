package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFilter;
import io.datahubproject.openapi.generated.FreshnessAssertionSchedule;
import io.datahubproject.openapi.generated.FreshnessAssertionType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a Freshness Assertion.
 */
@Schema(description = "Attributes defining a Freshness Assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreshnessAssertionInfo   {

  @JsonProperty("type") @Builder.Default
  private FreshnessAssertionType type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("schedule") @Builder.Default
  private FreshnessAssertionSchedule schedule = null;

  @JsonProperty("filter") @Builder.Default
  private DatasetFilter filter = null;

  public FreshnessAssertionInfo type(FreshnessAssertionType type) {
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
    public FreshnessAssertionType getType() {
    return type;
  }

  public void setType(FreshnessAssertionType type) {
    this.type = type;
  }

  public FreshnessAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by this Freshness check.
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by this Freshness check.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public FreshnessAssertionInfo schedule(FreshnessAssertionSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FreshnessAssertionSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(FreshnessAssertionSchedule schedule) {
    this.schedule = schedule;
  }

  public FreshnessAssertionInfo filter(DatasetFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @Schema(description = "")
  
    @Valid
    public DatasetFilter getFilter() {
    return filter;
  }

  public void setFilter(DatasetFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshnessAssertionInfo freshnessAssertionInfo = (FreshnessAssertionInfo) o;
    return Objects.equals(this.type, freshnessAssertionInfo.type) &&
        Objects.equals(this.entity, freshnessAssertionInfo.entity) &&
        Objects.equals(this.schedule, freshnessAssertionInfo.schedule) &&
        Objects.equals(this.filter, freshnessAssertionInfo.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, schedule, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshnessAssertionInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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