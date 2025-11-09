package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * The properties associated with a DataHub step state
 */
@Schema(description = "The properties associated with a DataHub step state")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubStepStateProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubStepStateProperties") @Builder.Default
  private String __type = "DataHubStepStateProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubStepStateProperties"},
  defaultValue = "DataHubStepStateProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("properties") @Builder.Default
  @Valid
  private Map<String, String> properties = new HashMap<>();

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public DataHubStepStateProperties properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public DataHubStepStateProperties putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Description of the secret
   * @return properties
   **/
  @Schema(required = true, description = "Description of the secret")
      @NotNull

    public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public DataHubStepStateProperties lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubStepStateProperties dataHubStepStateProperties = (DataHubStepStateProperties) o;
    return Objects.equals(this.properties, dataHubStepStateProperties.properties) &&
        Objects.equals(this.lastModified, dataHubStepStateProperties.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubStepStateProperties {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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