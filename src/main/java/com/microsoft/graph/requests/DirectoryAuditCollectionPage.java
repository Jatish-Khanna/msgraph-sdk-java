// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DirectoryAudit;
import com.microsoft.graph.requests.DirectoryAuditCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DirectoryAuditCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Collection Page.
 */
public class DirectoryAuditCollectionPage extends BaseCollectionPage<DirectoryAudit, DirectoryAuditCollectionRequestBuilder> {

    /**
     * A collection page for DirectoryAudit
     *
     * @param response the serialized DirectoryAuditCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryAuditCollectionPage(@Nonnull final DirectoryAuditCollectionResponse response, @Nonnull final DirectoryAuditCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DirectoryAudit
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectoryAuditCollectionPage(@Nonnull final java.util.List<DirectoryAudit> pageContents, @Nullable final DirectoryAuditCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}