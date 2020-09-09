// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosCertificateProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Certificate Profile Request.
 */
public class IosCertificateProfileRequest extends BaseRequest implements IIosCertificateProfileRequest {
	
    /**
     * The request for the IosCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCertificateProfile.class);
    }

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @return the IosCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosCertificateProfile> callback) {
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
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosCertificateProfile sourceIosCertificateProfile, final ICallback<IosCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceIosCertificateProfile);
    }

    /**
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @return the updated IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCertificateProfile patch(final IosCertificateProfile sourceIosCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosCertificateProfile newIosCertificateProfile, final ICallback<IosCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @return the created IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCertificateProfile post(final IosCertificateProfile newIosCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosCertificateProfile newIosCertificateProfile, final ICallback<IosCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the object to create/update
     * @return the created IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCertificateProfile put(final IosCertificateProfile newIosCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newIosCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosCertificateProfileRequest)this;
     }

}

