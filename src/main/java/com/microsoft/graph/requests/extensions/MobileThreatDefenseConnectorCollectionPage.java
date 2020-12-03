// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector Collection Page.
 */
public class MobileThreatDefenseConnectorCollectionPage extends BaseCollectionPage<MobileThreatDefenseConnector, MobileThreatDefenseConnectorCollectionRequestBuilder> {

    /**
     * A collection page for MobileThreatDefenseConnector
     *
     * @param response the serialized MobileThreatDefenseConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileThreatDefenseConnectorCollectionPage(@Nonnull final MobileThreatDefenseConnectorCollectionResponse response, @Nonnull final MobileThreatDefenseConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileThreatDefenseConnector
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileThreatDefenseConnectorCollectionPage(@Nonnull final java.util.List<MobileThreatDefenseConnector> pageContents, @Nullable final MobileThreatDefenseConnectorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
