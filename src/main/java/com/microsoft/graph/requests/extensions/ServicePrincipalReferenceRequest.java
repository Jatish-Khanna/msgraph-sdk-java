// Template Source: Templates\Java\requests_extensions\BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Reference Request.
 */
public class ServicePrincipalReferenceRequest extends BaseReferenceRequest<ServicePrincipal> {

    /**
     * The request for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipal.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ServicePrincipalReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ServicePrincipalReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ServicePrincipal
     *
     * @param srcServicePrincipal the ServicePrincipal reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ServicePrincipal srcServicePrincipal, @Nonnull final ICallback<? super ServicePrincipal> callback) {
        send(HttpMethod.PUT, callback, srcServicePrincipal);
    }

    /**
     * Puts the ServicePrincipal
     *
     * @param srcServicePrincipal the ServicePrincipal reference to PUT
     * @return the ServicePrincipal
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ServicePrincipal put(@Nonnull final ServicePrincipal srcServicePrincipal) throws ClientException {
        return send(HttpMethod.PUT, srcServicePrincipal);
    }
}
