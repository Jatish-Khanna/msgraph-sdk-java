// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookTableConvertToRangeRequest;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Convert To Range Request Builder.
 */
public class WorkbookTableConvertToRangeRequestBuilder extends BaseActionRequestBuilder<WorkbookRange> {

    /**
     * The request builder for this WorkbookTableConvertToRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableConvertToRangeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookTableConvertToRangeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableConvertToRangeRequest instance
     */
    @Nonnull
    public WorkbookTableConvertToRangeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookTableConvertToRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableConvertToRangeRequest instance
     */
    @Nonnull
    public WorkbookTableConvertToRangeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookTableConvertToRangeRequest request = new WorkbookTableConvertToRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
