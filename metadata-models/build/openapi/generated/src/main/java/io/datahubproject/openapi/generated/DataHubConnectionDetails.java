package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubConnectionDetailsType;
import io.datahubproject.openapi.generated.DataHubJsonConnection;
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
 * Information about a connection to an external platform.
 */
@Schema(description = "Information about a connection to an external platform.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubConnectionDetails  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubConnectionDetails") @Builder.Default
  private String __type = "DataHubConnectionDetails";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubConnectionDetails"},
  defaultValue = "DataHubConnectionDetails")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("type") @Builder.Default
  private DataHubConnectionDetailsType type = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("json") @Builder.Default
  private DataHubJsonConnection json = null;

  public DataHubConnectionDetails type(DataHubConnectionDetailsType type) {
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
    public DataHubConnectionDetailsType getType() {
    return type;
  }

  public void setType(DataHubConnectionDetailsType type) {
    this.type = type;
  }

  public DataHubConnectionDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the connection
   * @return name
   **/
  @Schema(description = "Display name of the connection")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubConnectionDetails json(DataHubJsonConnection json) {
    this.json = json;
    return this;
  }

  /**
   * Get json
   * @return json
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubJsonConnection getJson() {
    return json;
  }

  public void setJson(DataHubJsonConnection json) {
    this.json = json;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubConnectionDetails dataHubConnectionDetails = (DataHubConnectionDetails) o;
    return Objects.equals(this.type, dataHubConnectionDetails.type) &&
        Objects.equals(this.name, dataHubConnectionDetails.name) &&
        Objects.equals(this.json, dataHubConnectionDetails.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubConnectionDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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