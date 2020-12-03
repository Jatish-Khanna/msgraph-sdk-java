// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsoWeekNumRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Iso Week Num Request Builder.
 */
public class WorkbookFunctionsIsoWeekNumRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsIsoWeekNum
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public WorkbookFunctionsIsoWeekNumRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement date) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("date", date);
    }

    /**
     * Creates the WorkbookFunctionsIsoWeekNumRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsIsoWeekNumRequest instance
     */
    @Nonnull
    public WorkbookFunctionsIsoWeekNumRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsIsoWeekNumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsIsoWeekNumRequest instance
     */
    @Nonnull
    public WorkbookFunctionsIsoWeekNumRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsIsoWeekNumRequest request = new WorkbookFunctionsIsoWeekNumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("date")) {
            request.body.date = getParameter("date");
        }

        return request;
    }
}
