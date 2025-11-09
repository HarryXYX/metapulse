package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.DataHubSearchConfig;
import io.datahubproject.openapi.generated.PropertyCardinality;
import io.datahubproject.openapi.generated.PropertyValue;
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
 * PropertyDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyDefinition  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "PropertyDefinition") @Builder.Default
  private String __type = "PropertyDefinition";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"PropertyDefinition"},
  defaultValue = "PropertyDefinition")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("qualifiedName") @Builder.Default
  private String qualifiedName = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("valueType") @Builder.Default
  private String valueType = null;

  @JsonProperty("typeQualifier") @Builder.Default
  @Valid
  private Map<String, List<String>> typeQualifier = null;

  @JsonProperty("allowedValues") @Builder.Default
  @Valid
  private List<PropertyValue> allowedValues = null;

  @JsonProperty("cardinality") @Builder.Default
  private PropertyCardinality cardinality = null;

  @JsonProperty("entityTypes") @Builder.Default
  @Valid
  private List<String> entityTypes = new ArrayList<>();

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("searchConfiguration") @Builder.Default
  private DataHubSearchConfig searchConfiguration = null;

  @JsonProperty("immutable") @Builder.Default
  private Boolean immutable = false;

  @JsonProperty("version") @Builder.Default
  private String version = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  public PropertyDefinition qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
  }

  /**
   * The fully qualified name of the property. e.g. io.acryl.datahub.myProperty
   * @return qualifiedName
   **/
  @Schema(required = true, description = "The fully qualified name of the property. e.g. io.acryl.datahub.myProperty")
      @NotNull

    public String getQualifiedName() {
    return qualifiedName;
  }

  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }

  public PropertyDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the property. This is the name that will be shown in the UI and can be used to look up the property id.
   * @return displayName
   **/
  @Schema(description = "The display name of the property. This is the name that will be shown in the UI and can be used to look up the property id.")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PropertyDefinition valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * The value type of the property. Must be a dataType. e.g. To indicate that the property is of type DATE, use urn:li:dataType:datahub.date
   * @return valueType
   **/
  @Schema(required = true, description = "The value type of the property. Must be a dataType. e.g. To indicate that the property is of type DATE, use urn:li:dataType:datahub.date")
      @NotNull

    public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public PropertyDefinition typeQualifier(Map<String, List<String>> typeQualifier) {
    this.typeQualifier = typeQualifier;
    return this;
  }

  public PropertyDefinition putTypeQualifierItem(String key, List<String> typeQualifierItem) {
    if (this.typeQualifier == null) {
      this.typeQualifier = new HashMap<>();
    }
    this.typeQualifier.put(key, typeQualifierItem);
    return this;
  }

  /**
   * A map that allows for type specialization of the valueType. e.g. a valueType of urn:li:dataType:datahub.urn can be specialized to be a USER or GROUP URN by adding a typeQualifier like  { \"allowedTypes\": [\"urn:li:entityType:datahub.corpuser\", \"urn:li:entityType:datahub.corpGroup\"] }
   * @return typeQualifier
   **/
  @Schema(description = "A map that allows for type specialization of the valueType. e.g. a valueType of urn:li:dataType:datahub.urn can be specialized to be a USER or GROUP URN by adding a typeQualifier like  { \"allowedTypes\": [\"urn:li:entityType:datahub.corpuser\", \"urn:li:entityType:datahub.corpGroup\"] }")
      @Valid
    public Map<String, List<String>> getTypeQualifier() {
    return typeQualifier;
  }

  public void setTypeQualifier(Map<String, List<String>> typeQualifier) {
    this.typeQualifier = typeQualifier;
  }

  public PropertyDefinition allowedValues(List<PropertyValue> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public PropertyDefinition addAllowedValuesItem(PropertyValue allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * A list of allowed values that the property is allowed to take.  If this is not specified, then the property can take any value of given type.
   * @return allowedValues
   **/
  @Schema(description = "A list of allowed values that the property is allowed to take.  If this is not specified, then the property can take any value of given type.")
      @Valid
    public List<PropertyValue> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<PropertyValue> allowedValues) {
    this.allowedValues = allowedValues;
  }

  public PropertyDefinition cardinality(PropertyCardinality cardinality) {
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
    public PropertyCardinality getCardinality() {
    return cardinality;
  }

  public void setCardinality(PropertyCardinality cardinality) {
    this.cardinality = cardinality;
  }

  public PropertyDefinition entityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public PropertyDefinition addEntityTypesItem(String entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

  /**
   * Get entityTypes
   * @return entityTypes
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getEntityTypes() {
    return entityTypes;
  }

  public void setEntityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public PropertyDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the property. This is the description that will be shown in the UI.
   * @return description
   **/
  @Schema(description = "The description of the property. This is the description that will be shown in the UI.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyDefinition searchConfiguration(DataHubSearchConfig searchConfiguration) {
    this.searchConfiguration = searchConfiguration;
    return this;
  }

  /**
   * Get searchConfiguration
   * @return searchConfiguration
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubSearchConfig getSearchConfiguration() {
    return searchConfiguration;
  }

  public void setSearchConfiguration(DataHubSearchConfig searchConfiguration) {
    this.searchConfiguration = searchConfiguration;
  }

  public PropertyDefinition immutable(Boolean immutable) {
    this.immutable = immutable;
    return this;
  }

  /**
   * Whether the structured property value is immutable once applied to an entity.
   * @return immutable
   **/
  @Schema(required = true, description = "Whether the structured property value is immutable once applied to an entity.")
      @NotNull

    public Boolean isImmutable() {
    return immutable;
  }

  public void setImmutable(Boolean immutable) {
    this.immutable = immutable;
  }

  public PropertyDefinition version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Definition version - Allows breaking schema changes. String is compared case-insensitive and new                      versions must be monotonically increasing. Cannot use periods/dots.                      Suggestions: v1, v2                                   20240610, 20240611
   * @return version
   **/
  @Schema(description = "Definition version - Allows breaking schema changes. String is compared case-insensitive and new                      versions must be monotonically increasing. Cannot use periods/dots.                      Suggestions: v1, v2                                   20240610, 20240611")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PropertyDefinition created(AuditStamp created) {
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

  public PropertyDefinition lastModified(AuditStamp lastModified) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyDefinition propertyDefinition = (PropertyDefinition) o;
    return Objects.equals(this.qualifiedName, propertyDefinition.qualifiedName) &&
        Objects.equals(this.displayName, propertyDefinition.displayName) &&
        Objects.equals(this.valueType, propertyDefinition.valueType) &&
        Objects.equals(this.typeQualifier, propertyDefinition.typeQualifier) &&
        Objects.equals(this.allowedValues, propertyDefinition.allowedValues) &&
        Objects.equals(this.cardinality, propertyDefinition.cardinality) &&
        Objects.equals(this.entityTypes, propertyDefinition.entityTypes) &&
        Objects.equals(this.description, propertyDefinition.description) &&
        Objects.equals(this.searchConfiguration, propertyDefinition.searchConfiguration) &&
        Objects.equals(this.immutable, propertyDefinition.immutable) &&
        Objects.equals(this.version, propertyDefinition.version) &&
        Objects.equals(this.created, propertyDefinition.created) &&
        Objects.equals(this.lastModified, propertyDefinition.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifiedName, displayName, valueType, typeQualifier, allowedValues, cardinality, entityTypes, description, searchConfiguration, immutable, version, created, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinition {\n");
    
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    typeQualifier: ").append(toIndentedString(typeQualifier)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searchConfiguration: ").append(toIndentedString(searchConfiguration)).append("\n");
    sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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