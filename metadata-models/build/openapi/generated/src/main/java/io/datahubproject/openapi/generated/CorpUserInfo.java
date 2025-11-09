package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
 * Linkedin corp user information
 */
@Schema(description = "Linkedin corp user information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorpUserInfo  implements OneOfCorpUserSnapshotAspectsItems, OneOfEnvelopedAspectValue, OneOfGenericAspectValue, OneOfVersionedAspectAspect {

  @Getter(value = lombok.AccessLevel.NONE)
  @JsonProperty(value = "__type", defaultValue = "CorpUserInfo") @Builder.Default
  private String __type = "CorpUserInfo";

  /**
   * Name of this subclass in SimpleClassName format
   * @return __type
   **/
  @Schema(required = true, description = "Name of this subclass in SimpleClassName format", allowableValues = {"CorpUserInfo"},
  defaultValue = "CorpUserInfo")
  @NotNull
  public String get__type() {
    return __type;
  }

  @JsonProperty("customProperties") @Builder.Default
  @Valid
  private Map<String, String> customProperties = new HashMap<>();

  @JsonProperty("active") @Builder.Default
  private Boolean active = null;

  @JsonProperty("displayName") @Builder.Default
  private String displayName = null;

  @JsonProperty("email") @Builder.Default
  private String email = null;

  @JsonProperty("title") @Builder.Default
  private String title = null;

  @JsonProperty("managerUrn") @Builder.Default
  private String managerUrn = null;

  @JsonProperty("departmentId") @Builder.Default
  private Long departmentId = null;

  @JsonProperty("departmentName") @Builder.Default
  private String departmentName = null;

  @JsonProperty("firstName") @Builder.Default
  private String firstName = null;

  @JsonProperty("lastName") @Builder.Default
  private String lastName = null;

  @JsonProperty("fullName") @Builder.Default
  private String fullName = null;

  @JsonProperty("countryCode") @Builder.Default
  private String countryCode = null;

  @JsonProperty("system") @Builder.Default
  private Boolean system = false;

  public CorpUserInfo customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public CorpUserInfo putCustomPropertiesItem(String key, String customPropertiesItem) {
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Custom property bag.
   * @return customProperties
   **/
  @Schema(required = true, description = "Custom property bag.")
      @NotNull

    public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public CorpUserInfo active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools
   * @return active
   **/
  @Schema(required = true, description = "Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools")
      @NotNull

    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CorpUserInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * displayName of this user ,  e.g.  Hang Zhang(DataHQ)
   * @return displayName
   **/
  @Schema(description = "displayName of this user ,  e.g.  Hang Zhang(DataHQ)")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CorpUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email address of this user
   * @return email
   **/
  @Schema(description = "email address of this user")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CorpUserInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of this user
   * @return title
   **/
  @Schema(description = "title of this user")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CorpUserInfo managerUrn(String managerUrn) {
    this.managerUrn = managerUrn;
    return this;
  }

  /**
   * direct manager of this user
   * @return managerUrn
   **/
  @Schema(description = "direct manager of this user")
  
    public String getManagerUrn() {
    return managerUrn;
  }

  public void setManagerUrn(String managerUrn) {
    this.managerUrn = managerUrn;
  }

  public CorpUserInfo departmentId(Long departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * department id this user belong to
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return departmentId
   **/
  @Schema(description = "department id this user belong to")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public CorpUserInfo departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * department name this user belong to
   * @return departmentName
   **/
  @Schema(description = "department name this user belong to")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public CorpUserInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name of this user
   * @return firstName
   **/
  @Schema(description = "first name of this user")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CorpUserInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name of this user
   * @return lastName
   **/
  @Schema(description = "last name of this user")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CorpUserInfo fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Common name of this user, format is firstName + lastName (split by a whitespace)
   * @return fullName
   **/
  @Schema(description = "Common name of this user, format is firstName + lastName (split by a whitespace)")
  
    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CorpUserInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * two uppercase letters country code. e.g.  US
   * @return countryCode
   **/
  @Schema(description = "two uppercase letters country code. e.g.  US")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CorpUserInfo system(Boolean system) {
    this.system = system;
    return this;
  }

  /**
   * Whether the corpUser is a system user.
   * @return system
   **/
  @Schema(required = true, description = "Whether the corpUser is a system user.")
      @NotNull

    public Boolean isSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorpUserInfo corpUserInfo = (CorpUserInfo) o;
    return Objects.equals(this.customProperties, corpUserInfo.customProperties) &&
        Objects.equals(this.active, corpUserInfo.active) &&
        Objects.equals(this.displayName, corpUserInfo.displayName) &&
        Objects.equals(this.email, corpUserInfo.email) &&
        Objects.equals(this.title, corpUserInfo.title) &&
        Objects.equals(this.managerUrn, corpUserInfo.managerUrn) &&
        Objects.equals(this.departmentId, corpUserInfo.departmentId) &&
        Objects.equals(this.departmentName, corpUserInfo.departmentName) &&
        Objects.equals(this.firstName, corpUserInfo.firstName) &&
        Objects.equals(this.lastName, corpUserInfo.lastName) &&
        Objects.equals(this.fullName, corpUserInfo.fullName) &&
        Objects.equals(this.countryCode, corpUserInfo.countryCode) &&
        Objects.equals(this.system, corpUserInfo.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, active, displayName, email, title, managerUrn, departmentId, departmentName, firstName, lastName, fullName, countryCode, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpUserInfo {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    managerUrn: ").append(toIndentedString(managerUrn)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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