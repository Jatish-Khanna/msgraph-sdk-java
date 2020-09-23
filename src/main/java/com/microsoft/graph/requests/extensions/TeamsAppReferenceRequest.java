// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Reference Request.
 */
public class TeamsAppReferenceRequest extends BaseRequest implements ITeamsAppReferenceRequest {

    /**
     * The request for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsApp.class);
    }

    public void delete(final ICallback<? super TeamsApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public TeamsApp delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamsAppReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITeamsAppReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TeamsAppReferenceRequest)this;
    }
    /**
     * Puts the TeamsApp
     *
     * @param srcTeamsApp the TeamsApp reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TeamsApp srcTeamsApp, final ICallback<? super TeamsApp> callback) {
        send(HttpMethod.PUT, callback, srcTeamsApp);
    }

    /**
     * Puts the TeamsApp
     *
     * @param srcTeamsApp the TeamsApp reference to PUT
     * @return the TeamsApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TeamsApp put(TeamsApp srcTeamsApp) throws ClientException {
        return send(HttpMethod.PUT, srcTeamsApp);
    }
}
