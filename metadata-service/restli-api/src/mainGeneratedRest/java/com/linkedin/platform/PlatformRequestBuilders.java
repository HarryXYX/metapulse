
package com.linkedin.platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.entity.Entity;
import com.linkedin.mxe.PlatformEvent;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * DataHub Platform Actions
 * 
 * generated from: com.linkedin.metadata.resources.platform.PlatformResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.platform.platform.restspec.json.")
public class PlatformRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "platform";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> producePlatformEventParams = new ArrayList<FieldDef<?>>();
        producePlatformEventParams.add(new FieldDef<java.lang.String>("name", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        producePlatformEventParams.add(new FieldDef<java.lang.String>("key", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        producePlatformEventParams.add(new FieldDef<PlatformEvent>("event", PlatformEvent.class, DataTemplateUtil.getSchema(PlatformEvent.class)));
        requestMetadataMap.put("producePlatformEvent", new DynamicRecordMetadata("producePlatformEvent", producePlatformEventParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("producePlatformEvent", new DynamicRecordMetadata("producePlatformEvent", Collections.<FieldDef<?>>emptyList()));
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, Entity.class, keyParts);
    }

    public PlatformRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public PlatformRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public PlatformRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public PlatformRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public PlatformDoProducePlatformEventRequestBuilder actionProducePlatformEvent() {
        return new PlatformDoProducePlatformEventRequestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

}
