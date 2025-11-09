package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.QuerySource;
import io.datahubproject.openapi.generated.QueryStatement;
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
 * Information about a Query against one or more data assets (e.g. Tables or Views).
 */
@Schema(description = "Information about a Query against one or more data assets (e.g. Tables or Views).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "QueryProperties") @Builder.Default
  private String __type = "QueryProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"QueryProperties"},
  defaultValue = "QueryProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("statement") @Builder.Default
  private QueryStatement statement = null;

  @JsonProperty("source") @Builder.Default
  private QuerySource source = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("created") @Builder.Default
  private AuditStamp created = null;

  @JsonProperty("lastModified") @Builder.Default
  private AuditStamp lastModified = null;

  @JsonProperty("origin") @Builder.Default
  private String origin = null;

  public QueryProperties customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public QueryProperties putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public QueryProperties statement(QueryStatement statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Get statement
   * @return statement
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public QueryStatement getStatement() {
    return statement;
  }

  public void setStatement(QueryStatement statement) {
    this.statement = statement;
  }

  public QueryProperties source(QuerySource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public QuerySource getSource() {
    return source;
  }

  public void setSource(QuerySource source) {
    this.source = source;
  }

  public QueryProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional display name to identify the query.
   * @return name
   **/
  @Schema(description = "Optional display name to identify the query.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The Query description.
   * @return description
   **/
  @Schema(description = "The Query description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QueryProperties created(AuditStamp created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getCreated() {
    return created;
  }

  public void setCreated(AuditStamp created) {
    this.created = created;
  }

  public QueryProperties lastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getLastModified() {
    return lastModified;
  }

  public void setLastModified(AuditStamp lastModified) {
    this.lastModified = lastModified;
  }

  public QueryProperties origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * The origin of the Query. This is the source of the Query (e.g. a View, Stored Procedure, dbt Model, etc.) that the Query was created from.
   * @return origin
   **/
  @Schema(description = "The origin of the Query. This is the source of the Query (e.g. a View, Stored Procedure, dbt Model, etc.) that the Query was created from.")
  
    public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProperties queryProperties = (QueryProperties) o;
    return Objects.equals(this.customProperties, queryProperties.customProperties) &&
        Objects.equals(this.statement, queryProperties.statement) &&
        Objects.equals(this.source, queryProperties.source) &&
        Objects.equals(this.name, queryProperties.name) &&
        Objects.equals(this.description, queryProperties.description) &&
        Objects.equals(this.created, queryProperties.created) &&
        Objects.equals(this.lastModified, queryProperties.lastModified) &&
        Objects.equals(this.origin, queryProperties.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, statement, source, name, description, created, lastModified, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryProperties {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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