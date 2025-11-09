package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.DataHubPageTemplateKeyAspectResponseV2;
import io.datahubproject.openapi.generated.DataHubPageTemplatePropertiesAspectResponseV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * DataHubPageTemplate object.
 */
@Schema(description = "DataHubPageTemplate object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubPageTemplateEntityResponseV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("dataHubPageTemplateKey") @Builder.Default
  private DataHubPageTemplateKeyAspectResponseV2 dataHubPageTemplateKey = null;

  @JsonProperty("dataHubPageTemplateProperties") @Builder.Default
  private DataHubPageTemplatePropertiesAspectResponseV2 dataHubPageTemplateProperties = null;

  public DataHubPageTemplateEntityResponseV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for dataHubPageTemplate
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for dataHubPageTemplate")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public DataHubPageTemplateEntityResponseV2 dataHubPageTemplateKey(DataHubPageTemplateKeyAspectResponseV2 dataHubPageTemplateKey) {
    this.dataHubPageTemplateKey = dataHubPageTemplateKey;
    return this;
  }

  /**
   * Get dataHubPageTemplateKey
   * @return dataHubPageTemplateKey
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubPageTemplateKeyAspectResponseV2 getDataHubPageTemplateKey() {
    return dataHubPageTemplateKey;
  }

  public void setDataHubPageTemplateKey(DataHubPageTemplateKeyAspectResponseV2 dataHubPageTemplateKey) {
    this.dataHubPageTemplateKey = dataHubPageTemplateKey;
  }

  public DataHubPageTemplateEntityResponseV2 dataHubPageTemplateProperties(DataHubPageTemplatePropertiesAspectResponseV2 dataHubPageTemplateProperties) {
    this.dataHubPageTemplateProperties = dataHubPageTemplateProperties;
    return this;
  }

  /**
   * Get dataHubPageTemplateProperties
   * @return dataHubPageTemplateProperties
   **/
  @Schema(description = "")
  
    @Valid
    public DataHubPageTemplatePropertiesAspectResponseV2 getDataHubPageTemplateProperties() {
    return dataHubPageTemplateProperties;
  }

  public void setDataHubPageTemplateProperties(DataHubPageTemplatePropertiesAspectResponseV2 dataHubPageTemplateProperties) {
    this.dataHubPageTemplateProperties = dataHubPageTemplateProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubPageTemplateEntityResponseV2 dataHubPageTemplateEntityResponseV2 = (DataHubPageTemplateEntityResponseV2) o;
    return Objects.equals(this.urn, dataHubPageTemplateEntityResponseV2.urn) &&
        Objects.equals(this.dataHubPageTemplateKey, dataHubPageTemplateEntityResponseV2.dataHubPageTemplateKey) &&
        Objects.equals(this.dataHubPageTemplateProperties, dataHubPageTemplateEntityResponseV2.dataHubPageTemplateProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, dataHubPageTemplateKey, dataHubPageTemplateProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubPageTemplateEntityResponseV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    dataHubPageTemplateKey: ").append(toIndentedString(dataHubPageTemplateKey)).append("\n");
    sb.append("    dataHubPageTemplateProperties: ").append(toIndentedString(dataHubPageTemplateProperties)).append("\n");
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