package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * MLPrimaryKeySnapshot
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLPrimaryKeySnapshot  implements OneOfEntityValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLPrimaryKeySnapshot") @Builder.Default
  private String __type = "MLPrimaryKeySnapshot";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLPrimaryKeySnapshot"},
  defaultValue = "MLPrimaryKeySnapshot")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("aspects") @Builder.Default
  @Valid
  private List<OneOfMLPrimaryKeySnapshotAspectsItems> aspects = new ArrayList<>();

  public MLPrimaryKeySnapshot urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * URN for the entity the metadata snapshot is associated with.
   * @return urn
   **/
  @Schema(required = true, description = "URN for the entity the metadata snapshot is associated with.")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public MLPrimaryKeySnapshot aspects(List<OneOfMLPrimaryKeySnapshotAspectsItems> aspects) {
    this.aspects = aspects;
    return this;
  }

  public MLPrimaryKeySnapshot addAspectsItem(OneOfMLPrimaryKeySnapshotAspectsItems aspectsItem) {
    this.aspects.add(aspectsItem);
    return this;
  }

  /**
   * The list of metadata aspects associated with the MLPrimaryKey. Depending on the use case, this can either be all, or a selection, of supported aspects.
   * @return aspects
   **/
  @Schema(required = true, description = "The list of metadata aspects associated with the MLPrimaryKey. Depending on the use case, this can either be all, or a selection, of supported aspects.")
      @NotNull

    public List<OneOfMLPrimaryKeySnapshotAspectsItems> getAspects() {
    return aspects;
  }

  public void setAspects(List<OneOfMLPrimaryKeySnapshotAspectsItems> aspects) {
    this.aspects = aspects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLPrimaryKeySnapshot mlPrimaryKeySnapshot = (MLPrimaryKeySnapshot) o;
    return Objects.equals(this.urn, mlPrimaryKeySnapshot.urn) &&
        Objects.equals(this.aspects, mlPrimaryKeySnapshot.aspects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, aspects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLPrimaryKeySnapshot {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
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