package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for retrieving the plaintext values of a set of secrets
 */
public class GetSecretValuesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> secrets;

    public GetSecretValuesInput() {
    }

    public GetSecretValuesInput(java.util.List<String> secrets) {
        this.secrets = secrets;
    }

    public java.util.List<String> getSecrets() {
        return secrets;
    }
    public void setSecrets(java.util.List<String> secrets) {
        this.secrets = secrets;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (secrets != null) {
            joiner.add("secrets: " + secrets);
        }
        return joiner.toString();
    }

    public static GetSecretValuesInput.Builder builder() {
        return new GetSecretValuesInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> secrets;

        public Builder() {
        }

        public Builder setSecrets(java.util.List<String> secrets) {
            this.secrets = secrets;
            return this;
        }


        public GetSecretValuesInput build() {
            return new GetSecretValuesInput(secrets);
        }

    }
}
