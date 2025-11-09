package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.SerializedValue;
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
 * Platform Resource Info. These entities are for miscelaneous data that is used in non-core parts of the system. For instance, if we want to persist &amp; retrieve data from auxiliary integrations such as Slack or Microsoft Teams.
 */
@Schema(description = "Platform Resource Info. These entities are for miscelaneous data that is used in non-core parts of the system. For instance, if we want to persist & retrieve data from auxiliary integrations such as Slack or Microsoft Teams.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformResourceInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "PlatformResourceInfo") @Builder.Default
  private String __type = "PlatformResourceInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"PlatformResourceInfo"},
  defaultValue = "PlatformResourceInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("resourceType") @Builder.Default
  private String resourceType = null;

  @JsonProperty("primaryKey") @Builder.Default
  private String primaryKey = null;

  @JsonProperty("secondaryKeys") @Builder.Default
  @Valid
  private List<String> secondaryKeys = null;

  @JsonProperty("value") @Builder.Default
  private SerializedValue value = null;

  public PlatformResourceInfo resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of the resource.  Intended as a loose specifier of the generic type of the resource. Producer is not forced to conform to a specific set of symbols for resource types. The @PlatformResourceType enumeration offers a paved path for agreed upon common terms, but is not required to be followed. Example values could be: conversation, user, grant, etc. Resource types are indexed for ease of access.  e.g. Get me all platform resources of type user for the platform looker
   * @return resourceType
   **/
  @Schema(required = true, description = "The type of the resource.  Intended as a loose specifier of the generic type of the resource. Producer is not forced to conform to a specific set of symbols for resource types. The @PlatformResourceType enumeration offers a paved path for agreed upon common terms, but is not required to be followed. Example values could be: conversation, user, grant, etc. Resource types are indexed for ease of access.  e.g. Get me all platform resources of type user for the platform looker")
      @NotNull

    public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public PlatformResourceInfo primaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  /**
   * The primary key for this platform resource. e.g. for a slack member this would be the memberID. primary keys specified here don't need to include any additional specificity for the      dataPlatform The @PlatformResourceKey is supposed to represent that
   * @return primaryKey
   **/
  @Schema(required = true, description = "The primary key for this platform resource. e.g. for a slack member this would be the memberID. primary keys specified here don't need to include any additional specificity for the      dataPlatform The @PlatformResourceKey is supposed to represent that")
      @NotNull

    public String getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
  }

  public PlatformResourceInfo secondaryKeys(List<String> secondaryKeys) {
    this.secondaryKeys = secondaryKeys;
    return this;
  }

  public PlatformResourceInfo addSecondaryKeysItem(String secondaryKeysItem) {
    if (this.secondaryKeys == null) {
      this.secondaryKeys = new ArrayList<>();
    }
    this.secondaryKeys.add(secondaryKeysItem);
    return this;
  }

  /**
   * The secondary keys this platform resource can be located by. I.e., for a slack member this would be email or phone.
   * @return secondaryKeys
   **/
  @Schema(description = "The secondary keys this platform resource can be located by. I.e., for a slack member this would be email or phone.")
  
    public List<String> getSecondaryKeys() {
    return secondaryKeys;
  }

  public void setSecondaryKeys(List<String> secondaryKeys) {
    this.secondaryKeys = secondaryKeys;
  }

  public PlatformResourceInfo value(SerializedValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public SerializedValue getValue() {
    return value;
  }

  public void setValue(SerializedValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformResourceInfo platformResourceInfo = (PlatformResourceInfo) o;
    return Objects.equals(this.resourceType, platformResourceInfo.resourceType) &&
        Objects.equals(this.primaryKey, platformResourceInfo.primaryKey) &&
        Objects.equals(this.secondaryKeys, platformResourceInfo.secondaryKeys) &&
        Objects.equals(this.value, platformResourceInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, primaryKey, secondaryKeys, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResourceInfo {\n");
    
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    secondaryKeys: ").append(toIndentedString(secondaryKeys)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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