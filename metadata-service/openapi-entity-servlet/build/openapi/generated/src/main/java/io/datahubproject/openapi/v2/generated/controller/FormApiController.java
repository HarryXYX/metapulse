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

import io.datahubproject.openapi.generated.DynamicFormAssignmentAspectRequestV2;
import io.datahubproject.openapi.generated.DynamicFormAssignmentAspectResponseV2;
import io.datahubproject.openapi.generated.FormEntityRequestV2;
import io.datahubproject.openapi.generated.FormEntityResponseV2;
import io.datahubproject.openapi.generated.FormInfoAspectRequestV2;
import io.datahubproject.openapi.generated.FormInfoAspectResponseV2;
import io.datahubproject.openapi.generated.OwnershipAspectRequestV2;
import io.datahubproject.openapi.generated.OwnershipAspectResponseV2;
import io.datahubproject.openapi.generated.ScrollFormEntityResponseV2;
import io.datahubproject.openapi.generated.SortOrder;

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
public class FormApiController implements FormApi {

    private static final Logger log = LoggerFactory.getLogger(FormApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final EntityApiDelegateImpl<io.datahubproject.openapi.generated.FormEntityRequestV2, io.datahubproject.openapi.generated.FormEntityResponseV2, io.datahubproject.openapi.generated.ScrollFormEntityResponseV2> delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public FormApiController(ObjectMapper objectMapper, HttpServletRequest request,
    @org.springframework.beans.factory.annotation.Qualifier("systemOperationContext") OperationContext systemOperationContext,
    EntityService entityService,
    SearchService searchService, EntitiesController v1Controller, AuthorizerChain authorizationChain) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.delegate = new EntityApiDelegateImpl<io.datahubproject.openapi.generated.FormEntityRequestV2, io.datahubproject.openapi.generated.FormEntityResponseV2, io.datahubproject.openapi.generated.ScrollFormEntityResponseV2>(systemOperationContext, request, entityService, searchService, v1Controller,
        authorizationChain, io.datahubproject.openapi.generated.FormEntityRequestV2.class, io.datahubproject.openapi.generated.FormEntityResponseV2.class, io.datahubproject.openapi.generated.ScrollFormEntityResponseV2.class);
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
    public ResponseEntity<List<FormEntityResponseV2>> create(@Parameter(in = ParameterIn.DEFAULT, description = "Create form entities.", required=true, schema=@Schema()) @Valid @RequestBody List<FormEntityRequestV2> body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity ONLY if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.create(body, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<DynamicFormAssignmentAspectResponseV2> createDynamicFormAssignment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect dynamicFormAssignment on Form entity.", required=true, schema=@Schema()) @Valid @RequestBody DynamicFormAssignmentAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createDynamicFormAssignment(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<FormInfoAspectResponseV2> createFormInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect formInfo on Form entity.", required=true, schema=@Schema()) @Valid @RequestBody FormInfoAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createFormInfo(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<OwnershipAspectResponseV2> createOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.DEFAULT, description = "Create aspect ownership on Form entity.", required=true, schema=@Schema()) @Valid @RequestBody OwnershipAspectRequestV2 body,@Parameter(in = ParameterIn.QUERY, description = "Create the aspect if it does not already exist." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createIfNotExists", required = false, defaultValue="false") Boolean createIfNotExists,@Parameter(in = ParameterIn.QUERY, description = "Create the entity if it does not already exist. Fails in case when the entity exists." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "createEntityIfNotExists", required = false, defaultValue="false") Boolean createEntityIfNotExists) {
        return delegate.createOwnership(body, urn, createIfNotExists, createEntityIfNotExists);
    }

    @Override
    public ResponseEntity<Void> delete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.delete(urn);
    }

    @Override
    public ResponseEntity<Void> deleteDynamicFormAssignment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteDynamicFormAssignment(urn);
    }

    @Override
    public ResponseEntity<Void> deleteFormInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteFormInfo(urn);
    }

    @Override
    public ResponseEntity<Void> deleteOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.deleteOwnership(urn);
    }

    @Override
    public ResponseEntity<FormEntityResponseV2> get(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "formInfo", "dynamicFormAssignment", "ownership" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects) {
        return delegate.get(urn, systemMetadata, aspects);
    }

    @Override
    public ResponseEntity<DynamicFormAssignmentAspectResponseV2> getDynamicFormAssignment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getDynamicFormAssignment(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<FormInfoAspectResponseV2> getFormInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getFormInfo(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<OwnershipAspectResponseV2> getOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn,@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata) {
        return delegate.getOwnership(urn, systemMetadata);
    }

    @Override
    public ResponseEntity<Void> head(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.head(urn);
    }

    @Override
    public ResponseEntity<Void> headDynamicFormAssignment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headDynamicFormAssignment(urn);
    }

    @Override
    public ResponseEntity<Void> headFormInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headFormInfo(urn);
    }

    @Override
    public ResponseEntity<Void> headOwnership(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("urn") String urn) {
        return delegate.headOwnership(urn);
    }

    @Override
    public ResponseEntity<ScrollFormEntityResponseV2> scroll(@Parameter(in = ParameterIn.QUERY, description = "Include systemMetadata with response." ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "systemMetadata", required = false, defaultValue="false") Boolean systemMetadata,@Parameter(in = ParameterIn.QUERY, description = "Aspects to include in response." ,schema=@Schema(allowableValues={ "formInfo", "dynamicFormAssignment", "ownership" }
)) @Valid @RequestParam(value = "aspects", required = false) List<String> aspects,@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="10")) @Valid @RequestParam(value = "count", required = false, defaultValue="10") Integer count,@Parameter(in = ParameterIn.QUERY, description = "Scroll pagination token." ,schema=@Schema()) @Valid @RequestParam(value = "scrollId", required = false) String scrollId,@Parameter(in = ParameterIn.QUERY, description = "Sort fields for pagination." ,schema=@Schema(allowableValues={ "urn" }
)) @Valid @RequestParam(value = "sort", required = false) List<String> sort,@Parameter(in = ParameterIn.QUERY, description = "Sort direction field for pagination." ,schema=@Schema()) @Valid @RequestParam(value = "sortOrder", required = false) SortOrder sortOrder,@Parameter(in = ParameterIn.QUERY, description = "Structured search query." ,schema=@Schema( defaultValue="*")) @Valid @RequestParam(value = "query", required = false, defaultValue="*") String query) {
        return delegate.scroll(systemMetadata, aspects, count, scrollId, sort, sortOrder, query);
    }

}
