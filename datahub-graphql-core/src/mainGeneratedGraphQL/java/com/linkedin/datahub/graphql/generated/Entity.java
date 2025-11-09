package com.linkedin.datahub.graphql.generated;


/**
 * A top level Metadata Entity
 */
public interface Entity {

    /**
     * A primary key of the Metadata Entity
     */
    @javax.annotation.Nonnull
    String getUrn();

    /**
     * A standard Entity Type
     */
    @javax.annotation.Nonnull
    EntityType getType();

    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    EntityRelationshipsResult getRelationships();

}
