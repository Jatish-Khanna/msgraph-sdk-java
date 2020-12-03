// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status Collection Request Builder.
 */
public class TermsAndConditionsAcceptanceStatusCollectionRequestBuilder extends BaseCollectionRequestBuilder<TermsAndConditionsAcceptanceStatus, TermsAndConditionsAcceptanceStatusRequestBuilder, TermsAndConditionsAcceptanceStatusCollectionResponse, TermsAndConditionsAcceptanceStatusCollectionPage, TermsAndConditionsAcceptanceStatusCollectionRequest> {

    /**
     * The request builder for this collection of TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditionsAcceptanceStatusRequestBuilder.class, TermsAndConditionsAcceptanceStatusCollectionRequest.class);
    }


}
