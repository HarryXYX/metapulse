package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update a users settings.
 */
public class UpdateCorpUserViewsSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String defaultView;

    public UpdateCorpUserViewsSettingsInput() {
    }

    public UpdateCorpUserViewsSettingsInput(String defaultView) {
        this.defaultView = defaultView;
    }

    public String getDefaultView() {
        return defaultView;
    }
    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (defaultView != null) {
            joiner.add("defaultView: \"" + defaultView + "\"");
        }
        return joiner.toString();
    }

    public static UpdateCorpUserViewsSettingsInput.Builder builder() {
        return new UpdateCorpUserViewsSettingsInput.Builder();
    }

    public static class Builder {

        private String defaultView;

        public Builder() {
        }

        public Builder setDefaultView(String defaultView) {
            this.defaultView = defaultView;
            return this;
        }


        public UpdateCorpUserViewsSettingsInput build() {
            return new UpdateCorpUserViewsSettingsInput(defaultView);
        }

    }
}
