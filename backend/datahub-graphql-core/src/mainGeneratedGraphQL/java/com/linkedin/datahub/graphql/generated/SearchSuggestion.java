package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A suggestion for an alternate search query given an original query compared to all
of the entity names in our search index.
 */
public class SearchSuggestion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String text;
    private Float score;
    private Integer frequency;

    public SearchSuggestion() {
    }

    public SearchSuggestion(String text, Float score, Integer frequency) {
        this.text = text;
        this.score = score;
        this.frequency = frequency;
    }

    /**
     * The suggested text based on the provided query text compared to
the entity name field in the search index.
     */
    public String getText() {
        return text;
    }
    /**
     * The suggested text based on the provided query text compared to
the entity name field in the search index.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * The "edit distance" for this suggestion. The closer this number is to 1, the
closer the suggested text is to the original text. The closer it is to 0, the
further from the original text it is.
     */
    public Float getScore() {
        return score;
    }
    /**
     * The "edit distance" for this suggestion. The closer this number is to 1, the
closer the suggested text is to the original text. The closer it is to 0, the
further from the original text it is.
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * The number of entities that would match on the name field given the suggested text
     */
    public Integer getFrequency() {
        return frequency;
    }
    /**
     * The number of entities that would match on the name field given the suggested text
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (text != null) {
            joiner.add("text: \"" + text + "\"");
        }
        if (score != null) {
            joiner.add("score: " + score);
        }
        if (frequency != null) {
            joiner.add("frequency: " + frequency);
        }
        return joiner.toString();
    }

    public static SearchSuggestion.Builder builder() {
        return new SearchSuggestion.Builder();
    }

    public static class Builder {

        private String text;
        private Float score;
        private Integer frequency;

        public Builder() {
        }

        /**
         * The suggested text based on the provided query text compared to
the entity name field in the search index.
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        /**
         * The "edit distance" for this suggestion. The closer this number is to 1, the
closer the suggested text is to the original text. The closer it is to 0, the
further from the original text it is.
         */
        public Builder setScore(Float score) {
            this.score = score;
            return this;
        }

        /**
         * The number of entities that would match on the name field given the suggested text
         */
        public Builder setFrequency(Integer frequency) {
            this.frequency = frequency;
            return this;
        }


        public SearchSuggestion build() {
            return new SearchSuggestion(text, score, frequency);
        }

    }
}
