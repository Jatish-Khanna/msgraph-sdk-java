// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Status Request.
 */
public interface IManagedAppStatusRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedAppStatus> callback);

    /**
     * Gets the ManagedAppStatus from the service
     *
     * @return the ManagedAppStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedAppStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedAppStatus with a source
     *
     * @param sourceManagedAppStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppStatus sourceManagedAppStatus, final ICallback<? super ManagedAppStatus> callback);

    /**
     * Patches this ManagedAppStatus with a source
     *
     * @param sourceManagedAppStatus the source object with updates
     * @return the updated ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppStatus patch(final ManagedAppStatus sourceManagedAppStatus) throws ClientException;

    /**
     * Posts a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppStatus newManagedAppStatus, final ICallback<? super ManagedAppStatus> callback);

    /**
     * Posts a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the new object to create
     * @return the created ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppStatus post(final ManagedAppStatus newManagedAppStatus) throws ClientException;

    /**
     * Posts a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedAppStatus newManagedAppStatus, final ICallback<? super ManagedAppStatus> callback);

    /**
     * Posts a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the object to create/update
     * @return the created ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppStatus put(final ManagedAppStatus newManagedAppStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppStatusRequest expand(final String value);

}

