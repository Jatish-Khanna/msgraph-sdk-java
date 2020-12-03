// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteEntitySchemaObjectModel;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Schema Object Model Request.
 */
public class OnenoteEntitySchemaObjectModelRequest extends BaseRequest<OnenoteEntitySchemaObjectModel> {
	
    /**
     * The request for the OnenoteEntitySchemaObjectModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OnenoteEntitySchemaObjectModelRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends OnenoteEntitySchemaObjectModel> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OnenoteEntitySchemaObjectModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntitySchemaObjectModelRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteEntitySchemaObjectModel.class);
    }

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OnenoteEntitySchemaObjectModel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteEntitySchemaObjectModel from the service
     *
     * @return the OnenoteEntitySchemaObjectModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntitySchemaObjectModel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OnenoteEntitySchemaObjectModel> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     *
     * @param sourceOnenoteEntitySchemaObjectModel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel, @Nonnull final ICallback<? super OnenoteEntitySchemaObjectModel> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteEntitySchemaObjectModel);
    }

    /**
     * Patches this OnenoteEntitySchemaObjectModel with a source
     *
     * @param sourceOnenoteEntitySchemaObjectModel the source object with updates
     * @return the updated OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntitySchemaObjectModel patch(@Nonnull final OnenoteEntitySchemaObjectModel sourceOnenoteEntitySchemaObjectModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntitySchemaObjectModel);
    }

    /**
     * Creates a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel, @Nonnull final ICallback<? super OnenoteEntitySchemaObjectModel> callback) {
        send(HttpMethod.POST, callback, newOnenoteEntitySchemaObjectModel);
    }

    /**
     * Creates a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the new object to create
     * @return the created OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntitySchemaObjectModel post(@Nonnull final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntitySchemaObjectModel);
    }

    /**
     * Creates a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel, @Nonnull final ICallback<? super OnenoteEntitySchemaObjectModel> callback) {
        send(HttpMethod.PUT, callback, newOnenoteEntitySchemaObjectModel);
    }

    /**
     * Creates a OnenoteEntitySchemaObjectModel with a new object
     *
     * @param newOnenoteEntitySchemaObjectModel the object to create/update
     * @return the created OnenoteEntitySchemaObjectModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntitySchemaObjectModel put(@Nonnull final OnenoteEntitySchemaObjectModel newOnenoteEntitySchemaObjectModel) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteEntitySchemaObjectModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenoteEntitySchemaObjectModelRequest select(@Nonnull final String value) {
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
     public OnenoteEntitySchemaObjectModelRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

