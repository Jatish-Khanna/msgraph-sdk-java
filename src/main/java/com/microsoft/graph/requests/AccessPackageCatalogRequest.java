// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.requests.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog Request.
 */
public class AccessPackageCatalogRequest extends BaseRequest<AccessPackageCatalog> {
	
    /**
     * The request for the AccessPackageCatalog
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageCatalogRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageCatalog.class);
    }

    /**
     * Gets the AccessPackageCatalog from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageCatalog> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessPackageCatalog from the service
     *
     * @return the AccessPackageCatalog from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageCatalog get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageCatalog> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessPackageCatalog delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessPackageCatalog with a source
     *
     * @param sourceAccessPackageCatalog the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageCatalog> patchAsync(@Nonnull final AccessPackageCatalog sourceAccessPackageCatalog) {
        return sendAsync(HttpMethod.PATCH, sourceAccessPackageCatalog);
    }

    /**
     * Patches this AccessPackageCatalog with a source
     *
     * @param sourceAccessPackageCatalog the source object with updates
     * @return the updated AccessPackageCatalog
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageCatalog patch(@Nonnull final AccessPackageCatalog sourceAccessPackageCatalog) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageCatalog);
    }

    /**
     * Creates a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageCatalog> postAsync(@Nonnull final AccessPackageCatalog newAccessPackageCatalog) {
        return sendAsync(HttpMethod.POST, newAccessPackageCatalog);
    }

    /**
     * Creates a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the new object to create
     * @return the created AccessPackageCatalog
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageCatalog post(@Nonnull final AccessPackageCatalog newAccessPackageCatalog) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageCatalog);
    }

    /**
     * Creates a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageCatalog> putAsync(@Nonnull final AccessPackageCatalog newAccessPackageCatalog) {
        return sendAsync(HttpMethod.PUT, newAccessPackageCatalog);
    }

    /**
     * Creates a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the object to create/update
     * @return the created AccessPackageCatalog
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageCatalog put(@Nonnull final AccessPackageCatalog newAccessPackageCatalog) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageCatalog);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessPackageCatalogRequest select(@Nonnull final String value) {
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
     public AccessPackageCatalogRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

