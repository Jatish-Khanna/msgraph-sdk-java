// Template Source: Templates\Java\requests_extensions\BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Entity;
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
 * The class for the Entity Reference Request.
 */
public class EntityReferenceRequest extends BaseReferenceRequest<Entity> {

    /**
     * The request for the Entity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Entity.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EntityReferenceRequest select(@Nonnull final String value) {
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
    public EntityReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the Entity
     *
     * @param srcEntity the Entity reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Entity srcEntity, @Nonnull final ICallback<? super Entity> callback) {
        send(HttpMethod.PUT, callback, srcEntity);
    }

    /**
     * Puts the Entity
     *
     * @param srcEntity the Entity reference to PUT
     * @return the Entity
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Entity put(@Nonnull final Entity srcEntity) throws ClientException {
        return send(HttpMethod.PUT, srcEntity);
    }
}
