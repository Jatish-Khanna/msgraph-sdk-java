// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Based Timeout Policy Request.
 */
public class ActivityBasedTimeoutPolicyRequest extends BaseRequest<ActivityBasedTimeoutPolicy> {
	
    /**
     * The request for the ActivityBasedTimeoutPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityBasedTimeoutPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityBasedTimeoutPolicy.class);
    }

    /**
     * Gets the ActivityBasedTimeoutPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ActivityBasedTimeoutPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ActivityBasedTimeoutPolicy from the service
     *
     * @return the ActivityBasedTimeoutPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityBasedTimeoutPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ActivityBasedTimeoutPolicy> callback) {
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
     * Patches this ActivityBasedTimeoutPolicy with a source
     *
     * @param sourceActivityBasedTimeoutPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ActivityBasedTimeoutPolicy sourceActivityBasedTimeoutPolicy, @Nonnull final ICallback<? super ActivityBasedTimeoutPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceActivityBasedTimeoutPolicy);
    }

    /**
     * Patches this ActivityBasedTimeoutPolicy with a source
     *
     * @param sourceActivityBasedTimeoutPolicy the source object with updates
     * @return the updated ActivityBasedTimeoutPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityBasedTimeoutPolicy patch(@Nonnull final ActivityBasedTimeoutPolicy sourceActivityBasedTimeoutPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityBasedTimeoutPolicy);
    }

    /**
     * Creates a ActivityBasedTimeoutPolicy with a new object
     *
     * @param newActivityBasedTimeoutPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ActivityBasedTimeoutPolicy newActivityBasedTimeoutPolicy, @Nonnull final ICallback<? super ActivityBasedTimeoutPolicy> callback) {
        send(HttpMethod.POST, callback, newActivityBasedTimeoutPolicy);
    }

    /**
     * Creates a ActivityBasedTimeoutPolicy with a new object
     *
     * @param newActivityBasedTimeoutPolicy the new object to create
     * @return the created ActivityBasedTimeoutPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityBasedTimeoutPolicy post(@Nonnull final ActivityBasedTimeoutPolicy newActivityBasedTimeoutPolicy) throws ClientException {
        return send(HttpMethod.POST, newActivityBasedTimeoutPolicy);
    }

    /**
     * Creates a ActivityBasedTimeoutPolicy with a new object
     *
     * @param newActivityBasedTimeoutPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ActivityBasedTimeoutPolicy newActivityBasedTimeoutPolicy, @Nonnull final ICallback<? super ActivityBasedTimeoutPolicy> callback) {
        send(HttpMethod.PUT, callback, newActivityBasedTimeoutPolicy);
    }

    /**
     * Creates a ActivityBasedTimeoutPolicy with a new object
     *
     * @param newActivityBasedTimeoutPolicy the object to create/update
     * @return the created ActivityBasedTimeoutPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityBasedTimeoutPolicy put(@Nonnull final ActivityBasedTimeoutPolicy newActivityBasedTimeoutPolicy) throws ClientException {
        return send(HttpMethod.PUT, newActivityBasedTimeoutPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ActivityBasedTimeoutPolicyRequest select(@Nonnull final String value) {
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
     public ActivityBasedTimeoutPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

