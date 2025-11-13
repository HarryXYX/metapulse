package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when getting Business Glossary entities
 */
public class GetRootGlossaryEntitiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;

    public GetRootGlossaryEntitiesInput() {
    }

    public GetRootGlossaryEntitiesInput(int start, int count) {
        this.start = start;
        this.count = count;
    }

    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        return joiner.toString();
    }

    public static GetRootGlossaryEntitiesInput.Builder builder() {
        return new GetRootGlossaryEntitiesInput.Builder();
    }

    public static class Builder {

        private int start;
        private int count;

        public Builder() {
        }

        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public GetRootGlossaryEntitiesInput build() {
            return new GetRootGlossaryEntitiesInput(start, count);
        }

    }
}
