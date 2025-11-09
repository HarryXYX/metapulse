package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.OriginType;
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
 * Carries information about where an entity originated from.
 */
@Schema(description = "Carries information about where an entity originated from.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Origin  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Origin") @Builder.Default
  private String __type = "Origin";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Origin"},
  defaultValue = "Origin")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("type") @Builder.Default
  private OriginType type = null;

  @JsonProperty("externalType") @Builder.Default
  private String externalType = null;

  public Origin type(OriginType type) {
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
    public OriginType getType() {
    return type;
  }

  public void setType(OriginType type) {
    this.type = type;
  }

  public Origin externalType(String externalType) {
    this.externalType = externalType;
    return this;
  }

  /**
   * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
   * @return externalType
   **/
  @Schema(description = "Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.")
  
    public String getExternalType() {
    return externalType;
  }

  public void setExternalType(String externalType) {
    this.externalType = externalType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Origin origin = (Origin) o;
    return Objects.equals(this.type, origin.type) &&
        Objects.equals(this.externalType, origin.externalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Origin {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
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