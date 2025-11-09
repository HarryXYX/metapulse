package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SerializedValueSchemaType
 */
public enum SerializedValueSchemaType {
  AVRO("AVRO"),
    PROTOBUF("PROTOBUF"),
    PEGASUS("PEGASUS"),
    THRIFT("THRIFT"),
    JSON("JSON"),
    NONE("NONE");

  private String value;

  SerializedValueSchemaType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SerializedValueSchemaType fromValue(String text) {
    for (SerializedValueSchemaType b : SerializedValueSchemaType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
