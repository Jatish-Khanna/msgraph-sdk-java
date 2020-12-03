// Template Source: Templates\Java\requests_extensions\BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserWipeManagedAppRegistrationsByDeviceTagBody;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationsByDeviceTagRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Wipe Managed App Registrations By Device Tag Request.
 */
public class UserWipeManagedAppRegistrationsByDeviceTagRequest extends BaseRequest<Void> {
    /** The body for the method */
    protected final UserWipeManagedAppRegistrationsByDeviceTagBody body;

    /**
     * The request for this UserWipeManagedAppRegistrationsByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserWipeManagedAppRegistrationsByDeviceTagRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new UserWipeManagedAppRegistrationsByDeviceTagBody();
    }

    /**
     * Invokes the method and invokes the callback with the result
     * @param callback callback to be invoked after executing the request
     */
    public void post(@Nonnull final ICallback<? super Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     */
    @Nullable
    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
