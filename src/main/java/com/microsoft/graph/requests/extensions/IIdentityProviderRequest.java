// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityProvider;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Provider Request.
 */
public interface IIdentityProviderRequest extends IHttpRequest {

    /**
     * Gets the IdentityProvider from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IdentityProvider> callback);

    /**
     * Gets the IdentityProvider from the service
     *
     * @return the IdentityProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityProvider get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IdentityProvider> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IdentityProvider with a source
     *
     * @param sourceIdentityProvider the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IdentityProvider sourceIdentityProvider, final ICallback<? super IdentityProvider> callback);

    /**
     * Patches this IdentityProvider with a source
     *
     * @param sourceIdentityProvider the source object with updates
     * @return the updated IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityProvider patch(final IdentityProvider sourceIdentityProvider) throws ClientException;

    /**
     * Posts a IdentityProvider with a new object
     *
     * @param newIdentityProvider the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IdentityProvider newIdentityProvider, final ICallback<? super IdentityProvider> callback);

    /**
     * Posts a IdentityProvider with a new object
     *
     * @param newIdentityProvider the new object to create
     * @return the created IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityProvider post(final IdentityProvider newIdentityProvider) throws ClientException;

    /**
     * Posts a IdentityProvider with a new object
     *
     * @param newIdentityProvider the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IdentityProvider newIdentityProvider, final ICallback<? super IdentityProvider> callback);

    /**
     * Posts a IdentityProvider with a new object
     *
     * @param newIdentityProvider the object to create/update
     * @return the created IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityProvider put(final IdentityProvider newIdentityProvider) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIdentityProviderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIdentityProviderRequest expand(final String value);

}

