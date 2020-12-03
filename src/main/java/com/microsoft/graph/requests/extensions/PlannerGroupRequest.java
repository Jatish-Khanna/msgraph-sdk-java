// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerGroup;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Group Request.
 */
public class PlannerGroupRequest extends BaseRequest<PlannerGroup> {
	
    /**
     * The request for the PlannerGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerGroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerGroup.class);
    }

    /**
     * Gets the PlannerGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PlannerGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerGroup from the service
     *
     * @return the PlannerGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PlannerGroup> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PlannerGroup sourcePlannerGroup, @Nonnull final ICallback<? super PlannerGroup> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerGroup);
    }

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @return the updated PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerGroup patch(@Nonnull final PlannerGroup sourcePlannerGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PlannerGroup newPlannerGroup, @Nonnull final ICallback<? super PlannerGroup> callback) {
        send(HttpMethod.POST, callback, newPlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @return the created PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerGroup post(@Nonnull final PlannerGroup newPlannerGroup) throws ClientException {
        return send(HttpMethod.POST, newPlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PlannerGroup newPlannerGroup, @Nonnull final ICallback<? super PlannerGroup> callback) {
        send(HttpMethod.PUT, callback, newPlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the object to create/update
     * @return the created PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerGroup put(@Nonnull final PlannerGroup newPlannerGroup) throws ClientException {
        return send(HttpMethod.PUT, newPlannerGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerGroupRequest select(@Nonnull final String value) {
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
     public PlannerGroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

