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
 * The class for the Base Event Dismiss Reminder Request Builder.
 */
public class BaseEventDismissReminderRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EventDismissReminder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEventDismissReminderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEventDismissReminderRequest
     *
     * @return The IEventDismissReminderRequest instance
     */
    public IEventDismissReminderRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventDismissReminderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IEventDismissReminderRequest instance
     */
    public IEventDismissReminderRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EventDismissReminderRequest request = new EventDismissReminderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}