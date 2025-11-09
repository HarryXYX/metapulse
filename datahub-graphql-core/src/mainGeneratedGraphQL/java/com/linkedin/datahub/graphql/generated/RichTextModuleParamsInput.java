package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the params required if the module is type RICH_TEXT
 */
public class RichTextModuleParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String content;

    public RichTextModuleParamsInput() {
    }

    public RichTextModuleParamsInput(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (content != null) {
            joiner.add("content: \"" + content + "\"");
        }
        return joiner.toString();
    }

    public static RichTextModuleParamsInput.Builder builder() {
        return new RichTextModuleParamsInput.Builder();
    }

    public static class Builder {

        private String content;

        public Builder() {
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }


        public RichTextModuleParamsInput build() {
            return new RichTextModuleParamsInput(content);
        }

    }
}
