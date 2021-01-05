// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNominalRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNominalRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Nominal Request Builder.
 */
public class WorkbookFunctionsNominalRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsNominalRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNominal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param effectRate the effectRate
     * @param npery the npery
     */
    public WorkbookFunctionsNominalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement effectRate, final com.google.gson.JsonElement npery) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("effectRate", effectRate);
        bodyParams.put("npery", npery);
    }

    /**
     * Creates the IWorkbookFunctionsNominalRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNominalRequest instance
     */
    public IWorkbookFunctionsNominalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsNominalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNominalRequest instance
     */
    public IWorkbookFunctionsNominalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNominalRequest request = new WorkbookFunctionsNominalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("effectRate")) {
            request.body.effectRate = getParameter("effectRate");
        }

        if (hasParameter("npery")) {
            request.body.npery = getParameter("npery");
        }

        return request;
    }
}
