// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupSubscribeByMailRequest;
import com.microsoft.graph.models.Group;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Subscribe By Mail Request Builder.
 */
public class GroupSubscribeByMailRequestBuilder extends BaseActionRequestBuilder<Group> {

    /**
     * The request builder for this GroupSubscribeByMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupSubscribeByMailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the GroupSubscribeByMailRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupSubscribeByMailRequest instance
     */
    @Nonnull
    public GroupSubscribeByMailRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupSubscribeByMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupSubscribeByMailRequest instance
     */
    @Nonnull
    public GroupSubscribeByMailRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupSubscribeByMailRequest request = new GroupSubscribeByMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
