package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FreshnessStats;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A common model for the result of any query.  Expected to be included into other top level query results.
 */
@Schema(description = "A common model for the result of any query.  Expected to be included into other top level query results.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnyResult   {

  @JsonProperty("freshness") @Builder.Default
  private FreshnessStats freshness = null;

  public AnyResult freshness(FreshnessStats freshness) {
    this.freshness = freshness;
    return this;
  }

  /**
   * Get freshness
   * @return freshness
   **/
  @Schema(description = "")
  
    @Valid
    public FreshnessStats getFreshness() {
    return freshness;
  }

  public void setFreshness(FreshnessStats freshness) {
    this.freshness = freshness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyResult anyResult = (AnyResult) o;
    return Objects.equals(this.freshness, anyResult.freshness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freshness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyResult {\n");
    
    sb.append("    freshness: ").append(toIndentedString(freshness)).append("\n");
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