// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Partner Request.
 */
public interface IDeviceManagementPartnerRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementPartner> callback);

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @return the DeviceManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementPartner get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementPartner> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementPartner sourceDeviceManagementPartner, final ICallback<? super DeviceManagementPartner> callback);

    /**
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @return the updated DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementPartner patch(final DeviceManagementPartner sourceDeviceManagementPartner) throws ClientException;

    /**
     * Posts a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementPartner newDeviceManagementPartner, final ICallback<? super DeviceManagementPartner> callback);

    /**
     * Posts a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @return the created DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementPartner post(final DeviceManagementPartner newDeviceManagementPartner) throws ClientException;

    /**
     * Posts a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementPartner newDeviceManagementPartner, final ICallback<? super DeviceManagementPartner> callback);

    /**
     * Posts a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the object to create/update
     * @return the created DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementPartner put(final DeviceManagementPartner newDeviceManagementPartner) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementPartnerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementPartnerRequest expand(final String value);

}

