// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.models.RoleEligibilityScheduleRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Request Request Builder.
 */
public class UnifiedRoleEligibilityScheduleRequestRequestBuilder extends BaseRequestBuilder<UnifiedRoleEligibilityScheduleRequest> {

    /**
     * The request builder for the UnifiedRoleEligibilityScheduleRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleEligibilityScheduleRequestRequest instance
     */
    @Nonnull
    public UnifiedRoleEligibilityScheduleRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleEligibilityScheduleRequestRequest instance
     */
    @Nonnull
    public UnifiedRoleEligibilityScheduleRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AppScope
     *
     * @return the AppScopeWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AppScopeWithReferenceRequestBuilder appScope() {
        return new com.microsoft.graph.requests.AppScopeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("appScope"), getClient(), null);
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

    /**
     * Gets the request builder for UnifiedRoleEligibilitySchedule
     *
     * @return the UnifiedRoleEligibilityScheduleWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleWithReferenceRequestBuilder targetSchedule() {
        return new com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("targetSchedule"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UnifiedRoleEligibilityScheduleRequestCancelRequestBuilder cancel() {
        return new UnifiedRoleEligibilityScheduleRequestCancelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancel"), getClient(), null);
    }
}
