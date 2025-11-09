package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.KafkaAuditHeader;
import io.datahubproject.openapi.generated.MetadataChangeProposal;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Kafka event for capturing a failure to process a specific MetadataChangeEvent.
 */
@Schema(description = "Kafka event for capturing a failure to process a specific MetadataChangeEvent.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FailedMetadataChangeProposal   {

  @JsonProperty("auditHeader") @Builder.Default
  private KafkaAuditHeader auditHeader = null;

  @JsonProperty("metadataChangeProposal") @Builder.Default
  private MetadataChangeProposal metadataChangeProposal = null;

  @JsonProperty("error") @Builder.Default
  private String error = null;

  public FailedMetadataChangeProposal auditHeader(KafkaAuditHeader auditHeader) {
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

  public FailedMetadataChangeProposal metadataChangeProposal(MetadataChangeProposal metadataChangeProposal) {
    this.metadataChangeProposal = metadataChangeProposal;
    return this;
  }

  /**
   * Get metadataChangeProposal
   * @return metadataChangeProposal
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public MetadataChangeProposal getMetadataChangeProposal() {
    return metadataChangeProposal;
  }

  public void setMetadataChangeProposal(MetadataChangeProposal metadataChangeProposal) {
    this.metadataChangeProposal = metadataChangeProposal;
  }

  public FailedMetadataChangeProposal error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The error message or the stacktrace for the failure.
   * @return error
   **/
  @Schema(required = true, description = "The error message or the stacktrace for the failure.")
      @NotNull

    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedMetadataChangeProposal failedMetadataChangeProposal = (FailedMetadataChangeProposal) o;
    return Objects.equals(this.auditHeader, failedMetadataChangeProposal.auditHeader) &&
        Objects.equals(this.metadataChangeProposal, failedMetadataChangeProposal.metadataChangeProposal) &&
        Objects.equals(this.error, failedMetadataChangeProposal.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditHeader, metadataChangeProposal, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedMetadataChangeProposal {\n");
    
    sb.append("    auditHeader: ").append(toIndentedString(auditHeader)).append("\n");
    sb.append("    metadataChangeProposal: ").append(toIndentedString(metadataChangeProposal)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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