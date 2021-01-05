// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.requests.extensions.ITrendingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TrendingCollectionPage;
import com.microsoft.graph.requests.extensions.TrendingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending Collection Page.
 */
public class TrendingCollectionPage extends BaseCollectionPage<Trending, ITrendingCollectionRequestBuilder> implements ITrendingCollectionPage {

    /**
     * A collection page for Trending
     *
     * @param response the serialized TrendingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TrendingCollectionPage(final TrendingCollectionResponse response, final ITrendingCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
