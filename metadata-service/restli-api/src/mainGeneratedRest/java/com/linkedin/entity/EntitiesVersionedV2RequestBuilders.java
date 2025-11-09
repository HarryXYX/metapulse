
package com.linkedin.entity;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.common.versioned.VersionedUrn;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Single unified resource for fetching, updating, searching, & browsing versioned DataHub entities
 * 
 * generated from: com.linkedin.metadata.resources.entity.EntityVersionedV2Resource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.entitiesVersionedV2.restspec.json.")
public class EntitiesVersionedV2RequestBuilders
    extends BuilderBase
{

    private final static String ORIGINAL_RESOURCE_PATH = "entitiesVersionedV2";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<String, DynamicRecordMetadata> requestMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, DynamicRecordMetadata> responseMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.BATCH_GET), requestMetadataMap, responseMetadataMap, VersionedUrn.class, null, null, EntityResponse.class, keyParts);
    }

    public EntitiesVersionedV2RequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesVersionedV2RequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public EntitiesVersionedV2RequestBuilders(String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesVersionedV2RequestBuilders(String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public EntitiesVersionedV2BatchGetRequestBuilder batchGet() {
        return new EntitiesVersionedV2BatchGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
