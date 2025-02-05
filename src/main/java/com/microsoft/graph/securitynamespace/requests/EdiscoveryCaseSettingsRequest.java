// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryCaseSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Settings Request.
 */
public class EdiscoveryCaseSettingsRequest extends BaseRequest<EdiscoveryCaseSettings> {
	
    /**
     * The request for the EdiscoveryCaseSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCaseSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryCaseSettings.class);
    }

    /**
     * Gets the EdiscoveryCaseSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCaseSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EdiscoveryCaseSettings from the service
     *
     * @return the EdiscoveryCaseSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryCaseSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCaseSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EdiscoveryCaseSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EdiscoveryCaseSettings with a source
     *
     * @param sourceEdiscoveryCaseSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCaseSettings> patchAsync(@Nonnull final EdiscoveryCaseSettings sourceEdiscoveryCaseSettings) {
        return sendAsync(HttpMethod.PATCH, sourceEdiscoveryCaseSettings);
    }

    /**
     * Patches this EdiscoveryCaseSettings with a source
     *
     * @param sourceEdiscoveryCaseSettings the source object with updates
     * @return the updated EdiscoveryCaseSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryCaseSettings patch(@Nonnull final EdiscoveryCaseSettings sourceEdiscoveryCaseSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscoveryCaseSettings);
    }

    /**
     * Creates a EdiscoveryCaseSettings with a new object
     *
     * @param newEdiscoveryCaseSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCaseSettings> postAsync(@Nonnull final EdiscoveryCaseSettings newEdiscoveryCaseSettings) {
        return sendAsync(HttpMethod.POST, newEdiscoveryCaseSettings);
    }

    /**
     * Creates a EdiscoveryCaseSettings with a new object
     *
     * @param newEdiscoveryCaseSettings the new object to create
     * @return the created EdiscoveryCaseSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryCaseSettings post(@Nonnull final EdiscoveryCaseSettings newEdiscoveryCaseSettings) throws ClientException {
        return send(HttpMethod.POST, newEdiscoveryCaseSettings);
    }

    /**
     * Creates a EdiscoveryCaseSettings with a new object
     *
     * @param newEdiscoveryCaseSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCaseSettings> putAsync(@Nonnull final EdiscoveryCaseSettings newEdiscoveryCaseSettings) {
        return sendAsync(HttpMethod.PUT, newEdiscoveryCaseSettings);
    }

    /**
     * Creates a EdiscoveryCaseSettings with a new object
     *
     * @param newEdiscoveryCaseSettings the object to create/update
     * @return the created EdiscoveryCaseSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryCaseSettings put(@Nonnull final EdiscoveryCaseSettings newEdiscoveryCaseSettings) throws ClientException {
        return send(HttpMethod.PUT, newEdiscoveryCaseSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryCaseSettingsRequest select(@Nonnull final String value) {
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
     public EdiscoveryCaseSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

