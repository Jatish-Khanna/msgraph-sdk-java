// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Invitation Request.
 */
public class BaseInvitationRequest extends BaseRequest implements IBaseInvitationRequest {

    /**
     * The request for the Invitation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseInvitationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Invitation from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Invitation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Invitation from the service
     * @return The Invitation from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Invitation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Invitation with a source
     * @param sourceInvitation The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Invitation sourceInvitation, final ICallback<Invitation> callback) {
        send(HttpMethod.PATCH, callback, sourceInvitation);
    }

    /**
     * Patches this Invitation with a source
     * @param sourceInvitation The source object with updates
     * @return The updated Invitation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Invitation patch(final Invitation sourceInvitation) throws ClientException {
        return send(HttpMethod.PATCH, sourceInvitation);
    }

    /**
     * Creates a Invitation with a new object
     * @param newInvitation The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Invitation newInvitation, final ICallback<Invitation> callback) {
        send(HttpMethod.POST, callback, newInvitation);
    }

    /**
     * Creates a Invitation with a new object
     * @param newInvitation The new object to create
     * @return The created Invitation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Invitation post(final Invitation newInvitation) throws ClientException {
        return send(HttpMethod.POST, newInvitation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IInvitationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (InvitationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IInvitationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (InvitationRequest)this;
     }

}
