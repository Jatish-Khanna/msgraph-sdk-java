// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContactFolder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.ContactFolderDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactFolderDeltaCollectionPage;
import com.microsoft.graph.requests.ContactFolderDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Delta Collection Page.
 */
public class ContactFolderDeltaCollectionPage extends DeltaCollectionPage<ContactFolder, ContactFolderDeltaCollectionRequestBuilder> {

    /**
     * A collection page for ContactFolder.
     *
     * @param response The serialized ContactFolderDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ContactFolderDeltaCollectionPage(@Nonnull final ContactFolderDeltaCollectionResponse response, @Nonnull final ContactFolderDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ContactFolderDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ContactFolderDeltaCollectionPage(@Nonnull final java.util.List<ContactFolder> pageContents, @Nullable final ContactFolderDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
