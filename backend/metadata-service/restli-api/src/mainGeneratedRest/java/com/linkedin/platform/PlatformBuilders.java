
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
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * DataHub Platform Actions
 * 
 * generated from: com.linkedin.metadata.resources.platform.PlatformResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.platform.PlatformRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.platform.platform.restspec.json.")
@Deprecated
public class PlatformBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
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

    public PlatformBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public PlatformBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public PlatformBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public PlatformBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        _baseUriTemplate = primaryResourceName;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    private java.lang.String getBaseUriTemplate() {
        return _baseUriTemplate;
    }

    public RestliRequestOptions getRequestOptions() {
        return _requestOptions;
    }

    public java.lang.String[] getPathComponents() {
        return URIParamUtils.extractPathComponentsFromUriTemplate(_baseUriTemplate);
    }

    private static RestliRequestOptions assignRequestOptions(RestliRequestOptions requestOptions) {
        if (requestOptions == null) {
            return RestliRequestOptions.DEFAULT_OPTIONS;
        } else {
            return requestOptions;
        }
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public PlatformDoProducePlatformEventBuilder actionProducePlatformEvent() {
        return new PlatformDoProducePlatformEventBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

}
