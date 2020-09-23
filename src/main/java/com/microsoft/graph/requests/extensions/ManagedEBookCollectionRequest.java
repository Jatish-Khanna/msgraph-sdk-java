// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Collection Request.
 */
public class ManagedEBookCollectionRequest extends BaseCollectionRequest<ManagedEBookCollectionResponse, IManagedEBookCollectionPage> implements IManagedEBookCollectionRequest {

    /**
     * The request builder for this collection of ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBookCollectionResponse.class, IManagedEBookCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedEBookCollectionPage> callback) {
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

    public IManagedEBookCollectionPage get() throws ClientException {
        final ManagedEBookCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedEBook newManagedEBook, final ICallback<? super ManagedEBook> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedEBookRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedEBook, callback);
    }

    public ManagedEBook post(final ManagedEBook newManagedEBook) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedEBookRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedEBook);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedEBookCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedEBookCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedEBookCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedEBookCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedEBookCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedEBookCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedEBookCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedEBookCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedEBookCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedEBookCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedEBookCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedEBookCollectionRequest)this;
    }
    public IManagedEBookCollectionPage buildFromResponse(final ManagedEBookCollectionResponse response) {
        final IManagedEBookCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedEBookCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedEBookCollectionPage page = new ManagedEBookCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
