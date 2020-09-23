// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Software Update Status Summary With Reference Request.
 */
public interface ISoftwareUpdateStatusSummaryWithReferenceRequest extends IHttpRequest {

    void post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, final IJsonBackedObject payload, final ICallback<? super SoftwareUpdateStatusSummary> callback);

    SoftwareUpdateStatusSummary post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SoftwareUpdateStatusSummary> callback);

    SoftwareUpdateStatusSummary get() throws ClientException;

	void delete(final ICallback<? super SoftwareUpdateStatusSummary> callback);

	void delete() throws ClientException;

	void patch(final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary, final ICallback<? super SoftwareUpdateStatusSummary> callback);

	SoftwareUpdateStatusSummary patch(final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary) throws ClientException;

    ISoftwareUpdateStatusSummaryWithReferenceRequest select(final String value);

    ISoftwareUpdateStatusSummaryWithReferenceRequest expand(final String value);

}
