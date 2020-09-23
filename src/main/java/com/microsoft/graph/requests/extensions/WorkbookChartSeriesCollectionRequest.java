// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Collection Request.
 */
public class WorkbookChartSeriesCollectionRequest extends BaseCollectionRequest<WorkbookChartSeriesCollectionResponse, IWorkbookChartSeriesCollectionPage> implements IWorkbookChartSeriesCollectionRequest {

    /**
     * The request builder for this collection of WorkbookChartSeries
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartSeriesCollectionResponse.class, IWorkbookChartSeriesCollectionPage.class);
    }

    public void get(final ICallback<? super IWorkbookChartSeriesCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookChartSeriesCollectionPage get() throws ClientException {
        final WorkbookChartSeriesCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<? super WorkbookChartSeries> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookChartSeriesRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookChartSeries, callback);
    }

    public WorkbookChartSeries post(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookChartSeriesRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookChartSeries);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookChartSeriesCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookChartSeriesCollectionRequest)this;
    }
    public IWorkbookChartSeriesCollectionPage buildFromResponse(final WorkbookChartSeriesCollectionResponse response) {
        final IWorkbookChartSeriesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookChartSeriesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookChartSeriesCollectionPage page = new WorkbookChartSeriesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
