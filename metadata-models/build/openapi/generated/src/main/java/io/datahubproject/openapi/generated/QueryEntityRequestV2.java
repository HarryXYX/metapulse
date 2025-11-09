package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataPlatformInstanceAspectRequestV2;
import io.datahubproject.openapi.generated.QueryKeyAspectRequestV2;
import io.datahubproject.openapi.generated.QueryPropertiesAspectRequestV2;
import io.datahubproject.openapi.generated.QuerySubjectsAspectRequestV2;
import io.datahubproject.openapi.generated.QueryUsageStatisticsAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.SubTypesAspectRequestV2;
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
public class QueryEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("queryKey") @Builder.Default
  private QueryKeyAspectRequestV2 queryKey = null;

  @JsonProperty("queryProperties") @Builder.Default
  private QueryPropertiesAspectRequestV2 queryProperties = null;

  @JsonProperty("querySubjects") @Builder.Default
  private QuerySubjectsAspectRequestV2 querySubjects = null;

  @JsonProperty("queryUsageStatistics") @Builder.Default
  private QueryUsageStatisticsAspectRequestV2 queryUsageStatistics = null;

  @JsonProperty("status") @Builder.Default
  private StatusAspectRequestV2 status = null;

  @JsonProperty("dataPlatformInstance") @Builder.Default
  private DataPlatformInstanceAspectRequestV2 dataPlatformInstance = null;

  @JsonProperty("subTypes") @Builder.Default
  private SubTypesAspectRequestV2 subTypes = null;

  public QueryEntityRequestV2 urn(String urn) {
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

  public QueryEntityRequestV2 queryKey(QueryKeyAspectRequestV2 queryKey) {
    this.queryKey = queryKey;
    return this;
  }

  /**
   * Get queryKey
   * @return queryKey
   **/
  @Schema(description = "")
  
    @Valid
    public QueryKeyAspectRequestV2 getQueryKey() {
    return queryKey;
  }

  public void setQueryKey(QueryKeyAspectRequestV2 queryKey) {
    this.queryKey = queryKey;
  }

  public QueryEntityRequestV2 queryProperties(QueryPropertiesAspectRequestV2 queryProperties) {
    this.queryProperties = queryProperties;
    return this;
  }

  /**
   * Get queryProperties
   * @return queryProperties
   **/
  @Schema(description = "")
  
    @Valid
    public QueryPropertiesAspectRequestV2 getQueryProperties() {
    return queryProperties;
  }

  public void setQueryProperties(QueryPropertiesAspectRequestV2 queryProperties) {
    this.queryProperties = queryProperties;
  }

  public QueryEntityRequestV2 querySubjects(QuerySubjectsAspectRequestV2 querySubjects) {
    this.querySubjects = querySubjects;
    return this;
  }

  /**
   * Get querySubjects
   * @return querySubjects
   **/
  @Schema(description = "")
  
    @Valid
    public QuerySubjectsAspectRequestV2 getQuerySubjects() {
    return querySubjects;
  }

  public void setQuerySubjects(QuerySubjectsAspectRequestV2 querySubjects) {
    this.querySubjects = querySubjects;
  }

  public QueryEntityRequestV2 queryUsageStatistics(QueryUsageStatisticsAspectRequestV2 queryUsageStatistics) {
    this.queryUsageStatistics = queryUsageStatistics;
    return this;
  }

  /**
   * Get queryUsageStatistics
   * @return queryUsageStatistics
   **/
  @Schema(description = "")
  
    @Valid
    public QueryUsageStatisticsAspectRequestV2 getQueryUsageStatistics() {
    return queryUsageStatistics;
  }

  public void setQueryUsageStatistics(QueryUsageStatisticsAspectRequestV2 queryUsageStatistics) {
    this.queryUsageStatistics = queryUsageStatistics;
  }

  public QueryEntityRequestV2 status(StatusAspectRequestV2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public StatusAspectRequestV2 getStatus() {
    return status;
  }

  public void setStatus(StatusAspectRequestV2 status) {
    this.status = status;
  }

  public QueryEntityRequestV2 dataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
    return this;
  }

  /**
   * Get dataPlatformInstance
   * @return dataPlatformInstance
   **/
  @Schema(description = "")
  
    @Valid
    public DataPlatformInstanceAspectRequestV2 getDataPlatformInstance() {
    return dataPlatformInstance;
  }

  public void setDataPlatformInstance(DataPlatformInstanceAspectRequestV2 dataPlatformInstance) {
    this.dataPlatformInstance = dataPlatformInstance;
  }

  public QueryEntityRequestV2 subTypes(SubTypesAspectRequestV2 subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  /**
   * Get subTypes
   * @return subTypes
   **/
  @Schema(description = "")
  
    @Valid
    public SubTypesAspectRequestV2 getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(SubTypesAspectRequestV2 subTypes) {
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
    QueryEntityRequestV2 queryEntityRequestV2 = (QueryEntityRequestV2) o;
    return Objects.equals(this.urn, queryEntityRequestV2.urn) &&
        Objects.equals(this.queryKey, queryEntityRequestV2.queryKey) &&
        Objects.equals(this.queryProperties, queryEntityRequestV2.queryProperties) &&
        Objects.equals(this.querySubjects, queryEntityRequestV2.querySubjects) &&
        Objects.equals(this.queryUsageStatistics, queryEntityRequestV2.queryUsageStatistics) &&
        Objects.equals(this.status, queryEntityRequestV2.status) &&
        Objects.equals(this.dataPlatformInstance, queryEntityRequestV2.dataPlatformInstance) &&
        Objects.equals(this.subTypes, queryEntityRequestV2.subTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, queryKey, queryProperties, querySubjects, queryUsageStatistics, status, dataPlatformInstance, subTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEntityRequestV2 {\n");
    
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