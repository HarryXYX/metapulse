package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.QueryStatement;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about a transformation. It may be a query,
 */
@Schema(description = "Information about a transformation. It may be a query,")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTransform   {

  @JsonProperty("queryStatement") @Builder.Default
  private QueryStatement queryStatement = null;

  public DataTransform queryStatement(QueryStatement queryStatement) {
    this.queryStatement = queryStatement;
    return this;
  }

  /**
   * Get queryStatement
   * @return queryStatement
   **/
  @Schema(description = "")
  
    @Valid
    public QueryStatement getQueryStatement() {
    return queryStatement;
  }

  public void setQueryStatement(QueryStatement queryStatement) {
    this.queryStatement = queryStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTransform dataTransform = (DataTransform) o;
    return Objects.equals(this.queryStatement, dataTransform.queryStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTransform {\n");
    
    sb.append("    queryStatement: ").append(toIndentedString(queryStatement)).append("\n");
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