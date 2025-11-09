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
 * Key for a Assertion
 */
@Schema(description = "Key for a Assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssertionKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "AssertionKey") @Builder.Default
  private String __type = "AssertionKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"AssertionKey"},
  defaultValue = "AssertionKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("assertionId") @Builder.Default
  private String assertionId = null;

  public AssertionKey assertionId(String assertionId) {
    this.assertionId = assertionId;
    return this;
  }

  /**
   * Unique id for the assertion.
   * @return assertionId
   **/
  @Schema(required = true, description = "Unique id for the assertion.")
      @NotNull

    public String getAssertionId() {
    return assertionId;
  }

  public void setAssertionId(String assertionId) {
    this.assertionId = assertionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionKey assertionKey = (AssertionKey) o;
    return Objects.equals(this.assertionId, assertionKey.assertionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionKey {\n");
    
    sb.append("    assertionId: ").append(toIndentedString(assertionId)).append("\n");
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