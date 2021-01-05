// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Teams User Activity Counts Request Builder.
 */
public interface IReportRootGetTeamsUserActivityCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsUserActivityCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityCountsRequest instance
     */
    IReportRootGetTeamsUserActivityCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetTeamsUserActivityCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityCountsRequest instance
     */
    IReportRootGetTeamsUserActivityCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
