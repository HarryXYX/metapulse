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
/**
 * Data model for an entity returned as an autocomplete suggestion
 */
@Schema(description = "Data model for an entity returned as an autocomplete suggestion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoCompleteEntity   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  public AutoCompleteEntity urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Urn of the entity
   * @return urn
   **/
  @Schema(required = true, description = "Urn of the entity")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCompleteEntity autoCompleteEntity = (AutoCompleteEntity) o;
    return Objects.equals(this.urn, autoCompleteEntity.urn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCompleteEntity {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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