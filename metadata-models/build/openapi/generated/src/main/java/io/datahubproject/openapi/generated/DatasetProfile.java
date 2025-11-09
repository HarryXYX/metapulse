package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFieldProfile;
import io.datahubproject.openapi.generated.PartitionSpec;
import io.datahubproject.openapi.generated.TimeWindowSize;
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
 * Stats corresponding to datasets
 */
@Schema(description = "Stats corresponding to datasets")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetProfile  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DatasetProfile") @Builder.Default
  private String __type = "DatasetProfile";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DatasetProfile"},
  defaultValue = "DatasetProfile")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("timestampMillis") @Builder.Default
  private Long timestampMillis = null;

  @JsonProperty("eventGranularity") @Builder.Default
  private TimeWindowSize eventGranularity = null;

  @JsonProperty("partitionSpec") @Builder.Default
  private PartitionSpec partitionSpec = null;

  @JsonProperty("messageId") @Builder.Default
  private String messageId = null;

  @JsonProperty("rowCount") @Builder.Default
  private Long rowCount = null;

  @JsonProperty("columnCount") @Builder.Default
  private Long columnCount = null;

  @JsonProperty("fieldProfiles") @Builder.Default
  @Valid
  private List<DatasetFieldProfile> fieldProfiles = null;

  @JsonProperty("sizeInBytes") @Builder.Default
  private Long sizeInBytes = null;

  public DatasetProfile timestampMillis(Long timestampMillis) {
    this.timestampMillis = timestampMillis;
    return this;
  }

  /**
   * The event timestamp field as epoch at UTC in milli seconds.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return timestampMillis
   **/
  @Schema(required = true, description = "The event timestamp field as epoch at UTC in milli seconds.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getTimestampMillis() {
    return timestampMillis;
  }

  public void setTimestampMillis(Long timestampMillis) {
    this.timestampMillis = timestampMillis;
  }

  public DatasetProfile eventGranularity(TimeWindowSize eventGranularity) {
    this.eventGranularity = eventGranularity;
    return this;
  }

  /**
   * Get eventGranularity
   * @return eventGranularity
   **/
  @Schema(description = "")
  
    @Valid
    public TimeWindowSize getEventGranularity() {
    return eventGranularity;
  }

  public void setEventGranularity(TimeWindowSize eventGranularity) {
    this.eventGranularity = eventGranularity;
  }

  public DatasetProfile partitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
    return this;
  }

  /**
   * Get partitionSpec
   * @return partitionSpec
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PartitionSpec getPartitionSpec() {
    return partitionSpec;
  }

  public void setPartitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
  }

  public DatasetProfile messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.
   * @return messageId
   **/
  @Schema(description = "The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.")
  
    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public DatasetProfile rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * The total number of rows
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return rowCount
   **/
  @Schema(description = "The total number of rows")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getRowCount() {
    return rowCount;
  }

  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }

  public DatasetProfile columnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  /**
   * The total number of columns (or schema fields)
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return columnCount
   **/
  @Schema(description = "The total number of columns (or schema fields)")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
  }

  public DatasetProfile fieldProfiles(List<DatasetFieldProfile> fieldProfiles) {
    this.fieldProfiles = fieldProfiles;
    return this;
  }

  public DatasetProfile addFieldProfilesItem(DatasetFieldProfile fieldProfilesItem) {
    if (this.fieldProfiles == null) {
      this.fieldProfiles = new ArrayList<>();
    }
    this.fieldProfiles.add(fieldProfilesItem);
    return this;
  }

  /**
   * Profiles for each column (or schema field)
   * @return fieldProfiles
   **/
  @Schema(description = "Profiles for each column (or schema field)")
      @Valid
    public List<DatasetFieldProfile> getFieldProfiles() {
    return fieldProfiles;
  }

  public void setFieldProfiles(List<DatasetFieldProfile> fieldProfiles) {
    this.fieldProfiles = fieldProfiles;
  }

  public DatasetProfile sizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
  }

  /**
   * Storage size in bytes
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return sizeInBytes
   **/
  @Schema(description = "Storage size in bytes")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getSizeInBytes() {
    return sizeInBytes;
  }

  public void setSizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetProfile datasetProfile = (DatasetProfile) o;
    return Objects.equals(this.timestampMillis, datasetProfile.timestampMillis) &&
        Objects.equals(this.eventGranularity, datasetProfile.eventGranularity) &&
        Objects.equals(this.partitionSpec, datasetProfile.partitionSpec) &&
        Objects.equals(this.messageId, datasetProfile.messageId) &&
        Objects.equals(this.rowCount, datasetProfile.rowCount) &&
        Objects.equals(this.columnCount, datasetProfile.columnCount) &&
        Objects.equals(this.fieldProfiles, datasetProfile.fieldProfiles) &&
        Objects.equals(this.sizeInBytes, datasetProfile.sizeInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampMillis, eventGranularity, partitionSpec, messageId, rowCount, columnCount, fieldProfiles, sizeInBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetProfile {\n");
    
    sb.append("    timestampMillis: ").append(toIndentedString(timestampMillis)).append("\n");
    sb.append("    eventGranularity: ").append(toIndentedString(eventGranularity)).append("\n");
    sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
    sb.append("    fieldProfiles: ").append(toIndentedString(fieldProfiles)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
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