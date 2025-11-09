package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for different entity profiles
 */
public class EntityProfilesConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EntityProfileConfig domain;

    public EntityProfilesConfig() {
    }

    public EntityProfilesConfig(EntityProfileConfig domain) {
        this.domain = domain;
    }

    /**
     * The configurations for a Domain entity profile
     */
    public EntityProfileConfig getDomain() {
        return domain;
    }
    /**
     * The configurations for a Domain entity profile
     */
    public void setDomain(EntityProfileConfig domain) {
        this.domain = domain;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        return joiner.toString();
    }

    public static EntityProfilesConfig.Builder builder() {
        return new EntityProfilesConfig.Builder();
    }

    public static class Builder {

        private EntityProfileConfig domain;

        public Builder() {
        }

        /**
         * The configurations for a Domain entity profile
         */
        public Builder setDomain(EntityProfileConfig domain) {
            this.domain = domain;
            return this;
        }


        public EntityProfilesConfig build() {
            return new EntityProfilesConfig(domain);
        }

    }
}
