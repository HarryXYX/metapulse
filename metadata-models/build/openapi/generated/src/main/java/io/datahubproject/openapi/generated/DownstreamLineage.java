package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Downstream;
import io.swagger.v3.oas.annotations.media.Schema;
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
 * Downstream lineage of a dataset
 */
@Schema(description = "Downstream lineage of a dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownstreamLineage   {

  @JsonProperty("downstreams") @Builder.Default
  @Valid
  private List<Downstream> downstreams = new ArrayList<>();

  public DownstreamLineage downstreams(List<Downstream> downstreams) {
    this.downstreams = downstreams;
    return this;
  }

  public DownstreamLineage addDownstreamsItem(Downstream downstreamsItem) {
    this.downstreams.add(downstreamsItem);
    return this;
  }

  /**
   * List of downstream dataset lineage information
   * @return downstreams
   **/
  @Schema(required = true, description = "List of downstream dataset lineage information")
      @NotNull
    @Valid
    public List<Downstream> getDownstreams() {
    return downstreams;
  }

  public void setDownstreams(List<Downstream> downstreams) {
    this.downstreams = downstreams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownstreamLineage downstreamLineage = (DownstreamLineage) o;
    return Objects.equals(this.downstreams, downstreamLineage.downstreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downstreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownstreamLineage {\n");
    
    sb.append("    downstreams: ").append(toIndentedString(downstreams)).append("\n");
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