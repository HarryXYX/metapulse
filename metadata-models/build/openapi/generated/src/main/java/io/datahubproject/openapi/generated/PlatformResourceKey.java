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
 * Key for a Platform Resource. Platform Resources are assets that are not part of the core data model. They are stored in DataHub primarily to help with application-specific use-cases that are not sufficiently generalized to move into the core data model. For instance, if we want to persist &amp; retrieve additional user profile data  from auxiliary integrations such as Slack or Microsoft Teams for resolving details later.
 */
@Schema(description = "Key for a Platform Resource. Platform Resources are assets that are not part of the core data model. They are stored in DataHub primarily to help with application-specific use-cases that are not sufficiently generalized to move into the core data model. For instance, if we want to persist & retrieve additional user profile data  from auxiliary integrations such as Slack or Microsoft Teams for resolving details later.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformResourceKey  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "PlatformResourceKey") @Builder.Default
  private String __type = "PlatformResourceKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"PlatformResourceKey"},
  defaultValue = "PlatformResourceKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("id") @Builder.Default
  private String id = null;

  public PlatformResourceKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique id for this entity. There are no constraints on the format of this id, but most implementations will choose to use a UUID. This id should be globally unique for the entire DataHub instance and      uniquely identify the resource that is being stored, so most      implementations will combine logical attributes like platform name, platform instance, platform-specific-id and the resource type to create the unique id. e.g. slack:slack-instance:slack-user-id:user-info  or guid(slack, slack-instance, slack-user-id, user-info) etc.
   * @return id
   **/
  @Schema(required = true, description = "A unique id for this entity. There are no constraints on the format of this id, but most implementations will choose to use a UUID. This id should be globally unique for the entire DataHub instance and      uniquely identify the resource that is being stored, so most      implementations will combine logical attributes like platform name, platform instance, platform-specific-id and the resource type to create the unique id. e.g. slack:slack-instance:slack-user-id:user-info  or guid(slack, slack-instance, slack-user-id, user-info) etc.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformResourceKey platformResourceKey = (PlatformResourceKey) o;
    return Objects.equals(this.id, platformResourceKey.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResourceKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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