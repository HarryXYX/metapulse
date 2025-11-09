package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.BusinessAttributeAssociation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * BusinessAttribute aspect used for applying it to an entity
 */
@Schema(description = "BusinessAttribute aspect used for applying it to an entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessAttributes  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "BusinessAttributes") @Builder.Default
  private String __type = "BusinessAttributes";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"BusinessAttributes"},
  defaultValue = "BusinessAttributes")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("businessAttribute") @Builder.Default
  private BusinessAttributeAssociation businessAttribute = null;

  public BusinessAttributes businessAttribute(BusinessAttributeAssociation businessAttribute) {
    this.businessAttribute = businessAttribute;
    return this;
  }

  /**
   * Get businessAttribute
   * @return businessAttribute
   **/
  @Schema(description = "")
  
    @Valid
    public BusinessAttributeAssociation getBusinessAttribute() {
    return businessAttribute;
  }

  public void setBusinessAttribute(BusinessAttributeAssociation businessAttribute) {
    this.businessAttribute = businessAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributes businessAttributes = (BusinessAttributes) o;
    return Objects.equals(this.businessAttribute, businessAttributes.businessAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributes {\n");
    
    sb.append("    businessAttribute: ").append(toIndentedString(businessAttribute)).append("\n");
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