package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update global applications settings.
 */
public class UpdateApplicationsSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean enabled;

    public UpdateApplicationsSettingsInput() {
    }

    public UpdateApplicationsSettingsInput(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enabled != null) {
            joiner.add("enabled: " + enabled);
        }
        return joiner.toString();
    }

    public static UpdateApplicationsSettingsInput.Builder builder() {
        return new UpdateApplicationsSettingsInput.Builder();
    }

    public static class Builder {

        private Boolean enabled;

        public Builder() {
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public UpdateApplicationsSettingsInput build() {
            return new UpdateApplicationsSettingsInput(enabled);
        }

    }
}
