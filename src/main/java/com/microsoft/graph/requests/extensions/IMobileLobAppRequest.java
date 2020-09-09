// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileLobApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile Lob App Request.
 */
public interface IMobileLobAppRequest extends IHttpRequest {

    /**
     * Gets the MobileLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileLobApp> callback);

    /**
     * Gets the MobileLobApp from the service
     *
     * @return the MobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileLobApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileLobApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileLobApp with a source
     *
     * @param sourceMobileLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileLobApp sourceMobileLobApp, final ICallback<MobileLobApp> callback);

    /**
     * Patches this MobileLobApp with a source
     *
     * @param sourceMobileLobApp the source object with updates
     * @return the updated MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileLobApp patch(final MobileLobApp sourceMobileLobApp) throws ClientException;

    /**
     * Posts a MobileLobApp with a new object
     *
     * @param newMobileLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileLobApp newMobileLobApp, final ICallback<MobileLobApp> callback);

    /**
     * Posts a MobileLobApp with a new object
     *
     * @param newMobileLobApp the new object to create
     * @return the created MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileLobApp post(final MobileLobApp newMobileLobApp) throws ClientException;

    /**
     * Posts a MobileLobApp with a new object
     *
     * @param newMobileLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileLobApp newMobileLobApp, final ICallback<MobileLobApp> callback);

    /**
     * Posts a MobileLobApp with a new object
     *
     * @param newMobileLobApp the object to create/update
     * @return the created MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileLobApp put(final MobileLobApp newMobileLobApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileLobAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileLobAppRequest expand(final String value);

}

