package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.NotificationSettingValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * NotificationSetting
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationSetting   {

  @JsonProperty("value") @Builder.Default
  private NotificationSettingValue value = null;

  @JsonProperty("params") @Builder.Default
  @Valid
  private Map<String, String> params = null;

  public NotificationSetting value(NotificationSettingValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public NotificationSettingValue getValue() {
    return value;
  }

  public void setValue(NotificationSettingValue value) {
    this.value = value;
  }

  public NotificationSetting params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public NotificationSetting putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * Custom set of setting parameters.
   * @return params
   **/
  @Schema(description = "Custom set of setting parameters.")
  
    public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSetting notificationSetting = (NotificationSetting) o;
    return Objects.equals(this.value, notificationSetting.value) &&
        Objects.equals(this.params, notificationSetting.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSetting {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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