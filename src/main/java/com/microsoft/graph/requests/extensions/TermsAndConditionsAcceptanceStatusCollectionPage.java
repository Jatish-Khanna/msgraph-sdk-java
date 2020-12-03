// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status Collection Page.
 */
public class TermsAndConditionsAcceptanceStatusCollectionPage extends BaseCollectionPage<TermsAndConditionsAcceptanceStatus, TermsAndConditionsAcceptanceStatusCollectionRequestBuilder> {

    /**
     * A collection page for TermsAndConditionsAcceptanceStatus
     *
     * @param response the serialized TermsAndConditionsAcceptanceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TermsAndConditionsAcceptanceStatusCollectionPage(@Nonnull final TermsAndConditionsAcceptanceStatusCollectionResponse response, @Nonnull final TermsAndConditionsAcceptanceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TermsAndConditionsAcceptanceStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TermsAndConditionsAcceptanceStatusCollectionPage(@Nonnull final java.util.List<TermsAndConditionsAcceptanceStatus> pageContents, @Nullable final TermsAndConditionsAcceptanceStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
