package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Owner;
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
 * Ownership information of an entity, suggested by source system or other services.
 */
@Schema(description = "Ownership information of an entity, suggested by source system or other services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnershipSuggestion   {

  @JsonProperty("owners") @Builder.Default
  @Valid
  private List<Owner> owners = new ArrayList<>();

  public OwnershipSuggestion owners(List<Owner> owners) {
    this.owners = owners;
    return this;
  }

  public OwnershipSuggestion addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

  /**
   * List of owners of the entity.
   * @return owners
   **/
  @Schema(required = true, description = "List of owners of the entity.")
      @NotNull
    @Valid
    public List<Owner> getOwners() {
    return owners;
  }

  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipSuggestion ownershipSuggestion = (OwnershipSuggestion) o;
    return Objects.equals(this.owners, ownershipSuggestion.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipSuggestion {\n");
    
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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