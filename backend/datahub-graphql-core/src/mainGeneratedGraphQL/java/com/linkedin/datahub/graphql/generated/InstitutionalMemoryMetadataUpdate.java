package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An institutional memory to add to a Metadata Entity
TODO Add a USER or GROUP actor enum
 */
public class InstitutionalMemoryMetadataUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String url;
    private String description;
    @javax.annotation.Nonnull
    private String author;
    private Long createdAt;

    public InstitutionalMemoryMetadataUpdate() {
    }

    public InstitutionalMemoryMetadataUpdate(String url, String description, String author, Long createdAt) {
        this.url = url;
        this.description = description;
        this.author = author;
        this.createdAt = createdAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (url != null) {
            joiner.add("url: \"" + url + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (author != null) {
            joiner.add("author: \"" + author + "\"");
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + createdAt);
        }
        return joiner.toString();
    }

    public static InstitutionalMemoryMetadataUpdate.Builder builder() {
        return new InstitutionalMemoryMetadataUpdate.Builder();
    }

    public static class Builder {

        private String url;
        private String description;
        private String author;
        private Long createdAt;

        public Builder() {
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public InstitutionalMemoryMetadataUpdate build() {
            return new InstitutionalMemoryMetadataUpdate(url, description, author, createdAt);
        }

    }
}
