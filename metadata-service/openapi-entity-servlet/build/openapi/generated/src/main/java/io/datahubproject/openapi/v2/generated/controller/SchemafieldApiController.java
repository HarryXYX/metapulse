package io.datahubproject.openapi.v2.generated.controller;

import io.datahubproject.openapi.v2.delegates.EntityApiDelegateImpl;
import io.datahubproject.metadata.context.OperationContext;
import com.linkedin.metadata.entity.EntityService;
import com.linkedin.metadata.search.SearchService;
import io.datahubproject.openapi.v1.entities.EntitiesController;
import com.datahub.authorization.AuthorizerChain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import io.datahubproject.openapi.generated.DeprecationAspectRequestV2;
import io.datahubproject.openapi.generated.DeprecationAspectResponseV2;
import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectRequestV2;
import io.datahubproject.openapi.generated.GlobalTagsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectRequestV2;
import io.datahubproject.openapi.generated.GlossaryTermsAspectResponseV2;
import io.datahubproject.openapi.generated.SchemaFieldEntityRequestV2;
import io.datahubproject.openapi.generated.SchemaFieldEntityResponseV2;
import io.datahubproject.openapi.generated.ScrollSchemaFieldEntityResponseV2;
import io.datahubproject.openapi.generated.SortOrder;
import io.datahubproject.openapi.generated.StatusAspectRequestV2;
import io.datahubproject.openapi.generated.StatusAspectResponseV2;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Optional;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.datahubproject.CustomSpringCodegen", date = "2025-11-09T20:44:13.474346+08:00[Asia/Shanghai]")
@RestController
@RequestMapping("/openapi/v2/entity")
public class SchemafieldApiController implements SchemafieldApi {

    private static final Logger log = LoggerFactory.getLogger(SchemafieldApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final EntityApiDelegateImpl<io.datahubproject.openapi.generated.SchemaFieldEntityRequestV2, io.datahubproject.openapi.generated.SchemaFieldEntityResponseV2, io.datahubproject.openapi.generated.ScrollSchemaFieldEntityResponseV2> delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public SchemafieldApiController(ObjectMapper objectMapper, HttpServletRequest request,
    @org.springframework.beans.factory.annotation.Qualifier("systemOperationContext") OperationContext systemOperationContext,
    EntityService entityService,
    SearchService searchService, EntitiesController v1Controller, AuthorizerChain authorizationChain) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.delegate = new EntityApiDelegateImpl<io.datahubproject.openapi.generated.SchemaFieldEntityRequestV2, io.datahubproject.openapi.generated.SchemaFieldEntityResponseV2, io.datahubproject.openapi.generated.ScrollSchemaFieldEntityResponseV2>(systemOperationContext, request, entityService, searchService, v1Controller,
        authorizationChain, io.datahubproject.openapi.generated.SchemaFieldEntityRequestV2.class, io.datahubproject.openapi.generated.SchemaFieldEntityResponseV2.class, io.datahubproject.openapi.generated.ScrollSchemaFieldEntityResponseV2.class);
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<SchemaFieldEntityResponseV2>> create(@Parameter(in = ParameterIn.DEFAULT, description = "Create schemaField entities.", required=true, schema=@Schema()) @Valid @RequestBody List<SchemaFieldEntityRequestV2> body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity ONLY if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.create(body, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<DeprecationAspectResponseV2> createDeprecation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect deprecation on SchemaField entity.", required=true, schema=@Schema()) @Valid @RequestBody DeprecationAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createDeprecation(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<FormsAspectResponseV2> createForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect forms on SchemaField entity.", required=true, schema=@Schema()) @Valid @RequestBody FormsAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createForms(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<GlobalTagsAspectResponseV2> createGlobalTags(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect globalTags on SchemaField entity.", required=true, schema=@Schema()) @Valid @RequestBody GlobalTagsAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createGlobalTags(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<GlossaryTermsAspectResponseV2> createGlossaryTerms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect glossaryTerms on SchemaField entity.", required=true, schema=@Schema()) @Valid @RequestBody GlossaryTermsAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createGlossaryTerms(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<StatusAspectResponseV2> createStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect status on SchemaField entity.", required=true, schema=@Schema()) @Valid @RequestBody StatusAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createStatus(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<Void> delete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.delete(urn);
    }

    @Override
    public ResponseEntity<Void> deleteDeprecation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteDeprecation(urn);
    }

    @Override
    public ResponseEntity<Void> deleteForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteForms(urn);
    }

    @Override
    public ResponseEntity<Void> deleteGlobalTags(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteGlobalTags(urn);
    }

    @Override
    public ResponseEntity<Void> deleteGlossaryTerms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteGlossaryTerms(urn);
    }

    @Override
    public ResponseEntity<Void> deleteStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteStatus(urn);
    }

    @Override
    public ResponseEntity<SchemaFieldEntityResponseV2> get(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "structuredProperties", "forms", "businessAttributes", "status", "schemaFieldAliases", "documentation", "testResults", "deprecation", "subTypes", "logicalParent", "globalTags", "glossaryTerms" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects) {
        return delegate.get(urn, systemMetadata, aspects);
    }

    @Override
    public ResponseEntity<DeprecationAspectResponseV2> getDeprecation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getDeprecation(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<FormsAspectResponseV2> getForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getForms(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<GlobalTagsAspectResponseV2> getGlobalTags(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getGlobalTags(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<GlossaryTermsAspectResponseV2> getGlossaryTerms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getGlossaryTerms(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<StatusAspectResponseV2> getStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getStatus(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<Void> head(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.head(urn);
    }

    @Override
    public ResponseEntity<Void> headDeprecation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headDeprecation(urn);
    }

    @Override
    public ResponseEntity<Void> headForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headForms(urn);
    }

    @Override
    public ResponseEntity<Void> headGlobalTags(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headGlobalTags(urn);
    }

    @Override
    public ResponseEntity<Void> headGlossaryTerms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headGlossaryTerms(urn);
    }

    @Override
    public ResponseEntity<Void> headStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headStatus(urn);
    }

    @Override
    public ResponseEntity<ScrollSchemaFieldEntityResponseV2> scroll(@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "structuredProperties", "forms", "businessAttributes", "status", "schemaFieldAliases", "documentation", "testResults", "deprecation", "subTypes", "logicalParent", "globalTags", "glossaryTerms" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects,@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="10")) @Valid @RequestParam(value = "count", required = false, defaultValue="10") Integer count,@Parameter(in = ParameterIn.QUERY, description = "Scroll pagination token." ,schema=@Schema()) @Valid @RequestParam(value = "scrollId", required = false) String scrollId,@Parameter(in = ParameterIn.QUERY, description = "Sort fields for pagination." ,schema=@Schema(allowableValues={ "urn" }
)) @Valid @RequestParam(value = "sort", required = false) List<String> sort,@Parameter(in = ParameterIn.QUERY, description = "Sort direction field for pagination." ,schema=@Schema()) @Valid @RequestParam(value = "sortOrder", required = false) SortOrder sortOrder,@Parameter(in = ParameterIn.QUERY, description = "Structured search query." ,schema=@Schema( defaultValue="*")) @Valid @RequestParam(value = "query", required = false, defaultValue="*") String query) {
        return delegate.scroll(systemMetadata, aspects, count, scrollId, sort, sortOrder, query);
    }

}
