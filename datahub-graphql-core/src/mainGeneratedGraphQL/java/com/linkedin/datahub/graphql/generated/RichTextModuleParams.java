package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The params required if the module is type RICH_TEXT
 */
public class RichTextModuleParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String content;

    public RichTextModuleParams() {
    }

    public RichTextModuleParams(String content) {
        this.content = content;
    }

    /**
     * The content of the rich text module
     */
    public String getContent() {
        return content;
    }
    /**
     * The content of the rich text module
     */
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

    public static RichTextModuleParams.Builder builder() {
        return new RichTextModuleParams.Builder();
    }

    public static class Builder {

        private String content;

        public Builder() {
        }

        /**
         * The content of the rich text module
         */
        public Builder setContent(String content) {
            this.content = content;
            return this;
        }


        public RichTextModuleParams build() {
            return new RichTextModuleParams(content);
        }

    }
}
