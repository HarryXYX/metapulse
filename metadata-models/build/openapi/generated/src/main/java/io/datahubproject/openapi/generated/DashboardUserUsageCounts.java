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
public class DashboardUserUsageCounts   {

  @JsonProperty("user") @Builder.Default
  private String user = null;

  @JsonProperty("viewsCount") @Builder.Default
  private Integer viewsCount = null;

  @JsonProperty("executionsCount") @Builder.Default
  private Integer executionsCount = null;

  @JsonProperty("usageCount") @Builder.Default
  private Integer usageCount = null;

  @JsonProperty("userEmail") @Builder.Default
  private String userEmail = null;

  public DashboardUserUsageCounts user(String user) {
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

  public DashboardUserUsageCounts viewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
    return this;
  }

  /**
   * The number of times the user has viewed the dashboard
   * minimum: -2147483648
   * maximum: 2147483647
   * @return viewsCount
   **/
  @Schema(description = "The number of times the user has viewed the dashboard")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }

  public DashboardUserUsageCounts executionsCount(Integer executionsCount) {
    this.executionsCount = executionsCount;
    return this;
  }

  /**
   * The number of times the user has executed (refreshed) the dashboard
   * minimum: -2147483648
   * maximum: 2147483647
   * @return executionsCount
   **/
  @Schema(description = "The number of times the user has executed (refreshed) the dashboard")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getExecutionsCount() {
    return executionsCount;
  }

  public void setExecutionsCount(Integer executionsCount) {
    this.executionsCount = executionsCount;
  }

  public DashboardUserUsageCounts usageCount(Integer usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return usageCount
   **/
  @Schema(description = "Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. ")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }

  public DashboardUserUsageCounts userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * If user_email is set, we attempt to resolve the user's urn upon ingest
   * @return userEmail
   **/
  @Schema(description = "If user_email is set, we attempt to resolve the user's urn upon ingest")
  
    public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardUserUsageCounts dashboardUserUsageCounts = (DashboardUserUsageCounts) o;
    return Objects.equals(this.user, dashboardUserUsageCounts.user) &&
        Objects.equals(this.viewsCount, dashboardUserUsageCounts.viewsCount) &&
        Objects.equals(this.executionsCount, dashboardUserUsageCounts.executionsCount) &&
        Objects.equals(this.usageCount, dashboardUserUsageCounts.usageCount) &&
        Objects.equals(this.userEmail, dashboardUserUsageCounts.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, viewsCount, executionsCount, usageCount, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardUserUsageCounts {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    viewsCount: ").append(toIndentedString(viewsCount)).append("\n");
    sb.append("    executionsCount: ").append(toIndentedString(executionsCount)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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