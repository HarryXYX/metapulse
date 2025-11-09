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
 * Information where a file is stored
 */
@Schema(description = "Information where a file is stored")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BucketStorageLocation   {

  @JsonProperty("storageBucket") @Builder.Default
  private String storageBucket = null;

  @JsonProperty("storageKey") @Builder.Default
  private String storageKey = null;

  public BucketStorageLocation storageBucket(String storageBucket) {
    this.storageBucket = storageBucket;
    return this;
  }

  /**
   * The storage bucket this file is stored in
   * @return storageBucket
   **/
  @Schema(required = true, description = "The storage bucket this file is stored in")
      @NotNull

    public String getStorageBucket() {
    return storageBucket;
  }

  public void setStorageBucket(String storageBucket) {
    this.storageBucket = storageBucket;
  }

  public BucketStorageLocation storageKey(String storageKey) {
    this.storageKey = storageKey;
    return this;
  }

  /**
   * The key for where this file is stored inside of the given bucket
   * @return storageKey
   **/
  @Schema(required = true, description = "The key for where this file is stored inside of the given bucket")
      @NotNull

    public String getStorageKey() {
    return storageKey;
  }

  public void setStorageKey(String storageKey) {
    this.storageKey = storageKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketStorageLocation bucketStorageLocation = (BucketStorageLocation) o;
    return Objects.equals(this.storageBucket, bucketStorageLocation.storageBucket) &&
        Objects.equals(this.storageKey, bucketStorageLocation.storageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageBucket, storageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketStorageLocation {\n");
    
    sb.append("    storageBucket: ").append(toIndentedString(storageBucket)).append("\n");
    sb.append("    storageKey: ").append(toIndentedString(storageKey)).append("\n");
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