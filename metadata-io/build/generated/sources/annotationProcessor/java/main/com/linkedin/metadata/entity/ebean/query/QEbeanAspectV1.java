package com.linkedin.metadata.entity.ebean.query;

import com.linkedin.metadata.entity.ebean.query.QEbeanAspectV1$PrimaryKey;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;

/**
 * Query bean for EbeanAspectV1.
 * <p>
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@SuppressWarnings("unused")
@io.ebean.typequery.Generated("io.ebean.querybean.generator")
@io.ebean.typequery.TypeQueryBean("v1")
public final class QEbeanAspectV1 extends io.ebean.typequery.QueryBean<com.linkedin.metadata.entity.ebean.EbeanAspectV1,QEbeanAspectV1> {

  private static final QEbeanAspectV1 _alias = new QEbeanAspectV1(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QEbeanAspectV1 alias() {
    return _alias;
  }

  public QEbeanAspectV1$PrimaryKey.Assoc<QEbeanAspectV1> key;
  public PString<QEbeanAspectV1> metadata;
  public PTimestamp<QEbeanAspectV1> createdOn;
  public PString<QEbeanAspectV1> createdBy;
  public PString<QEbeanAspectV1> createdFor;


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
  public static QEbeanAspectV1 forFetchGroup() {
    return new QEbeanAspectV1(io.ebean.FetchGroup.queryFor(com.linkedin.metadata.entity.ebean.EbeanAspectV1.class));
  }

  /** Construct using the default Database */
  public QEbeanAspectV1() {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV1.class);
  }

  /** @deprecated migrate to query.usingTransaction() */
  @Deprecated(forRemoval = true)
  public QEbeanAspectV1(io.ebean.Transaction transaction) {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV1.class, transaction);
  }

  /** Construct with a given Database */
  public QEbeanAspectV1(io.ebean.Database database) {
    super(com.linkedin.metadata.entity.ebean.EbeanAspectV1.class, database);
  }


  /** Private constructor for Alias */
  private QEbeanAspectV1(boolean dummy) {
    super(dummy);
  }

  /** Private constructor for FetchGroup building */
  private QEbeanAspectV1(io.ebean.Query<com.linkedin.metadata.entity.ebean.EbeanAspectV1> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /** Private constructor for filterMany */
  private QEbeanAspectV1(io.ebean.ExpressionList<com.linkedin.metadata.entity.ebean.EbeanAspectV1> filter) {
    super(filter);
  }

  /** Return a copy of the query bean. */
  @Override
  public QEbeanAspectV1 copy() {
    return new QEbeanAspectV1(query().copy());
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  public static final class Alias {
    public static QEbeanAspectV1$PrimaryKey.Assoc<QEbeanAspectV1> key = _alias.key;
    public static PString<QEbeanAspectV1> metadata = _alias.metadata;
    public static PTimestamp<QEbeanAspectV1> createdOn = _alias.createdOn;
    public static PString<QEbeanAspectV1> createdBy = _alias.createdBy;
    public static PString<QEbeanAspectV1> createdFor = _alias.createdFor;
  }

  /** Association query bean */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  @io.ebean.typequery.TypeQueryBean("v1")
  public static final class Assoc<R> extends io.ebean.typequery.TQAssocBean<com.linkedin.metadata.entity.ebean.EbeanAspectV1,R,QEbeanAspectV1> {
    public QEbeanAspectV1$PrimaryKey.Assoc<R> key;
    public PString<R> metadata;
    public PTimestamp<R> createdOn;
    public PString<R> createdBy;
    public PString<R> createdFor;

    public Assoc(String name, R root) {
      super(name, root);
    }

    public Assoc(String name, R root, String prefix) {
      super(name, root, prefix);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public R filterMany(java.util.function.Consumer<QEbeanAspectV1> apply) {
      final io.ebean.ExpressionList list = io.ebean.Expr.factory().expressionList();
      final var qb = new QEbeanAspectV1(list);
      apply.accept(qb);
      expr().filterMany(_name).addAll(list);
      return _root;
    }
  }
}
