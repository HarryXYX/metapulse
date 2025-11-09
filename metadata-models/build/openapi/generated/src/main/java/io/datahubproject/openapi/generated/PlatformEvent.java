package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.GenericPayload;
import io.datahubproject.openapi.generated.PlatformEventHeader;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * A DataHub Platform Event.
 */
@Schema(description = "A DataHub Platform Event.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformEvent   {

  @JsonProperty("header") @Builder.Default
  private PlatformEventHeader header = null;

  @JsonProperty("name") @Builder.Default
  private String name = null;

  @JsonProperty("payload") @Builder.Default
  private GenericPayload payload = null;

  public PlatformEvent header(PlatformEventHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PlatformEventHeader getHeader() {
    return header;
  }

  public void setHeader(PlatformEventHeader header) {
    this.header = header;
  }

  public PlatformEvent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the event, e.g. the type of event. For example, 'notificationRequestEvent', 'entityChangeEvent'
   * @return name
   **/
  @Schema(required = true, description = "The name of the event, e.g. the type of event. For example, 'notificationRequestEvent', 'entityChangeEvent'")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlatformEvent payload(GenericPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public GenericPayload getPayload() {
    return payload;
  }

  public void setPayload(GenericPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformEvent platformEvent = (PlatformEvent) o;
    return Objects.equals(this.header, platformEvent.header) &&
        Objects.equals(this.name, platformEvent.name) &&
        Objects.equals(this.payload, platformEvent.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, name, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformEvent {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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