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
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App With Reference Request.
 */
public interface ITeamsAppWithReferenceRequest extends IHttpRequest {

    void post(final TeamsApp newTeamsApp, final IJsonBackedObject payload, final ICallback<? super TeamsApp> callback);

    TeamsApp post(final TeamsApp newTeamsApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super TeamsApp> callback);

    TeamsApp get() throws ClientException;

	void delete(final ICallback<? super TeamsApp> callback);

	void delete() throws ClientException;

	void patch(final TeamsApp sourceTeamsApp, final ICallback<? super TeamsApp> callback);

	TeamsApp patch(final TeamsApp sourceTeamsApp) throws ClientException;

    ITeamsAppWithReferenceRequest select(final String value);

    ITeamsAppWithReferenceRequest expand(final String value);

}
