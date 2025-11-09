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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Siblings information of an entity.
 */
@Schema(description = "Siblings information of an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Siblings  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Siblings") @Builder.Default
  private String __type = "Siblings";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Siblings"},
  defaultValue = "Siblings")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("siblings") @Builder.Default
  @Valid
  private List<String> siblings = new ArrayList<>();

  @JsonProperty("primary") @Builder.Default
  private Boolean primary = null;

  public Siblings siblings(List<String> siblings) {
    this.siblings = siblings;
    return this;
  }

  public Siblings addSiblingsItem(String siblingsItem) {
    this.siblings.add(siblingsItem);
    return this;
  }

  /**
   * List of sibling entities
   * @return siblings
   **/
  @Schema(required = true, description = "List of sibling entities")
      @NotNull

    public List<String> getSiblings() {
    return siblings;
  }

  public void setSiblings(List<String> siblings) {
    this.siblings = siblings;
  }

  public Siblings primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * If this is the leader entity of the set of siblings
   * @return primary
   **/
  @Schema(required = true, description = "If this is the leader entity of the set of siblings")
      @NotNull

    public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Siblings siblings = (Siblings) o;
    return Objects.equals(this.siblings, siblings.siblings) &&
        Objects.equals(this.primary, siblings.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siblings, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Siblings {\n");
    
    sb.append("    siblings: ").append(toIndentedString(siblings)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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