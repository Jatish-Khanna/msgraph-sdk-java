// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.UserExportPersonalDataRequest;
import com.microsoft.graph.models.User;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.UserExportPersonalDataParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Export Personal Data Request Builder.
 */
public class UserExportPersonalDataRequestBuilder extends BaseActionRequestBuilder<User> {

    /**
     * The request builder for this UserExportPersonalData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExportPersonalDataRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private UserExportPersonalDataParameterSet body;
    /**
     * The request builder for this UserExportPersonalData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserExportPersonalDataRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserExportPersonalDataParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the UserExportPersonalDataRequest
     *
     * @param requestOptions the options for the request
     * @return the UserExportPersonalDataRequest instance
     */
    @Nonnull
    public UserExportPersonalDataRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserExportPersonalDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserExportPersonalDataRequest instance
     */
    @Nonnull
    public UserExportPersonalDataRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserExportPersonalDataRequest request = new UserExportPersonalDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
