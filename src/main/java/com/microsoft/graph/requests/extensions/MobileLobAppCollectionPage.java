// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileLobApp;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Lob App Collection Page.
 */
public class MobileLobAppCollectionPage extends BaseCollectionPage<MobileLobApp, MobileLobAppCollectionRequestBuilder> {

    /**
     * A collection page for MobileLobApp
     *
     * @param response the serialized MobileLobAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileLobAppCollectionPage(@Nonnull final MobileLobAppCollectionResponse response, @Nonnull final MobileLobAppCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileLobApp
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileLobAppCollectionPage(@Nonnull final java.util.List<MobileLobApp> pageContents, @Nullable final MobileLobAppCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
