// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EditionUpgradeConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Edition Upgrade Configuration Request.
 */
public interface IEditionUpgradeConfigurationRequest extends IHttpRequest {

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EditionUpgradeConfiguration> callback);

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @return the EditionUpgradeConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EditionUpgradeConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EditionUpgradeConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration, final ICallback<EditionUpgradeConfiguration> callback);

    /**
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @return the updated EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EditionUpgradeConfiguration patch(final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration) throws ClientException;

    /**
     * Posts a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EditionUpgradeConfiguration newEditionUpgradeConfiguration, final ICallback<EditionUpgradeConfiguration> callback);

    /**
     * Posts a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EditionUpgradeConfiguration post(final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException;

    /**
     * Posts a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EditionUpgradeConfiguration newEditionUpgradeConfiguration, final ICallback<EditionUpgradeConfiguration> callback);

    /**
     * Posts a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EditionUpgradeConfiguration put(final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEditionUpgradeConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEditionUpgradeConfigurationRequest expand(final String value);

}

