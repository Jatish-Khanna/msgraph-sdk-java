// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignRequest;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Assign Request Builder.
 */
public class ManagedDeviceMobileAppConfigurationAssignRequestBuilder extends BaseActionRequestBuilder implements IManagedDeviceMobileAppConfigurationAssignRequestBuilder {

    /**
     * The request builder for this ManagedDeviceMobileAppConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public ManagedDeviceMobileAppConfigurationAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ManagedDeviceMobileAppConfigurationAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the IManagedDeviceMobileAppConfigurationAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceMobileAppConfigurationAssignRequest instance
     */
    public IManagedDeviceMobileAppConfigurationAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedDeviceMobileAppConfigurationAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceMobileAppConfigurationAssignRequest instance
     */
    public IManagedDeviceMobileAppConfigurationAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceMobileAppConfigurationAssignRequest request = new ManagedDeviceMobileAppConfigurationAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}
