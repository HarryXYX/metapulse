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
/**
 * A set of connection details consisting of an encrypted JSON blob.
 */
@Schema(description = "A set of connection details consisting of an encrypted JSON blob.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataHubJsonConnection   {

  @JsonProperty("encryptedBlob") @Builder.Default
  private String encryptedBlob = null;

  public DataHubJsonConnection encryptedBlob(String encryptedBlob) {
    this.encryptedBlob = encryptedBlob;
    return this;
  }

  /**
   * The encrypted JSON connection details.
   * @return encryptedBlob
   **/
  @Schema(required = true, description = "The encrypted JSON connection details.")
      @NotNull

    public String getEncryptedBlob() {
    return encryptedBlob;
  }

  public void setEncryptedBlob(String encryptedBlob) {
    this.encryptedBlob = encryptedBlob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataHubJsonConnection dataHubJsonConnection = (DataHubJsonConnection) o;
    return Objects.equals(this.encryptedBlob, dataHubJsonConnection.encryptedBlob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedBlob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataHubJsonConnection {\n");
    
    sb.append("    encryptedBlob: ").append(toIndentedString(encryptedBlob)).append("\n");
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