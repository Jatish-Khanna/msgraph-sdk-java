// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.generated.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.CalendarCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Collection Request.
 */
public class CalendarCollectionRequest extends BaseCollectionRequest<Calendar, CalendarCollectionResponse, CalendarCollectionPage> {

    /**
     * The request builder for this collection of Calendar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarCollectionResponse.class, CalendarCollectionPage.class, CalendarCollectionRequestBuilder.class);
    }

    /**
     * Creates a new Calendar
     * @param newCalendar the Calendar to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final Calendar newCalendar, @Nonnull final ICallback<? super Calendar> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CalendarRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCalendar, callback);
    }

    /**
     * Creates a new Calendar
     * @param newCalendar the Calendar to create
     * @return the newly created object
     */
    @Nonnull
    public Calendar post(@Nonnull final Calendar newCalendar) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CalendarRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCalendar);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CalendarCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
