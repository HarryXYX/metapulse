package com.linkedin.datahub.graphql.generated;


public interface HasLogicalParent {

    /**
     * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
     */
    Entity getLogicalParent();

}
