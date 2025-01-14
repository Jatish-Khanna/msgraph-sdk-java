// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartAxisTitle;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Title Request.
 */
public class WorkbookChartAxisTitleRequest extends BaseRequest<WorkbookChartAxisTitle> {
	
    /**
     * The request for the WorkbookChartAxisTitle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisTitleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxisTitle.class);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxisTitle> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @return the WorkbookChartAxisTitle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxisTitle> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartAxisTitle delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxisTitle> patchAsync(@Nonnull final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartAxisTitle);
    }

    /**
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @return the updated WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitle patch(@Nonnull final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxisTitle> postAsync(@Nonnull final WorkbookChartAxisTitle newWorkbookChartAxisTitle) {
        return sendAsync(HttpMethod.POST, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @return the created WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitle post(@Nonnull final WorkbookChartAxisTitle newWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxisTitle> putAsync(@Nonnull final WorkbookChartAxisTitle newWorkbookChartAxisTitle) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the object to create/update
     * @return the created WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitle put(@Nonnull final WorkbookChartAxisTitle newWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxisTitle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAxisTitleRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAxisTitleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

