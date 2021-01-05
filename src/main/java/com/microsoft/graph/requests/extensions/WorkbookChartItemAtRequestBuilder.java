// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Item At Request Builder.
 */
public class WorkbookChartItemAtRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookChartItemAtRequestBuilder {

    /**
     * The request builder for this WorkbookChartItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookChartItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookChartItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartItemAtRequest instance
     */
    public IWorkbookChartItemAtRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookChartItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartItemAtRequest instance
     */
    public IWorkbookChartItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartItemAtRequest request = new WorkbookChartItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the IWorkbookChartAxesRequestBuilder instance
     */
    public IWorkbookChartAxesRequestBuilder axes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the IWorkbookChartDataLabelsRequestBuilder instance
     */
    public IWorkbookChartDataLabelsRequestBuilder dataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the IWorkbookChartAreaFormatRequestBuilder instance
     */
    public IWorkbookChartAreaFormatRequestBuilder format() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the IWorkbookChartLegendRequestBuilder instance
     */
    public IWorkbookChartLegendRequestBuilder legend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    public IWorkbookChartSeriesCollectionRequestBuilder series() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    public IWorkbookChartSeriesRequestBuilder series(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the IWorkbookChartTitleRequestBuilder instance
     */
    public IWorkbookChartTitleRequestBuilder title() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
