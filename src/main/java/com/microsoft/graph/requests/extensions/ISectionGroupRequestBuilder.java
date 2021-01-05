// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Section Group Request Builder.
 */
public interface ISectionGroupRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISectionGroupRequest instance
     */
    ISectionGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISectionGroupRequest instance
     */
    ISectionGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Notebook
     *
     * @return the INotebookRequestBuilder instance
     */
    INotebookRequestBuilder parentNotebook();

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the ISectionGroupRequestBuilder instance
     */
    ISectionGroupRequestBuilder parentSectionGroup();

    ISectionGroupCollectionRequestBuilder sectionGroups();

    ISectionGroupRequestBuilder sectionGroups(final String id);

    IOnenoteSectionCollectionRequestBuilder sections();

    IOnenoteSectionRequestBuilder sections(final String id);

}