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

import io.datahubproject.openapi.generated.FormsAspectRequestV2;
import io.datahubproject.openapi.generated.FormsAspectResponseV2;
import io.datahubproject.openapi.generated.GlossaryNodeEntityRequestV2;
import io.datahubproject.openapi.generated.GlossaryNodeEntityResponseV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectRequestV2;
import io.datahubproject.openapi.generated.InstitutionalMemoryAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.ScrollGlossaryNodeEntityResponseV2;
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
public class GlossarynodeApiController implements GlossarynodeApi {

    private static final Logger log = LoggerFactory.getLogger(GlossarynodeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final EntityApiDelegateImpl<io.datahubproject.openapi.generated.GlossaryNodeEntityRequestV2, io.datahubproject.openapi.generated.GlossaryNodeEntityResponseV2, io.datahubproject.openapi.generated.ScrollGlossaryNodeEntityResponseV2> delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public GlossarynodeApiController(ObjectMapper objectMapper, HttpServletRequest request,
    @org.springframework.beans.factory.annotation.Qualifier("systemOperationContext") OperationContext systemOperationContext,
    EntityService entityService,
    SearchService searchService, EntitiesController v1Controller, AuthorizerChain authorizationChain) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.delegate = new EntityApiDelegateImpl<io.datahubproject.openapi.generated.GlossaryNodeEntityRequestV2, io.datahubproject.openapi.generated.GlossaryNodeEntityResponseV2, io.datahubproject.openapi.generated.ScrollGlossaryNodeEntityResponseV2>(systemOperationContext, request, entityService, searchService, v1Controller,
        authorizationChain, io.datahubproject.openapi.generated.GlossaryNodeEntityRequestV2.class, io.datahubproject.openapi.generated.GlossaryNodeEntityResponseV2.class, io.datahubproject.openapi.generated.ScrollGlossaryNodeEntityResponseV2.class);
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
    public ResponseEntity<List<GlossaryNodeEntityResponseV2>> create(@Parameter(in = ParameterIn.DEFAULT, description = "Create glossaryNode entities.", required=true, schema=@Schema()) @Valid @RequestBody List<GlossaryNodeEntityRequestV2> body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity ONLY if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.create(body, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<FormsAspectResponseV2> createForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect forms on GlossaryNode entity.", required=true, schema=@Schema()) @Valid @RequestBody FormsAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createForms(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<InstitutionalMemoryAspectResponseV2> createInstitutionalMemory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect institutionalMemory on GlossaryNode entity.", required=true, schema=@Schema()) @Valid @RequestBody InstitutionalMemoryAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createInstitutionalMemory(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<OwnershipAspectResponseV2> createOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect ownership on GlossaryNode entity.", required=true, schema=@Schema()) @Valid @RequestBody OwnershipAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createOwnership(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<StatusAspectResponseV2> createStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect status on GlossaryNode entity.", required=true, schema=@Schema()) @Valid @RequestBody StatusAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createStatus(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<Void> delete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.delete(urn);
    }

    @Override
    public ResponseEntity<Void> deleteForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteForms(urn);
    }

    @Override
    public ResponseEntity<Void> deleteInstitutionalMemory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteInstitutionalMemory(urn);
    }

    @Override
    public ResponseEntity<Void> deleteOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteOwnership(urn);
    }

    @Override
    public ResponseEntity<Void> deleteStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteStatus(urn);
    }

    @Override
    public ResponseEntity<GlossaryNodeEntityResponseV2> get(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "glossaryNodeInfo", "institutionalMemory", "ownership", "status", "structuredProperties", "forms", "testResults", "subTypes", "displayProperties", "assetSettings" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects) {
        return delegate.get(urn, systemMetadata, aspects);
    }

    @Override
    public ResponseEntity<FormsAspectResponseV2> getForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getForms(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<InstitutionalMemoryAspectResponseV2> getInstitutionalMemory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getInstitutionalMemory(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<OwnershipAspectResponseV2> getOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getOwnership(urn, systemMetadata);
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
    public ResponseEntity<Void> headForms(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headForms(urn);
    }

    @Override
    public ResponseEntity<Void> headInstitutionalMemory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headInstitutionalMemory(urn);
    }

    @Override
    public ResponseEntity<Void> headOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headOwnership(urn);
    }

    @Override
    public ResponseEntity<Void> headStatus(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headStatus(urn);
    }

    @Override
    public ResponseEntity<ScrollGlossaryNodeEntityResponseV2> scroll(@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "glossaryNodeInfo", "institutionalMemory", "ownership", "status", "structuredProperties", "forms", "testResults", "subTypes", "displayProperties", "assetSettings" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects,@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="10")) @Valid @RequestParam(value = "count", required = false, defaultValue="10") Integer count,@Parameter(in = ParameterIn.QUERY, description = "Scroll pagination token." ,schema=@Schema()) @Valid @RequestParam(value = "scrollId", required = false) String scrollId,@Parameter(in = ParameterIn.QUERY, description = "Sort fields for pagination." ,schema=@Schema(allowableValues={ "urn" }
)) @Valid @RequestParam(value = "sort", required = false) List<String> sort,@Parameter(in = ParameterIn.QUERY, description = "Sort direction field for pagination." ,schema=@Schema()) @Valid @RequestParam(value = "sortOrder", required = false) SortOrder sortOrder,@Parameter(in = ParameterIn.QUERY, description = "Structured search query." ,schema=@Schema( defaultValue="*")) @Valid @RequestParam(value = "query", required = false, defaultValue="*") String query) {
        return delegate.scroll(systemMetadata, aspects, count, scrollId, sort, sortOrder, query);
    }

}
