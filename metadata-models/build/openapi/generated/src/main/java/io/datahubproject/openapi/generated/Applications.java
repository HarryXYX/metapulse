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
 * Links from an Asset to its Applications
 */
@Schema(description = "Links from an Asset to its Applications")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Applications  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "Applications") @Builder.Default
  private String __type = "Applications";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"Applications"},
  defaultValue = "Applications")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("applications") @Builder.Default
  @Valid
  private List<String> applications = new ArrayList<>();

  public Applications applications(List<String> applications) {
    this.applications = applications;
    return this;
  }

  public Applications addApplicationsItem(String applicationsItem) {
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * The Applications attached to an Asset
   * @return applications
   **/
  @Schema(required = true, description = "The Applications attached to an Asset")
      @NotNull

    public List<String> getApplications() {
    return applications;
  }

  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applications applications = (Applications) o;
    return Objects.equals(this.applications, applications.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applications {\n");
    
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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