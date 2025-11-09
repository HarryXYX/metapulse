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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Schema holder for undefined schema types.
 */
@Schema(description = "Schema holder for undefined schema types.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OtherSchema  implements OneOfSchemaMetadataPlatformSchema {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "OtherSchema") @Builder.Default
  private String __type = "OtherSchema";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"OtherSchema"},
  defaultValue = "OtherSchema")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("rawSchema") @Builder.Default
  private String rawSchema = null;

  public OtherSchema rawSchema(String rawSchema) {
    this.rawSchema = rawSchema;
    return this;
  }

  /**
   * The native schema in the dataset's platform.
   * @return rawSchema
   **/
  @Schema(required = true, description = "The native schema in the dataset's platform.")
      @NotNull

    public String getRawSchema() {
    return rawSchema;
  }

  public void setRawSchema(String rawSchema) {
    this.rawSchema = rawSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherSchema otherSchema = (OtherSchema) o;
    return Objects.equals(this.rawSchema, otherSchema.rawSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherSchema {\n");
    
    sb.append("    rawSchema: ").append(toIndentedString(rawSchema)).append("\n");
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