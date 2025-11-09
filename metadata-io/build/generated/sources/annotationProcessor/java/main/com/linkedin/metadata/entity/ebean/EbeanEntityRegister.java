package com.linkedin.metadata.entity.ebean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import io.ebean.typequery.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.EntityClassRegister;

@io.ebean.typequery.Generated("io.ebean.querybean.generator")
@ModuleInfo(entities={"com.linkedin.metadata.entity.ebean.EbeanAspectV1","com.linkedin.metadata.entity.ebean.EbeanAspectV1.PrimaryKey","com.linkedin.metadata.entity.ebean.EbeanAspectV2","com.linkedin.metadata.entity.ebean.EbeanAspectV2.PrimaryKey"})
public class EbeanEntityRegister implements EntityClassRegister {

  /**
   * Register AttributeConverter etc
   */
  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  /**
   * Entities with no @DbName
   */
  private List<Class<?>> defaultEntityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(com.linkedin.metadata.entity.ebean.EbeanAspectV1.class);
    entities.add(com.linkedin.metadata.entity.ebean.EbeanAspectV1.PrimaryKey.class);
    entities.add(com.linkedin.metadata.entity.ebean.EbeanAspectV2.class);
    entities.add(com.linkedin.metadata.entity.ebean.EbeanAspectV2.PrimaryKey.class);
    return entities;
  }

  private List<Class<?>> classesFor(String dbName) {
    return new ArrayList<>();
  }

  @Override
  public List<Class<?>> classesFor(String dbName, boolean defaultServer) {
    List<Class<?>> classes = classesFor(dbName);
    if (defaultServer) {
      classes.addAll(defaultEntityClasses());
    }
    return classes;
  }

}
