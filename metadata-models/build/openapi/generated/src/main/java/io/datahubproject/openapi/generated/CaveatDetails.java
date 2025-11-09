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
/**
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 */
@Schema(description = "This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaveatDetails   {

  @JsonProperty("needsFurtherTesting") @Builder.Default
  private Boolean needsFurtherTesting = null;

  @JsonProperty("caveatDescription") @Builder.Default
  private String caveatDescription = null;

  @JsonProperty("groupsNotRepresented") @Builder.Default
  @Valid
  private List<String> groupsNotRepresented = null;

  public CaveatDetails needsFurtherTesting(Boolean needsFurtherTesting) {
    this.needsFurtherTesting = needsFurtherTesting;
    return this;
  }

  /**
   * Did the results suggest any further testing?
   * @return needsFurtherTesting
   **/
  @Schema(description = "Did the results suggest any further testing?")
  
    public Boolean isNeedsFurtherTesting() {
    return needsFurtherTesting;
  }

  public void setNeedsFurtherTesting(Boolean needsFurtherTesting) {
    this.needsFurtherTesting = needsFurtherTesting;
  }

  public CaveatDetails caveatDescription(String caveatDescription) {
    this.caveatDescription = caveatDescription;
    return this;
  }

  /**
   * Caveat Description For ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.
   * @return caveatDescription
   **/
  @Schema(description = "Caveat Description For ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.")
  
    public String getCaveatDescription() {
    return caveatDescription;
  }

  public void setCaveatDescription(String caveatDescription) {
    this.caveatDescription = caveatDescription;
  }

  public CaveatDetails groupsNotRepresented(List<String> groupsNotRepresented) {
    this.groupsNotRepresented = groupsNotRepresented;
    return this;
  }

  public CaveatDetails addGroupsNotRepresentedItem(String groupsNotRepresentedItem) {
    if (this.groupsNotRepresented == null) {
      this.groupsNotRepresented = new ArrayList<>();
    }
    this.groupsNotRepresented.add(groupsNotRepresentedItem);
    return this;
  }

  /**
   * Relevant groups that were not represented in the evaluation dataset?
   * @return groupsNotRepresented
   **/
  @Schema(description = "Relevant groups that were not represented in the evaluation dataset?")
  
    public List<String> getGroupsNotRepresented() {
    return groupsNotRepresented;
  }

  public void setGroupsNotRepresented(List<String> groupsNotRepresented) {
    this.groupsNotRepresented = groupsNotRepresented;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaveatDetails caveatDetails = (CaveatDetails) o;
    return Objects.equals(this.needsFurtherTesting, caveatDetails.needsFurtherTesting) &&
        Objects.equals(this.caveatDescription, caveatDetails.caveatDescription) &&
        Objects.equals(this.groupsNotRepresented, caveatDetails.groupsNotRepresented);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needsFurtherTesting, caveatDescription, groupsNotRepresented);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaveatDetails {\n");
    
    sb.append("    needsFurtherTesting: ").append(toIndentedString(needsFurtherTesting)).append("\n");
    sb.append("    caveatDescription: ").append(toIndentedString(caveatDescription)).append("\n");
    sb.append("    groupsNotRepresented: ").append(toIndentedString(groupsNotRepresented)).append("\n");
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