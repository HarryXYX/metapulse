package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AssertionStdOperator;
import io.datahubproject.openapi.generated.AssertionStdParameters;
import io.datahubproject.openapi.generated.AssertionValueChangeType;
import io.datahubproject.openapi.generated.SqlAssertionType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Attributes defining a SQL Assertion
 */
@Schema(description = "Attributes defining a SQL Assertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SqlAssertionInfo   {

  @JsonProperty("type") @Builder.Default
  private SqlAssertionType type = null;

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("statement") @Builder.Default
  private String statement = null;

  @JsonProperty("changeType") @Builder.Default
  private AssertionValueChangeType changeType = null;

  @JsonProperty("operator") @Builder.Default
  private AssertionStdOperator operator = null;

  @JsonProperty("parameters") @Builder.Default
  private AssertionStdParameters parameters = null;

  public SqlAssertionInfo type(SqlAssertionType type) {
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
    public SqlAssertionType getType() {
    return type;
  }

  public void setType(SqlAssertionType type) {
    this.type = type;
  }

  public SqlAssertionInfo entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity targeted by this SQL check.
   * @return entity
   **/
  @Schema(required = true, description = "The entity targeted by this SQL check.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public SqlAssertionInfo statement(String statement) {
    this.statement = statement;
    return this;
  }

  /**
   * The SQL statement to be executed when evaluating the assertion (or computing the metric). This should be a valid and complete statement, executable by itself.  Usually this should be a SELECT query statement.
   * @return statement
   **/
  @Schema(required = true, description = "The SQL statement to be executed when evaluating the assertion (or computing the metric). This should be a valid and complete statement, executable by itself.  Usually this should be a SELECT query statement.")
      @NotNull

    public String getStatement() {
    return statement;
  }

  public void setStatement(String statement) {
    this.statement = statement;
  }

  public SqlAssertionInfo changeType(AssertionValueChangeType changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
   **/
  @Schema(description = "")
  
    @Valid
    public AssertionValueChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(AssertionValueChangeType changeType) {
    this.changeType = changeType;
  }

  public SqlAssertionInfo operator(AssertionStdOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssertionStdOperator getOperator() {
    return operator;
  }

  public void setOperator(AssertionStdOperator operator) {
    this.operator = operator;
  }

  public SqlAssertionInfo parameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssertionStdParameters getParameters() {
    return parameters;
  }

  public void setParameters(AssertionStdParameters parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlAssertionInfo sqlAssertionInfo = (SqlAssertionInfo) o;
    return Objects.equals(this.type, sqlAssertionInfo.type) &&
        Objects.equals(this.entity, sqlAssertionInfo.entity) &&
        Objects.equals(this.statement, sqlAssertionInfo.statement) &&
        Objects.equals(this.changeType, sqlAssertionInfo.changeType) &&
        Objects.equals(this.operator, sqlAssertionInfo.operator) &&
        Objects.equals(this.parameters, sqlAssertionInfo.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entity, statement, changeType, operator, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlAssertionInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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