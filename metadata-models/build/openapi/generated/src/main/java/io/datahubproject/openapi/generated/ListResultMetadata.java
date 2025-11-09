package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.ExtraInfo;
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
 * The additional metadata for a list result
 */
@Schema(description = "The additional metadata for a list result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListResultMetadata   {

  @JsonProperty("extraInfos") @Builder.Default
  @Valid
  private List<ExtraInfo> extraInfos = new ArrayList<>();

  public ListResultMetadata extraInfos(List<ExtraInfo> extraInfos) {
    this.extraInfos = extraInfos;
    return this;
  }

  public ListResultMetadata addExtraInfosItem(ExtraInfo extraInfosItem) {
    this.extraInfos.add(extraInfosItem);
    return this;
  }

  /**
   * A list of extra information that positionally corresponds to the aspects returned from the list query
   * @return extraInfos
   **/
  @Schema(required = true, description = "A list of extra information that positionally corresponds to the aspects returned from the list query")
      @NotNull
    @Valid
    public List<ExtraInfo> getExtraInfos() {
    return extraInfos;
  }

  public void setExtraInfos(List<ExtraInfo> extraInfos) {
    this.extraInfos = extraInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResultMetadata listResultMetadata = (ListResultMetadata) o;
    return Objects.equals(this.extraInfos, listResultMetadata.extraInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResultMetadata {\n");
    
    sb.append("    extraInfos: ").append(toIndentedString(extraInfos)).append("\n");
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