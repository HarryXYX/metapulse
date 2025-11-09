package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.ERModelRelationshipCardinality;
import io.datahubproject.openapi.generated.RelationshipFieldMapping;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Properties associated with a ERModelRelationship
 */
@Schema(description = "Properties associated with a ERModelRelationship")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ERModelRelationshipProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ERModelRelationshipProperties") @Builder.Default
  private String __type = "ERModelRelationshipProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ERModelRelationshipProperties"},
  defaultValue = "ERModelRelationshipProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("source") @Builder.Default
  private String source = null;

  @JsonProperty("destination") @Builder.Default
  private String destination = null;

  @JsonProperty("relationshipFieldMappings") @Builder.Default
  @Valid
  private List<RelationshipFieldMapping> relationshipFieldMappings = new ArrayList<>();

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("cardinality") @Builder.Default
  private ERModelRelationshipCardinality cardinality = null;

  public ERModelRelationshipProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public ERModelRelationshipProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public ERModelRelationshipProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ERModelRelation
   * @return name
   **/
  @Schema(required = true, description = "Name of the ERModelRelation")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ERModelRelationshipProperties source(String source) {
    this.source = source;
    return this;
  }

  /**
   * First dataset in the erModelRelationship (no directionality)
   * @return source
   **/
  @Schema(required = true, description = "First dataset in the erModelRelationship (no directionality)")
      @NotNull

    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ERModelRelationshipProperties destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Second dataset in the erModelRelationship (no directionality)
   * @return destination
   **/
  @Schema(required = true, description = "Second dataset in the erModelRelationship (no directionality)")
      @NotNull

    public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public ERModelRelationshipProperties relationshipFieldMappings(List<RelationshipFieldMapping> relationshipFieldMappings) {
    this.relationshipFieldMappings = relationshipFieldMappings;
    return this;
  }

  public ERModelRelationshipProperties addRelationshipFieldMappingsItem(RelationshipFieldMapping relationshipFieldMappingsItem) {
    this.relationshipFieldMappings.add(relationshipFieldMappingsItem);
    return this;
  }

  /**
   * ERModelRelationFieldMapping (in future we can make it an array)
   * @return relationshipFieldMappings
   **/
  @Schema(required = true, description = "ERModelRelationFieldMapping (in future we can make it an array)")
      @NotNull
    @Valid
    public List<RelationshipFieldMapping> getRelationshipFieldMappings() {
    return relationshipFieldMappings;
  }

  public void setRelationshipFieldMappings(List<RelationshipFieldMapping> relationshipFieldMappings) {
    this.relationshipFieldMappings = relationshipFieldMappings;
  }

  public ERModelRelationshipProperties created(AuditStamp created) {
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

  public ERModelRelationshipProperties lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(description = "")
  
    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public ERModelRelationshipProperties cardinality(ERModelRelationshipCardinality cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * Get cardinality
   * @return cardinality
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ERModelRelationshipCardinality getCardinality() {
    return cardinality;
  }

  public void setCardinality(ERModelRelationshipCardinality cardinality) {
    this.cardinality = cardinality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ERModelRelationshipProperties erModelRelationshipProperties = (ERModelRelationshipProperties) o;
    return Objects.equals(this.customProperties, erModelRelationshipProperties.customProperties) &&
        Objects.equals(this.name, erModelRelationshipProperties.name) &&
        Objects.equals(this.source, erModelRelationshipProperties.source) &&
        Objects.equals(this.destination, erModelRelationshipProperties.destination) &&
        Objects.equals(this.relationshipFieldMappings, erModelRelationshipProperties.relationshipFieldMappings) &&
        Objects.equals(this.created, erModelRelationshipProperties.created) &&
        Objects.equals(this.lastModified, erModelRelationshipProperties.lastModified) &&
        Objects.equals(this.cardinality, erModelRelationshipProperties.cardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, name, source, destination, relationshipFieldMappings, created, lastModified, cardinality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ERModelRelationshipProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    relationshipFieldMappings: ").append(toIndentedString(relationshipFieldMappings)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
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