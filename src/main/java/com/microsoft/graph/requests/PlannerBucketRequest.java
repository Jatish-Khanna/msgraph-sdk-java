// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PlannerBucket;
import com.microsoft.graph.requests.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Request.
 */
public class PlannerBucketRequest extends BaseRequest<PlannerBucket> {
	
    /**
     * The request for the PlannerBucket
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucket.class);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucket> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @return the PlannerBucket from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucket get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucket> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PlannerBucket delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucket> patchAsync(@Nonnull final PlannerBucket sourcePlannerBucket) {
        return sendAsync(HttpMethod.PATCH, sourcePlannerBucket);
    }

    /**
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @return the updated PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucket patch(@Nonnull final PlannerBucket sourcePlannerBucket) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucket> postAsync(@Nonnull final PlannerBucket newPlannerBucket) {
        return sendAsync(HttpMethod.POST, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucket post(@Nonnull final PlannerBucket newPlannerBucket) throws ClientException {
        return send(HttpMethod.POST, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucket> putAsync(@Nonnull final PlannerBucket newPlannerBucket) {
        return sendAsync(HttpMethod.PUT, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the object to create/update
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucket put(@Nonnull final PlannerBucket newPlannerBucket) throws ClientException {
        return send(HttpMethod.PUT, newPlannerBucket);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerBucketRequest select(@Nonnull final String value) {
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
     public PlannerBucketRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
