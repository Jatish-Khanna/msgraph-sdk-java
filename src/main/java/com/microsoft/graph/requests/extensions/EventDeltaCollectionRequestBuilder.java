// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Event;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.EventDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.EventDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Delta Collection Request Builder.
 */
public class EventDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Event, EventDeltaCollectionRequestBuilder, EventDeltaCollectionResponse, EventDeltaCollectionPage, EventDeltaCollectionRequest> {

    /**
     * The request builder for this collection of Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventDeltaCollectionRequestBuilder.class, EventDeltaCollectionRequest.class);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EventDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public EventDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EventDeltaCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
