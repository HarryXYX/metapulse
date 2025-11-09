package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
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
 * A common structure to represent all edges to entities when used inside aspects as collections This ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.
 */
@Schema(description = "A common structure to represent all edges to entities when used inside aspects as collections This ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Edge   {

  @JsonProperty("sourceUrn") @Builder.Default
  private String sourceUrn = null;

  @JsonProperty("destinationUrn") @Builder.Default
  private String destinationUrn = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("properties") @Builder.Default
  @Valid
  private Map<String, String> properties = null;

  public Edge sourceUrn(String sourceUrn) {
    this.sourceUrn = sourceUrn;
    return this;
  }

  /**
   * Urn of the source of this relationship edge. If not specified, assumed to be the entity that this aspect belongs to.
   * @return sourceUrn
   **/
  @Schema(description = "Urn of the source of this relationship edge. If not specified, assumed to be the entity that this aspect belongs to.")
  
    public String getSourceUrn() {
    return sourceUrn;
  }

  public void setSourceUrn(String sourceUrn) {
    this.sourceUrn = sourceUrn;
  }

  public Edge destinationUrn(String destinationUrn) {
    this.destinationUrn = destinationUrn;
    return this;
  }

  /**
   * Urn of the destination of this relationship edge.
   * @return destinationUrn
   **/
  @Schema(required = true, description = "Urn of the destination of this relationship edge.")
      @NotNull

    public String getDestinationUrn() {
    return destinationUrn;
  }

  public void setDestinationUrn(String destinationUrn) {
    this.destinationUrn = destinationUrn;
  }

  public Edge created(AuditStamp created) {
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

  public Edge lastModified(AuditStamp lastModified) {
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

  public Edge properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Edge putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * A generic properties bag that allows us to store specific information on this graph edge.
   * @return properties
   **/
  @Schema(description = "A generic properties bag that allows us to store specific information on this graph edge.")
  
    public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Edge edge = (Edge) o;
    return Objects.equals(this.sourceUrn, edge.sourceUrn) &&
        Objects.equals(this.destinationUrn, edge.destinationUrn) &&
        Objects.equals(this.created, edge.created) &&
        Objects.equals(this.lastModified, edge.lastModified) &&
        Objects.equals(this.properties, edge.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceUrn, destinationUrn, created, lastModified, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
    
    sb.append("    sourceUrn: ").append(toIndentedString(sourceUrn)).append("\n");
    sb.append("    destinationUrn: ").append(toIndentedString(destinationUrn)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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