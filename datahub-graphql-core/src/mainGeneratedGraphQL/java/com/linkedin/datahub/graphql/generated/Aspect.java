package com.linkedin.datahub.graphql.generated;


/**
 * A versioned aspect, or single group of related metadata, associated with an Entity and having a unique version
 */
public interface Aspect {

    /**
     * The version of the aspect, where zero represents the latest version
     */
    Long getVersion();

}
