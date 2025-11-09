package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Properties associated with a GlossaryNode
 */
@Schema(description = "Properties associated with a GlossaryNode")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryNodeInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfGlossaryNodeSnapshotAspectsItems, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlossaryNodeInfo") @Builder.Default
  private String __type = "GlossaryNodeInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlossaryNodeInfo"},
  defaultValue = "GlossaryNodeInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("definition") @Builder.Default
  private String definition = null;

  @JsonProperty("parentNode") @Builder.Default
  private String parentNode = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("id") @Builder.Default
  private String id = null;

  public GlossaryNodeInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public GlossaryNodeInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public GlossaryNodeInfo definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Definition of business node
   * @return definition
   **/
  @Schema(required = true, description = "Definition of business node")
      @NotNull

    public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public GlossaryNodeInfo parentNode(String parentNode) {
    this.parentNode = parentNode;
    return this;
  }

  /**
   * Parent node of the glossary term
   * @return parentNode
   **/
  @Schema(description = "Parent node of the glossary term")
  
    public String getParentNode() {
    return parentNode;
  }

  public void setParentNode(String parentNode) {
    this.parentNode = parentNode;
  }

  public GlossaryNodeInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the node
   * @return name
   **/
  @Schema(description = "Display name of the node")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlossaryNodeInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional id for the GlossaryNode
   * @return id
   **/
  @Schema(description = "Optional id for the GlossaryNode")
  
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
    GlossaryNodeInfo glossaryNodeInfo = (GlossaryNodeInfo) o;
    return Objects.equals(this.customProperties, glossaryNodeInfo.customProperties) &&
        Objects.equals(this.definition, glossaryNodeInfo.definition) &&
        Objects.equals(this.parentNode, glossaryNodeInfo.parentNode) &&
        Objects.equals(this.name, glossaryNodeInfo.name) &&
        Objects.equals(this.id, glossaryNodeInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, definition, parentNode, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryNodeInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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