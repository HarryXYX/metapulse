package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.RelatedAspect;
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
 * The model for the result of a relationship query. Used to get the relationships of a given entity run.
 */
@Schema(description = "The model for the result of a relationship query. Used to get the relationships of a given entity run.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteReferencesResponse   {

  @JsonProperty("relatedAspects") @Builder.Default
  @Valid
  private List<RelatedAspect> relatedAspects = new ArrayList<>();

  @JsonProperty("total") @Builder.Default
  private Integer total = null;

  public DeleteReferencesResponse relatedAspects(List<RelatedAspect> relatedAspects) {
    this.relatedAspects = relatedAspects;
    return this;
  }

  public DeleteReferencesResponse addRelatedAspectsItem(RelatedAspect relatedAspectsItem) {
    this.relatedAspects.add(relatedAspectsItem);
    return this;
  }

  /**
   * Get relatedAspects
   * @return relatedAspects
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<RelatedAspect> getRelatedAspects() {
    return relatedAspects;
  }

  public void setRelatedAspects(List<RelatedAspect> relatedAspects) {
    this.relatedAspects = relatedAspects;
  }

  public DeleteReferencesResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of relationships that an entity urn has.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return total
   **/
  @Schema(required = true, description = "Total number of relationships that an entity urn has.")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteReferencesResponse deleteReferencesResponse = (DeleteReferencesResponse) o;
    return Objects.equals(this.relatedAspects, deleteReferencesResponse.relatedAspects) &&
        Objects.equals(this.total, deleteReferencesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedAspects, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteReferencesResponse {\n");
    
    sb.append("    relatedAspects: ").append(toIndentedString(relatedAspects)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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