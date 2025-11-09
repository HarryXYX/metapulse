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
 * A single subject of a particular query. In the future, we may evolve this model to include richer details about the Query Subject in relation to the query.
 */
@Schema(description = "A single subject of a particular query. In the future, we may evolve this model to include richer details about the Query Subject in relation to the query.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySubject   {

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  public QuerySubject entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * An entity which is the subject of a query.
   * @return entity
   **/
  @Schema(required = true, description = "An entity which is the subject of a query.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySubject querySubject = (QuerySubject) o;
    return Objects.equals(this.entity, querySubject.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySubject {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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