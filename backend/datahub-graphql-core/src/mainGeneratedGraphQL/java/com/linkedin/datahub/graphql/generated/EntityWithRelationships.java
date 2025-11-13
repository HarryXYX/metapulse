package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use relationships field instead
 */
public interface EntityWithRelationships extends Entity{

    /**
     * A primary key associated with the Metadata Entity
     */
    @javax.annotation.Nonnull
    String getUrn();

    /**
     * A standard Entity Type
     */
    @javax.annotation.Nonnull
    EntityType getType();

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult getRelationships();

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult getLineage();

}
