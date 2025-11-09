package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.InstitutionalMemoryMetadata;
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
 * Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.
 */
@Schema(description = "Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstitutionalMemory  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLFeatureSnapshotAspectsItems, OneOfMLFeatureTableSnapshotAspectsItems, OneOfMLModelSnapshotAspectsItems, OneOfMLPrimaryKeySnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "InstitutionalMemory") @Builder.Default
  private String __type = "InstitutionalMemory";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"InstitutionalMemory"},
  defaultValue = "InstitutionalMemory")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("elements") @Builder.Default
  @Valid
  private List<InstitutionalMemoryMetadata> elements = new ArrayList<>();

  public InstitutionalMemory elements(List<InstitutionalMemoryMetadata> elements) {
    this.elements = elements;
    return this;
  }

  public InstitutionalMemory addElementsItem(InstitutionalMemoryMetadata elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
   * @return elements
   **/
  @Schema(required = true, description = "List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.")
      @NotNull
    @Valid
    public List<InstitutionalMemoryMetadata> getElements() {
    return elements;
  }

  public void setElements(List<InstitutionalMemoryMetadata> elements) {
    this.elements = elements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalMemory institutionalMemory = (InstitutionalMemory) o;
    return Objects.equals(this.elements, institutionalMemory.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalMemory {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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