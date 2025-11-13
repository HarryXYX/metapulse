
package com.linkedin.lineage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.common.EntityRelationships;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.metadata.graph.EntityLineageResult;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * Rest.li entry point: /relationships?type={entityType}&direction={direction}&types={types}
 * 
 * generated from: com.linkedin.metadata.resources.lineage.Relationships
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.lineage.RelationshipsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.lineage.relationships.restspec.json.")
@Deprecated
public class RelationshipsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "relationships";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> getLineageParams = new ArrayList<FieldDef<?>>();
        getLineageParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getLineageParams.add(new FieldDef<java.lang.String>("direction", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getLineageParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        getLineageParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        getLineageParams.add(new FieldDef<Integer>("maxHops", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        requestMetadataMap.put("getLineage", new DynamicRecordMetadata("getLineage", getLineageParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("getLineage", new DynamicRecordMetadata("getLineage", Collections.singletonList(new FieldDef<EntityLineageResult>("value", EntityLineageResult.class, DataTemplateUtil.getSchema(EntityLineageResult.class)))));
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.DELETE), requestMetadataMap, responseMetadataMap, EntityRelationships.class);
    }

    public RelationshipsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RelationshipsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public RelationshipsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RelationshipsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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

    public RelationshipsGetBuilder get() {
        return new RelationshipsGetBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public RelationshipsDeleteBuilder delete() {
        return new RelationshipsDeleteBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public RelationshipsDoGetLineageBuilder actionGetLineage() {
        return new RelationshipsDoGetLineageBuilder(getBaseUriTemplate(), EntityLineageResult.class, _resourceSpec, getRequestOptions());
    }

}
