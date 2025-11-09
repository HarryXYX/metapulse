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
 * Information about a DataHub Access Token
 */
@Schema(description = "Information about a DataHub Access Token")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubAccessTokenInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubAccessTokenInfo") @Builder.Default
  private String __type = "DataHubAccessTokenInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubAccessTokenInfo"},
  defaultValue = "DataHubAccessTokenInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("actorUrn") @Builder.Default
  private String actorUrn = null;

  @JsonProperty("ownerUrn") @Builder.Default
  private String ownerUrn = null;

  @JsonProperty("createdAt") @Builder.Default
  private Long createdAt = null;

  @JsonProperty("expiresAt") @Builder.Default
  private Long expiresAt = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  public DataHubAccessTokenInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User defined name for the access token if defined.
   * @return name
   **/
  @Schema(required = true, description = "User defined name for the access token if defined.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataHubAccessTokenInfo actorUrn(String actorUrn) {
    this.actorUrn = actorUrn;
    return this;
  }

  /**
   * Urn of the actor to which this access token belongs to.
   * @return actorUrn
   **/
  @Schema(required = true, description = "Urn of the actor to which this access token belongs to.")
      @NotNull

    public String getActorUrn() {
    return actorUrn;
  }

  public void setActorUrn(String actorUrn) {
    this.actorUrn = actorUrn;
  }

  public DataHubAccessTokenInfo ownerUrn(String ownerUrn) {
    this.ownerUrn = ownerUrn;
    return this;
  }

  /**
   * Urn of the actor which created this access token.
   * @return ownerUrn
   **/
  @Schema(required = true, description = "Urn of the actor which created this access token.")
      @NotNull

    public String getOwnerUrn() {
    return ownerUrn;
  }

  public void setOwnerUrn(String ownerUrn) {
    this.ownerUrn = ownerUrn;
  }

  public DataHubAccessTokenInfo createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the token was created.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return createdAt
   **/
  @Schema(required = true, description = "When the token was created.")
      @NotNull

  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public DataHubAccessTokenInfo expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the token expires.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return expiresAt
   **/
  @Schema(description = "When the token expires.")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DataHubAccessTokenInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the token if defined.
   * @return description
   **/
  @Schema(description = "Description of the token if defined.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubAccessTokenInfo dataHubAccessTokenInfo = (DataHubAccessTokenInfo) o;
    return Objects.equals(this.name, dataHubAccessTokenInfo.name) &&
        Objects.equals(this.actorUrn, dataHubAccessTokenInfo.actorUrn) &&
        Objects.equals(this.ownerUrn, dataHubAccessTokenInfo.ownerUrn) &&
        Objects.equals(this.createdAt, dataHubAccessTokenInfo.createdAt) &&
        Objects.equals(this.expiresAt, dataHubAccessTokenInfo.expiresAt) &&
        Objects.equals(this.description, dataHubAccessTokenInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, actorUrn, ownerUrn, createdAt, expiresAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubAccessTokenInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actorUrn: ").append(toIndentedString(actorUrn)).append("\n");
    sb.append("    ownerUrn: ").append(toIndentedString(ownerUrn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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