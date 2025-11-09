package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Response from creating a DataHub file
 */
public class CreateDataHubFileResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DataHubFile file;

    public CreateDataHubFileResponse() {
    }

    public CreateDataHubFileResponse(DataHubFile file) {
        this.file = file;
    }

    /**
     * The created DataHub file entity
     */
    public DataHubFile getFile() {
        return file;
    }
    /**
     * The created DataHub file entity
     */
    public void setFile(DataHubFile file) {
        this.file = file;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (file != null) {
            joiner.add("file: " + file);
        }
        return joiner.toString();
    }

    public static CreateDataHubFileResponse.Builder builder() {
        return new CreateDataHubFileResponse.Builder();
    }

    public static class Builder {

        private DataHubFile file;

        public Builder() {
        }

        /**
         * The created DataHub file entity
         */
        public Builder setFile(DataHubFile file) {
            this.file = file;
            return this;
        }


        public CreateDataHubFileResponse build() {
            return new CreateDataHubFileResponse(file);
        }

    }
}
