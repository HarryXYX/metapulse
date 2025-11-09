package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.AuditStamp;
import io.datahubproject.openapi.generated.GlossaryTermAssociation;
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
 * Related business terms information
 */
@Schema(description = "Related business terms information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlossaryTerms  implements OneOfChartSnapshotAspectsItems, OneOfDashboardSnapshotAspectsItems, OneOfDataFlowSnapshotAspectsItems, OneOfDataJobSnapshotAspectsItems, OneOfDatasetSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "GlossaryTerms") @Builder.Default
  private String __type = "GlossaryTerms";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"GlossaryTerms"},
  defaultValue = "GlossaryTerms")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("terms") @Builder.Default
  @Valid
  private List<GlossaryTermAssociation> terms = new ArrayList<>();

  @JsonProperty("auditStamp") @Builder.Default
  private AuditStamp auditStamp = null;

  public GlossaryTerms terms(List<GlossaryTermAssociation> terms) {
    this.terms = terms;
    return this;
  }

  public GlossaryTerms addTermsItem(GlossaryTermAssociation termsItem) {
    this.terms.add(termsItem);
    return this;
  }

  /**
   * The related business terms
   * @return terms
   **/
  @Schema(required = true, description = "The related business terms")
      @NotNull
    @Valid
    public List<GlossaryTermAssociation> getTerms() {
    return terms;
  }

  public void setTerms(List<GlossaryTermAssociation> terms) {
    this.terms = terms;
  }

  public GlossaryTerms auditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
    return this;
  }

  /**
   * Get auditStamp
   * @return auditStamp
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AuditStamp getAuditStamp() {
    return auditStamp;
  }

  public void setAuditStamp(AuditStamp auditStamp) {
    this.auditStamp = auditStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryTerms glossaryTerms = (GlossaryTerms) o;
    return Objects.equals(this.terms, glossaryTerms.terms) &&
        Objects.equals(this.auditStamp, glossaryTerms.auditStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, auditStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTerms {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    auditStamp: ").append(toIndentedString(auditStamp)).append("\n");
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