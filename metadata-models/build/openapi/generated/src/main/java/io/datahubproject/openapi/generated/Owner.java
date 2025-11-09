package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.MetadataAttribution;
import io.datahubproject.openapi.generated.OwnershipSource;
import io.datahubproject.openapi.generated.OwnershipType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Ownership information
 */
@Schema(description = "Ownership information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Owner   {

  @JsonProperty("owner") @Builder.Default
  private String owner = null;

  @JsonProperty("type") @Builder.Default
  private OwnershipType type = null;

  @JsonProperty("typeUrn") @Builder.Default
  private String typeUrn = null;

  @JsonProperty("source") @Builder.Default
  private OwnershipSource source = null;

  @JsonProperty("attribution") @Builder.Default
  private MetadataAttribution attribution = null;

  public Owner owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name (Caveat: only corpuser is currently supported in the frontend.)
   * @return owner
   **/
  @Schema(required = true, description = "Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name (Caveat: only corpuser is currently supported in the frontend.)")
      @NotNull

    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Owner type(OwnershipType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OwnershipType getType() {
    return type;
  }

  public void setType(OwnershipType type) {
    this.type = type;
  }

  public Owner typeUrn(String typeUrn) {
    this.typeUrn = typeUrn;
    return this;
  }

  /**
   * The type of the ownership Urn of type O
   * @return typeUrn
   **/
  @Schema(description = "The type of the ownership Urn of type O")
  
    public String getTypeUrn() {
    return typeUrn;
  }

  public void setTypeUrn(String typeUrn) {
    this.typeUrn = typeUrn;
  }

  public Owner source(OwnershipSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public OwnershipSource getSource() {
    return source;
  }

  public void setSource(OwnershipSource source) {
    this.source = source;
  }

  public Owner attribution(MetadataAttribution attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Get attribution
   * @return attribution
   **/
  @Schema(description = "")
  
    @Valid
    public MetadataAttribution getAttribution() {
    return attribution;
  }

  public void setAttribution(MetadataAttribution attribution) {
    this.attribution = attribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(this.owner, owner.owner) &&
        Objects.equals(this.type, owner.type) &&
        Objects.equals(this.typeUrn, owner.typeUrn) &&
        Objects.equals(this.source, owner.source) &&
        Objects.equals(this.attribution, owner.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, type, typeUrn, source, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owner {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeUrn: ").append(toIndentedString(typeUrn)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
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