package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.BucketStorageLocation;
import io.datahubproject.openapi.generated.FileUploadScenario;
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
 * Information about a DataHub file - a file stored in S3 for use within DataHub platform features like documentation, home pages, and announcements.
 */
@Schema(description = "Information about a DataHub file - a file stored in S3 for use within DataHub platform features like documentation, home pages, and announcements.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubFileInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubFileInfo") @Builder.Default
  private String __type = "DataHubFileInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubFileInfo"},
  defaultValue = "DataHubFileInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("bucketStorageLocation") @Builder.Default
  private BucketStorageLocation bucketStorageLocation = null;

  @JsonProperty("originalFileName") @Builder.Default
  private String originalFileName = null;

  @JsonProperty("mimeType") @Builder.Default
  private String mimeType = null;

  @JsonProperty("sizeInBytes") @Builder.Default
  private Long sizeInBytes = null;

  @JsonProperty("scenario") @Builder.Default
  private FileUploadScenario scenario = null;

  @JsonProperty("referencedByAsset") @Builder.Default
  private String referencedByAsset = null;

  @JsonProperty("schemaField") @Builder.Default
  private String schemaField = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("contentHash") @Builder.Default
  private String contentHash = null;

  public DataHubFileInfo bucketStorageLocation(BucketStorageLocation bucketStorageLocation) {
    this.bucketStorageLocation = bucketStorageLocation;
    return this;
  }

  /**
   * Get bucketStorageLocation
   * @return bucketStorageLocation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BucketStorageLocation getBucketStorageLocation() {
    return bucketStorageLocation;
  }

  public void setBucketStorageLocation(BucketStorageLocation bucketStorageLocation) {
    this.bucketStorageLocation = bucketStorageLocation;
  }

  public DataHubFileInfo originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * The original filename as uploaded by the user
   * @return originalFileName
   **/
  @Schema(required = true, description = "The original filename as uploaded by the user")
      @NotNull

    public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public DataHubFileInfo mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * MIME type of the file (e.g., image/png, application/pdf)
   * @return mimeType
   **/
  @Schema(required = true, description = "MIME type of the file (e.g., image/png, application/pdf)")
      @NotNull

    public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public DataHubFileInfo sizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
  }

  /**
   * Size of the file in bytes
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return sizeInBytes
   **/
  @Schema(required = true, description = "Size of the file in bytes")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getSizeInBytes() {
    return sizeInBytes;
  }

  public void setSizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }

  public DataHubFileInfo scenario(FileUploadScenario scenario) {
    this.scenario = scenario;
    return this;
  }

  /**
   * Get scenario
   * @return scenario
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FileUploadScenario getScenario() {
    return scenario;
  }

  public void setScenario(FileUploadScenario scenario) {
    this.scenario = scenario;
  }

  public DataHubFileInfo referencedByAsset(String referencedByAsset) {
    this.referencedByAsset = referencedByAsset;
    return this;
  }

  /**
   * Optional URN of the entity this file is associated with (e.g., the dataset whose docs contain this file)
   * @return referencedByAsset
   **/
  @Schema(description = "Optional URN of the entity this file is associated with (e.g., the dataset whose docs contain this file)")
  
    public String getReferencedByAsset() {
    return referencedByAsset;
  }

  public void setReferencedByAsset(String referencedByAsset) {
    this.referencedByAsset = referencedByAsset;
  }

  public DataHubFileInfo schemaField(String schemaField) {
    this.schemaField = schemaField;
    return this;
  }

  /**
   * The dataset schema field urn this file is referenced by
   * @return schemaField
   **/
  @Schema(description = "The dataset schema field urn this file is referenced by")
  
    public String getSchemaField() {
    return schemaField;
  }

  public void setSchemaField(String schemaField) {
    this.schemaField = schemaField;
  }

  public DataHubFileInfo created(AuditStamp created) {
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

  public DataHubFileInfo contentHash(String contentHash) {
    this.contentHash = contentHash;
    return this;
  }

  /**
   * SHA-256 hash of file contents
   * @return contentHash
   **/
  @Schema(description = "SHA-256 hash of file contents")
  
    public String getContentHash() {
    return contentHash;
  }

  public void setContentHash(String contentHash) {
    this.contentHash = contentHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubFileInfo dataHubFileInfo = (DataHubFileInfo) o;
    return Objects.equals(this.bucketStorageLocation, dataHubFileInfo.bucketStorageLocation) &&
        Objects.equals(this.originalFileName, dataHubFileInfo.originalFileName) &&
        Objects.equals(this.mimeType, dataHubFileInfo.mimeType) &&
        Objects.equals(this.sizeInBytes, dataHubFileInfo.sizeInBytes) &&
        Objects.equals(this.scenario, dataHubFileInfo.scenario) &&
        Objects.equals(this.referencedByAsset, dataHubFileInfo.referencedByAsset) &&
        Objects.equals(this.schemaField, dataHubFileInfo.schemaField) &&
        Objects.equals(this.created, dataHubFileInfo.created) &&
        Objects.equals(this.contentHash, dataHubFileInfo.contentHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketStorageLocation, originalFileName, mimeType, sizeInBytes, scenario, referencedByAsset, schemaField, created, contentHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubFileInfo {\n");
    
    sb.append("    bucketStorageLocation: ").append(toIndentedString(bucketStorageLocation)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    referencedByAsset: ").append(toIndentedString(referencedByAsset)).append("\n");
    sb.append("    schemaField: ").append(toIndentedString(schemaField)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
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