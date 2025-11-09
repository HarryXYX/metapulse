package com.linkedin.datahub.graphql.generated;


/**
 * Retrieves a set of charts regarding the ingested metadata
 */
public interface GetMetadataAnalyticsChartsQueryResolver {

    /**
     * Retrieves a set of charts regarding the ingested metadata
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getMetadataAnalyticsCharts(@javax.annotation.Nonnull MetadataAnalyticsInput input) throws Exception;

}
