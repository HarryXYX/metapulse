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
 * A metadata snapshot for DataHub Access Policy data.
 */
@Schema(description = "A metadata snapshot for DataHub Access Policy data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubRetentionSnapshot  implements OneOfEntityValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataHubRetentionSnapshot") @Builder.Default
  private String __type = "DataHubRetentionSnapshot";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataHubRetentionSnapshot"},
  defaultValue = "DataHubRetentionSnapshot")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("aspects") @Builder.Default
  @Valid
  private List<OneOfDataHubRetentionSnapshotAspectsItems> aspects = new ArrayList<>();

  public DataHubRetentionSnapshot urn(String urn) {
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

  public DataHubRetentionSnapshot aspects(List<OneOfDataHubRetentionSnapshotAspectsItems> aspects) {
    this.aspects = aspects;
    return this;
  }

  public DataHubRetentionSnapshot addAspectsItem(OneOfDataHubRetentionSnapshotAspectsItems aspectsItem) {
    this.aspects.add(aspectsItem);
    return this;
  }

  /**
   * The list of metadata aspects associated with the DataHub access policy.
   * @return aspects
   **/
  @Schema(required = true, description = "The list of metadata aspects associated with the DataHub access policy.")
      @NotNull

    public List<OneOfDataHubRetentionSnapshotAspectsItems> getAspects() {
    return aspects;
  }

  public void setAspects(List<OneOfDataHubRetentionSnapshotAspectsItems> aspects) {
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
    DataHubRetentionSnapshot dataHubRetentionSnapshot = (DataHubRetentionSnapshot) o;
    return Objects.equals(this.urn, dataHubRetentionSnapshot.urn) &&
        Objects.equals(this.aspects, dataHubRetentionSnapshot.aspects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, aspects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubRetentionSnapshot {\n");
    
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