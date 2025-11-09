package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating a user setting
 */
public class UpdateUserSettingInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private UserSetting name;
    private boolean value;

    public UpdateUserSettingInput() {
    }

    public UpdateUserSettingInput(UserSetting name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public UserSetting getName() {
        return name;
    }
    public void setName(UserSetting name) {
        this.name = name;
    }

    public boolean getValue() {
        return value;
    }
    public void setValue(boolean value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + name);
        }
        joiner.add("value: " + value);
        return joiner.toString();
    }

    public static UpdateUserSettingInput.Builder builder() {
        return new UpdateUserSettingInput.Builder();
    }

    public static class Builder {

        private UserSetting name;
        private boolean value;

        public Builder() {
        }

        public Builder setName(UserSetting name) {
            this.name = name;
            return this;
        }

        public Builder setValue(boolean value) {
            this.value = value;
            return this;
        }


        public UpdateUserSettingInput build() {
            return new UpdateUserSettingInput(name, value);
        }

    }
}
