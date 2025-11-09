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
 * Carries information about the native CorpGroups a user is in.
 */
@Schema(description = "Carries information about the native CorpGroups a user is in.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NativeGroupMembership  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "NativeGroupMembership") @Builder.Default
  private String __type = "NativeGroupMembership";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"NativeGroupMembership"},
  defaultValue = "NativeGroupMembership")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("nativeGroups") @Builder.Default
  @Valid
  private List<String> nativeGroups = new ArrayList<>();

  public NativeGroupMembership nativeGroups(List<String> nativeGroups) {
    this.nativeGroups = nativeGroups;
    return this;
  }

  public NativeGroupMembership addNativeGroupsItem(String nativeGroupsItem) {
    this.nativeGroups.add(nativeGroupsItem);
    return this;
  }

  /**
   * Get nativeGroups
   * @return nativeGroups
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getNativeGroups() {
    return nativeGroups;
  }

  public void setNativeGroups(List<String> nativeGroups) {
    this.nativeGroups = nativeGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeGroupMembership nativeGroupMembership = (NativeGroupMembership) o;
    return Objects.equals(this.nativeGroups, nativeGroupMembership.nativeGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeGroupMembership {\n");
    
    sb.append("    nativeGroups: ").append(toIndentedString(nativeGroups)).append("\n");
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