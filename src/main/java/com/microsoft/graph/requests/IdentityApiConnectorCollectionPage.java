// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.IdentityApiConnector;
import com.microsoft.graph.requests.IdentityApiConnectorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.IdentityApiConnectorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Api Connector Collection Page.
 */
public class IdentityApiConnectorCollectionPage extends BaseCollectionPage<IdentityApiConnector, IdentityApiConnectorCollectionRequestBuilder> {

    /**
     * A collection page for IdentityApiConnector
     *
     * @param response the serialized IdentityApiConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityApiConnectorCollectionPage(@Nonnull final IdentityApiConnectorCollectionResponse response, @Nonnull final IdentityApiConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IdentityApiConnector
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityApiConnectorCollectionPage(@Nonnull final java.util.List<IdentityApiConnector> pageContents, @Nullable final IdentityApiConnectorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
