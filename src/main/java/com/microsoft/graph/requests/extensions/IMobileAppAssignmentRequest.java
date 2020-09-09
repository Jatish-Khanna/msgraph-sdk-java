// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Assignment Request.
 */
public interface IMobileAppAssignmentRequest extends IHttpRequest {

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppAssignment> callback);

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @return the MobileAppAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppAssignment sourceMobileAppAssignment, final ICallback<MobileAppAssignment> callback);

    /**
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @return the updated MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppAssignment patch(final MobileAppAssignment sourceMobileAppAssignment) throws ClientException;

    /**
     * Posts a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppAssignment newMobileAppAssignment, final ICallback<MobileAppAssignment> callback);

    /**
     * Posts a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppAssignment post(final MobileAppAssignment newMobileAppAssignment) throws ClientException;

    /**
     * Posts a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileAppAssignment newMobileAppAssignment, final ICallback<MobileAppAssignment> callback);

    /**
     * Posts a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppAssignment put(final MobileAppAssignment newMobileAppAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppAssignmentRequest expand(final String value);

}

