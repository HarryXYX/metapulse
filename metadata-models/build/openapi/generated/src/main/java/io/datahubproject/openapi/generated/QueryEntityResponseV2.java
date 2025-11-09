package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectResponseV2;
import io.datahubproject.openapi.generated.QueryKeyAspectResponseV2;
import io.datahubproject.openapi.generated.QueryPropertiesAspectResponseV2;
import io.datahubproject.openapi.generated.QuerySubjectsAspectResponseV2;
import io.datahubproject.openapi.generated.QueryUsageStatisticsAspectResponseV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;
import io.datahubproject.openapi.generated.SubTypesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Query object.
 */
@Schema(description = "Query object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("queryKey") @Builder.Default
  private QueryKeyAspectResponseV2 queryKey = null;

  @JsonProperty("queryProperties") @Builder.Default
  private QueryPropertiesAspectResponseV2 queryProperties = null;

  @JsonProperty("querySubjects") @Builder.Default
  private QuerySubjectsAspectResponseV2 querySubjects = null;

  @JsonProperty("queryUsageStatistics") @Builder.Default
  private QueryUsageStatisticsAspectResponseV2 queryUsageStatistics = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectResponseV2 status = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectResponseV2 dataPlatformInstance = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectResponseV2 subTypes = null;

  public QueryEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for query
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for query")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public QueryEntityResponseV2 queryKey(QueryKeyAspectResponseV2 queryKey) {
    this.queryKey = queryKey;
    return this;
  }

  /**
   * Get queryKey
   * @return queryKey
   **/
  @Schema(description = "")
  
    @Valid
    public QueryKeyAspectResponseV2 getQueryKey() {
    return queryKey;
  }

  public void setQueryKey(QueryKeyAspectResponseV2 queryKey) {
    this.queryKey = queryKey;
  }

  public QueryEntityResponseV2 queryProperties(QueryPropertiesAspectResponseV2 queryProperties) {
    this.queryProperties = queryProperties;
    return this;
  }

  /**
   * Get queryProperties
   * @return queryProperties
   **/
  @Schema(description = "")
  
    @Valid
    public QueryPropertiesAspectResponseV2 getQueryProperties() {
    return queryProperties;
  }

  public void setQueryProperties(QueryPropertiesAspectResponseV2 queryProperties) {
    this.queryProperties = queryProperties;
  }

  public QueryEntityResponseV2 querySubjects(QuerySubjectsAspectResponseV2 querySubjects) {
    this.querySubjects = querySubjects;
    return this;
  }

  /**
   * Get querySubjects
   * @return querySubjects
   **/
  @Schema(description = "")
  
    @Valid
    public QuerySubjectsAspectResponseV2 getQuerySubjects() {
    return querySubjects;
  }

  public void setQuerySubjects(QuerySubjectsAspectResponseV2 querySubjects) {
    this.querySubjects = querySubjects;
  }

  public QueryEntityResponseV2 queryUsageStatistics(QueryUsageStatisticsAspectResponseV2 queryUsageStatistics) {
    this.queryUsageStatistics = queryUsageStatistics;
    return this;
  }

  /**
   * Get queryUsageStatistics
   * @return queryUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public QueryUsageStatisticsAspectResponseV2 getQueryUsageStatistics() {
    return queryUsageStatistics;
  }

  public void setQueryUsageStatistics(QueryUsageStatisticsAspectResponseV2 queryUsageStatistics) {
    this.queryUsageStatistics = queryUsageStatistics;
  }

  public QueryEntityResponseV2 status(StatusAspectResponseV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectResponseV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectResponseV2 status) {
    this.status = status;
  }

  public QueryEntityResponseV2 dataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectResponseV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectResponseV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public QueryEntityResponseV2 subTypes(SubTypesAspectResponseV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectResponseV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectResponseV2 subTypes) {
    this.subTypes = subTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEntityResponseV2 queryEntityResponseV2 = (QueryEntityResponseV2) o;
    return Objects.equals(this.urn, queryEntityResponseV2.urn) &&
        Objects.equals(this.queryKey, queryEntityResponseV2.queryKey) &&
        Objects.equals(this.queryProperties, queryEntityResponseV2.queryProperties) &&
        Objects.equals(this.querySubjects, queryEntityResponseV2.querySubjects) &&
        Objects.equals(this.queryUsageStatistics, queryEntityResponseV2.queryUsageStatistics) &&
        Objects.equals(this.status, queryEntityResponseV2.status) &&
        Objects.equals(this.dataPlatformInstance, queryEntityResponseV2.dataPlatformInstance) &&
        Objects.equals(this.subTypes, queryEntityResponseV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, queryKey, queryProperties, querySubjects, queryUsageStatistics, status, dataPlatformInstance, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    queryKey: ").append(toIndentedString(queryKey)).append("\n");
    sb.append("    queryProperties: ").append(toIndentedString(queryProperties)).append("\n");
    sb.append("    querySubjects: ").append(toIndentedString(querySubjects)).append("\n");
    sb.append("    queryUsageStatistics: ").append(toIndentedString(queryUsageStatistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataPlatformInstance: ").append(toIndentedString(dataPlatformInstance)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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