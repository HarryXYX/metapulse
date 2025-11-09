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
 * Describes a delta change to a dataset downstream lineage
 */
@Schema(description = "Describes a delta change to a dataset downstream lineage")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownstreamLineageDelta   {

  @JsonProperty("downstreamsToUpdate") @Builder.Default
  @Valid
  private List<Downstream> downstreamsToUpdate = new ArrayList<>();

  public DownstreamLineageDelta downstreamsToUpdate(List<Downstream> downstreamsToUpdate) {
    this.downstreamsToUpdate = downstreamsToUpdate;
    return this;
  }

  public DownstreamLineageDelta addDownstreamsToUpdateItem(Downstream downstreamsToUpdateItem) {
    this.downstreamsToUpdate.add(downstreamsToUpdateItem);
    return this;
  }

  /**
   * The list of downstream lineages to be updated for a dataset
   * @return downstreamsToUpdate
   **/
  @Schema(required = true, description = "The list of downstream lineages to be updated for a dataset")
      @NotNull
    @Valid
    public List<Downstream> getDownstreamsToUpdate() {
    return downstreamsToUpdate;
  }

  public void setDownstreamsToUpdate(List<Downstream> downstreamsToUpdate) {
    this.downstreamsToUpdate = downstreamsToUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownstreamLineageDelta downstreamLineageDelta = (DownstreamLineageDelta) o;
    return Objects.equals(this.downstreamsToUpdate, downstreamLineageDelta.downstreamsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downstreamsToUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownstreamLineageDelta {\n");
    
    sb.append("    downstreamsToUpdate: ").append(toIndentedString(downstreamsToUpdate)).append("\n");
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