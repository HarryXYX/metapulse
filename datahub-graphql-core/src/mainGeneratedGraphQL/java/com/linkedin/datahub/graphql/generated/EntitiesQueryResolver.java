package com.linkedin.datahub.graphql.generated;


/**
 * Gets entities based on their urns
checkForExistence will do n+1 sql calls to check for existence of each entity requested if set to true
 */
public interface EntitiesQueryResolver {

    /**
     * Gets entities based on their urns
checkForExistence will do n+1 sql calls to check for existence of each entity requested if set to true
     */
    java.util.List<Entity> entities(@javax.annotation.Nonnull java.util.List<String> urns, Boolean checkForExistence) throws Exception;

}
