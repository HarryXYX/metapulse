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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Iceberg Catalog metadata associated with an Iceberg table/view
 */
@Schema(description = "Iceberg Catalog metadata associated with an Iceberg table/view")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IcebergCatalogInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IcebergCatalogInfo") @Builder.Default
  private String __type = "IcebergCatalogInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IcebergCatalogInfo"},
  defaultValue = "IcebergCatalogInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("metadataPointer") @Builder.Default
  private String metadataPointer = null;

  @JsonProperty("view") @Builder.Default
  private Boolean view = null;

  public IcebergCatalogInfo metadataPointer(String metadataPointer) {
    this.metadataPointer = metadataPointer;
    return this;
  }

  /**
   * When Datahub is the REST Catalog for an Iceberg Table, stores the current metadata pointer. If the Iceberg table is managed by an external catalog, the metadata pointer is not set.
   * @return metadataPointer
   **/
  @Schema(description = "When Datahub is the REST Catalog for an Iceberg Table, stores the current metadata pointer. If the Iceberg table is managed by an external catalog, the metadata pointer is not set.")
  
    public String getMetadataPointer() {
    return metadataPointer;
  }

  public void setMetadataPointer(String metadataPointer) {
    this.metadataPointer = metadataPointer;
  }

  public IcebergCatalogInfo view(Boolean view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
   **/
  @Schema(description = "")
  
    public Boolean isView() {
    return view;
  }

  public void setView(Boolean view) {
    this.view = view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcebergCatalogInfo icebergCatalogInfo = (IcebergCatalogInfo) o;
    return Objects.equals(this.metadataPointer, icebergCatalogInfo.metadataPointer) &&
        Objects.equals(this.view, icebergCatalogInfo.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataPointer, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcebergCatalogInfo {\n");
    
    sb.append("    metadataPointer: ").append(toIndentedString(metadataPointer)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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