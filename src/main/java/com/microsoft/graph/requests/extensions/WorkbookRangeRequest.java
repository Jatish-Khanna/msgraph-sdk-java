// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Request.
 */
public class WorkbookRangeRequest extends BaseRequest implements IWorkbookRangeRequest {
	
    /**
     * The request for the WorkbookRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Gets the WorkbookRange from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange from the service
     *
     * @return the WorkbookRange from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookRange> callback) {
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
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRange sourceWorkbookRange, final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRange);
    }

    /**
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @return the updated WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange patch(final WorkbookRange sourceWorkbookRange) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRange newWorkbookRange, final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.POST, callback, newWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @return the created WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange post(final WorkbookRange newWorkbookRange) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookRange newWorkbookRange, final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.PUT, callback, newWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the object to create/update
     * @return the created WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange put(final WorkbookRange newWorkbookRange) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRange);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRangeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookRangeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRangeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookRangeRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWorkbookRangeRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WorkbookRangeRequest)this;
     }

}

