package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubPageTemplateEntityResponseV2;
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
 * Scroll across DataHubPageTemplate objects.
 */
@Schema(description = "Scroll across DataHubPageTemplate objects.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollDataHubPageTemplateEntityResponseV2   {

  @JsonProperty("scrollId") @Builder.Default
  private String scrollId = null;

  @JsonProperty("entities") @Builder.Default
  @Valid
  private List<DataHubPageTemplateEntityResponseV2> entities = new ArrayList<>();

  public ScrollDataHubPageTemplateEntityResponseV2 scrollId(String scrollId) {
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

  public ScrollDataHubPageTemplateEntityResponseV2 entities(List<DataHubPageTemplateEntityResponseV2> entities) {
    this.entities = entities;
    return this;
  }

  public ScrollDataHubPageTemplateEntityResponseV2 addEntitiesItem(DataHubPageTemplateEntityResponseV2 entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * DataHubPageTemplate object.
   * @return entities
   **/
  @Schema(required = true, description = "DataHubPageTemplate object.")
      @NotNull
    @Valid
    public List<DataHubPageTemplateEntityResponseV2> getEntities() {
    return entities;
  }

  public void setEntities(List<DataHubPageTemplateEntityResponseV2> entities) {
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
    ScrollDataHubPageTemplateEntityResponseV2 scrollDataHubPageTemplateEntityResponseV2 = (ScrollDataHubPageTemplateEntityResponseV2) o;
    return Objects.equals(this.scrollId, scrollDataHubPageTemplateEntityResponseV2.scrollId) &&
        Objects.equals(this.entities, scrollDataHubPageTemplateEntityResponseV2.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollId, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollDataHubPageTemplateEntityResponseV2 {\n");
    
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