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
 * This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.
 */
@Schema(description = "This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MLModelEthicalConsiderations  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "MLModelEthicalConsiderations") @Builder.Default
  private String __type = "MLModelEthicalConsiderations";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"MLModelEthicalConsiderations"},
  defaultValue = "MLModelEthicalConsiderations")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("data") @Builder.Default
  @Valid
  private List<String> data = null;

  @JsonProperty("humanLife") @Builder.Default
  @Valid
  private List<String> humanLife = null;

  @JsonProperty("mitigations") @Builder.Default
  @Valid
  private List<String> mitigations = null;

  @JsonProperty("risksAndHarms") @Builder.Default
  @Valid
  private List<String> risksAndHarms = null;

  @JsonProperty("useCases") @Builder.Default
  @Valid
  private List<String> useCases = null;

  public MLModelEthicalConsiderations data(List<String> data) {
    this.data = data;
    return this;
  }

  public MLModelEthicalConsiderations addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Does the MLModel use any sensitive data (e.g., protected classes)?
   * @return data
   **/
  @Schema(description = "Does the MLModel use any sensitive data (e.g., protected classes)?")
  
    public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  public MLModelEthicalConsiderations humanLife(List<String> humanLife) {
    this.humanLife = humanLife;
    return this;
  }

  public MLModelEthicalConsiderations addHumanLifeItem(String humanLifeItem) {
    if (this.humanLife == null) {
      this.humanLife = new ArrayList<>();
    }
    this.humanLife.add(humanLifeItem);
    return this;
  }

  /**
   *  Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?
   * @return humanLife
   **/
  @Schema(description = " Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?")
  
    public List<String> getHumanLife() {
    return humanLife;
  }

  public void setHumanLife(List<String> humanLife) {
    this.humanLife = humanLife;
  }

  public MLModelEthicalConsiderations mitigations(List<String> mitigations) {
    this.mitigations = mitigations;
    return this;
  }

  public MLModelEthicalConsiderations addMitigationsItem(String mitigationsItem) {
    if (this.mitigations == null) {
      this.mitigations = new ArrayList<>();
    }
    this.mitigations.add(mitigationsItem);
    return this;
  }

  /**
   * What risk mitigation strategies were used during MLModel development?
   * @return mitigations
   **/
  @Schema(description = "What risk mitigation strategies were used during MLModel development?")
  
    public List<String> getMitigations() {
    return mitigations;
  }

  public void setMitigations(List<String> mitigations) {
    this.mitigations = mitigations;
  }

  public MLModelEthicalConsiderations risksAndHarms(List<String> risksAndHarms) {
    this.risksAndHarms = risksAndHarms;
    return this;
  }

  public MLModelEthicalConsiderations addRisksAndHarmsItem(String risksAndHarmsItem) {
    if (this.risksAndHarms == null) {
      this.risksAndHarms = new ArrayList<>();
    }
    this.risksAndHarms.add(risksAndHarmsItem);
    return this;
  }

  /**
   * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
   * @return risksAndHarms
   **/
  @Schema(description = "What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.")
  
    public List<String> getRisksAndHarms() {
    return risksAndHarms;
  }

  public void setRisksAndHarms(List<String> risksAndHarms) {
    this.risksAndHarms = risksAndHarms;
  }

  public MLModelEthicalConsiderations useCases(List<String> useCases) {
    this.useCases = useCases;
    return this;
  }

  public MLModelEthicalConsiderations addUseCasesItem(String useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

  /**
   * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
   * @return useCases
   **/
  @Schema(description = "Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section")
  
    public List<String> getUseCases() {
    return useCases;
  }

  public void setUseCases(List<String> useCases) {
    this.useCases = useCases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MLModelEthicalConsiderations mlModelEthicalConsiderations = (MLModelEthicalConsiderations) o;
    return Objects.equals(this.data, mlModelEthicalConsiderations.data) &&
        Objects.equals(this.humanLife, mlModelEthicalConsiderations.humanLife) &&
        Objects.equals(this.mitigations, mlModelEthicalConsiderations.mitigations) &&
        Objects.equals(this.risksAndHarms, mlModelEthicalConsiderations.risksAndHarms) &&
        Objects.equals(this.useCases, mlModelEthicalConsiderations.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, humanLife, mitigations, risksAndHarms, useCases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelEthicalConsiderations {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    humanLife: ").append(toIndentedString(humanLife)).append("\n");
    sb.append("    mitigations: ").append(toIndentedString(mitigations)).append("\n");
    sb.append("    risksAndHarms: ").append(toIndentedString(risksAndHarms)).append("\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
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