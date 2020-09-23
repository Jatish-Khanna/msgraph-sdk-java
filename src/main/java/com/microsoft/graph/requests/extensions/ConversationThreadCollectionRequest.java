// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionResponse;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequest;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Collection Request.
 */
public class ConversationThreadCollectionRequest extends BaseCollectionRequest<ConversationThreadCollectionResponse, IConversationThreadCollectionPage> implements IConversationThreadCollectionRequest {

    /**
     * The request builder for this collection of ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationThreadCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConversationThreadCollectionResponse.class, IConversationThreadCollectionPage.class);
    }

    public void get(final ICallback<? super IConversationThreadCollectionPage> callback) {
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

    public IConversationThreadCollectionPage get() throws ClientException {
        final ConversationThreadCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ConversationThread newConversationThread, final ICallback<? super ConversationThread> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConversationThread, callback);
    }

    public ConversationThread post(final ConversationThread newConversationThread) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConversationThread);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IConversationThreadCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IConversationThreadCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IConversationThreadCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IConversationThreadCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IConversationThreadCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ConversationThreadCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IConversationThreadCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IConversationThreadCollectionRequest)this;
    }
    public IConversationThreadCollectionPage buildFromResponse(final ConversationThreadCollectionResponse response) {
        final IConversationThreadCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConversationThreadCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConversationThreadCollectionPage page = new ConversationThreadCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
