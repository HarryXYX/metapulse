package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SourceCodeUrl;
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
 * Source Code
 */
@Schema(description = "Source Code")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceCode  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfMLModelSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "SourceCode") @Builder.Default
  private String __type = "SourceCode";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"SourceCode"},
  defaultValue = "SourceCode")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("sourceCode") @Builder.Default
  @Valid
  private List<SourceCodeUrl> sourceCode = new ArrayList<>();

  public SourceCode sourceCode(List<SourceCodeUrl> sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  public SourceCode addSourceCodeItem(SourceCodeUrl sourceCodeItem) {
    this.sourceCode.add(sourceCodeItem);
    return this;
  }

  /**
   * Source Code along with types
   * @return sourceCode
   **/
  @Schema(required = true, description = "Source Code along with types")
      @NotNull
    @Valid
    public List<SourceCodeUrl> getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(List<SourceCodeUrl> sourceCode) {
    this.sourceCode = sourceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceCode sourceCode = (SourceCode) o;
    return Objects.equals(this.sourceCode, sourceCode.sourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCode {\n");
    
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
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