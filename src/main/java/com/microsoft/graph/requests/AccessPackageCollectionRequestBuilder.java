// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignmentRequestRequirements;
import com.microsoft.graph.models.AccessPackageFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCollectionRequest;
import com.microsoft.graph.requests.AccessPackageFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.AccessPackageFilterByCurrentUserParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Collection Request Builder.
 */
public class AccessPackageCollectionRequestBuilder extends BaseCollectionRequestBuilder<AccessPackage, AccessPackageRequestBuilder, AccessPackageCollectionResponse, AccessPackageCollectionPage, AccessPackageCollectionRequest> {

    /**
     * The request builder for this collection of AccessPackageCatalog
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageRequestBuilder.class, AccessPackageCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AccessPackageFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final AccessPackageFilterByCurrentUserParameterSet parameters) {
        return new AccessPackageFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
