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
 * The class for the Base Workbook Functions Binom_Inv Request Builder.
 */
public class BaseWorkbookFunctionsBinom_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Inv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBinom_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement alpha) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("trials", trials);
        bodyParams.put("probabilityS", probabilityS);
        bodyParams.put("alpha", alpha);
    }

    /**
     * Creates the IWorkbookFunctionsBinom_InvRequest
     *
     * @return The IWorkbookFunctionsBinom_InvRequest instance
     */
    public IWorkbookFunctionsBinom_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBinom_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBinom_InvRequest instance
     */
    public IWorkbookFunctionsBinom_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBinom_InvRequest request = new WorkbookFunctionsBinom_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("trials")) {
            request.body.trials = getParameter("trials");
        }

        if (hasParameter("probabilityS")) {
            request.body.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        return request;
    }
}