package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An action associated with an assertion
 */
public class AssertionAction implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionActionType type;

    public AssertionAction() {
    }

    public AssertionAction(AssertionActionType type) {
        this.type = type;
    }

    /**
     * The type of the actions
     */
    public AssertionActionType getType() {
        return type;
    }
    /**
     * The type of the actions
     */
    public void setType(AssertionActionType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static AssertionAction.Builder builder() {
        return new AssertionAction.Builder();
    }

    public static class Builder {

        private AssertionActionType type;

        public Builder() {
        }

        /**
         * The type of the actions
         */
        public Builder setType(AssertionActionType type) {
            this.type = type;
            return this;
        }


        public AssertionAction build() {
            return new AssertionAction(type);
        }

    }
}
