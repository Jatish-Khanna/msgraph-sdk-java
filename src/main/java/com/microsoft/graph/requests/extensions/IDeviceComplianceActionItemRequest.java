// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Action Item Request.
 */
public interface IDeviceComplianceActionItemRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceComplianceActionItem> callback);

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @return the DeviceComplianceActionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceActionItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceComplianceActionItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceActionItem sourceDeviceComplianceActionItem, final ICallback<? super DeviceComplianceActionItem> callback);

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @return the updated DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceActionItem patch(final DeviceComplianceActionItem sourceDeviceComplianceActionItem) throws ClientException;

    /**
     * Posts a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<? super DeviceComplianceActionItem> callback);

    /**
     * Posts a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException;

    /**
     * Posts a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<? super DeviceComplianceActionItem> callback);

    /**
     * Posts a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceActionItem put(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceActionItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceActionItemRequest expand(final String value);

}

