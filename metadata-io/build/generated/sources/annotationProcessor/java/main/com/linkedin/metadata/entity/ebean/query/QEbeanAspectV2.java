package com.linkedin.metadata.entity.ebean.query;

import com.linkedin.metadata.entity.ebean.query.QEbeanAspectV2$PrimaryKey;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;

/**
 * Query bean for EbeanAspectV2.
 * <p>
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@SuppressWarnings("unused")
@io.ebean.typequery.Generated("io.ebean.querybean.generator")
@io.ebean.typequery.TypeQueryBean("v1")
public final class QEbeanAspectV2 extends io.ebean.typequery.QueryBean<com.linkedin.metadata.entity.ebean.EbeanAspectV2,QEbeanAspectV2> {

  private static final QEbeanAspectV2 _alias = new QEbeanAspectV2(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QEbeanAspectV2 alias() {
    return _alias;
  }

  public QEbeanAspectV2$PrimaryKey.Assoc<QEbeanAspectV2> key;
  public PString<QEbeanAspectV2> urn;
  public PString<QEbeanAspectV2> aspect;
  public PLong<QEbeanAspectV2> version;
  public PString<QEbeanAspectV2> metadata;
  public PTimestamp<QEbeanAspectV2> createdOn;
  public PString<QEbeanAspectV2> createdBy;
  public PString<QEbeanAspectV2> createdFor;
  public PString<QEbeanAspectV2> systemMetadata;


  /**
   * Return a query bean used to build a FetchGroup.
   * <p>
   * FetchGroups are immutable and threadsafe and can be used by many
   * concurrent queries. We typically stored FetchGroup as a static final field.
   * <p>
   * Example creating and using a FetchGroup.
   * <pre>{@code
   * 
   * static final FetchGroup<Customer> fetchGroup = 
   *   QCustomer.forFetchGroup()
   *     .shippingAddress.fetch()
   *     .contacts.fetch()
   *     .buildFetchGroup();
   * 
   * List<Customer> customers = new QCustomer()
   *   .select(fetchGroup)
   *   .findList();
   * 
   * }</pre>
   */
  public static QEbeanAspectV2 forFetchGroup() {
    return new QEbeanAspectV2(io.ebean.FetchGroup.queryFor(com.linkedin.metadata.entity.ebean.EbeanAspectV2.class));
  }

  /** Construct using the default Database */
  public QEbeanAspectV2() {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV2.class);
  }

  /** @deprecated migrate to query.usingTransaction() */
  @Deprecated(forRemoval = true)
  public QEbeanAspectV2(io.ebean.Transaction transaction) {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV2.class, transaction);
  }

  /** Construct with a given Database */
  public QEbeanAspectV2(io.ebean.Database database) {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV2.class, database);
  }


  /** Private constructor for Alias */
  private QEbeanAspectV2(boolean dummy) {
    super(dummy);
  }

  /** Private constructor for FetchGroup building */
  private QEbeanAspectV2(io.ebean.Query<com.linkedin.metadata.entity.ebean.EbeanAspectV2> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /** Private constructor for filterMany */
  private QEbeanAspectV2(io.ebean.ExpressionList<com.linkedin.metadata.entity.ebean.EbeanAspectV2> filter) {
    super(filter);
  }

  /** Return a copy of the query bean. */
  @Override
  public QEbeanAspectV2 copy() {
    return new QEbeanAspectV2(query().copy());
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  public static final class Alias {
    public static QEbeanAspectV2$PrimaryKey.Assoc<QEbeanAspectV2> key = _alias.key;
    public static PString<QEbeanAspectV2> urn = _alias.urn;
    public static PString<QEbeanAspectV2> aspect = _alias.aspect;
    public static PLong<QEbeanAspectV2> version = _alias.version;
    public static PString<QEbeanAspectV2> metadata = _alias.metadata;
    public static PTimestamp<QEbeanAspectV2> createdOn = _alias.createdOn;
    public static PString<QEbeanAspectV2> createdBy = _alias.createdBy;
    public static PString<QEbeanAspectV2> createdFor = _alias.createdFor;
    public static PString<QEbeanAspectV2> systemMetadata = _alias.systemMetadata;
  }

  /** Association query bean */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  @io.ebean.typequery.TypeQueryBean("v1")
  public static final class Assoc<R> extends io.ebean.typequery.TQAssocBean<com.linkedin.metadata.entity.ebean.EbeanAspectV2,R,QEbeanAspectV2> {
    public QEbeanAspectV2$PrimaryKey.Assoc<R> key;
    public PString<R> urn;
    public PString<R> aspect;
    public PLong<R> version;
    public PString<R> metadata;
    public PTimestamp<R> createdOn;
    public PString<R> createdBy;
    public PString<R> createdFor;
    public PString<R> systemMetadata;

    public Assoc(String name, R root) {
      super(name, root);
    }

    public Assoc(String name, R root, String prefix) {
      super(name, root, prefix);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public R filterMany(java.util.function.Consumer<QEbeanAspectV2> apply) {
      final io.ebean.ExpressionList list = io.ebean.Expr.factory().expressionList();
      final var qb = new QEbeanAspectV2(list);
      apply.accept(qb);
      expr().filterMany(_name).addAll(list);
      return _root;
    }
  }
}
