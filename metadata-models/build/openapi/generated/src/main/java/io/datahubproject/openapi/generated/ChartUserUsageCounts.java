package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Records a single user&#x27;s usage counts for a given resource
 */
@Schema(description = "Records a single user's usage counts for a given resource")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartUserUsageCounts   {

  @JsonProperty("user") @Builder.Default
  private String user = null;

  @JsonProperty("viewsCount") @Builder.Default
  private Integer viewsCount = null;

  public ChartUserUsageCounts user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The unique id of the user.
   * @return user
   **/
  @Schema(required = true, description = "The unique id of the user.")
      @NotNull

    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ChartUserUsageCounts viewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
    return this;
  }

  /**
   * The number of times the user has viewed the chart
   * minimum: -2147483648
   * maximum: 2147483647
   * @return viewsCount
   **/
  @Schema(description = "The number of times the user has viewed the chart")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartUserUsageCounts chartUserUsageCounts = (ChartUserUsageCounts) o;
    return Objects.equals(this.user, chartUserUsageCounts.user) &&
        Objects.equals(this.viewsCount, chartUserUsageCounts.viewsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, viewsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartUserUsageCounts {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    viewsCount: ").append(toIndentedString(viewsCount)).append("\n");
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