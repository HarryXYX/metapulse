package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class Highlight implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int value;
    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private String body;

    public Highlight() {
    }

    public Highlight(int value, String title, String body) {
        this.value = value;
        this.title = title;
        this.body = body;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("value: " + value);
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (body != null) {
            joiner.add("body: \"" + body + "\"");
        }
        return joiner.toString();
    }

    public static Highlight.Builder builder() {
        return new Highlight.Builder();
    }

    public static class Builder {

        private int value;
        private String title;
        private String body;

        public Builder() {
        }

        public Builder setValue(int value) {
            this.value = value;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }


        public Highlight build() {
            return new Highlight(value, title, body);
        }

    }
}
