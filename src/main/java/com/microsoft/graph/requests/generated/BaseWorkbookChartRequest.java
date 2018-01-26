// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Request.
 */
public class BaseWorkbookChartRequest extends BaseRequest implements IBaseWorkbookChartRequest {

    /**
     * The request for the WorkbookChart
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChart from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChart> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChart from the service
     * @return The WorkbookChart from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChart get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChart with a source
     * @param sourceWorkbookChart The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChart sourceWorkbookChart, final ICallback<WorkbookChart> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChart);
    }

    /**
     * Patches this WorkbookChart with a source
     * @param sourceWorkbookChart The source object with updates
     * @return The updated WorkbookChart
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChart patch(final WorkbookChart sourceWorkbookChart) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     * @param newWorkbookChart The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChart newWorkbookChart, final ICallback<WorkbookChart> callback) {
        send(HttpMethod.POST, callback, newWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     * @param newWorkbookChart The new object to create
     * @return The created WorkbookChart
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChart post(final WorkbookChart newWorkbookChart) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChart);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartRequest)this;
     }

}
