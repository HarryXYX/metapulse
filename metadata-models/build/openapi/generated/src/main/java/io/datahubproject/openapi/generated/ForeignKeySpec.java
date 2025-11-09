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
 * Description of a foreign key in a schema.
 */
@Schema(description = "Description of a foreign key in a schema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForeignKeySpec   {

  @JsonProperty("foreignKey") @Builder.Default
  private OneOfForeignKeySpecForeignKey foreignKey = null;

  public ForeignKeySpec foreignKey(OneOfForeignKeySpecForeignKey foreignKey) {
    this.foreignKey = foreignKey;
    return this;
  }

  /**
   * Foreign key definition in metadata schema.
   * @return foreignKey
   **/
  @Schema(required = true, description = "Foreign key definition in metadata schema.")
      @NotNull

    public OneOfForeignKeySpecForeignKey getForeignKey() {
    return foreignKey;
  }

  public void setForeignKey(OneOfForeignKeySpecForeignKey foreignKey) {
    this.foreignKey = foreignKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForeignKeySpec foreignKeySpec = (ForeignKeySpec) o;
    return Objects.equals(this.foreignKey, foreignKeySpec.foreignKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForeignKeySpec {\n");
    
    sb.append("    foreignKey: ").append(toIndentedString(foreignKey)).append("\n");
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