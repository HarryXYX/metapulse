package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information where a file is stored
 */
public class BucketStorageLocation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String storageBucket;
    @javax.annotation.Nonnull
    private String storageKey;

    public BucketStorageLocation() {
    }

    public BucketStorageLocation(String storageBucket, String storageKey) {
        this.storageBucket = storageBucket;
        this.storageKey = storageKey;
    }

    /**
     * The storage bucket this file is stored in
     */
    public String getStorageBucket() {
        return storageBucket;
    }
    /**
     * The storage bucket this file is stored in
     */
    public void setStorageBucket(String storageBucket) {
        this.storageBucket = storageBucket;
    }

    /**
     * The key for where this file is stored inside of the given bucket
     */
    public String getStorageKey() {
        return storageKey;
    }
    /**
     * The key for where this file is stored inside of the given bucket
     */
    public void setStorageKey(String storageKey) {
        this.storageKey = storageKey;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (storageBucket != null) {
            joiner.add("storageBucket: \"" + storageBucket + "\"");
        }
        if (storageKey != null) {
            joiner.add("storageKey: \"" + storageKey + "\"");
        }
        return joiner.toString();
    }

    public static BucketStorageLocation.Builder builder() {
        return new BucketStorageLocation.Builder();
    }

    public static class Builder {

        private String storageBucket;
        private String storageKey;

        public Builder() {
        }

        /**
         * The storage bucket this file is stored in
         */
        public Builder setStorageBucket(String storageBucket) {
            this.storageBucket = storageBucket;
            return this;
        }

        /**
         * The key for where this file is stored inside of the given bucket
         */
        public Builder setStorageKey(String storageKey) {
            this.storageKey = storageKey;
            return this;
        }


        public BucketStorageLocation build() {
            return new BucketStorageLocation(storageBucket, storageKey);
        }

    }
}
