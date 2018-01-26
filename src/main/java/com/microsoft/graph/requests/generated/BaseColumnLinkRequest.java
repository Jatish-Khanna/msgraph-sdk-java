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
 * The class for the Base Column Link Request.
 */
public class BaseColumnLinkRequest extends BaseRequest implements IBaseColumnLinkRequest {

    /**
     * The request for the ColumnLink
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseColumnLinkRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ColumnLink from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ColumnLink> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ColumnLink from the service
     * @return The ColumnLink from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnLink get() throws ClientException {
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
     * Patches this ColumnLink with a source
     * @param sourceColumnLink The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ColumnLink sourceColumnLink, final ICallback<ColumnLink> callback) {
        send(HttpMethod.PATCH, callback, sourceColumnLink);
    }

    /**
     * Patches this ColumnLink with a source
     * @param sourceColumnLink The source object with updates
     * @return The updated ColumnLink
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnLink patch(final ColumnLink sourceColumnLink) throws ClientException {
        return send(HttpMethod.PATCH, sourceColumnLink);
    }

    /**
     * Creates a ColumnLink with a new object
     * @param newColumnLink The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ColumnLink newColumnLink, final ICallback<ColumnLink> callback) {
        send(HttpMethod.POST, callback, newColumnLink);
    }

    /**
     * Creates a ColumnLink with a new object
     * @param newColumnLink The new object to create
     * @return The created ColumnLink
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnLink post(final ColumnLink newColumnLink) throws ClientException {
        return send(HttpMethod.POST, newColumnLink);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IColumnLinkRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ColumnLinkRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IColumnLinkRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ColumnLinkRequest)this;
     }

}
