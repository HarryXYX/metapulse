package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.IncrementingSegmentFieldTransformer;
import io.datahubproject.openapi.generated.SchemaFieldSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Core attributes required to identify an incrementing segment in a table. This type is mainly useful for tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)  An incrementing segment represents a logical chunk of data which is INSERTED into a dataset on a regular interval, along with the presence of a constantly-incrementing column value such as an event time, date partition, or last modified column.  An incrementing segment is principally identified by 2 key attributes combined:   1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.     Note that the value of this column may not by itself represent the \&quot;bucket\&quot; or the \&quot;segment\&quot; in which the row falls.   2. [Optional] An transformer function that may be applied to the selected column value in order     to obtain the final \&quot;segment identifier\&quot; or \&quot;bucket identifier\&quot;. Rows that have the same value after applying the transformation     will be grouped into the same segment, using which the final value (e.g. row count) will be determined.
 */
@Schema(description = "Core attributes required to identify an incrementing segment in a table. This type is mainly useful for tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)  An incrementing segment represents a logical chunk of data which is INSERTED into a dataset on a regular interval, along with the presence of a constantly-incrementing column value such as an event time, date partition, or last modified column.  An incrementing segment is principally identified by 2 key attributes combined:   1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.     Note that the value of this column may not by itself represent the \"bucket\" or the \"segment\" in which the row falls.   2. [Optional] An transformer function that may be applied to the selected column value in order     to obtain the final \"segment identifier\" or \"bucket identifier\". Rows that have the same value after applying the transformation     will be grouped into the same segment, using which the final value (e.g. row count) will be determined.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncrementingSegmentSpec   {

  @JsonProperty("field") @Builder.Default
  private SchemaFieldSpec field = null;

  @JsonProperty("transformer") @Builder.Default
  private IncrementingSegmentFieldTransformer transformer = null;

  public IncrementingSegmentSpec field(SchemaFieldSpec field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SchemaFieldSpec getField() {
    return field;
  }

  public void setField(SchemaFieldSpec field) {
    this.field = field;
  }

  public IncrementingSegmentSpec transformer(IncrementingSegmentFieldTransformer transformer) {
    this.transformer = transformer;
    return this;
  }

  /**
   * Get transformer
   * @return transformer
   **/
  @Schema(description = "")
  
    @Valid
    public IncrementingSegmentFieldTransformer getTransformer() {
    return transformer;
  }

  public void setTransformer(IncrementingSegmentFieldTransformer transformer) {
    this.transformer = transformer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncrementingSegmentSpec incrementingSegmentSpec = (IncrementingSegmentSpec) o;
    return Objects.equals(this.field, incrementingSegmentSpec.field) &&
        Objects.equals(this.transformer, incrementingSegmentSpec.transformer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, transformer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncrementingSegmentSpec {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    transformer: ").append(toIndentedString(transformer)).append("\n");
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