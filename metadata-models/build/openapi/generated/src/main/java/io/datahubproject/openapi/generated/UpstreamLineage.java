package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FineGrainedLineage;
import io.datahubproject.openapi.generated.Upstream;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Upstream lineage of a dataset
 */
@Schema(description = "Upstream lineage of a dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpstreamLineage  implements OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "UpstreamLineage") @Builder.Default
  private String __type = "UpstreamLineage";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"UpstreamLineage"},
  defaultValue = "UpstreamLineage")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("upstreams") @Builder.Default
  @Valid
  private List<Upstream> upstreams = new ArrayList<>();

  @JsonProperty("fineGrainedLineages") @Builder.Default
  @Valid
  private List<FineGrainedLineage> fineGrainedLineages = null;

  public UpstreamLineage upstreams(List<Upstream> upstreams) {
    this.upstreams = upstreams;
    return this;
  }

  public UpstreamLineage addUpstreamsItem(Upstream upstreamsItem) {
    this.upstreams.add(upstreamsItem);
    return this;
  }

  /**
   * List of upstream dataset lineage information
   * @return upstreams
   **/
  @Schema(required = true, description = "List of upstream dataset lineage information")
      @NotNull
    @Valid
    public List<Upstream> getUpstreams() {
    return upstreams;
  }

  public void setUpstreams(List<Upstream> upstreams) {
    this.upstreams = upstreams;
  }

  public UpstreamLineage fineGrainedLineages(List<FineGrainedLineage> fineGrainedLineages) {
    this.fineGrainedLineages = fineGrainedLineages;
    return this;
  }

  public UpstreamLineage addFineGrainedLineagesItem(FineGrainedLineage fineGrainedLineagesItem) {
    if (this.fineGrainedLineages == null) {
      this.fineGrainedLineages = new ArrayList<>();
    }
    this.fineGrainedLineages.add(fineGrainedLineagesItem);
    return this;
  }

  /**
   *  List of fine-grained lineage information, including field-level lineage
   * @return fineGrainedLineages
   **/
  @Schema(description = " List of fine-grained lineage information, including field-level lineage")
      @Valid
    public List<FineGrainedLineage> getFineGrainedLineages() {
    return fineGrainedLineages;
  }

  public void setFineGrainedLineages(List<FineGrainedLineage> fineGrainedLineages) {
    this.fineGrainedLineages = fineGrainedLineages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpstreamLineage upstreamLineage = (UpstreamLineage) o;
    return Objects.equals(this.upstreams, upstreamLineage.upstreams) &&
        Objects.equals(this.fineGrainedLineages, upstreamLineage.fineGrainedLineages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upstreams, fineGrainedLineages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpstreamLineage {\n");
    
    sb.append("    upstreams: ").append(toIndentedString(upstreams)).append("\n");
    sb.append("    fineGrainedLineages: ").append(toIndentedString(fineGrainedLineages)).append("\n");
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