package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to upsert a new DataHub connection.
 */
public class UpsertDataHubConnectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private DataHubConnectionDetailsType type;
    @javax.annotation.Nonnull
    private String platformUrn;
    private DataHubJsonConnectionInput json;
    private String name;

    public UpsertDataHubConnectionInput() {
    }

    public UpsertDataHubConnectionInput(String id, DataHubConnectionDetailsType type, String platformUrn, DataHubJsonConnectionInput json, String name) {
        this.id = id;
        this.type = type;
        this.platformUrn = platformUrn;
        this.json = json;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DataHubConnectionDetailsType getType() {
        return type;
    }
    public void setType(DataHubConnectionDetailsType type) {
        this.type = type;
    }

    public String getPlatformUrn() {
        return platformUrn;
    }
    public void setPlatformUrn(String platformUrn) {
        this.platformUrn = platformUrn;
    }

    public DataHubJsonConnectionInput getJson() {
        return json;
    }
    public void setJson(DataHubJsonConnectionInput json) {
        this.json = json;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (platformUrn != null) {
            joiner.add("platformUrn: \"" + platformUrn + "\"");
        }
        if (json != null) {
            joiner.add("json: " + json);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        return joiner.toString();
    }

    public static UpsertDataHubConnectionInput.Builder builder() {
        return new UpsertDataHubConnectionInput.Builder();
    }

    public static class Builder {

        private String id;
        private DataHubConnectionDetailsType type;
        private String platformUrn;
        private DataHubJsonConnectionInput json;
        private String name;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(DataHubConnectionDetailsType type) {
            this.type = type;
            return this;
        }

        public Builder setPlatformUrn(String platformUrn) {
            this.platformUrn = platformUrn;
            return this;
        }

        public Builder setJson(DataHubJsonConnectionInput json) {
            this.json = json;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public UpsertDataHubConnectionInput build() {
            return new UpsertDataHubConnectionInput(id, type, platformUrn, json, name);
        }

    }
}
