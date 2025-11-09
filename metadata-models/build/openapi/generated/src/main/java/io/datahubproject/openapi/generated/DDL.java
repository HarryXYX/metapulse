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
 * Schema text for the data definition language that describes an Relational DBMS table.
 */
@Schema(description = "Schema text for the data definition language that describes an Relational DBMS table.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DDL   {

  @JsonProperty("tableDDL") @Builder.Default
  private String tableDDL = null;

  public DDL tableDDL(String tableDDL) {
    this.tableDDL = tableDDL;
    return this;
  }

  /**
   * The native SQL DDL that describe an Relational DBMS table.
   * @return tableDDL
   **/
  @Schema(required = true, description = "The native SQL DDL that describe an Relational DBMS table.")
      @NotNull

    public String getTableDDL() {
    return tableDDL;
  }

  public void setTableDDL(String tableDDL) {
    this.tableDDL = tableDDL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DDL DDL = (DDL) o;
    return Objects.equals(this.tableDDL, DDL.tableDDL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableDDL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DDL {\n");
    
    sb.append("    tableDDL: ").append(toIndentedString(tableDDL)).append("\n");
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