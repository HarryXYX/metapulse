package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class EthicalConsiderations implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> data;
    private java.util.List<String> humanLife;
    private java.util.List<String> mitigations;
    private java.util.List<String> risksAndHarms;
    private java.util.List<String> useCases;

    public EthicalConsiderations() {
    }

    public EthicalConsiderations(java.util.List<String> data, java.util.List<String> humanLife, java.util.List<String> mitigations, java.util.List<String> risksAndHarms, java.util.List<String> useCases) {
        this.data = data;
        this.humanLife = humanLife;
        this.mitigations = mitigations;
        this.risksAndHarms = risksAndHarms;
        this.useCases = useCases;
    }

    /**
     * Does the model use any sensitive data eg, protected classes
     */
    public java.util.List<String> getData() {
        return data;
    }
    /**
     * Does the model use any sensitive data eg, protected classes
     */
    public void setData(java.util.List<String> data) {
        this.data = data;
    }

    /**
     * Is the model intended to inform decisions about matters central to human life or flourishing eg, health or safety
     */
    public java.util.List<String> getHumanLife() {
        return humanLife;
    }
    /**
     * Is the model intended to inform decisions about matters central to human life or flourishing eg, health or safety
     */
    public void setHumanLife(java.util.List<String> humanLife) {
        this.humanLife = humanLife;
    }

    /**
     * What risk mitigation strategies were used during model development
     */
    public java.util.List<String> getMitigations() {
        return mitigations;
    }
    /**
     * What risk mitigation strategies were used during model development
     */
    public void setMitigations(java.util.List<String> mitigations) {
        this.mitigations = mitigations;
    }

    /**
     * What risks may be present in model usage
Try to identify the potential recipients, likelihood, and magnitude of harms
If these cannot be determined, note that they were considered but remain unknown
     */
    public java.util.List<String> getRisksAndHarms() {
        return risksAndHarms;
    }
    /**
     * What risks may be present in model usage
Try to identify the potential recipients, likelihood, and magnitude of harms
If these cannot be determined, note that they were considered but remain unknown
     */
    public void setRisksAndHarms(java.util.List<String> risksAndHarms) {
        this.risksAndHarms = risksAndHarms;
    }

    /**
     * Are there any known model use cases that are especially fraught
This may connect directly to the intended use section
     */
    public java.util.List<String> getUseCases() {
        return useCases;
    }
    /**
     * Are there any known model use cases that are especially fraught
This may connect directly to the intended use section
     */
    public void setUseCases(java.util.List<String> useCases) {
        this.useCases = useCases;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (data != null) {
            joiner.add("data: " + data);
        }
        if (humanLife != null) {
            joiner.add("humanLife: " + humanLife);
        }
        if (mitigations != null) {
            joiner.add("mitigations: " + mitigations);
        }
        if (risksAndHarms != null) {
            joiner.add("risksAndHarms: " + risksAndHarms);
        }
        if (useCases != null) {
            joiner.add("useCases: " + useCases);
        }
        return joiner.toString();
    }

    public static EthicalConsiderations.Builder builder() {
        return new EthicalConsiderations.Builder();
    }

    public static class Builder {

        private java.util.List<String> data;
        private java.util.List<String> humanLife;
        private java.util.List<String> mitigations;
        private java.util.List<String> risksAndHarms;
        private java.util.List<String> useCases;

        public Builder() {
        }

        /**
         * Does the model use any sensitive data eg, protected classes
         */
        public Builder setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }

        /**
         * Is the model intended to inform decisions about matters central to human life or flourishing eg, health or safety
         */
        public Builder setHumanLife(java.util.List<String> humanLife) {
            this.humanLife = humanLife;
            return this;
        }

        /**
         * What risk mitigation strategies were used during model development
         */
        public Builder setMitigations(java.util.List<String> mitigations) {
            this.mitigations = mitigations;
            return this;
        }

        /**
         * What risks may be present in model usage
Try to identify the potential recipients, likelihood, and magnitude of harms
If these cannot be determined, note that they were considered but remain unknown
         */
        public Builder setRisksAndHarms(java.util.List<String> risksAndHarms) {
            this.risksAndHarms = risksAndHarms;
            return this;
        }

        /**
         * Are there any known model use cases that are especially fraught
This may connect directly to the intended use section
         */
        public Builder setUseCases(java.util.List<String> useCases) {
            this.useCases = useCases;
            return this;
        }


        public EthicalConsiderations build() {
            return new EthicalConsiderations(data, humanLife, mitigations, risksAndHarms, useCases);
        }

    }
}
