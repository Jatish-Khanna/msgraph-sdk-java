// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxes;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axes Request.
 */
public class WorkbookChartAxesRequest extends BaseRequest implements IWorkbookChartAxesRequest {
	
    /**
     * The request for the WorkbookChartAxes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxes.class);
    }

    /**
     * Gets the WorkbookChartAxes from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartAxes> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxes from the service
     *
     * @return the WorkbookChartAxes from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxes get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartAxes> callback) {
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
     * Patches this WorkbookChartAxes with a source
     *
     * @param sourceWorkbookChartAxes the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartAxes sourceWorkbookChartAxes, final ICallback<? super WorkbookChartAxes> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxes);
    }

    /**
     * Patches this WorkbookChartAxes with a source
     *
     * @param sourceWorkbookChartAxes the source object with updates
     * @return the updated WorkbookChartAxes
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxes patch(final WorkbookChartAxes sourceWorkbookChartAxes) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartAxes newWorkbookChartAxes, final ICallback<? super WorkbookChartAxes> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the new object to create
     * @return the created WorkbookChartAxes
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxes post(final WorkbookChartAxes newWorkbookChartAxes) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartAxes newWorkbookChartAxes, final ICallback<? super WorkbookChartAxes> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the object to create/update
     * @return the created WorkbookChartAxes
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxes put(final WorkbookChartAxes newWorkbookChartAxes) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxes);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartAxesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartAxesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartAxesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartAxesRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookChartAxesRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookChartAxesRequest)this;
     }

}

