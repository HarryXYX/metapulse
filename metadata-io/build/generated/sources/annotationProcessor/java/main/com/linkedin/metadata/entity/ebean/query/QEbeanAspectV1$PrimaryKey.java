package com.linkedin.metadata.entity.ebean.query;

import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;

/**
 * Query bean for EbeanAspectV1$PrimaryKey.
 * <p>
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@SuppressWarnings("unused")
@io.ebean.typequery.Generated("io.ebean.querybean.generator")
public final class QEbeanAspectV1$PrimaryKey {


  /** Association query bean */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  @io.ebean.typequery.TypeQueryBean("v1")
  public static final class Assoc<R> extends io.ebean.typequery.TQAssoc<com.linkedin.metadata.entity.ebean.EbeanAspectV1.PrimaryKey,R> {
    public PString<R> urn;
    public PString<R> aspect;
    public PLong<R> version;

    public Assoc(String name, R root) {
      super(name, root);
    }

    public Assoc(String name, R root, String prefix) {
      super(name, root, prefix);
    }
  }
}
