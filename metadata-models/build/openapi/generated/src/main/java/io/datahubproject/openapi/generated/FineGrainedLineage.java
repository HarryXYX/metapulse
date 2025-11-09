package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FineGrainedLineageDownstreamType;
import io.datahubproject.openapi.generated.FineGrainedLineageUpstreamType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A fine-grained lineage from upstream fields/datasets to downstream field(s)
 */
@Schema(description = "A fine-grained lineage from upstream fields/datasets to downstream field(s)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineGrainedLineage   {

  @JsonProperty("upstreamType") @Builder.Default
  private FineGrainedLineageUpstreamType upstreamType = null;

  @JsonProperty("upstreams") @Builder.Default
  @Valid
  private List<String> upstreams = null;

  @JsonProperty("downstreamType") @Builder.Default
  private FineGrainedLineageDownstreamType downstreamType = null;

  @JsonProperty("downstreams") @Builder.Default
  @Valid
  private List<String> downstreams = null;

  @JsonProperty("transformOperation") @Builder.Default
  private String transformOperation = null;

  @JsonProperty("confidenceScore") @Builder.Default
  private BigDecimal confidenceScore = new BigDecimal(1);

  @JsonProperty("query") @Builder.Default
  private String query = null;

  public FineGrainedLineage upstreamType(FineGrainedLineageUpstreamType upstreamType) {
    this.upstreamType = upstreamType;
    return this;
  }

  /**
   * Get upstreamType
   * @return upstreamType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FineGrainedLineageUpstreamType getUpstreamType() {
    return upstreamType;
  }

  public void setUpstreamType(FineGrainedLineageUpstreamType upstreamType) {
    this.upstreamType = upstreamType;
  }

  public FineGrainedLineage upstreams(List<String> upstreams) {
    this.upstreams = upstreams;
    return this;
  }

  public FineGrainedLineage addUpstreamsItem(String upstreamsItem) {
    if (this.upstreams == null) {
      this.upstreams = new ArrayList<>();
    }
    this.upstreams.add(upstreamsItem);
    return this;
  }

  /**
   * Upstream entities in the lineage
   * @return upstreams
   **/
  @Schema(description = "Upstream entities in the lineage")
  
    public List<String> getUpstreams() {
    return upstreams;
  }

  public void setUpstreams(List<String> upstreams) {
    this.upstreams = upstreams;
  }

  public FineGrainedLineage downstreamType(FineGrainedLineageDownstreamType downstreamType) {
    this.downstreamType = downstreamType;
    return this;
  }

  /**
   * Get downstreamType
   * @return downstreamType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FineGrainedLineageDownstreamType getDownstreamType() {
    return downstreamType;
  }

  public void setDownstreamType(FineGrainedLineageDownstreamType downstreamType) {
    this.downstreamType = downstreamType;
  }

  public FineGrainedLineage downstreams(List<String> downstreams) {
    this.downstreams = downstreams;
    return this;
  }

  public FineGrainedLineage addDownstreamsItem(String downstreamsItem) {
    if (this.downstreams == null) {
      this.downstreams = new ArrayList<>();
    }
    this.downstreams.add(downstreamsItem);
    return this;
  }

  /**
   * Downstream fields in the lineage
   * @return downstreams
   **/
  @Schema(description = "Downstream fields in the lineage")
  
    public List<String> getDownstreams() {
    return downstreams;
  }

  public void setDownstreams(List<String> downstreams) {
    this.downstreams = downstreams;
  }

  public FineGrainedLineage transformOperation(String transformOperation) {
    this.transformOperation = transformOperation;
    return this;
  }

  /**
   * The transform operation applied to the upstream entities to produce the downstream field(s)
   * @return transformOperation
   **/
  @Schema(description = "The transform operation applied to the upstream entities to produce the downstream field(s)")
  
    public String getTransformOperation() {
    return transformOperation;
  }

  public void setTransformOperation(String transformOperation) {
    this.transformOperation = transformOperation;
  }

  public FineGrainedLineage confidenceScore(BigDecimal confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

  /**
   * The confidence in this lineage between 0 (low confidence) and 1 (high confidence)
   * @return confidenceScore
   **/
  @Schema(required = true, description = "The confidence in this lineage between 0 (low confidence) and 1 (high confidence)")
      @NotNull

    @Valid
    public BigDecimal getConfidenceScore() {
    return confidenceScore;
  }

  public void setConfidenceScore(BigDecimal confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public FineGrainedLineage query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query that was used to generate this lineage.  Present only if the lineage was generated from a detected query.
   * @return query
   **/
  @Schema(description = "The query that was used to generate this lineage.  Present only if the lineage was generated from a detected query.")
  
    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineGrainedLineage fineGrainedLineage = (FineGrainedLineage) o;
    return Objects.equals(this.upstreamType, fineGrainedLineage.upstreamType) &&
        Objects.equals(this.upstreams, fineGrainedLineage.upstreams) &&
        Objects.equals(this.downstreamType, fineGrainedLineage.downstreamType) &&
        Objects.equals(this.downstreams, fineGrainedLineage.downstreams) &&
        Objects.equals(this.transformOperation, fineGrainedLineage.transformOperation) &&
        Objects.equals(this.confidenceScore, fineGrainedLineage.confidenceScore) &&
        Objects.equals(this.query, fineGrainedLineage.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upstreamType, upstreams, downstreamType, downstreams, transformOperation, confidenceScore, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineGrainedLineage {\n");
    
    sb.append("    upstreamType: ").append(toIndentedString(upstreamType)).append("\n");
    sb.append("    upstreams: ").append(toIndentedString(upstreams)).append("\n");
    sb.append("    downstreamType: ").append(toIndentedString(downstreamType)).append("\n");
    sb.append("    downstreams: ").append(toIndentedString(downstreams)).append("\n");
    sb.append("    transformOperation: ").append(toIndentedString(transformOperation)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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