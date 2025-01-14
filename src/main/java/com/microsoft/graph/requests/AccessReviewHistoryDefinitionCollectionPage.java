// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AccessReviewHistoryDefinition;
import com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review History Definition Collection Page.
 */
public class AccessReviewHistoryDefinitionCollectionPage extends BaseCollectionPage<AccessReviewHistoryDefinition, AccessReviewHistoryDefinitionCollectionRequestBuilder> {

    /**
     * A collection page for AccessReviewHistoryDefinition
     *
     * @param response the serialized AccessReviewHistoryDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessReviewHistoryDefinitionCollectionPage(@Nonnull final AccessReviewHistoryDefinitionCollectionResponse response, @Nonnull final AccessReviewHistoryDefinitionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessReviewHistoryDefinition
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessReviewHistoryDefinitionCollectionPage(@Nonnull final java.util.List<AccessReviewHistoryDefinition> pageContents, @Nullable final AccessReviewHistoryDefinitionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
