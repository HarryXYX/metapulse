package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataQualityContract;
import io.datahubproject.openapi.generated.FreshnessContract;
import io.datahubproject.openapi.generated.SchemaContract;
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
 * Information about a data contract
 */
@Schema(description = "Information about a data contract")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataContractProperties  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "DataContractProperties") @Builder.Default
  private String __type = "DataContractProperties";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"DataContractProperties"},
  defaultValue = "DataContractProperties")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("entity") @Builder.Default
  private String entity = null;

  @JsonProperty("schema") @Builder.Default
  @Valid
  private List<SchemaContract> schema = null;

  @JsonProperty("freshness") @Builder.Default
  @Valid
  private List<FreshnessContract> freshness = null;

  @JsonProperty("dataQuality") @Builder.Default
  @Valid
  private List<DataQualityContract> dataQuality = null;

  @JsonProperty("rawContract") @Builder.Default
  private String rawContract = null;

  public DataContractProperties entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity that this contract is associated with. Currently, we only support Dataset contracts, but in the future we may also support Data Product level contracts.
   * @return entity
   **/
  @Schema(required = true, description = "The entity that this contract is associated with. Currently, we only support Dataset contracts, but in the future we may also support Data Product level contracts.")
      @NotNull

    public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public DataContractProperties schema(List<SchemaContract> schema) {
    this.schema = schema;
    return this;
  }

  public DataContractProperties addSchemaItem(SchemaContract schemaItem) {
    if (this.schema == null) {
      this.schema = new ArrayList<>();
    }
    this.schema.add(schemaItem);
    return this;
  }

  /**
   * An optional set of schema contracts. If this is a dataset contract, there will only be one.
   * @return schema
   **/
  @Schema(description = "An optional set of schema contracts. If this is a dataset contract, there will only be one.")
      @Valid
    public List<SchemaContract> getSchema() {
    return schema;
  }

  public void setSchema(List<SchemaContract> schema) {
    this.schema = schema;
  }

  public DataContractProperties freshness(List<FreshnessContract> freshness) {
    this.freshness = freshness;
    return this;
  }

  public DataContractProperties addFreshnessItem(FreshnessContract freshnessItem) {
    if (this.freshness == null) {
      this.freshness = new ArrayList<>();
    }
    this.freshness.add(freshnessItem);
    return this;
  }

  /**
   * An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.
   * @return freshness
   **/
  @Schema(description = "An optional set of FRESHNESS contracts. If this is a dataset contract, there will only be one.")
      @Valid
    public List<FreshnessContract> getFreshness() {
    return freshness;
  }

  public void setFreshness(List<FreshnessContract> freshness) {
    this.freshness = freshness;
  }

  public DataContractProperties dataQuality(List<DataQualityContract> dataQuality) {
    this.dataQuality = dataQuality;
    return this;
  }

  public DataContractProperties addDataQualityItem(DataQualityContract dataQualityItem) {
    if (this.dataQuality == null) {
      this.dataQuality = new ArrayList<>();
    }
    this.dataQuality.add(dataQualityItem);
    return this;
  }

  /**
   * An optional set of Data Quality contracts, e.g. table and column level contract constraints.
   * @return dataQuality
   **/
  @Schema(description = "An optional set of Data Quality contracts, e.g. table and column level contract constraints.")
      @Valid
    public List<DataQualityContract> getDataQuality() {
    return dataQuality;
  }

  public void setDataQuality(List<DataQualityContract> dataQuality) {
    this.dataQuality = dataQuality;
  }

  public DataContractProperties rawContract(String rawContract) {
    this.rawContract = rawContract;
    return this;
  }

  /**
   * YAML-formatted contract definition
   * @return rawContract
   **/
  @Schema(description = "YAML-formatted contract definition")
  
    public String getRawContract() {
    return rawContract;
  }

  public void setRawContract(String rawContract) {
    this.rawContract = rawContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataContractProperties dataContractProperties = (DataContractProperties) o;
    return Objects.equals(this.entity, dataContractProperties.entity) &&
        Objects.equals(this.schema, dataContractProperties.schema) &&
        Objects.equals(this.freshness, dataContractProperties.freshness) &&
        Objects.equals(this.dataQuality, dataContractProperties.dataQuality) &&
        Objects.equals(this.rawContract, dataContractProperties.rawContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, schema, freshness, dataQuality, rawContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataContractProperties {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    freshness: ").append(toIndentedString(freshness)).append("\n");
    sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
    sb.append("    rawContract: ").append(toIndentedString(rawContract)).append("\n");
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