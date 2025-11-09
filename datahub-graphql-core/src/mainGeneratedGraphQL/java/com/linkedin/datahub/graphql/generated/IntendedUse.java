package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class IntendedUse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> primaryUses;
    private java.util.List<IntendedUserType> primaryUsers;
    private java.util.List<String> outOfScopeUses;

    public IntendedUse() {
    }

    public IntendedUse(java.util.List<String> primaryUses, java.util.List<IntendedUserType> primaryUsers, java.util.List<String> outOfScopeUses) {
        this.primaryUses = primaryUses;
        this.primaryUsers = primaryUsers;
        this.outOfScopeUses = outOfScopeUses;
    }

    /**
     * Primary Use cases for the model
     */
    public java.util.List<String> getPrimaryUses() {
        return primaryUses;
    }
    /**
     * Primary Use cases for the model
     */
    public void setPrimaryUses(java.util.List<String> primaryUses) {
        this.primaryUses = primaryUses;
    }

    /**
     * Primary Intended Users
     */
    public java.util.List<IntendedUserType> getPrimaryUsers() {
        return primaryUsers;
    }
    /**
     * Primary Intended Users
     */
    public void setPrimaryUsers(java.util.List<IntendedUserType> primaryUsers) {
        this.primaryUsers = primaryUsers;
    }

    /**
     * Out of scope uses of the MLModel
     */
    public java.util.List<String> getOutOfScopeUses() {
        return outOfScopeUses;
    }
    /**
     * Out of scope uses of the MLModel
     */
    public void setOutOfScopeUses(java.util.List<String> outOfScopeUses) {
        this.outOfScopeUses = outOfScopeUses;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (primaryUses != null) {
            joiner.add("primaryUses: " + primaryUses);
        }
        if (primaryUsers != null) {
            joiner.add("primaryUsers: " + primaryUsers);
        }
        if (outOfScopeUses != null) {
            joiner.add("outOfScopeUses: " + outOfScopeUses);
        }
        return joiner.toString();
    }

    public static IntendedUse.Builder builder() {
        return new IntendedUse.Builder();
    }

    public static class Builder {

        private java.util.List<String> primaryUses;
        private java.util.List<IntendedUserType> primaryUsers;
        private java.util.List<String> outOfScopeUses;

        public Builder() {
        }

        /**
         * Primary Use cases for the model
         */
        public Builder setPrimaryUses(java.util.List<String> primaryUses) {
            this.primaryUses = primaryUses;
            return this;
        }

        /**
         * Primary Intended Users
         */
        public Builder setPrimaryUsers(java.util.List<IntendedUserType> primaryUsers) {
            this.primaryUsers = primaryUsers;
            return this;
        }

        /**
         * Out of scope uses of the MLModel
         */
        public Builder setOutOfScopeUses(java.util.List<String> outOfScopeUses) {
            this.outOfScopeUses = outOfScopeUses;
            return this;
        }


        public IntendedUse build() {
            return new IntendedUse(primaryUses, primaryUsers, outOfScopeUses);
        }

    }
}
