package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DatasetFilterType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A definition of filters that should be used when querying an external Dataset or Table.  Note that this models should NOT be used for working with search / filter on DataHub Platform itself.
 */
@Schema(description = "A definition of filters that should be used when querying an external Dataset or Table.  Note that this models should NOT be used for working with search / filter on DataHub Platform itself.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetFilter   {

  @JsonProperty("type") @Builder.Default
  private DatasetFilterType type = null;

  @JsonProperty("sql") @Builder.Default
  private String sql = null;

  public DatasetFilter type(DatasetFilterType type) {
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
    public DatasetFilterType getType() {
    return type;
  }

  public void setType(DatasetFilterType type) {
    this.type = type;
  }

  public DatasetFilter sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * The raw where clause string which will be used for monitoring. Required if the type is SQL.
   * @return sql
   **/
  @Schema(description = "The raw where clause string which will be used for monitoring. Required if the type is SQL.")
  
    public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetFilter datasetFilter = (DatasetFilter) o;
    return Objects.equals(this.type, datasetFilter.type) &&
        Objects.equals(this.sql, datasetFilter.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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