// Template Source: Templates\Java\requests_extensions\BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppCategory;
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
 * The class for the Mobile App Category Reference Request.
 */
public class MobileAppCategoryReferenceRequest extends BaseReferenceRequest<MobileAppCategory> {

    /**
     * The request for the MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategory.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryReferenceRequest select(@Nonnull final String value) {
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
    public MobileAppCategoryReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the MobileAppCategory
     *
     * @param srcMobileAppCategory the MobileAppCategory reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileAppCategory srcMobileAppCategory, @Nonnull final ICallback<? super MobileAppCategory> callback) {
        send(HttpMethod.PUT, callback, srcMobileAppCategory);
    }

    /**
     * Puts the MobileAppCategory
     *
     * @param srcMobileAppCategory the MobileAppCategory reference to PUT
     * @return the MobileAppCategory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public MobileAppCategory put(@Nonnull final MobileAppCategory srcMobileAppCategory) throws ClientException {
        return send(HttpMethod.PUT, srcMobileAppCategory);
    }
}
