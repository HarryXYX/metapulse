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
 * Records a single user&#x27;s usage counts for a given resource
 */
@Schema(description = "Records a single user's usage counts for a given resource")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetUserUsageCounts   {

  @JsonProperty("user") @Builder.Default
  private String user = null;

  @JsonProperty("count") @Builder.Default
  private Integer count = null;

  @JsonProperty("userEmail") @Builder.Default
  private String userEmail = null;

  public DatasetUserUsageCounts user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The unique id of the user.
   * @return user
   **/
  @Schema(required = true, description = "The unique id of the user.")
      @NotNull

    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DatasetUserUsageCounts count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of times the dataset has been used by the user.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return count
   **/
  @Schema(required = true, description = "Number of times the dataset has been used by the user.")
      @NotNull

  @Min(-2147483648) @Max(2147483647)   public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DatasetUserUsageCounts userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * If user_email is set, we attempt to resolve the user's urn upon ingest
   * @return userEmail
   **/
  @Schema(description = "If user_email is set, we attempt to resolve the user's urn upon ingest")
  
    public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetUserUsageCounts datasetUserUsageCounts = (DatasetUserUsageCounts) o;
    return Objects.equals(this.user, datasetUserUsageCounts.user) &&
        Objects.equals(this.count, datasetUserUsageCounts.count) &&
        Objects.equals(this.userEmail, datasetUserUsageCounts.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, count, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetUserUsageCounts {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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