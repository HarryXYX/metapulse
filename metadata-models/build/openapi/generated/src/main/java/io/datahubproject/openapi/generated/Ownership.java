package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.Owner;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Ownership information of an entity.
 */
@Schema(description = "Ownership information of an entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ownership  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDataProcessSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryNodeSnapshotAspectsItems, OneOfGlossaryTermSnapshotAspectsItems, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelDeploymentSnapshotAspectsItems, OneOfMLModelGroupSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems, OneOfTagSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Ownership") @Builder.Default
  private String __type = "Ownership";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Ownership"},
  defaultValue = "Ownership")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("owners") @Builder.Default
  @Valid
  private List<Owner> owners = new ArrayList<>();

  @JsonProperty("ownerTypes") @Builder.Default
  @Valid
  private Map<String, List<String>> ownerTypes = new HashMap<>();

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public Ownership owners(List<Owner> owners) {
    this.owners = owners;
    return this;
  }

  public Ownership addOwnersItem(Owner ownersItem) {
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

  public Ownership ownerTypes(Map<String, List<String>> ownerTypes) {
    this.ownerTypes = ownerTypes;
    return this;
  }

  public Ownership putOwnerTypesItem(String key, List<String> ownerTypesItem) {
    this.ownerTypes.put(key, ownerTypesItem);
    return this;
  }

  /**
   * Ownership type to Owners map, populated via mutation hook.
   * @return ownerTypes
   **/
  @Schema(required = true, description = "Ownership type to Owners map, populated via mutation hook.")
      @NotNull
    @Valid
    public Map<String, List<String>> getOwnerTypes() {
    return ownerTypes;
  }

  public void setOwnerTypes(Map<String, List<String>> ownerTypes) {
    this.ownerTypes = ownerTypes;
  }

  public Ownership lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ownership ownership = (Ownership) o;
    return Objects.equals(this.owners, ownership.owners) &&
        Objects.equals(this.ownerTypes, ownership.ownerTypes) &&
        Objects.equals(this.lastModified, ownership.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners, ownerTypes, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ownership {\n");
    
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    ownerTypes: ").append(toIndentedString(ownerTypes)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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