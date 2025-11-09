package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IncidentSourceType;
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
 * Information about the source of an incident raised on an asset.
 */
@Schema(description = "Information about the source of an incident raised on an asset.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentSource  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IncidentSource") @Builder.Default
  private String __type = "IncidentSource";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IncidentSource"},
  defaultValue = "IncidentSource")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("type") @Builder.Default
  private IncidentSourceType type = null;

  @JsonProperty("sourceUrn") @Builder.Default
  private String sourceUrn = null;

  public IncidentSource type(IncidentSourceType type) {
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
    public IncidentSourceType getType() {
    return type;
  }

  public void setType(IncidentSourceType type) {
    this.type = type;
  }

  public IncidentSource sourceUrn(String sourceUrn) {
    this.sourceUrn = sourceUrn;
    return this;
  }

  /**
   * Reference to an URN related to the source of an incident.
   * @return sourceUrn
   **/
  @Schema(description = "Reference to an URN related to the source of an incident.")
  
    public String getSourceUrn() {
    return sourceUrn;
  }

  public void setSourceUrn(String sourceUrn) {
    this.sourceUrn = sourceUrn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSource incidentSource = (IncidentSource) o;
    return Objects.equals(this.type, incidentSource.type) &&
        Objects.equals(this.sourceUrn, incidentSource.sourceUrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceUrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceUrn: ").append(toIndentedString(sourceUrn)).append("\n");
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