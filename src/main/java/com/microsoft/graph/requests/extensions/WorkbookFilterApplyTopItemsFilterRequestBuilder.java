// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyTopItemsFilterRequest;
import com.microsoft.graph.models.extensions.WorkbookFilter;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Top Items Filter Request Builder.
 */
public class WorkbookFilterApplyTopItemsFilterRequestBuilder extends BaseActionRequestBuilder<WorkbookFilter> {

    /**
     * The request builder for this WorkbookFilterApplyTopItemsFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param count the count
     */
    public WorkbookFilterApplyTopItemsFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Integer count) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("count", count);
    }

    /**
     * Creates the WorkbookFilterApplyTopItemsFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyTopItemsFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyTopItemsFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyTopItemsFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyTopItemsFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyTopItemsFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyTopItemsFilterRequest request = new WorkbookFilterApplyTopItemsFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("count")) {
            request.body.count = getParameter("count");
        }

        return request;
    }
}
