package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ChartEntityResponseV2;
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
 * Scroll across Chart objects.
 */
@Schema(description = "Scroll across Chart objects.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollChartEntityResponseV2   {

  @JsonProperty("scrollId") @Builder.Default
  private String scrollId = null;

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<ChartEntityResponseV2> entities = new ArrayList<>();

  public ScrollChartEntityResponseV2 scrollId(String scrollId) {
    this.scrollId = scrollId;
    return this;
  }

  /**
   * Scroll id for pagination.
   * @return scrollId
   **/
  @Schema(description = "Scroll id for pagination.")
  
    public String getScrollId() {
    return scrollId;
  }

  public void setScrollId(String scrollId) {
    this.scrollId = scrollId;
  }

  public ScrollChartEntityResponseV2 entities(List<ChartEntityResponseV2> entities) {
    this.entities = entities;
    return this;
  }

  public ScrollChartEntityResponseV2 addEntitiesItem(ChartEntityResponseV2 entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Chart object.
   * @return entities
   **/
  @Schema(required = true, description = "Chart object.")
      @NotNull
    @Valid
    public List<ChartEntityResponseV2> getEntities() {
    return entities;
  }

  public void setEntities(List<ChartEntityResponseV2> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollChartEntityResponseV2 scrollChartEntityResponseV2 = (ScrollChartEntityResponseV2) o;
    return Objects.equals(this.scrollId, scrollChartEntityResponseV2.scrollId) &&
        Objects.equals(this.entities, scrollChartEntityResponseV2.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollId, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollChartEntityResponseV2 {\n");
    
    sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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