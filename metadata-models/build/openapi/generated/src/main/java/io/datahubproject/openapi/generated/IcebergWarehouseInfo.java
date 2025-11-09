package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FabricType;
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
 * An Iceberg warehouse location and credentails whose read/writes are governed by datahub catalog.
 */
@Schema(description = "An Iceberg warehouse location and credentails whose read/writes are governed by datahub catalog.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IcebergWarehouseInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "IcebergWarehouseInfo") @Builder.Default
  private String __type = "IcebergWarehouseInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"IcebergWarehouseInfo"},
  defaultValue = "IcebergWarehouseInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("dataRoot") @Builder.Default
  private String dataRoot = null;

  @JsonProperty("clientId") @Builder.Default
  private String clientId = null;

  @JsonProperty("clientSecret") @Builder.Default
  private String clientSecret = null;

  @JsonProperty("region") @Builder.Default
  private String region = null;

  @JsonProperty("role") @Builder.Default
  private String role = null;

  @JsonProperty("tempCredentialExpirationSeconds") @Builder.Default
  private Integer tempCredentialExpirationSeconds = null;

  @JsonProperty("env") @Builder.Default
  private FabricType env = null;

  public IcebergWarehouseInfo dataRoot(String dataRoot) {
    this.dataRoot = dataRoot;
    return this;
  }

  /**
   * Path of the root for the backing store of the tables in the warehouse.
   * @return dataRoot
   **/
  @Schema(required = true, description = "Path of the root for the backing store of the tables in the warehouse.")
      @NotNull

    public String getDataRoot() {
    return dataRoot;
  }

  public void setDataRoot(String dataRoot) {
    this.dataRoot = dataRoot;
  }

  public IcebergWarehouseInfo clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * clientId to be used to authenticate with storage hosting this warehouse
   * @return clientId
   **/
  @Schema(required = true, description = "clientId to be used to authenticate with storage hosting this warehouse")
      @NotNull

    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public IcebergWarehouseInfo clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * client secret to authenticate with storage hosting this warehouse
   * @return clientSecret
   **/
  @Schema(required = true, description = "client secret to authenticate with storage hosting this warehouse")
      @NotNull

    public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public IcebergWarehouseInfo region(String region) {
    this.region = region;
    return this;
  }

  /**
   * region where the warehouse is located.
   * @return region
   **/
  @Schema(required = true, description = "region where the warehouse is located.")
      @NotNull

    public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public IcebergWarehouseInfo role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(description = "")
  
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public IcebergWarehouseInfo tempCredentialExpirationSeconds(Integer tempCredentialExpirationSeconds) {
    this.tempCredentialExpirationSeconds = tempCredentialExpirationSeconds;
    return this;
  }

  /**
   * Get tempCredentialExpirationSeconds
   * minimum: -2147483648
   * maximum: 2147483647
   * @return tempCredentialExpirationSeconds
   **/
  @Schema(description = "")
  
  @Min(-2147483648) @Max(2147483647)   public Integer getTempCredentialExpirationSeconds() {
    return tempCredentialExpirationSeconds;
  }

  public void setTempCredentialExpirationSeconds(Integer tempCredentialExpirationSeconds) {
    this.tempCredentialExpirationSeconds = tempCredentialExpirationSeconds;
  }

  public IcebergWarehouseInfo env(FabricType env) {
    this.env = env;
    return this;
  }

  /**
   * Get env
   * @return env
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FabricType getEnv() {
    return env;
  }

  public void setEnv(FabricType env) {
    this.env = env;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcebergWarehouseInfo icebergWarehouseInfo = (IcebergWarehouseInfo) o;
    return Objects.equals(this.dataRoot, icebergWarehouseInfo.dataRoot) &&
        Objects.equals(this.clientId, icebergWarehouseInfo.clientId) &&
        Objects.equals(this.clientSecret, icebergWarehouseInfo.clientSecret) &&
        Objects.equals(this.region, icebergWarehouseInfo.region) &&
        Objects.equals(this.role, icebergWarehouseInfo.role) &&
        Objects.equals(this.tempCredentialExpirationSeconds, icebergWarehouseInfo.tempCredentialExpirationSeconds) &&
        Objects.equals(this.env, icebergWarehouseInfo.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRoot, clientId, clientSecret, region, role, tempCredentialExpirationSeconds, env);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcebergWarehouseInfo {\n");
    
    sb.append("    dataRoot: ").append(toIndentedString(dataRoot)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    tempCredentialExpirationSeconds: ").append(toIndentedString(tempCredentialExpirationSeconds)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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