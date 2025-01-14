// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentityAssignUserToDeviceParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Assign User To Device Request Builder.
 */
public class WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder extends BaseActionRequestBuilder<WindowsAutopilotDeviceIdentity> {

    /**
     * The request builder for this WindowsAutopilotDeviceIdentityAssignUserToDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private WindowsAutopilotDeviceIdentityAssignUserToDeviceParameterSet body;
    /**
     * The request builder for this WindowsAutopilotDeviceIdentityAssignUserToDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WindowsAutopilotDeviceIdentityAssignUserToDeviceParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest request = new WindowsAutopilotDeviceIdentityAssignUserToDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
