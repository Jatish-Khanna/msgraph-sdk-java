// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Request.
 */
public class MessageRequest extends BaseRequest<Message> {
	
    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MessageRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Message> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Message.class);
    }

    /**
     * Gets the Message from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Message> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Message from the service
     *
     * @return the Message from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Message> callback) {
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
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Message sourceMessage, @Nonnull final ICallback<? super Message> callback) {
        send(HttpMethod.PATCH, callback, sourceMessage);
    }

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @return the updated Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message patch(@Nonnull final Message sourceMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Message newMessage, @Nonnull final ICallback<? super Message> callback) {
        send(HttpMethod.POST, callback, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message post(@Nonnull final Message newMessage) throws ClientException {
        return send(HttpMethod.POST, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Message newMessage, @Nonnull final ICallback<? super Message> callback) {
        send(HttpMethod.PUT, callback, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message put(@Nonnull final Message newMessage) throws ClientException {
        return send(HttpMethod.PUT, newMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MessageRequest select(@Nonnull final String value) {
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
     public MessageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

