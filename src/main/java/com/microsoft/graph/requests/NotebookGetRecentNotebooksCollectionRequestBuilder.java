// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RecentNotebook;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.NotebookGetRecentNotebooksCollectionRequestBuilder;
import com.microsoft.graph.requests.NotebookGetRecentNotebooksCollectionRequest;
import com.microsoft.graph.requests.NotebookGetRecentNotebooksCollectionResponse;
import com.microsoft.graph.models.NotebookGetRecentNotebooksParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Get Recent Notebooks Collection Request Builder.
 */
public class NotebookGetRecentNotebooksCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<RecentNotebook, NotebookGetRecentNotebooksCollectionRequestBuilder, NotebookGetRecentNotebooksCollectionResponse, NotebookGetRecentNotebooksCollectionPage, NotebookGetRecentNotebooksCollectionRequest> {

    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookGetRecentNotebooksCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NotebookGetRecentNotebooksCollectionRequestBuilder.class, NotebookGetRecentNotebooksCollectionRequest.class);
    }
    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public NotebookGetRecentNotebooksCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final NotebookGetRecentNotebooksParameterSet parameters) {
        super(requestUrl, client, requestOptions, NotebookGetRecentNotebooksCollectionRequestBuilder.class, NotebookGetRecentNotebooksCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the NotebookGetRecentNotebooksCollectionRequest instance
     */
    @Override
    @Nonnull
    public NotebookGetRecentNotebooksCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final NotebookGetRecentNotebooksCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
