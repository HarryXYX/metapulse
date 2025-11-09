package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ChartQueryType;
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
 * Information for chart query which is used for getting data of the chart
 */
@Schema(description = "Information for chart query which is used for getting data of the chart")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartQuery  implements OneOfChartSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "ChartQuery") @Builder.Default
  private String __type = "ChartQuery";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"ChartQuery"},
  defaultValue = "ChartQuery")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("rawQuery") @Builder.Default
  private String rawQuery = null;

  @JsonProperty("type") @Builder.Default
  private ChartQueryType type = null;

  public ChartQuery rawQuery(String rawQuery) {
    this.rawQuery = rawQuery;
    return this;
  }

  /**
   * Raw query to build a chart from input datasets
   * @return rawQuery
   **/
  @Schema(required = true, description = "Raw query to build a chart from input datasets")
      @NotNull

    public String getRawQuery() {
    return rawQuery;
  }

  public void setRawQuery(String rawQuery) {
    this.rawQuery = rawQuery;
  }

  public ChartQuery type(ChartQueryType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ChartQueryType getType() {
    return type;
  }

  public void setType(ChartQueryType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartQuery chartQuery = (ChartQuery) o;
    return Objects.equals(this.rawQuery, chartQuery.rawQuery) &&
        Objects.equals(this.type, chartQuery.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawQuery, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartQuery {\n");
    
    sb.append("    rawQuery: ").append(toIndentedString(rawQuery)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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