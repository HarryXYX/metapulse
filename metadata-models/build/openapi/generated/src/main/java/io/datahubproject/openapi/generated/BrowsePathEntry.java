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
 * Represents a single level in an entity&#x27;s browsePathV2
 */
@Schema(description = "Represents a single level in an entity's browsePathV2")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrowsePathEntry   {

  @JsonProperty("id") @Builder.Default
  private String id = null;

  @JsonProperty("urn") @Builder.Default
  private String urn = null;

  public BrowsePathEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the browse path entry. This is what gets stored in the index. If there's an urn associated with this entry, id and urn will be the same
   * @return id
   **/
  @Schema(required = true, description = "The ID of the browse path entry. This is what gets stored in the index. If there's an urn associated with this entry, id and urn will be the same")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BrowsePathEntry urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Optional urn pointing to some entity in DataHub
   * @return urn
   **/
  @Schema(description = "Optional urn pointing to some entity in DataHub")
  
    public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowsePathEntry browsePathEntry = (BrowsePathEntry) o;
    return Objects.equals(this.id, browsePathEntry.id) &&
        Objects.equals(this.urn, browsePathEntry.urn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, urn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowsePathEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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