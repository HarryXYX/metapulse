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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Key for a Dashboard
 */
@Schema(description = "Key for a Dashboard")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardKey  implements OneOfDashboardSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DashboardKey") @Builder.Default
  private String __type = "DashboardKey";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DashboardKey"},
  defaultValue = "DashboardKey")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("dashboardTool") @Builder.Default
  private String dashboardTool = null;

  @JsonProperty("dashboardId") @Builder.Default
  private String dashboardId = null;

  public DashboardKey dashboardTool(String dashboardTool) {
    this.dashboardTool = dashboardTool;
    return this;
  }

  /**
   * The name of the dashboard tool such as looker, redash etc.
   * @return dashboardTool
   **/
  @Schema(required = true, description = "The name of the dashboard tool such as looker, redash etc.")
      @NotNull

    public String getDashboardTool() {
    return dashboardTool;
  }

  public void setDashboardTool(String dashboardTool) {
    this.dashboardTool = dashboardTool;
  }

  public DashboardKey dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'
   * @return dashboardId
   **/
  @Schema(required = true, description = "Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'")
      @NotNull

    public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardKey dashboardKey = (DashboardKey) o;
    return Objects.equals(this.dashboardTool, dashboardKey.dashboardTool) &&
        Objects.equals(this.dashboardId, dashboardKey.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardTool, dashboardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardKey {\n");
    
    sb.append("    dashboardTool: ").append(toIndentedString(dashboardTool)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
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