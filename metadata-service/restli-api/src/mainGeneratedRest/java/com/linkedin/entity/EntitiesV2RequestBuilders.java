
package com.linkedin.entity;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Single unified resource for fetching, updating, searching, & browsing DataHub entities
 * 
 * generated from: com.linkedin.metadata.resources.entity.EntityV2Resource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.entitiesV2.restspec.json.")
public class EntitiesV2RequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "entitiesV2";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.BATCH_GET), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, EntityResponse.class, keyParts);
    }

    public EntitiesV2RequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesV2RequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public EntitiesV2RequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesV2RequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    /**
     * Retrieves the value for an entity that is made up of latest versions of specified aspects.
     * 
     * @return
     *     builder for the resource method
     */
    public EntitiesV2GetRequestBuilder get() {
        return new EntitiesV2GetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public EntitiesV2BatchGetRequestBuilder batchGet() {
        return new EntitiesV2BatchGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
