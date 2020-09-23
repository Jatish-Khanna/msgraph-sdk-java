// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10TeamGeneralConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Team General Configuration Request.
 */
public interface IWindows10TeamGeneralConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10TeamGeneralConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    /**
     * Gets the Windows10TeamGeneralConfiguration from the service
     *
     * @return the Windows10TeamGeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10TeamGeneralConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10TeamGeneralConfiguration with a source
     *
     * @param sourceWindows10TeamGeneralConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration, final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    /**
     * Patches this Windows10TeamGeneralConfiguration with a source
     *
     * @param sourceWindows10TeamGeneralConfiguration the source object with updates
     * @return the updated Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10TeamGeneralConfiguration patch(final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration) throws ClientException;

    /**
     * Posts a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration, final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    /**
     * Posts a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the new object to create
     * @return the created Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10TeamGeneralConfiguration post(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) throws ClientException;

    /**
     * Posts a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration, final ICallback<? super Windows10TeamGeneralConfiguration> callback);

    /**
     * Posts a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the object to create/update
     * @return the created Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10TeamGeneralConfiguration put(final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10TeamGeneralConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10TeamGeneralConfigurationRequest expand(final String value);

}

