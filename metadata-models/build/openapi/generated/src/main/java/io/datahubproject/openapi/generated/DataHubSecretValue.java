package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * The value of a DataHub Secret
 */
@Schema(description = "The value of a DataHub Secret")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubSecretValue  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubSecretValue") @Builder.Default
  private String __type = "DataHubSecretValue";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubSecretValue"},
  defaultValue = "DataHubSecretValue")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("value") @Builder.Default
  private String value = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  public DataHubSecretValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name for the secret
   * @return name
   **/
  @Schema(required = true, description = "The display name for the secret")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubSecretValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The AES-encrypted value of the DataHub secret.
   * @return value
   **/
  @Schema(required = true, description = "The AES-encrypted value of the DataHub secret.")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DataHubSecretValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the secret
   * @return description
   **/
  @Schema(description = "Description of the secret")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataHubSecretValue created(AuditStamp created) {
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
    DataHubSecretValue dataHubSecretValue = (DataHubSecretValue) o;
    return Objects.equals(this.name, dataHubSecretValue.name) &&
        Objects.equals(this.value, dataHubSecretValue.value) &&
        Objects.equals(this.description, dataHubSecretValue.description) &&
        Objects.equals(this.created, dataHubSecretValue.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, description, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubSecretValue {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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