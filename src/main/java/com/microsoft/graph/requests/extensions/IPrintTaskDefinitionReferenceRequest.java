// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Task Definition Reference Request.
 */
public interface IPrintTaskDefinitionReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super PrintTaskDefinition> callback);

    PrintTaskDefinition delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintTaskDefinitionReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintTaskDefinitionReferenceRequest expand(final String value);

    /**
     * Puts the PrintTaskDefinition
     *
     * @param srcPrintTaskDefinition the PrintTaskDefinition to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PrintTaskDefinition srcPrintTaskDefinition, final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Puts the PrintTaskDefinition
     *
     * @param srcPrintTaskDefinition the PrintTaskDefinition to PUT
     * @return the PrintTaskDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PrintTaskDefinition put(PrintTaskDefinition srcPrintTaskDefinition) throws ClientException;
}