// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICalendarAllowedCalendarSharingRolesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarAllowedCalendarSharingRolesCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarAllowedCalendarSharingRolesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Allowed Calendar Sharing Roles Collection Request.
 */
public class CalendarAllowedCalendarSharingRolesCollectionRequest extends BaseCollectionRequest<CalendarAllowedCalendarSharingRolesCollectionResponse, ICalendarAllowedCalendarSharingRolesCollectionPage> implements ICalendarAllowedCalendarSharingRolesCollectionRequest {


    /**
     * The request for this CalendarAllowedCalendarSharingRoles
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarAllowedCalendarSharingRolesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarAllowedCalendarSharingRolesCollectionResponse.class, ICalendarAllowedCalendarSharingRolesCollectionPage.class);
    }


    public void get(final ICallback<? super ICalendarAllowedCalendarSharingRolesCollectionPage> callback) {
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

    public ICalendarAllowedCalendarSharingRolesCollectionPage get() throws ClientException {
        final CalendarAllowedCalendarSharingRolesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ICalendarAllowedCalendarSharingRolesCollectionPage buildFromResponse(final CalendarAllowedCalendarSharingRolesCollectionResponse response) {
        final ICalendarAllowedCalendarSharingRolesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CalendarAllowedCalendarSharingRolesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final ICalendarAllowedCalendarSharingRolesCollectionPage page = new CalendarAllowedCalendarSharingRolesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarAllowedCalendarSharingRolesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ICalendarAllowedCalendarSharingRolesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICalendarAllowedCalendarSharingRolesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ICalendarAllowedCalendarSharingRolesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarAllowedCalendarSharingRolesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ICalendarAllowedCalendarSharingRolesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICalendarAllowedCalendarSharingRolesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ICalendarAllowedCalendarSharingRolesCollectionRequest)this;
    }

}
