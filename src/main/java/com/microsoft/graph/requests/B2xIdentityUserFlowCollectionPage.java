// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.B2xIdentityUserFlow;
import com.microsoft.graph.requests.B2xIdentityUserFlowCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.B2xIdentityUserFlowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2x Identity User Flow Collection Page.
 */
public class B2xIdentityUserFlowCollectionPage extends BaseCollectionPage<B2xIdentityUserFlow, B2xIdentityUserFlowCollectionRequestBuilder> {

    /**
     * A collection page for B2xIdentityUserFlow
     *
     * @param response the serialized B2xIdentityUserFlowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public B2xIdentityUserFlowCollectionPage(@Nonnull final B2xIdentityUserFlowCollectionResponse response, @Nonnull final B2xIdentityUserFlowCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for B2xIdentityUserFlow
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public B2xIdentityUserFlowCollectionPage(@Nonnull final java.util.List<B2xIdentityUserFlow> pageContents, @Nullable final B2xIdentityUserFlowCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
