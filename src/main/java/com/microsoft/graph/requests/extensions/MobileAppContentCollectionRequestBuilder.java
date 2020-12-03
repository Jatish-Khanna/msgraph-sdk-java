// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.models.extensions.MobileAppContent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Collection Request Builder.
 */
public class MobileAppContentCollectionRequestBuilder extends BaseCollectionRequestBuilder<MobileAppContent, MobileAppContentRequestBuilder, MobileAppContentCollectionResponse, MobileAppContentCollectionPage, MobileAppContentCollectionRequest> {

    /**
     * The request builder for this collection of ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContentRequestBuilder.class, MobileAppContentCollectionRequest.class);
    }


}
