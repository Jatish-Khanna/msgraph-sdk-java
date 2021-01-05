// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Request.
 */
public class WorkbookPivotTableRequest extends BaseRequest implements IWorkbookPivotTableRequest {
	
    /**
     * The request for the WorkbookPivotTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookPivotTableRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookPivotTable.class);
    }

    /**
     * Gets the WorkbookPivotTable from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookPivotTable> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookPivotTable from the service
     *
     * @return the WorkbookPivotTable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookPivotTable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookPivotTable> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookPivotTable with a source
     *
     * @param sourceWorkbookPivotTable the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookPivotTable sourceWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookPivotTable);
    }

    /**
     * Patches this WorkbookPivotTable with a source
     *
     * @param sourceWorkbookPivotTable the source object with updates
     * @return the updated WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookPivotTable patch(final WorkbookPivotTable sourceWorkbookPivotTable) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookPivotTable);
    }

    /**
     * Creates a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookPivotTable newWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback) {
        send(HttpMethod.POST, callback, newWorkbookPivotTable);
    }

    /**
     * Creates a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the new object to create
     * @return the created WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookPivotTable post(final WorkbookPivotTable newWorkbookPivotTable) throws ClientException {
        return send(HttpMethod.POST, newWorkbookPivotTable);
    }

    /**
     * Creates a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookPivotTable newWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback) {
        send(HttpMethod.PUT, callback, newWorkbookPivotTable);
    }

    /**
     * Creates a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the object to create/update
     * @return the created WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookPivotTable put(final WorkbookPivotTable newWorkbookPivotTable) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookPivotTable);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookPivotTableRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookPivotTableRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookPivotTableRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookPivotTableRequest)this;
     }

}

