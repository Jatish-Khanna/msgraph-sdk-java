// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTimeRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Time Request Builder.
 */
public class WorkbookFunctionsTimeRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsTime
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param hour the hour
     * @param minute the minute
     * @param second the second
     */
    public WorkbookFunctionsTimeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement hour, @Nullable final com.google.gson.JsonElement minute, @Nullable final com.google.gson.JsonElement second) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("hour", hour);
        bodyParams.put("minute", minute);
        bodyParams.put("second", second);
    }

    /**
     * Creates the WorkbookFunctionsTimeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsTimeRequest instance
     */
    @Nonnull
    public WorkbookFunctionsTimeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsTimeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsTimeRequest instance
     */
    @Nonnull
    public WorkbookFunctionsTimeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsTimeRequest request = new WorkbookFunctionsTimeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("hour")) {
            request.body.hour = getParameter("hour");
        }

        if (hasParameter("minute")) {
            request.body.minute = getParameter("minute");
        }

        if (hasParameter("second")) {
            request.body.second = getParameter("second");
        }

        return request;
    }
}
