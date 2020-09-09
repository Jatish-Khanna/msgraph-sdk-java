// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unmute Participant Operation Request.
 */
public interface IUnmuteParticipantOperationRequest extends IHttpRequest {

    /**
     * Gets the UnmuteParticipantOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UnmuteParticipantOperation> callback);

    /**
     * Gets the UnmuteParticipantOperation from the service
     *
     * @return the UnmuteParticipantOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnmuteParticipantOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UnmuteParticipantOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnmuteParticipantOperation with a source
     *
     * @param sourceUnmuteParticipantOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnmuteParticipantOperation sourceUnmuteParticipantOperation, final ICallback<UnmuteParticipantOperation> callback);

    /**
     * Patches this UnmuteParticipantOperation with a source
     *
     * @param sourceUnmuteParticipantOperation the source object with updates
     * @return the updated UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnmuteParticipantOperation patch(final UnmuteParticipantOperation sourceUnmuteParticipantOperation) throws ClientException;

    /**
     * Posts a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnmuteParticipantOperation newUnmuteParticipantOperation, final ICallback<UnmuteParticipantOperation> callback);

    /**
     * Posts a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the new object to create
     * @return the created UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnmuteParticipantOperation post(final UnmuteParticipantOperation newUnmuteParticipantOperation) throws ClientException;

    /**
     * Posts a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnmuteParticipantOperation newUnmuteParticipantOperation, final ICallback<UnmuteParticipantOperation> callback);

    /**
     * Posts a UnmuteParticipantOperation with a new object
     *
     * @param newUnmuteParticipantOperation the object to create/update
     * @return the created UnmuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnmuteParticipantOperation put(final UnmuteParticipantOperation newUnmuteParticipantOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnmuteParticipantOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnmuteParticipantOperationRequest expand(final String value);

}

