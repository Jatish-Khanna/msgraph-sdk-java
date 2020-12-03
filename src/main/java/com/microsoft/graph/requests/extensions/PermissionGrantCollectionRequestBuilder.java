// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequest;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Collection Request Builder.
 */
public class PermissionGrantCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Permission, PermissionGrantCollectionRequestBuilder, PermissionGrantCollectionResponse, PermissionGrantCollectionPage, PermissionGrantCollectionRequest> {

    /**
     * The request builder for this collection of Permission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param roles the roles
     * @param recipients the recipients
     */
    public PermissionGrantCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<String> roles, @Nullable final java.util.List<DriveRecipient> recipients) {
        super(requestUrl, client, requestOptions, PermissionGrantCollectionRequestBuilder.class, PermissionGrantCollectionRequest.class);
  	 if(roles!=null){
			bodyParams.put("roles", roles);
		}
    	 if(recipients!=null){
			bodyParams.put("recipients", recipients);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PermissionGrantCollectionRequest instance
     */
    @Override
    @Nonnull
    public PermissionGrantCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PermissionGrantCollectionRequest request = super.buildRequest(requestOptions);

        if (hasParameter("roles")) {
            request.body.roles = getParameter("roles");
        }
        if (hasParameter("recipients")) {
            request.body.recipients = getParameter("recipients");
        }
  
        return request;
    }
}
