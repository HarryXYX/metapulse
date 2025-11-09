package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TestEntityResponseV2;
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
 * Scroll across Test objects.
 */
@Schema(description = "Scroll across Test objects.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollTestEntityResponseV2   {

  @JsonProperty("scrollId") @Builder.Default
  private String scrollId = null;

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<TestEntityResponseV2> entities = new ArrayList<>();

  public ScrollTestEntityResponseV2 scrollId(String scrollId) {
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

  public ScrollTestEntityResponseV2 entities(List<TestEntityResponseV2> entities) {
    this.entities = entities;
    return this;
  }

  public ScrollTestEntityResponseV2 addEntitiesItem(TestEntityResponseV2 entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * A DataHub test
   * @return entities
   **/
  @Schema(required = true, description = "A DataHub test")
      @NotNull
    @Valid
    public List<TestEntityResponseV2> getEntities() {
    return entities;
  }

  public void setEntities(List<TestEntityResponseV2> entities) {
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
    ScrollTestEntityResponseV2 scrollTestEntityResponseV2 = (ScrollTestEntityResponseV2) o;
    return Objects.equals(this.scrollId, scrollTestEntityResponseV2.scrollId) &&
        Objects.equals(this.entities, scrollTestEntityResponseV2.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollId, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollTestEntityResponseV2 {\n");
    
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