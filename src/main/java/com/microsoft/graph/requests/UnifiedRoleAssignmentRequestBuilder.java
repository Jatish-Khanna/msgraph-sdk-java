// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request Builder.
 */
public class UnifiedRoleAssignmentRequestBuilder extends BaseRequestBuilder<UnifiedRoleAssignment> {

    /**
     * The request builder for the UnifiedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleAssignmentRequest instance
     */
    @Nonnull
    public UnifiedRoleAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleAssignmentRequest instance
     */
    @Nonnull
    public UnifiedRoleAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UnifiedRoleAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AppScope
     *
     * @return the AppScopeRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AppScopeRequestBuilder appScope() {
        return new com.microsoft.graph.requests.AppScopeRequestBuilder(getRequestUrlWithAdditionalSegment("appScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder directoryScope() {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directoryScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder principal() {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("principal"), getClient(), null);
    }

    /**
     * Gets the request builder for UnifiedRoleDefinition
     *
     * @return the UnifiedRoleDefinitionWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UnifiedRoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new com.microsoft.graph.requests.UnifiedRoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
}
