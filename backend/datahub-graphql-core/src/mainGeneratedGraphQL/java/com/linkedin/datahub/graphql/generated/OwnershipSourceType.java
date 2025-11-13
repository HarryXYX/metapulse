package com.linkedin.datahub.graphql.generated;

/**
 * The origin of Ownership metadata associated with a Metadata Entity
 */
public enum OwnershipSourceType {

    /**
     * Auditing system or audit logs
     */
    AUDIT("AUDIT"),
    /**
     * Database, eg GRANTS table
     */
    DATABASE("DATABASE"),
    /**
     * File system, eg file or directory owner
     */
    FILE_SYSTEM("FILE_SYSTEM"),
    /**
     * Issue tracking system, eg Jira
     */
    ISSUE_TRACKING_SYSTEM("ISSUE_TRACKING_SYSTEM"),
    /**
     * Manually provided by a user
     */
    MANUAL("MANUAL"),
    /**
     * Other ownership like service, eg Nuage, ACL service etc
     */
    SERVICE("SERVICE"),
    /**
     * SCM system, eg GIT, SVN
     */
    SOURCE_CONTROL("SOURCE_CONTROL"),
    /**
     * Other sources
     */
    OTHER("OTHER");

    private final String graphqlName;

    private OwnershipSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
