// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserActivity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Activity Request.
 */
public interface IUserActivityRequest extends IHttpRequest {

    /**
     * Gets the UserActivity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserActivity> callback);

    /**
     * Gets the UserActivity from the service
     *
     * @return the UserActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserActivity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserActivity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserActivity with a source
     *
     * @param sourceUserActivity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserActivity sourceUserActivity, final ICallback<UserActivity> callback);

    /**
     * Patches this UserActivity with a source
     *
     * @param sourceUserActivity the source object with updates
     * @return the updated UserActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserActivity patch(final UserActivity sourceUserActivity) throws ClientException;

    /**
     * Posts a UserActivity with a new object
     *
     * @param newUserActivity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserActivity newUserActivity, final ICallback<UserActivity> callback);

    /**
     * Posts a UserActivity with a new object
     *
     * @param newUserActivity the new object to create
     * @return the created UserActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserActivity post(final UserActivity newUserActivity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserActivityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserActivityRequest expand(final String value);

}
