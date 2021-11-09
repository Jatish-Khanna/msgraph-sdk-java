// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityGovernance;
import com.microsoft.graph.requests.AccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.AppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.TermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.EntitlementManagementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Governance Request.
 */
public class IdentityGovernanceRequest extends BaseRequest<IdentityGovernance> {
	
    /**
     * The request for the IdentityGovernance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityGovernanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityGovernance.class);
    }

    /**
     * Gets the IdentityGovernance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IdentityGovernance from the service
     *
     * @return the IdentityGovernance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityGovernance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IdentityGovernance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IdentityGovernance with a source
     *
     * @param sourceIdentityGovernance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> patchAsync(@Nonnull final IdentityGovernance sourceIdentityGovernance) {
        return sendAsync(HttpMethod.PATCH, sourceIdentityGovernance);
    }

    /**
     * Patches this IdentityGovernance with a source
     *
     * @param sourceIdentityGovernance the source object with updates
     * @return the updated IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityGovernance patch(@Nonnull final IdentityGovernance sourceIdentityGovernance) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> postAsync(@Nonnull final IdentityGovernance newIdentityGovernance) {
        return sendAsync(HttpMethod.POST, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the new object to create
     * @return the created IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityGovernance post(@Nonnull final IdentityGovernance newIdentityGovernance) throws ClientException {
        return send(HttpMethod.POST, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> putAsync(@Nonnull final IdentityGovernance newIdentityGovernance) {
        return sendAsync(HttpMethod.PUT, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the object to create/update
     * @return the created IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityGovernance put(@Nonnull final IdentityGovernance newIdentityGovernance) throws ClientException {
        return send(HttpMethod.PUT, newIdentityGovernance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IdentityGovernanceRequest select(@Nonnull final String value) {
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
     public IdentityGovernanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

