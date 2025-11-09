package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * Information about a ExternalRoleProperties
 */
@Schema(description = "Information about a ExternalRoleProperties")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "RoleProperties") @Builder.Default
  private String __type = "RoleProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"RoleProperties"},
  defaultValue = "RoleProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private String type = null;

  @JsonProperty("requestUrl") @Builder.Default
  private String requestUrl = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  public RoleProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the IAM Role in the external system
   * @return name
   **/
  @Schema(required = true, description = "Display name of the IAM Role in the external system")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the IAM Role
   * @return description
   **/
  @Schema(description = "Description of the IAM Role")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RoleProperties type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Can be READ, ADMIN, WRITE
   * @return type
   **/
  @Schema(required = true, description = "Can be READ, ADMIN, WRITE")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RoleProperties requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * Link to access external access management
   * @return requestUrl
   **/
  @Schema(description = "Link to access external access management")
  
    public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  public RoleProperties created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleProperties roleProperties = (RoleProperties) o;
    return Objects.equals(this.name, roleProperties.name) &&
        Objects.equals(this.description, roleProperties.description) &&
        Objects.equals(this.type, roleProperties.type) &&
        Objects.equals(this.requestUrl, roleProperties.requestUrl) &&
        Objects.equals(this.created, roleProperties.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, requestUrl, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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