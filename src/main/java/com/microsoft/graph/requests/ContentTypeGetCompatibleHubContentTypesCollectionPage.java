// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContentType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ContentTypeGetCompatibleHubContentTypesCollectionRequestBuilder;
import com.microsoft.graph.requests.ContentTypeGetCompatibleHubContentTypesCollectionPage;
import com.microsoft.graph.requests.ContentTypeGetCompatibleHubContentTypesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Get Compatible Hub Content Types Collection Page.
 */
public class ContentTypeGetCompatibleHubContentTypesCollectionPage extends BaseCollectionPage<ContentType, ContentTypeGetCompatibleHubContentTypesCollectionRequestBuilder> {

    /**
     * A collection page for ContentType.
     *
     * @param response The serialized ContentTypeGetCompatibleHubContentTypesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ContentTypeGetCompatibleHubContentTypesCollectionPage(@Nonnull final ContentTypeGetCompatibleHubContentTypesCollectionResponse response, @Nonnull final ContentTypeGetCompatibleHubContentTypesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ContentTypeGetCompatibleHubContentTypes
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ContentTypeGetCompatibleHubContentTypesCollectionPage(@Nonnull final java.util.List<ContentType> pageContents, @Nullable final ContentTypeGetCompatibleHubContentTypesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
