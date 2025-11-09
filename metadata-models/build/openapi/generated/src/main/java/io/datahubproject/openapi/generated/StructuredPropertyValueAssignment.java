package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.MetadataAttribution;
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
/**
 * StructuredPropertyValueAssignment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredPropertyValueAssignment   {

  @JsonProperty("propertyUrn") @Builder.Default
  private String propertyUrn = null;

  @JsonProperty("values") @Builder.Default
  @Valid
  private List<String> values = new ArrayList<>();

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("attribution") @Builder.Default
  private MetadataAttribution attribution = null;

  public StructuredPropertyValueAssignment propertyUrn(String propertyUrn) {
    this.propertyUrn = propertyUrn;
    return this;
  }

  /**
   * The property that is being assigned a value.
   * @return propertyUrn
   **/
  @Schema(required = true, description = "The property that is being assigned a value.")
      @NotNull

    public String getPropertyUrn() {
    return propertyUrn;
  }

  public void setPropertyUrn(String propertyUrn) {
    this.propertyUrn = propertyUrn;
  }

  public StructuredPropertyValueAssignment values(List<String> values) {
    this.values = values;
    return this;
  }

  public StructuredPropertyValueAssignment addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The value assigned to the property.
   * @return values
   **/
  @Schema(required = true, description = "The value assigned to the property.")
      @NotNull

    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public StructuredPropertyValueAssignment created(AuditStamp created) {
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

  public StructuredPropertyValueAssignment lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public StructuredPropertyValueAssignment attribution(MetadataAttribution attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Get attribution
   * @return attribution
   **/
  @Schema(description = "")
  
    @Valid
    public MetadataAttribution getAttribution() {
    return attribution;
  }

  public void setAttribution(MetadataAttribution attribution) {
    this.attribution = attribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredPropertyValueAssignment structuredPropertyValueAssignment = (StructuredPropertyValueAssignment) o;
    return Objects.equals(this.propertyUrn, structuredPropertyValueAssignment.propertyUrn) &&
        Objects.equals(this.values, structuredPropertyValueAssignment.values) &&
        Objects.equals(this.created, structuredPropertyValueAssignment.created) &&
        Objects.equals(this.lastModified, structuredPropertyValueAssignment.lastModified) &&
        Objects.equals(this.attribution, structuredPropertyValueAssignment.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyUrn, values, created, lastModified, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPropertyValueAssignment {\n");
    
    sb.append("    propertyUrn: ").append(toIndentedString(propertyUrn)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
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