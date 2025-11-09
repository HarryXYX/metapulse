package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GroupingBucketType;
import io.datahubproject.openapi.generated.TimeWindowSize;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Defines the group by bucket components/schemas for time series requests.
 */
@Schema(description = "Defines the group by bucket components/schemas for time series requests.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupingBucket   {

  @JsonProperty("type") @Builder.Default
  private GroupingBucketType type = null;

  @JsonProperty("key") @Builder.Default
  private String key = null;

  @JsonProperty("timeWindowSize") @Builder.Default
  private TimeWindowSize timeWindowSize = null;

  @JsonProperty("timeZone") @Builder.Default
  private String timeZone = null;

  public GroupingBucket type(GroupingBucketType type) {
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
    public GroupingBucketType getType() {
    return type;
  }

  public void setType(GroupingBucketType type) {
    this.type = type;
  }

  public GroupingBucket key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key that specifies the column name to be used as the timestamp field for bucketing.
   * @return key
   **/
  @Schema(required = true, description = "Key that specifies the column name to be used as the timestamp field for bucketing.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GroupingBucket timeWindowSize(TimeWindowSize timeWindowSize) {
    this.timeWindowSize = timeWindowSize;
    return this;
  }

  /**
   * Get timeWindowSize
   * @return timeWindowSize
   **/
  @Schema(description = "")
  
    @Valid
    public TimeWindowSize getTimeWindowSize() {
    return timeWindowSize;
  }

  public void setTimeWindowSize(TimeWindowSize timeWindowSize) {
    this.timeWindowSize = timeWindowSize;
  }

  public GroupingBucket timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Optional specified time zone to take into account when grouping by date
   * @return timeZone
   **/
  @Schema(description = "Optional specified time zone to take into account when grouping by date")
  
    public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupingBucket groupingBucket = (GroupingBucket) o;
    return Objects.equals(this.type, groupingBucket.type) &&
        Objects.equals(this.key, groupingBucket.key) &&
        Objects.equals(this.timeWindowSize, groupingBucket.timeWindowSize) &&
        Objects.equals(this.timeZone, groupingBucket.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key, timeWindowSize, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupingBucket {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeWindowSize: ").append(toIndentedString(timeWindowSize)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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