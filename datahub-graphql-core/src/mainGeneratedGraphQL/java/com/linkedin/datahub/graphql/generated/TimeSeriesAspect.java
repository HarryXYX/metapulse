package com.linkedin.datahub.graphql.generated;


/**
 * A time series aspect, or a group of related metadata associated with an Entity and corresponding to a particular timestamp
 */
public interface TimeSeriesAspect {

    /**
     * The timestamp associated with the time series aspect in milliseconds
     */
    @javax.annotation.Nonnull
    Long getTimestampMillis();

}
