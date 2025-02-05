// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookRangeView;
import com.microsoft.graph.models.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Request.
 */
public class WorkbookRangeViewRequest extends BaseRequest<WorkbookRangeView> {
	
    /**
     * The request for the WorkbookRangeView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeView.class);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeView> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @return the WorkbookRangeView from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeView> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookRangeView delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeView> patchAsync(@Nonnull final WorkbookRangeView sourceWorkbookRangeView) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookRangeView);
    }

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @return the updated WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView patch(@Nonnull final WorkbookRangeView sourceWorkbookRangeView) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeView> postAsync(@Nonnull final WorkbookRangeView newWorkbookRangeView) {
        return sendAsync(HttpMethod.POST, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView post(@Nonnull final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeView> putAsync(@Nonnull final WorkbookRangeView newWorkbookRangeView) {
        return sendAsync(HttpMethod.PUT, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the object to create/update
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView put(@Nonnull final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeView);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookRangeViewRequest select(@Nonnull final String value) {
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
     public WorkbookRangeViewRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

