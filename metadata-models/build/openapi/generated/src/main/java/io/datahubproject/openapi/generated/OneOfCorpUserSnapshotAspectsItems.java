package io.datahubproject.openapi.generated;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfCorpUserSnapshotAspectsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = CorpUserKey.class, name = "CorpUserKey"),
  @JsonSubTypes.Type(value = CorpUserInfo.class, name = "CorpUserInfo"),
  @JsonSubTypes.Type(value = CorpUserEditableInfo.class, name = "CorpUserEditableInfo"),
  @JsonSubTypes.Type(value = CorpUserStatus.class, name = "CorpUserStatus"),
  @JsonSubTypes.Type(value = GroupMembership.class, name = "GroupMembership"),
  @JsonSubTypes.Type(value = GlobalTags.class, name = "GlobalTags"),
  @JsonSubTypes.Type(value = Status.class, name = "Status")
})
public interface OneOfCorpUserSnapshotAspectsItems {
}