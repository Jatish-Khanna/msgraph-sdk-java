// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.CaseExportOperation;
import com.microsoft.graph.ediscovery.requests.ReviewSetWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Export Operation Request.
 */
public class CaseExportOperationRequest extends BaseRequest<CaseExportOperation> {
	
    /**
     * The request for the CaseExportOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CaseExportOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CaseExportOperation.class);
    }

    /**
     * Gets the CaseExportOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CaseExportOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CaseExportOperation from the service
     *
     * @return the CaseExportOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CaseExportOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CaseExportOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CaseExportOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CaseExportOperation with a source
     *
     * @param sourceCaseExportOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CaseExportOperation> patchAsync(@Nonnull final CaseExportOperation sourceCaseExportOperation) {
        return sendAsync(HttpMethod.PATCH, sourceCaseExportOperation);
    }

    /**
     * Patches this CaseExportOperation with a source
     *
     * @param sourceCaseExportOperation the source object with updates
     * @return the updated CaseExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CaseExportOperation patch(@Nonnull final CaseExportOperation sourceCaseExportOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCaseExportOperation);
    }

    /**
     * Creates a CaseExportOperation with a new object
     *
     * @param newCaseExportOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CaseExportOperation> postAsync(@Nonnull final CaseExportOperation newCaseExportOperation) {
        return sendAsync(HttpMethod.POST, newCaseExportOperation);
    }

    /**
     * Creates a CaseExportOperation with a new object
     *
     * @param newCaseExportOperation the new object to create
     * @return the created CaseExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CaseExportOperation post(@Nonnull final CaseExportOperation newCaseExportOperation) throws ClientException {
        return send(HttpMethod.POST, newCaseExportOperation);
    }

    /**
     * Creates a CaseExportOperation with a new object
     *
     * @param newCaseExportOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CaseExportOperation> putAsync(@Nonnull final CaseExportOperation newCaseExportOperation) {
        return sendAsync(HttpMethod.PUT, newCaseExportOperation);
    }

    /**
     * Creates a CaseExportOperation with a new object
     *
     * @param newCaseExportOperation the object to create/update
     * @return the created CaseExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CaseExportOperation put(@Nonnull final CaseExportOperation newCaseExportOperation) throws ClientException {
        return send(HttpMethod.PUT, newCaseExportOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CaseExportOperationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public CaseExportOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

