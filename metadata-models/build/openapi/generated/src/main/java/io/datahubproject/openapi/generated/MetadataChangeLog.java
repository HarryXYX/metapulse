package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.ChangeType;
import io.datahubproject.openapi.generated.GenericAspect;
import io.datahubproject.openapi.generated.KafkaAuditHeader;
import io.datahubproject.openapi.generated.SystemMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Kafka event for capturing update made to an entity&#x27;s metadata.
 */
@Schema(description = "Kafka event for capturing update made to an entity's metadata.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetadataChangeLog   {

  @JsonProperty("auditHeader") @Builder.Default
  private KafkaAuditHeader auditHeader = null;

  @JsonProperty("entityType") @Builder.Default
  private String entityType = null;

  @JsonProperty("entityUrn") @Builder.Default
  private String entityUrn = null;

  @JsonProperty("entityKeyAspect") @Builder.Default
  private GenericAspect entityKeyAspect = null;

  @JsonProperty("changeType") @Builder.Default
  private ChangeType changeType = null;

  @JsonProperty("aspectName") @Builder.Default
  private String aspectName = null;

  @JsonProperty("aspect") @Builder.Default
  private GenericAspect aspect = null;

  @JsonProperty("systemMetadata") @Builder.Default
  private SystemMetadata systemMetadata = null;

  @JsonProperty("headers") @Builder.Default
  @Valid
  private Map<String, String> headers = null;

  @JsonProperty("previousAspectValue") @Builder.Default
  private GenericAspect previousAspectValue = null;

  @JsonProperty("previousSystemMetadata") @Builder.Default
  private SystemMetadata previousSystemMetadata = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  public MetadataChangeLog auditHeader(KafkaAuditHeader auditHeader) {
    this.auditHeader = auditHeader;
    return this;
  }

  /**
   * Get auditHeader
   * @return auditHeader
   **/
  @Schema(description = "")
  
    @Valid
    public KafkaAuditHeader getAuditHeader() {
    return auditHeader;
  }

  public void setAuditHeader(KafkaAuditHeader auditHeader) {
    this.auditHeader = auditHeader;
  }

  public MetadataChangeLog entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Type of the entity being written to
   * @return entityType
   **/
  @Schema(required = true, description = "Type of the entity being written to")
      @NotNull

    public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public MetadataChangeLog entityUrn(String entityUrn) {
    this.entityUrn = entityUrn;
    return this;
  }

  /**
   * Urn of the entity being written
   * @return entityUrn
   **/
  @Schema(description = "Urn of the entity being written")
  
    public String getEntityUrn() {
    return entityUrn;
  }

  public void setEntityUrn(String entityUrn) {
    this.entityUrn = entityUrn;
  }

  public MetadataChangeLog entityKeyAspect(GenericAspect entityKeyAspect) {
    this.entityKeyAspect = entityKeyAspect;
    return this;
  }

  /**
   * Get entityKeyAspect
   * @return entityKeyAspect
   **/
  @Schema(description = "")
  
    @Valid
    public GenericAspect getEntityKeyAspect() {
    return entityKeyAspect;
  }

  public void setEntityKeyAspect(GenericAspect entityKeyAspect) {
    this.entityKeyAspect = entityKeyAspect;
  }

  public MetadataChangeLog changeType(ChangeType changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeType changeType) {
    this.changeType = changeType;
  }

  public MetadataChangeLog aspectName(String aspectName) {
    this.aspectName = aspectName;
    return this;
  }

  /**
   * Aspect of the entity being written to Not filling this out implies that the writer wants to affect the entire entity Note: This is only valid for CREATE, UPSERT, and DELETE operations.
   * @return aspectName
   **/
  @Schema(description = "Aspect of the entity being written to Not filling this out implies that the writer wants to affect the entire entity Note: This is only valid for CREATE, UPSERT, and DELETE operations.")
  
    public String getAspectName() {
    return aspectName;
  }

  public void setAspectName(String aspectName) {
    this.aspectName = aspectName;
  }

  public MetadataChangeLog aspect(GenericAspect aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Get aspect
   * @return aspect
   **/
  @Schema(description = "")
  
    @Valid
    public GenericAspect getAspect() {
    return aspect;
  }

  public void setAspect(GenericAspect aspect) {
    this.aspect = aspect;
  }

  public MetadataChangeLog systemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
    return this;
  }

  /**
   * Get systemMetadata
   * @return systemMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SystemMetadata getSystemMetadata() {
    return systemMetadata;
  }

  public void setSystemMetadata(SystemMetadata systemMetadata) {
    this.systemMetadata = systemMetadata;
  }

  public MetadataChangeLog headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public MetadataChangeLog putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Headers - intended to mimic http headers
   * @return headers
   **/
  @Schema(description = "Headers - intended to mimic http headers")
  
    public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public MetadataChangeLog previousAspectValue(GenericAspect previousAspectValue) {
    this.previousAspectValue = previousAspectValue;
    return this;
  }

  /**
   * Get previousAspectValue
   * @return previousAspectValue
   **/
  @Schema(description = "")
  
    @Valid
    public GenericAspect getPreviousAspectValue() {
    return previousAspectValue;
  }

  public void setPreviousAspectValue(GenericAspect previousAspectValue) {
    this.previousAspectValue = previousAspectValue;
  }

  public MetadataChangeLog previousSystemMetadata(SystemMetadata previousSystemMetadata) {
    this.previousSystemMetadata = previousSystemMetadata;
    return this;
  }

  /**
   * Get previousSystemMetadata
   * @return previousSystemMetadata
   **/
  @Schema(description = "")
  
    @Valid
    public SystemMetadata getPreviousSystemMetadata() {
    return previousSystemMetadata;
  }

  public void setPreviousSystemMetadata(SystemMetadata previousSystemMetadata) {
    this.previousSystemMetadata = previousSystemMetadata;
  }

  public MetadataChangeLog created(AuditStamp created) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataChangeLog metadataChangeLog = (MetadataChangeLog) o;
    return Objects.equals(this.auditHeader, metadataChangeLog.auditHeader) &&
        Objects.equals(this.entityType, metadataChangeLog.entityType) &&
        Objects.equals(this.entityUrn, metadataChangeLog.entityUrn) &&
        Objects.equals(this.entityKeyAspect, metadataChangeLog.entityKeyAspect) &&
        Objects.equals(this.changeType, metadataChangeLog.changeType) &&
        Objects.equals(this.aspectName, metadataChangeLog.aspectName) &&
        Objects.equals(this.aspect, metadataChangeLog.aspect) &&
        Objects.equals(this.systemMetadata, metadataChangeLog.systemMetadata) &&
        Objects.equals(this.headers, metadataChangeLog.headers) &&
        Objects.equals(this.previousAspectValue, metadataChangeLog.previousAspectValue) &&
        Objects.equals(this.previousSystemMetadata, metadataChangeLog.previousSystemMetadata) &&
        Objects.equals(this.created, metadataChangeLog.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditHeader, entityType, entityUrn, entityKeyAspect, changeType, aspectName, aspect, systemMetadata, headers, previousAspectValue, previousSystemMetadata, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataChangeLog {\n");
    
    sb.append("    auditHeader: ").append(toIndentedString(auditHeader)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityUrn: ").append(toIndentedString(entityUrn)).append("\n");
    sb.append("    entityKeyAspect: ").append(toIndentedString(entityKeyAspect)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    aspectName: ").append(toIndentedString(aspectName)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    systemMetadata: ").append(toIndentedString(systemMetadata)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    previousAspectValue: ").append(toIndentedString(previousAspectValue)).append("\n");
    sb.append("    previousSystemMetadata: ").append(toIndentedString(previousSystemMetadata)).append("\n");
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