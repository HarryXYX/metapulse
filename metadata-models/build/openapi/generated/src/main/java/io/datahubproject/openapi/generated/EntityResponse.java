package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.EnvelopedAspect;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A DataHub &#x27;entity&#x27;, which is comprised of a set of latest aspects present for the aspect.
 */
@Schema(description = "A DataHub 'entity', which is comprised of a set of latest aspects present for the aspect.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityResponse   {

  @JsonProperty("entityName") @Builder.Default
  private String entityName = null;

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("aspects") @Builder.Default
  @Valid
  private Map<String, EnvelopedAspect> aspects = new HashMap<>();

  public EntityResponse entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * The entity name
   * @return entityName
   **/
  @Schema(required = true, description = "The entity name")
      @NotNull

    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityResponse urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * The entity urn
   * @return urn
   **/
  @Schema(required = true, description = "The entity urn")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public EntityResponse aspects(Map<String, EnvelopedAspect> aspects) {
    this.aspects = aspects;
    return this;
  }

  public EntityResponse putAspectsItem(String key, EnvelopedAspect aspectsItem) {
    this.aspects.put(key, aspectsItem);
    return this;
  }

  /**
   * A map of aspect name to aspect
   * @return aspects
   **/
  @Schema(required = true, description = "A map of aspect name to aspect")
      @NotNull
    @Valid
    public Map<String, EnvelopedAspect> getAspects() {
    return aspects;
  }

  public void setAspects(Map<String, EnvelopedAspect> aspects) {
    this.aspects = aspects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponse entityResponse = (EntityResponse) o;
    return Objects.equals(this.entityName, entityResponse.entityName) &&
        Objects.equals(this.urn, entityResponse.urn) &&
        Objects.equals(this.aspects, entityResponse.aspects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, urn, aspects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponse {\n");
    
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
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