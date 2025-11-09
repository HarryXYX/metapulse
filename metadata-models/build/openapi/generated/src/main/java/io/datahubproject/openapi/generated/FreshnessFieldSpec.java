package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FreshnessFieldKind;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Lightweight spec used for referencing a particular schema field that is used to compute a freshness signal or operation. TODO: Since this is now leveraged across assertions &amp; metrics / operations, we should consider moving this to a common package.
 */
@Schema(description = "Lightweight spec used for referencing a particular schema field that is used to compute a freshness signal or operation. TODO: Since this is now leveraged across assertions & metrics / operations, we should consider moving this to a common package.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreshnessFieldSpec   {

  @JsonProperty("path") @Builder.Default
  private String path = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("nativeType") @Builder.Default
  private String nativeType = null;

  @JsonProperty("kind") @Builder.Default
  private FreshnessFieldKind kind = null;

  public FreshnessFieldSpec path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The field path
   * @return path
   **/
  @Schema(required = true, description = "The field path")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FreshnessFieldSpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The DataHub standard schema field type.
   * @return type
   **/
  @Schema(required = true, description = "The DataHub standard schema field type.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FreshnessFieldSpec nativeType(String nativeType) {
    this.nativeType = nativeType;
    return this;
  }

  /**
   * The native field type
   * @return nativeType
   **/
  @Schema(required = true, description = "The native field type")
      @NotNull

    public String getNativeType() {
    return nativeType;
  }

  public void setNativeType(String nativeType) {
    this.nativeType = nativeType;
  }

  public FreshnessFieldSpec kind(FreshnessFieldKind kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   **/
  @Schema(description = "")
  
    @Valid
    public FreshnessFieldKind getKind() {
    return kind;
  }

  public void setKind(FreshnessFieldKind kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshnessFieldSpec freshnessFieldSpec = (FreshnessFieldSpec) o;
    return Objects.equals(this.path, freshnessFieldSpec.path) &&
        Objects.equals(this.type, freshnessFieldSpec.type) &&
        Objects.equals(this.nativeType, freshnessFieldSpec.nativeType) &&
        Objects.equals(this.kind, freshnessFieldSpec.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type, nativeType, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshnessFieldSpec {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nativeType: ").append(toIndentedString(nativeType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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