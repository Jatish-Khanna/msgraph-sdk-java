// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Entity Hierarchy Model Request.
 */
public interface IOnenoteEntityHierarchyModelRequest extends IHttpRequest {

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OnenoteEntityHierarchyModel> callback);

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @return the OnenoteEntityHierarchyModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityHierarchyModel get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OnenoteEntityHierarchyModel> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback);

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @return the updated OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityHierarchyModel patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) throws ClientException;

    /**
     * Posts a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback);

    /**
     * Posts a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityHierarchyModel post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException;

    /**
     * Posts a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback);

    /**
     * Posts a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityHierarchyModel put(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteEntityHierarchyModelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteEntityHierarchyModelRequest expand(final String value);

}

