package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Information about the Audit Log operation to use in evaluating an assertion.
 */
@Schema(description = "Information about the Audit Log operation to use in evaluating an assertion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogSpec   {

  @JsonProperty("operationTypes") @Builder.Default
  @Valid
  private List<String> operationTypes = null;

  @JsonProperty("userName") @Builder.Default
  private String userName = null;

  public AuditLogSpec operationTypes(List<String> operationTypes) {
    this.operationTypes = operationTypes;
    return this;
  }

  public AuditLogSpec addOperationTypesItem(String operationTypesItem) {
    if (this.operationTypes == null) {
      this.operationTypes = new ArrayList<>();
    }
    this.operationTypes.add(operationTypesItem);
    return this;
  }

  /**
   * The list of operation types that should be monitored. If not provided, a default set will be used.
   * @return operationTypes
   **/
  @Schema(description = "The list of operation types that should be monitored. If not provided, a default set will be used.")
  
    public List<String> getOperationTypes() {
    return operationTypes;
  }

  public void setOperationTypes(List<String> operationTypes) {
    this.operationTypes = operationTypes;
  }

  public AuditLogSpec userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Optional: The user name associated with the operation.
   * @return userName
   **/
  @Schema(description = "Optional: The user name associated with the operation.")
  
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogSpec auditLogSpec = (AuditLogSpec) o;
    return Objects.equals(this.operationTypes, auditLogSpec.operationTypes) &&
        Objects.equals(this.userName, auditLogSpec.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationTypes, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogSpec {\n");
    
    sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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