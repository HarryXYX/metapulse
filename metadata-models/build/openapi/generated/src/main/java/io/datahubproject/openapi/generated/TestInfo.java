package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.TestDefinition;
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
 * Information about a DataHub Test
 */
@Schema(description = "Information about a DataHub Test")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "TestInfo") @Builder.Default
  private String __type = "TestInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"TestInfo"},
  defaultValue = "TestInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("category") @Builder.Default
  private String category = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("definition") @Builder.Default
  private TestDefinition definition = null;

  public TestInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the test
   * @return name
   **/
  @Schema(required = true, description = "The name of the test")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestInfo category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the test
   * @return category
   **/
  @Schema(required = true, description = "Category of the test")
      @NotNull

    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TestInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the test
   * @return description
   **/
  @Schema(description = "Description of the test")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestInfo definition(TestDefinition definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TestDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(TestDefinition definition) {
    this.definition = definition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestInfo testInfo = (TestInfo) o;
    return Objects.equals(this.name, testInfo.name) &&
        Objects.equals(this.category, testInfo.category) &&
        Objects.equals(this.description, testInfo.description) &&
        Objects.equals(this.definition, testInfo.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, description, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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