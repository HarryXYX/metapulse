package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TestInfoAspectRequestV2;
import io.datahubproject.openapi.generated.TestKeyAspectRequestV2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A DataHub test
 */
@Schema(description = "A DataHub test")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestEntityRequestV2   {

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  @JsonProperty("testKey") @Builder.Default
  private TestKeyAspectRequestV2 testKey = null;

  @JsonProperty("testInfo") @Builder.Default
  private TestInfoAspectRequestV2 testInfo = null;

  public TestEntityRequestV2 urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Unique id for test
   * @return urn
   **/
  @Schema(required = true, description = "Unique id for test")
      @NotNull

    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public TestEntityRequestV2 testKey(TestKeyAspectRequestV2 testKey) {
    this.testKey = testKey;
    return this;
  }

  /**
   * Get testKey
   * @return testKey
   **/
  @Schema(description = "")
  
    @Valid
    public TestKeyAspectRequestV2 getTestKey() {
    return testKey;
  }

  public void setTestKey(TestKeyAspectRequestV2 testKey) {
    this.testKey = testKey;
  }

  public TestEntityRequestV2 testInfo(TestInfoAspectRequestV2 testInfo) {
    this.testInfo = testInfo;
    return this;
  }

  /**
   * Get testInfo
   * @return testInfo
   **/
  @Schema(description = "")
  
    @Valid
    public TestInfoAspectRequestV2 getTestInfo() {
    return testInfo;
  }

  public void setTestInfo(TestInfoAspectRequestV2 testInfo) {
    this.testInfo = testInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestEntityRequestV2 testEntityRequestV2 = (TestEntityRequestV2) o;
    return Objects.equals(this.urn, testEntityRequestV2.urn) &&
        Objects.equals(this.testKey, testEntityRequestV2.testKey) &&
        Objects.equals(this.testInfo, testEntityRequestV2.testInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, testKey, testInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestEntityRequestV2 {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    testKey: ").append(toIndentedString(testKey)).append("\n");
    sb.append("    testInfo: ").append(toIndentedString(testInfo)).append("\n");
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