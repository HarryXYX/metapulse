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
 * A data quality contract pertaining to a physical data asset Data Quality contracts are used to make assertions about data quality metrics for a physical data asset
 */
@Schema(description = "A data quality contract pertaining to a physical data asset Data Quality contracts are used to make assertions about data quality metrics for a physical data asset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataQualityContract   {

  @JsonProperty("assertion") @Builder.Default
  private String assertion = null;

  public DataQualityContract assertion(String assertion) {
    this.assertion = assertion;
    return this;
  }

  /**
   * The assertion representing the Data Quality contract. E.g. a table or column-level assertion.
   * @return assertion
   **/
  @Schema(required = true, description = "The assertion representing the Data Quality contract. E.g. a table or column-level assertion.")
      @NotNull

    public String getAssertion() {
    return assertion;
  }

  public void setAssertion(String assertion) {
    this.assertion = assertion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataQualityContract dataQualityContract = (DataQualityContract) o;
    return Objects.equals(this.assertion, dataQualityContract.assertion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataQualityContract {\n");
    
    sb.append("    assertion: ").append(toIndentedString(assertion)).append("\n");
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