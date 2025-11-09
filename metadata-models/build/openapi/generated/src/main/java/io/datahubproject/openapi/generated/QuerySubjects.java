package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.QuerySubject;
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
 * Information about the subjects of a particular Query, i.e. the assets being queried.
 */
@Schema(description = "Information about the subjects of a particular Query, i.e. the assets being queried.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySubjects  implements OneOfEnvelopedAspectValue, OneOfGenericAspectValue {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "QuerySubjects") @Builder.Default
  private String __type = "QuerySubjects";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"QuerySubjects"},
  defaultValue = "QuerySubjects")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("subjects") @Builder.Default
  @Valid
  private List<QuerySubject> subjects = new ArrayList<>();

  public QuerySubjects subjects(List<QuerySubject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public QuerySubjects addSubjectsItem(QuerySubject subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * One or more subjects of the query.  In single-asset queries (e.g. table select), this will contain the Table reference and optionally schema field references.  In multi-asset queries (e.g. table joins), this may contain multiple Table references and optionally schema field references.
   * @return subjects
   **/
  @Schema(required = true, description = "One or more subjects of the query.  In single-asset queries (e.g. table select), this will contain the Table reference and optionally schema field references.  In multi-asset queries (e.g. table joins), this may contain multiple Table references and optionally schema field references.")
      @NotNull
    @Valid
    public List<QuerySubject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<QuerySubject> subjects) {
    this.subjects = subjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySubjects querySubjects = (QuerySubjects) o;
    return Objects.equals(this.subjects, querySubjects.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySubjects {\n");
    
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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