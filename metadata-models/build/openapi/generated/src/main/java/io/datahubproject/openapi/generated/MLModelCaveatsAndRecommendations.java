package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.CaveatDetails;
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
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 */
@Schema(description = "This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelCaveatsAndRecommendations  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelCaveatsAndRecommendations") @Builder.Default
  private String __type = "MLModelCaveatsAndRecommendations";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelCaveatsAndRecommendations"},
  defaultValue = "MLModelCaveatsAndRecommendations")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("caveats") @Builder.Default
  private CaveatDetails caveats = null;

  @JsonProperty("recommendations") @Builder.Default
  private String recommendations = null;

  @JsonProperty("idealDatasetCharacteristics") @Builder.Default
  @Valid
  private List<String> idealDatasetCharacteristics = null;

  public MLModelCaveatsAndRecommendations caveats(CaveatDetails caveats) {
    this.caveats = caveats;
    return this;
  }

  /**
   * Get caveats
   * @return caveats
   **/
  @Schema(description = "")
  
    @Valid
    public CaveatDetails getCaveats() {
    return caveats;
  }

  public void setCaveats(CaveatDetails caveats) {
    this.caveats = caveats;
  }

  public MLModelCaveatsAndRecommendations recommendations(String recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  /**
   * Recommendations on where this MLModel should be used.
   * @return recommendations
   **/
  @Schema(description = "Recommendations on where this MLModel should be used.")
  
    public String getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(String recommendations) {
    this.recommendations = recommendations;
  }

  public MLModelCaveatsAndRecommendations idealDatasetCharacteristics(List<String> idealDatasetCharacteristics) {
    this.idealDatasetCharacteristics = idealDatasetCharacteristics;
    return this;
  }

  public MLModelCaveatsAndRecommendations addIdealDatasetCharacteristicsItem(String idealDatasetCharacteristicsItem) {
    if (this.idealDatasetCharacteristics == null) {
      this.idealDatasetCharacteristics = new ArrayList<>();
    }
    this.idealDatasetCharacteristics.add(idealDatasetCharacteristicsItem);
    return this;
  }

  /**
   * Ideal characteristics of an evaluation dataset for this MLModel
   * @return idealDatasetCharacteristics
   **/
  @Schema(description = "Ideal characteristics of an evaluation dataset for this MLModel")
  
    public List<String> getIdealDatasetCharacteristics() {
    return idealDatasetCharacteristics;
  }

  public void setIdealDatasetCharacteristics(List<String> idealDatasetCharacteristics) {
    this.idealDatasetCharacteristics = idealDatasetCharacteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelCaveatsAndRecommendations mlModelCaveatsAndRecommendations = (MLModelCaveatsAndRecommendations) o;
    return Objects.equals(this.caveats, mlModelCaveatsAndRecommendations.caveats) &&
        Objects.equals(this.recommendations, mlModelCaveatsAndRecommendations.recommendations) &&
        Objects.equals(this.idealDatasetCharacteristics, mlModelCaveatsAndRecommendations.idealDatasetCharacteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caveats, recommendations, idealDatasetCharacteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelCaveatsAndRecommendations {\n");
    
    sb.append("    caveats: ").append(toIndentedString(caveats)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    idealDatasetCharacteristics: ").append(toIndentedString(idealDatasetCharacteristics)).append("\n");
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