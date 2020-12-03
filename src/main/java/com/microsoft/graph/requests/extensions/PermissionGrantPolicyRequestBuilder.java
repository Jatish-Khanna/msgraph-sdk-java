// Template Source: Templates\Java\requests_extensions\BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy Request Builder.
 */
public class PermissionGrantPolicyRequestBuilder extends BaseRequestBuilder<PermissionGrantPolicy> {

    /**
     * The request builder for the PermissionGrantPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PermissionGrantPolicyRequest instance
     */
    @Nonnull
    public PermissionGrantPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PermissionGrantPolicyRequest instance
     */
    @Nonnull
    public PermissionGrantPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PermissionGrantConditionSet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PermissionGrantConditionSetCollectionRequestBuilder excludes() {
        return new PermissionGrantConditionSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("excludes"), getClient(), null);
    }

    /**
     * Gets a request builder for the PermissionGrantConditionSet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PermissionGrantConditionSetRequestBuilder excludes(@Nonnull final String id) {
        return new PermissionGrantConditionSetRequestBuilder(getRequestUrlWithAdditionalSegment("excludes") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PermissionGrantConditionSet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PermissionGrantConditionSetCollectionRequestBuilder includes() {
        return new PermissionGrantConditionSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("includes"), getClient(), null);
    }

    /**
     * Gets a request builder for the PermissionGrantConditionSet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PermissionGrantConditionSetRequestBuilder includes(@Nonnull final String id) {
        return new PermissionGrantConditionSetRequestBuilder(getRequestUrlWithAdditionalSegment("includes") + "/" + id, getClient(), null);
    }
}
