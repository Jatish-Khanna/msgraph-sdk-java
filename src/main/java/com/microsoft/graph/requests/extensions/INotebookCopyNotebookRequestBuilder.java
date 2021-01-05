// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.INotebookCopyNotebookRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notebook Copy Notebook Request Builder.
 */
public interface INotebookCopyNotebookRequestBuilder extends IRequestBuilder {

    /**
     * Creates the INotebookCopyNotebookRequest
     *
     * @param requestOptions the options for the request
     * @return the INotebookCopyNotebookRequest instance
     */
    INotebookCopyNotebookRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the INotebookCopyNotebookRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the INotebookCopyNotebookRequest instance
     */
    INotebookCopyNotebookRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
