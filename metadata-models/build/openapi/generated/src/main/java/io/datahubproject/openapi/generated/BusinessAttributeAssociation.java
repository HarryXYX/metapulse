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
 * BusinessAttributeAssociation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAttributeAssociation   {

  @JsonProperty("businessAttributeUrn") @Builder.Default
  private String businessAttributeUrn = null;

  public BusinessAttributeAssociation businessAttributeUrn(String businessAttributeUrn) {
    this.businessAttributeUrn = businessAttributeUrn;
    return this;
  }

  /**
   * Urn of the applied businessAttribute
   * @return businessAttributeUrn
   **/
  @Schema(required = true, description = "Urn of the applied businessAttribute")
      @NotNull

    public String getBusinessAttributeUrn() {
    return businessAttributeUrn;
  }

  public void setBusinessAttributeUrn(String businessAttributeUrn) {
    this.businessAttributeUrn = businessAttributeUrn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributeAssociation businessAttributeAssociation = (BusinessAttributeAssociation) o;
    return Objects.equals(this.businessAttributeUrn, businessAttributeAssociation.businessAttributeUrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessAttributeUrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributeAssociation {\n");
    
    sb.append("    businessAttributeUrn: ").append(toIndentedString(businessAttributeUrn)).append("\n");
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