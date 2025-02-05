// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.models.B2xIdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.B2xIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.B2xIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.B2xIdentityUserFlowCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2x Identity User Flow Collection Request Builder.
 */
public class B2xIdentityUserFlowCollectionRequestBuilder extends BaseCollectionRequestBuilder<B2xIdentityUserFlow, B2xIdentityUserFlowRequestBuilder, B2xIdentityUserFlowCollectionResponse, B2xIdentityUserFlowCollectionPage, B2xIdentityUserFlowCollectionRequest> {

    /**
     * The request builder for this collection of IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2xIdentityUserFlowCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, B2xIdentityUserFlowRequestBuilder.class, B2xIdentityUserFlowCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
