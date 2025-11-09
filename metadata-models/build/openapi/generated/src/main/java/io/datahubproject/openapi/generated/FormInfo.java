package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.FormActorAssignment;
import io.datahubproject.openapi.generated.FormPrompt;
import io.datahubproject.openapi.generated.FormType;
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
 * Information about a form to help with filling out metadata on entities.
 */
@Schema(description = "Information about a form to help with filling out metadata on entities.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormInfo  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "FormInfo") @Builder.Default
  private String __type = "FormInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"FormInfo"},
  defaultValue = "FormInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("description") @Builder.Default
  private String description = null;

  @JsonProperty("type") @Builder.Default
  private FormType type = null;

  @JsonProperty("prompts") @Builder.Default
  @Valid
  private List<FormPrompt> prompts = new ArrayList<>();

  @JsonProperty("actors") @Builder.Default
  private FormActorAssignment actors = null;

  public FormInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the form
   * @return name
   **/
  @Schema(required = true, description = "Display name of the form")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the form
   * @return description
   **/
  @Schema(description = "Description of the form")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FormInfo type(FormType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FormType getType() {
    return type;
  }

  public void setType(FormType type) {
    this.type = type;
  }

  public FormInfo prompts(List<FormPrompt> prompts) {
    this.prompts = prompts;
    return this;
  }

  public FormInfo addPromptsItem(FormPrompt promptsItem) {
    this.prompts.add(promptsItem);
    return this;
  }

  /**
   * List of prompts to present to the user to encourage filling out metadata
   * @return prompts
   **/
  @Schema(required = true, description = "List of prompts to present to the user to encourage filling out metadata")
      @NotNull
    @Valid
    public List<FormPrompt> getPrompts() {
    return prompts;
  }

  public void setPrompts(List<FormPrompt> prompts) {
    this.prompts = prompts;
  }

  public FormInfo actors(FormActorAssignment actors) {
    this.actors = actors;
    return this;
  }

  /**
   * Get actors
   * @return actors
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FormActorAssignment getActors() {
    return actors;
  }

  public void setActors(FormActorAssignment actors) {
    this.actors = actors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormInfo formInfo = (FormInfo) o;
    return Objects.equals(this.name, formInfo.name) &&
        Objects.equals(this.description, formInfo.description) &&
        Objects.equals(this.type, formInfo.type) &&
        Objects.equals(this.prompts, formInfo.prompts) &&
        Objects.equals(this.actors, formInfo.actors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, prompts, actors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
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